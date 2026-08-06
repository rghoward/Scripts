package io.intercom.android.sdk.ui.theme;

import defpackage.a83;
import defpackage.al;
import defpackage.qq2;
import defpackage.uh1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomBaseColors {
    public static final int $stable = 0;
    private final long base;
    private final long input;
    private final long inputAlt;

    private IntercomBaseColors(long j, long j2, long j3) {
        this.base = j;
        this.input = j2;
        this.inputAlt = j3;
    }

    /* JADX INFO: renamed from: copy-ysEtTa8$default, reason: not valid java name */
    public static /* synthetic */ IntercomBaseColors m707copyysEtTa8$default(IntercomBaseColors intercomBaseColors, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = intercomBaseColors.base;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = intercomBaseColors.input;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = intercomBaseColors.inputAlt;
        }
        return intercomBaseColors.m711copyysEtTa8(j4, j5, j3);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m708component10d7_KjU() {
        return this.base;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m709component20d7_KjU() {
        return this.input;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m710component30d7_KjU() {
        return this.inputAlt;
    }

    /* JADX INFO: renamed from: copy-ysEtTa8, reason: not valid java name */
    public final IntercomBaseColors m711copyysEtTa8(long j, long j2, long j3) {
        return new IntercomBaseColors(j, j2, j3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomBaseColors)) {
            return false;
        }
        IntercomBaseColors intercomBaseColors = (IntercomBaseColors) obj;
        return uh1.c(this.base, intercomBaseColors.base) && uh1.c(this.input, intercomBaseColors.input) && uh1.c(this.inputAlt, intercomBaseColors.inputAlt);
    }

    /* JADX INFO: renamed from: getBase-0d7_KjU, reason: not valid java name */
    public final long m712getBase0d7_KjU() {
        return this.base;
    }

    /* JADX INFO: renamed from: getInput-0d7_KjU, reason: not valid java name */
    public final long m713getInput0d7_KjU() {
        return this.input;
    }

    /* JADX INFO: renamed from: getInputAlt-0d7_KjU, reason: not valid java name */
    public final long m714getInputAlt0d7_KjU() {
        return this.inputAlt;
    }

    public int hashCode() {
        long j = this.base;
        int i = uh1.l;
        return Long.hashCode(this.inputAlt) + al.c(this.input, Long.hashCode(j) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomBaseColors(base=");
        a83.b(this.base, ", input=", sb);
        a83.b(this.input, ", inputAlt=", sb);
        sb.append((Object) uh1.i(this.inputAlt));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ IntercomBaseColors(long j, long j2, long j3, qq2 qq2Var) {
        this(j, j2, j3);
    }
}
