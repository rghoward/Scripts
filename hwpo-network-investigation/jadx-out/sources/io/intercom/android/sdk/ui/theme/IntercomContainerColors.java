package io.intercom.android.sdk.ui.theme;

import defpackage.a83;
import defpackage.al;
import defpackage.qq2;
import defpackage.uh1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomContainerColors {
    public static final int $stable = 0;
    private final long alt;
    private final long black;
    private final long blue;
    private final long emphasis;
    private final long green;
    private final long neutral;
    private final long red;

    private IntercomContainerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.neutral = j;
        this.emphasis = j2;
        this.alt = j3;
        this.red = j4;
        this.blue = j5;
        this.green = j6;
        this.black = j7;
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m781component10d7_KjU() {
        return this.neutral;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m782component20d7_KjU() {
        return this.emphasis;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m783component30d7_KjU() {
        return this.alt;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m784component40d7_KjU() {
        return this.red;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m785component50d7_KjU() {
        return this.blue;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m786component60d7_KjU() {
        return this.green;
    }

    /* JADX INFO: renamed from: component7-0d7_KjU, reason: not valid java name */
    public final long m787component70d7_KjU() {
        return this.black;
    }

    /* JADX INFO: renamed from: copy-4JmcsL4, reason: not valid java name */
    public final IntercomContainerColors m788copy4JmcsL4(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        return new IntercomContainerColors(j, j2, j3, j4, j5, j6, j7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomContainerColors)) {
            return false;
        }
        IntercomContainerColors intercomContainerColors = (IntercomContainerColors) obj;
        return uh1.c(this.neutral, intercomContainerColors.neutral) && uh1.c(this.emphasis, intercomContainerColors.emphasis) && uh1.c(this.alt, intercomContainerColors.alt) && uh1.c(this.red, intercomContainerColors.red) && uh1.c(this.blue, intercomContainerColors.blue) && uh1.c(this.green, intercomContainerColors.green) && uh1.c(this.black, intercomContainerColors.black);
    }

    /* JADX INFO: renamed from: getAlt-0d7_KjU, reason: not valid java name */
    public final long m789getAlt0d7_KjU() {
        return this.alt;
    }

    /* JADX INFO: renamed from: getBlack-0d7_KjU, reason: not valid java name */
    public final long m790getBlack0d7_KjU() {
        return this.black;
    }

    /* JADX INFO: renamed from: getBlue-0d7_KjU, reason: not valid java name */
    public final long m791getBlue0d7_KjU() {
        return this.blue;
    }

    /* JADX INFO: renamed from: getEmphasis-0d7_KjU, reason: not valid java name */
    public final long m792getEmphasis0d7_KjU() {
        return this.emphasis;
    }

    /* JADX INFO: renamed from: getGreen-0d7_KjU, reason: not valid java name */
    public final long m793getGreen0d7_KjU() {
        return this.green;
    }

    /* JADX INFO: renamed from: getNeutral-0d7_KjU, reason: not valid java name */
    public final long m794getNeutral0d7_KjU() {
        return this.neutral;
    }

    /* JADX INFO: renamed from: getRed-0d7_KjU, reason: not valid java name */
    public final long m795getRed0d7_KjU() {
        return this.red;
    }

    public int hashCode() {
        long j = this.neutral;
        int i = uh1.l;
        return Long.hashCode(this.black) + al.c(this.green, al.c(this.blue, al.c(this.red, al.c(this.alt, al.c(this.emphasis, Long.hashCode(j) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomContainerColors(neutral=");
        a83.b(this.neutral, ", emphasis=", sb);
        a83.b(this.emphasis, ", alt=", sb);
        a83.b(this.alt, ", red=", sb);
        a83.b(this.red, ", blue=", sb);
        a83.b(this.blue, ", green=", sb);
        a83.b(this.green, ", black=", sb);
        sb.append((Object) uh1.i(this.black));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ IntercomContainerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, qq2 qq2Var) {
        this(j, j2, j3, j4, j5, j6, j7);
    }
}
