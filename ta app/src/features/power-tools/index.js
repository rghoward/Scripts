// ==UserScript==
// @name         GT TA Hiring Modern Power Tools
// @version      14.0
// @description  Workflow-focused TA review and ranking with filters, candidate details, safe movement, saving, and exports.
// @match        https://ta-app.cc.gatech.edu/instructor-admin/section/*
// @grant        none
// ==/UserScript==

(function () {
  "use strict";

  const { escapeHtml } = toolkit.utils;

  function init() {
    if (document.getElementById("taPowerToolsPanel")) return;

    const lists = {
      headTAList: document.getElementById("headTAList"),
      acceptedList: document.getElementById("acceptedList"),
      offeredList: document.getElementById("offeredList"),
      preferredList: document.getElementById("preferredList"),
      pendingList: document.getElementById("pendingList"),
      unrankedList: document.getElementById("unrankedList"),
      declinedList: document.getElementById("declinedList")
    };

    if (!lists.headTAList || !lists.preferredList || !lists.unrankedList || !lists.declinedList) return;

    document.body.classList.add("gt-ta-toolkit-page");

    const appCache = new Map();
    let rankingChangeCount = 0;
    const allocationCapacity = Number.parseInt(
      document.querySelector("#allocation .allocationCapacity")?.textContent,
      10
    ) || 0;

    function allTAs() {
      return [...document.querySelectorAll("li.rankedItem")];
    }

    function headerForList(list) {
      let el = list.previousElementSibling;
      while (el && el.tagName !== "H3") el = el.previousElementSibling;
      return el;
    }

    function nameOf(li) {
      return li.querySelector(".name")?.textContent.trim() || "";
    }

    function gtOf(li) {
      return li.querySelector(".gtaccount")?.textContent.trim() || "";
    }

    function expOf(li) {
      return li.querySelector(".experience")?.textContent.trim() || "";
    }

    function interestOf(li) {
      return li.querySelector(".interest")?.textContent.trim() || "";
    }

    function levelOf(li) {
      return li.querySelector(".level")?.textContent.trim() || "";
    }

    function conflictOf(li) {
      return li.querySelector(".conflict")?.textContent.trim() || "";
    }

    function employmentOf(li) {
      return li.querySelector(".gtEmployment")?.textContent.trim() || "";
    }

    function isNewTA(li) {
      return !!li.querySelector(".newTA");
    }

    function firstNameKey(li) {
      return nameOf(li).toLowerCase();
    }

    function lastNameKey(li) {
      const parts = nameOf(li).toLowerCase().split(/\s+/);
      return `${parts.at(-1) || ""}, ${parts.slice(0, -1).join(" ")}`;
    }

    function experienceKey(li) {
      return ({ TABefore: 0, Passed: 1, Enrolled: 2, AP: 3 }[expOf(li)] ?? 99);
    }

    function interestKey(li) {
      return ({ Very: 0, Somewhat: 1, Least: 2 }[interestOf(li)] ?? 99);
    }

    function conflictKey(li) {
      return conflictOf(li) ? 1 : 0;
    }

    function injectModernCSS() {
      const style = document.createElement("style");
      style.id = "taModernCSS";
      style.textContent = `
        body { background: #f6f8fb !important; }
        main.container { max-width: 1500px !important; }
        .rank-body { width: 100% !important; }

        #taTopLayout {
          display: grid;
          grid-template-columns: minmax(0, 1fr) 320px;
          gap: 16px;
          align-items: start;
          margin: 14px 0 18px;
        }

        #taTopLeft { min-width: 0; }

        #taInstructorBox {
          background: #ffffff;
          border: 1px solid #d9dee8;
          border-radius: 12px;
          padding: 12px;
          box-shadow: 0 2px 8px rgba(0,0,0,.06);
          max-height: 360px;
          overflow: auto;
          position: sticky;
          top: 8px;
        }

        #taInstructorBox summary {
          cursor: pointer;
          font-weight: 700;
          color: #003057;
        }

        #taInstructorBox ul {
          margin: 8px 0 0 18px;
          padding: 0;
          line-height: 1.45;
        }

        #taPowerToolsPanel {
          position: sticky;
          top: 0;
          z-index: 9999;
          background: white;
          border: 2px solid #003057;
          border-radius: 12px;
          box-shadow: 0 4px 18px rgba(0,0,0,.15);
          padding: 12px;
          margin: 0;
          font-family: Arial, sans-serif;
          font-size: 14px;
        }

        #taSearchBox, #bulkTABox {
          border: 1px solid #cbd5e1;
          border-radius: 8px;
        }

        #taPlacementSummary {
          margin-top: 8px;
          background: #ffffff;
          border: 1px solid #d9dee8;
          border-radius: 10px;
          padding: 10px 12px;
          box-shadow: 0 2px 8px rgba(0,0,0,.04);
          font-size: 14px;
        }

        .rank-aside {
          background: #ffffff;
          border: 1px solid #d9dee8;
          border-radius: 10px;
          padding: 14px;
          margin-top: 18px;
          box-shadow: 0 2px 8px rgba(0,0,0,.04);
          clear: both;
        }

        form[name="instructor_management"] > h2 {
          margin-top: 20px;
          padding: 12px 16px;
          background: #003057;
          color: #fff;
          border-radius: 12px;
        }

        form[name="instructor_management"] > h3 {
          background: #ffffff;
          border: 1px solid #d9dee8;
          border-radius: 12px 12px 0 0;
          padding: 12px 14px;
          margin-top: 22px;
          margin-bottom: 0;
          display: flex;
          align-items: center;
          flex-wrap: wrap;
          gap: 6px;
          box-shadow: 0 2px 8px rgba(0,0,0,.04);
        }

        ul.rankedTable {
          background: #ffffff;
          border: 1px solid #d9dee8;
          border-top: none;
          border-radius: 0 0 12px 12px;
          padding: 10px !important;
          margin-bottom: 18px !important;
          min-height: 42px;
          box-shadow: 0 2px 8px rgba(0,0,0,.04);
        }

        li.rankedItem {
          list-style: none !important;
          background: #ffffff !important;
          border: 1px solid #dfe5ef !important;
          border-left: 5px solid #b3a369 !important;
          border-radius: 10px !important;
          margin: 8px 0 !important;
          padding: 10px 12px !important;
          box-shadow: 0 1px 4px rgba(0,0,0,.05);
          transition: box-shadow .12s ease, transform .12s ease;
        }

        li.rankedItem:hover {
          box-shadow: 0 4px 14px rgba(0,0,0,.12);
          transform: translateY(-1px);
        }

        li.rankedItem p.request { margin-bottom: 4px !important; line-height: 1.45; }
        .name { font-weight: 700; font-size: 15px; }

        .gtaccount {
          font-family: ui-monospace, SFMono-Regular, Menlo, Consolas, monospace;
          font-size: 13px;
        }

        .taStudentDetails {
          display: flex;
          flex-wrap: wrap;
          gap: 4px 14px;
          margin: 5px 0 3px;
          color: #4b5563;
          font-size: 12px;
        }

        .taStudentDetails strong { color: #374151; }
        .taStudentDetails a { color: #075a9c; }
        .taStudentDetailsLoading { color: #6b7280; font-style: italic; }

        .newTA, .experience, .interest, .level, .gtEmployment, .conflict {
          display: inline-block;
          padding: 1px 6px;
          border-radius: 999px;
          font-size: 11px;
          font-weight: 600;
          margin: 1px 2px;
        }

        .newTA { background: #eef2ff; color: #3730a3; }
        .experience { background: #ecfdf5; color: #047857; }
        .interest { background: #fff7ed; color: #c2410c; }
        .level { background: #f3f4f6; color: #374151; }
        .gtEmployment { background: #e0f2fe; color: #0369a1; }
        .conflict { background: #fee2e2 !important; color: #991b1b !important; border: 1px solid #fecaca; }

        .taSectionControls button,
        #taPowerToolsPanel button {
          border: 1px solid #cbd5e1;
          border-radius: 6px;
          background: #f8fafc;
          color: #111827;
          cursor: pointer;
        }

        .taSectionControls button:hover,
        #taPowerToolsPanel button:hover { background: #e5e7eb; }

        @media (max-width: 1000px) {
          #taTopLayout { grid-template-columns: 1fr; }
          #taInstructorBox { position: static; max-height: 260px; }
        }
      `;
      document.head.appendChild(style);
    }

    function makeTopLayout() {
      const main = document.querySelector("main.container");
      const h1 = main?.querySelector("h1");
      if (!main || !h1 || document.getElementById("taTopLayout")) return null;

      const layout = document.createElement("div");
      layout.id = "taTopLayout";

      const left = document.createElement("div");
      left.id = "taTopLeft";

      const right = document.createElement("div");
      right.id = "taTopRight";

      layout.appendChild(left);
      layout.appendChild(right);

      h1.insertAdjacentElement("afterend", layout);

      const allocation = document.getElementById("allocation");
      const sectionNote = document.getElementById("sectionNote");

      if (allocation) left.appendChild(allocation);
      if (sectionNote) left.appendChild(sectionNote);

      return { layout, left, right };
    }

    function injectWorkflowCSS() {
      const style = document.createElement("style");
      style.id = "taWorkflowCSS";
      style.textContent = `
        main.container { width: min(1440px, calc(100% - 32px)) !important; }
        #taTopLayout { display: block !important; margin: 14px 0 22px; }
        #taTopRight:empty { display: none; }

        #taPlacementSummary {
          display: grid;
          grid-template-columns: repeat(auto-fit, minmax(145px, 1fr));
          gap: 10px;
          margin: 0 0 14px;
          padding: 0;
          border: 0;
          background: transparent;
          box-shadow: none;
        }
        :is(#headTAList, #acceptedList, #offeredList, #preferredList, #pendingList, #declinedList)
        li.rankedItem { border-left-color: #b3a369 !important; opacity: 1; }
        #taPlacementSummary > div {
          display: flex;
          flex-direction: column;
          gap: 3px;
          padding: 14px 16px;
          border: 1px solid #d8dfe5;
          border-radius: 10px;
          background: #fff;
          box-shadow: 0 2px 7px rgba(20, 35, 45, .05);
        }
        #taPlacementSummary span { color: #667681; font-size: 12px; font-weight: 700; }
        #taPlacementSummary strong { color: #20313e; font-size: 25px; line-height: 1.1; }
        #taPlacementSummary strong small { color: #71808a; font-size: 12px; font-weight: 700; }
        #taPlacementSummary .taAllocationLimit { background: #f7fafc; }
        #taPlacementSummary .taHeadCount { border-color: #cabd8c; background: #fffdf4; }
        #taPlacementSummary .taHeadRule {
          display: block;
          grid-column: 1 / -1;
          padding: 10px 13px;
          border-color: #d8c98f;
          background: #fffbea;
          color: #5d522b;
          font-size: 12px;
          line-height: 1.5;
        }
        #taPlacementSummary .taHeadRule strong {
          display: inline;
          color: #4b401b;
          font-size: inherit;
        }
        #taPlacementSummary .taLimitViolation {
          border-color: #e1a39e;
          background: #fff2f1;
        }
        #taPlacementSummary .taLimitViolation strong { color: #a12820; }
        #taPlacementSummary.taAllocationOver .taAllocationBalance {
          border-color: #e5aaa5;
          background: #fff3f2;
        }
        #taPlacementSummary.taAllocationOver .taAllocationBalance strong { color: #a32820; }
        #taPlacementSummary .taAllocationBalance strong { font-size: 18px; }

        #taPowerToolsPanel {
          position: sticky;
          top: 0;
          z-index: 500;
          padding: 16px;
          border: 1px solid #cbd5dd !important;
          border-top: 4px solid #003057 !important;
          font-family: inherit;
          max-height: calc(100vh - 10px);
          overflow: auto;
        }
        .taToolbarHeading { display: flex; align-items: center; justify-content: space-between; gap: 16px; }
        .taToolbarHeading strong { display: block; color: #003057; font-size: 17px; }
        .taToolbarHeading small { display: block; margin-top: 2px; color: #6b7780; }
        .taToolbarActions { display: flex; align-items: center; gap: 9px; }
        .taGlobalFilters {
          display: grid;
          grid-template-columns: minmax(210px, 1.5fr) repeat(5, minmax(135px, 1fr)) auto;
          align-items: end;
          gap: 10px;
          margin-top: 13px;
        }
        .taGlobalFilters label { display: flex; min-width: 0; flex-direction: column; gap: 5px; margin: 0; }
        .taGlobalFilters label > span { color: #596773; font-size: 11px; font-weight: 800; }
        .taGlobalFilters :is(input, select), #bulkTABox, .taMoveSelect {
          box-sizing: border-box;
          border: 1px solid #aab6bf;
          border-radius: 6px;
          background: #fff;
          color: #26343e;
        }
        .taGlobalFilters :is(input, select) { width: 100%; height: 40px; margin: 0; padding: 7px 9px; }
        #taPowerToolsPanel button, .taSectionControls button {
          min-height: 38px;
          padding: 6px 11px;
          border: 1px solid #aab6bf;
          border-radius: 6px;
          background: #fff;
          color: #25343e;
          font-weight: 700;
        }
        #taApplySort { background: #003057 !important; color: #fff !important; }
        #taFilterSummary { margin-top: 8px; color: #62717b; font-size: 12px; }
        #taSearchResults {
          display: grid;
          grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
          gap: 8px;
          max-height: 250px;
          margin-top: 10px;
          overflow: auto;
        }
        #taSearchResults:empty { display: none; }
        .taSearchResult {
          display: flex;
          align-items: center;
          justify-content: space-between;
          gap: 12px;
          padding: 10px 11px;
          border: 1px solid #d9e0e5;
          border-radius: 8px;
          background: #f8fafb;
        }
        .taSearchResult strong, .taSearchResult small { display: block; }
        .taSearchGT { margin-left: 7px; color: #5c6972; font-family: ui-monospace, monospace; font-size: 12px; }
        .taSearchResult small { margin-top: 3px; color: #64717b; }
        .taSearchMove {
          display: flex;
          flex: 0 0 auto;
          align-items: center;
          gap: 6px;
          color: #5d6972;
          font-size: 11px;
          font-weight: 800;
        }
        .taSearchMove .taMoveSelect { min-width: 135px; }
        .taSearchConflict { color: #a12820; font-weight: 800; }
        .taSearchEmpty { padding: 12px; border-radius: 7px; background: #f5f7f8; color: #66737c; }
        .taSearchTarget { outline: 4px solid rgba(179, 163, 105, .55) !important; outline-offset: 2px; }

        #taAdvancedTools { margin-top: 12px; border-top: 1px solid #e0e5e9; padding-top: 10px; }
        #taAdvancedTools > summary { width: fit-content; color: #3f5260; cursor: pointer; font-weight: 700; }
        .taAdvancedGrid { display: grid; grid-template-columns: 1fr 1fr; gap: 18px; margin-top: 12px; }
        .taAdvancedGrid section { display: flex; align-items: flex-start; flex-direction: column; gap: 8px; }
        #bulkTABox { width: 100%; min-height: 86px; padding: 9px; resize: vertical; }
        #taInstructorBox.taAdvancedInstructors {
          position: static;
          grid-column: 1 / -1;
          max-height: 240px;
          margin: 0;
          box-shadow: none;
        }

        form[name="instructor_management"] > h2 {
          margin: 26px 0 10px;
          padding: 0;
          background: transparent;
          color: #25343e;
          font-size: 22px;
        }
        form[name="instructor_management"] > h3 {
          display: grid;
          grid-template-columns: auto auto 1fr auto;
          align-items: center;
          gap: 9px;
          margin-top: 16px;
          padding: 13px 15px;
          border-radius: 10px 10px 0 0;
          box-shadow: none;
        }
        .taSectionCount { color: #52616c !important; }
        .taSectionCount { display: inline-flex; flex-wrap: wrap; gap: 5px; }
        .taSectionCount > span {
          padding: 3px 7px;
          border-radius: 999px;
          background: #edf1f3;
          color: #52616c;
          font-size: 11px;
          font-weight: 500;
          white-space: nowrap;
        }
        .taSectionCount strong { color: #26343e; }
        .taSectionDescription { color: #6d7880; font-size: 12px; font-weight: 400; }
        .taSectionControls { justify-self: end; }
        .taSectionControls button { min-height: 32px; padding: 4px 9px; font-size: 11px; }
        .taCollapsibleHeading { cursor: pointer; }
        .taCollapsibleHeading:hover { background: #f7f9fa !important; }
        .taCollapsibleHeading:focus-visible {
          outline: 3px solid rgba(0, 48, 87, .25);
          outline-offset: 2px;
        }
        ul.rankedTable {
          display: grid !important;
          grid-template-columns: repeat(auto-fill, minmax(330px, 1fr));
          gap: 10px;
          margin-bottom: 14px !important;
          box-shadow: none;
        }
        ul.rankedTable[style*="display: none"] { display: none !important; }
        li.rankedItem {
          display: flex !important;
          min-width: 0;
          min-height: 150px;
          flex-direction: column;
          align-items: stretch;
          gap: 7px;
          margin: 0 !important;
          border-left-color: #b3a369 !important;
          box-shadow: none;
        }
        li.rankedItem:hover { transform: none; box-shadow: 0 3px 10px rgba(20,35,45,.09); }
        li.rankedItem[hidden] { display: none !important; }
        li.rankedItem p.request { margin: 0 !important; }
        .taMoveControl {
          display: flex;
          align-items: center;
          justify-content: flex-end;
          gap: 7px;
          margin-top: auto;
          padding-top: 7px;
          border-top: 1px solid #e5e9ec;
          color: #5d6972;
          font-size: 11px;
          font-weight: 700;
        }
        .taMoveSelect { min-width: 145px; height: 34px; padding: 4px 26px 4px 8px; }
        .taStudentDetails {
          display: grid;
          grid-template-columns: repeat(2, minmax(0, 1fr));
          gap: 3px 10px;
          margin: 1px 0;
        }
        .taStudentDetails span { min-width: 0; overflow-wrap: anywhere; }
        ul.rankedTable .ui-sortable-placeholder {
          min-height: 150px;
          border: 2px dashed #9d8b4c !important;
          border-radius: 9px;
          background: #fffbea !important;
          visibility: visible !important;
        }
        .conflict { font-weight: 800; }
        .taNativeSave { display: none !important; }

        #taSaveBar {
          position: fixed;
          right: 20px;
          bottom: 20px;
          z-index: 10000;
          display: flex;
          align-items: center;
          gap: 10px;
          padding: 12px 13px 12px 16px;
          border: 1px solid #c9d0d5;
          border-radius: 10px;
          background: #fff;
          color: #53616b;
          box-shadow: 0 12px 34px rgba(25, 35, 42, .22);
        }
        #taSaveBar strong, #taSaveBar small { display: block; }
        #taSaveBar strong { font-size: 11px; }
        #taSaveBar small { margin-top: 2px; color: #75818a; font-size: 10px; }
        #taSaveBar.taHasChanges { border-color: #c8a948; background: #fffbea; }
        #taSaveBar.taHasChanges strong { color: #745900; }
        #taRestoreRankings {
          min-height: 38px;
          padding: 6px 11px;
          border: 1px solid #aab6bf;
          border-radius: 7px;
          background: #fff;
          color: #344650;
          font-size: 11px;
          font-weight: 800;
        }
        #taRestoreRankings[hidden] { display: none; }
        #taSaveRankings {
          min-height: 38px;
          padding: 6px 13px;
          border: 1px solid #003057;
          border-radius: 7px;
          background: #003057;
          color: #fff;
          font-weight: 800;
        }
        #taSaveRankings:disabled { border-color: #b8c0c6; background: #e5e9ec; color: #7b858c; cursor: default; }

        #taApplicationDialog {
          width: min(680px, calc(100% - 32px));
          max-height: 82vh;
          padding: 0;
          overflow: auto;
          border: 1px solid #b7c2ca;
          border-radius: 12px;
          color: #26343e;
          box-shadow: 0 24px 70px rgba(0,0,0,.32);
        }
        #taApplicationDialog::backdrop { background: rgba(13, 25, 34, .58); }
        .taDialogHeading {
          position: sticky;
          top: 0;
          display: flex;
          align-items: center;
          justify-content: space-between;
          padding: 13px 16px;
          border-bottom: 1px solid #dce2e6;
          background: #fff;
        }
        .taDialogHeading button { border: 0; background: transparent; font-size: 25px; cursor: pointer; }
        #taApplicationContent { padding: 18px; line-height: 1.5; }
        .taFullApplicationLink {
          display: inline-flex;
          margin-top: 16px;
          padding: 8px 11px;
          border-radius: 6px;
          background: #eaf2f7;
          color: #003057 !important;
          font-weight: 800;
          text-decoration: none !important;
        }

        @media (max-width: 1050px) {
          .taGlobalFilters { grid-template-columns: repeat(3, 1fr); }
          #taPlacementSummary { grid-template-columns: repeat(2, 1fr); }
        }
        @media (max-width: 700px) {
          .taGlobalFilters, .taAdvancedGrid, #taPlacementSummary { grid-template-columns: 1fr; }
          ul.rankedTable { grid-template-columns: 1fr; }
          .taStudentDetails { grid-template-columns: 1fr; }
          .taToolbarHeading { align-items: stretch; flex-direction: column; }
          .taToolbarActions { justify-content: space-between; }
          #taSaveBar {
            right: 10px;
            bottom: 10px;
            left: 10px;
            flex-wrap: wrap;
            justify-content: flex-end;
          }
          #taSaveBar > div { margin-right: auto; }
        }
      `;
      document.head.appendChild(style);
    }

    function moveInstructorsToRight(topLayout) {
      const instructors = document.getElementById("instructors");
      if (!instructors || !topLayout?.right) return;

      const counts = new Map();

      [...instructors.querySelectorAll(".instructor")].forEach(span => {
        const name = span.textContent.trim().replace(/\.$/, "");
        if (!name) return;
        counts.set(name, (counts.get(name) || 0) + 1);
      });

      const box = document.createElement("details");
      box.id = "taInstructorBox";
      box.open = false;

      const listItems = [...counts.entries()]
        .sort((a, b) => a[0].localeCompare(b[0]))
        .map(([name, count]) => `<li>${escapeHtml(name)} <span style="color:#666;">(${count})</span></li>`)
        .join("");

      box.innerHTML = `
        <summary>Instructors (${counts.size} unique)</summary>
        <ul>${listItems}</ul>
      `;

      instructors.remove();
      topLayout.right.appendChild(box);
    }

    function countIn(listId) {
      const list = document.getElementById(listId);
      if (!list) return { total: 0, newCount: 0 };
      const items = [...list.querySelectorAll("li.rankedItem")];
      return {
        total: items.length,
        newCount: items.filter(isNewTA).length,
        returningCount: items.filter(item => !isNewTA(item)).length
      };
    }

    function updateAllocationSummary() {
      const allocation = document.getElementById("allocation");
      if (!allocation) return;

      let summary = document.getElementById("taPlacementSummary");
      if (!summary) {
        summary = document.createElement("div");
        summary.id = "taPlacementSummary";
        allocation.appendChild(summary);
      }

      allocation.querySelector(":scope > p")?.remove();
      const capacity = allocationCapacity;
      const head = countIn("headTAList");
      const accepted = countIn("acceptedList");
      const offered = countIn("offeredList");
      const preferred = countIn("preferredList");
      const placedNew =
        accepted.newCount + offered.newCount + preferred.newCount;
      // Head TAs consume allocation slots, but remain outside the new/returning ratio.
      const placedTotal = head.total + accepted.total + offered.total + preferred.total;
      const placedReturning =
        accepted.returningCount + offered.returningCount + preferred.returningCount;
      const remaining = capacity - placedTotal;
      const maximumReturning = Math.ceil(capacity * 20 / 30);
      const minimumNew = Math.max(0, capacity - maximumReturning);
      const returningOver = Math.max(0, placedReturning - maximumReturning);
      const newStillNeeded = Math.max(0, minimumNew - placedNew);

      summary.className = remaining < 0 ? "taAllocationOver" : "";
      summary.innerHTML = `
        <div><span>Total allocation</span><strong>${capacity}</strong></div>
        <div class="taHeadCount">
          <span>Your Head TA selections</span>
          <strong>${head.total}</strong>
          <small>Ranked right now — this is not your allowed limit</small>
        </div>
        <div class="taAllocationLimit ${returningOver ? "taLimitViolation" : ""}">
          <span>Returning allowed · maximum</span>
          <strong>${maximumReturning}</strong>
        </div>
        <div class="taAllocationLimit">
          <span>New TAs required · minimum</span>
          <strong>${minimumNew}</strong>
        </div>
        <div><span>Total placed (including Head TAs)</span><strong>${placedTotal}</strong></div>
        <div class="${returningOver ? "taLimitViolation" : ""}">
          <span>Returning placed</span>
          <strong>${placedReturning} <small>of ${maximumReturning} max</small></strong>
        </div>
        <div>
          <span>New placed</span>
          <strong>${placedNew} <small>${newStillNeeded ? `${newStillNeeded} still needed` : "minimum met"}</small></strong>
        </div>
        <div class="taAllocationBalance">
          <span>${remaining < 0 ? "Over allocation" : "Spots remaining"}</span>
          <strong>${Math.abs(remaining)}</strong>
        </div>
        <div class="taHeadRule">
          <strong>Head TA reminder:</strong>
          Head TAs count toward this course's total allocation, but do not count
          against the new/returning ratio. Their allowance depends on the number
          of instructors for this course and cannot be calculated from this page.
          Do not rank more Head TAs than the program permits; candidates above
          the allowed number will not be hired.
        </div>
      `;
    }

    function refreshInlineButtons() {
      allTAs().forEach(li => {
        const select = li.querySelector(".taMoveSelect");
        if (select) select.value = li.parentElement.id;
      });
    }

    function updateSectionCounts() {
      document.querySelectorAll("ul.rankedTable").forEach(list => {
        const h3 = headerForList(list);
        if (!h3) return;

        let countSpan = h3.querySelector(".taSectionCount");
        if (!countSpan) {
          countSpan = document.createElement("span");
          countSpan.className = "taSectionCount";
          countSpan.style = "color:#6b7280;font-size:13px;font-weight:500;";
          h3.insertBefore(
            countSpan,
            h3.querySelector(".taSectionDescription, .taSectionControls")
          );
        }

        const count = countIn(list.id);
        countSpan.innerHTML = `
          <span><strong>${count.total}</strong> total</span>
          <span><strong>${count.returningCount}</strong> returning</span>
          <span><strong>${count.newCount}</strong> new</span>
        `;
      });
    }

    function markRankingDirty() {
      rankingChangeCount = 1;
      const bar = document.getElementById("taSaveBar");
      const count = document.getElementById("taChangeCount");
      const saveButton = document.getElementById("taSaveRankings");
      if (bar) bar.classList.add("taHasChanges");
      if (count) count.textContent = "Unsaved ranking changes";
      if (saveButton) saveButton.disabled = false;
    }

    function moveTo(li, list) {
      list.appendChild(li);
      markRankingDirty();
      refreshInlineButtons();
      updateSectionCounts();
      updateAllocationSummary();
    }

    function createMoveSelect(li, afterMove = () => {}) {
      const select = document.createElement("select");
      select.className = "taMoveSelect";
      [
        ["headTAList", "Head TA", false],
        ["acceptedList", "Accepted (outcome)", true],
        ["offeredList", "Offered (outcome)", true],
        ["preferredList", "Preferred", false],
        ["pendingList", "Pending / backup", false],
        ["unrankedList", "Unranked", false],
        ["declinedList", "Declined", false]
      ].forEach(([value, text, disabled]) => {
        if (!lists[value]) return;
        const option = document.createElement("option");
        option.value = value;
        option.textContent = text;
        option.disabled = disabled;
        select.appendChild(option);
      });
      select.value = li.parentElement.id;
      select.addEventListener("change", event => {
        const target = lists[event.target.value];
        if (target) {
          moveTo(li, target);
          afterMove();
        }
      });
      return select;
    }

    function addInlineButtons() {
      allTAs().forEach(li => {
        if (li.querySelector(".taMoveSelect")) return;

        const label = document.createElement("label");
        label.className = "taMoveControl";
        label.append("Move to ");

        label.appendChild(createMoveSelect(li));
        li.appendChild(label);
      });

      refreshInlineButtons();
    }

    function sortList(list, keyFn) {
      [...list.querySelectorAll("li.rankedItem")]
        .sort((a, b) => {
          const ka = keyFn(a);
          const kb = keyFn(b);

          if (typeof ka === "number" && typeof kb === "number") {
            return ka - kb || lastNameKey(a).localeCompare(lastNameKey(b));
          }

          return String(ka).localeCompare(String(kb));
        })
        .forEach(li => list.appendChild(li));

      markRankingDirty();
      refreshInlineButtons();
      updateSectionCounts();
      updateAllocationSummary();
    }

    function smartSort(list) {
      [...list.querySelectorAll("li.rankedItem")]
        .sort((a, b) =>
          conflictKey(a) - conflictKey(b) ||
          experienceKey(a) - experienceKey(b) ||
          interestKey(a) - interestKey(b) ||
          lastNameKey(a).localeCompare(lastNameKey(b))
        )
        .forEach(li => list.appendChild(li));

      markRankingDirty();
      refreshInlineButtons();
      updateSectionCounts();
      updateAllocationSummary();
    }

    function toggleSection(list, btn) {
      const hidden = list.style.display === "none";
      list.style.display = hidden ? "" : "none";
      if (btn) btn.textContent = hidden ? "Collapse" : "Expand";
      headerForList(list)?.setAttribute("aria-expanded", String(hidden));
      localStorage.setItem(`taSectionCollapsed_${list.id}`, String(!hidden));
    }

    function addSectionButtons() {
      const descriptions = {
        headTAList: "Instructor-ranked leadership candidates",
        acceptedList: "Hiring outcome — accepted offers",
        offeredList: "Hiring outcome — offers awaiting response",
        preferredList: "Instructor-ranked candidates",
        pendingList: "Backup candidates available if needed",
        unrankedList: "Applicants awaiting review",
        declinedList: "Not being considered for this course"
      };

      document.querySelectorAll("ul.rankedTable").forEach(list => {
        if (list.dataset.taToolsAdded) return;
        list.dataset.taToolsAdded = "true";

        const h3 = headerForList(list);
        if (!h3) return;

        const controls = document.createElement("span");
        controls.className = "taSectionControls";

        function make(label, fn) {
          const b = document.createElement("button");
          b.type = "button";
          b.textContent = label;
          b.onclick = fn;
          return b;
        }

        const collapseBtn = make("Collapse", () => toggleSection(list, collapseBtn));

        controls.appendChild(collapseBtn);

        const description = document.createElement("small");
        description.className = "taSectionDescription";
        description.textContent = descriptions[list.id] || "";
        h3.appendChild(description);

        h3.appendChild(controls);
        h3.classList.add("taCollapsibleHeading");
        h3.tabIndex = 0;
        h3.setAttribute("role", "button");
        h3.setAttribute("aria-controls", list.id);
        h3.setAttribute("aria-expanded", "true");
        h3.addEventListener("click", event => {
          if (event.target.closest("button, a, input, select")) return;
          toggleSection(list, collapseBtn);
        });
        h3.addEventListener("keydown", event => {
          if (event.key !== "Enter" && event.key !== " ") return;
          event.preventDefault();
          toggleSection(list, collapseBtn);
        });

        if (localStorage.getItem(`taSectionCollapsed_${list.id}`) === "true") {
          list.style.display = "none";
          collapseBtn.textContent = "Expand";
          h3.setAttribute("aria-expanded", "false");
        }
      });

      updateSectionCounts();
    }

    function compactApplicationInfo(doc) {
      const title = doc.querySelector("main h1")?.textContent.trim() || "Application";

      const rows = [...doc.querySelectorAll("table tr")].map(tr => [
        tr.querySelector("th")?.textContent.trim(),
        tr.querySelector("td")
      ]);

      const get = label => rows.find(([th]) => th === label)?.[1];

      const candidate = get("Candidate Info")?.innerText.trim().replace(/\s+/g, " ") || "";

      const courses = [...(get("Courses Applied For")?.querySelectorAll("li") || [])]
        .map(li => escapeHtml(li.innerText.trim().replace(/\s+/g, " ")))
        .join("<br>");

      const questions = [...(get("Questions")?.querySelectorAll("p") || [])]
        .map(p => {
          const text = p.innerText.trim().replace(/\s+/g, " ");
          return escapeHtml(text.length > 400 ? text.slice(0, 400) + "..." : text);
        })
        .slice(0, 5)
        .join("<br><br>");

      const candidateText = get("Candidate Info")?.innerText.trim().replace(/\s+/g, " ") || "";
      const email = candidateText.match(/[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}/i)?.[0] || "";
      const labeledGtidCell = rows.find(([label]) =>
        /(?:gt\s*-?\s*id|student\s+id|georgia\s+tech\s+id)/i.test(label || "")
      )?.[1];
      const explicitGtid =
        doc.querySelector('[data-gtid]')?.dataset.gtid ||
        doc.querySelector('input[name*="gtid" i], input[id*="gtid" i]')?.value ||
        labeledGtidCell?.textContent ||
        "";
      const documentText = doc.body?.textContent?.replace(/\s+/g, " ") || "";
      const gtidPatterns = [
        /(?:GT\s*-?\s*ID|Georgia\s+Tech\s+ID|Student\s+ID)\s*[:#-]?\s*(\d{9})\b/i,
        /\b(9\d{8})\b/
      ];
      const gtidSources = [explicitGtid, candidateText, documentText];
      const gtid = explicitGtid.match(/\b(\d{9})\b/)?.[1] || gtidSources.reduce((found, source) => {
        if (found) return found;
        return gtidPatterns.reduce(
          (match, pattern) => match || source.match(pattern)?.[1] || "",
          ""
        );
      }, "");

      return { email, gtid, html: `
        <strong>${escapeHtml(title)}</strong><br>
        <em>${escapeHtml(candidate)}</em>
        <hr>
        <strong>Courses</strong><br>${courses || "None found"}
        <hr>
        <strong>Questions</strong><br>${questions || "None found"}
      ` };
    }

    async function applicationInfo(url) {
      if (!appCache.has(url)) {
        appCache.set(url, fetch(url, { credentials: "same-origin" })
          .then(response => {
            if (!response.ok) throw new Error(`Application request failed (${response.status})`);
            return response.text();
          })
          .then(html => compactApplicationInfo(new DOMParser().parseFromString(html, "text/html")))
          .catch(error => {
            appCache.delete(url);
            throw error;
          }));
      }
      return appCache.get(url);
    }

    function visibleStudentDetails(info) {
      const parts = [];
      if (info.gtid) parts.push(`<span><strong>GTID:</strong> ${escapeHtml(info.gtid)}</span>`);
      if (info.email) parts.push(`<span><strong>Email:</strong> <a href="mailto:${encodeURIComponent(info.email)}">${escapeHtml(info.email)}</a></span>`);
      return parts.join("") || '<span>GTID and email unavailable</span>';
    }

    async function addVisibleStudentDetails() {
      const links = [...document.querySelectorAll("li.rankedItem a[href*='/instructor-admin/application/']")];

      async function loadDetails(a) {
        const li = a.closest("li.rankedItem");
        if (!li || li.dataset.taDetailsLoading || li.querySelector(".taStudentDetails")) return;
        li.dataset.taDetailsLoading = "true";

        const details = document.createElement("div");
        details.className = "taStudentDetails taStudentDetailsLoading";
        details.textContent = "Loading GTID and email…";
        (a.closest("p") || a).insertAdjacentElement("afterend", details);

        try {
          const info = await applicationInfo(a.href);
          details.classList.remove("taStudentDetailsLoading");
          details.innerHTML = visibleStudentDetails(info);
        } catch {
          details.textContent = "GTID and email unavailable";
        }
      }

      if (!("IntersectionObserver" in window)) {
        links.slice(0, 20).forEach(loadDetails);
        return;
      }

      const observer = new IntersectionObserver(entries => {
        entries.forEach(entry => {
          if (!entry.isIntersecting) return;
          observer.unobserve(entry.target);
          const link = entry.target.querySelector(
            "a[href*='/instructor-admin/application/']"
          );
          if (link) loadDetails(link);
        });
      }, { rootMargin: "500px 0px" });

      links.forEach(link => {
        const card = link.closest("li.rankedItem");
        if (card) {
          observer.observe(card);
          card.addEventListener("mouseenter", () => loadDetails(link), { once: true });
          card.addEventListener("focusin", () => loadDetails(link), { once: true });
        }
      });
    }

    function addApplicationDialog() {
      const dialog = document.createElement("dialog");
      dialog.id = "taApplicationDialog";
      dialog.innerHTML = `
        <div class="taDialogHeading">
          <strong>Candidate application</strong>
          <button type="button" aria-label="Close application details">×</button>
        </div>
        <div id="taApplicationContent"></div>
      `;
      document.body.appendChild(dialog);
      dialog.querySelector("button").onclick = () => dialog.close();
      dialog.addEventListener("click", event => {
        if (event.target === dialog) dialog.close();
      });

      document.querySelectorAll("li.rankedItem a[href*='/instructor-admin/application/']").forEach(a => {
        if (a.dataset.taHoverAdded) return;
        a.dataset.taHoverAdded = "true";
        a.title = "Open candidate application details";

        a.addEventListener("click", async event => {
          event.preventDefault();
          const content = document.getElementById("taApplicationContent");
          content.textContent = "Loading application…";
          dialog.showModal();

          try {
            content.innerHTML = (await applicationInfo(a.href)).html;
            const fullLink = document.createElement("a");
            fullLink.className = "taFullApplicationLink";
            fullLink.href = a.href;
            fullLink.textContent = "Open full application in a new tab →";
            fullLink.target = "_blank";
            fullLink.rel = "noopener";
            content.appendChild(fullLink);
          } catch {
            content.textContent = "Could not load application details.";
          }
        });
      });
    }

    function addSaveBar() {
      const form = document.querySelector('form[name="instructor_management"]');
      const nativeSaves = [...(form?.querySelectorAll(
        'button[type="submit"], input[type="submit"]'
      ) || [])].filter(control =>
        /save\s+rankings/i.test(control.textContent || control.value || "")
      );
      const nativeSave = nativeSaves[0];
      if (!form || !nativeSave || document.getElementById("taSaveBar")) return;
      const backupKey = `gt-ta-ranking-backup:${location.pathname}`;

      function captureSnapshot() {
        return {
          savedAt: new Date().toISOString(),
          lists: Object.fromEntries(
            Object.values(lists).filter(Boolean).map(list => [
              list.id,
              [...list.querySelectorAll(":scope > li.rankedItem")]
                .map(item => item.id)
                .filter(Boolean)
            ])
          )
        };
      }

      function readBackup() {
        try {
          const backup = JSON.parse(localStorage.getItem(backupKey) || "null");
          return backup?.lists ? backup : null;
        } catch {
          return null;
        }
      }

      const baselineSnapshot = captureSnapshot();

      nativeSaves.forEach(control => {
        control.classList.add("taNativeSave");
        control.setAttribute("aria-hidden", "true");
        control.tabIndex = -1;
      });

      const bar = document.createElement("div");
      bar.id = "taSaveBar";
      bar.innerHTML = `
        <div>
          <strong id="taChangeCount">Rankings saved</strong>
          <small>Save after moving or sorting candidates.</small>
        </div>
        <button id="taRestoreRankings" type="button" hidden>
          Restore previous save
        </button>
        <button id="taSaveRankings" type="button" disabled>Save rankings</button>
      `;
      document.body.appendChild(bar);

      const restoreButton = document.getElementById("taRestoreRankings");
      const existingBackup = readBackup();
      if (existingBackup) {
        restoreButton.hidden = false;
        restoreButton.title = `Previous save from ${new Date(existingBackup.savedAt).toLocaleString()}`;
      }

      document.getElementById("taSaveRankings").onclick = () => {
        localStorage.setItem(backupKey, JSON.stringify(baselineSnapshot));
        nativeSave.click();
      };

      restoreButton.onclick = () => {
        const backup = readBackup();
        if (!backup) return;
        if (!confirm(
          "Restore the arrangement from before the previous save? " +
          "Click Save Rankings afterward to commit the rollback."
        )) return;

        Object.entries(backup.lists).forEach(([listId, itemIds]) => {
          const list = document.getElementById(listId);
          if (!list) return;
          itemIds.forEach(itemId => {
            const item = document.getElementById(itemId);
            if (item?.classList.contains("rankedItem")) list.appendChild(item);
          });
        });

        refreshInlineButtons();
        updateSectionCounts();
        updateAllocationSummary();
        markRankingDirty();
        document.getElementById("taSearchBox")?.dispatchEvent(
          new Event("input", { bubbles: true })
        );
        restoreButton.hidden = true;
      };
      form.addEventListener("submit", () => {
        rankingChangeCount = 0;
        bar.classList.remove("taHasChanges");
      });

      const observer = new MutationObserver(mutations => {
        if (mutations.some(mutation =>
          mutation.type === "childList" &&
          (mutation.addedNodes.length || mutation.removedNodes.length)
        )) {
          markRankingDirty();
        }
      });
      Object.values(lists).filter(Boolean).forEach(list => {
        observer.observe(list, { childList: true });
      });
    }

    function makePanel(topLayout) {
      const panel = document.createElement("div");
      panel.id = "taPowerToolsPanel";

      panel.innerHTML = `
        <div class="taToolbarHeading">
          <div>
            <strong>Review candidates</strong>
            <small>Search and filter across every status</small>
          </div>
          <div class="taToolbarActions">
            <button id="taClearFilters" type="button">Clear filters</button>
          </div>
        </div>

        <div class="taGlobalFilters">
          <label>
            <span>Search</span>
            <input id="taSearchBox" type="search" placeholder="Name or GT account">
          </label>
          <label>
            <span>Conflict</span>
            <select id="taConflictFilter">
              <option value="">All candidates</option>
              <option value="with">With conflicts</option>
              <option value="without">Without conflicts</option>
            </select>
          </label>
          <label>
            <span>Experience</span>
            <select id="taExperienceFilter">
              <option value="">All experience</option>
              <option value="TABefore">TA before</option>
              <option value="Passed">Passed course</option>
              <option value="Enrolled">Currently enrolled</option>
              <option value="AP">AP credit</option>
            </select>
          </label>
          <label>
            <span>Interest</span>
            <select id="taInterestFilter">
              <option value="">All interest levels</option>
              <option value="Very">Very interested</option>
              <option value="Somewhat">Somewhat interested</option>
              <option value="Least">Least interested</option>
            </select>
          </label>
          <label>
            <span>Candidate type</span>
            <select id="taCandidateTypeFilter">
              <option value="">New and returning</option>
              <option value="new">New TAs</option>
              <option value="returning">Returning TAs</option>
            </select>
          </label>
          <label>
            <span>Sort each status</span>
            <select id="taGlobalSort">
              <option value="">Keep current order</option>
              <option value="smart">Recommended review order</option>
              <option value="last">Last name</option>
              <option value="first">First name</option>
              <option value="experience">Experience</option>
              <option value="conflict">Conflicts last</option>
            </select>
          </label>
          <button id="taApplySort" type="button">Apply sort</button>
        </div>
        <div id="taFilterSummary" role="status"></div>
        <div id="taSearchResults" aria-live="polite"></div>

        <details id="taAdvancedTools">
          <summary>Advanced tools</summary>
          <div class="taAdvancedGrid">
            <section>
              <label for="bulkTABox"><strong>Bulk add to Preferred</strong></label>
              <textarea id="bulkTABox" placeholder="Names or GT usernames, separated by lines or commas"></textarea>
              <button id="bulkAddBtn" type="button">Add matches to Preferred</button>
            </section>
            <section>
              <strong>Maintenance and export</strong>
              <button id="moveAcceptedConflictsBtn" type="button">Decline candidates accepted elsewhere</button>
              <button id="exportAllSectionsBtn" type="button">Download rankings CSV</button>
            </section>
          </div>
        </details>
      `;

      if (topLayout?.left) topLayout.left.appendChild(panel);
      else document.querySelector("main.container")?.prepend(panel);

      const searchBox = document.getElementById("taSearchBox");
      const conflictFilter = document.getElementById("taConflictFilter");
      const experienceFilter = document.getElementById("taExperienceFilter");
      const interestFilter = document.getElementById("taInterestFilter");
      const candidateTypeFilter = document.getElementById("taCandidateTypeFilter");

      const statusNames = {
        headTAList: "Head TA",
        acceptedList: "Accepted",
        offeredList: "Offered",
        preferredList: "Preferred",
        pendingList: "Pending",
        unrankedList: "Unranked",
        declinedList: "Declined"
      };

      function renderTopSearchResults(matches, showResults) {
        const results = document.getElementById("taSearchResults");
        results.replaceChildren();
        if (!showResults) return;

        if (!matches.length) {
          results.innerHTML = '<div class="taSearchEmpty">No candidates match these filters.</div>';
          return;
        }

        matches.slice(0, 30).forEach(li => {
          const row = document.createElement("article");
          row.className = "taSearchResult";
          const status = statusNames[li.parentElement.id] || "Unknown";
          row.innerHTML = `
            <div>
              <strong>${escapeHtml(nameOf(li))}</strong>
              <span class="taSearchGT">${escapeHtml(gtOf(li))}</span>
              <small>
                ${escapeHtml(status)} · ${isNewTA(li) ? "New TA" : "Returning TA"}
                ${conflictOf(li) ? ` · <span class="taSearchConflict">Conflict</span>` : ''}
              </small>
            </div>
          `;
          const moveControl = document.createElement("label");
          moveControl.className = "taSearchMove";
          moveControl.append("Move to ", createMoveSelect(li, applyFilters));
          row.appendChild(moveControl);
          results.appendChild(row);
        });
      }

      function applyFilters() {
        const query = searchBox.value.toLowerCase().trim();
        let visible = 0;
        const matchedCandidates = [];
        allTAs().forEach(li => {
          const conflict = Boolean(conflictOf(li));
          const newCandidate = isNewTA(li);
          const candidateMatches =
            (!query || `${nameOf(li)} ${gtOf(li)}`.toLowerCase().includes(query)) &&
            (!conflictFilter.value || (conflictFilter.value === "with" ? conflict : !conflict)) &&
            (!experienceFilter.value || expOf(li) === experienceFilter.value) &&
            (!interestFilter.value || interestOf(li) === interestFilter.value) &&
            (!candidateTypeFilter.value ||
              (candidateTypeFilter.value === "new" ? newCandidate : !newCandidate));
          li.hidden = !candidateMatches;
          if (candidateMatches) {
            visible += 1;
            matchedCandidates.push(li);
          }
        });
        document.getElementById("taFilterSummary").textContent =
          visible === allTAs().length
            ? `${visible} candidates`
            : `Showing ${visible} of ${allTAs().length} candidates`;
        renderTopSearchResults(
          matchedCandidates,
          Boolean(
            query || conflictFilter.value || experienceFilter.value ||
            interestFilter.value || candidateTypeFilter.value
          )
        );
      }

      [searchBox, conflictFilter, experienceFilter, interestFilter, candidateTypeFilter]
        .forEach(control => control.addEventListener("input", applyFilters));

      document.getElementById("taClearFilters").onclick = () => {
        [searchBox, conflictFilter, experienceFilter, interestFilter, candidateTypeFilter]
          .forEach(control => { control.value = ""; });
        applyFilters();
        searchBox.focus();
      };

      document.getElementById("taApplySort").onclick = () => {
        const value = document.getElementById("taGlobalSort").value;
        if (!value) return;
        [lists.headTAList, lists.preferredList, lists.pendingList,
          lists.unrankedList, lists.declinedList].filter(Boolean).forEach(list => {
          if (value === "smart") smartSort(list);
          else sortList(list, {
            last: lastNameKey,
            first: firstNameKey,
            experience: experienceKey,
            conflict: conflictKey
          }[value]);
        });
        applyFilters();
      };

      document.getElementById("bulkAddBtn").onclick = () => {
        const terms = document.getElementById("bulkTABox").value
          .split(/\n|,/)
          .map(x => x.trim().toLowerCase())
          .filter(Boolean);

        let moved = 0;
        const missing = [];

        terms.forEach(term => {
          const li = allTAs().find(x =>
            gtOf(x).toLowerCase() === term ||
            nameOf(x).toLowerCase().includes(term)
          );

          if (li) {
            moveTo(li, lists.preferredList);
            moved++;
          } else {
            missing.push(term);
          }
        });

        alert(`Moved ${moved} TA(s).` + (missing.length ? `\nMissing: ${missing.join(", ")}` : ""));
        applyFilters();
      };

      document.getElementById("moveAcceptedConflictsBtn").onclick = () => {
        const matches = allTAs().filter(li =>
          li.parentElement.id !== "declinedList" &&
          conflictOf(li).includes("Accepted#")
        );

        if (!matches.length) return alert("No accepted conflicts found.");
        if (!confirm(`Move ${matches.length} accepted-conflict TA(s) to Declined?`)) return;

        matches.forEach(li => moveTo(li, lists.declinedList));
        alert(`Moved ${matches.length} TA(s).`);
        applyFilters();
      };

      document.getElementById("exportAllSectionsBtn").onclick = () => {
        const exportLists = [
          ["Head TA", lists.headTAList],
          ["Accepted", lists.acceptedList],
          ["Offered", lists.offeredList],
          ["Preferred", lists.preferredList],
          ["Pending", lists.pendingList],
          ["Unranked", lists.unrankedList],
          ["Declined", lists.declinedList]
        ];

        const rows = [["Section", "Rank", "Name", "GT Account", "Experience", "Interest", "Level", "USG", "New TA", "Conflict"]];

        exportLists.forEach(([section, list]) => {
          if (!list) return;

          [...list.querySelectorAll("li.rankedItem")].forEach((li, i) => {
            rows.push([
              section,
              i + 1,
              nameOf(li),
              gtOf(li),
              expOf(li),
              interestOf(li),
              levelOf(li),
              employmentOf(li),
              isNewTA(li) ? "Yes" : "No",
              conflictOf(li)
            ]);
          });
        });

        const csv = rows.map(row =>
          row.map(cell => `"${String(cell).replaceAll('"', '""')}"`).join(",")
        ).join("\n");

        const blob = new Blob([csv], { type: "text/csv;charset=utf-8;" });
        const url = URL.createObjectURL(blob);

        const a = document.createElement("a");
        a.href = url;
        a.download = "ta_rankings_all_sections.csv";
        a.click();

        URL.revokeObjectURL(url);
      };

      const instructorBox = document.getElementById("taInstructorBox");
      if (instructorBox) {
        instructorBox.classList.add("taAdvancedInstructors");
        document.querySelector("#taAdvancedTools .taAdvancedGrid")
          ?.appendChild(instructorBox);
      }

      applyFilters();
    }

    injectModernCSS();
    injectWorkflowCSS();

    const topLayout = makeTopLayout();
    moveInstructorsToRight(topLayout);

    addSectionButtons();
    addInlineButtons();
    addApplicationDialog();
    addVisibleStudentDetails();
    makePanel(topLayout);
    addSaveBar();
    updateAllocationSummary();
  }

  function start() {
    setTimeout(init, 100);
  }

  if (document.readyState === "complete") start();
  else window.addEventListener("load", start, { once: true });
})();
