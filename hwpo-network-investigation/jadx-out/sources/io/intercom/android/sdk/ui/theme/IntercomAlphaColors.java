package io.intercom.android.sdk.ui.theme;

import defpackage.a83;
import defpackage.al;
import defpackage.qq2;
import defpackage.uh1;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomAlphaColors {
    public static final int $stable = 0;
    private final long black10;
    private final long black100;
    private final long black20;
    private final long black30;
    private final long black40;
    private final long black50;
    private final long black60;
    private final long black70;
    private final long black80;
    private final long black90;
    private final long white10;
    private final long white100;
    private final long white20;
    private final long white30;
    private final long white40;
    private final long white50;
    private final long white60;
    private final long white70;
    private final long white80;
    private final long white90;

    private IntercomAlphaColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.black10 = j;
        this.black20 = j2;
        this.black30 = j3;
        this.black40 = j4;
        this.black50 = j5;
        this.black60 = j6;
        this.black70 = j7;
        this.black80 = j8;
        this.black90 = j9;
        this.black100 = j10;
        this.white10 = j11;
        this.white20 = j12;
        this.white30 = j13;
        this.white40 = j14;
        this.white50 = j15;
        this.white60 = j16;
        this.white70 = j17;
        this.white80 = j18;
        this.white90 = j19;
        this.white100 = j20;
    }

    /* JADX INFO: renamed from: copy-Cmkg8xs$default, reason: not valid java name */
    public static /* synthetic */ IntercomAlphaColors m665copyCmkg8xs$default(IntercomAlphaColors intercomAlphaColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, int i, Object obj) {
        long j21;
        long j22;
        long j23 = (i & 1) != 0 ? intercomAlphaColors.black10 : j;
        long j24 = (i & 2) != 0 ? intercomAlphaColors.black20 : j2;
        long j25 = (i & 4) != 0 ? intercomAlphaColors.black30 : j3;
        long j26 = (i & 8) != 0 ? intercomAlphaColors.black40 : j4;
        long j27 = (i & 16) != 0 ? intercomAlphaColors.black50 : j5;
        long j28 = (i & 32) != 0 ? intercomAlphaColors.black60 : j6;
        long j29 = (i & 64) != 0 ? intercomAlphaColors.black70 : j7;
        long j30 = j23;
        long j31 = (i & 128) != 0 ? intercomAlphaColors.black80 : j8;
        long j32 = (i & 256) != 0 ? intercomAlphaColors.black90 : j9;
        long j33 = (i & 512) != 0 ? intercomAlphaColors.black100 : j10;
        long j34 = (i & 1024) != 0 ? intercomAlphaColors.white10 : j11;
        long j35 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? intercomAlphaColors.white20 : j12;
        long j36 = (i & 4096) != 0 ? intercomAlphaColors.white30 : j13;
        long j37 = (i & 8192) != 0 ? intercomAlphaColors.white40 : j14;
        long j38 = (i & 16384) != 0 ? intercomAlphaColors.white50 : j15;
        long j39 = (i & 32768) != 0 ? intercomAlphaColors.white60 : j16;
        long j40 = (i & 65536) != 0 ? intercomAlphaColors.white70 : j17;
        long j41 = (i & 131072) != 0 ? intercomAlphaColors.white80 : j18;
        long j42 = (i & 262144) != 0 ? intercomAlphaColors.white90 : j19;
        if ((i & 524288) != 0) {
            j22 = j42;
            j21 = intercomAlphaColors.white100;
        } else {
            j21 = j20;
            j22 = j42;
        }
        return intercomAlphaColors.m686copyCmkg8xs(j30, j24, j25, j26, j27, j28, j29, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j22, j21);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m666component10d7_KjU() {
        return this.black10;
    }

    /* JADX INFO: renamed from: component10-0d7_KjU, reason: not valid java name */
    public final long m667component100d7_KjU() {
        return this.black100;
    }

    /* JADX INFO: renamed from: component11-0d7_KjU, reason: not valid java name */
    public final long m668component110d7_KjU() {
        return this.white10;
    }

    /* JADX INFO: renamed from: component12-0d7_KjU, reason: not valid java name */
    public final long m669component120d7_KjU() {
        return this.white20;
    }

    /* JADX INFO: renamed from: component13-0d7_KjU, reason: not valid java name */
    public final long m670component130d7_KjU() {
        return this.white30;
    }

    /* JADX INFO: renamed from: component14-0d7_KjU, reason: not valid java name */
    public final long m671component140d7_KjU() {
        return this.white40;
    }

    /* JADX INFO: renamed from: component15-0d7_KjU, reason: not valid java name */
    public final long m672component150d7_KjU() {
        return this.white50;
    }

    /* JADX INFO: renamed from: component16-0d7_KjU, reason: not valid java name */
    public final long m673component160d7_KjU() {
        return this.white60;
    }

    /* JADX INFO: renamed from: component17-0d7_KjU, reason: not valid java name */
    public final long m674component170d7_KjU() {
        return this.white70;
    }

    /* JADX INFO: renamed from: component18-0d7_KjU, reason: not valid java name */
    public final long m675component180d7_KjU() {
        return this.white80;
    }

    /* JADX INFO: renamed from: component19-0d7_KjU, reason: not valid java name */
    public final long m676component190d7_KjU() {
        return this.white90;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m677component20d7_KjU() {
        return this.black20;
    }

    /* JADX INFO: renamed from: component20-0d7_KjU, reason: not valid java name */
    public final long m678component200d7_KjU() {
        return this.white100;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m679component30d7_KjU() {
        return this.black30;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m680component40d7_KjU() {
        return this.black40;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m681component50d7_KjU() {
        return this.black50;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m682component60d7_KjU() {
        return this.black60;
    }

    /* JADX INFO: renamed from: component7-0d7_KjU, reason: not valid java name */
    public final long m683component70d7_KjU() {
        return this.black70;
    }

    /* JADX INFO: renamed from: component8-0d7_KjU, reason: not valid java name */
    public final long m684component80d7_KjU() {
        return this.black80;
    }

    /* JADX INFO: renamed from: component9-0d7_KjU, reason: not valid java name */
    public final long m685component90d7_KjU() {
        return this.black90;
    }

    /* JADX INFO: renamed from: copy-Cmkg8xs, reason: not valid java name */
    public final IntercomAlphaColors m686copyCmkg8xs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        return new IntercomAlphaColors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomAlphaColors)) {
            return false;
        }
        IntercomAlphaColors intercomAlphaColors = (IntercomAlphaColors) obj;
        return uh1.c(this.black10, intercomAlphaColors.black10) && uh1.c(this.black20, intercomAlphaColors.black20) && uh1.c(this.black30, intercomAlphaColors.black30) && uh1.c(this.black40, intercomAlphaColors.black40) && uh1.c(this.black50, intercomAlphaColors.black50) && uh1.c(this.black60, intercomAlphaColors.black60) && uh1.c(this.black70, intercomAlphaColors.black70) && uh1.c(this.black80, intercomAlphaColors.black80) && uh1.c(this.black90, intercomAlphaColors.black90) && uh1.c(this.black100, intercomAlphaColors.black100) && uh1.c(this.white10, intercomAlphaColors.white10) && uh1.c(this.white20, intercomAlphaColors.white20) && uh1.c(this.white30, intercomAlphaColors.white30) && uh1.c(this.white40, intercomAlphaColors.white40) && uh1.c(this.white50, intercomAlphaColors.white50) && uh1.c(this.white60, intercomAlphaColors.white60) && uh1.c(this.white70, intercomAlphaColors.white70) && uh1.c(this.white80, intercomAlphaColors.white80) && uh1.c(this.white90, intercomAlphaColors.white90) && uh1.c(this.white100, intercomAlphaColors.white100);
    }

    /* JADX INFO: renamed from: getBlack10-0d7_KjU, reason: not valid java name */
    public final long m687getBlack100d7_KjU() {
        return this.black10;
    }

    /* JADX INFO: renamed from: getBlack100-0d7_KjU, reason: not valid java name */
    public final long m688getBlack1000d7_KjU() {
        return this.black100;
    }

    /* JADX INFO: renamed from: getBlack20-0d7_KjU, reason: not valid java name */
    public final long m689getBlack200d7_KjU() {
        return this.black20;
    }

    /* JADX INFO: renamed from: getBlack30-0d7_KjU, reason: not valid java name */
    public final long m690getBlack300d7_KjU() {
        return this.black30;
    }

    /* JADX INFO: renamed from: getBlack40-0d7_KjU, reason: not valid java name */
    public final long m691getBlack400d7_KjU() {
        return this.black40;
    }

    /* JADX INFO: renamed from: getBlack50-0d7_KjU, reason: not valid java name */
    public final long m692getBlack500d7_KjU() {
        return this.black50;
    }

    /* JADX INFO: renamed from: getBlack60-0d7_KjU, reason: not valid java name */
    public final long m693getBlack600d7_KjU() {
        return this.black60;
    }

    /* JADX INFO: renamed from: getBlack70-0d7_KjU, reason: not valid java name */
    public final long m694getBlack700d7_KjU() {
        return this.black70;
    }

    /* JADX INFO: renamed from: getBlack80-0d7_KjU, reason: not valid java name */
    public final long m695getBlack800d7_KjU() {
        return this.black80;
    }

    /* JADX INFO: renamed from: getBlack90-0d7_KjU, reason: not valid java name */
    public final long m696getBlack900d7_KjU() {
        return this.black90;
    }

    /* JADX INFO: renamed from: getWhite10-0d7_KjU, reason: not valid java name */
    public final long m697getWhite100d7_KjU() {
        return this.white10;
    }

    /* JADX INFO: renamed from: getWhite100-0d7_KjU, reason: not valid java name */
    public final long m698getWhite1000d7_KjU() {
        return this.white100;
    }

    /* JADX INFO: renamed from: getWhite20-0d7_KjU, reason: not valid java name */
    public final long m699getWhite200d7_KjU() {
        return this.white20;
    }

    /* JADX INFO: renamed from: getWhite30-0d7_KjU, reason: not valid java name */
    public final long m700getWhite300d7_KjU() {
        return this.white30;
    }

    /* JADX INFO: renamed from: getWhite40-0d7_KjU, reason: not valid java name */
    public final long m701getWhite400d7_KjU() {
        return this.white40;
    }

    /* JADX INFO: renamed from: getWhite50-0d7_KjU, reason: not valid java name */
    public final long m702getWhite500d7_KjU() {
        return this.white50;
    }

    /* JADX INFO: renamed from: getWhite60-0d7_KjU, reason: not valid java name */
    public final long m703getWhite600d7_KjU() {
        return this.white60;
    }

    /* JADX INFO: renamed from: getWhite70-0d7_KjU, reason: not valid java name */
    public final long m704getWhite700d7_KjU() {
        return this.white70;
    }

    /* JADX INFO: renamed from: getWhite80-0d7_KjU, reason: not valid java name */
    public final long m705getWhite800d7_KjU() {
        return this.white80;
    }

    /* JADX INFO: renamed from: getWhite90-0d7_KjU, reason: not valid java name */
    public final long m706getWhite900d7_KjU() {
        return this.white90;
    }

    public int hashCode() {
        long j = this.black10;
        int i = uh1.l;
        return Long.hashCode(this.white100) + al.c(this.white90, al.c(this.white80, al.c(this.white70, al.c(this.white60, al.c(this.white50, al.c(this.white40, al.c(this.white30, al.c(this.white20, al.c(this.white10, al.c(this.black100, al.c(this.black90, al.c(this.black80, al.c(this.black70, al.c(this.black60, al.c(this.black50, al.c(this.black40, al.c(this.black30, al.c(this.black20, Long.hashCode(j) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomAlphaColors(black10=");
        a83.b(this.black10, ", black20=", sb);
        a83.b(this.black20, ", black30=", sb);
        a83.b(this.black30, ", black40=", sb);
        a83.b(this.black40, ", black50=", sb);
        a83.b(this.black50, ", black60=", sb);
        a83.b(this.black60, ", black70=", sb);
        a83.b(this.black70, ", black80=", sb);
        a83.b(this.black80, ", black90=", sb);
        a83.b(this.black90, ", black100=", sb);
        a83.b(this.black100, ", white10=", sb);
        a83.b(this.white10, ", white20=", sb);
        a83.b(this.white20, ", white30=", sb);
        a83.b(this.white30, ", white40=", sb);
        a83.b(this.white40, ", white50=", sb);
        a83.b(this.white50, ", white60=", sb);
        a83.b(this.white60, ", white70=", sb);
        a83.b(this.white70, ", white80=", sb);
        a83.b(this.white80, ", white90=", sb);
        a83.b(this.white90, ", white100=", sb);
        sb.append((Object) uh1.i(this.white100));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ IntercomAlphaColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, qq2 qq2Var) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
    }
}
