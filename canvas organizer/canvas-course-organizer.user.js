// ==UserScript==
// @name         Georgia Tech Canvas Course Organizer
// @namespace    https://gatech.instructure.com/
// @version      3.5.4
// @description  Organizes Canvas courses and the Georgia Tech Combine Courses tool.
// @author       Ronnie Howard
// @match        https://gatech.instructure.com/*
// @match        https://crosslist.eduapps.gatech.edu/*
// @run-at       document-idle
// @grant        GM_getValue
// @grant        GM_setValue
// @grant        GM_registerMenuCommand
// @require      https://cdn.jsdelivr.net/npm/xlsx@0.18.5/dist/xlsx.full.min.js
// ==/UserScript==

(function () {
  'use strict';
  if (location.hostname === 'crosslist.eduapps.gatech.edu') return;
  // The Canvas organizer belongs only in the top-level Canvas document.  The
  // separate Combine Courses acknowledgement handler below is intentionally
  // allowed in Canvas's launch frame.
  if (window.top !== window) return;
  if (location.pathname !== '/' && location.pathname !== '/courses') return;

  const ALL_COURSES_URL = '/courses';
  const STATE_KEY = 'gtco-state-v2';
  // v2 deliberately drops the old section-limited enrollment-endpoint cache.
  const ENROLLMENT_CACHE_KEY = 'gtco-enrollment-counts-v2';
  const ACTIVE_COUNT_MAX_AGE = 12 * 60 * 60 * 1000;
  const defaults = {
    dashboardLink: true,
    collapsePast: true,
    highlights: true,
    rememberState: true,
    urlState: true,
    enrollmentCounts: true,
  };
  const settings = Object.fromEntries(
    Object.entries(defaults).map(([key, value]) => [key, typeof GM_getValue === 'function' ? GM_getValue(key, value) : value])
  );

  const css = `
    .gtco-all-courses-link { display:inline-flex;align-items:center;gap:.45rem;min-height:38px;padding:0 1rem;border:1px solid #004f9f;border-radius:4px;color:#004f9f!important;background:#fff;font-weight:700;text-decoration:none!important;box-sizing:border-box }
    .gtco-all-courses-link:hover,.gtco-all-courses-link:focus { color:#fff!important;background:#004f9f;text-decoration:none!important }
    .gtco-dashboard-link { margin-right:.75rem }
    .gtco-shell { margin-top:1rem;color:#2d3b45 }
    .gtco-toolbar { display:grid;grid-template-columns:minmax(220px,1fr) auto;gap:.75rem;align-items:end;padding:1rem;border:1px solid #c7cdd1;border-radius:6px 6px 0 0;background:#f5f5f5 }
    .gtco-field { display:flex;flex-direction:column;gap:.3rem;margin:0 }
    .gtco-field span { font-size:.875rem;font-weight:700 }
    .gtco-input,.gtco-select { height:40px;margin:0!important;border:1px solid #8b969e!important;border-radius:4px!important;background:#fff!important;box-sizing:border-box }
    .gtco-input { width:100%;padding:0 .75rem!important }
    .gtco-select { min-width:190px;padding:0 2rem 0 .65rem!important }
    .gtco-actions { display:flex;flex-wrap:wrap;gap:.5rem;padding:0 1rem 1rem;border:1px solid #c7cdd1;border-top:0;background:#f5f5f5 }
    .gtco-button { min-height:34px;padding:.3rem .75rem;border:1px solid #8b969e;border-radius:4px;background:#fff;color:#2d3b45;cursor:pointer }
    .gtco-button:hover,.gtco-button:focus { background:#e8eaec }
    .gtco-filters { display:flex;flex-wrap:wrap;gap:.45rem;padding:1rem;border:1px solid #c7cdd1;border-top:0;border-radius:0 0 6px 6px }
    .gtco-filter { padding:.28rem .7rem;border:1px solid #8b969e;border-radius:999px;background:#fff;color:#2d3b45;cursor:pointer }
    .gtco-filter[aria-pressed="true"] { border-color:#004f9f;background:#004f9f;color:#fff }
    .gtco-summary { margin:.8rem 0 1.1rem;color:#5c6670 }
    .gtco-term { margin:0 0 2rem }
    .gtco-term-heading { display:flex;align-items:center;gap:.6rem;width:100%;margin:0 0 .75rem;padding:0 0 .45rem;border:0;border-bottom:3px solid #b3a369;background:none;color:#2d3b45;text-align:left;font-size:1.35rem;font-weight:700;cursor:pointer }
    .gtco-term-heading::before { content:'▾';width:1rem;font-size:.9rem }
    .gtco-term.is-collapsed .gtco-term-heading::before { content:'▸' }
    .gtco-term.is-collapsed .gtco-grid { display:none }
    .gtco-count { color:#6b7780;font-size:.85rem;font-weight:400 }
    .gtco-grid { display:grid;grid-template-columns:repeat(auto-fill,minmax(280px,1fr));gap:1rem }
    .gtco-card { position:relative;display:flex;min-height:155px;overflow:hidden;border:1px solid #c7cdd1;border-radius:6px;background:#fff;box-shadow:0 1px 3px rgba(45,59,69,.14) }
    .gtco-card-accent { flex:0 0 6px;background:var(--gtco-color,#b3a369) }
    .gtco-card-body { flex:1;min-width:0;padding:1rem 1rem .9rem }
    .gtco-card-top { display:flex;align-items:flex-start;gap:.55rem }
    .gtco-card-title { flex:1;margin:0;font-size:1.05rem;line-height:1.35 }
    .gtco-card-title a { color:#004f9f;text-decoration:none }
    .gtco-card-title a:hover,.gtco-card-title a:focus { text-decoration:underline }
    .gtco-favorite { flex:0 0 auto;font-size:1.2rem }
    .gtco-favorite .course-list-favoritable { cursor:pointer }
    .gtco-meta { display:grid;grid-template-columns:auto 1fr;gap:.25rem .65rem;margin:.8rem 0 0 }
    .gtco-meta dt { color:#6b7780;font-weight:700 }
    .gtco-meta dd { min-width:0;margin:0;overflow-wrap:anywhere }
    .gtco-badge { display:inline-block;margin-top:.75rem;padding:.12rem .45rem;border-radius:10px;color:#46515a;background:#eef0f2;font-size:.75rem }
    .gtco-enrollment-counts { display:flex;flex-wrap:wrap;gap:.2rem .55rem;margin-top:.55rem;color:#46515a;font-size:.76rem;font-weight:700 }
    .gtco-enrollment-counts[data-state="loading"],.gtco-enrollment-counts[data-state="unavailable"] { color:#6b7780;font-weight:400 }
    .ic-DashboardCard__header_content .gtco-enrollment-counts { color:inherit;line-height:1.25 }
    .gtco-shell.is-compact .gtco-grid { display:block }
    .gtco-shell.is-compact .gtco-card { min-height:0;margin-bottom:.45rem }
    .gtco-shell.is-compact .gtco-card-body { padding:.65rem .8rem }
    .gtco-shell.is-compact .gtco-meta { display:flex;flex-wrap:wrap;margin:.35rem 0 0 }
    .gtco-shell.is-compact .gtco-meta dt::after { content:':' }
    .gtco-shell.is-compact .gtco-badge { margin-top:.35rem }
    .gtco-empty { padding:2rem;border:1px dashed #8b969e;border-radius:6px;text-align:center }
    .gtco-suggestion { margin-top:.75rem }
    .gtco-suggestion button { border:0;background:none;color:#004f9f;text-decoration:underline;cursor:pointer }
    .gtco-original { display:none!important }
    mark.gtco-mark { padding:0;background:#fff2a8;color:inherit }
    @media(max-width:600px) { .gtco-toolbar{grid-template-columns:1fr}.gtco-select{width:100%}.gtco-grid{grid-template-columns:1fr} }
  `;

  function element(tag, className, text) {
    const node = document.createElement(tag);
    if (className) node.className = className;
    if (text !== undefined) node.textContent = text;
    return node;
  }

  function addStyles() {
    if (document.getElementById('gtco-styles')) return;
    const style = element('style'); style.id = 'gtco-styles'; style.textContent = css; document.head.append(style);
  }

  function registerSettingsMenu() {
    if (typeof GM_registerMenuCommand !== 'function') return;
    const labels = { dashboardLink:'dashboard link', collapsePast:'collapse past semesters', highlights:'search highlighting', rememberState:'remember view state', urlState:'URL search sharing', enrollmentCounts:'enrollment counts' };
    Object.keys(defaults).forEach((key) => GM_registerMenuCommand(
      `${settings[key] ? '✓' : '○'} ${labels[key]}`,
      () => { GM_setValue(key, !settings[key]); location.reload(); }
    ));
    GM_registerMenuCommand('Reset organizer preferences', () => {
      localStorage.removeItem(STATE_KEY);
      Object.entries(defaults).forEach(([key,value]) => GM_setValue(key,value));
      location.href = ALL_COURSES_URL;
    });
    GM_registerMenuCommand('Refresh cached enrollment counts', () => {
      localStorage.removeItem(ENROLLMENT_CACHE_KEY);
      location.reload();
    });
  }

  function addDashboardLink() {
    if (!settings.dashboardLink || document.querySelector('.gtco-dashboard-link')) return true;
    const actions = document.querySelector('.ic-Dashboard-header__actions');
    if (!actions) return false;
    const link = element('a', 'gtco-all-courses-link gtco-dashboard-link', 'All courses');
    link.href = ALL_COURSES_URL; link.setAttribute('aria-label', 'View all current and previous courses'); actions.prepend(link); return true;
  }

  const enrollmentCache = new Map();
  let enrollmentObserver;

  function readPersistentEnrollmentCache() {
    try { return JSON.parse(localStorage.getItem(ENROLLMENT_CACHE_KEY) || '{}'); } catch (_) { return {}; }
  }

  function persistEnrollmentCount(courseId, counts, permanent) {
    const cache=readPersistentEnrollmentCache();
    cache[courseId]={ counts, fetchedAt:Date.now(), permanent:Boolean(permanent || cache[courseId]?.permanent) };
    localStorage.setItem(ENROLLMENT_CACHE_KEY,JSON.stringify(cache));
  }

  function courseIdFromUrl(url) { return String(url || '').match(/\/courses\/(\d+)/)?.[1] || ''; }

  function nextPageUrl(linkHeader) {
    const next = String(linkHeader || '').split(',').find((part) => /rel="next"/.test(part));
    return next?.match(/<([^>]+)>/)?.[1] || '';
  }

  async function canvasPages(url) {
    const items=[];
    while (url) {
      const response=await fetch(url,{ credentials:'same-origin',headers:{ Accept:'application/json' } });
      if (!response.ok) throw new Error(`Canvas returned ${response.status}`);
      const page=await response.json();
      if (!Array.isArray(page)) throw new Error('Canvas returned an unexpected roster response');
      items.push(...page);
      url=nextPageUrl(response.headers.get('Link'));
    }
    return items;
  }

  function uniqueUserCount(users) {
    return new Set(users.map((user) => String(user.id ?? user.user_id)).filter((id) => id && id !== 'undefined')).size;
  }

  async function getEnrollmentCounts(courseId, permanent=false) {
    const saved=readPersistentEnrollmentCache()[courseId];
    if (saved?.counts && (saved.permanent || Date.now()-saved.fetchedAt<ACTIVE_COUNT_MAX_AGE)) {
      if (permanent && !saved.permanent) persistEnrollmentCount(courseId,saved.counts,true);
      return saved.counts;
    }
    if (!enrollmentCache.has(courseId)) {
      enrollmentCache.set(courseId, (async () => {
        try {
          // total_students is Canvas's course-wide, already-deduplicated count of
          // active and invited students.  Unlike /enrollments, it does not shrink
          // to only the sections visible to a section-limited instructor or TA.
          const summaryUrl=`/api/v1/courses/${encodeURIComponent(courseId)}?include[]=total_students&include[]=teachers`;
          const taUrl=`/api/v1/courses/${encodeURIComponent(courseId)}/users?enrollment_type[]=ta&enrollment_state[]=active&enrollment_state[]=invited&per_page=100`;
          const teacherUrl=`/api/v1/courses/${encodeURIComponent(courseId)}/users?enrollment_type[]=teacher&enrollment_state[]=active&enrollment_state[]=invited&per_page=100`;
          const [summaryResponse,tas,teacherUsers]=await Promise.all([
            fetch(summaryUrl,{ credentials:'same-origin',headers:{ Accept:'application/json' } }),
            // Some section-limited roles may not be allowed to view one roster.
            // Keep the course-wide student total and any other visible role totals.
            canvasPages(taUrl).catch(() => []),
            canvasPages(teacherUrl).catch(() => []),
          ]);
          if (!summaryResponse.ok) throw new Error(`Canvas returned ${summaryResponse.status}`);
          const summary=await summaryResponse.json();
          const instructors=new Map();
          [...(summary.teachers || []),...teacherUsers].forEach((user) => {
            const id=String(user.id ?? user.user_id);
            if (id && id !== 'undefined') instructors.set(id,user);
          });
          return {
            students:Number.isFinite(Number(summary.total_students)) ? Number(summary.total_students) : 0,
            tas:uniqueUserCount(tas),
            instructors:instructors.size,
            other:0,
          };
        } catch (_) { return null; }
      })());
    }
    const counts=await enrollmentCache.get(courseId);
    if (counts) persistEnrollmentCount(courseId,counts,permanent);
    return counts;
  }

  function countPart(value, singular, plural=singular) { return `${value} ${value === 1 ? singular : plural}`; }

  async function fillEnrollmentCounts(node) {
    if (node.dataset.state !== 'pending') return;
    node.dataset.state='loading'; node.textContent='Loading enrollment…';
    const counts = await getEnrollmentCounts(node.dataset.courseId,node.dataset.permanent === 'true');
    if (!counts) { node.dataset.state='unavailable'; node.textContent='Enrollment unavailable'; return; }
    node.dataset.state='loaded'; node.replaceChildren(
      element('span','',countPart(counts.students,'student','students')),
      element('span','',countPart(counts.tas,'TA','TAs')),
      element('span','',countPart(counts.instructors,'instructor','instructors')),
      element('span','',countPart(counts.other,'other'))
    );
  }

  function observeEnrollmentCounts(root=document) {
    if (!settings.enrollmentCounts) return;
    if (!enrollmentObserver && 'IntersectionObserver' in window) {
      enrollmentObserver = new IntersectionObserver((entries) => entries.forEach((entry) => {
        if (entry.isIntersecting) { enrollmentObserver.unobserve(entry.target); fillEnrollmentCounts(entry.target); }
      }), { rootMargin:'250px 0px' });
    }
    root.querySelectorAll('.gtco-enrollment-counts[data-state="pending"]').forEach((node) => enrollmentObserver ? enrollmentObserver.observe(node) : fillEnrollmentCounts(node));
  }

  function makeEnrollmentCounts(courseId, permanent=false) {
    const node=element('div','gtco-enrollment-counts','Enrollment counts');
    node.dataset.courseId=courseId; node.dataset.permanent=String(permanent); node.dataset.state='pending'; node.setAttribute('aria-live','polite'); return node;
  }

  function enhanceDashboardCards() {
    if (!settings.enrollmentCounts) return;
    document.querySelectorAll('.ic-DashboardCard a.ic-DashboardCard__link[href*="/courses/"]').forEach((link) => {
      const content=link.querySelector('.ic-DashboardCard__header_content'), courseId=courseIdFromUrl(link.href);
      if (!content || !courseId || content.querySelector('.gtco-enrollment-counts')) return;
      const term=cleanText(content.querySelector('.ic-DashboardCard__header-term'));
      content.append(makeEnrollmentCounts(courseId,Boolean(term) && termRank(term) !== currentTermRank()));
    });
    observeEnrollmentCounts(document);
  }

  function cleanText(node) { return (node?.textContent || '').replace(/\s+/g, ' ').trim(); }
  function normalize(value) { return value.toLowerCase().normalize('NFD').replace(/[\u0300-\u036f]/g, '').replace(/[^a-z0-9]+/g, ' ').trim(); }

  const fieldAliases = { course:'name', name:'name', nickname:'nickname', term:'term', semester:'term', role:'role', published:'published', status:'section', enrollment:'section', favorite:'favorite' };
  function parseSearch(query) {
    const parts = [], pattern = /(-?)(?:([a-z]+):)?(?:"([^"]+)"|(\S+))/gi;
    let match;
    while ((match = pattern.exec(query)) !== null) {
      const value = normalize(match[3] || match[4]);
      if (value) parts.push({ value, excluded:match[1] === '-', field:fieldAliases[(match[2] || '').toLowerCase()] || null });
    }
    return parts;
  }

  function matchesSearch(course, query) {
    return parseSearch(query).every(({ value, excluded, field }) => {
      const source = field ? normalize(String(course[field])) : course.search;
      const found = source.includes(value); return excluded ? !found : found;
    });
  }

  function tableSection(table) {
    const id = table.id.toLowerCase();
    if (id.includes('past')) return 'Past enrollment';
    if (id.includes('future')) return 'Future enrollment';
    return 'Current enrollment';
  }

  function readCourses(tables) {
    return tables.flatMap((table) => Array.from(table.querySelectorAll('tbody tr.course-list-table-row')).map((row) => {
      const titleCell = row.querySelector('.course-list-course-title-column');
      const link = titleCell?.querySelector('a[href*="/courses/"]');
      const favoriteNode = row.querySelector('.course-list-star-column .course-list-favoritable');
      const favorite = Boolean(favoriteNode?.querySelector('.icon-star:not(.icon-star-light)'));
      const values = {
        name:cleanText(link?.querySelector('.name') || link) || 'Untitled course', href:link?.href || ALL_COURSES_URL, id:courseIdFromUrl(link?.href),
        nickname:cleanText(row.querySelector('.course-list-nickname-column')), term:cleanText(row.querySelector('.course-list-term-column')) || 'No semester listed',
        role:cleanText(row.querySelector('.course-list-enrolled-as-column')) || 'Not listed', published:cleanText(row.querySelector('.course-list-published-column')) || 'Not listed',
        section:tableSection(table), color:titleCell?.querySelector('.course-color-block')?.style.color || '#b3a369', favorite, favoriteNode,
      };
      values.search = normalize([values.name, values.nickname, values.term, values.role, values.published, values.section, favorite ? 'favorite starred' : ''].join(' '));
      return values;
    }));
  }

  const seasons = { winter:1, spring:2, summer:3, fall:4 };
  function termRank(term) { const text=term.toLowerCase(), year=Number(text.match(/(?:19|20)\d{2}/)?.[0] || 0), season=Object.entries(seasons).find(([name]) => text.includes(name))?.[1] || 0; return year*10+season; }
  function currentTermRank() { const now=new Date(), month=now.getMonth()+1, season=month<=5?2:month<=8?3:4; return now.getFullYear()*10+season; }

  function highlighted(text, query, field) {
    const target = element('span');
    const terms = settings.highlights ? parseSearch(query).filter((part) => !part.excluded && (!part.field || part.field === field)).map((part) => part.value).filter((part) => part.length > 1) : [];
    if (!terms.length) { target.textContent = text; return target; }
    const words = terms.flatMap((term) => term.split(' ')).filter(Boolean).sort((a,b) => b.length-a.length);
    const regex = new RegExp(`(${words.map((word) => word.replace(/[.*+?^${}()|[\]\\]/g, '\\$&')).join('|')})`, 'gi');
    text.split(regex).forEach((part) => target.append(words.includes(normalize(part)) ? element('mark','gtco-mark',part) : document.createTextNode(part)));
    return target;
  }

  function addMeta(list, label, value, query, field) { const dt=element('dt','',label), dd=element('dd'); dd.append(highlighted(value,query,field)); list.append(dt,dd); }

  function makeCard(course, query) {
    const card=element('article','gtco-card'); card.style.setProperty('--gtco-color',course.color);
    const accent=element('div','gtco-card-accent'); accent.setAttribute('aria-hidden','true');
    const body=element('div','gtco-card-body'), top=element('div','gtco-card-top'), heading=element('h3','gtco-card-title'), link=element('a');
    link.href=course.href; link.append(highlighted(course.name,query,'name')); heading.append(link); top.append(heading);
    if (course.favoriteNode) { const favorite=element('div','gtco-favorite'); favorite.append(course.favoriteNode); top.append(favorite); }
    const meta=element('dl','gtco-meta');
    if (course.nickname) addMeta(meta,'Nickname',course.nickname,query,'nickname');
    addMeta(meta,'Enrolled as',course.role,query,'role'); addMeta(meta,'Published',course.published,query,'published');
    body.append(top,meta,element('span','gtco-badge',course.section));
    if (settings.enrollmentCounts && course.id) body.append(makeEnrollmentCounts(course.id,course.section !== 'Current enrollment'));
    card.append(accent,body); return card;
  }

  function editDistance(a,b) {
    const row=Array.from({length:b.length+1},(_,i)=>i);
    for (let i=1;i<=a.length;i++) { let previous=row[0]; row[0]=i; for (let j=1;j<=b.length;j++) { const old=row[j]; row[j]=Math.min(row[j]+1,row[j-1]+1,previous+(a[i-1]===b[j-1]?0:1)); previous=old; } }
    return row[b.length];
  }

  function suggestionFor(query,courses) {
    const vocabulary=new Set(courses.flatMap((course)=>course.search.split(' ')).filter((word)=>word.length>=4));
    const raw=query.trim().split(/\s+/); let changed=false;
    const corrected=raw.map((word)=>{
      if (word.includes(':') || word.startsWith('-') || word.includes('"')) return word;
      const normalized=normalize(word); if (!normalized || vocabulary.has(normalized)) return word;
      let best='',score=Infinity; vocabulary.forEach((candidate)=>{ const distance=editDistance(normalized,candidate); if(distance<score){score=distance;best=candidate;} });
      if (score<=Math.max(1,Math.floor(normalized.length/3))) { changed=true; return best; } return word;
    });
    return changed ? corrected.join(' ') : '';
  }

  function loadState() {
    let saved={};
    if (settings.rememberState) { try { saved=JSON.parse(localStorage.getItem(STATE_KEY) || '{}'); } catch (_) {} }
    if (settings.urlState) { const params=new URLSearchParams(location.search); if(params.has('q')) saved.query=params.get('q'); if(params.has('order')) saved.sort=params.get('order'); if(params.has('view')) saved.view=params.get('view'); if(params.has('filters')) saved.filters=params.get('filters').split(',').filter(Boolean); }
    return { query:'',sort:'newest',view:'cards',filters:[],collapsed:[],collapsedInitialized:false,...saved };
  }

  function enhanceCoursesPage() {
    if (document.getElementById('gtco-course-organizer')) return true;
    const tables=Array.from(document.querySelectorAll('table.course-list-table')); if(!tables.length)return false;
    const courses=readCourses(tables), state=loadState(), activeFilters=new Set(state.filters), collapsed=new Set(state.collapsed);
    const shell=element('section','gtco-shell'); shell.id='gtco-course-organizer'; shell.setAttribute('aria-label','Course organizer');
    const toolbar=element('div','gtco-toolbar'), searchLabel=element('label','gtco-field'); searchLabel.append(element('span','','Search courses'));
    const search=element('input','gtco-input'); search.type='search'; search.placeholder='Try: term:"summer 2025" discrete math'; search.setAttribute('aria-label','Search all courses'); search.value=state.query; searchLabel.append(search);
    const sortLabel=element('label','gtco-field'); sortLabel.append(element('span','','Order')); const sort=element('select','gtco-select');
    [['newest','Newest semester first'],['oldest','Oldest semester first'],['name','Course name A–Z']].forEach(([value,label])=>{const option=element('option','',label);option.value=value;sort.append(option);}); sort.value=state.sort; sortLabel.append(sort); toolbar.append(searchLabel,sortLabel);
    const actions=element('div','gtco-actions'), clear=element('button','gtco-button','Clear filters'), view=element('button','gtco-button'), share=element('button','gtco-button','Copy search link');
    clear.type=view.type=share.type='button'; actions.append(clear,view,share);
    const filters=element('div','gtco-filters'); filters.setAttribute('aria-label','Course filters');
    const filterDefs=[['current','Current'],['past','Past'],['future','Future'],['teacher','Teacher'],['student','Student'],['published','Published'],['favorite','Favorites']];
    const filterButtons=new Map(); filterDefs.forEach(([key,label])=>{const button=element('button','gtco-filter',label);button.type='button';button.dataset.filter=key;button.setAttribute('aria-pressed',String(activeFilters.has(key)));filterButtons.set(key,button);filters.append(button);});
    const summary=element('p','gtco-summary');summary.setAttribute('aria-live','polite');const results=element('div','gtco-results');shell.append(toolbar,actions,filters,summary,results);
    const first=tables[0].closest('.table-overflow-container')||tables[0];first.before(shell);
    tables.forEach((table)=>{const container=table.closest('.table-overflow-container')||table;container.classList.add('gtco-original');const previous=container.previousElementSibling;if(previous?.matches('h2,h3')||previous?.querySelector(':scope > h2,:scope > h3'))previous.classList.add('gtco-original');});

    function coursePassesFilters(course) {
      const sections=['current','past','future'].filter((key)=>activeFilters.has(key));
      const roles=['teacher','student'].filter((key)=>activeFilters.has(key));
      if(sections.length&&!sections.some((key)=>course.section.toLowerCase().startsWith(key)))return false;
      if(roles.length&&!roles.some((key)=>normalize(course.role).includes(key)))return false;
      if(activeFilters.has('published')&&!normalize(course.published).startsWith('yes'))return false;
      if(activeFilters.has('favorite')&&!course.favoriteNode?.querySelector('.icon-star:not(.icon-star-light)'))return false;
      return true;
    }

    function saveState() {
      const next={query:search.value.trim(),sort:sort.value,view:state.view,filters:[...activeFilters],collapsed:[...collapsed],collapsedInitialized:true};
      if(settings.rememberState)localStorage.setItem(STATE_KEY,JSON.stringify(next));
      if(settings.urlState){const url=new URL(location.href);['q','order','view','filters'].forEach((key)=>url.searchParams.delete(key));if(next.query)url.searchParams.set('q',next.query);if(next.sort!=='newest')url.searchParams.set('order',next.sort);if(next.view!=='cards')url.searchParams.set('view',next.view);if(next.filters.length)url.searchParams.set('filters',next.filters.join(','));history.replaceState(null,'',url);}
    }

    function updateView(){shell.classList.toggle('is-compact',state.view==='compact');view.textContent=state.view==='compact'?'Card view':'Compact view';}
    function render(){
      const query=search.value.trim();let filtered=courses.filter((course)=>matchesSearch(course,query)&&coursePassesFilters(course));const grouped=new Map();filtered.forEach((course)=>{if(!grouped.has(course.term))grouped.set(course.term,[]);grouped.get(course.term).push(course);});let groups=[...grouped.entries()];
      if(sort.value==='name')groups.sort(([a],[b])=>a.localeCompare(b));else{const direction=sort.value==='oldest'?1:-1;groups.sort(([a],[b])=>direction*(termRank(a)-termRank(b))||a.localeCompare(b));}
      results.replaceChildren();groups.forEach(([term,items])=>{items.sort((a,b)=>a.name.localeCompare(b.name));const section=element('section','gtco-term'),heading=element('button','gtco-term-heading');heading.type='button';heading.setAttribute('aria-expanded','true');heading.append(highlighted(term,query,'term'),element('span','gtco-count',`${items.length} ${items.length===1?'course':'courses'}`));const grid=element('div','gtco-grid');items.forEach((course)=>grid.append(makeCard(course,query)));const allPast=items.every((course)=>course.section==='Past enrollment');const shouldDefault=settings.collapsePast&&allPast&&!state.collapsedInitialized;if(collapsed.has(term)||shouldDefault){section.classList.add('is-collapsed');heading.setAttribute('aria-expanded','false');if(shouldDefault)collapsed.add(term);}heading.addEventListener('click',()=>{section.classList.toggle('is-collapsed');const closed=section.classList.contains('is-collapsed');heading.setAttribute('aria-expanded',String(!closed));closed?collapsed.add(term):collapsed.delete(term);state.collapsedInitialized=true;saveState();});section.append(heading,grid);results.append(section);});
      state.collapsedInitialized=true;summary.textContent=`Showing ${filtered.length} of ${courses.length} courses in ${groups.length} ${groups.length===1?'semester':'semesters'}.`;
      if(!filtered.length){const empty=element('div','gtco-empty','No courses match your search and filters.');const suggestion=suggestionFor(query,courses);if(suggestion){const line=element('div','gtco-suggestion','Did you mean '),button=element('button','',suggestion);button.type='button';button.addEventListener('click',()=>{search.value=suggestion;render();});line.append(button,'?');empty.append(line);}results.append(empty);}observeEnrollmentCounts(results);saveState();
    }

    filterButtons.forEach((button,key)=>button.addEventListener('click',()=>{activeFilters.has(key)?activeFilters.delete(key):activeFilters.add(key);button.setAttribute('aria-pressed',String(activeFilters.has(key)));render();}));
    clear.addEventListener('click',()=>{search.value='';activeFilters.clear();filterButtons.forEach((button)=>button.setAttribute('aria-pressed','false'));render();search.focus();});
    view.addEventListener('click',()=>{state.view=state.view==='compact'?'cards':'compact';updateView();saveState();});
    share.addEventListener('click',async()=>{saveState();try{await navigator.clipboard.writeText(location.href);share.textContent='Link copied';setTimeout(()=>share.textContent='Copy search link',1600);}catch(_){window.prompt('Copy this search link:',location.href);}});
    search.addEventListener('input',render);sort.addEventListener('change',render);document.addEventListener('keydown',(event)=>{if(event.key==='/'&&!/input|textarea|select/i.test(document.activeElement?.tagName)){event.preventDefault();search.focus();}});
    updateView();render();return true;
  }

  addStyles();registerSettingsMenu();
  if(location.pathname==='/'){
    addDashboardLink();enhanceDashboardCards();
    const observer=new MutationObserver(()=>{addDashboardLink();enhanceDashboardCards();});
    observer.observe(document.body,{childList:true,subtree:true});setTimeout(()=>observer.disconnect(),20000);
  }
  else if(location.pathname==='/courses')enhanceCoursesPage();
})();

// Student lookup is intentionally dashboard-only.  It uses the signed-in
// instructor's existing Canvas access and leaves student data in memory only.
(function () {
  'use strict';
  if (location.hostname !== 'gatech.instructure.com' || window.top !== window || location.pathname !== '/') return;

  const make = (tag, className, text) => {
    const node = document.createElement(tag);
    if (className) node.className = className;
    if (text !== undefined) node.textContent = text;
    return node;
  };
  const clean = (value) => String(value || '').replace(/\s+/g, ' ').trim();
  const normalize = (value) => clean(value).toLocaleLowerCase();
  const apiHeaders = { Accept: 'application/json' };

  const css = `
    .gtlu-panel{margin:0 0 1.25rem;border:1px solid #c8d5dc;border-radius:10px;background:#fff;color:#20323e;box-shadow:0 3px 12px rgba(22,51,69,.09);font-family:system-ui,-apple-system,BlinkMacSystemFont,"Segoe UI",sans-serif}.gtlu-launch{appearance:none;cursor:pointer;font:inherit}
    .gtlu-head{padding:1rem 1.15rem .85rem;border-radius:9px 9px 0 0;background:#003057;color:#fff}.gtlu-head h2{margin:0;font-size:1.2rem}.gtlu-head p{margin:.28rem 0 0;color:#d5eaf5;font-size:.86rem;line-height:1.4}
    .gtlu-form{display:flex;gap:.6rem;padding:.85rem 1rem;border-bottom:1px solid #d9e3e8;background:#f6fafc}.gtlu-input,.gtlu-select{flex:1;min-width:0;height:39px;padding:0 .7rem;border:1px solid #aabcc6;border-radius:6px;background:#fff;color:#20323e;font:400 .92rem system-ui,sans-serif}.gtlu-input:focus,.gtlu-select:focus{outline:3px solid rgba(0,105,168,.22);border-color:#0069a8}.gtlu-select{flex:0 1 250px}.gtlu-button{min-height:39px;padding:0 .85rem;border:1px solid #004f86;border-radius:6px;background:#005a9c;color:#fff;font:700 .84rem system-ui,sans-serif;cursor:pointer}.gtlu-button:hover,.gtlu-button:focus{background:#004778}.gtlu-button:disabled{cursor:wait;opacity:.68}
    .gtlu-status{min-height:1.2em;margin:.7rem 1rem;color:#526a76;font-size:.85rem}.gtlu-results{padding:0 1rem 1rem}.gtlu-list{display:grid;gap:.45rem;margin:0;padding:0;list-style:none}.gtlu-result{display:flex;align-items:center;justify-content:space-between;gap:.75rem;padding:.7rem .8rem;border:1px solid #d4e0e6;border-radius:7px;background:#fff}.gtlu-result:hover{background:#f5fafc}.gtlu-name{display:block;color:#20323e;font-weight:750}.gtlu-course{display:block;margin-top:.12rem;color:#5b707b;font-size:.8rem}.gtlu-result-actions{display:flex;flex-wrap:wrap;justify-content:end;gap:.4rem}.gtlu-view{flex:0 0 auto;border:1px solid #0069a8;border-radius:5px;background:#fff;color:#005a9c;font:700 .8rem system-ui,sans-serif;padding:.35rem .55rem;cursor:pointer}.gtlu-view:hover{background:#eaf5fa}.gtlu-detail{border-top:1px solid #d9e3e8;padding:1rem}.gtlu-detail-head{display:flex;align-items:start;justify-content:space-between;gap:1rem;margin-bottom:.65rem}.gtlu-detail h3{margin:0;color:#20323e;font-size:1.05rem}.gtlu-detail p{margin:.2rem 0;color:#586d78;font-size:.84rem}.gtlu-close{border:0;background:none;color:#005a9c;font:700 .83rem system-ui,sans-serif;cursor:pointer;text-decoration:underline}.gtlu-missing{width:100%;border-collapse:collapse;font-size:.86rem}.gtlu-missing th,.gtlu-missing td{padding:.55rem .45rem;border-bottom:1px solid #e0e8ec;text-align:left;vertical-align:top}.gtlu-missing th{color:#526873;font-size:.72rem;letter-spacing:.035em;text-transform:uppercase}.gtlu-missing a{color:#005a9c;font-weight:700;text-decoration:none}.gtlu-missing a:hover{text-decoration:underline}.gtlu-history-note{display:inline-block;margin-left:.4rem;padding:.12rem .38rem;border-radius:999px;background:#fff0c7;color:#6a4a00;font-size:.72rem;font-weight:800}.gtlu-empty{padding:.35rem 0;color:#526a76;font-size:.88rem}@media(max-width:620px){.gtlu-form{flex-direction:column}.gtlu-result{align-items:start;flex-direction:column}.gtlu-result-actions{justify-content:start}.gtlu-detail{overflow-x:auto}}
  `;

  function nextPage(linkHeader) {
    return String(linkHeader || '').split(',').find((part) => /rel="next"/.test(part))?.match(/<([^>]+)>/)?.[1] || '';
  }

  async function canvasPages(url) {
    const items = [];
    while (url) {
      const response = await fetch(url, { credentials: 'same-origin', headers: apiHeaders });
      if (!response.ok) throw new Error(`Canvas returned ${response.status}`);
      const page = await response.json();
      if (!Array.isArray(page)) throw new Error('Canvas returned an unexpected response');
      items.push(...page);
      url = nextPage(response.headers.get('Link'));
    }
    return items;
  }

  async function pooled(items, limit, work) {
    const results = [];
    let next = 0;
    async function worker() {
      while (next < items.length) {
        const index = next++;
        try { results.push(...await work(items[index])); } catch (_) { /* A course may not expose its roster to this role. */ }
      }
    }
    await Promise.all(Array.from({ length: Math.min(limit, items.length) }, worker));
    return results;
  }

  function currentCourse(course) {
    const now = Date.now();
    const start = Date.parse(course.start_at || course.term?.start_at || '');
    const end = Date.parse(course.end_at || course.term?.end_at || '');
    return (Number.isNaN(start) || start <= now) && (Number.isNaN(end) || end >= now);
  }

  let currentTeachingCoursesPromise;
  function currentTeachingCourses() {
    if (!currentTeachingCoursesPromise) currentTeachingCoursesPromise = (async () => {
      const [teacherCourses, taCourses] = await Promise.all(['teacher', 'ta'].map((role) =>
        canvasPages(`/api/v1/users/self/courses?enrollment_state=active&enrollment_type=${role}&include[]=term&per_page=100`)
      ));
      const courses = new Map();
      taCourses.forEach((course) => courses.set(String(course.id), course));
      teacherCourses.forEach((course) => courses.set(String(course.id), course));
      return [...courses.values()].filter((course) => !course.access_restricted_by_date && currentCourse(course));
    })();
    return currentTeachingCoursesPromise;
  }
  function termKey(course) { return String(course.term?.id || course.term?.name || 'no-term'); }
  function termLabel(course) { return course.term?.name || 'No term listed'; }

  function formatDate(value) {
    if (!value) return 'No due date';
    const date = new Date(value);
    return Number.isNaN(date.valueOf()) ? 'No due date' : date.toLocaleString(undefined, { dateStyle: 'medium', timeStyle: 'short' });
  }

  function install() {
    if (document.getElementById('gtlu-panel')) return true;
    const content = document.querySelector('#content, #wrapper, main');
    const dashboardHeader = content?.querySelector('.ic-Dashboard-header');
    const dashboardActions = dashboardHeader?.querySelector('.ic-Dashboard-header__actions');
    if (!content || !dashboardHeader || !dashboardActions) return false;
    const style = make('style'); style.id = 'gtlu-styles'; style.textContent = css; document.head.append(style);
    const panel = make('section', 'gtlu-panel'); panel.id = 'gtlu-panel'; panel.setAttribute('aria-label', 'Student lookup');
    const head = make('header', 'gtlu-head'); head.append(make('h2', '', 'Student lookup'), make('p', '', 'Search your active Canvas course rosters, then review assignments Canvas marks as missing.'));
    const form = make('form', 'gtlu-form');
    const input = make('input', 'gtlu-input'); input.type = 'search'; input.placeholder = 'Student name'; input.autocomplete = 'off'; input.setAttribute('aria-label', 'Student name');
    const termSelect = make('select', 'gtlu-select'); termSelect.disabled = true; termSelect.setAttribute('aria-label', 'Course term'); const loadingTerm = make('option', '', 'Loading course terms…'); loadingTerm.value = ''; termSelect.append(loadingTerm);
    const search = make('button', 'gtlu-button', 'Search'); search.type = 'submit'; form.append(input, termSelect, search);
    const status = make('p', 'gtlu-status'); status.setAttribute('aria-live', 'polite');
    const results = make('div', 'gtlu-results');
    panel.hidden = true;
    panel.append(head, form, status, results);
    // Keep Canvas's dashboard header and its action buttons (including the
    // organizer's All courses button) as the first, unobstructed element.
    // Prepending to #content can place a full-width panel over that header in
    // some Canvas themes.
    dashboardHeader.after(panel);
    const launch = make('button', 'gtco-all-courses-link gtlu-launch', 'Student lookup');
    launch.type = 'button'; launch.setAttribute('aria-expanded', 'false'); launch.setAttribute('aria-controls', 'gtlu-panel');
    const allCourses = dashboardActions.querySelector('.gtco-dashboard-link');
    if (allCourses) allCourses.after(launch);
    else dashboardActions.append(launch);
    launch.addEventListener('click', () => {
      panel.hidden = !panel.hidden;
      launch.setAttribute('aria-expanded', String(!panel.hidden));
      if (!panel.hidden) input.focus();
    });

    currentTeachingCourses().then((courses) => {
      termSelect.replaceChildren(); const all = make('option', '', 'All current terms'); all.value = ''; termSelect.append(all);
      const terms = new Map(); courses.forEach((course) => { if (!terms.has(termKey(course))) terms.set(termKey(course), termLabel(course)); });
      [...terms.entries()].sort(([, left], [, right]) => right.localeCompare(left)).forEach(([key, label]) => { const option = make('option', '', label); option.value = key; termSelect.append(option); });
      termSelect.disabled = false;
    }).catch(() => { loadingTerm.textContent = 'Course terms unavailable'; });

    function clearDetail() { results.querySelector('.gtlu-detail')?.remove(); }
    function showDetail(student, row) {
      clearDetail();
      const detail = make('section', 'gtlu-detail'); detail.setAttribute('aria-live', 'polite');
      const detailHead = make('div', 'gtlu-detail-head');
      const title = make('div'); title.append(make('h3', '', `${student.name} — ${student.course.name}`), make('p', '', 'Loading assignments Canvas marks as missing…'));
      const close = make('button', 'gtlu-close', 'Close'); close.type = 'button'; close.addEventListener('click', () => detail.remove()); detailHead.append(title, close); detail.append(detailHead); row.after(detail);
      const params = new URLSearchParams({ 'student_ids[]': String(student.id), 'include[]': 'assignment', per_page: '100' });
      canvasPages(`/api/v1/courses/${encodeURIComponent(student.course.id)}/students/submissions?${params}`)
        .then((submissions) => {
          const missing = submissions.filter((submission) => submission.missing === true);
          title.lastChild.textContent = missing.length ? `${missing.length} assignment${missing.length === 1 ? '' : 's'} marked missing by Canvas.` : 'Canvas does not currently mark any assignments as missing.';
          if (!missing.length) return;
          const table = make('table', 'gtlu-missing');
          const thead = make('thead'); const header = make('tr'); ['Assignment', 'Due', 'Status'].forEach((label) => header.append(make('th', '', label))); thead.append(header);
          const body = make('tbody');
          missing.sort((a, b) => String(a.assignment?.due_at || '').localeCompare(String(b.assignment?.due_at || ''))).forEach((submission) => {
            const assignment = submission.assignment || {};
            const tr = make('tr'); const assignmentCell = make('td'); const link = make('a', '', assignment.name || 'Untitled assignment');
            link.href = `/courses/${encodeURIComponent(student.course.id)}/assignments/${encodeURIComponent(assignment.id || submission.assignment_id)}`; assignmentCell.append(link);
            tr.append(assignmentCell, make('td', '', formatDate(assignment.due_at)), make('td', '', submission.late ? 'Missing · late' : 'Missing')); body.append(tr);
          });
          table.append(thead, body); detail.append(table);
        })
        .catch(() => { title.lastChild.textContent = 'Canvas could not load this student’s submission status for this course.'; });
    }

    form.addEventListener('submit', async (event) => {
      event.preventDefault(); clearDetail();
      const term = clean(input.value);
      if (term.length < 2) { status.textContent = 'Enter at least two characters of the student’s name.'; results.replaceChildren(); return; }
      search.disabled = true; results.replaceChildren(); status.textContent = 'Loading your active courses…';
      try {
        const courses = await currentTeachingCourses();
        const searchable = courses.filter((course) => !termSelect.value || termKey(course) === termSelect.value);
        const selectedTerm = termSelect.value ? termSelect.selectedOptions[0]?.textContent : 'all current terms';
        status.textContent = `Searching ${searchable.length} ${selectedTerm} Instructor/TA course roster${searchable.length === 1 ? '' : 's'}…`;
        // Canvas's roster search can treat a multi-word name as one phrase.
        // Search each word and retain students who match every word, so a
        // lookup such as "David Matthews" also finds "David Thomas Matthews".
        const nameParts = [...new Set(normalize(term).split(/\s+/).filter(Boolean))];
        const matches = await pooled(searchable, 5, async (course) => {
          const userLists = await Promise.all(nameParts.map((part) =>
            canvasPages(`/api/v1/courses/${encodeURIComponent(course.id)}/users?search_term=${encodeURIComponent(part)}&include[]=enrollments&enrollment_type[]=student&enrollment_state[]=active&enrollment_state[]=inactive&enrollment_state[]=completed&per_page=100`)
          ));
          const matchingIds = userLists.reduce((ids, users) => {
            const currentIds = new Set(users.map((user) => String(user.id)));
            return ids ? new Set([...ids].filter((id) => currentIds.has(id))) : currentIds;
          }, null);
          return userLists[0]
            .filter((user) => matchingIds?.has(String(user.id)) && nameParts.every((part) => normalize(user.name).includes(part)))
            .map((user) => {
              const enrollments = Array.isArray(user.enrollments) ? user.enrollments : [];
              const enrollment = enrollments.find((item) => String(item.course_id) === String(course.id) && /student/i.test(String(item.type || item.role || ''))) || enrollments.find((item) => String(item.course_id) === String(course.id));
              return { id: user.id, name: user.name || 'Unnamed student', loginId: user.login_id || '', enrollmentState: enrollment?.enrollment_state || 'active', sectionId: enrollment?.course_section_id || '', course };
            });
        });
        const unique = new Map(); matches.forEach((match) => unique.set(`${match.course.id}:${match.id}`, match));
        const found = [...unique.values()].sort((left, right) => left.name.localeCompare(right.name) || left.course.name.localeCompare(right.course.name));
        const sectionNames = new Map();
        await pooled([...new Map(found.map((student) => [String(student.course.id), student.course])).values()], 5, async (course) => {
          const sections = await canvasPages(`/api/v1/courses/${encodeURIComponent(course.id)}/sections?per_page=100`);
          sections.forEach((section) => sectionNames.set(`${course.id}:${section.id}`, section.name));
          return [];
        });
        found.forEach((student) => { student.section = sectionNames.get(`${student.course.id}:${student.sectionId}`) || 'Section not available'; });
        status.textContent = found.length ? `${found.length} matching enrollment${found.length === 1 ? '' : 's'} found.` : 'No matching students were found in your active course rosters.';
        if (!found.length) return;
        const list = make('ul', 'gtlu-list');
        found.forEach((student) => {
          const item = make('li', 'gtlu-result'); const info = make('div');
          const stateLabel = student.enrollmentState === 'inactive' ? 'Inactive enrollment' : student.enrollmentState === 'completed' ? 'Completed enrollment' : '';
          info.append(make('span', 'gtlu-name', student.name), make('span', 'gtlu-course', `${student.course.name || `Course ${student.course.id}`} · Section: ${student.section}${stateLabel ? ` · ${stateLabel}` : ''}`));
          const view = make('button', 'gtlu-view', 'View missing work'); view.type = 'button'; view.addEventListener('click', () => showDetail(student, item)); item.append(info, view); list.append(item);
        });
        results.append(list);
      } catch (_) {
        status.textContent = 'Canvas could not load your active courses. Refresh the page and try again.';
      } finally { search.disabled = false; }
    });
    return true;
  }

  if (!install()) {
    const observer = new MutationObserver(() => { if (install()) observer.disconnect(); });
    observer.observe(document.documentElement, { childList: true, subtree: true });
    setTimeout(() => observer.disconnect(), 20000);
  }
})();

// Roster-wide repeat-enrollment report.  This intentionally runs only when
// requested because it reads the rosters for the instructor's relevant past
// courses as well as current courses.
(function () {
  'use strict';
  if (location.hostname !== 'gatech.instructure.com' || window.top !== window || location.pathname !== '/') return;

  const make = (tag, className, text) => { const node = document.createElement(tag); if (className) node.className = className; if (text !== undefined) node.textContent = text; return node; };
  const apiHeaders = { Accept: 'application/json' };
  const css = `
    .gtcr-panel{margin:0 0 1.25rem;border:1px solid #c8d5dc;border-radius:10px;background:#fff;color:#20323e;box-shadow:0 3px 12px rgba(22,51,69,.09);font-family:system-ui,-apple-system,BlinkMacSystemFont,"Segoe UI",sans-serif}.gtcr-panel[hidden]{display:none!important}.gtcr-head{display:flex;align-items:start;justify-content:space-between;gap:1rem;padding:1rem 1.15rem .85rem;border-radius:9px 9px 0 0;background:#003057;color:#fff}.gtcr-head h2{margin:0;font-size:1.2rem}.gtcr-head p{margin:.28rem 0 0;color:#d5eaf5;font-size:.86rem;line-height:1.4}.gtcr-close{border:0;background:none;color:#d5eaf5;font:700 .83rem system-ui,sans-serif;cursor:pointer;text-decoration:underline}.gtcr-status{min-height:1.2em;margin:.8rem 1rem;color:#526a76;font-size:.86rem}.gtcr-results{padding:0 1rem 1rem}.gtcr-filters{display:flex;flex-wrap:wrap;gap:.65rem;margin:0 0 .8rem}.gtcr-field{display:flex;flex:1 1 190px;flex-direction:column;gap:.25rem;color:#526873;font-size:.7rem;font-weight:800;letter-spacing:.045em;text-transform:uppercase}.gtcr-select{height:36px;padding:0 .55rem;border:1px solid #aabcc6;border-radius:6px;background:#fff;color:#20323e;font:400 .86rem system-ui,sans-serif}.gtcr-export{align-self:end;height:36px;padding:0 .7rem;border:1px solid #004f86;border-radius:6px;background:#005a9c;color:#fff;font:700 .8rem system-ui,sans-serif;cursor:pointer}.gtcr-export:hover{background:#004778}.gtcr-table{width:100%;border-collapse:collapse;font-size:.86rem}.gtcr-table th,.gtcr-table td{padding:.58rem .45rem;border-bottom:1px solid #e0e8ec;text-align:left;vertical-align:top}.gtcr-table th{color:#526873;font-size:.72rem;letter-spacing:.035em;text-transform:uppercase}.gtcr-course{display:block;color:#20323e;font-weight:750}.gtcr-term{display:block;margin-top:.12rem;color:#5b707b;font-size:.79rem}.gtcr-identifier{display:block;margin-top:.12rem;color:#526b77;font-size:.76rem;overflow-wrap:anywhere}.gtcr-score,.gtcr-section,.gtcr-withdrew{display:block;margin-top:.2rem;color:#0b5a75;font-size:.78rem;font-weight:750}.gtcr-section{color:#536b77;font-weight:650}.gtcr-withdrew{color:#9b3b18}.gtcr-risk{display:inline-block;padding:.2rem .45rem;border-radius:999px;font-size:.76rem;font-weight:800}.gtcr-risk-at-risk{background:#fde4dc;color:#943616}.gtcr-risk-watch{background:#fff0c7;color:#6a4a00}.gtcr-prior+.gtcr-prior{margin-top:.55rem;padding-top:.55rem;border-top:1px solid #e0e8ec}.gtcr-empty{padding:.35rem 0;color:#526a76;font-size:.88rem}@media(max-width:720px){.gtcr-results{overflow-x:auto}.gtcr-table{min-width:900px}}
  `;

  function nextPage(linkHeader) { return String(linkHeader || '').split(',').find((part) => /rel="next"/.test(part))?.match(/<([^>]+)>/)?.[1] || ''; }
  async function canvasPages(url) {
    const items = [];
    while (url) {
      const response = await fetch(url, { credentials: 'same-origin', headers: apiHeaders });
      if (!response.ok) throw new Error(`Canvas returned ${response.status}`);
      const page = await response.json();
      if (!Array.isArray(page)) throw new Error('Canvas returned an unexpected response');
      items.push(...page); url = nextPage(response.headers.get('Link'));
    }
    return items;
  }
  async function pooled(items, limit, work) {
    const results = []; let next = 0;
    async function worker() { while (next < items.length) { const item = items[next++]; try { results.push(...await work(item)); } catch (_) { /* Canvas may limit a historical roster. */ } } }
    await Promise.all(Array.from({ length: Math.min(limit, items.length) }, worker)); return results;
  }
  function courseNumber(course) {
    const value = String(course.course_code || course.name || '');
    const match = value.match(/\b([A-Za-z]{2,8})\s*[- ]?\s*(\d{3,4}[A-Za-z]?)\b/);
    return match ? `${match[1].toUpperCase()} ${match[2].toUpperCase()}` : '';
  }
  function courseDate(course) { return course.end_at || course.term?.end_at || course.start_at || course.term?.start_at || course.created_at || ''; }
  function inLastFourYears(course, cutoff) { const value = new Date(courseDate(course)); return !Number.isNaN(value.valueOf()) && value >= cutoff; }
  function courseLabel(course) { return course.course_code ? `${course.course_code} — ${course.name || 'Untitled course'}` : (course.name || `Course ${course.id}`); }
  function courseTerm(course) { return course.term?.name || (courseDate(course) ? new Date(courseDate(course)).toLocaleDateString(undefined, { month: 'short', year: 'numeric' }) : 'Term not listed'); }
  async function myTeachingCourses(enrollmentState) {
    const [teacherCourses, taCourses] = await Promise.all(['teacher', 'ta'].map((role) => canvasPages(`/api/v1/users/self/courses?enrollment_state=${encodeURIComponent(enrollmentState)}&enrollment_type=${role}&include[]=term&per_page=100`)));
    const courses = new Map();
    taCourses.forEach((course) => courses.set(String(course.id), { ...course, _gtcrRole: 'TA' }));
    teacherCourses.forEach((course) => courses.set(String(course.id), { ...course, _gtcrRole: 'Instructor' }));
    return [...courses.values()];
  }
  function studentEnrollment(user, courseId) {
    const enrollments = Array.isArray(user.enrollments) ? user.enrollments : [];
    return enrollments.find((item) => String(item.course_id) === String(courseId) && /student/i.test(String(item.type || item.role || ''))) || enrollments.find((item) => String(item.course_id) === String(courseId));
  }
  function finalScore(user, courseId) {
    const enrollment = studentEnrollment(user, courseId);
    const score = enrollment?.computed_final_score ?? enrollment?.grades?.final_score;
    if (score === null || score === undefined || score === '') return 'Final score not available';
    const numeric = Number(score);
    return Number.isFinite(numeric) ? `Final score: ${numeric}%` : `Final score: ${score}`;
  }

  function install() {
    if (document.getElementById('gtcr-panel')) return true;
    const content = document.querySelector('#content, #wrapper, main');
    const header = content?.querySelector('.ic-Dashboard-header');
    const actions = header?.querySelector('.ic-Dashboard-header__actions');
    if (!content || !header || !actions) return false;
    const style = make('style'); style.id = 'gtcr-styles'; style.textContent = css; document.head.append(style);
    const panel = make('section', 'gtcr-panel'); panel.id = 'gtcr-panel'; panel.hidden = true; panel.setAttribute('aria-label', 'Repeat enrollments');
    const panelHead = make('header', 'gtcr-head'); const title = make('div'); title.append(make('h2', '', 'Repeat enrollments'), make('p', '', 'Students in your active courses who previously took the same course number with you during the last four years.'));
    const close = make('button', 'gtcr-close', 'Close'); close.type = 'button'; panelHead.append(title, close);
    const status = make('p', 'gtcr-status'); status.setAttribute('aria-live', 'polite'); const results = make('div', 'gtcr-results'); panel.append(panelHead, status, results); header.after(panel);
    const launch = make('button', 'gtco-all-courses-link gtlu-launch', 'Repeat enrollments'); launch.type = 'button'; launch.setAttribute('aria-expanded', 'false'); launch.setAttribute('aria-controls', 'gtcr-panel');
    const lookupButton = actions.querySelector('.gtlu-launch'); if (lookupButton) lookupButton.after(launch); else actions.append(launch);
    close.addEventListener('click', () => { panel.hidden = true; launch.setAttribute('aria-expanded', 'false'); });

    async function runReport() {
      results.replaceChildren(); status.textContent = 'Loading your active and completed courses…';
      const cutoff = new Date(); cutoff.setFullYear(cutoff.getFullYear() - 4);
      try {
        const [activeCourses, completedCourses] = await Promise.all([myTeachingCourses('active'), myTeachingCourses('completed')]);
        const current = activeCourses.filter((course) => !course.access_restricted_by_date && courseNumber(course));
        // Canvas can expose the same shell course in both lists when an
        // instructor has overlapping enrollment records.  An active course is
        // never a student's prior attempt, even if Canvas also calls it
        // completed for one enrollment.
        const activeCourseIds = new Set(current.map((course) => String(course.id)));
        const historic = completedCourses.filter((course) => !activeCourseIds.has(String(course.id)) && courseNumber(course) && inLastFourYears(course, cutoff));
        const historicByNumber = new Map(); historic.forEach((course) => { const number = courseNumber(course); if (!historicByNumber.has(number)) historicByNumber.set(number, []); historicByNumber.get(number).push(course); });
        const comparableCurrent = current.filter((course) => historicByNumber.has(courseNumber(course)));
        if (!comparableCurrent.length) { status.textContent = 'No active course numbers also appear in your completed courses from the last four years.'; return; }
        status.textContent = `Reading ${comparableCurrent.length} current roster${comparableCurrent.length === 1 ? '' : 's'}…`;
        const currentEnrollments = await pooled(comparableCurrent, 5, async (course) => {
          const [users, sections] = await Promise.all([
            canvasPages(`/api/v1/courses/${encodeURIComponent(course.id)}/users?include[]=enrollments&enrollment_type[]=student&enrollment_state[]=active&per_page=100`),
            canvasPages(`/api/v1/courses/${encodeURIComponent(course.id)}/sections?per_page=100`).catch(() => []),
          ]);
          const sectionNames = new Map(sections.map((section) => [String(section.id), section.name]));
          return users.map((user) => { const enrollment = studentEnrollment(user, course.id); return { user, course, section: sectionNames.get(String(enrollment?.course_section_id)) || 'Section not available' }; });
        });
        // Only load a prior roster when its course number exists in this
        // semester's roster.  A four-year history can contain many unrelated
        // courses, and none of those can produce a repeat enrollment here.
        const relevantNumbers = new Set(comparableCurrent.map((course) => courseNumber(course)));
        const historicCourses = [...new Map(
          [...relevantNumbers].flatMap((number) => historicByNumber.get(number) || []).map((course) => [String(course.id), course])
        ).values()];
        status.textContent = `Comparing against ${historicCourses.length} prior course roster${historicCourses.length === 1 ? '' : 's'}…`;
        const priorRosters = new Map();
        await pooled(historicCourses, 5, async (course) => {
          const [enrollments, sections] = await Promise.all([
            canvasPages(`/api/v1/courses/${encodeURIComponent(course.id)}/enrollments?type[]=StudentEnrollment&state[]=active&state[]=completed&state[]=inactive&state[]=deleted&include[]=user&per_page=100`),
            canvasPages(`/api/v1/courses/${encodeURIComponent(course.id)}/sections?per_page=100`).catch(() => []),
          ]);
          const sectionNames = new Map(sections.map((section) => [String(section.id), section.name]));
          const priorRoster = new Map();
          enrollments.forEach((enrollment) => {
            const userId = String(enrollment.user_id || enrollment.user?.id || '');
            if (!userId) return;
            const state = String(enrollment.enrollment_state || enrollment.workflow_state || enrollment.state || '').toLowerCase();
            const score = enrollment.computed_final_score ?? enrollment.grades?.final_score;
            const finalScoreText = score === null || score === undefined || score === '' ? 'Final score not available' : (Number.isFinite(Number(score)) ? `Final score: ${Number(score)}%` : `Final score: ${score}`);
            const numericScore = score === null || score === undefined || score === '' || !Number.isFinite(Number(score)) ? null : Number(score);
            priorRoster.set(userId, { finalScore: finalScoreText, finalScoreNumber: numericScore, section: sectionNames.get(String(enrollment.course_section_id)) || 'Section not available', withdrew: state === 'inactive' || state === 'deleted' });
          });
          priorRosters.set(String(course.id), priorRoster); return [];
        });
        const records = [];
        currentEnrollments.forEach(({ user, course, section }) => {
          (historicByNumber.get(courseNumber(course)) || []).forEach((prior) => {
            const priorRoster = priorRosters.get(String(prior.id));
            if (String(prior.id) !== String(course.id) && priorRoster?.has(String(user.id))) { const priorRecord = priorRoster.get(String(user.id)); records.push({ user, course, prior, currentSection: section, finalScore: priorRecord.finalScore, finalScoreNumber: priorRecord.finalScoreNumber, section: priorRecord.section, withdrew: priorRecord.withdrew }); }
          });
        });
        records.sort((left, right) => String(left.user.name).localeCompare(String(right.user.name)) || courseLabel(left.course).localeCompare(courseLabel(right.course)) || courseDate(right.prior).localeCompare(courseDate(left.prior)));
        const grouped = new Map();
        records.forEach((record) => {
          const key = `${record.user.id}:${record.course.id}`;
          if (!grouped.has(key)) grouped.set(key, { user: record.user, course: record.course, currentSection: record.currentSection, priors: [] });
          const group = grouped.get(key);
          if (!group.priors.some(({ course }) => String(course.id) === String(record.prior.id))) group.priors.push({ course: record.prior, finalScore: record.finalScore, finalScoreNumber: record.finalScoreNumber, section: record.section, withdrew: record.withdrew });
        });
        const groups = [...grouped.values()];
        groups.forEach((group) => { const withdrawalCount = group.priors.filter((prior) => prior.withdrew).length; const priorFailure = group.priors.some((prior) => prior.finalScoreNumber !== null && prior.finalScoreNumber < 70); group.risk = priorFailure || withdrawalCount >= 2 ? 'At risk' : withdrawalCount === 1 ? 'Watch' : 'Not flagged'; });
        const flaggedGroups = groups.filter((group) => group.risk !== 'Not flagged');
        const atRiskCount = flaggedGroups.filter((group) => group.risk === 'At risk').length, watchCount = flaggedGroups.filter((group) => group.risk === 'Watch').length;
        status.textContent = flaggedGroups.length ? `${atRiskCount} at risk and ${watchCount} watch student-course repeat${flaggedGroups.length === 1 ? '' : 's'} found.` : 'No students match the at-risk or watch criteria.';
        if (!flaggedGroups.length) return;
        const filters = make('div', 'gtcr-filters');
        const currentField = make('label', 'gtcr-field', 'Current course'); const currentSelect = make('select', 'gtcr-select'); currentSelect.append(make('option', '', 'All current courses')); currentSelect.options[0].value = ''; currentField.append(currentSelect);
        const semesterField = make('label', 'gtcr-field', 'Previous semester'); const semesterSelect = make('select', 'gtcr-select'); semesterSelect.append(make('option', '', 'All previous semesters')); semesterSelect.options[0].value = ''; semesterField.append(semesterSelect);
        const riskField = make('label', 'gtcr-field', 'Risk level'); const riskSelect = make('select', 'gtcr-select'); [['', 'All flagged students'], ['At risk', 'At risk'], ['Watch', 'Watch']].forEach(([value, label]) => { const option = make('option', '', label); option.value = value; riskSelect.append(option); }); riskField.append(riskSelect);
        const exportButton = make('button', 'gtcr-export', 'Export Excel'); exportButton.type = 'button'; filters.append(currentField, semesterField, riskField, exportButton);
        [...new Map(flaggedGroups.map(({ course }) => [String(course.id), course])).values()].sort((a, b) => courseLabel(a).localeCompare(courseLabel(b))).forEach((course) => { const option = make('option', '', courseLabel(course)); option.value = String(course.id); currentSelect.append(option); });
        [...new Set(flaggedGroups.flatMap((group) => group.priors.map(({ course }) => courseTerm(course))))].sort((a, b) => b.localeCompare(a)).forEach((term) => { const option = make('option', '', term); option.value = term; semesterSelect.append(option); });
        const table = make('table', 'gtcr-table'); const thead = make('thead'); const heading = make('tr'); ['Student', 'Identifiers', 'Risk', 'Current course', 'Previous course'].forEach((label) => heading.append(make('th', '', label))); thead.append(heading); const body = make('tbody');
        flaggedGroups.forEach(({ user, course, currentSection, priors, risk }) => { const row = make('tr'); row.dataset.userId = String(user.id); row.dataset.currentCourse = String(course.id); row.dataset.risk = risk; row.dataset.role = course._gtcrRole || 'Instructor'; row.dataset.email = user.email || ''; row.dataset.gtid = user.sis_user_id || ''; row.dataset.loginId = user.login_id || ''; row.append(make('td', '', user.name || 'Unnamed student'), make('td', '', ''), make('td', '', '')); row.cells[1].append(make('span', 'gtcr-identifier', `Email: ${user.email || 'Not available'}`), make('span', 'gtcr-identifier', `GTID: ${user.sis_user_id || 'Not available'}`), make('span', 'gtcr-identifier', `Login: ${user.login_id || 'Not available'}`)); row.cells[2].append(make('span', `gtcr-risk gtcr-risk-${risk.toLowerCase().replace(/\s+/g, '-')}`, risk)); const currentCell = make('td'); currentCell.append(make('span', 'gtcr-course', courseLabel(course)), make('span', 'gtcr-term', courseTerm(course)), make('span', 'gtcr-section', `Section: ${currentSection}`), make('span', 'gtcr-identifier', `Your role: ${course._gtcrRole || 'Instructor'}`)); const priorCell = make('td'); priors.forEach(({ course: prior, finalScore: score, section, withdrew }) => { const entry = make('div', 'gtcr-prior'); entry.dataset.priorTerm = courseTerm(prior); entry.append(make('span', 'gtcr-course', courseLabel(prior)), make('span', 'gtcr-term', courseTerm(prior)), make('span', 'gtcr-section', `Section: ${section}`), ...(withdrew ? [make('span', 'gtcr-withdrew', 'Withdrew')] : []), make('span', 'gtcr-score', score)); priorCell.append(entry); }); row.append(currentCell, priorCell); body.append(row); });
        function applyFilters() {
          let visible = 0;
          [...body.rows].forEach((row) => { const courseMatches = !currentSelect.value || row.dataset.currentCourse === currentSelect.value; const riskMatches = !riskSelect.value || row.dataset.risk === riskSelect.value; let priorMatches = 0; row.querySelectorAll('.gtcr-prior').forEach((entry) => { const matches = !semesterSelect.value || entry.dataset.priorTerm === semesterSelect.value; entry.hidden = !matches; if (matches) priorMatches++; }); row.hidden = !courseMatches || !riskMatches || !priorMatches; if (!row.hidden) visible++; });
          status.textContent = `Showing ${visible} of ${flaggedGroups.length} flagged student-course repeat${flaggedGroups.length === 1 ? '' : 's'}.`;
        }
        exportButton.addEventListener('click', () => {
          if (typeof XLSX === 'undefined') { status.textContent = 'The Excel export library did not load. Refresh Canvas and try again.'; return; }
          const exportRecords = [...body.rows].filter((row) => !row.hidden).map((row) => {
            const student = row.cells[0].textContent.trim(), risk = row.dataset.risk || '';
            const currentCourse = row.cells[3].querySelector('.gtcr-course')?.textContent.trim() || '';
            const currentTerm = row.cells[3].querySelector('.gtcr-term')?.textContent.trim() || '', currentSection = row.cells[3].querySelector('.gtcr-section')?.textContent.replace(/^Section:\s*/, '').trim() || '', currentRole = row.dataset.role || '';
            const priors = [...row.querySelectorAll('.gtcr-prior')].filter((prior) => !prior.hidden).map((prior) => ({ course: prior.querySelector('.gtcr-course')?.textContent.trim() || '', semester: prior.querySelector('.gtcr-term')?.textContent.trim() || '', section: prior.querySelector('.gtcr-section')?.textContent.replace(/^Section:\s*/, '').trim() || '', withdrew: prior.querySelector('.gtcr-withdrew') ? 'Yes' : 'No', finalScore: prior.querySelector('.gtcr-score')?.textContent.replace(/^Final score:\s*/, '').trim() || '' }));
            return { studentId: row.dataset.userId || student, student, email: row.dataset.email || '', gtid: row.dataset.gtid || '', loginId: row.dataset.loginId || '', risk, currentCourse, currentTerm, currentSection, currentRole, priors };
          });
          if (!exportRecords.length) { status.textContent = 'There are no visible results to export.'; return; }
          const students = new Map();
          exportRecords.forEach((record) => {
            if (!students.has(record.studentId)) students.set(record.studentId, { ...record, currentCourses: [], priors: [] });
            const student = students.get(record.studentId);
            student.currentCourses.push(`${record.currentCourse} (${record.currentTerm}, ${record.currentSection}, ${record.currentRole})`);
            student.priors.push(...record.priors);
            if (record.risk === 'At risk') student.risk = 'At risk';
          });
          const studentRows = [...students.values()].sort((left, right) => left.student.localeCompare(right.student)).map((student) => ({
            Student: student.student,
            Email: student.email,
            GTID: student.gtid,
            'Canvas login': student.loginId,
            'Risk level': student.risk,
            'Current courses': [...new Set(student.currentCourses)].join('; '),
            '# prior courses failed (<70%)': student.priors.filter((prior) => { const score = Number.parseFloat(prior.finalScore); return Number.isFinite(score) && score < 70; }).length,
            '# prior withdrawals': student.priors.filter((prior) => prior.withdrew === 'Yes').length,
            '# repeated attempts': student.priors.length,
          }));
          const courseRows = exportRecords.flatMap((record) => record.priors.map((prior, index) => ({ Student: record.student, Email: record.email, GTID: record.gtid, 'Canvas login': record.loginId, 'Risk level': record.risk, 'Current course': record.currentCourse, 'Current semester': record.currentTerm, 'Current section': record.currentSection, 'Your role': record.currentRole, 'Previous attempt': index + 1, 'Previous course': prior.course, 'Previous semester': prior.semester, 'Previous section': prior.section, Withdrew: prior.withdrew, 'Canvas final score': prior.finalScore })));
          const riskSummary = ['At risk', 'Watch'].map((risk) => {
            const items = exportRecords.filter((record) => record.risk === risk), priors = items.flatMap((record) => record.priors);
            return [risk, items.length, new Set(items.map((record) => record.studentId)).size, priors.length, priors.filter((prior) => prior.withdrew === 'Yes').length, priors.filter((prior) => { const score = Number.parseFloat(prior.finalScore); return Number.isFinite(score) && score < 70; }).length];
          });
          const coursePart = currentSelect.value ? currentSelect.selectedOptions[0]?.textContent : 'All current courses', riskPart = riskSelect.value || 'All flagged students', exportedAt = new Date();
          const summaryRows = [['Repeat-enrollment risk summary'], ['Exported', exportedAt.toLocaleString()], ['Current course filter', coursePart], ['Risk filter', riskPart], [], ['Risk level', 'Student-course rows', 'Unique students', 'Prior attempts', 'Withdrawals', 'Prior scores below 70%'], ...riskSummary];
          const workbook = XLSX.utils.book_new();
          const summarySheet = XLSX.utils.aoa_to_sheet(summaryRows), courseSheet = XLSX.utils.json_to_sheet(courseRows), studentSheet = XLSX.utils.json_to_sheet(studentRows);
          summarySheet['!cols'] = [{ wch: 25 }, { wch: 20 }, { wch: 18 }, { wch: 18 }, { wch: 14 }, { wch: 24 }];
          courseSheet['!cols'] = Object.keys(courseRows[0]).map((key) => ({ wch: Math.max(14, Math.min(34, key.length + 4)) }));
          studentSheet['!cols'] = Object.keys(studentRows[0]).map((key) => ({ wch: Math.max(14, Math.min(34, key.length + 4)) }));
          XLSX.utils.book_append_sheet(workbook, summarySheet, 'Risk Summary'); XLSX.utils.book_append_sheet(workbook, courseSheet, 'Course Attempts'); XLSX.utils.book_append_sheet(workbook, studentSheet, 'Student Summary');
          const filenamePart = (value) => String(value || '').toLowerCase().replace(/[^a-z0-9]+/g, '-').replace(/^-+|-+$/g, '') || 'all';
          XLSX.writeFile(workbook, `canvas-repeat-enrollments-${filenamePart(coursePart)}-${filenamePart(riskPart)}-${exportedAt.toISOString().slice(0, 10)}.xlsx`, { compression: true });
        });
        currentSelect.addEventListener('change', applyFilters); semesterSelect.addEventListener('change', applyFilters); riskSelect.addEventListener('change', applyFilters);
        table.append(thead, body); results.append(filters, table); applyFilters();
      } catch (_) { status.textContent = 'Canvas could not complete the repeat-enrollment report. Refresh the page and try again.'; }
    }
    launch.addEventListener('click', () => { panel.hidden = false; launch.setAttribute('aria-expanded', 'true'); runReport(); });
    return true;
  }
  if (!install()) { const observer = new MutationObserver(() => { if (install()) observer.disconnect(); }); observer.observe(document.documentElement, { childList: true, subtree: true }); setTimeout(() => observer.disconnect(), 20000); }
})();

(function () {
  'use strict';
  if (location.hostname !== 'gatech.instructure.com' || window.top !== window) return;

  const courseId=location.pathname.match(/^\/courses\/(\d+)(?:\/|$)/)?.[1];
  if(!courseId)return;

  function addUndeleteLink(){
    const undeleteUrl=`/courses/${courseId}/undelete`;
    if(document.querySelector(`a[href="${undeleteUrl}"]`))return true;
    const navigation=[...document.querySelectorAll('#section-tabs, #course_navigation')].find((node)=>
      node.querySelector(`a[href^="/courses/${courseId}/"]`)
    );
    if(!navigation)return false;
    const peopleItem=[...navigation.querySelectorAll('a')].find((link)=>
      new URL(link.href,location.origin).pathname===`/courses/${courseId}/users`
    )?.closest('li');
    const sourceItem=peopleItem||[...navigation.querySelectorAll('a[href]')].map((link)=>link.closest('li')).find(Boolean);
    if(!sourceItem)return false;
    const item=sourceItem.cloneNode(true),link=item.querySelector('a');
    if(!link)return false;
    item.removeAttribute('id');item.classList.remove('active');
    item.querySelectorAll('[aria-current]').forEach((node)=>node.removeAttribute('aria-current'));
    link.href=undeleteUrl;link.textContent='Undelete';link.setAttribute('aria-label','Restore deleted course content');
    if(peopleItem)peopleItem.after(item);else navigation.append(item);
    return true;
  }

  if(!addUndeleteLink()){
    const observer=new MutationObserver(()=>{if(addUndeleteLink())observer.disconnect();});
    observer.observe(document.body,{childList:true,subtree:true});
    setTimeout(()=>observer.disconnect(),20000);
  }
})();

(function () {
  'use strict';
  if (location.hostname !== 'gatech.instructure.com' || window.top !== window || !/^\/courses\/\d+\/undelete(?:\/|$)/.test(location.pathname)) return;

  const make=(tag,className,text)=>{const node=document.createElement(tag);if(className)node.className=className;if(text!==undefined)node.textContent=text;return node;};
  const clean=(value)=>String(value||'').replace(/\s+/g,' ').trim();
  const normalize=(value)=>clean(value).toLocaleLowerCase();
  const typeLabel=(type)=>({AssignmentGroup:'Assignment groups',Assignment:'Assignments',DiscussionTopic:'Discussions',GroupCategory:'Group sets',Group:'Groups',WikiPage:'Pages',Attachment:'Files',Quiz:'Quizzes'})[type]||String(type||'Other').replace(/([a-z])([A-Z])/g,'$1 $2');
  const typeOrder=['AssignmentGroup','Assignment','DiscussionTopic','GroupCategory','Group','WikiPage','Attachment','Quiz'];
  const css=`
    .gtud-workspace{max-width:1280px;margin:0 auto 1.5rem;color:#20323e;font-family:system-ui,-apple-system,BlinkMacSystemFont,"Segoe UI",sans-serif}.gtud-hero{padding:1.15rem 1.3rem;border-radius:14px 14px 0 0;background:linear-gradient(118deg,#003057,#005a9c 62%,#006dad);color:#fff;box-shadow:0 8px 22px rgba(0,48,87,.17)}.gtud-kicker{margin:0 0 .2rem;color:#b9e2f7;font-size:.7rem;font-weight:800;letter-spacing:.1em;text-transform:uppercase}.gtud-hero h2{margin:0;font-size:1.55rem;letter-spacing:-.03em}.gtud-hero p{max-width:780px;margin:.3rem 0 0;color:#d9edf8;font-size:.88rem;line-height:1.45}.gtud-tools{display:flex;flex-wrap:wrap;gap:.65rem;align-items:end;padding:.85rem 1rem;border:1px solid #d3e0e7;border-top:0;border-radius:0 0 14px 14px;background:#f6fafc;box-shadow:0 8px 20px rgba(22,51,69,.07)}.gtud-field{display:flex;flex:1 1 270px;flex-direction:column;gap:.28rem;margin:0;color:#516773;font-size:.69rem;font-weight:800;letter-spacing:.06em;text-transform:uppercase}.gtud-input{width:100%;height:39px;padding:0 .7rem;border:1px solid #becfd8;border-radius:8px;background:#fff;color:#20323e;font:400 .9rem system-ui,sans-serif;box-sizing:border-box}.gtud-input:focus{outline:3px solid rgba(0,105,168,.2);border-color:#0069a8}.gtud-filters{display:flex;flex:3 1 360px;flex-wrap:wrap;gap:.35rem;align-items:center;min-height:39px}.gtud-filter{margin:0!important;padding:.3rem .58rem!important;border:1px solid #bdccd4;border-radius:999px;background:#fff;color:#38505e;font:700 .76rem system-ui,sans-serif;cursor:pointer}.gtud-filter:hover,.gtud-filter[aria-pressed=true]{border-color:#005a9c;background:#005a9c;color:#fff}.gtud-summary{flex:1 0 100%;margin:0;color:#58707c;font-size:.82rem}.gtud-list{margin:1.25rem 0 0!important;padding:0!important;list-style:none}.gtud-section{margin:0 0 1.4rem}.gtud-section-heading{display:flex;align-items:baseline;gap:.5rem;margin:0 0 .6rem;padding:0 0 .4rem;border-bottom:2px solid #b3a369;color:#20323e;font-size:1.1rem}.gtud-count{color:#657985;font-size:.8rem;font-weight:500}.gtud-items{display:grid;grid-template-columns:repeat(auto-fill,minmax(300px,1fr));gap:.7rem;margin:0;padding:0;list-style:none}.gtud-item{display:grid!important;grid-template-columns:minmax(0,1fr) auto;gap:.45rem .8rem;align-items:start;min-width:0;margin:0!important;padding:.85rem!important;border:1px solid #d6e2e8;border-radius:11px;background:#fff;box-shadow:0 2px 7px rgba(25,55,70,.05)}.gtud-item:hover{border-color:#9cc1d7;box-shadow:0 5px 13px rgba(24,70,97,.1)}.gtud-item .name{grid-column:1;grid-row:1;margin:0!important;color:#123b55;font-size:.95rem;font-weight:800;line-height:1.35}.gtud-item .type{display:none}.gtud-item .links{grid-column:2;grid-row:1 / span 2;margin:0!important}.gtud-item .restore_link{display:inline-flex!important;min-height:32px;align-items:center;justify-content:center;margin:0!important;padding:.3rem .62rem!important;border:1px solid #005a9c!important;border-radius:7px!important;background:#005a9c!important;color:#fff!important;font:750 .76rem/1 system-ui,sans-serif!important;text-decoration:none!important}.gtud-item .restore_link:hover,.gtud-item .restore_link:focus{background:#004f86!important}.gtud-item .dates{grid-column:1;grid-row:2;width:auto!important;margin:0!important;border:0!important;color:#657985;font-size:.74rem}.gtud-item .dates td{padding:0 .5rem 0 0!important;border:0!important}.gtud-item .dates td:first-child{text-transform:capitalize;font-weight:700}.gtud-item .details{grid-column:1/-1;grid-row:3;max-height:8.7em;overflow:auto;margin:0!important;padding-top:.55rem;border-top:1px solid #e8eef1;color:#526772;font-size:.78rem;line-height:1.4;white-space:pre-line}.gtud-item .details:empty{display:none}.gtud-item.gtud-hidden,.gtud-section.gtud-hidden{display:none!important}.gtud-empty{padding:2rem;border:1px dashed #9eb0ba;border-radius:10px;color:#58707c;text-align:center}@media(max-width:620px){.gtud-tools{display:block}.gtud-field{margin-bottom:.65rem}.gtud-items{grid-template-columns:1fr}.gtud-hero{padding:1rem}}
  `;

  function organize(){
    if(document.getElementById('gtud-workspace'))return true;
    const list=document.querySelector('#deleted_items_list');if(!list)return false;
    const items=[...list.querySelectorAll(':scope > li.item')];if(!items.length)return false;
    const style=make('style');style.id='gtud-styles';style.textContent=css;document.head.append(style);
    const records=items.map((item)=>{const type=clean(item.querySelector('.type')?.textContent)||'Other',name=clean(item.querySelector('.name')?.textContent)||'Untitled item',details=clean(item.querySelector('.details')?.textContent),dates=clean(item.querySelector('.dates')?.textContent);item.classList.add('gtud-item');return {item,type,name,search:normalize(`${name} ${type} ${details} ${dates}`)};});
    const oldHeading=[...document.querySelectorAll('h1,h2')].find((node)=>clean(node.textContent)==='Restore Deleted Items');
    const warning=oldHeading?.nextElementSibling?.matches('p')?oldHeading.nextElementSibling:null;
    const workspace=make('section','gtud-workspace');workspace.id='gtud-workspace';workspace.setAttribute('aria-label','Deleted item organizer');
    const hero=make('header','gtud-hero');hero.append(make('p','gtud-kicker','Canvas course recovery'),make('h2','','Restore deleted items'),make('p','',clean(warning?.textContent)||'Search and filter deleted content, then use Canvas’s restore action for the item you need.'));
    const tools=make('div','gtud-tools'),field=make('label','gtud-field','Find deleted content'),search=make('input','gtud-input');search.type='search';search.placeholder='Search names, types, dates, or details';search.setAttribute('aria-label','Search deleted items');field.append(search);const filters=make('div','gtud-filters');filters.setAttribute('aria-label','Filter deleted items by type');const summary=make('p','gtud-summary');summary.setAttribute('aria-live','polite');tools.append(field,filters,summary);workspace.append(hero,tools);list.before(workspace);
    oldHeading?.remove();warning?.remove();
    const active=new Set(),buttons=new Map(),types=[...new Set(records.map((record)=>record.type))].sort((a,b)=>{const left=typeOrder.indexOf(a),right=typeOrder.indexOf(b);return (left<0?999:left)-(right<0?999:right)||typeLabel(a).localeCompare(typeLabel(b));});
    types.forEach((type)=>{const button=make('button','gtud-filter',typeLabel(type));button.type='button';button.setAttribute('aria-pressed','false');button.addEventListener('click',()=>{active.has(type)?active.delete(type):active.add(type);button.setAttribute('aria-pressed',String(active.has(type)));render();});buttons.set(type,button);filters.append(button);});
    list.className='gtud-list';const sections=new Map();types.forEach((type)=>{const section=make('section','gtud-section'),heading=make('h3','gtud-section-heading',typeLabel(type)),count=make('span','gtud-count');heading.append(count);const group=make('ul','gtud-items');section.append(heading,group);list.append(section);sections.set(type,{section,group,count});});
    records.sort((a,b)=>a.name.localeCompare(b.name,undefined,{numeric:true,sensitivity:'base'})).forEach((record)=>sections.get(record.type).group.append(record.item));
    function render(){const terms=normalize(search.value).split(/\s+/).filter(Boolean);let visible=0;types.forEach((type)=>{const group=sections.get(type);let count=0;records.filter((record)=>record.type===type).forEach((record)=>{const match=(!terms.length||terms.every((term)=>record.search.includes(term)))&&(!active.size||active.has(type));record.item.classList.toggle('gtud-hidden',!match);if(match){visible++;count++;}});group.section.classList.toggle('gtud-hidden',!count);group.count.textContent=`${count} ${count===1?'item':'items'}`;});summary.textContent=`Showing ${visible} of ${records.length} deleted ${records.length===1?'item':'items'}${active.size?` in ${active.size} selected ${active.size===1?'type':'types'}`:''}.`;let empty=list.querySelector(':scope > .gtud-empty');if(!visible){if(!empty){empty=make('li','gtud-empty','No deleted items match your search and filters.');list.append(empty);}}else empty?.remove();}
    search.addEventListener('input',render);document.addEventListener('keydown',(event)=>{if(event.key==='/'&&!/input|textarea|select/i.test(document.activeElement?.tagName)){event.preventDefault();search.focus();}});render();return true;
  }
  if(!organize()){const observer=new MutationObserver(()=>{if(organize())observer.disconnect();});observer.observe(document.body,{childList:true,subtree:true});setTimeout(()=>observer.disconnect(),20000);}
})();

(function () {
  'use strict';
  if (location.hostname !== 'gatech.instructure.com' || window.top !== window || !/^\/courses\/\d+\/users(?:\/|$)/.test(location.pathname)) return;

  const make=(tag,className,text)=>{const node=document.createElement(tag);if(className)node.className=className;if(text!==undefined)node.textContent=text;return node;};
  const clean=(value)=>String(value||'').replace(/\s+/g,' ').trim();
  const normalize=(value)=>clean(value).toLocaleLowerCase();
  const css=`
    .gtpr-workspace{margin:0 0 1.25rem;color:#20323e;font-family:system-ui,-apple-system,BlinkMacSystemFont,"Segoe UI",sans-serif}.gtpr-hero{display:flex;align-items:end;justify-content:space-between;gap:1rem;padding:1.15rem 1.3rem;border-radius:14px 14px 0 0;background:linear-gradient(118deg,#003057,#005a9c 62%,#006dad);color:#fff;box-shadow:0 8px 22px rgba(0,48,87,.17)}.gtpr-kicker{margin:0 0 .22rem;color:#b9e2f7;font-size:.7rem;font-weight:800;letter-spacing:.1em;text-transform:uppercase}.gtpr-hero h2{margin:0;font-size:clamp(1.35rem,2.5vw,1.85rem);letter-spacing:-.035em}.gtpr-summary{margin:.25rem 0 0;color:#d9edf8;font-size:.88rem}.gtpr-tools{display:flex;flex-wrap:wrap;gap:.65rem;align-items:end;padding:.9rem 1rem;border:1px solid #d3e0e7;border-top:0;border-radius:0 0 14px 14px;background:#f6fafc;box-shadow:0 8px 20px rgba(22,51,69,.07)}.gtpr-field{display:flex;flex:1 1 260px;flex-direction:column;gap:.28rem;margin:0;color:#516773;font-size:.69rem;font-weight:800;letter-spacing:.06em;text-transform:uppercase}.gtpr-input{width:100%;height:39px;padding:0 .7rem;border:1px solid #becfd8;border-radius:8px;background:#fff;color:#20323e;font:400 .9rem system-ui,sans-serif;box-sizing:border-box}.gtpr-input:focus{outline:3px solid rgba(0,105,168,.2);border-color:#0069a8}.gtpr-role-filters{display:flex;flex:2 1 280px;flex-wrap:wrap;gap:.38rem;align-items:center;min-height:39px}.gtpr-role{box-sizing:border-box;margin:0!important;padding:.32rem .62rem!important;border:1px solid #bdccd4;border-radius:999px;background:#fff;color:#38505e;font:700 .77rem system-ui,sans-serif;line-height:1.2;cursor:pointer}.gtpr-role:hover,.gtpr-role[aria-pressed="true"]{border-color:#005a9c;background:#005a9c;color:#fff}.gtpr-export{min-height:39px;margin:0!important;padding:0 .8rem!important;border:1px solid #004f86;border-radius:8px;background:#005a9c;color:#fff;font:750 .82rem system-ui,sans-serif;cursor:pointer;box-shadow:0 2px 5px rgba(0,79,134,.18)}.gtpr-export:hover{background:#004f86}.gtpr-roster-hidden{display:none!important}.roster.gtpr-table{overflow:hidden;border:1px solid #d7e2e8!important;border-radius:12px!important;background:#fff;box-shadow:0 4px 14px rgba(22,51,69,.07)}.roster.gtpr-table thead th{position:sticky;top:0;z-index:1;padding:.75rem .6rem!important;border-bottom:2px solid #b3a369!important;background:#f3f7f9!important;color:#38515f!important;font-size:.72rem!important;font-weight:800!important;letter-spacing:.045em;text-transform:uppercase}.roster.gtpr-table tbody td{padding:.7rem .6rem!important;border-color:#e6edf1!important;vertical-align:middle}.roster.gtpr-table tbody tr:hover{background:#f2f9fc!important}.roster.gtpr-table .roster_user_name{color:#004f86!important;font-weight:750;text-decoration:none}.roster.gtpr-table .roster_user_name:hover{text-decoration:underline}.gtpr-role-stack,.gtpr-section-list{display:flex;flex-wrap:wrap;gap:.28rem}.gtpr-role-badge,.gtpr-section-tag{display:inline-block;padding:.22rem .48rem;border-radius:999px;background:#e7f3f9;color:#164d68;font-size:.72rem;font-weight:750;line-height:1.2}.gtpr-section-tag{background:#f1f5f7;color:#405965}.gtpr-section-details summary{color:#005a9c;font-size:.76rem;font-weight:750;cursor:pointer}.gtpr-section-details[open] summary{margin-bottom:.35rem}.gtpr-activity{color:#4e6470;font-size:.78rem;line-height:1.3}.roster.gtpr-table td:first-child img{width:34px!important;height:34px!important;border-radius:50%;object-fit:cover}.gtpr-sort{cursor:pointer}.gtpr-sort::after{content:' ↕';color:#8396a1;font-size:.7rem}.gtpr-sort[data-direction="ascending"]::after{content:' ↑';color:#005a9c}.gtpr-sort[data-direction="descending"]::after{content:' ↓';color:#005a9c}@media(max-width:800px){.gtpr-hero{align-items:start;flex-direction:column}.roster.gtpr-table{display:block;max-width:100%;overflow-x:auto}.roster.gtpr-table thead th{position:static}.gtpr-export{flex:1 1 auto}}`;
  const layoutCss=`.gtpr-workspace{margin-bottom:.9rem}.gtpr-hero{padding:.7rem 1rem}.gtpr-kicker{margin-bottom:.12rem;font-size:.64rem}.gtpr-hero h2{font-size:1.35rem}.gtpr-summary{margin-top:.15rem;font-size:.8rem}.gtpr-add-people{display:inline-flex!important;align-self:center!important;align-items:center!important;justify-content:center!important;float:none!important;min-height:34px;margin:0!important;padding:.35rem .72rem!important;border:1px solid #b9e2f7!important;border-radius:8px!important;background:#fff!important;color:#06476e!important;font:750 .8rem/1 system-ui,sans-serif!important;text-align:center!important;text-decoration:none!important;box-shadow:none!important}.gtpr-add-people:hover,.gtpr-add-people:focus{background:#eaf6fb!important;color:#003f6b!important}.gtpr-tools{display:grid;grid-template-columns:minmax(0,1fr) auto;gap:.55rem;padding:.65rem .85rem;align-items:end}.gtpr-field{min-width:0}.gtpr-role-field{grid-column:1/-1;min-width:0}.gtpr-role-field .gtpr-role-filters{flex:0 0 auto;min-height:39px}.gtpr-export{align-self:end}.gtpr-native-controls{display:none!important}@media(max-width:900px){.gtpr-tools{grid-template-columns:1fr}.gtpr-role-field{grid-column:auto}.gtpr-export{justify-self:start}}`;

  function csvCell(value){return `"${String(value??'').replace(/"/g,'""')}"`;}
  function courseTitle(){return clean(document.querySelector('#breadcrumbs li:nth-last-child(2) .ellipsible')?.textContent)||clean(document.querySelector('#section-tabs-header-subtitle')?.textContent)||'canvas-course';}
  function filenamePart(value){return value.replace(/[^a-z0-9]+/gi,'-').replace(/^-+|-+$/g,'').toLowerCase()||'roster';}
  function start(){
    if(document.getElementById('gtpr-workspace'))return true;
    const table=document.querySelector('table.roster');if(!table||!table.tBodies[0]||!table.rows.length)return false;
    const headers=[...table.tHead.rows[0].cells].map((cell)=>clean(cell.textContent));
    const usableColumns=headers.map((name,index)=>({name,index})).filter(({name})=>name&&name!=='Profile Picture'&&name!=='Administrative Links');
    if(!usableColumns.some((column)=>column.name==='Role'))return false;
    const rows=()=>[...table.tBodies[0].rows].filter((row)=>row.classList.contains('rosterUser'));
    const courseId=location.pathname.match(/^\/courses\/(\d+)/)?.[1];
    let rosterState='loading';
    function nextPage(linkHeader){return String(linkHeader||'').split(',').find((part)=>/rel="next"/.test(part))?.match(/<([^>]+)>/)?.[1]||'';}
    async function canvasPages(url){const items=[];while(url){const response=await fetch(url,{credentials:'same-origin',headers:{Accept:'application/json'}});if(!response.ok)throw new Error(`Canvas returned ${response.status}`);const page=await response.json();if(!Array.isArray(page))throw new Error('Canvas returned an unexpected roster response');items.push(...page);url=nextPage(response.headers.get('Link'));}return items;}
    function roleName(value){const names={StudentEnrollment:'Student',TeacherEnrollment:'Teacher',TaEnrollment:'TA',DesignerEnrollment:'Designer',ObserverEnrollment:'Observer'};const raw=String(value||'');return names[raw]||raw.replace(/Enrollment$/,'').replace(/([a-z])([A-Z])/g,'$1 $2')||'Unknown';}
    function formatActivity(value){return value?new Date(value).toLocaleString(undefined,{dateStyle:'medium',timeStyle:'short'}):'';}
    function addApiRosterRows(users,sections){
      const sectionNames=new Map(sections.map((section)=>[String(section.id),section.name]));const known=new Set(rows().map((row)=>row.id));const fragment=document.createDocumentFragment();
      users.forEach((user)=>{const id=`user_${user.id}`;if(known.has(id))return;const enrollments=Array.isArray(user.enrollments)?user.enrollments:[];const sectionValues=[...new Set(enrollments.map((enrollment)=>sectionNames.get(String(enrollment.course_section_id))).filter(Boolean))],roleValues=[...new Set(enrollments.map((enrollment)=>roleName(enrollment.role||enrollment.type)).filter(Boolean))],activity=enrollments.map((enrollment)=>enrollment.last_activity_at).find(Boolean),total=enrollments.reduce((sum,enrollment)=>sum+Number(enrollment.total_activity_time||0),0);const row=make('tr',`rosterUser al-hover-container ${enrollments.map((enrollment)=>enrollment.type||enrollment.role||'').join(' ')}`);row.id=id;row.dataset.gtprApiRow='true';
        headers.forEach((header)=>{const label=header.toLocaleLowerCase(),cell=make('td');if(label==='profile picture'){cell.className='center';const link=make('a');link.href=`/courses/${courseId}/users/${user.id}`;const image=make('img');image.src=user.avatar_url||'/images/messages/avatar-50.png';image.alt='';link.append(image);cell.append(link);}else if(label==='name'){const link=make('a','roster_user_name',user.name||'Unknown');link.href=`/courses/${courseId}/users/${user.id}`;cell.append(link);}else if(label==='login id')cell.textContent=user.login_id||'';else if(label==='sis id')cell.textContent=user.sis_user_id||'';else if(label==='section')sectionValues.forEach((value)=>cell.append(make('div','',value)));else if(label==='role')roleValues.forEach((value)=>cell.append(make('div','',value)));else if(label==='last activity')cell.textContent=formatActivity(activity);else if(label==='total activity')cell.textContent=total?`${Math.round(total/60)} min`:'';row.append(cell);});fragment.append(row);
      });table.tBodies[0].append(fragment);
    }
    async function loadFullRoster(){
      if(!courseId){rosterState='unavailable';return;}
      try{const users=await canvasPages(`/api/v1/courses/${encodeURIComponent(courseId)}/users?include[]=enrollments&enrollment_state[]=active&enrollment_state[]=invited&per_page=100`),sections=await canvasPages(`/api/v1/courses/${encodeURIComponent(courseId)}/sections?per_page=100`).catch(()=>[]);addApiRosterRows(users,sections);rosterState='ready';render();}catch(_){rosterState='unavailable';render();}
    }
    function discardApiDuplicates(){const seen=new Map();rows().forEach((row)=>{if(!row.id)return;const existing=seen.get(row.id);if(!existing){seen.set(row.id,row);return;}if(existing.dataset.gtprApiRow==='true'&&row.dataset.gtprApiRow!=='true'){existing.remove();seen.set(row.id,row);}else row.remove();});}
    // A person can have multiple enrollments (for example, Teacher in several
    // sections plus TA in another). Canvas repeats the role once per
    // enrollment, so use unique role names in the organizer controls.
    const distinctCellValues=(row,index)=>[...new Set([...row.cells[index]?.querySelectorAll(':scope > div')||[]].map((node)=>clean(node.textContent)).filter(Boolean))];
    const roleList=(row)=>{try{const saved=JSON.parse(row.dataset.gtprRoles||'');if(Array.isArray(saved))return saved;}catch(_){}return distinctCellValues(row,headers.indexOf('Role'));};
    const roleAt=(row)=>roleList(row).join(' · ')||clean(row.cells[headers.indexOf('Role')]?.textContent)||'Unknown';
    const state={query:'',roles:new Set(),sortIndex:-1,direction:1};
    function compactEnrollments(row){
      if(row.dataset.gtprCompacted==='true')return;
      const sectionIndex=headers.indexOf('Section'),roleIndex=headers.indexOf('Role'),activityIndex=headers.indexOf('Last Activity');
      const sections=distinctCellValues(row,sectionIndex),roles=distinctCellValues(row,roleIndex),activities=distinctCellValues(row,activityIndex);
      row.dataset.gtprCompacted='true';row.dataset.gtprRoles=JSON.stringify(roles);row.dataset.gtprSections=JSON.stringify(sections);
      const sectionCell=row.cells[sectionIndex],roleCell=row.cells[roleIndex],activityCell=row.cells[activityIndex];
      if(sectionCell){sectionCell.replaceChildren();if(sections.length>2){const details=make('details','gtpr-section-details'),summary=make('summary','',`${sections.length} sections`),list=make('div','gtpr-section-list');sections.forEach((section)=>list.append(make('span','gtpr-section-tag',section)));details.append(summary,list);sectionCell.append(details);}else{const list=make('div','gtpr-section-list');sections.forEach((section)=>list.append(make('span','gtpr-section-tag',section)));sectionCell.append(list);}}
      if(roleCell){const list=make('div','gtpr-role-stack');roles.forEach((role)=>list.append(make('span','gtpr-role-badge',role)));roleCell.replaceChildren(list);}
      if(activityCell){activityCell.replaceChildren(make('span','gtpr-activity',activities.join(' · ')));}
    }
    const style=make('style');style.id='gtpr-styles';style.textContent=css+layoutCss;document.head.append(style);
    const workspace=make('section','gtpr-workspace');workspace.id='gtpr-workspace';workspace.setAttribute('aria-label','People roster tools');
    const hero=make('header','gtpr-hero'),heading=make('div'),kicker=make('p','gtpr-kicker','Canvas course roster'),title=make('h2','','People'),summary=make('p','gtpr-summary');heading.append(kicker,title,summary);hero.append(heading);const addPeople=document.querySelector('#addUsers');if(addPeople){addPeople.classList.add('gtpr-add-people');hero.append(addPeople);}
    const tools=make('div','gtpr-tools');const searchField=make('label','gtpr-field','Find a person');const search=make('input','gtpr-input');search.type='search';search.placeholder='Search name, login, SIS ID, section, or role';search.setAttribute('aria-label','Search roster');searchField.append(search);const roleField=make('div','gtpr-field gtpr-role-field');roleField.append(make('span','','Filter by role'));const roleFilters=make('div','gtpr-role-filters');roleFilters.setAttribute('aria-label','Filter roster by role');roleField.append(roleFilters);const exportButton=make('button','gtpr-export','Export CSV');exportButton.type='button';exportButton.setAttribute('aria-label','Export the visible People roster to CSV');tools.append(searchField,roleField,exportButton);workspace.append(hero,tools);table.before(workspace);
    const nativeRoleSelect=document.querySelector('select[data-view="roleSelect"]');
    nativeRoleSelect?.closest('div[style*="display: flex"]')?.classList.add('gtpr-native-controls');
    table.classList.add('gtpr-table');
    const roleButtons=new Map();
    function refreshRoles(){const available=[...new Set(rows().flatMap(roleList))].sort((a,b)=>a.localeCompare(b));available.forEach((role)=>{if(roleButtons.has(role))return;const button=make('button','gtpr-role',role);button.type='button';button.setAttribute('aria-pressed','false');button.addEventListener('click',()=>{state.roles.has(role)?state.roles.delete(role):state.roles.add(role);button.setAttribute('aria-pressed',String(state.roles.has(role)));render();});roleButtons.set(role,button);roleFilters.append(button);});}
    function matchingRows(){const tokens=normalize(search.value).split(/\s+/).filter(Boolean);return rows().filter((row)=>{const text=normalize([...row.cells].map((cell)=>cell.textContent).join(' '));return (!tokens.length||tokens.every((token)=>text.includes(token)))&&(!state.roles.size||roleList(row).some((role)=>state.roles.has(role)));});}
    function render(){discardApiDuplicates();rows().forEach(compactEnrollments);refreshRoles();const matched=new Set(matchingRows());rows().forEach((row)=>row.classList.toggle('gtpr-roster-hidden',!matched.has(row)));const detail=rosterState==='loading'?' Loading the complete roster…':rosterState==='unavailable'?' (complete roster could not be loaded).':'';summary.textContent=`Showing ${matched.size} of ${rows().length} people.${detail}`;exportButton.textContent=`Export ${matched.size} visible to CSV`;}
    function sortBy(index,header){const body=table.tBodies[0];state.direction=state.sortIndex===index?-state.direction:1;state.sortIndex=index;[...body.rows].sort((a,b)=>clean(a.cells[index]?.textContent).localeCompare(clean(b.cells[index]?.textContent),undefined,{numeric:true,sensitivity:'base'})*state.direction).forEach((row)=>body.append(row));[...table.tHead.rows[0].cells].forEach((cell)=>{cell.classList.remove('gtpr-sort');cell.removeAttribute('data-direction');cell.removeAttribute('aria-sort');});header.classList.add('gtpr-sort');header.dataset.direction=state.direction===1?'ascending':'descending';header.setAttribute('aria-sort',header.dataset.direction);render();}
    [...table.tHead.rows[0].cells].forEach((header,index)=>{if(!clean(header.textContent))return;header.classList.add('gtpr-sort');header.tabIndex=0;header.setAttribute('role','button');header.addEventListener('click',()=>sortBy(index,header));header.addEventListener('keydown',(event)=>{if(event.key==='Enter'||event.key===' '){event.preventDefault();sortBy(index,header);}});});
    search.addEventListener('input',render);
    exportButton.addEventListener('click',()=>{const nameIndex=headers.indexOf('Name'),visible=matchingRows().sort((a,b)=>roleAt(a).localeCompare(roleAt(b),undefined,{sensitivity:'base'})||clean(a.cells[nameIndex]?.textContent).localeCompare(clean(b.cells[nameIndex]?.textContent),undefined,{sensitivity:'base'}));const data=[usableColumns.map(({name})=>name),...visible.map((row)=>usableColumns.map(({name,index})=>name==='Role'?roleAt(row):name==='Section'?(JSON.parse(row.dataset.gtprSections||'[]').join(' · ')||clean(row.cells[index]?.textContent)):clean(row.cells[index]?.textContent)))];const blob=new Blob(['\uFEFF'+data.map((line)=>line.map(csvCell).join(',')).join('\r\n')],{type:'text/csv;charset=utf-8'});const url=URL.createObjectURL(blob),link=make('a');link.href=url;link.download=`${filenamePart(courseTitle())}-people.csv`;document.body.append(link);link.click();link.remove();URL.revokeObjectURL(url);});
    const observer=new MutationObserver(()=>render());observer.observe(table.tBodies[0],{childList:true,subtree:true});render();loadFullRoster();return true;
  }
  const retry=()=>{if(start())return;setTimeout(retry,250);};retry();
})();

(function () {
  'use strict';
  if (location.hostname !== 'gatech.instructure.com' || window.top !== window || !/^\/courses\/\d+\/groups(?:\/|$)/.test(location.pathname)) return;

  const courseId=location.pathname.match(/^\/courses\/(\d+)\/groups/)?.[1];
  if(!courseId||document.getElementById('gtbg-panel'))return;
  const make=(tag,className,text)=>{const node=document.createElement(tag);if(className)node.className=className;if(text!==undefined)node.textContent=text;return node;};
  const csrf=document.querySelector('meta[name="csrf-token"]')?.content||'';
  const api=async(path,options={})=>{
    const response=await fetch(`/api/v1${path}`,{credentials:'same-origin',...options,headers:{Accept:'application/json','X-CSRF-Token':csrf,...(options.headers||{})}});
    const payload=response.status===204?null:await response.text();
    if(!response.ok){
      let detail='';try{const parsed=JSON.parse(payload);detail=[...(parsed.errors||[])].map((error)=>error.message||String(error)).join(' ');}catch(_){detail=payload?.replace(/\s+/g,' ').slice(0,220)||'';}
      const error=new Error(`Canvas returned ${response.status}${detail?`: ${detail}`:''}`);error.status=response.status;throw error;
    }
    return payload?JSON.parse(payload):null;
  };
  const encode=(values)=>new URLSearchParams(Object.entries(values).filter(([,value])=>value!==undefined&&value!==null&&value!=='')).toString();

  const style=make('style');style.textContent=`
    .gtw-workspace{max-width:1440px;margin:0 auto 1.5rem;color:#1d2d3a;font-family:system-ui,-apple-system,BlinkMacSystemFont,"Segoe UI",sans-serif}.gtw-hero{display:flex;align-items:end;justify-content:space-between;gap:1rem;padding:1.35rem 1.5rem;border-radius:18px 18px 0 0;background:linear-gradient(118deg,#003057,#004f86 55%,#0069a8);color:#fff;box-shadow:0 12px 30px rgba(0,48,87,.2)}.gtw-kicker{margin:0 0 .25rem;color:#a8d9f5;font-size:.72rem;font-weight:800;letter-spacing:.1em;text-transform:uppercase}.gtw-hero h1{margin:0;font-size:clamp(1.55rem,3vw,2.15rem);letter-spacing:-.035em}.gtw-hero p{max-width:480px;margin:0;color:#d8ecf7;font-size:.91rem;line-height:1.45}.gtw-tools{display:grid;grid-template-columns:1fr 1fr;gap:1rem;padding:1rem 1.1rem 1.15rem;border:1px solid #d5e1e8;border-top:0;border-radius:0 0 18px 18px;background:#f6fafc;box-shadow:0 10px 26px rgba(20,47,66,.08)}.gtbg-panel{min-width:0;margin:0;padding:1rem 1.05rem;border:1px solid #d8e3e9;border-radius:13px;background:#fff;box-shadow:0 2px 7px rgba(25,55,70,.05);color:#203641}.gtbg-panel h2{margin:0;font-size:1.05rem;letter-spacing:-.015em}.gtbg-panel p{margin:.25rem 0 .9rem;color:#62747f;font-size:.87rem}.gtbg-grid{display:grid;grid-template-columns:minmax(145px,1.15fr) minmax(115px,.9fr) repeat(3,minmax(78px,.55fr));gap:.55rem;align-items:end}.gtbg-field{display:flex;min-width:0;flex-direction:column;gap:.28rem;color:#526672;font-size:.69rem;font-weight:800;letter-spacing:.055em;text-transform:uppercase}.gtbg-field input,.gtbg-field select{width:100%;height:38px;padding:0 .6rem;border:1px solid #c4d3db;border-radius:8px;background:#fbfdfe;color:#203641;font:400 .88rem system-ui,sans-serif;box-sizing:border-box}.gtbg-field input:focus,.gtbg-field select:focus{outline:3px solid rgba(0,105,168,.18);border-color:#0069a8}.gtbg-create{justify-self:start;min-height:38px;padding:0 .85rem;border:0;border-radius:8px;background:#005a9c;color:#fff;font:750 .82rem system-ui,sans-serif;cursor:pointer;box-shadow:0 2px 5px rgba(0,79,134,.18)}.gtbg-create:hover{background:#004f86}.gtbg-create:disabled{opacity:.55;cursor:wait}.gtbg-status{min-height:1.2em;margin:.65rem 0 0;color:#526772;font-size:.82rem}.gtbg-status.is-error{color:#a32614}.gtbg-status.is-success{color:#17653a}.gtbg-assign-grid{display:grid;grid-template-columns:minmax(135px,.9fr) minmax(170px,1.25fr) minmax(135px,.9fr) auto;gap:.55rem;align-items:end}.gtbg-student-list{grid-column:1/-1;display:flex;flex-wrap:wrap;gap:.35rem;max-height:124px;overflow:auto;padding:.1rem 0}.gtbg-student{max-width:100%;padding:.35rem .58rem;border:1px solid #c7d6de;border-radius:999px;background:#fff;color:#29414e;font:500 .8rem system-ui,sans-serif;cursor:pointer;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}.gtbg-student:hover,.gtbg-student:focus{border-color:#005a9c;background:#edf6fb;outline:0}.gtbg-student.is-selected{border-color:#004f86;background:#005a9c;color:#fff}.group_categories_area{max-width:1440px;margin:0 auto}.empty-groupset-instructions{display:none!important}.group_categories_area>#group_categories_tabs{position:relative;padding-top:.2rem}.group_categories_area .group-categories-actions{position:absolute;z-index:2;right:0;top:0}.group_categories_area #add-group-set,.group-category-actions .btn{min-height:38px;border-radius:8px;border:1px solid #bdd0dc;background:#fff;color:#23404f;font-weight:700;box-shadow:0 1px 3px rgba(23,51,69,.08)}.group_categories_area #add-group-set{border:0;background:#857437;color:#fff}.group_categories_area .ui-tabs-nav{display:flex;gap:.35rem;margin:0 0 1rem!important;padding:0 8rem 0 0!important;border:0!important;background:transparent!important}.group_categories_area .ui-tabs-nav li{float:none!important;margin:0!important;border:0!important;border-radius:999px!important;background:#edf3f6!important}.group_categories_area .ui-tabs-nav li.ui-tabs-active{background:#003057!important}.group_categories_area .ui-tabs-nav a{padding:.55rem .85rem!important;color:#36515f!important;font-weight:700}.group_categories_area .ui-tabs-nav li.ui-tabs-active a{color:#fff!important}.group_categories_area .tab-panel{border:0!important;background:transparent!important}.group-category-summary{display:flex;justify-content:flex-end;margin:0 0 .75rem}.group-category-summary__detailLayout{display:flex;justify-content:flex-end}.group-category-actions{display:flex;gap:.45rem}.group-category-actions .btn{margin:0!important}.group-category-actions .add-group{background:#005a9c;color:#fff;border-color:#005a9c}.group-category-contents>.row-fluid{display:grid!important;grid-template-columns:minmax(0,1fr) minmax(250px,300px)!important;gap:1rem}.group-category-contents .span3.unassigned-students,.group-category-contents .span9.groups{float:none!important;width:auto!important;margin:0!important}.group-category-contents .groups{grid-column:1;grid-row:1}.group-category-contents .unassigned-students{grid-column:2;grid-row:1}.unassigned-students{position:sticky;top:1rem;align-self:start;padding:1rem;border:1px solid #d8e3e9;border-radius:14px;background:#fff;box-shadow:0 2px 7px rgba(25,55,70,.05)}.unassigned-students .group-heading{display:inline-block;margin:0 .45rem .75rem 0;color:#203641;font-size:1rem}.gtw-roster-toggle{margin:0 0 .65rem;padding:.3rem .55rem;border:1px solid #c4d3db;border-radius:999px;background:#f4f9fc;color:#23516a;font:700 .72rem system-ui,sans-serif;cursor:pointer}.unassigned-students .search-query{width:100%;height:38px;border:1px solid #c5d3db;border-radius:8px;background:#fbfdfe}.unassigned-students .collectionViewItems{margin-top:.6rem}.unassigned-students .ui-cnvs-scrollable{max-height:290px!important;overflow:auto!important}.unassigned-students.gtw-roster-collapsed .search-query,.unassigned-students.gtw-roster-collapsed .ui-cnvs-scrollable{display:none!important}.unassigned-students .group-user{padding:.48rem .2rem!important;border-bottom:1px solid #edf2f5}.groups>.group-heading{margin:0}.groups-list{display:grid;grid-template-columns:repeat(auto-fill,minmax(220px,1fr));gap:.85rem;margin:0!important;padding:0!important}.groups-list>.group{box-sizing:border-box;min-height:95px;margin:0!important;padding:.85rem;border:1px solid #d6e2e8;border-radius:14px;background:#fff;box-shadow:0 2px 7px rgba(25,55,70,.05);transition:transform .16s ease,box-shadow .16s ease,border-color .16s ease}.groups-list>.group:hover{border-color:#9cc1d7;box-shadow:0 7px 17px rgba(24,70,97,.1);transform:translateY(-2px)}.groups-list .group-header{display:grid!important;grid-template-columns:minmax(0,1fr) auto auto;gap:.45rem;align-items:start}.groups-list .group-header>[class*=span]{float:none!important;width:auto!important;margin:0!important}.groups-list .group-name{color:#123b55;font-size:.95rem;font-weight:800}.groups-list .group-summary{color:#607582;font-size:.78rem;white-space:nowrap}.groups-list .show-group-full{background:#f4e8b5!important;color:#5a4b0f!important;border-radius:999px;font-size:.67rem}.groups-list .group-actions{justify-self:end}.groups-list .group-users{margin-top:.7rem;padding-top:.65rem;border-top:1px solid #edf2f5;font-size:.82rem}.groups-list .group-user{padding:.35rem 0!important;border-bottom:1px solid #f0f4f6}.groups-list .no-results{color:#718490;font-size:.8rem;line-height:1.4}@media(max-width:980px){.gtw-tools{grid-template-columns:1fr}.group-category-contents>.row-fluid{grid-template-columns:1fr!important}.group-category-contents .groups,.group-category-contents .unassigned-students{grid-column:1;grid-row:auto}.unassigned-students{position:static}}@media(max-width:700px){.gtw-hero{align-items:start;flex-direction:column;padding:1.1rem}.gtbg-grid,.gtbg-assign-grid{grid-template-columns:1fr 1fr}.gtbg-grid .gtbg-field:first-child,.gtbg-assign-grid .gtbg-field:first-child{grid-column:1/-1}.group_categories_area .group-categories-actions{position:static;margin:0 0 .7rem}.group_categories_area .ui-tabs-nav{padding-right:0!important;flex-wrap:wrap}.groups-list{grid-template-columns:1fr}}
  `;document.head.append(style);
  const responsiveStyle=make('style');responsiveStyle.textContent=`
    @media(max-width:1240px){.gtw-tools{grid-template-columns:1fr}.gtbg-grid{grid-template-columns:minmax(160px,1.3fr) minmax(130px,1fr) repeat(3,minmax(94px,.65fr))}.gtbg-assign-grid{grid-template-columns:minmax(170px,.9fr) minmax(210px,1.2fr) minmax(170px,.9fr) auto}}
    @media(max-width:980px){.gtbg-grid,.gtbg-assign-grid{grid-template-columns:repeat(2,minmax(0,1fr))}.gtbg-create{grid-column:1/-1}.group-category-contents>.row-fluid{grid-template-columns:1fr!important}.group-category-contents .groups,.group-category-contents .unassigned-students{grid-column:1;grid-row:auto}.unassigned-students{position:static}}
  `;document.head.append(responsiveStyle);
  const cardAddStyle=make('style');cardAddStyle.textContent=`
    .gtw-card-add{margin-top:.65rem;padding-top:.65rem;border-top:1px solid #e7eef2}.gtw-card-add input{width:100%;height:34px;padding:0 .58rem;border:1px solid #c5d5de;border-radius:8px;background:#fbfdfe;box-sizing:border-box;color:#203641;font:.82rem system-ui,sans-serif}.gtw-card-add input:focus{outline:3px solid rgba(0,105,168,.16);border-color:#0069a8}.gtw-card-options{display:flex;flex-direction:column;gap:.25rem;margin-top:.4rem}.gtw-card-option{width:100%;padding:.36rem .48rem;border:1px solid #d3e0e6;border-radius:7px;background:#fff;color:#29414e;text-align:left;font:.78rem system-ui,sans-serif;cursor:pointer}.gtw-card-option:hover,.gtw-card-option:focus{border-color:#005a9c;background:#edf6fb;outline:0}.gtw-card-note{display:block;margin-top:.38rem;color:#657985;font-size:.73rem;line-height:1.3}
    .gtw-tools{grid-template-columns:1fr}@media(min-width:1241px){.gtbg-grid{grid-template-columns:minmax(220px,1.45fr) minmax(185px,1fr) repeat(3,minmax(120px,.7fr))}}
  `;document.head.append(cardAddStyle);
  const cardPolishStyle=make('style');cardPolishStyle.textContent=`
    .groups-list .group-header{grid-template-columns:minmax(0,1fr) auto!important;gap:.15rem .65rem}.groups-list .group-header>.span8{grid-column:1;grid-row:1}.groups-list .group-header>.span2:nth-child(2){grid-column:1;grid-row:2}.groups-list .group-header>.group-actions{grid-column:2;grid-row:1 / span 2;align-self:center}.groups-list .group-users>ul.collectionViewItems{display:flex!important;flex-direction:column!important;gap:.4rem;margin:.65rem 0 0!important;padding:0!important}.groups-list .group-users .group-user{position:relative!important;display:flex!important;float:none!important;align-items:center;gap:.45rem;width:100%!important;min-height:38px;box-sizing:border-box;margin:0!important;padding:.28rem .4rem!important;border:1px solid #d8e4ea!important;border-radius:8px;background:#f9fcfd}.groups-list .group-users .group-user-name{flex:1;min-width:0;margin:0!important;padding:0!important;color:#294552;font-size:.8rem;line-height:1.25;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}.groups-list .group-users .group-user-name .icon-drag-handle{margin-right:.35rem;color:#79909d}.groups-list .group-users [id*="_menu_selector"]{position:static!important;right:auto!important;top:auto!important;margin-left:auto}.groups-list .group-users [data-testid="groupUserMenu"]{display:inline-flex!important;align-items:center;justify-content:center;width:28px;height:28px;border-radius:6px;background:#fff;color:#486371}.groups-list .group-users [data-testid="groupUserMenu"]:hover{background:#edf6fb;color:#005a9c}
  `;document.head.append(cardPolishStyle);
  const teamControlsStyle=make('style');teamControlsStyle.textContent=`.gtw-team-controls{display:flex;flex-wrap:wrap;gap:.45rem;align-items:center;margin:0 0 1rem}.gtw-team-controls input,.gtw-team-controls select{min-width:190px;height:36px;padding:0 .6rem;border:1px solid #c5d5de;border-radius:8px;background:#fff}.gtw-team-controls select{min-width:130px;color:#234b61;font:700 .78rem system-ui,sans-serif}.gtw-control{min-height:36px;padding:0 .65rem;border:1px solid #c5d5de;border-radius:8px;background:#fff;color:#234b61;font:700 .78rem system-ui,sans-serif;cursor:pointer}.gtw-control[aria-pressed=true]{background:#005a9c;border-color:#005a9c;color:#fff}.groups-list>.gtw-group-section{grid-column:1/-1;margin:.5rem 0 -.2rem;padding:.55rem .1rem .35rem;border-bottom:1px solid #d6e4ea;color:#315367;font-size:.76rem;font-weight:850;letter-spacing:.07em;text-transform:uppercase}.groups-list>.group.gtw-hidden-card{display:none!important}.gtw-capacity{display:inline-block;margin-left:.4rem;padding:.16rem .4rem;border-radius:999px;background:#e9f5ec;color:#186239;font-size:.67rem;font-weight:800}.gtw-capacity.is-near{background:#fff1c9;color:#6a5100}.gtw-capacity.is-full{background:#f7e7e4;color:#9b2c1d}.gtw-section-badge{display:inline-block;margin-left:.4rem;padding:.1rem .35rem;border-radius:999px;background:#eaf3f8;color:#386277;font-size:.64rem;font-weight:750;vertical-align:middle}`;document.head.append(teamControlsStyle);
  const teamSearchStyle=make('style');teamSearchStyle.textContent=`.gtw-search-match{display:block;grid-column:1;margin-top:.15rem;color:#0069a8;font-size:.7rem;font-weight:750;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}`;document.head.append(teamSearchStyle);
  const dashboardStyle=make('style');dashboardStyle.textContent=`.gtw-dashboard{display:flex;flex-wrap:wrap;align-items:center;gap:.55rem;margin-top:.8rem}.gtw-dashboard-status{margin:0!important;color:#d8ecf7!important;font-size:.78rem!important}.gtw-undo{min-height:30px;padding:0 .6rem;border:1px solid #a8d9f5;border-radius:999px;background:#fff;color:#06476e;font:800 .72rem system-ui,sans-serif;cursor:pointer}.gtw-undo:disabled{display:none}.gtw-balance-panel{padding:.75rem 1rem;border:1px solid #d8e3e9;border-radius:12px;background:#fff;color:#29414e}.gtw-balance-panel h2{margin:0 0 .4rem;font-size:.88rem}.gtw-balance-list{display:flex;flex-wrap:wrap;gap:.4rem}.gtw-balance-item{padding:.3rem .5rem;border-radius:999px;background:#edf6fa;color:#31556a;font-size:.74rem;font-weight:700}`;document.head.append(dashboardStyle);
  const sectionBadgeStyle=make('style');sectionBadgeStyle.textContent=`.groups-list .group-users .group-user{display:grid!important;grid-template-columns:minmax(0,1fr) 28px;grid-template-rows:auto auto;gap:0 .25rem;min-height:0;padding:.28rem .4rem!important}.groups-list .group-users .group-user-name{grid-column:1;grid-row:1;display:block;min-width:0;margin:0!important;padding:0!important}.groups-list .gtw-section-badge{grid-column:1;grid-row:2;margin:0 0 0 1.25rem;padding:0;background:transparent;color:#698390;font-size:.63rem;font-weight:750;line-height:1.25}.gtw-section-badge::before{content:'';display:inline-block;width:6px;height:6px;margin:0 .3rem .05rem 0;border-radius:50%;background:#1b81b7}.gtw-section-badge[data-section-color="1"]::before{background:#857437}.gtw-section-badge[data-section-color="2"]::before{background:#7a5aa6}.gtw-section-badge[data-section-color="3"]::before{background:#2d8b67}.groups-list .group-users [id*="_menu_selector"]{grid-column:2;grid-row:1 / span 2;align-self:center;justify-self:end;margin:0!important}`;document.head.append(sectionBadgeStyle);
  const peopleCardStyle=make('style');peopleCardStyle.textContent=`.groups-list .group-users .group-user,.unassigned-students .group-user{border-left:3px solid #cfe5ef!important;background:linear-gradient(135deg,#fff,#f7fbfc)!important;box-shadow:0 1px 2px rgba(22,63,84,.04)}.groups-list .group-users .group-user:hover,.unassigned-students .group-user:hover{border-left-color:#0075b8!important;background:#f2f9fc!important}.unassigned-students .group-user{display:grid!important;grid-template-columns:minmax(0,1fr) 26px;grid-template-rows:auto auto;gap:0 .25rem;min-height:0;margin:.35rem 0!important;padding:.3rem .4rem!important;border:1px solid #d8e5eb!important;border-left:3px solid #cfe5ef!important;border-radius:8px}.unassigned-students .group-user-name{grid-column:1;grid-row:1;min-width:0;margin:0!important;padding:0!important;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}.unassigned-students .gtw-section-badge{grid-column:1;grid-row:2;margin:0 0 0 1.25rem;padding:0;background:transparent;color:#698390;font-size:.63rem;font-weight:750}.unassigned-students .assign-to-group{grid-column:2;grid-row:1 / span 2;align-self:center;justify-self:end}.unassigned-students .gtw-section-header{margin:.7rem 0 .3rem!important;padding:0!important;list-style:none}.unassigned-students .gtw-section-toggle{width:100%;padding:.35rem .45rem;border:0;border-bottom:1px solid #d9e6ec;background:transparent;color:#35586b;text-align:left;font:800 .72rem system-ui,sans-serif;letter-spacing:.03em;text-transform:uppercase;cursor:pointer}.unassigned-students .gtw-section-toggle::before{content:'▾';display:inline-block;margin-right:.35rem;color:#1b81b7}.unassigned-students .gtw-section-toggle[aria-expanded=false]::before{content:'▸'}.unassigned-students .gtw-section-toggle::after{content:'';display:inline-block;width:6px;height:6px;margin:0 0 .05rem .4rem;border-radius:50%;background:#1b81b7}.unassigned-students .gtw-section-toggle[data-section-color="1"]::after{background:#857437}.unassigned-students .gtw-section-toggle[data-section-color="2"]::after{background:#7a5aa6}.unassigned-students .gtw-section-toggle[data-section-color="3"]::after{background:#2d8b67}.unassigned-students .group-user.gtw-section-collapsed{display:none!important}`;document.head.append(peopleCardStyle);
  const rosterSizingStyle=make('style');rosterSizingStyle.textContent=`.unassigned-students .ui-cnvs-scrollable{padding-right:30px!important;box-sizing:border-box}.unassigned-students .collectionViewItems{width:100%!important;box-sizing:border-box}.unassigned-students .group-user{width:calc(100% - 30px)!important;max-width:calc(100% - 30px)!important;box-sizing:border-box!important;grid-template-columns:minmax(0,1fr) 30px!important}.unassigned-students .assign-to-group{position:static!important;right:auto!important;top:auto!important;float:none!important}`;document.head.append(rosterSizingStyle);
  const rosterActionStyle=make('style');rosterActionStyle.textContent=`.unassigned-students .group-user{position:relative!important;padding-right:38px!important}.unassigned-students .assign-to-group{position:absolute!important;right:7px!important;top:50%!important;transform:translateY(-50%);z-index:1}`;document.head.append(rosterActionStyle);
  const teamMemberActionStyle=make('style');teamMemberActionStyle.textContent=`.groups-list .group-users .group-user{position:relative!important;width:100%!important;max-width:100%!important;box-sizing:border-box!important;padding-right:38px!important}.groups-list .group-users [id*="_menu_selector"]{position:absolute!important;right:6px!important;top:50%!important;transform:translateY(-50%);margin:0!important;z-index:1}`;document.head.append(teamMemberActionStyle);
  const compactPeopleStyle=make('style');compactPeopleStyle.textContent=`.unassigned-students{padding:.7rem!important}.unassigned-students .ui-cnvs-scrollable{padding-right:0!important}.unassigned-students .group-user{width:100%!important;max-width:100%!important;height:48px!important;min-height:48px!important;margin:.18rem 0!important;padding:.14rem .35rem!important;padding-right:34px!important;line-height:1.15!important}.unassigned-students .group-user-name{line-height:1.15!important}.unassigned-students .gtw-section-badge{margin-left:1.05rem;line-height:1.1!important}`;document.head.append(compactPeopleStyle);
  const teamMemberLayoutStyle=make('style');teamMemberLayoutStyle.textContent=`.groups-list .group-users,.groups-list .group-users>ul.collectionViewItems{width:100%!important;min-width:0!important;max-width:100%!important;box-sizing:border-box!important;overflow:visible!important}.groups-list .group-users>ul.collectionViewItems{padding:0!important}.groups-list .group-users .group-user{display:grid!important;grid-template-columns:minmax(0,1fr) 28px!important;grid-template-rows:auto auto!important;gap:0 .3rem!important;width:100%!important;min-width:0!important;max-width:100%!important;box-sizing:border-box!important;margin:.4rem 0!important;padding:.28rem .4rem!important;overflow:hidden!important}.groups-list .group-users .group-user-name{grid-column:1!important;grid-row:1!important;min-width:0!important;max-width:100%!important}.groups-list .group-users .gtw-section-badge{grid-column:1!important;grid-row:2!important;min-width:0!important;max-width:100%!important}.groups-list .group-users [id*="_menu_selector"]{position:static!important;grid-column:2!important;grid-row:1 / span 2!important;align-self:center!important;justify-self:end!important;width:28px!important;min-width:28px!important;height:28px!important;margin:0!important;padding:0!important;transform:none!important;z-index:auto!important}`;document.head.append(teamMemberLayoutStyle);

  const panel=make('section','gtbg-panel');panel.id='gtbg-panel';panel.setAttribute('aria-label','Batch group creator');
  const title=make('h2','', 'Batch create groups');const intro=make('p','', 'Create a numbered range in the selected group set. The optional limit is applied to each new group through Canvas’s own Add Group control.');
  const grid=make('div','gtbg-grid');
  const field=(label,node)=>{const wrap=make('label','gtbg-field');wrap.append(make('span','',label),node);return wrap;};
  const category=make('select');category.id='gtbg-category';const prefix=make('select');prefix.append(make('option','','Team'));const start=make('input');start.type='number';start.min='1';start.value='1';const end=make('input');end.type='number';end.min='1';end.value='10';const limit=make('input');limit.type='number';limit.min='1';limit.placeholder='Optional';
  const create=make('button','gtbg-create','Create groups');create.type='button';grid.append(field('Group set',category),field('Team / section prefix',prefix),field('Start',start),field('End',end),field('Maximum size',limit),create);
  const status=make('p','gtbg-status','Loading group sets…');status.setAttribute('aria-live','polite');panel.append(title,intro,grid,status);
  const anchor=document.querySelector('.group_categories_area>#group_categories_tabs')||document.querySelector('#content');if(!anchor)return;
  const setStatus=(message,kind='')=>{status.textContent=message;status.className=`gtbg-status${kind?` is-${kind}`:''}`;};
  const waitFor=(test,timeout=5000,message='Canvas did not complete the requested action.')=>new Promise((resolve,reject)=>{const started=Date.now();const timer=setInterval(()=>{const value=test();if(value){clearInterval(timer);resolve(value);}else if(Date.now()-started>timeout){clearInterval(timer);reject(new Error(message));}},50);});
  const isVisible=(node)=>Boolean(node&&node.isConnected&&node.getClientRects().length&&getComputedStyle(node).visibility!=='hidden');
  const visibleOne=(selector,root=document)=>[...root.querySelectorAll(selector)].find(isVisible);
  const setInput=(input,value)=>{const setter=Object.getOwnPropertyDescriptor(HTMLInputElement.prototype,'value')?.set;setter?.call(input,value);input.dispatchEvent(new Event('input',{bubbles:true}));input.dispatchEvent(new Event('change',{bubbles:true}));};
  async function createWithCanvasDialog(categoryId,name,maxMembers){
    const tab=document.querySelector(`a[href="#tab-${CSS.escape(String(categoryId))}"]`);
    if(!tab)throw new Error('The selected group set is not available in Canvas. Reload the page and try again.');
    tab.click();
    const panel=await waitFor(()=>document.querySelector(`#tab-${CSS.escape(String(categoryId))}`));
    const add=await waitFor(()=>[...panel.querySelectorAll('button.add-group[title="Add Group"]')].find((button)=>isVisible(button)&&!button.disabled),10000,'Canvas did not make Add Group available.');
    add.click();
    const nameInput=await waitFor(()=>{const input=visibleOne('#group_name');return input&&!input.disabled?input:null;},10000,'Canvas did not open the Add Group dialog.');
    setInput(nameInput,name);
    if(maxMembers){const membershipInput=visibleOne('#group_max_membership');if(!membershipInput)throw new Error('Canvas could not find Group Membership Limit.');setInput(membershipInput,String(maxMembers));}
    const save=await waitFor(()=>{const button=visibleOne('[data-testid="group-modal-save-button"]');return button&&!button.disabled?button:null;},10000,'Canvas did not enable Save Group.');
    save.click();
    await waitFor(()=>!isVisible(nameInput),20000,`Canvas is still saving “${name}”. Check the open Add Group dialog for a Canvas error, then reload the page before trying again.`);
    await waitFor(()=>[...panel.querySelectorAll('button.add-group[title="Add Group"]')].some((button)=>isVisible(button)&&!button.disabled),10000,'Canvas saved the group but is not ready for the next one. Reload the page before trying again.');
  }

  const assignPanel=make('section','gtbg-panel');assignPanel.id='gtbg-assign-panel';assignPanel.setAttribute('aria-label','Student group assignment');
  const assignTitle=make('h2','', 'Assign a student');const assignIntro=make('p','', 'Search unassigned students, select one, then choose the destination group.');const assignGrid=make('div','gtbg-assign-grid');
  const assignCategory=make('select');const studentSearch=make('input');studentSearch.type='search';studentSearch.placeholder='Search by name';studentSearch.setAttribute('autocomplete','off');const destination=make('select');const assign=make('button','gtbg-create','Assign to group');assign.type='button';
  const studentList=make('div','gtbg-student-list');studentList.setAttribute('role','listbox');studentList.setAttribute('aria-label','Matching unassigned students');const assignStatus=make('p','gtbg-status','Loading students and groups…');assignStatus.setAttribute('aria-live','polite');
  assignGrid.append(field('Group set',assignCategory),field('Find student',studentSearch),field('Destination group',destination),assign,studentList);assignPanel.append(assignTitle,assignIntro,assignGrid,assignStatus);
  const workspace=make('section','gtw-workspace');workspace.setAttribute('aria-label','Course teams workspace');const hero=make('header','gtw-hero');const heroCopy=make('div');heroCopy.append(make('p','gtw-kicker','Canvas workspace'),make('h1','','Course teams'));const heroActions=make('div','gtw-hero-actions');const peopleLink=make('a','gtw-people-link','People');peopleLink.href=`/courses/${courseId}/users`;peopleLink.setAttribute('aria-label','Return to the People roster');const originalToggle=make('button','gtw-original-toggle','View original page');originalToggle.type='button';originalToggle.setAttribute('aria-pressed','false');heroActions.append(peopleLink,originalToggle);hero.append(heroCopy,make('p','','Create teams, then open a team card to add students directly.'),heroActions);const tools=make('div','gtw-tools');tools.append(panel);workspace.append(hero,tools);anchor.before(workspace);
  const organizerStyles=[...document.head.querySelectorAll('style')].filter((node)=>node.textContent.includes('.gtw-')||node.textContent.includes('.gtbg-'));organizerStyles.forEach((node)=>node.dataset.gtwOrganizerStyle='true');const originalViewStyle=make('style');originalViewStyle.textContent=`.gtw-hero-actions{display:flex;gap:.45rem;align-items:center}.gtw-people-link,.gtw-original-toggle{min-height:34px;padding:0 .7rem;border:1px solid #a8d9f5;border-radius:999px;background:#fff;color:#06476e;font:800 .74rem/34px system-ui,sans-serif;cursor:pointer;text-decoration:none}.gtw-people-link:hover,.gtw-original-toggle:hover{background:#edf7fc}body.gtw-original-view .gtw-tools,body.gtw-original-view .gtw-team-controls,body.gtw-original-view .gtw-group-section,body.gtw-original-view .gtw-capacity,body.gtw-original-view .gtw-section-badge,body.gtw-original-view .gtw-search-match,body.gtw-original-view .gtw-card-add,body.gtw-original-view .gtw-roster-toggle,body.gtw-original-view .gtw-section-header{display:none!important}`;document.head.append(originalViewStyle);originalToggle.addEventListener('click',()=>{const original=document.body.classList.toggle('gtw-original-view');organizerStyles.forEach((node)=>node.disabled=original);originalToggle.textContent=original?'Return to organizer':'View original page';originalToggle.setAttribute('aria-pressed',String(original));});
  const dashboard=make('section','gtw-balance-panel');dashboard.setAttribute('aria-label','Team capacity summary');const dashboardTitle=make('h2','','Team capacity');const dashboardList=make('div','gtw-balance-list');const undo=make('button','gtw-undo','Undo last assignment');undo.type='button';undo.disabled=true;dashboard.append(dashboardTitle,dashboardList,undo);tools.append(dashboard);let lastAssignment=null;
  const recordLastAssignment=(userId,groupId,name)=>{lastAssignment={userId:String(userId).replace(/^user_/,'') ,groupId:String(groupId),name};undo.textContent=`Undo add: ${name}`;undo.disabled=false;};
  undo.addEventListener('click',async()=>{if(!lastAssignment)return;const assignment=lastAssignment;if(!window.confirm(`Remove ${assignment.name} from the team?`))return;undo.disabled=true;undo.textContent='Undoing…';try{await api(`/groups/${encodeURIComponent(assignment.groupId)}/users/${encodeURIComponent(assignment.userId)}`,{method:'DELETE'});lastAssignment=null;location.reload();}catch(error){undo.textContent=`Undo failed: ${error.message}`;undo.disabled=false;}});
  function addRosterToggles(){
    document.querySelectorAll('.unassigned-students').forEach((roster,index)=>{
      if(roster.dataset.gtwRosterReady==='true')return;
      const heading=roster.querySelector('.group-heading'),list=roster.querySelector('.ui-cnvs-scrollable');if(!heading||!list)return;
      roster.dataset.gtwRosterReady='true';roster.classList.add('gtw-roster-collapsed');
      const listId=`gtw-roster-list-${index}-${Date.now()}`;list.id=list.id||listId;
      const toggle=make('button','gtw-roster-toggle','Browse roster');toggle.type='button';toggle.setAttribute('aria-controls',list.id);toggle.setAttribute('aria-expanded','false');
      toggle.addEventListener('click',()=>{const collapsed=roster.classList.toggle('gtw-roster-collapsed');toggle.textContent=collapsed?'Browse roster':'Hide roster';toggle.setAttribute('aria-expanded',String(!collapsed));});heading.after(toggle);
    });
  }
  addRosterToggles();new MutationObserver(addRosterToggles).observe(document.body,{childList:true,subtree:true});
  const sectionByUser=new Map(),sectionNames=new Map();let sectionsReady=false;
  const sectionCode=(section)=>[...String(section||'').split('/').filter(Boolean)].reverse().find((part)=>/^[A-Z]{2,8}$/.test(part))||String(section||'').trim();
  function populateSectionPrefixes(){const selected=prefix.value,codes=[...new Set([...sectionNames.values()].map(sectionCode).filter(Boolean))].sort((a,b)=>a.localeCompare(b));prefix.replaceChildren(make('option','','Team'),...codes.map((code)=>make('option','',code)));prefix.value=codes.includes(selected)?selected:(codes.length===1?codes[0]:'Team');}
  function sectionBadge(section){const short=sectionCode(section);const badge=make('span','gtw-section-badge',`Section: ${short}`);badge.dataset.sectionColor=String([...short].reduce((sum,char)=>sum+char.charCodeAt(0),0)%4);return badge;}
  function enhanceUnassignedStudents(){document.querySelectorAll('.unassigned-students').forEach((roster)=>{const list=roster.querySelector('.collectionViewItems');if(!list)return;const rows=[...list.querySelectorAll(':scope>.group-user')];rows.forEach((row)=>{const link=row.querySelector('.assign-to-group[data-user-id]'),name=row.querySelector('.group-user-name'),section=sectionNames.get(sectionByUser.get(String(link?.dataset.userId||'').replace(/^user_/,'')));if(link&&name&&section&&!row.querySelector('.gtw-section-badge'))name.after(sectionBadge(section));row.dataset.gtwSection=section||'Unassigned';});if(!sectionsReady||roster.dataset.gtwGroupedCount===String(rows.length))return;roster.dataset.gtwGroupedCount=String(rows.length);list.querySelectorAll('.gtw-section-header').forEach((header)=>header.remove());const groups=new Map();rows.forEach((row)=>{const key=row.dataset.gtwSection||'Unassigned';if(!groups.has(key))groups.set(key,[]);groups.get(key).push(row);});[...groups.entries()].sort(([a],[b])=>a.localeCompare(b)).forEach(([section,members],index)=>{const short=[...section.split('/').filter(Boolean)].reverse().find((part)=>/^[A-Z]{2,6}$/.test(part))||section;const header=make('li','gtw-section-header');const toggle=make('button','gtw-section-toggle',`Section: ${short} (${members.length})`);toggle.type='button';toggle.setAttribute('aria-expanded','true');toggle.dataset.sectionColor=String([...short].reduce((sum,char)=>sum+char.charCodeAt(0),0)%4);toggle.addEventListener('click',()=>{const closed=toggle.getAttribute('aria-expanded')==='false';toggle.setAttribute('aria-expanded',String(closed));members.forEach((member)=>member.classList.toggle('gtw-section-collapsed',!closed));});header.append(toggle);list.append(header,...members);});});}
  api(`/courses/${courseId}/sections?per_page=100`).then(async(sections)=>{sections.forEach((section)=>sectionNames.set(String(section.id),section.name));populateSectionPrefixes();await Promise.all(sections.map(async(section)=>{try{const enrollments=await api(`/sections/${section.id}/enrollments?type[]=StudentEnrollment&per_page=100`);enrollments.forEach((enrollment)=>sectionByUser.set(String(enrollment.user_id),String(section.id)));}catch(_){}}));enhanceTeamCards();enhanceUnassignedStudents();}).catch(()=>{});
  api(`/courses/${courseId}/users?enrollment_type[]=student&include[]=enrollments&per_page=100`).then((users)=>{users.forEach((user)=>{const section=user.enrollments?.find((enrollment)=>enrollment.course_section_id)?.course_section_id;if(section)sectionByUser.set(String(user.id),String(section));});sectionsReady=true;enhanceTeamCards();enhanceUnassignedStudents();}).catch(()=>{sectionsReady=true;});
  function enhanceTeamCards(){
    document.querySelectorAll('.groups-list>.group[data-id]').forEach((card)=>{
      const users=card.querySelector('.group-users');if(!users)return;
      let editor=users.querySelector('.gtw-card-add');
      if(!editor){
        editor=make('div','gtw-card-add');const input=make('input');input.type='search';input.placeholder='Add a student…';input.setAttribute('aria-label','Search unassigned students to add to this team');const options=make('div','gtw-card-options');const note=make('span','gtw-card-note','Type at least two letters to search unassigned students.');editor.append(input,options,note);users.append(editor);
        const render=()=>{const query=input.value.trim().toLocaleLowerCase();options.replaceChildren();if(query.length<2){note.textContent='Type at least two letters to search unassigned students.';return;}if(!sectionsReady){note.textContent='Loading section information…';return;}const memberSections=new Set([...card.querySelectorAll('[data-testid="groupUserMenu"]')].map((item)=>sectionByUser.get(String(item.dataset.userid))).filter(Boolean));if(memberSections.size>1){note.textContent='This team already has students from multiple sections. Move them before adding more.';return;}const lockedSection=[...memberSections][0];const tab=card.closest('.tab-panel');const matches=[...tab.querySelectorAll('.unassigned-students .group-user')].map((row)=>{const link=row.querySelector('.assign-to-group[data-user-id]');const name=row.querySelector('.group-user-name')?.textContent.replace(/\s+/g,' ').trim();const userId=String(link?.dataset.userId||'').replace(/^user_/,'');return link&&name?{link,name,userId}:null;}).filter(Boolean).filter((student)=>student.name.toLocaleLowerCase().includes(query)&&(!lockedSection||sectionByUser.get(student.userId)===lockedSection)).slice(0,6);if(!matches.length){note.textContent=lockedSection?'No matching unassigned students are in this team’s section.':'No unassigned students match that search.';return;}note.textContent=lockedSection?'Choose a student from this team’s section.':'Choose the first student; this sets the team section.';matches.forEach((student)=>{const option=make('button','gtw-card-option',student.name);option.type='button';option.addEventListener('click',async()=>{option.disabled=true;note.textContent='Adding student…';student.link.click();try{const target=await waitFor(()=>document.querySelector(`.set-group[data-group-id="${CSS.escape(String(card.dataset.id))}"]`),5000,'Canvas did not open its group picker.');target.click();recordLastAssignment(student.userId,card.dataset.id,student.name);input.value='';options.replaceChildren();note.textContent='Student added. Undo is available above.';}catch(error){note.textContent=error.message;option.disabled=false;}});options.append(option);});};input.addEventListener('input',render);
      }
      card.querySelectorAll('[data-testid="groupUserMenu"]').forEach((menu)=>{const row=menu.closest('.group-user'),name=row?.querySelector('.group-user-name'),section=sectionNames.get(sectionByUser.get(String(menu.dataset.userid)));if(!row||!name||!section||row.querySelector('.gtw-section-badge'))return;name.after(sectionBadge(section));});
      const summary=card.querySelector('.group-summary')?.textContent||'';const match=summary.match(/(\d+)\s*\/\s*(\d+)\s*students/i);editor.hidden=Boolean(match&&Number(match[1])>=Number(match[2]));
    });
  }
  let cardEnhanceQueued=false;const cardObserver=new MutationObserver(()=>{if(cardEnhanceQueued)return;cardEnhanceQueued=true;setTimeout(()=>{cardEnhanceQueued=false;enhanceTeamCards();enhanceUnassignedStudents();refreshCapacityLabels();updateWorkspaceSummary();},80);});cardObserver.observe(document.body,{childList:true,subtree:true,characterData:true});enhanceTeamCards();enhanceUnassignedStudents();
  function addTeamControls(){
    document.querySelectorAll('.tab-panel').forEach((tab)=>{const list=tab.querySelector('.groups-list');if(!list)return;const cards=[...list.querySelectorAll(':scope>.group')],groupCount=cards.length,existingControls=tab.querySelector('.gtw-team-controls'),needsRefresh=!existingControls||existingControls.dataset.gtwGroupCount!==String(groupCount)||cards.some((card)=>!card.dataset.gtwGroupSection)||(groupCount>0&&!list.querySelector(':scope>.gtw-group-section'));if(!needsRefresh)return;existingControls?.remove();const controls=make('div','gtw-team-controls');controls.dataset.gtwGroupCount=String(groupCount);const search=make('input');search.type='search';search.placeholder='Find a team or student';search.setAttribute('aria-label','Find a team or assigned student');const sectionFilter=make('select');sectionFilter.setAttribute('aria-label','Filter teams by section');const all=make('button','gtw-control','All');const open=make('button','gtw-control','Open');const incomplete=make('button','gtw-control','Incomplete');const full=make('button','gtw-control','Full');const expand=make('button','gtw-control','Expand all');const collapse=make('button','gtw-control','Collapse all');const copy=make('button','gtw-control','Copy team list');[all,open,incomplete,full].forEach((button)=>{button.type='button';button.setAttribute('aria-pressed',String(button===all));});[expand,collapse,copy].forEach((button)=>button.type='button');controls.append(search,sectionFilter,all,open,incomplete,full,expand,collapse,copy);list.before(controls);
      const groupSection=(card)=>{const name=[card.querySelector('.group-name'),card.querySelector('.group-heading'),card].map((node)=>node?.textContent.replace(/\s+/g,' ').trim()||'').find(Boolean)||'';const known=[...new Set([...sectionNames.values()].map(sectionCode).filter(Boolean))].sort((a,b)=>b.length-a.length);const knownMatch=known.find((code)=>new RegExp(`(?:^|\\s)${code.replace(/[.*+?^${}()|[\\]\\\\]/g,'\\$&')}(?=\\s|\\d|[-_])`,'i').test(name));return (knownMatch||name.match(/\b([A-Za-z]{2,8})(?=\s*[-_]?\s*\d)/)?.[1]||'Other').toUpperCase();};
      const organizeSections=()=>{const cards=[...list.querySelectorAll(':scope>.group')],selected=list.dataset.gtwSectionFilter||sectionFilter.value;cards.forEach((card)=>card.dataset.gtwGroupSection=groupSection(card));const sections=[...new Set(cards.map((card)=>card.dataset.gtwGroupSection))].sort((a,b)=>a.localeCompare(b));sectionFilter.replaceChildren(make('option','','All sections'),...sections.map((section)=>make('option','',section)));sectionFilter.value=sections.includes(selected)?selected:'All sections';list.querySelectorAll(':scope>.gtw-group-section').forEach((heading)=>heading.remove());sections.forEach((section)=>{const heading=make('h3','gtw-group-section',section==='Other'?'Other teams':`Section ${section}`);heading.dataset.gtwGroupSection=section;list.append(heading,...cards.filter((card)=>card.dataset.gtwGroupSection===section));});};
      organizeSections();let mode='all';const capacity=(card)=>{const text=card.querySelector('.group-summary')?.textContent||'';const match=text.match(/(\d+)\s*\/\s*(\d+)/);return match?{used:+match[1],max:+match[2]}:null;};const render=()=>{const query=search.value.trim().toLowerCase(),selectedSection=sectionFilter.value;list.dataset.gtwSectionFilter=selectedSection;list.querySelectorAll(':scope>.group').forEach((card)=>{const cap=capacity(card),name=card.querySelector('.group-name')?.textContent.toLowerCase()||'',members=card.dataset.gtwMemberNames||[...card.querySelectorAll('.group-user-name')].map((member)=>member.textContent.toLowerCase()).join(' '),matches=!query||name.includes(query)||members.includes(query),inSection=selectedSection==='All sections'||card.dataset.gtwGroupSection===selectedSection,isOpen=Boolean(cap&&cap.used<cap.max),isIncomplete=Boolean(cap&&cap.used>0&&cap.used<cap.max),hide=!inSection||!matches||(mode==='open'&&!isOpen)||(mode==='incomplete'&&!isIncomplete)||(mode==='full'&&(!cap||cap.used<cap.max));card.classList.toggle('gtw-hidden-card',hide);card.hidden=hide;let badge=card.querySelector('.gtw-capacity');if(cap){if(!badge){badge=make('span','gtw-capacity');card.querySelector('.group-summary')?.after(badge);}const remaining=cap.max-cap.used;badge.textContent=remaining===0?'Full':`${remaining} spot${remaining===1?'':'s'} left`;badge.className=`gtw-capacity${remaining===0?' is-full':remaining===1?' is-near':''}`;}});list.querySelectorAll(':scope>.gtw-group-section').forEach((heading)=>{const section=heading.dataset.gtwGroupSection;heading.hidden=!([...list.querySelectorAll(':scope>.group')].some((card)=>card.dataset.gtwGroupSection===section&&!card.hidden));});updateWorkspaceSummary();};[all,open,incomplete,full].forEach((button)=>button.addEventListener('click',()=>{mode=button.textContent.toLowerCase();[all,open,incomplete,full].forEach((item)=>item.setAttribute('aria-pressed',String(item===button)));render();}));search.addEventListener('input',render);sectionFilter.addEventListener('change',render);sectionFilter.addEventListener('input',render);expand.addEventListener('click',()=>list.querySelectorAll('.group-collapsed .group-heading').forEach((item)=>item.click()));collapse.addEventListener('click',()=>list.querySelectorAll('.group-expanded .group-heading').forEach((item)=>item.click()));copy.addEventListener('click',async()=>{const lines=[...list.querySelectorAll(':scope>.group')].map((card)=>{const name=card.querySelector('.group-name')?.textContent.trim()||'Unnamed team',summary=card.querySelector('.group-summary')?.textContent.trim()||'',members=JSON.parse(card.dataset.gtwMemberList||'[]');return `${name} — ${summary}${members.length?`\n  ${members.join(', ')}`:''}`;});const text=lines.join('\n');try{await navigator.clipboard.writeText(text);copy.textContent='Copied';}catch(_){copy.textContent='Copy unavailable';}setTimeout(()=>copy.textContent='Copy team list',1500);});render();});
  }
  function updateWorkspaceSummary(){const cards=[...document.querySelectorAll('.groups-list>.group')],bySection=new Map();let full=0,incomplete=0,seats=0;cards.forEach((card)=>{const match=card.querySelector('.group-summary')?.textContent.match(/(\d+)\s*\/\s*(\d+)/),section=card.dataset.gtwGroupSection||'Other';if(!bySection.has(section))bySection.set(section,{teams:0,seats:0,unassigned:0});const item=bySection.get(section);item.teams++;if(match){const used=Number(match[1]),maximum=Number(match[2]),remaining=Math.max(0,maximum-used);item.seats+=remaining;seats+=remaining;if(remaining===0)full++;else if(used>0)incomplete++;}});document.querySelectorAll('.unassigned-students .group-user').forEach((row)=>{const section=row.dataset.gtwSection||'Other';if(!bySection.has(section))bySection.set(section,{teams:0,seats:0,unassigned:0});bySection.get(section).unassigned++;});dashboardList.replaceChildren(make('span','gtw-balance-item',`${cards.length} teams`),make('span','gtw-balance-item',`${full} full`),make('span','gtw-balance-item',`${incomplete} incomplete`),make('span','gtw-balance-item',`${seats} open seat${seats===1?'':'s'}`),...[...bySection.entries()].sort(([a],[b])=>a.localeCompare(b)).map(([section,item])=>make('span','gtw-balance-item',`${sectionCode(section)}: ${item.teams} teams · ${item.unassigned} unassigned · ${item.seats} seats`)));}
  function refreshCapacityLabels(){document.querySelectorAll('.groups-list>.group').forEach((card)=>{const summary=card.querySelector('.group-summary'),match=summary?.textContent.match(/(\d+)\s*\/\s*(\d+)/);if(!summary||!match)return;const used=Number(match[1]),maximum=Number(match[2]),remaining=Math.max(0,maximum-used);let badge=card.querySelector('.gtw-capacity');if(!badge){badge=make('span','gtw-capacity');summary.after(badge);}const label=remaining===0?'Full':`${remaining} spot${remaining===1?'':'s'} left`;if(badge.textContent!==label)badge.textContent=label;badge.className=`gtw-capacity${remaining===0?' is-full':remaining===1?' is-near':''}`;});}
  addTeamControls();refreshCapacityLabels();updateWorkspaceSummary();new MutationObserver(addTeamControls).observe(document.body,{childList:true,subtree:true});
  function indexTeamMembers(){document.querySelectorAll('.groups-list>.group[data-id]').forEach((card)=>{if(card.dataset.gtwMemberIndexing==='true'||card.dataset.gtwMemberNames!==undefined)return;card.dataset.gtwMemberIndexing='true';api(`/groups/${encodeURIComponent(card.dataset.id)}/users?per_page=100`).then((users)=>{const names=users.map((user)=>user.name||'');card.dataset.gtwMemberNames=names.join(' ').toLowerCase();card.dataset.gtwMemberList=JSON.stringify(names);document.querySelectorAll('.gtw-team-controls input').forEach((input)=>input.dispatchEvent(new Event('input')));}).catch(()=>{card.dataset.gtwMemberNames='';card.dataset.gtwMemberList='[]';});});}
  indexTeamMembers();new MutationObserver(indexTeamMembers).observe(document.body,{childList:true,subtree:true});
  document.addEventListener('input',(event)=>{if(!event.target.matches('.gtw-team-controls input'))return;const query=event.target.value.trim().toLowerCase();event.target.closest('.tab-panel')?.querySelectorAll('.groups-list>.group').forEach((card)=>{const names=JSON.parse(card.dataset.gtwMemberList||'[]'),match=query&&names.find((name)=>name.toLowerCase().includes(query));let label=card.querySelector('.gtw-search-match');if(!match){label?.remove();if(card.dataset.gtwSearchOpened==='true'){card.querySelector('.toggle-group')?.click();delete card.dataset.gtwSearchOpened;}return;}if(card.classList.contains('group-collapsed')){card.querySelector('.toggle-group')?.click();card.dataset.gtwSearchOpened='true';}if(!label){label=make('span','gtw-search-match');card.querySelector('.group-summary')?.after(label);}label.textContent=`Match: ${match}`;});});
  let assignmentScrollLock=null;const restoreAssignmentScroll=()=>{if(!assignmentScrollLock||Date.now()>assignmentScrollLock.until){assignmentScrollLock=null;return;}window.scrollTo(assignmentScrollLock.left,assignmentScrollLock.top);};
  document.addEventListener('click',(event)=>{const action=event.target.closest('.assign-to-group,.set-group');if(!action)return;assignmentScrollLock={left:window.scrollX,top:window.scrollY,until:Date.now()+1400};event.preventDefault();[0,60,220,500,900,1300].forEach((delay)=>setTimeout(restoreAssignmentScroll,delay));if(action.classList.contains('set-group')){const focusSearch=()=>document.querySelector(`.groups-list>.group[data-id="${CSS.escape(String(action.dataset.groupId))}"] .gtw-card-add:not([hidden]) input`)?.focus({preventScroll:true});setTimeout(focusSearch,450);setTimeout(focusSearch,900);}},true);
  window.addEventListener('scroll',()=>{if(assignmentScrollLock)requestAnimationFrame(restoreAssignmentScroll);},{passive:true});
  let students=[],selectedStudent=null;
  const setAssignStatus=(message,kind='')=>{assignStatus.textContent=message;assignStatus.className=`gtbg-status${kind?` is-${kind}`:''}`;};
  const sleep=(milliseconds)=>new Promise((resolve)=>setTimeout(resolve,milliseconds));
  const unassignedRows=(groupPanel)=>[...groupPanel.querySelectorAll('.unassigned-students .group-user')];
  async function waitForUnassignedRows(groupPanel){
    if(unassignedRows(groupPanel).length)return unassignedRows(groupPanel);
    return new Promise((resolve)=>{const observer=new MutationObserver(()=>{const rows=unassignedRows(groupPanel);if(rows.length){observer.disconnect();clearTimeout(timeout);resolve(rows);}});const timeout=setTimeout(()=>{observer.disconnect();resolve(unassignedRows(groupPanel));},5000);observer.observe(groupPanel,{childList:true,subtree:true});});
  }
  function renderStudents(){
    const query=studentSearch.value.trim().toLocaleLowerCase();const matches=students.filter((student)=>!query||student.name.toLocaleLowerCase().includes(query));studentList.replaceChildren();
    matches.slice(0,80).forEach((student)=>{const button=make('button','gtbg-student',student.name);button.type='button';button.setAttribute('role','option');button.setAttribute('aria-selected',String(selectedStudent?.userId===student.userId));if(selectedStudent?.userId===student.userId)button.classList.add('is-selected');button.addEventListener('click',()=>{selectedStudent=student;renderStudents();setAssignStatus(`Selected ${student.name}. Choose a destination group, then assign.`);});studentList.append(button);});
    if(!matches.length)studentList.append(make('span','gtbg-status','No unassigned students match that search.'));
    else if(matches.length>80)studentList.append(make('span','gtbg-status',`Showing the first 80 of ${matches.length} matches. Refine the search to narrow it.`));
  }
  async function loadAssignmentGroups(){
    const groups=await api(`/group_categories/${encodeURIComponent(assignCategory.value)}/groups?per_page=100`);destination.replaceChildren();groups.sort((a,b)=>a.name.localeCompare(b.name,undefined,{numeric:true})).forEach((group)=>{const option=make('option','',group.name);option.value=group.id;destination.append(option);});assign.disabled=!groups.length;if(!groups.length)setAssignStatus('Create at least one group in this group set before assigning students.','error');
  }
  async function loadStudents(){
    selectedStudent=null;const categoryId=assignCategory.value;const tab=document.querySelector(`a[href="#tab-${CSS.escape(String(categoryId))}"]`);tab?.click();await sleep(180);const groupPanel=document.querySelector(`#tab-${CSS.escape(String(categoryId))}`);if(!groupPanel){students=[];renderStudents();setAssignStatus('Canvas could not open the selected group set. Reload and try again.','error');return;}
    const rows=await waitForUnassignedRows(groupPanel);students=rows.map((row)=>{const assignLink=row.querySelector('.assign-to-group[data-user-id]');const name=row.querySelector('.group-user-name')?.textContent.replace(/\s+/g,' ').trim();return assignLink&&name?{userId:assignLink.dataset.userId,name,assignLink}:null;}).filter(Boolean);renderStudents();if(students.length)setAssignStatus(`${students.length} unassigned student${students.length===1?'':'s'} available. Search or select one.`);else setAssignStatus('There are no unassigned students in this group set.');
  }
  async function refreshAssignment(){
    setAssignStatus('Loading students and groups…');await Promise.all([loadAssignmentGroups(),loadStudents()]);
  }
  assign.addEventListener('click',async()=>{
    if(!selectedStudent){setAssignStatus('Select a student first.','error');return;}if(!destination.value){setAssignStatus('Select a destination group first.','error');return;}
    assign.disabled=true;setAssignStatus('Assigning student…');
    try{const liveAssignLink=document.querySelector(`#tab-${CSS.escape(String(assignCategory.value))} .unassigned-students .assign-to-group[data-user-id="${CSS.escape(String(selectedStudent.userId))}"]`);if(!liveAssignLink)throw new Error('Canvas could not find that student in the current roster. Refresh and try again.');liveAssignLink.click();const nativeTarget=await waitFor(()=>document.querySelector(`.set-group[data-group-id="${CSS.escape(String(destination.value))}"]`),5000,'Canvas did not open its group picker.');nativeTarget.click();recordLastAssignment(selectedStudent.userId,destination.value,selectedStudent.name);await sleep(300);students=students.filter((student)=>student.userId!==selectedStudent.userId);selectedStudent=null;studentSearch.value='';renderStudents();setAssignStatus('Student assigned. Undo is available above.','success');}
    catch(error){setAssignStatus(`Could not assign student: ${error.message}`,'error');}
    finally{assign.disabled=!destination.value;}
  });
  studentSearch.addEventListener('input',renderStudents);studentSearch.addEventListener('focus',()=>{if(!students.length)loadStudents().catch((error)=>setAssignStatus(error.message,'error'));});assignCategory.addEventListener('change',()=>refreshAssignment().catch((error)=>setAssignStatus(error.message,'error')));

  async function loadCategories(){
    const categories=await api(`/courses/${courseId}/group_categories?per_page=100`);
    category.replaceChildren();categories.forEach((item)=>{const option=make('option','',item.name);option.value=item.id;category.append(option);});
    assignCategory.replaceChildren();categories.forEach((item)=>{const option=make('option','',item.name);option.value=item.id;assignCategory.append(option);});
    if(!categories.length){create.disabled=true;setStatus('No editable group sets are available.','error');return;}
    setStatus('Ready. Choose a range and create the groups.');
  }
  create.addEventListener('click',async()=>{
    const first=Number(start.value),last=Number(end.value),maxMembers=limit.value===''?null:Number(limit.value),namePrefix=prefix.value.trim().replace(/\s+$/,'');
    if(!namePrefix||!Number.isInteger(first)||!Number.isInteger(last)||first<1||last<first||last-first>99||!(maxMembers===null||(Number.isInteger(maxMembers)&&maxMembers>0))){setStatus('Use a prefix, a range from 1 to 100 groups, and an optional whole-number maximum size.','error');return;}
    const names=Array.from({length:last-first+1},(_,index)=>`${namePrefix} ${first+index}`);
    let existing=[];try{existing=await api(`/group_categories/${encodeURIComponent(category.value)}/groups?per_page=100`);}catch(error){setStatus(error.message,'error');return;}
    const used=new Set(existing.map((group)=>group.name));const pending=names.filter((name)=>!used.has(name));
    if(!pending.length){setStatus('Every group in that range already exists.','error');return;}
    const suffix=pending.length===names.length?'':` (${names.length-pending.length} existing name${names.length-pending.length===1?'':'s'} will be skipped)`;
    if(!window.confirm(`Create ${pending.length} group${pending.length===1?'':'s'} in this group set${suffix}?`))return;
    create.disabled=true;
    let created=0;
    try{
      for(let index=0;index<pending.length;index++){
        setStatus(`Creating ${index+1} of ${pending.length} groups…`);
        await createWithCanvasDialog(category.value,pending[index],maxMembers);
        created++;
      }
      setStatus(`Created ${pending.length} group${pending.length===1?'':'s'}. Reloading Canvas…`,'success');
      setTimeout(()=>location.reload(),800);
    }catch(error){setStatus(`Stopped: ${error.message}${created?`. ${created} group${created===1?' was':'s were'} created before the error.`:''}`,'error');create.disabled=false;}
  });
  loadCategories().catch((error)=>{create.disabled=true;setStatus(error.message,'error');});
})();

(function () {
  'use strict';

  // Canvas displays this acknowledgement in either the parent launch page or
  // its same-origin tool-launch frame.  Limit the click to the specific tool
  // heading and exact acknowledgement control; it never reads or changes
  // course or cross-listing data.
  if (!['gatech.instructure.com','crosslist.eduapps.gatech.edu'].includes(location.hostname)) return;

  function rootsToSearch() {
    const roots=[document],seen=new Set(roots);
    for(let index=0;index<roots.length;index++) {
      roots[index].querySelectorAll('*').forEach((node) => {
        if(node.shadowRoot&&!seen.has(node.shadowRoot)){seen.add(node.shadowRoot);roots.push(node.shadowRoot);}
      });
    }
    return roots;
  }

  function continueToCombineCourses() {
    const button=rootsToSearch().flatMap((root)=>[...root.querySelectorAll('button')]).find((node)=>
      node.textContent.replace(/\s+/g,' ').trim()==='I understand these guidelines, Continue'
    );
  // In Firefox the acknowledgement may be rendered by Canvas's tool-launch
  // frame or by the Crosslist LTI document itself.  The exact heading and
  // exact action together identify Combine Courses without touching another
  // Canvas tool or a Crosslist course action.
    if(!button||!document.body.textContent.replace(/\s+/g,' ').includes('Combine Courses'))return false;
    if(button.dataset.gtccAutoContinued==='true')return false;
    button.dataset.gtccAutoContinued = 'true';
    button.click();
    return true;
  }

  if (!continueToCombineCourses()) {
    const retry=setInterval(()=>{if(continueToCombineCourses())clearInterval(retry);},250);
    setTimeout(()=>clearInterval(retry),20000);
  }
})();

(function () {
  'use strict';
  // Firefox may retain Canvas's origin for the LTI launch document before the
  // Crosslist application takes over.  Run in either tool frame, but never in
  // a normal top-level Canvas page.
  if(!['gatech.instructure.com','crosslist.eduapps.gatech.edu'].includes(location.hostname))return;
  if(location.hostname==='gatech.instructure.com'&&window.top===window)return;

  const STATE_KEY='gtcc-organizer-state-v1';
  const defaults={ collapsePast:true };
  const settings=Object.fromEntries(Object.entries(defaults).map(([key,value])=>[key,typeof GM_getValue==='function'?GM_getValue(key,value):value]));
  const css=`
    .gtcc-toolbar{display:flex;flex-wrap:wrap;align-items:end;gap:.65rem;margin:0 0 1.5rem;padding:1rem 1.1rem;border:1px solid #d9e1e7;border-radius:12px;background:linear-gradient(135deg,#f8fbfc 0%,#f1f5f7 100%);color:#1f303c;box-shadow:0 6px 18px rgba(24,52,70,.09)}
    .gtcc-field{display:flex;flex:1 1 300px;flex-direction:column;gap:.35rem;margin:0;color:#384b58;font-weight:700;font-size:.78rem;letter-spacing:.025em;text-transform:uppercase}.gtcc-input{height:42px;padding:0 .85rem;border:1px solid #b7c5ce;border-radius:8px;background:#fff;color:#1f303c;font:400 .95rem/1.2 system-ui,-apple-system,BlinkMacSystemFont,"Segoe UI",sans-serif;letter-spacing:normal;text-transform:none;box-sizing:border-box;box-shadow:inset 0 1px 2px rgba(24,52,70,.05);transition:border-color .16s ease,box-shadow .16s ease}.gtcc-input::placeholder{color:#70808c}.gtcc-input:focus{outline:0;border-color:#005a9c;box-shadow:0 0 0 3px rgba(0,90,156,.18)}
    .gtcc-button,.gtcc-term-toggle{min-height:40px;padding:.4rem .85rem;border:1px solid #b7c5ce;border-radius:8px;background:#fff;color:#243844;font:600 .88rem/1.2 system-ui,-apple-system,BlinkMacSystemFont,"Segoe UI",sans-serif;cursor:pointer;box-shadow:0 1px 2px rgba(24,52,70,.08);transition:transform .16s ease,border-color .16s ease,background .16s ease,box-shadow .16s ease}.gtcc-button:hover,.gtcc-term-toggle:hover{border-color:#005a9c;background:#f4f9fc;box-shadow:0 3px 8px rgba(24,52,70,.12);transform:translateY(-1px)}.gtcc-button:focus-visible,.gtcc-term-toggle:focus-visible{outline:3px solid rgba(0,90,156,.3);outline-offset:2px}.gtcc-button:first-of-type{border-color:#004f86;background:#005a9c;color:#fff}.gtcc-button:first-of-type:hover{border-color:#003f6b;background:#004f86}
    .gtcc-term-toggle{display:inline-flex;align-items:center;gap:.4rem;margin:0 .6rem .45rem 0;vertical-align:middle;min-height:32px;padding:.28rem .62rem;border-color:#c7d3da;border-radius:999px;font-size:.78rem;box-shadow:none}.gtcc-term-toggle::before{content:'▾';font-size:.8rem}.gtcc-term-toggle.gtcc-is-collapsed::before{content:'▸'}
    .gtcc-collapsed-member,.gtcc-filtered{display:none!important}.gtcc-term-match{background:#fff2a8}
    .gtcc-summary{flex:1 0 100%;margin:.1rem 0 0;padding-top:.7rem;border-top:1px solid #d9e1e7;color:#647682;font-size:.84rem}.gtcc-toolbar+.gtcc-term-member{border-radius:10px 10px 0 0}
    .gtcc-status{position:fixed;right:1rem;bottom:1rem;z-index:10000;max-width:330px;padding:.7rem .9rem;border:1px solid #eccb82;border-radius:9px;background:#fffaed;color:#573c00;font:14px/1.35 system-ui,sans-serif;box-shadow:0 8px 24px rgba(0,0,0,.18)}
    @media(prefers-reduced-motion:reduce){.gtcc-input,.gtcc-button,.gtcc-term-toggle{transition:none}.gtcc-button:hover,.gtcc-term-toggle:hover{transform:none}}
    @media(max-width:600px){.gtcc-toolbar{align-items:stretch}.gtcc-button{flex:1 1 auto}}
  `;

  function element(tag,className,text){const node=document.createElement(tag);if(className)node.className=className;if(text!==undefined)node.textContent=text;return node;}
  function clean(value){return String(value||'').replace(/\s+/g,' ').trim();}
  function normalized(value){return clean(value).toLocaleLowerCase();}
  function termInfo(text){
    const match=clean(text).match(/\b(spring|summer|fall|winter)\s*(?:semester\s*)?((?:19|20)\d{2})\b/i)||clean(text).match(/\b((?:19|20)\d{2})\s*(spring|summer|fall|winter)\b/i);
    if(!match)return null;
    const season=(match[1].match(/^\d/) ? match[2] : match[1]).toLowerCase();
    const year=Number(match[1].match(/^\d/) ? match[1] : match[2]);
    const order={winter:1,spring:2,summer:3,fall:4}[season];
    return {label:clean(text),rank:year*10+order};
  }
  function currentTermRank(){const now=new Date(),month=now.getMonth()+1;return now.getFullYear()*10+(month<=1?1:month<=5?2:month<=8?3:4);}
  function directChild(parent,node){while(node?.parentElement&&node.parentElement!==parent)node=node.parentElement;return node?.parentElement===parent?node:null;}
  function depth(node){let value=0;while(node?.parentElement){value++;node=node.parentElement;}return value;}
  function isSemesterLabel(text){return /^(?:(?:spring|summer|fall|winter)\s+(?:semester\s+)?(?:19|20)\d{2}|(?:19|20)\d{2}\s+(?:spring|summer|fall|winter))$/i.test(text);}
  function isCandidate(node){
    if(!node||!node.offsetParent||node.closest('select,option,nav,button,input,textarea,script,style'))return false;
    const text=clean(node.textContent),info=termInfo(text);
    if(!info||!isSemesterLabel(text))return false;
    const children=[...node.children];
    // The rendered semester bar is a leaf label.  Requiring the whole label
    // prevents a course container from being mistaken for a semester merely
    // because it contains a nested semester bar.
    return !children.some((child)=>termInfo(child.textContent)?.rank===info.rank);
  }

  function findTermBlocks(){
    // Crosslist renders semester bars as styled divs, sometimes wrapped with
    // their cards and sometimes followed by card siblings.  Find the lowest
    // ancestor that gives every visible semester label its own child group;
    // moving those children preserves the full card, including its existing
    // Isolate and Manage controls.
    const candidates=[...document.querySelectorAll('body *')].filter(isCandidate);
    const parents=new Map();
    candidates.forEach((heading)=>{
      for(let parent=heading.parentElement;parent;parent=parent.parentElement){
        const child=directChild(parent,heading);if(!child)continue;
        if(!parents.has(parent))parents.set(parent,new Map());
        const groups=parents.get(parent);
        if(!groups.has(child))groups.set(child,[]);
        groups.get(child).push(heading);
      }
    });
    const choices=[...parents.entries()].map(([parent,groups])=>({
      parent,
      entries:[...groups.entries()].filter(([,headings])=>headings.length===1).map(([child,[heading]])=>({child,heading,info:termInfo(clean(heading.textContent))}))
    })).filter((choice)=>choice.entries.length>=2);
    // Prefer the container with the most separate semester groups; ties go to
    // the deeper container, which avoids rearranging surrounding page chrome.
    choices.sort((a,b)=>b.entries.length-a.entries.length||depth(b.parent)-depth(a.parent));
    const choice=choices[0];if(!choice)return [];
    const {parent,entries}=choice;
    const positions=new Map([...parent.children].map((child,index)=>[child,index]));
    entries.sort((a,b)=>positions.get(a.child)-positions.get(b.child));
    return entries.map((entry,index)=>{
      const next=entries[index+1]?.child;const members=[];
      for(let node=entry.child;node&&node!==next;node=node.nextElementSibling)members.push(node);
      return {...entry,parent,members};
    });
  }

  function registerMenu(){
    if(typeof GM_registerMenuCommand!=='function')return;
    GM_registerMenuCommand(`${settings.collapsePast?'✓':'○'} Collapse older semesters`,()=>{GM_setValue('collapsePast',!settings.collapsePast);location.reload();});
    GM_registerMenuCommand('Reset Combine Courses view',()=>{localStorage.removeItem(STATE_KEY);location.reload();});
  }
  function setStatus(message){
    let status=document.getElementById('gtcc-status');
    if(!message){status?.remove();return;}
    if(!status){status=element('div','gtcc-status');status.id='gtcc-status';status.setAttribute('role','status');document.body.append(status);}
    status.textContent=message;
  }
  function organize(){
    if(document.getElementById('gtcc-toolbar'))return true;
    const blocks=findTermBlocks();if(!blocks.length)return false;
    const parent=blocks[0].parent;
    if(blocks.some((block)=>block.parent!==parent))return false;
    let saved={};try{saved=JSON.parse(localStorage.getItem(STATE_KEY)||'{}');}catch(_){}
    const collapsed=new Set(saved.collapsed||[]);
    const anchor=document.createComment('Combine Courses organizer');parent.before(anchor);
    const toolbar=element('section','gtcc-toolbar');toolbar.id='gtcc-toolbar';toolbar.setAttribute('aria-label','Combine Courses organizer');
    const label=element('label','gtcc-field','Search semesters and courses');const search=element('input','gtcc-input');search.type='search';search.placeholder='e.g. CS 1332, Fall 2026, linear algebra';search.setAttribute('aria-label','Search semesters and courses');label.append(search);
    const expand=element('button','gtcc-button','Expand all');const collapse=element('button','gtcc-button','Collapse older semesters');expand.type=collapse.type='button';const summary=element('p','gtcc-summary');summary.setAttribute('aria-live','polite');toolbar.append(label,expand,collapse,summary);anchor.after(toolbar);
    const sorted=[...blocks].sort((a,b)=>b.info.rank-a.info.rank||a.info.label.localeCompare(b.info.label));
    sorted.forEach((block)=>block.members.forEach((node)=>parent.append(node)));
    const ordered=sorted.map((block)=>({...block,members:block.members}));
    function contentNodesFor(block){
      // Some Crosslist versions place the term bar and all of its cards inside
      // one wrapper; others put the cards in following sibling nodes.  Support
      // both without changing the cards or their action controls.
      if(block.members.length>1)return block.members.slice(1);
      for(let container=block.heading.parentElement;container&&container!==block.child.parentElement;container=container.parentElement){
        const headingBranch=directChild(container,block.heading);
        const siblings=[...container.children].filter((node)=>node!==headingBranch);
        if(siblings.some((node)=>/\bIsolate\b/.test(clean(node.textContent))&&/\bManage\b/.test(clean(node.textContent))))return siblings;
      }
      return [];
    }
    ordered.forEach((block)=>{
      block.members.forEach((node,index)=>{node.classList.add('gtcc-term-member');node.dataset.gtccTerm=String(block.info.rank);if(index===0)node.classList.add('gtcc-term-header');});
      block.contentNodes=contentNodesFor(block);
      const toggle=element('button','gtcc-term-toggle','Collapse');toggle.type='button';toggle.setAttribute('aria-label',`Collapse ${block.info.label}`);block.child.before(toggle);block.toggle=toggle;
      const past=block.info.rank<currentTermRank();if(settings.collapsePast&&past&&!saved.initialized)collapsed.add(String(block.info.rank));
    });
    function save(){localStorage.setItem(STATE_KEY,JSON.stringify({collapsed:[...collapsed],initialized:true}));}
    function setCollapsed(block,closed){const key=String(block.info.rank);block.child.classList.toggle('gtcc-collapsed',closed);block.toggle.classList.toggle('gtcc-is-collapsed',closed);block.contentNodes.forEach((node)=>node.classList.toggle('gtcc-collapsed-member',closed));block.toggle.textContent=closed?'Expand':'Collapse';block.toggle.setAttribute('aria-expanded',String(!closed));block.toggle.setAttribute('aria-label',`${closed?'Expand':'Collapse'} ${block.info.label}`);closed?collapsed.add(key):collapsed.delete(key);}
    function render(){
      const query=normalized(search.value),terms=query.split(/\s+/).filter(Boolean);let visible=0;
      ordered.forEach((block)=>{const searchable=normalized(block.members.map((member)=>member.textContent).join(' '));const matches=!terms.length||terms.every((term)=>searchable.includes(term));block.members.forEach((member)=>member.classList.toggle('gtcc-filtered',!matches));if(matches)visible++;setCollapsed(block,collapsed.has(String(block.info.rank))&&!query);});
      summary.textContent=query?`Showing ${visible} of ${ordered.length} semesters matching “${search.value.trim()}”.`:`${ordered.length} semesters, newest first. Older semesters are collapsed by default.`;
      save();
    }
    ordered.forEach((block)=>block.toggle.addEventListener('click',()=>{setCollapsed(block,!block.child.classList.contains('gtcc-collapsed'));save();}));
    expand.addEventListener('click',()=>{ordered.forEach((block)=>setCollapsed(block,false));save();});
    collapse.addEventListener('click',()=>{ordered.forEach((block)=>setCollapsed(block,block.info.rank<currentTermRank()));save();});
    search.addEventListener('input',render);document.addEventListener('keydown',(event)=>{if(event.key==='/'&&!/input|textarea|select/i.test(document.activeElement?.tagName)){event.preventDefault();search.focus();}});
    render();setStatus('');return true;
  }
  function start(){
    let queued=false;
    const attempt=()=>{
      queued=false;
      if(organize()){observer.disconnect();return;}
      setStatus('Combine Courses Organizer loaded, but it has not found recognizable semester groups yet.');
    };
    const observer=new MutationObserver(()=>{
      if(queued)return;
      queued=true;setTimeout(attempt,250);
    });
    observer.observe(document.documentElement,{childList:true,subtree:true});attempt();
  }
  const style=element('style');style.textContent=css;document.head.append(style);registerMenu();start();
})();
