package io.intercom.android.sdk.post;

import defpackage.aj1;
import defpackage.al8;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.mo1;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.py8;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.uh1;
import defpackage.w20;
import defpackage.we1;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z2a;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.post.IntercomPostActivityKt;
import io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPostActivityKt {
    public static final void BottomBarContent(ox6 ox6Var, ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var, jt1 jt1Var, int i) {
        int i2;
        ox6Var.getClass();
        ei4Var.getClass();
        bj4 bj4VarO = jt1Var.o(622304394);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(ei4Var) ? 32 : 16;
        }
        int i3 = 1;
        if ((i2 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6 ox6VarK = eo7.k(ir9.d(w20.c(gi0.c(ir9.c(ox6Var, 1.0f), uh1.b, al8.a), w20.f), 56.0f), 16.0f, 0.0f, 2);
            ny8 ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarK);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ei4Var.invoke(py8.a, bj4VarO, Integer.valueOf((i2 & 112) | 6));
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new mo1(ox6Var, ei4Var, i, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BottomBarContent$lambda$5(ox6 ox6Var, ei4 ei4Var, int i, jt1 jt1Var, int i2) {
        BottomBarContent(ox6Var, ei4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TopBar(final ox6 ox6Var, final Avatar avatar, final String str, final String str2, final mh4<g2b> mh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-554464404);
        j1b j1bVar = bj4VarO.a;
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(avatar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.J(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.J(str2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6 ox6VarK = eo7.k(ir9.d(w20.c(gi0.c(ir9.c(ox6Var, 1.0f), uh1.b, al8.a), w20.d), 56.0f), 16.0f, 0.0f, 2);
            c30.f fVar = c30.f;
            sp0.b bVar = di.a.k;
            ny8 ny8VarA = ly8.a(fVar, bVar, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarK);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            bt1.a.c cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, ny8VarA);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar2 = bt1.a.g;
            rd7.d(bj4VarO, bVar2, numValueOf);
            bt1.a.C0034a c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ny8 ny8VarA2 = ly8.a(c30.a, bVar, bj4VarO, 48);
            int i3 = i2;
            int iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP2 = bj4VarO.P();
            ox6.a aVar2 = ox6.a.t;
            ox6 ox6VarC2 = it1.c(bj4VarO, aVar2);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA2);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            long j = uh1.e;
            CircularAvatarComponentKt.m451CircularAvataraMcp0Q(avatar, j, 32.0f, bj4VarO, ((i3 >> 3) & 14) | 432, 0);
            ox6 ox6VarK2 = eo7.k(aVar2, 8.0f, 0.0f, 2);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP3 = bj4VarO.P();
            ox6 ox6VarC3 = it1.c(bj4VarO, ox6VarK2);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar2, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i4 = IntercomTheme.$stable;
            mia.b(str, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i4).getType04Point5(), bj4VarO, ((i3 >> 6) & 14) | 384, 0, 131066);
            bj4 bj4Var = bj4VarO;
            bj4Var.K(-2145802837);
            if (!z2a.w(str2)) {
                mia.b(str2, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i4).getType05(), bj4Var, ((i3 >> 9) & 14) | 384, 0, 131066);
                bj4Var = bj4Var;
            }
            bj4Var.U(false);
            bj4Var.U(true);
            bj4Var.U(true);
            bj4 bj4Var2 = bj4Var;
            m65.b(is7.a(R.drawable.intercom_ic_close, bj4Var, 0), nr1.f(bj4Var, io.intercom.android.sdk.R.string.intercom_dismiss), we1.c(aVar2, false, null, mh4Var, 15), j, bj4Var2, 3080, 0);
            bj4VarO = bj4Var2;
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: di5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomPostActivityKt.TopBar$lambda$3(ox6Var, avatar, str, str2, mh4Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TopBar$lambda$3(ox6 ox6Var, Avatar avatar, String str, String str2, mh4 mh4Var, int i, jt1 jt1Var, int i2) {
        TopBar(ox6Var, avatar, str, str2, mh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
