(() => {
  const assignments = [...document.querySelectorAll('.grader-assignment')];
  const search = document.querySelector('#task-search');
  const buttons = [...document.querySelectorAll('[data-task-filter]')];
  let filter = 'all';
  function apply() {
    const query = (search?.value || '').trim().toLowerCase();
    assignments.forEach((item) => {
      const matchesText = !query || item.dataset.search.toLowerCase().includes(query);
      const complete = item.dataset.complete === 'true';
      const matchesState = filter === 'all' || (filter === 'complete' ? complete : !complete);
      item.hidden = !(matchesText && matchesState);
    });
  }
  search?.addEventListener('input', apply);
  buttons.forEach((button) => button.addEventListener('click', () => {
    filter = button.dataset.taskFilter;
    buttons.forEach((item) => item.classList.toggle('selected', item === button));
    apply();
  }));
})();
