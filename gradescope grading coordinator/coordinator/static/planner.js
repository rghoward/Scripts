(() => {
  const rows = [...document.querySelectorAll('.question-item')];
  const filters = [...document.querySelectorAll('[data-filter]')];
  const graderBoxes = [...document.querySelectorAll('.grader-checkbox')];
  const form = document.querySelector('#weighted-form');
  const styleInputs = [...document.querySelectorAll('input[name="distribution_style"]')];

  function isWholeSubmissions() {
    return styleInputs.find((input) => input.checked)?.value === 'whole_submissions';
  }

  function applyFilter(filter) {
    rows.forEach((row) => {
      const complete = row.dataset.complete === 'true';
      row.hidden = filter === 'attention' ? complete : filter === 'complete' ? !complete : false;
    });
    filters.forEach((button) => button.classList.toggle('selected', button.dataset.filter === filter));
  }

  function syncMode(row) {
    const mode = row.querySelector('.mode-select').value;
    const owner = row.querySelector('.owner-select');
    owner.hidden = mode !== 'staff_managed';
    owner.disabled = mode !== 'staff_managed';
    row.dataset.mode = mode;
    updateEstimate();
  }

  function updateEstimate() {
    let total = 0;
    let balancedTotal = 0;
    let eligibleSubmissions = 0;
    rows.forEach((row) => {
      const effort = Number(row.querySelector('.effort-value').value) || 0;
      const remaining = Number(row.querySelector('.effort-value').dataset.remaining) || 0;
      const mode = row.querySelector('.mode-select').value;
      if (mode !== 'excluded') total += effort * remaining;
      if (mode === 'balanced') {
        balancedTotal += effort * remaining;
        eligibleSubmissions = Math.max(eligibleSubmissions, remaining);
      }
    });
    const selected = graderBoxes.filter((box) => box.checked).length;
    const whole = isWholeSubmissions();
    form?.classList.toggle('whole-submission-mode', whole);
    document.querySelector('#estimated-units').textContent = whole ? eligibleSubmissions : total.toFixed(total % 1 ? 1 : 0);
    document.querySelector('#estimate-label').textContent = whole ? 'student submissions to divide' : 'estimated effort units';
    document.querySelector('#selected-count').textContent = selected;
    document.querySelector('#target-units').textContent = selected ? ((whole ? eligibleSubmissions : balancedTotal) / selected).toFixed(1) : '—';
    document.querySelector('#target-label').textContent = whole ? 'students per selected grader' : 'units per selected grader';
    document.querySelector('#balance-description').textContent = whole
      ? 'Students are divided as evenly as possible, and each student stays with one TA.'
      : 'The final proposal keeps ranges contiguous and splits a question only when needed to approach this target.';
  }

  filters.forEach((button) => button.addEventListener('click', () => applyFilter(button.dataset.filter)));
  document.querySelectorAll('.equivalent-select').forEach((button) => button.addEventListener('click', () => {
    const key = button.closest('.question-item').dataset.logical;
    rows.filter((row) => row.dataset.logical === key).forEach((row) => { row.querySelector('.question-select').checked = true; });
  }));
  document.querySelectorAll('[data-bulk-mode]').forEach((button) => button.addEventListener('click', () => {
    const selectedRows = rows.filter((row) => row.querySelector('.question-select').checked);
    selectedRows.forEach((row) => {
      row.querySelector('.mode-select').value = button.dataset.bulkMode;
      syncMode(row);
    });
  }));

  rows.forEach((row) => {
    const input = row.querySelector('.effort-value');
    row.querySelector('.effort-minus').addEventListener('click', () => {
      input.value = Math.max(.25, (Number(input.value) || 1) - .25);
      updateEstimate();
    });
    row.querySelector('.effort-plus').addEventListener('click', () => {
      input.value = (Number(input.value) || 1) + .25;
      updateEstimate();
    });
    input.addEventListener('input', updateEstimate);
    row.querySelector('.mode-select').addEventListener('change', () => syncMode(row));
    syncMode(row);
  });
  graderBoxes.forEach((box) => box.addEventListener('change', updateEstimate));
  styleInputs.forEach((input) => input.addEventListener('change', updateEstimate));
  document.querySelector('#select-all-tas')?.addEventListener('click', () => {
    graderBoxes.forEach((box) => {
      box.checked = box.dataset.role !== 'instructor';
    });
    updateEstimate();
  });
  document.querySelector('#clear-graders')?.addEventListener('click', () => {
    graderBoxes.forEach((box) => { box.checked = false; });
    updateEstimate();
  });

  document.querySelector('#weighted-form')?.addEventListener('submit', (event) => {
    const missingOwner = rows.find((row) => row.querySelector('.mode-select').value === 'staff_managed' && !row.querySelector('.owner-select').value);
    if (missingOwner) {
      event.preventDefault();
      applyFilter('all');
      missingOwner.scrollIntoView({behavior: 'smooth', block: 'center'});
      missingOwner.classList.add('needs-owner');
      alert('Choose an instructor or head-TA owner for every staff-managed question.');
      return;
    }
    if (!graderBoxes.some((box) => box.checked) && rows.some((row) => row.querySelector('.mode-select').value === 'balanced' && Number(row.querySelector('.effort-value').dataset.remaining))) {
      event.preventDefault();
      document.querySelector('#team').scrollIntoView({behavior: 'smooth'});
      alert('Select at least one grader for balanced TA work.');
    }
  });

  applyFilter('attention');
  updateEstimate();
})();
