package io.intercom.android.sdk.ui.theme;

import defpackage.cka;
import defpackage.g0b;
import defpackage.hf8;
import defpackage.k0b;
import defpackage.ob4;
import defpackage.ui5;
import defpackage.wja;
import defpackage.y0a;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomTypographyKt {
    private static final hf8<IntercomTypography> LocalIntercomTypography = new y0a(new ui5());

    public static final IntercomTypography defaultIntercomTypography() {
        wja wjaVar = new wja(0L, cka.b(32), ob4.B, 0L, 0, cka.b(48), 16646137);
        long jB = cka.b(28);
        long jB2 = cka.b(32);
        ob4 ob4Var = ob4.A;
        wja wjaVar2 = new wja(0L, jB, ob4Var, 0L, 0, jB2, 16646137);
        wja wjaVar3 = new wja(0L, cka.b(20), ob4Var, 0L, 0, cka.b(24), 16646137);
        long jB3 = cka.b(16);
        long jB4 = cka.b(20);
        ob4 ob4Var2 = ob4.y;
        return new IntercomTypography(wjaVar, wjaVar2, wjaVar3, new wja(0L, jB3, ob4Var2, 0L, 0, jB4, 16646137), new wja(0L, cka.b(16), ob4Var, 0L, 0, cka.b(20), 16646137), new wja(0L, cka.b(14), ob4Var2, 0L, 0, cka.b(18), 16646137), new wja(0L, cka.b(12), ob4Var2, 0L, 0, cka.b(18), 16646137));
    }

    public static final hf8<IntercomTypography> getLocalIntercomTypography() {
        return LocalIntercomTypography;
    }

    public static final g0b toMaterialTypography(IntercomTypography intercomTypography) {
        wja wjaVar;
        wja wjaVar2;
        wja wjaVar3;
        wja wjaVar4;
        wja wjaVar5;
        wja wjaVar6;
        wja wjaVar7;
        wja wjaVar8;
        wja wjaVar9;
        wja wjaVar10;
        wja wjaVar11;
        wja wjaVar12;
        wja wjaVar13;
        wja wjaVar14;
        intercomTypography.getClass();
        wja wjaVar15 = null;
        if ((32767 & 1) != 0) {
            wja wjaVar16 = k0b.a;
            wjaVar = k0b.d;
        } else {
            wjaVar = null;
        }
        if ((32767 & 2) != 0) {
            wja wjaVar17 = k0b.a;
            wjaVar2 = k0b.e;
        } else {
            wjaVar2 = null;
        }
        if ((32767 & 4) != 0) {
            wja wjaVar18 = k0b.a;
            wjaVar3 = k0b.f;
        } else {
            wjaVar3 = null;
        }
        if ((32767 & 8) != 0) {
            wja wjaVar19 = k0b.a;
            wjaVar4 = k0b.g;
        } else {
            wjaVar4 = null;
        }
        if ((32767 & 16) != 0) {
            wja wjaVar20 = k0b.a;
            wjaVar5 = k0b.h;
        } else {
            wjaVar5 = null;
        }
        if ((32767 & 32) != 0) {
            wja wjaVar21 = k0b.a;
            wjaVar6 = k0b.i;
        } else {
            wjaVar6 = null;
        }
        if ((32767 & 64) != 0) {
            wja wjaVar22 = k0b.a;
            wjaVar7 = k0b.m;
        } else {
            wjaVar7 = null;
        }
        if ((32767 & 128) != 0) {
            wja wjaVar23 = k0b.a;
            wjaVar8 = k0b.n;
        } else {
            wjaVar8 = null;
        }
        if ((32767 & 256) != 0) {
            wja wjaVar24 = k0b.a;
            wjaVar9 = k0b.o;
        } else {
            wjaVar9 = null;
        }
        if ((32767 & 512) != 0) {
            wja wjaVar25 = k0b.a;
            wjaVar10 = k0b.a;
        } else {
            wjaVar10 = null;
        }
        if ((32767 & 1024) != 0) {
            wja wjaVar26 = k0b.a;
            wjaVar11 = k0b.b;
        } else {
            wjaVar11 = null;
        }
        if ((32767 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
            wja wjaVar27 = k0b.a;
            wjaVar12 = k0b.c;
        } else {
            wjaVar12 = null;
        }
        if ((32767 & 4096) != 0) {
            wja wjaVar28 = k0b.a;
            wjaVar13 = k0b.j;
        } else {
            wjaVar13 = null;
        }
        if ((32767 & 8192) != 0) {
            wja wjaVar29 = k0b.a;
            wjaVar14 = k0b.k;
        } else {
            wjaVar14 = null;
        }
        if ((32767 & 16384) != 0) {
            wja wjaVar30 = k0b.a;
            wjaVar15 = k0b.l;
        }
        wja wjaVar31 = wjaVar15;
        return new g0b(wjaVar, wjaVar2, wjaVar3, wjaVar4, wjaVar5, wjaVar6, wjaVar7, wjaVar8, wjaVar9, intercomTypography.getType04(), intercomTypography.getType04Point5(), wjaVar12, wjaVar13, intercomTypography.getType05(), wjaVar31, wjaVar, wjaVar2, wjaVar3, wjaVar4, wjaVar5, wjaVar6, wjaVar7, wjaVar8, wjaVar9, wjaVar10, wjaVar11, wjaVar12, wjaVar13, wjaVar14, wjaVar31);
    }
}
