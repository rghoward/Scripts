(() => {
  const namespace = 'urn:x-cast:com.rhoward.hoots_and_reps';
  const receiver = cast.framework.CastReceiverContext.getInstance();
  const playerManager = receiver.getPlayerManager();
  const cuePlayer = document.getElementById('cue-player');
  const cueQueue = [];
  let cuePlaying = false;
  let readySequenceLoading = false;
  let readySequenceLoaded = false;
  let readySequencePlayRequested = false;
  let readySequencePlaying = false;
  let suppressNextGo = false;
  let activePlan = null;
  let currentPhaseIndex = 0;
  let phaseStartedAt = 0;
  let pausedAt = 0;
  let pausedElapsed = 0;
  let finished = false;
  let activePlanId = '';
  let legacyTimer = null;
  let lastRenderedKey = '';
  let lastLegacyCue = '';
  const playedEvents = new Set();
  let renderHandle;

  // The receiver's CAF PlayerManager drives an HTMLMediaElement directly.
  // This is Chromecast's supported media playback route for MP3 and bypasses
  // Web Audio's decode/resample graph, the source of the crackling cues.
  function playVoiceClip(name) {
    cueQueue.push(name);
    playNextCue();
  }

  function playNextCue() {
    if (cuePlaying || !cueQueue.length) return;
    const name = cueQueue.shift();
    const url = new URL(`timer-${name}.mp3?v=caf-ready-sequence-16`, window.location.href).href;
    const media = new cast.framework.messages.MediaInformation();
    media.contentId = url;
    media.contentUrl = url;
    media.contentType = 'audio/mpeg';
    media.streamType = cast.framework.messages.StreamType.BUFFERED;
    const request = new cast.framework.messages.LoadRequestData();
    request.media = media;
    request.autoplay = true;
    request.currentTime = 0;
    cuePlaying = true;
    try {
      playerManager.load(request);
    } catch (_) {
      cuePlaying = false;
      window.setTimeout(playNextCue, 0);
    }
  }

  function finishCue() {
    if (!cuePlaying) return;
    cuePlaying = false;
    window.setTimeout(playNextCue, 12);
  }

  function readySequenceMedia() {
    // This static Worker serves newly-added assets by path; unlike the older
    // cue files, do not append a query string here or CAF receives a 404.
    const url = new URL('timer-ready-countdown.mp3', window.location.href).href;
    const media = new cast.framework.messages.MediaInformation();
    media.contentId = url;
    media.contentUrl = url;
    media.contentType = 'audio/mpeg';
    media.streamType = cast.framework.messages.StreamType.BUFFERED;
    return media;
  }

  // Load the complete 3–2–1–Go recording during the seven-second lead-in.
  // When the visible display reaches 3, CAF already has one media item ready,
  // so the words have no per-number network/media-load delay.
  function preloadReadySequence() {
    readySequenceLoading = true;
    readySequenceLoaded = false;
    readySequencePlayRequested = false;
    readySequencePlaying = false;
    const request = new cast.framework.messages.LoadRequestData();
    request.media = readySequenceMedia();
    request.autoplay = false;
    request.currentTime = 0;
    try {
      playerManager.load(request);
    } catch (_) {
      readySequenceLoading = false;
    }
  }

  function playReadySequence() {
    if (readySequencePlaying) return;
    readySequencePlayRequested = true;
    if (!readySequenceLoaded) return;
    readySequencePlaying = true;
    suppressNextGo = true;
    playerManager.play();
  }

  // CAF owns this media element, so receive lifecycle notifications from CAF
  // itself. Chromium's DOM `ended` event can be swallowed by the receiver
  // pipeline; MEDIA_FINISHED is the reliable completion signal for the queue.
  playerManager.addEventListener(
    cast.framework.events.EventType.MEDIA_FINISHED,
    () => {
      if (readySequencePlaying) {
        readySequencePlaying = false;
        return;
      }
      finishCue();
    },
  );
  playerManager.addEventListener(
    cast.framework.events.EventType.ERROR,
    finishCue,
  );
  playerManager.addEventListener(
    cast.framework.events.EventType.PLAYER_LOAD_COMPLETE,
    () => {
      if (!readySequenceLoading) return;
      readySequenceLoading = false;
      readySequenceLoaded = true;
      if (readySequencePlayRequested) playReadySequence();
    },
  );

  function setText(id, value) {
    document.getElementById(id).textContent = value || '';
  }

  function setBody(value) {
    const body = document.getElementById('body');
    body.replaceChildren();
    String(value || '').split(/([♀♂])/).forEach((part) => {
      if (part === '♀' || part === '♂') {
        const symbol = document.createElement('span');
        symbol.className = 'gender-symbol';
        symbol.textContent = part;
        body.appendChild(symbol);
      } else body.appendChild(document.createTextNode(part));
    });
  }

  function fitCard() {
    const content = document.getElementById('content');
    content.style.transform = 'scale(1)';
    content.style.width = '100%';
    const scale = Math.min(1, content.clientHeight / content.scrollHeight);
    if (scale < 1) {
      content.style.transform = `scale(${scale})`;
      content.style.width = `${100 / scale}%`;
    }
  }

  function formatTimer(seconds) {
    const value = Math.max(0, Math.ceil(Number(seconds) || 0));
    return `${Math.floor(value / 60)}:${String(value % 60).padStart(2, '0')}`;
  }

  function phase() {
    return activePlan?.phases?.[currentPhaseIndex] || null;
  }

  function elapsedSeconds(now = performance.now()) {
    return pausedAt ? pausedElapsed : Math.max(0, (now - phaseStartedAt) / 1000);
  }

  function advancePhase(now) {
    const current = phase();
    if (!current) return;
    const carry = elapsedSeconds(now) - Number(current.durationSeconds || 0);
    currentPhaseIndex += 1;
    if (!phase()) {
      finished = true;
      return;
    }
    phaseStartedAt = now - Math.max(0, carry) * 1000;
    pausedElapsed = 0;
    playPhaseStart();
  }

  function playOnce(eventId, name) {
    if (playedEvents.has(eventId)) return;
    playedEvents.add(eventId);
    playVoiceClip(name);
  }

  function playPhaseStart() {
    const current = phase();
    if (!current) return;
    const eventId = `${activePlan.id}:${current.id}:start`;
    if (current.kind === 'transition') {
      playOnce(eventId, 'transition');
    } else if (current.kind === 'sideChange') {
      playOnce(eventId, 'switch-sides');
    } else if (current.kind === 'emom') {
      // Every minute uses the same lossless CAF media path—not a Web Audio
      // oscillator—so an EMOM cue remains as clean as the countdown voice.
      playOnce(eventId, 'go');
    } else if (current.kind !== 'ready') {
      if (suppressNextGo) {
        suppressNextGo = false;
        return;
      }
      playOnce(eventId, 'go');
    }
  }

  function renderTimer() {
    const panel = document.getElementById('timer');
    const current = phase();
    if (!activePlan || !current) {
      renderLegacyTimer(panel);
      return;
    }
    panel.hidden = false;
    const duration = Number(current.durationSeconds || 0);
    let elapsed = elapsedSeconds();
    while (!pausedAt && elapsed >= duration && !finished) {
      advancePhase(performance.now());
      elapsed = elapsedSeconds();
    }
    const displayed = phase();
    if (!displayed) return;
    const remaining = Math.max(0, Number(displayed.durationSeconds || 0) - elapsedSeconds());
    const state = pausedAt ? 'PAUSED' : displayed.kind === 'ready' ? 'GET READY' :
      displayed.kind === 'transition' ? 'TRANSITION' :
      displayed.kind === 'sideChange' ? 'SWITCH SIDES' :
      displayed.kind === 'emom' ? `ROUND ${displayed.round} / ${displayed.roundCount}` :
      displayed.kind === 'work' ? 'WORK' : displayed.kind === 'rest' ? 'REST' :
      displayed.kind === 'amrap' ? 'AMRAP' : displayed.kind === 'forTime' ? 'FOR TIME — CAP' : 'TIMER RUNNING';
    const key = `${activePlan.id}:${displayed.id}:${Math.ceil(remaining)}:${pausedAt ? 'paused' : 'run'}`;
    if (key !== lastRenderedKey) {
      lastRenderedKey = key;
      setText('timer-stage', state);
      setText('timer-count', formatTimer(remaining));
      setText('timer-label', displayed.label || '');
      setText('timer-cue', displayed.kind === 'transition' ? 'TRANSITION' : displayed.kind === 'sideChange' ? 'SWITCH SIDES' : '');
    }
    if (!pausedAt && displayed.kind === 'ready') {
      const seconds = Math.ceil(remaining);
      if (seconds === 3) playReadySequence();
    }
  }

  // Keeps already-installed phones usable while they still send the previous
  // timer shape. New builds never rely on this—the receiver owns their plan.
  function renderLegacyTimer(panel) {
    if (!legacyTimer) {
      panel.hidden = true;
      return;
    }
    panel.hidden = false;
    const timer = legacyTimer;
    const seconds = Number(timer.remainingSeconds || 0);
    const stage = String(timer.stage || 'running');
    const sideChange = String(timer.transitionType || '') === 'sideChange';
    const state = stage === 'ready' ? 'GET READY' : stage === 'paused' ? 'PAUSED' :
      stage === 'transition' ? (sideChange ? 'SWITCH SIDES' : 'TRANSITION') :
      stage === 'finished' ? 'COMPLETE' : 'TIMER RUNNING';
    setText('timer-stage', state);
    setText('timer-count', formatTimer(seconds));
    setText('timer-label', timer.label || '');
    setText('timer-cue', timer.cue || (stage === 'transition' ? state : ''));
    const cueKey = `${stage}:${seconds}:${timer.label || ''}`;
    if (cueKey === lastLegacyCue) return;
    lastLegacyCue = cueKey;
    if (stage === 'transition' && seconds === Number(timer.transitionSeconds || 0)) {
      playVoiceClip(sideChange ? 'switch-sides' : 'transition', sideChange ? 1120 : 1000);
    } else if (stage === 'running' && seconds === Number(timer.targetSeconds)) {
      playVoiceClip('go', 1400);
    } else if (stage === 'ready' && seconds >= 1 && seconds <= 3) {
      playVoiceClip(['zero', 'one', 'two', 'three'][seconds], 620 + seconds * 130);
    }
  }

  function startPlan(plan) {
    if (!plan?.id || !Array.isArray(plan.phases) || !plan.phases.length) return;
    activePlan = plan;
    activePlanId = plan.id;
    legacyTimer = null;
    currentPhaseIndex = 0;
    phaseStartedAt = performance.now();
    pausedAt = 0;
    pausedElapsed = 0;
    finished = false;
    lastRenderedKey = '';
    playedEvents.clear();
    // Prime the one-piece countdown well before the visible 3–2–1 begins.
    preloadReadySequence();
    renderTimer();
  }

  function handleTimer(timer) {
    if (!timer) {
      activePlan = null;
      legacyTimer = null;
      renderTimer();
      return;
    }
    if (!timer.plan) {
      activePlan = null;
      legacyTimer = timer;
      renderTimer();
      return;
    }
    if (timer.plan && timer.command === 'reset') startPlan(timer.plan);
    if (timer.plan && timer.command === 'start' && timer.plan.id !== activePlanId) {
      startPlan(timer.plan);
    }
    if (!activePlan) return;
    if (timer.command === 'pause' && !pausedAt) {
      pausedElapsed = elapsedSeconds();
      pausedAt = performance.now();
    } else if (timer.command === 'resume' && pausedAt) {
      phaseStartedAt = performance.now() - pausedElapsed * 1000;
      pausedAt = 0;
    }
    renderTimer();
  }

  function showWorkoutCard(card) {
    setText('workout-title', card.workoutTitle || 'Hoots & Reps');
    setText('section-title', card.sectionTitle || 'Workout');
    setBody(card.body || '');
    handleTimer(card.timer);
    const position = card.sectionNumber > 0 && card.sectionCount > 0
      ? `DAY CARD ${card.sectionNumber} / ${card.sectionCount}  •  HOOTS & REPS`
      : 'HOOTS & REPS  •  CONTROLLED FROM YOUR DEVICE';
    setText('footer', position);
    requestAnimationFrame(fitCard);
  }

  receiver.addCustomMessageListener(namespace, (event) => {
    try {
      const message = typeof event.data === 'string' ? JSON.parse(event.data) : event.data;
      if (message?.type === 'workoutCard') showWorkoutCard(message);
    } catch (_) {}
  });

  renderHandle = window.setInterval(renderTimer, 200);
  const options = new cast.framework.CastReceiverOptions();
  options.customNamespaces = { [namespace]: cast.framework.system.MessageType.JSON };
  options.mediaElement = cuePlayer;
  // This is a custom workout-control receiver, not a conventional media app.
  // Voice cues are brief; keep the TV session active between them instead of
  // allowing Chromecast to leave for Ambient Mode during a long workout.
  options.disableIdleTimeout = true;
  receiver.start(options);
})();
