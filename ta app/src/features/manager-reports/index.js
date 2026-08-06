// ==UserScript==
// @name         GT TA Hiring - Manager Reports
// @namespace    https://gatech.edu/
// @version      1.0.0
// @description  Themes the manager report page and adds a staffing and assignments export.
// @match        https://ta-app.cc.gatech.edu/admin/report/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(function () {
    'use strict';

    const { clean, escapeHtml } = toolkit.utils;
    const form = document.querySelector('form[name="report_index"]');
    const semesterSelect = document.getElementById('report_index_semester');

    if (!form || !semesterSelect || document.getElementById('tm-report-center')) return;

    document.body.classList.add('gt-ta-toolkit-page');
    addStyles();
    buildReportCenter();

    function buildReportCenter() {
        const originalWrapper = form.closest('.example-wrapper') || form.parentElement;
        const center = document.createElement('section');
        center.id = 'tm-report-center';
        center.innerHTML = `
            <div class="tm-report-center-header">
                <div>
                    <span class="tm-report-eyebrow">Manager tools</span>
                    <h1>Reports</h1>
                    <p>Choose a semester, then download the report that fits your task.</p>
                </div>
            </div>
            <div class="tm-report-semester-row">
                <label for="report_index_semester">Report semester</label>
            </div>
            <div class="tm-report-cards">
                <article class="tm-report-card">
                    <div>
                        <span class="tm-report-card-tag">TA app report</span>
                        <h2>Full native report</h2>
                        <p>All application rows and original TA-app fields, unchanged.</p>
                    </div>
                    <div id="tm-native-report-slot"></div>
                </article>
                <article class="tm-report-card tm-report-card-featured">
                    <div>
                        <span class="tm-report-card-tag">Toolkit report</span>
                        <h2>Staffing &amp; assignments</h2>
                        <p>Course compliance summary, paid/unpaid ratio guidance, readable assignment details, and duplicate markers.</p>
                    </div>
                    <label class="tm-report-check">
                        <input id="tm-report-center-inactive" type="checkbox">
                        Include Unranked and Declined
                    </label>
                    <div class="tm-toolkit-report-buttons">
                        <button id="tm-download-excel-report" type="button">Download highlighted Excel report</button>
                        <button id="tm-download-staffing-report" type="button">Download staffing CSV</button>
                    </div>
                    <div id="tm-report-center-status" aria-live="polite"></div>
                </article>
            </div>
        `;

        originalWrapper.before(center);
        center.querySelector('.tm-report-semester-row').appendChild(semesterSelect);
        center.querySelector('#tm-native-report-slot').appendChild(form);
        const nativeSemester = document.createElement('input');
        nativeSemester.type = 'hidden';
        nativeSemester.name = semesterSelect.name;
        nativeSemester.value = semesterSelect.value;
        form.appendChild(nativeSemester);
        semesterSelect.removeAttribute('name');
        semesterSelect.addEventListener('change', () => {
            nativeSemester.value = semesterSelect.value;
        });
        const nativeButton = form.querySelector('button[type="submit"], input[type="submit"]');
        if (nativeButton) nativeButton.textContent = 'Download full native CSV';
        originalWrapper.remove();

        document.getElementById('tm-download-staffing-report')
            .addEventListener('click', downloadStaffingReport);
        document.getElementById('tm-download-excel-report')
            .addEventListener('click', downloadExcelReport);
    }

    async function loadRecords() {
        const includeInactive = document.getElementById('tm-report-center-inactive').checked;
        const response = await fetch(
            `/admin/report/create.csv?semester=${encodeURIComponent(semesterSelect.value)}`,
            { credentials: 'same-origin' }
        );
        if (!response.ok) throw new Error(`Report returned ${response.status}`);
        const records = parseCsv(await response.text())
            .map(nativeRecord)
            .filter(record => includeInactive || !['Unranked', 'Declined'].includes(record.status));
        annotateDuplicates(records);
        return records;
    }

    async function downloadStaffingReport() {
        const button = document.getElementById('tm-download-staffing-report');
        const status = document.getElementById('tm-report-center-status');
        const includeInactive = document.getElementById('tm-report-center-inactive').checked;
        const semester = clean(semesterSelect.options[semesterSelect.selectedIndex]?.textContent);

        button.disabled = true;
        status.className = '';
        status.textContent = 'Preparing the native manager data…';

        try {
            const records = await loadRecords();
            downloadCsv(records, semester);
            status.textContent = `Downloaded ${records.length.toLocaleString()} course/status rows.`;
        } catch (error) {
            status.className = 'tm-report-center-error';
            status.textContent = `Could not create the report: ${error.message}`;
        } finally {
            button.disabled = false;
        }
    }

    async function downloadExcelReport() {
        const button = document.getElementById('tm-download-excel-report');
        const status = document.getElementById('tm-report-center-status');
        const semester = clean(semesterSelect.options[semesterSelect.selectedIndex]?.textContent);
        button.disabled = true;
        status.className = '';
        status.textContent = 'Building the highlighted course workbook…';
        try {
            const [records, courseResponse] = await Promise.all([
                loadRecords(),
                fetch('/instructor-admin/', { credentials: 'same-origin' })
            ]);
            if (!courseResponse.ok) throw new Error(`Course allocations returned ${courseResponse.status}`);
            const courseDocument = new DOMParser().parseFromString(await courseResponse.text(), 'text/html');
            const allocations = extractAllocations(courseDocument, semester);
            const summaries = summarizeCourses(records, allocations);
            downloadXlsx(summaries, records, semester);
            const problems = summaries.filter(summary => summary.level === 'Problem').length;
            status.textContent = `Downloaded ${summaries.length} courses; ${problems} marked as problems.`;
        } catch (error) {
            status.className = 'tm-report-center-error';
            status.textContent = `Could not create the Excel report: ${error.message}`;
        } finally {
            button.disabled = false;
        }
    }

    function extractAllocations(doc, semester) {
        const allocations = new Map();
        doc.querySelectorAll('main table tbody tr').forEach(row => {
            const cells = row.querySelectorAll('td');
            const fullName = clean(cells[0]?.textContent);
            const match = fullName.match(/^(.*?)\s+-\s+((?:Spring|Summer|Fall)\s+\d{4})$/i);
            if (!match || clean(match[2]) !== semester) return;
            allocations.set(courseKey(match[1]), {
                course: clean(match[1]).replace(/\s+/g, ' '),
                allocation: Number.parseInt(clean(cells[1]?.textContent), 10) || 0
            });
        });
        return allocations;
    }

    function summarizeCourses(records, allocations) {
        const grouped = new Map();
        records.forEach(record => {
            const key = courseKey(record.course);
            if (!grouped.has(key)) grouped.set(key, []);
            grouped.get(key).push(record);
        });
        return [...allocations.entries()].map(([key, allocationInfo]) => {
            const rows = grouped.get(key) || [];
            const accepted = rows.filter(row => row.status === 'Accepted');
            const offered = rows.filter(row => row.status === 'Offered');
            const preferred = rows.filter(row => row.status === 'Preferred');
            const headTAs = rows.filter(row => row.status === 'Head TA');
            // Head TAs consume an allocation slot, but remain outside the paid/new ratio.
            const ratioStaff = [...accepted, ...offered];
            const committed = [...headTAs, ...ratioStaff];
            const returning = ratioStaff.filter(row => row.taType === 'Returning').length;
            const newCount = ratioStaff.length - returning;
            const maximumReturning = Math.ceil(allocationInfo.allocation * 20 / 30);
            const minimumNew = Math.max(0, allocationInfo.allocation - maximumReturning);
            const remaining = Math.max(0, allocationInfo.allocation - committed.length);
            const issues = [];
            let level = 'OK';
            if (headTAs.length + accepted.length > allocationInfo.allocation) {
                issues.push(`Over allocation: ${headTAs.length + accepted.length} Head TAs or accepted TAs; ${allocationInfo.allocation} allotted`);
                level = 'Problem';
            } else if (committed.length > allocationInfo.allocation) {
                issues.push(`Possible over-hire: ${committed.length} Head TAs, accepted TAs, or offers; ${allocationInfo.allocation} allotted`);
                level = 'Problem';
            }
            if (returning > maximumReturning) {
                issues.push(`Paid/returning limit exceeded: ${returning} committed; ${maximumReturning} maximum`);
                level = 'Problem';
            }
            if (committed.length >= allocationInfo.allocation && newCount < minimumNew) {
                issues.push(`Not enough unpaid/new TAs: ${newCount} committed; ${minimumNew} minimum when fully staffed`);
                level = 'Problem';
            }
            if (preferred.length > remaining) {
                issues.push(`Preferred-list advisory: ${preferred.length} preferred candidates; ${remaining} spots remain after Head TAs, accepted TAs, and offers`);
                if (level === 'OK') level = 'Advisory';
            }
            return {
                course: allocationInfo.course,
                allocation: allocationInfo.allocation,
                accepted: accepted.length,
                offered: offered.length,
                committed: committed.length,
                preferred: preferred.length,
                headTAs: headTAs.length,
                returning,
                newCount,
                maximumReturning,
                minimumNew,
                remaining,
                level,
                issues: issues.join('; ') || 'None'
            };
        }).sort((a, b) =>
            ({ Problem: 0, Advisory: 1, OK: 2 }[a.level] - { Problem: 0, Advisory: 1, OK: 2 }[b.level]) ||
            a.course.localeCompare(b.course, undefined, { numeric: true })
        );
    }

    function courseKey(value) {
        return clean(value).toLowerCase().replace(/[^a-z0-9]/g, '');
    }

    function xmlEscape(value) {
        return String(value ?? '').replace(/[&<>"']/g, character => ({
            '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&apos;'
        })[character]);
    }

    function columnName(index) {
        let name = '';
        for (let value = index + 1; value; value = Math.floor((value - 1) / 26)) {
            name = String.fromCharCode(65 + ((value - 1) % 26)) + name;
        }
        return name;
    }

    function xlsxRow(values, rowNumber, styleIndex = 0) {
        return `<row r="${rowNumber}">${values.map((value, index) => {
            const reference = `${columnName(index)}${rowNumber}`;
            if (typeof value === 'number') {
                return `<c r="${reference}" s="${styleIndex}"><v>${value}</v></c>`;
            }
            return `<c r="${reference}" s="${styleIndex}" t="inlineStr"><is><t xml:space="preserve">${xmlEscape(value)}</t></is></c>`;
        }).join('')}</row>`;
    }

    function worksheetXml(rows, widths, freezeRow = 1) {
        return `<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
            <worksheet xmlns="http://schemas.openxmlformats.org/spreadsheetml/2006/main">
              <sheetViews><sheetView workbookViewId="0"><pane ySplit="${freezeRow}" topLeftCell="A${freezeRow + 1}" activePane="bottomLeft" state="frozen"/></sheetView></sheetViews>
              <cols>${widths.map((width, index) => `<col min="${index + 1}" max="${index + 1}" width="${width}" customWidth="1"/>`).join('')}</cols>
              <sheetData>${rows.join('')}</sheetData>
              <autoFilter ref="A${freezeRow}:${columnName(widths.length - 1)}${freezeRow}"/>
            </worksheet>`;
    }

    function downloadXlsx(summaries, records, semester) {
        const summaryHeaders = [
            'Course', 'Allocation', 'Head TAs (counted)', 'Accepted', 'Offered', 'Head TAs + Accepted + Offered',
            'Preferred (not yet staffed)', 'Returning / Paid Committed', 'Returning / Paid Maximum',
            'New / Unpaid Committed', 'New / Unpaid Minimum When Filled', 'Remaining', 'Status', 'Details'
        ];
        const summaryRows = [
            xlsxRow([`${semester} staffing summary`], 1, 1),
            xlsxRow(['Head TAs, Accepted TAs, and Offered TAs count as staffed/committed against the allocation. Preferred candidates are not yet staffed and create advisories only. Returning means paid; New means unpaid for ratio planning. Head TAs are excluded only from the paid/new ratio calculation; Pending candidates are also excluded.'], 2),
            xlsxRow(summaryHeaders, 3, 1),
            ...summaries.map((summary, index) => xlsxRow([
                summary.course, summary.allocation, summary.headTAs, summary.accepted, summary.offered,
                summary.committed, summary.preferred, summary.returning,
                summary.maximumReturning, summary.newCount, summary.minimumNew,
                summary.remaining, summary.level, summary.issues
            ], index + 4, { Problem: 2, Advisory: 3, OK: 4 }[summary.level]))
        ];
        const statusOrder = {
            'Head TA': 0, Accepted: 1, Offered: 2, Preferred: 3,
            Pending: 4, Unranked: 5, Declined: 6
        };
        const detailHeaders = [
            'Semester', 'Course', 'Status', 'Rank', 'TA Type', 'Name', 'Username',
            'Email', 'GTID', 'Duplicate Key', 'Total Attachments', 'Attachment Number',
            'Appears Multiple Times'
        ];
        const sortedRecords = [...records].sort((a, b) =>
            a.course.localeCompare(b.course, undefined, { numeric: true }) ||
            (statusOrder[a.status] ?? 99) - (statusOrder[b.status] ?? 99) ||
            (Number(a.rank) || 0) - (Number(b.rank) || 0)
        );
        const detailRows = [
            xlsxRow(detailHeaders, 1, 1),
            ...sortedRecords.map((record, index) => xlsxRow([
                record.semester, record.course, record.status, record.rank,
                record.taType === 'Returning' ? 'Returning (paid)' : 'New (unpaid)',
                record.name, record.username, record.email, record.gtid, record.duplicateKey,
                record.attachmentCount, record.attachmentNumber,
                record.attachmentCount > 1 ? 'Yes' : 'No'
            ], index + 2))
        ];
        const files = {
            '[Content_Types].xml': `<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Types xmlns="http://schemas.openxmlformats.org/package/2006/content-types"><Default Extension="rels" ContentType="application/vnd.openxmlformats-package.relationships+xml"/><Default Extension="xml" ContentType="application/xml"/><Override PartName="/xl/workbook.xml" ContentType="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml"/><Override PartName="/xl/worksheets/sheet1.xml" ContentType="application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml"/><Override PartName="/xl/worksheets/sheet2.xml" ContentType="application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml"/><Override PartName="/xl/styles.xml" ContentType="application/vnd.openxmlformats-officedocument.spreadsheetml.styles+xml"/></Types>`,
            '_rels/.rels': `<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Relationships xmlns="http://schemas.openxmlformats.org/package/2006/relationships"><Relationship Id="rId1" Type="http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument" Target="xl/workbook.xml"/></Relationships>`,
            'xl/workbook.xml': `<?xml version="1.0" encoding="UTF-8" standalone="yes"?><workbook xmlns="http://schemas.openxmlformats.org/spreadsheetml/2006/main" xmlns:r="http://schemas.openxmlformats.org/officeDocument/2006/relationships"><sheets><sheet name="Course Summary" sheetId="1" r:id="rId1"/><sheet name="Assignments" sheetId="2" r:id="rId2"/></sheets></workbook>`,
            'xl/_rels/workbook.xml.rels': `<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Relationships xmlns="http://schemas.openxmlformats.org/package/2006/relationships"><Relationship Id="rId1" Type="http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet" Target="worksheets/sheet1.xml"/><Relationship Id="rId2" Type="http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet" Target="worksheets/sheet2.xml"/><Relationship Id="rId3" Type="http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles" Target="styles.xml"/></Relationships>`,
            'xl/styles.xml': `<?xml version="1.0" encoding="UTF-8" standalone="yes"?><styleSheet xmlns="http://schemas.openxmlformats.org/spreadsheetml/2006/main"><fonts count="3"><font><sz val="11"/><name val="Calibri"/></font><font><b/><color rgb="FFFFFFFF"/><sz val="11"/><name val="Calibri"/></font><font><b/><color rgb="FF8A2018"/><sz val="11"/><name val="Calibri"/></font></fonts><fills count="6"><fill><patternFill patternType="none"/></fill><fill><patternFill patternType="gray125"/></fill><fill><patternFill patternType="solid"><fgColor rgb="FF003057"/><bgColor indexed="64"/></patternFill></fill><fill><patternFill patternType="solid"><fgColor rgb="FFF4CCCC"/><bgColor indexed="64"/></patternFill></fill><fill><patternFill patternType="solid"><fgColor rgb="FFFFF2CC"/><bgColor indexed="64"/></patternFill></fill><fill><patternFill patternType="solid"><fgColor rgb="FFD9EAD3"/><bgColor indexed="64"/></patternFill></fill></fills><borders count="1"><border><left/><right/><top/><bottom/><diagonal/></border></borders><cellStyleXfs count="1"><xf numFmtId="0" fontId="0" fillId="0" borderId="0"/></cellStyleXfs><cellXfs count="5"><xf numFmtId="0" fontId="0" fillId="0" borderId="0" xfId="0"/><xf numFmtId="0" fontId="1" fillId="2" borderId="0" xfId="0" applyFont="1" applyFill="1"/><xf numFmtId="0" fontId="2" fillId="3" borderId="0" xfId="0" applyFont="1" applyFill="1"/><xf numFmtId="0" fontId="0" fillId="4" borderId="0" xfId="0" applyFill="1"/><xf numFmtId="0" fontId="0" fillId="5" borderId="0" xfId="0" applyFill="1"/></cellXfs><cellStyles count="1"><cellStyle name="Normal" xfId="0" builtinId="0"/></cellStyles></styleSheet>`,
            'xl/worksheets/sheet1.xml': worksheetXml(summaryRows, [22, 12, 20, 11, 11, 18, 23, 24, 24, 21, 28, 12, 12, 80], 3),
            'xl/worksheets/sheet2.xml': worksheetXml(detailRows, [15, 18, 14, 8, 20, 24, 18, 30, 15, 20, 18, 18, 22], 1)
        };
        const url = URL.createObjectURL(new Blob([createZip(files)], {
            type: 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
        }));
        const link = document.createElement('a');
        link.href = url;
        link.download = `ta-staffing-${semester.toLowerCase().replaceAll(' ', '-')}.xlsx`;
        link.click();
        URL.revokeObjectURL(url);
    }

    function createZip(files) {
        const encoder = new TextEncoder();
        const localParts = [];
        const centralParts = [];
        let offset = 0;
        Object.entries(files).forEach(([name, content]) => {
            const nameBytes = encoder.encode(name);
            const data = encoder.encode(content);
            const checksum = crc32(data);
            const local = concatBytes(
                littleEndian(0x04034b50, 4), littleEndian(20, 2), littleEndian(0, 2),
                littleEndian(0, 2), littleEndian(0, 2), littleEndian(0, 2),
                littleEndian(checksum, 4), littleEndian(data.length, 4), littleEndian(data.length, 4),
                littleEndian(nameBytes.length, 2), littleEndian(0, 2), nameBytes, data
            );
            localParts.push(local);
            centralParts.push(concatBytes(
                littleEndian(0x02014b50, 4), littleEndian(20, 2), littleEndian(20, 2),
                littleEndian(0, 2), littleEndian(0, 2), littleEndian(0, 2), littleEndian(0, 2),
                littleEndian(checksum, 4), littleEndian(data.length, 4), littleEndian(data.length, 4),
                littleEndian(nameBytes.length, 2), littleEndian(0, 2), littleEndian(0, 2),
                littleEndian(0, 2), littleEndian(0, 2), littleEndian(0, 4), littleEndian(offset, 4), nameBytes
            ));
            offset += local.length;
        });
        const central = concatBytes(...centralParts);
        return concatBytes(
            ...localParts,
            central,
            littleEndian(0x06054b50, 4), littleEndian(0, 2), littleEndian(0, 2),
            littleEndian(centralParts.length, 2), littleEndian(centralParts.length, 2),
            littleEndian(central.length, 4), littleEndian(offset, 4), littleEndian(0, 2)
        );
    }

    function littleEndian(value, length) {
        const bytes = new Uint8Array(length);
        for (let index = 0; index < length; index += 1) bytes[index] = (value >>> (index * 8)) & 255;
        return bytes;
    }

    function concatBytes(...parts) {
        const result = new Uint8Array(parts.reduce((sum, part) => sum + part.length, 0));
        let offset = 0;
        parts.forEach(part => { result.set(part, offset); offset += part.length; });
        return result;
    }

    function crc32(bytes) {
        let crc = 0xffffffff;
        for (const byte of bytes) {
            crc ^= byte;
            for (let bit = 0; bit < 8; bit += 1) {
                crc = (crc >>> 1) ^ (0xedb88320 & -(crc & 1));
            }
        }
        return (crc ^ 0xffffffff) >>> 0;
    }

    function parseCsv(text) {
        const rows = [];
        let row = [];
        let field = '';
        let quoted = false;
        for (let index = 0; index < text.length; index += 1) {
            const character = text[index];
            if (quoted) {
                if (character === '"' && text[index + 1] === '"') {
                    field += '"';
                    index += 1;
                } else if (character === '"') {
                    quoted = false;
                } else field += character;
            } else if (character === '"') quoted = true;
            else if (character === ',') {
                row.push(field);
                field = '';
            } else if (character === '\n') {
                row.push(field.replace(/\r$/, ''));
                rows.push(row);
                row = [];
                field = '';
            } else field += character;
        }
        if (field || row.length) {
            row.push(field.replace(/\r$/, ''));
            rows.push(row);
        }
        const headers = (rows.shift() || []).map((header, index) =>
            index ? header : header.replace(/^\uFEFF/, '')
        );
        return rows.filter(values => values.some(Boolean)).map(values =>
            Object.fromEntries(headers.map((header, index) => [header, values[index] || '']))
        );
    }

    function nativeRecord(row) {
        const statuses = {
            HEADTA: 'Head TA', ACCEPT: 'Accepted', OFFER: 'Offered',
            PREFER: 'Preferred', PEND: 'Pending', UN: 'Unranked', DECLINE: 'Declined'
        };
        return {
            semester: clean(row.Semester),
            course: clean(row.Course),
            status: statuses[clean(row.Status).toUpperCase()] || clean(row.Status),
            rank: Number.parseInt(row.Rank, 10) || '',
            taType: clean(row.TABefore).toUpperCase() === 'YES' ? 'Returning' : 'New',
            name: clean(`${row.FirstName || ''} ${row.LastName || ''}`),
            username: clean(row.GTAccount),
            email: clean(row.Email),
            gtid: clean(row.GTID)
        };
    }

    function annotateDuplicates(records) {
        const groups = new Map();
        records.forEach(record => {
            const key = record.gtid || record.username || record.name;
            if (!groups.has(key)) groups.set(key, []);
            groups.get(key).push(record);
        });
        groups.forEach(group => group.forEach((record, index) => {
            record.duplicateKey = record.gtid || record.username || record.name;
            record.attachmentCount = group.length;
            record.attachmentNumber = index + 1;
        }));
    }

    function downloadCsv(records, semester) {
        const statusOrder = {
            'Head TA': 0, Accepted: 1, Offered: 2, Preferred: 3,
            Pending: 4, Unranked: 5, Declined: 6
        };
        const rows = [[
            'Semester', 'Course', 'Status', 'Rank', 'TA Type', 'Name',
            'Username', 'Email', 'GTID', 'Duplicate Key', 'Total Attachments',
            'Attachment Number', 'Appears Multiple Times'
        ]];
        [...records].sort((a, b) =>
            a.course.localeCompare(b.course, undefined, { numeric: true }) ||
            (statusOrder[a.status] ?? 99) - (statusOrder[b.status] ?? 99) ||
            (Number(a.rank) || 0) - (Number(b.rank) || 0) ||
            a.username.localeCompare(b.username)
        ).forEach(record => rows.push([
            record.semester, record.course, record.status, record.rank,
            record.taType === 'Returning' ? 'Returning (paid)' : 'New (unpaid)',
            record.name, record.username, record.email, record.gtid,
            record.duplicateKey, record.attachmentCount, record.attachmentNumber,
            record.attachmentCount > 1 ? 'Yes' : 'No'
        ]));
        const csv = rows.map(row => row.map(value =>
            `"${String(value ?? '').replaceAll('"', '""')}"`
        ).join(',')).join('\n');
        const url = URL.createObjectURL(new Blob([`\uFEFF${csv}`], {
            type: 'text/csv;charset=utf-8;'
        }));
        const link = document.createElement('a');
        link.href = url;
        link.download = `ta-staffing-assignments-${semester.toLowerCase().replaceAll(' ', '-')}.csv`;
        link.click();
        URL.revokeObjectURL(url);
    }

    function addStyles() {
        const style = document.createElement('style');
        style.textContent = `
            #tm-report-center { max-width: 1050px; margin: 25px auto 70px; color: var(--tm-text); }
            .tm-report-center-header { padding: 24px 26px; border-radius: 14px 14px 0 0; background: #003057; color: white; }
            .tm-report-center-header h1 { margin: 2px 0 5px; color: white; font-size: 2rem; }
            .tm-report-center-header p { margin: 0; color: #dce8f1; }
            .tm-report-eyebrow { color: #d6c57f; font-size: .75rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; }
            .tm-report-semester-row { display: flex; align-items: center; gap: 14px; padding: 16px 22px; border: 1px solid var(--tm-border); border-top: 0; background: var(--tm-surface); }
            .tm-report-semester-row label { margin: 0; font-weight: 800; }
            .tm-report-semester-row select { min-width: 190px; min-height: 42px; margin: 0; }
            .tm-report-cards { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 16px; margin-top: 18px; }
            .tm-report-card { display: flex; flex-direction: column; gap: 15px; min-height: 265px; padding: 22px; border: 1px solid var(--tm-border); border-radius: 12px; background: var(--tm-surface); box-shadow: var(--tm-shadow); }
            .tm-report-card-featured { border-top: 5px solid #b3a369; padding-top: 18px; }
            .tm-report-card h2 { margin: 4px 0 7px; font-size: 1.35rem; }
            .tm-report-card p { margin: 0; color: var(--tm-muted); }
            .tm-report-card-tag { color: #857437; font-size: .73rem; font-weight: 800; letter-spacing: .06em; text-transform: uppercase; }
            #tm-native-report-slot { margin-top: auto; }
            #tm-native-report-slot form { margin: 0; }
            #tm-native-report-slot #report_index { display: none; }
            #tm-native-report-slot button, #tm-download-staffing-report, #tm-download-excel-report { width: 100%; min-height: 44px; margin: 0; border: 1px solid #003057; border-radius: 7px; background: #003057; color: white; cursor: pointer; font-weight: 800; }
            .tm-toolkit-report-buttons { display: grid; gap: 8px; margin-top: auto; }
            #tm-download-excel-report { background: #b3a369; color: #252525; border-color: #857437; }
            :is(#tm-native-report-slot button, #tm-download-staffing-report, #tm-download-excel-report):disabled { cursor: wait; opacity: .6; }
            .tm-report-check { display: inline-flex; align-items: center; gap: 8px; margin: 0; cursor: pointer; }
            .tm-report-check input { width: auto; margin: 0; }
            #tm-report-center-status { min-height: 20px; color: var(--tm-muted); font-size: .82rem; }
            #tm-report-center-status.tm-report-center-error { color: var(--tm-danger); }
            @media (max-width: 760px) { .tm-report-cards { grid-template-columns: 1fr; } .tm-report-semester-row { align-items: stretch; flex-direction: column; } }
        `;
        document.head.appendChild(style);
    }
})();
