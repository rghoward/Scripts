package io.intercom.android.sdk.ui.theme;

import defpackage.a83;
import defpackage.al;
import defpackage.qq2;
import defpackage.uh1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomIconColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final long f389default;
    private final long disabled;
    private final long error;
    private final long muted;
    private final long mutedExtra;
    private final long notice;
    private final long onInversed;
    private final long success;

    private IntercomIconColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f389default = j;
        this.muted = j2;
        this.mutedExtra = j3;
        this.disabled = j4;
        this.onInversed = j5;
        this.error = j6;
        this.success = j7;
        this.notice = j8;
    }

    /* JADX INFO: renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ IntercomIconColors m796copyFD3wquc$default(IntercomIconColors intercomIconColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, Object obj) {
        long j9;
        long j10;
        long j11 = (i & 1) != 0 ? intercomIconColors.f389default : j;
        long j12 = (i & 2) != 0 ? intercomIconColors.muted : j2;
        long j13 = (i & 4) != 0 ? intercomIconColors.mutedExtra : j3;
        long j14 = (i & 8) != 0 ? intercomIconColors.disabled : j4;
        long j15 = (i & 16) != 0 ? intercomIconColors.onInversed : j5;
        long j16 = (i & 32) != 0 ? intercomIconColors.error : j6;
        long j17 = (i & 64) != 0 ? intercomIconColors.success : j7;
        if ((i & 128) != 0) {
            j9 = intercomIconColors.notice;
            j10 = j11;
        } else {
            j9 = j8;
            j10 = j11;
        }
        return intercomIconColors.m805copyFD3wquc(j10, j12, j13, j14, j15, j16, j17, j9);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m797component10d7_KjU() {
        return this.f389default;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m798component20d7_KjU() {
        return this.muted;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m799component30d7_KjU() {
        return this.mutedExtra;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m800component40d7_KjU() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m801component50d7_KjU() {
        return this.onInversed;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m802component60d7_KjU() {
        return this.error;
    }

    /* JADX INFO: renamed from: component7-0d7_KjU, reason: not valid java name */
    public final long m803component70d7_KjU() {
        return this.success;
    }

    /* JADX INFO: renamed from: component8-0d7_KjU, reason: not valid java name */
    public final long m804component80d7_KjU() {
        return this.notice;
    }

    /* JADX INFO: renamed from: copy-FD3wquc, reason: not valid java name */
    public final IntercomIconColors m805copyFD3wquc(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        return new IntercomIconColors(j, j2, j3, j4, j5, j6, j7, j8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomIconColors)) {
            return false;
        }
        IntercomIconColors intercomIconColors = (IntercomIconColors) obj;
        return uh1.c(this.f389default, intercomIconColors.f389default) && uh1.c(this.muted, intercomIconColors.muted) && uh1.c(this.mutedExtra, intercomIconColors.mutedExtra) && uh1.c(this.disabled, intercomIconColors.disabled) && uh1.c(this.onInversed, intercomIconColors.onInversed) && uh1.c(this.error, intercomIconColors.error) && uh1.c(this.success, intercomIconColors.success) && uh1.c(this.notice, intercomIconColors.notice);
    }

    /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name */
    public final long m806getDefault0d7_KjU() {
        return this.f389default;
    }

    /* JADX INFO: renamed from: getDisabled-0d7_KjU, reason: not valid java name */
    public final long m807getDisabled0d7_KjU() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m808getError0d7_KjU() {
        return this.error;
    }

    /* JADX INFO: renamed from: getMuted-0d7_KjU, reason: not valid java name */
    public final long m809getMuted0d7_KjU() {
        return this.muted;
    }

    /* JADX INFO: renamed from: getMutedExtra-0d7_KjU, reason: not valid java name */
    public final long m810getMutedExtra0d7_KjU() {
        return this.mutedExtra;
    }

    /* JADX INFO: renamed from: getNotice-0d7_KjU, reason: not valid java name */
    public final long m811getNotice0d7_KjU() {
        return this.notice;
    }

    /* JADX INFO: renamed from: getOnInversed-0d7_KjU, reason: not valid java name */
    public final long m812getOnInversed0d7_KjU() {
        return this.onInversed;
    }

    /* JADX INFO: renamed from: getSuccess-0d7_KjU, reason: not valid java name */
    public final long m813getSuccess0d7_KjU() {
        return this.success;
    }

    public int hashCode() {
        long j = this.f389default;
        int i = uh1.l;
        return Long.hashCode(this.notice) + al.c(this.success, al.c(this.error, al.c(this.onInversed, al.c(this.disabled, al.c(this.mutedExtra, al.c(this.muted, Long.hashCode(j) * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomIconColors(default=");
        a83.b(this.f389default, ", muted=", sb);
        a83.b(this.muted, ", mutedExtra=", sb);
        a83.b(this.mutedExtra, ", disabled=", sb);
        a83.b(this.disabled, ", onInversed=", sb);
        a83.b(this.onInversed, ", error=", sb);
        a83.b(this.error, ", success=", sb);
        a83.b(this.success, ", notice=", sb);
        sb.append((Object) uh1.i(this.notice));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ IntercomIconColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, qq2 qq2Var) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }
}
