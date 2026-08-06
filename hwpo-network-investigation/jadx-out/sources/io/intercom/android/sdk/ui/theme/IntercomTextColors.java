package io.intercom.android.sdk.ui.theme;

import defpackage.a83;
import defpackage.al;
import defpackage.qq2;
import defpackage.uh1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomTextColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final long f390default;
    private final long disabled;
    private final long error;
    private final long muted;
    private final long mutedExtra;
    private final long notice;
    private final long onInversed;
    private final long success;

    private IntercomTextColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f390default = j;
        this.muted = j2;
        this.mutedExtra = j3;
        this.disabled = j4;
        this.onInversed = j5;
        this.error = j6;
        this.success = j7;
        this.notice = j8;
    }

    /* JADX INFO: renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ IntercomTextColors m814copyFD3wquc$default(IntercomTextColors intercomTextColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, Object obj) {
        long j9;
        long j10;
        long j11 = (i & 1) != 0 ? intercomTextColors.f390default : j;
        long j12 = (i & 2) != 0 ? intercomTextColors.muted : j2;
        long j13 = (i & 4) != 0 ? intercomTextColors.mutedExtra : j3;
        long j14 = (i & 8) != 0 ? intercomTextColors.disabled : j4;
        long j15 = (i & 16) != 0 ? intercomTextColors.onInversed : j5;
        long j16 = (i & 32) != 0 ? intercomTextColors.error : j6;
        long j17 = (i & 64) != 0 ? intercomTextColors.success : j7;
        if ((i & 128) != 0) {
            j9 = intercomTextColors.notice;
            j10 = j11;
        } else {
            j9 = j8;
            j10 = j11;
        }
        return intercomTextColors.m823copyFD3wquc(j10, j12, j13, j14, j15, j16, j17, j9);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m815component10d7_KjU() {
        return this.f390default;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m816component20d7_KjU() {
        return this.muted;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m817component30d7_KjU() {
        return this.mutedExtra;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m818component40d7_KjU() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m819component50d7_KjU() {
        return this.onInversed;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m820component60d7_KjU() {
        return this.error;
    }

    /* JADX INFO: renamed from: component7-0d7_KjU, reason: not valid java name */
    public final long m821component70d7_KjU() {
        return this.success;
    }

    /* JADX INFO: renamed from: component8-0d7_KjU, reason: not valid java name */
    public final long m822component80d7_KjU() {
        return this.notice;
    }

    /* JADX INFO: renamed from: copy-FD3wquc, reason: not valid java name */
    public final IntercomTextColors m823copyFD3wquc(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        return new IntercomTextColors(j, j2, j3, j4, j5, j6, j7, j8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomTextColors)) {
            return false;
        }
        IntercomTextColors intercomTextColors = (IntercomTextColors) obj;
        return uh1.c(this.f390default, intercomTextColors.f390default) && uh1.c(this.muted, intercomTextColors.muted) && uh1.c(this.mutedExtra, intercomTextColors.mutedExtra) && uh1.c(this.disabled, intercomTextColors.disabled) && uh1.c(this.onInversed, intercomTextColors.onInversed) && uh1.c(this.error, intercomTextColors.error) && uh1.c(this.success, intercomTextColors.success) && uh1.c(this.notice, intercomTextColors.notice);
    }

    /* JADX INFO: renamed from: getDefault-0d7_KjU, reason: not valid java name */
    public final long m824getDefault0d7_KjU() {
        return this.f390default;
    }

    /* JADX INFO: renamed from: getDisabled-0d7_KjU, reason: not valid java name */
    public final long m825getDisabled0d7_KjU() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m826getError0d7_KjU() {
        return this.error;
    }

    /* JADX INFO: renamed from: getMuted-0d7_KjU, reason: not valid java name */
    public final long m827getMuted0d7_KjU() {
        return this.muted;
    }

    /* JADX INFO: renamed from: getMutedExtra-0d7_KjU, reason: not valid java name */
    public final long m828getMutedExtra0d7_KjU() {
        return this.mutedExtra;
    }

    /* JADX INFO: renamed from: getNotice-0d7_KjU, reason: not valid java name */
    public final long m829getNotice0d7_KjU() {
        return this.notice;
    }

    /* JADX INFO: renamed from: getOnInversed-0d7_KjU, reason: not valid java name */
    public final long m830getOnInversed0d7_KjU() {
        return this.onInversed;
    }

    /* JADX INFO: renamed from: getSuccess-0d7_KjU, reason: not valid java name */
    public final long m831getSuccess0d7_KjU() {
        return this.success;
    }

    public int hashCode() {
        long j = this.f390default;
        int i = uh1.l;
        return Long.hashCode(this.notice) + al.c(this.success, al.c(this.error, al.c(this.onInversed, al.c(this.disabled, al.c(this.mutedExtra, al.c(this.muted, Long.hashCode(j) * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomTextColors(default=");
        a83.b(this.f390default, ", muted=", sb);
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

    public /* synthetic */ IntercomTextColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, qq2 qq2Var) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }
}
