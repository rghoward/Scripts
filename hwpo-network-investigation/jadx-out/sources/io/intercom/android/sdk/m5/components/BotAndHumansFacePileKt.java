package io.intercom.android.sdk.m5.components;

import com.intercom.twig.BuildConfig;
import defpackage.a30;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cz1;
import defpackage.di;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.js7;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qq2;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.s41;
import defpackage.tq5;
import defpackage.x3;
import defpackage.xj8;
import defpackage.z63;
import defpackage.zs0;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BotAndHumansFacePileKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: BotAndHumansFacePile-hGBTI10, reason: not valid java name */
    public static final void m21BotAndHumansFacePilehGBTI10(ox6 ox6Var, final Avatar avatar, final js7<? extends Avatar, ? extends Avatar> js7Var, final float f, String str, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        final float f2;
        boolean z;
        jt1.a.C0187a c0187a;
        final float f3;
        final String str2;
        final ox6 ox6Var3;
        avatar.getClass();
        js7Var.getClass();
        bj4 bj4VarO = jt1Var.o(957129373);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(avatar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(js7Var) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.g(f) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var3 = ox6Var2;
            str2 = str;
        } else {
            ox6.a aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var2 = aVar;
            }
            String str3 = (i2 & 16) != 0 ? BuildConfig.FLAVOR : str;
            final float f4 = 0.75f * f;
            final float f5 = 0.25f * f4;
            ny8 ny8VarA = ly8.a(new c30.h((0.0625f * f) - f5, true, new a30()), di.a.k, bj4VarO, 48);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var2);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            qq2 qq2Var = null;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            Avatar avatar2 = (Avatar) js7Var.t;
            bj4VarO.K(1213840539);
            jt1.a.C0187a c0187a2 = jt1.a.a;
            boolean z2 = false;
            if (avatar2 == null) {
                f3 = f4;
                f2 = f5;
                c0187a = c0187a2;
                z = false;
            } else {
                AvatarWrapper avatarWrapper = new AvatarWrapper(avatar2, z2, 2, qq2Var);
                ox6 ox6VarJ = ir9.j(aVar, f4);
                bj4VarO.K(1012545465);
                boolean zG = bj4VarO.g(f4) | bj4VarO.g(f5);
                Object objF = bj4VarO.f();
                if (zG || objF == c0187a2) {
                    objF = new oh4() { // from class: at0
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2(f4, f5, (cz1) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6VarE = z63.e(ox6VarJ, (oh4) objF);
                f2 = f5;
                z = false;
                c0187a = c0187a2;
                f3 = f4;
                AvatarIconKt.m91AvatarIconRd90Nhg(ox6VarE, avatarWrapper, null, false, 0L, null, bj4VarO, 0, 60);
            }
            bj4VarO.U(z);
            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f), new AvatarWrapper(avatar, true), null, false, 0L, null, bj4VarO, 0, 60);
            Avatar avatar3 = (Avatar) js7Var.u;
            bj4VarO.K(1213869401);
            if (avatar3 != null) {
                AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatar3, z, 2, null);
                ox6 ox6VarJ2 = ir9.j(aVar, f3);
                bj4VarO.K(1012574327);
                boolean zG2 = bj4VarO.g(f2) | bj4VarO.g(f3);
                Object objF2 = bj4VarO.f();
                if (zG2 || objF2 == c0187a) {
                    objF2 = new oh4() { // from class: bt0
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7(f2, f3, (cz1) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(z);
                AvatarIconKt.m91AvatarIconRd90Nhg(z63.e(ox6VarJ2, (oh4) objF2), avatarWrapper2, null, false, 0L, null, bj4VarO, 0, 60);
            }
            bj4VarO.U(z);
            bj4VarO.U(true);
            str2 = str3;
            ox6Var3 = ox6Var2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ct0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BotAndHumansFacePileKt.BotAndHumansFacePile_hGBTI10$lambda$11(ox6Var3, avatar, js7Var, f, str2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BotAndHumansFacePile_hGBTI10$lambda$10$lambda$4$lambda$3$lambda$2(float f, float f2, cz1 cz1Var) {
        cz1Var.getClass();
        if (cz1Var.getLayoutDirection() == tq5.t) {
            float fU0 = cz1Var.U0(f - f2);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cz1Var.c() & 4294967295L));
            s41.b bVarY0 = cz1Var.Y0();
            long jD = bVarY0.d();
            bVarY0.a().f();
            try {
                bVarY0.a.b(0.0f, 0.0f, fU0, fIntBitsToFloat, 1);
                cz1Var.K1();
            } finally {
                x3.b(bVarY0, jD);
            }
        } else {
            float fU1 = cz1Var.U0(f2);
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cz1Var.c() >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cz1Var.c() & 4294967295L));
            s41.b bVarY1 = cz1Var.Y0();
            long jD2 = bVarY1.d();
            bVarY1.a().f();
            try {
                bVarY1.a.b(fU1, 0.0f, fIntBitsToFloat2, fIntBitsToFloat3, 1);
                cz1Var.K1();
            } finally {
                x3.b(bVarY1, jD2);
            }
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BotAndHumansFacePile_hGBTI10$lambda$10$lambda$9$lambda$8$lambda$7(float f, float f2, cz1 cz1Var) {
        cz1Var.getClass();
        if (cz1Var.getLayoutDirection() == tq5.t) {
            float fU0 = cz1Var.U0(f);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cz1Var.c() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cz1Var.c() & 4294967295L));
            s41.b bVarY0 = cz1Var.Y0();
            long jD = bVarY0.d();
            bVarY0.a().f();
            try {
                bVarY0.a.b(fU0, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                cz1Var.K1();
            } finally {
                x3.b(bVarY0, jD);
            }
        } else {
            float fU1 = cz1Var.U0(f2 - f);
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cz1Var.c() & 4294967295L));
            s41.b bVarY1 = cz1Var.Y0();
            long jD2 = bVarY1.d();
            bVarY1.a().f();
            try {
                bVarY1.a.b(0.0f, 0.0f, fU1, fIntBitsToFloat3, 1);
                cz1Var.K1();
            } finally {
                x3.b(bVarY1, jD2);
            }
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BotAndHumansFacePile_hGBTI10$lambda$11(ox6 ox6Var, Avatar avatar, js7 js7Var, float f, String str, int i, int i2, jt1 jt1Var, int i3) {
        m21BotAndHumansFacePilehGBTI10(ox6Var, avatar, js7Var, f, str, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void BotWithTwoTeammatesPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-366024049);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.m27getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zs0(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BotWithTwoTeammatesPreview$lambda$12(int i, jt1 jt1Var, int i2) {
        BotWithTwoTeammatesPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void BotsWithOneTeammatePreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1130939763);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BotAndHumansFacePileKt.INSTANCE.m28getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: dt0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BotAndHumansFacePileKt.BotsWithOneTeammatePreview$lambda$13(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BotsWithOneTeammatePreview$lambda$13(int i, jt1 jt1Var, int i2) {
        BotsWithOneTeammatePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final js7<Avatar, Avatar> humanAvatarPairForHome(List<? extends Avatar> list) {
        list.getClass();
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new js7<>(list.get(0), list.get(1)) : new js7<>(null, list.get(0));
        }
        return new js7<>(null, null);
    }
}
