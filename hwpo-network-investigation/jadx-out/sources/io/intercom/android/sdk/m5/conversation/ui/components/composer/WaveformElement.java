package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.fh0;
import defpackage.h44;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class WaveformElement {
    private final float amplitude;
    private final long timestamp;
    private final float x;

    public WaveformElement(float f, float f2, long j) {
        this.x = f;
        this.amplitude = f2;
        this.timestamp = j;
    }

    public static /* synthetic */ WaveformElement copy$default(WaveformElement waveformElement, float f, float f2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            f = waveformElement.x;
        }
        if ((i & 2) != 0) {
            f2 = waveformElement.amplitude;
        }
        if ((i & 4) != 0) {
            j = waveformElement.timestamp;
        }
        return waveformElement.copy(f, f2, j);
    }

    public final float component1() {
        return this.x;
    }

    public final float component2() {
        return this.amplitude;
    }

    public final long component3() {
        return this.timestamp;
    }

    public final WaveformElement copy(float f, float f2, long j) {
        return new WaveformElement(f, f2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaveformElement)) {
            return false;
        }
        WaveformElement waveformElement = (WaveformElement) obj;
        return Float.compare(this.x, waveformElement.x) == 0 && Float.compare(this.amplitude, waveformElement.amplitude) == 0 && this.timestamp == waveformElement.timestamp;
    }

    public final float getAmplitude() {
        return this.amplitude;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getX() {
        return this.x;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + h44.a(Float.hashCode(this.x) * 31, this.amplitude, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WaveformElement(x=");
        sb.append(this.x);
        sb.append(", amplitude=");
        sb.append(this.amplitude);
        sb.append(", timestamp=");
        return fh0.b(sb, this.timestamp, ')');
    }
}
