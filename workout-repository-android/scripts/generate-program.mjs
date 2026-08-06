import fs from "node:fs";
import path from "node:path";

const root = path.resolve(import.meta.dirname, "..");
const sourcePath = path.resolve(root, "../hwpo-network-investigation/hwpo-flagship-60-first-two-weeks.json");
const outputPath = path.join(root, "app/src/main/assets/program.json");
const source = JSON.parse(fs.readFileSync(sourcePath, "utf8"));

const clean = (value = "") => (value || "")
  .replace(/<style>[\s\S]*?<\/style>/gi, "")
  .replace(/<br\s*\/?\s*>/gi, "\n")
  .replace(/<[^>]+>/g, "")
  .replaceAll("&amp;", "&")
  .replaceAll("&quot;", '"')
  .replaceAll("&#39;", "'")
  .replace(/\n{3,}/g, "\n\n")
  .trim();

const contentSections = (schedule) => schedule.sections
  .filter((section) => !["tip", "pre_wod", "post_wod"].includes(section.kind))
  .map((section) => ({ title: (section.title || section.kind || "Workout").trim(), body: clean(section.description) }));

const reduceMetcon = (body) => body
  .replace(/EMOM\s+(2[1-9]|[3-9][0-9])/gi, "EMOM 20")
  .replace(/AMRAP\s+(2[1-9]|[3-9][0-9])/gi, "AMRAP 20")
  .replace(/Time Cap:\s*(2[1-9]|[3-9][0-9])\s*Minutes?/gi, "Time Cap: 20 Minutes")
  .replace(/You may take this emom up to \d+ minutes if you'd like\.?/gi, "Stop at 20 minutes.");

const format = (sections, recommended) => sections
  .filter(({ title }) => !recommended || !/bonus/i.test(title))
  .map(({ title, body }) => {
    let nextBody = body;
    if (recommended && /warm.?up/i.test(title)) {
      nextBody = "Minimum 8:00. Complete 2–3 quality rounds; add an easy round if needed.\n\n" + nextBody;
    }
    if (recommended && /(metcon|emom|cardio|rowing|spin bike)/i.test(title)) nextBody = reduceMetcon(nextBody);
    if (recommended && /accessory/i.test(title)) {
      nextBody = "OPTIONAL — include only if the core session finishes within 60 minutes.\n\n" + nextBody;
    }
    return { title: title.toUpperCase(), body: nextBody };
  });

const questName = (day, sections) => {
  const text = sections.map(({ title, body }) => `${title} ${body}`).join(" ").toLowerCase();
  const sectionTitles = sections.map(({ title }) => title.toLowerCase());
  const dedicatedSpinDay = sectionTitles.some((title) => title.includes("spin bike"));
  const secondWeek = day > 7;
  if (/rest day/.test(text)) return secondWeek
    ? "The Tavern Feast Returns"
    : "Feast Day at the Enchanted Tavern";
  if (/power clean/.test(text) && /deadlift/.test(text)) return secondWeek
    ? "Return to the Iron Engine of Cosmic Doom"
    : "The Iron Engine of Cosmic Doom";
  if (/overhead squat/.test(text)) return secondWeek
    ? "Revenge of the Overhead Throne"
    : "The Overhead Throne of Astral Agony";
  if (/push press/.test(text)) return secondWeek
    ? "Thunder Presses Beyond the Burning Sky"
    : "Thunder Presses of the Burning Sky";
  if (/back squat/.test(text) && sectionTitles.some((title) => title.includes("metcon"))) return secondWeek
    ? "The Flaming Squat Fortress Strikes Back"
    : "Siege of the Flaming Squat Fortress";
  if (/back squat/.test(text) && /row/.test(text)) return secondWeek
    ? "Return to the Squatting Citadel"
    : "The Squatting Citadel of Endless Rows";
  if (dedicatedSpinDay && /max watt/.test(text)) return "The Celestial Steed of Maximum Watts";
  if (dedicatedSpinDay) return "Ride of the Six Thunderous Intervals";

  const adjectives = ["Astral", "Thunderous", "Enchanted", "Infernal", "Galactic"];
  const nouns = ["Barbell", "Citadel", "Gauntlet", "Prophecy", "Battle"];
  return `The ${adjectives[(day * 3) % adjectives.length]} ${nouns[(day * 7) % nouns.length]} of Day ${day}`;
};

const days = source.schedule_details
  .map((entry) => entry.schedule)
  .filter((schedule) => schedule.plan.title === "FLAGSHIP 1.0" && schedule.day_number >= 1 && schedule.day_number <= 14)
  .sort((a, b) => a.day_number - b.day_number)
  .map((schedule) => {
    const sections = contentSections(schedule);
    return {
      day: schedule.day_number,
      title: `Flagship Day ${schedule.day_number}`,
      questTitle: questName(schedule.day_number, sections),
      recommended: format(sections, true),
      original: format(sections, false),
      official60: null,
    };
  });

fs.mkdirSync(path.dirname(outputPath), { recursive: true });
fs.writeFileSync(outputPath, JSON.stringify({ version: 1, days }, null, 2) + "\n");
console.log(`Generated ${days.length} program days at ${outputPath}`);
