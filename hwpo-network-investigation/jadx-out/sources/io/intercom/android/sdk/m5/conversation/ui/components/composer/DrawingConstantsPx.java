package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.h44;
import defpackage.ho;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class DrawingConstantsPx {
    private final float amplitudeDeadZone;
    private final float amplitudeSmoothingFactor;
    private final float amplitudeThreshold;
    private final float barWidth;
    private final float dotRadius;
    private final float minBarHeight;

    public DrawingConstantsPx(float f, float f2, float f3, float f4, float f5, float f6) {
        this.barWidth = f;
        this.dotRadius = f2;
        this.minBarHeight = f3;
        this.amplitudeThreshold = f4;
        this.amplitudeDeadZone = f5;
        this.amplitudeSmoothingFactor = f6;
    }

    public static /* synthetic */ DrawingConstantsPx copy$default(DrawingConstantsPx drawingConstantsPx, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
        if ((i & 1) != 0) {
            f = drawingConstantsPx.barWidth;
        }
        if ((i & 2) != 0) {
            f2 = drawingConstantsPx.dotRadius;
        }
        if ((i & 4) != 0) {
            f3 = drawingConstantsPx.minBarHeight;
        }
        if ((i & 8) != 0) {
            f4 = drawingConstantsPx.amplitudeThreshold;
        }
        if ((i & 16) != 0) {
            f5 = drawingConstantsPx.amplitudeDeadZone;
        }
        if ((i & 32) != 0) {
            f6 = drawingConstantsPx.amplitudeSmoothingFactor;
        }
        float f7 = f5;
        float f8 = f6;
        return drawingConstantsPx.copy(f, f2, f3, f4, f7, f8);
    }

    public final float component1() {
        return this.barWidth;
    }

    public final float component2() {
        return this.dotRadius;
    }

    public final float component3() {
        return this.minBarHeight;
    }

    public final float component4() {
        return this.amplitudeThreshold;
    }

    public final float component5() {
        return this.amplitudeDeadZone;
    }

    public final float component6() {
        return this.amplitudeSmoothingFactor;
    }

    public final DrawingConstantsPx copy(float f, float f2, float f3, float f4, float f5, float f6) {
        return new DrawingConstantsPx(f, f2, f3, f4, f5, f6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawingConstantsPx)) {
            return false;
        }
        DrawingConstantsPx drawingConstantsPx = (DrawingConstantsPx) obj;
        return Float.compare(this.barWidth, drawingConstantsPx.barWidth) == 0 && Float.compare(this.dotRadius, drawingConstantsPx.dotRadius) == 0 && Float.compare(this.minBarHeight, drawingConstantsPx.minBarHeight) == 0 && Float.compare(this.amplitudeThreshold, drawingConstantsPx.amplitudeThreshold) == 0 && Float.compare(this.amplitudeDeadZone, drawingConstantsPx.amplitudeDeadZone) == 0 && Float.compare(this.amplitudeSmoothingFactor, drawingConstantsPx.amplitudeSmoothingFactor) == 0;
    }

    public final float getAmplitudeDeadZone() {
        return this.amplitudeDeadZone;
    }

    public final float getAmplitudeSmoothingFactor() {
        return this.amplitudeSmoothingFactor;
    }

    public final float getAmplitudeThreshold() {
        return this.amplitudeThreshold;
    }

    public final float getBarWidth() {
        return this.barWidth;
    }

    public final float getDotRadius() {
        return this.dotRadius;
    }

    public final float getMinBarHeight() {
        return this.minBarHeight;
    }

    public int hashCode() {
        return Float.hashCode(this.amplitudeSmoothingFactor) + h44.a(h44.a(h44.a(h44.a(Float.hashCode(this.barWidth) * 31, this.dotRadius, 31), this.minBarHeight, 31), this.amplitudeThreshold, 31), this.amplitudeDeadZone, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DrawingConstantsPx(barWidth=");
        sb.append(this.barWidth);
        sb.append(", dotRadius=");
        sb.append(this.dotRadius);
        sb.append(", minBarHeight=");
        sb.append(this.minBarHeight);
        sb.append(", amplitudeThreshold=");
        sb.append(this.amplitudeThreshold);
        sb.append(", amplitudeDeadZone=");
        sb.append(this.amplitudeDeadZone);
        sb.append(", amplitudeSmoothingFactor=");
        return ho.a(sb, this.amplitudeSmoothingFactor, ')');
    }
}
