// ==UserScript==
// @name         Georgia Tech Canvas Course Organizer
// @namespace    https://gatech.instructure.com/
// @version      2.2.0
// @description  Adds an All Courses shortcut and a powerful searchable, filterable semester course organizer.
// @author       Ronnie Howard
// @match        https://gatech.instructure.com/
// @match        https://gatech.instructure.com/courses*
// @run-at       document-idle
// @grant        GM_getValue
// @grant        GM_setValue
// @grant        GM_registerMenuCommand
// ==/UserScript==

(function () {
  'use strict';

  const ALL_COURSES_URL = '/courses';
  const STATE_KEY = 'gtco-state-v2';
  const ENROLLMENT_CACHE_KEY = 'gtco-enrollment-counts-v1';
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

  async function getEnrollmentCounts(courseId, permanent=false) {
    const saved=readPersistentEnrollmentCache()[courseId];
    if (saved?.counts && (saved.permanent || Date.now()-saved.fetchedAt<ACTIVE_COUNT_MAX_AGE)) {
      if (permanent && !saved.permanent) persistEnrollmentCount(courseId,saved.counts,true);
      return saved.counts;
    }
    if (!enrollmentCache.has(courseId)) {
      enrollmentCache.set(courseId, (async () => {
        const people = { students:new Set(), tas:new Set(), instructors:new Set(), other:new Set() };
        let url = `/api/v1/courses/${courseId}/enrollments?per_page=100&state[]=active&state[]=invited`;
        try {
          while (url) {
            const response = await fetch(url, { credentials:'same-origin', headers:{ Accept:'application/json' } });
            if (!response.ok) return null;
            const enrollments = await response.json();
            enrollments.forEach((enrollment) => {
              const id = String(enrollment.user_id ?? enrollment.user?.id ?? enrollment.id);
              const type = enrollment.type || enrollment.role || '';
              if (type === 'StudentEnrollment') people.students.add(id);
              else if (type === 'TaEnrollment') people.tas.add(id);
              else if (type === 'TeacherEnrollment') people.instructors.add(id);
              else people.other.add(id);
            });
            url = nextPageUrl(response.headers.get('Link'));
          }
          return Object.fromEntries(Object.entries(people).map(([key,value]) => [key,value.size]));
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
