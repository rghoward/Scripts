package io.intercom.android.sdk.ui.theme;

import defpackage.a83;
import defpackage.qq2;
import defpackage.uh1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomBorderColors {
    public static final int $stable = 0;
    private final long emphasis;
    private final long neutral;

    private IntercomBorderColors(long j, long j2) {
        this.neutral = j;
        this.emphasis = j2;
    }

    /* JADX INFO: renamed from: copy--OWjLjI$default, reason: not valid java name */
    public static /* synthetic */ IntercomBorderColors m715copyOWjLjI$default(IntercomBorderColors intercomBorderColors, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = intercomBorderColors.neutral;
        }
        if ((i & 2) != 0) {
            j2 = intercomBorderColors.emphasis;
        }
        return intercomBorderColors.m718copyOWjLjI(j, j2);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m716component10d7_KjU() {
        return this.neutral;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m717component20d7_KjU() {
        return this.emphasis;
    }

    /* JADX INFO: renamed from: copy--OWjLjI, reason: not valid java name */
    public final IntercomBorderColors m718copyOWjLjI(long j, long j2) {
        return new IntercomBorderColors(j, j2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomBorderColors)) {
            return false;
        }
        IntercomBorderColors intercomBorderColors = (IntercomBorderColors) obj;
        return uh1.c(this.neutral, intercomBorderColors.neutral) && uh1.c(this.emphasis, intercomBorderColors.emphasis);
    }

    /* JADX INFO: renamed from: getEmphasis-0d7_KjU, reason: not valid java name */
    public final long m719getEmphasis0d7_KjU() {
        return this.emphasis;
    }

    /* JADX INFO: renamed from: getNeutral-0d7_KjU, reason: not valid java name */
    public final long m720getNeutral0d7_KjU() {
        return this.neutral;
    }

    public int hashCode() {
        long j = this.neutral;
        int i = uh1.l;
        return Long.hashCode(this.emphasis) + (Long.hashCode(j) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomBorderColors(neutral=");
        a83.b(this.neutral, ", emphasis=", sb);
        sb.append((Object) uh1.i(this.emphasis));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ IntercomBorderColors(long j, long j2, qq2 qq2Var) {
        this(j, j2);
    }
}
