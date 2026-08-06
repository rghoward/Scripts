#!/usr/bin/env python3
"""Generate the original Hoots & Reps cosmic power-metal loop."""

from pathlib import Path
import wave

import numpy as np


SR = 44100
BPM = 172
BEAT = 60 / BPM
BARS = 16
DURATION = BARS * 4 * BEAT
OUT = Path(__file__).resolve().parents[1] / "build" / "hoots_ascendant.wav"
rng = np.random.default_rng(1301)


def hz(midi):
    return 440.0 * 2 ** ((midi - 69) / 12)


def add_tone(track, start, length, notes, volume, kind="saw", pan=0.0):
    first = int(start * SR)
    count = min(int(length * SR), len(track) - first)
    if count <= 0:
        return
    t = np.arange(count) / SR
    sound = np.zeros(count)
    for note in notes:
        phase = t * hz(note)
        if kind == "saw":
            sound += 2 * (phase - np.floor(phase + 0.5))
        elif kind == "square":
            sound += np.sign(np.sin(2 * np.pi * phase))
        else:
            sound += np.sin(2 * np.pi * phase)
    sound /= max(1, len(notes))
    attack = np.minimum(1, t / 0.012)
    release = np.minimum(1, (length - t) / 0.045)
    envelope = np.maximum(0, attack * release)
    sound = np.tanh(sound * (2.8 if kind == "saw" else 1.2)) * envelope * volume
    left = np.sqrt((1 - pan) / 2)
    right = np.sqrt((1 + pan) / 2)
    track[first:first + count, 0] += sound * left
    track[first:first + count, 1] += sound * right


def add_drum(track, start, kind):
    first = int(start * SR)
    length = 0.22 if kind != "hat" else 0.08
    count = min(int(length * SR), len(track) - first)
    if count <= 0:
        return
    t = np.arange(count) / SR
    if kind == "kick":
        phase = 2 * np.pi * (78 * t - 42 * t * t)
        sound = np.sin(phase) * np.exp(-t * 20) * 0.9
    elif kind == "snare":
        sound = (rng.random(count) * 2 - 1) * np.exp(-t * 18) * 0.45
        sound += np.sin(2 * np.pi * 185 * t) * np.exp(-t * 24) * 0.22
    else:
        noise = rng.random(count) * 2 - 1
        sound = np.concatenate(([0], np.diff(noise))) * np.exp(-t * 48) * 0.16
    track[first:first + count, 0] += sound
    track[first:first + count, 1] += sound


def main():
    mix = np.zeros((int(DURATION * SR), 2), dtype=np.float64)
    roots = [40, 36, 43, 38] * 4  # Em, C, G, D: heroic, familiar, and loopable.
    lead_motifs = [
        [64, 67, 71, 69, 67, 64, 62, 64],
        [64, 67, 72, 71, 67, 64, 62, 60],
        [67, 71, 74, 71, 69, 67, 66, 67],
        [66, 69, 74, 72, 69, 66, 64, 62],
    ]

    for bar, root in enumerate(roots):
        bar_start = bar * 4 * BEAT
        fifth = root + 7
        # Wide celestial choir pad.
        chord_third = root + (3 if root in (40, 38) else 4)
        add_tone(mix, bar_start, 4 * BEAT, [root + 12, chord_third + 12, fifth + 12], 0.10, "sine")

        for beat in range(4):
            beat_start = bar_start + beat * BEAT
            add_drum(mix, beat_start, "kick" if beat in (0, 2) else "snare")
            if beat == 2:
                add_drum(mix, beat_start + BEAT / 2, "kick")
            for eighth in range(2):
                add_drum(mix, beat_start + eighth * BEAT / 2, "hat")
                add_tone(mix, beat_start + eighth * BEAT / 2, BEAT * 0.42,
                         [root - 12], 0.18, "square")

            # Galloping power-chord rhythm: long-short-short.
            for step, length in ((0, 0.43), (2, 0.19), (3, 0.19)):
                when = beat_start + step * BEAT / 4
                add_tone(mix, when, BEAT * length, [root, fifth, root + 12], 0.25, "saw", -0.25)
                add_tone(mix, when, BEAT * length, [root, fifth, root + 12], 0.25, "saw", 0.25)

        motif = lead_motifs[bar % 4]
        octave = 12 if bar >= 8 else 0
        for step, note in enumerate(motif):
            add_tone(mix, bar_start + step * BEAT / 2, BEAT * 0.44,
                     [note + octave], 0.18, "square", 0.35 if step % 2 else -0.35)

    # A restrained shimmer gives the synth lead space without muddying the loop.
    delay = int(BEAT * 0.75 * SR)
    mix[delay:] += mix[:-delay] * 0.10
    mix = np.tanh(mix * 1.35)
    mix /= np.max(np.abs(mix)) * 1.04
    pcm = (mix * 32767).astype("<i2")
    OUT.parent.mkdir(parents=True, exist_ok=True)
    with wave.open(str(OUT), "wb") as audio:
        audio.setnchannels(2)
        audio.setsampwidth(2)
        audio.setframerate(SR)
        audio.writeframes(pcm.tobytes())
    print(OUT)


if __name__ == "__main__":
    main()
