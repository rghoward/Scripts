package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.h44;
import defpackage.ho;
import defpackage.qq2;
import defpackage.y43;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class DrawingConstants {
    private final float amplitudeDeadZone;
    private final float amplitudeSmoothingFactor;
    private final float amplitudeThreshold;
    private final float barWidth;
    private final float dotRadius;
    private final float minBarHeight;

    private DrawingConstants(float f, float f2, float f3, float f4, float f5, float f6) {
        this.barWidth = f;
        this.dotRadius = f2;
        this.minBarHeight = f3;
        this.amplitudeThreshold = f4;
        this.amplitudeDeadZone = f5;
        this.amplitudeSmoothingFactor = f6;
    }

    /* JADX INFO: renamed from: copy-yajeYGU$default, reason: not valid java name */
    public static /* synthetic */ DrawingConstants m181copyyajeYGU$default(DrawingConstants drawingConstants, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
        if ((i & 1) != 0) {
            f = drawingConstants.barWidth;
        }
        if ((i & 2) != 0) {
            f2 = drawingConstants.dotRadius;
        }
        if ((i & 4) != 0) {
            f3 = drawingConstants.minBarHeight;
        }
        if ((i & 8) != 0) {
            f4 = drawingConstants.amplitudeThreshold;
        }
        if ((i & 16) != 0) {
            f5 = drawingConstants.amplitudeDeadZone;
        }
        if ((i & 32) != 0) {
            f6 = drawingConstants.amplitudeSmoothingFactor;
        }
        float f7 = f5;
        float f8 = f6;
        return drawingConstants.m185copyyajeYGU(f, f2, f3, f4, f7, f8);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m182component1D9Ej5fM() {
        return this.barWidth;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m183component2D9Ej5fM() {
        return this.dotRadius;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m184component3D9Ej5fM() {
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

    /* JADX INFO: renamed from: copy-yajeYGU, reason: not valid java name */
    public final DrawingConstants m185copyyajeYGU(float f, float f2, float f3, float f4, float f5, float f6) {
        return new DrawingConstants(f, f2, f3, f4, f5, f6, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawingConstants)) {
            return false;
        }
        DrawingConstants drawingConstants = (DrawingConstants) obj;
        return y43.e(this.barWidth, drawingConstants.barWidth) && y43.e(this.dotRadius, drawingConstants.dotRadius) && y43.e(this.minBarHeight, drawingConstants.minBarHeight) && Float.compare(this.amplitudeThreshold, drawingConstants.amplitudeThreshold) == 0 && Float.compare(this.amplitudeDeadZone, drawingConstants.amplitudeDeadZone) == 0 && Float.compare(this.amplitudeSmoothingFactor, drawingConstants.amplitudeSmoothingFactor) == 0;
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

    /* JADX INFO: renamed from: getBarWidth-D9Ej5fM, reason: not valid java name */
    public final float m186getBarWidthD9Ej5fM() {
        return this.barWidth;
    }

    /* JADX INFO: renamed from: getDotRadius-D9Ej5fM, reason: not valid java name */
    public final float m187getDotRadiusD9Ej5fM() {
        return this.dotRadius;
    }

    /* JADX INFO: renamed from: getMinBarHeight-D9Ej5fM, reason: not valid java name */
    public final float m188getMinBarHeightD9Ej5fM() {
        return this.minBarHeight;
    }

    public int hashCode() {
        return Float.hashCode(this.amplitudeSmoothingFactor) + h44.a(h44.a(h44.a(h44.a(Float.hashCode(this.barWidth) * 31, this.dotRadius, 31), this.minBarHeight, 31), this.amplitudeThreshold, 31), this.amplitudeDeadZone, 31);
    }

    public final DrawingConstantsPx toPx(float f) {
        return new DrawingConstantsPx(this.barWidth * f, this.dotRadius * f, this.minBarHeight * f, this.amplitudeThreshold, this.amplitudeDeadZone, this.amplitudeSmoothingFactor);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DrawingConstants(barWidth=");
        sb.append((Object) y43.f(this.barWidth));
        sb.append(", dotRadius=");
        sb.append((Object) y43.f(this.dotRadius));
        sb.append(", minBarHeight=");
        sb.append((Object) y43.f(this.minBarHeight));
        sb.append(", amplitudeThreshold=");
        sb.append(this.amplitudeThreshold);
        sb.append(", amplitudeDeadZone=");
        sb.append(this.amplitudeDeadZone);
        sb.append(", amplitudeSmoothingFactor=");
        return ho.a(sb, this.amplitudeSmoothingFactor, ')');
    }

    public /* synthetic */ DrawingConstants(float f, float f2, float f3, float f4, float f5, float f6, qq2 qq2Var) {
        this(f, f2, f3, f4, f5, f6);
    }
}
