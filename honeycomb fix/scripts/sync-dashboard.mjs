import { copyFile, mkdir, readFile, writeFile } from "node:fs/promises";
import { existsSync } from "node:fs";
import { dirname, resolve } from "node:path";

const root = resolve(import.meta.dirname, "..");
const assets = ["login-theme.js"];
const userscriptMetadataPattern =
  /^\/\/ ==UserScript==[\s\S]*?^\/\/ ==\/UserScript==\s*/m;

const dashboardParts = [
  "modules/photo-cache.js",
  "modules/photo-downloads.js",
  "honeycomb.js",
];
const dashboard = await Promise.all(
  dashboardParts.map((part) => readFile(resolve(root, part), "utf8")),
);
const dashboardTarget = resolve(root, "www", "honeycomb.js");
await mkdir(dirname(dashboardTarget), { recursive: true });
await writeFile(dashboardTarget, `${dashboard.join("\n")}\n`);
console.log(`Synced ${dashboardTarget.slice(root.length + 1)}`);

const dashboardSource = dashboard.at(-1);
const metadata = dashboardSource.match(userscriptMetadataPattern)?.[0]?.trim();
if (!metadata)
  throw new Error(
    "Userscript metadata was not found at the top of honeycomb.js",
  );
const userscriptParts = [
  metadata,
  await readFile(resolve(root, "login-theme.js"), "utf8"),
  ...dashboard.slice(0, -1),
  dashboardSource.replace(userscriptMetadataPattern, ""),
];
const userscriptTarget = resolve(root, "dist", "honeycomb-family.user.js");
await mkdir(dirname(userscriptTarget), { recursive: true });
await writeFile(userscriptTarget, `${userscriptParts.join("\n\n")}\n`);
console.log(`Built ${userscriptTarget.slice(root.length + 1)}`);

for (const asset of assets) {
  const source = resolve(root, asset);
  const target = resolve(root, "www", asset);
  if (!existsSync(source)) throw new Error(`App asset not found: ${source}`);
  await mkdir(dirname(target), { recursive: true });
  await copyFile(source, target);
  console.log(`Synced ${target.slice(root.length + 1)}`);
}
