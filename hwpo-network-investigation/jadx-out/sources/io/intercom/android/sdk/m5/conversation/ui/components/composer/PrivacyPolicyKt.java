package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ac4;
import defpackage.b47;
import defpackage.beb;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c05;
import defpackage.c30;
import defpackage.dg0;
import defpackage.di;
import defpackage.eo7;
import defpackage.fda;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.q69;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.w98;
import defpackage.we1;
import defpackage.ww9;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PrivacyPolicyKt {
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x01da  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void PrivacyPolicy(String str, ox6 ox6Var, mh4<g2b> mh4Var, jt1 jt1Var, int i, int i2) {
        int i3;
        ox6 ox6Var2;
        int i4;
        mh4<g2b> mh4Var2;
        int i5;
        ox6.a aVar;
        mh4<g2b> mh4Var3;
        IntercomTheme intercomTheme;
        int i6;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        mh4<g2b> mh4Var4;
        Object objF;
        xj8 xj8VarW;
        str.getClass();
        bj4 bj4VarO = jt1Var.o(-2047732965);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    mh4Var2 = mh4Var;
                    if (bj4VarO.j(mh4Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) == 146 || !bj4VarO.r()) {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(-1753709179);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new w98();
                            bj4VarO.C(objF);
                        }
                        mh4Var3 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    intercomTheme = IntercomTheme.INSTANCE;
                    i6 = IntercomTheme.$stable;
                    ox6 ox6VarE = ir9.e(eo7.j(16.0f, 12.0f, gi0.c(ir9.c(ox6Var2, 1.0f), intercomTheme.getColors(bj4VarO, i6).m757getBubbleBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i6).b)), 0.0f, 70.0f, 1);
                    ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarE);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    Spanned spannedFromHtml = Html.fromHtml(str, 0);
                    spannedFromHtml.getClass();
                    mh4<g2b> mh4Var5 = mh4Var3;
                    mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), q69.h(new qs5(true, 1.0f), q69.f(bj4VarO), 14), ac4.b(intercomTheme, bj4VarO, i6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(bj4VarO, i6).getType05(), bj4VarO, 0, 0, 262136);
                    bj4VarO = bj4VarO;
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    m65.b(is7.a(R.drawable.intercom_close, bj4VarO, 0), nr1.f(bj4VarO, R.string.intercom_close), we1.c(ir9.j(aVar, 10.0f).H(new beb()), false, null, mh4Var5, 15), intercomTheme.getColors(bj4VarO, i6).getIcon().m809getMuted0d7_KjU(), bj4VarO, 8, 0);
                    bj4VarO.U(true);
                    mh4Var4 = mh4Var5;
                } else {
                    bj4VarO.u();
                    mh4Var4 = mh4Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new dg0(i, i2, mh4Var4, ox6Var2, str);
                }
            }
            i3 |= 384;
            mh4Var2 = mh4Var;
            if ((i3 & 147) == 146) {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    bj4VarO.K(-1753709179);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new w98();
                        bj4VarO.C(objF);
                    }
                    mh4Var3 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i6 = IntercomTheme.$stable;
                ox6 ox6VarE2 = ir9.e(eo7.j(16.0f, 12.0f, gi0.c(ir9.c(ox6Var2, 1.0f), intercomTheme.getColors(bj4VarO, i6).m757getBubbleBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i6).b)), 0.0f, 70.0f, 1);
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarE2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                Spanned spannedFromHtml2 = Html.fromHtml(str, 0);
                spannedFromHtml2.getClass();
                mh4<g2b> mh4Var6 = mh4Var3;
                mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), q69.h(new qs5(true, 1.0f), q69.f(bj4VarO), 14), ac4.b(intercomTheme, bj4VarO, i6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(bj4VarO, i6).getType05(), bj4VarO, 0, 0, 262136);
                bj4VarO = bj4VarO;
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                m65.b(is7.a(R.drawable.intercom_close, bj4VarO, 0), nr1.f(bj4VarO, R.string.intercom_close), we1.c(ir9.j(aVar, 10.0f).H(new beb()), false, null, mh4Var6, 15), intercomTheme.getColors(bj4VarO, i6).getIcon().m809getMuted0d7_KjU(), bj4VarO, 8, 0);
                bj4VarO.U(true);
                mh4Var4 = mh4Var6;
            } else {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    bj4VarO.K(-1753709179);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new w98();
                        bj4VarO.C(objF);
                    }
                    mh4Var3 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i6 = IntercomTheme.$stable;
                ox6 ox6VarE3 = ir9.e(eo7.j(16.0f, 12.0f, gi0.c(ir9.c(ox6Var2, 1.0f), intercomTheme.getColors(bj4VarO, i6).m757getBubbleBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i6).b)), 0.0f, 70.0f, 1);
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarE3);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                Spanned spannedFromHtml3 = Html.fromHtml(str, 0);
                spannedFromHtml3.getClass();
                mh4<g2b> mh4Var7 = mh4Var3;
                mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml3, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), q69.h(new qs5(true, 1.0f), q69.f(bj4VarO), 14), ac4.b(intercomTheme, bj4VarO, i6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(bj4VarO, i6).getType05(), bj4VarO, 0, 0, 262136);
                bj4VarO = bj4VarO;
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                m65.b(is7.a(R.drawable.intercom_close, bj4VarO, 0), nr1.f(bj4VarO, R.string.intercom_close), we1.c(ir9.j(aVar, 10.0f).H(new beb()), false, null, mh4Var7, 15), intercomTheme.getColors(bj4VarO, i6).getIcon().m809getMuted0d7_KjU(), bj4VarO, 8, 0);
                bj4VarO.U(true);
                mh4Var4 = mh4Var7;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new dg0(i, i2, mh4Var4, ox6Var2, str);
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                mh4Var2 = mh4Var;
                if (bj4VarO.j(mh4Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) == 146) {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    bj4VarO.K(-1753709179);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new w98();
                        bj4VarO.C(objF);
                    }
                    mh4Var3 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i6 = IntercomTheme.$stable;
                ox6 ox6VarE4 = ir9.e(eo7.j(16.0f, 12.0f, gi0.c(ir9.c(ox6Var2, 1.0f), intercomTheme.getColors(bj4VarO, i6).m757getBubbleBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i6).b)), 0.0f, 70.0f, 1);
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarE4);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                Spanned spannedFromHtml4 = Html.fromHtml(str, 0);
                spannedFromHtml4.getClass();
                mh4<g2b> mh4Var8 = mh4Var3;
                mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml4, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), q69.h(new qs5(true, 1.0f), q69.f(bj4VarO), 14), ac4.b(intercomTheme, bj4VarO, i6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(bj4VarO, i6).getType05(), bj4VarO, 0, 0, 262136);
                bj4VarO = bj4VarO;
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                m65.b(is7.a(R.drawable.intercom_close, bj4VarO, 0), nr1.f(bj4VarO, R.string.intercom_close), we1.c(ir9.j(aVar, 10.0f).H(new beb()), false, null, mh4Var8, 15), intercomTheme.getColors(bj4VarO, i6).getIcon().m809getMuted0d7_KjU(), bj4VarO, 8, 0);
                bj4VarO.U(true);
                mh4Var4 = mh4Var8;
            } else {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    bj4VarO.K(-1753709179);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new w98();
                        bj4VarO.C(objF);
                    }
                    mh4Var3 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i6 = IntercomTheme.$stable;
                ox6 ox6VarE5 = ir9.e(eo7.j(16.0f, 12.0f, gi0.c(ir9.c(ox6Var2, 1.0f), intercomTheme.getColors(bj4VarO, i6).m757getBubbleBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i6).b)), 0.0f, 70.0f, 1);
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarE5);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                Spanned spannedFromHtml5 = Html.fromHtml(str, 0);
                spannedFromHtml5.getClass();
                mh4<g2b> mh4Var9 = mh4Var3;
                mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml5, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), q69.h(new qs5(true, 1.0f), q69.f(bj4VarO), 14), ac4.b(intercomTheme, bj4VarO, i6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(bj4VarO, i6).getType05(), bj4VarO, 0, 0, 262136);
                bj4VarO = bj4VarO;
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                m65.b(is7.a(R.drawable.intercom_close, bj4VarO, 0), nr1.f(bj4VarO, R.string.intercom_close), we1.c(ir9.j(aVar, 10.0f).H(new beb()), false, null, mh4Var9, 15), intercomTheme.getColors(bj4VarO, i6).getIcon().m809getMuted0d7_KjU(), bj4VarO, 8, 0);
                bj4VarO.U(true);
                mh4Var4 = mh4Var9;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new dg0(i, i2, mh4Var4, ox6Var2, str);
            }
        }
        i3 |= 384;
        mh4Var2 = mh4Var;
        if ((i3 & 147) == 146) {
            aVar = ox6.a.t;
            if (i7 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                bj4VarO.K(-1753709179);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new w98();
                    bj4VarO.C(objF);
                }
                mh4Var3 = (mh4) objF;
                bj4VarO.U(false);
            } else {
                mh4Var3 = mh4Var2;
            }
            intercomTheme = IntercomTheme.INSTANCE;
            i6 = IntercomTheme.$stable;
            ox6 ox6VarE6 = ir9.e(eo7.j(16.0f, 12.0f, gi0.c(ir9.c(ox6Var2, 1.0f), intercomTheme.getColors(bj4VarO, i6).m757getBubbleBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i6).b)), 0.0f, 70.0f, 1);
            ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarE6);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
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
            Spanned spannedFromHtml6 = Html.fromHtml(str, 0);
            spannedFromHtml6.getClass();
            mh4<g2b> mh4Var10 = mh4Var3;
            mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml6, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), q69.h(new qs5(true, 1.0f), q69.f(bj4VarO), 14), ac4.b(intercomTheme, bj4VarO, i6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(bj4VarO, i6).getType05(), bj4VarO, 0, 0, 262136);
            bj4VarO = bj4VarO;
            b47.b(bj4VarO, ir9.n(aVar, 8.0f));
            m65.b(is7.a(R.drawable.intercom_close, bj4VarO, 0), nr1.f(bj4VarO, R.string.intercom_close), we1.c(ir9.j(aVar, 10.0f).H(new beb()), false, null, mh4Var10, 15), intercomTheme.getColors(bj4VarO, i6).getIcon().m809getMuted0d7_KjU(), bj4VarO, 8, 0);
            bj4VarO.U(true);
            mh4Var4 = mh4Var10;
        } else {
            aVar = ox6.a.t;
            if (i7 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                bj4VarO.K(-1753709179);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new w98();
                    bj4VarO.C(objF);
                }
                mh4Var3 = (mh4) objF;
                bj4VarO.U(false);
            } else {
                mh4Var3 = mh4Var2;
            }
            intercomTheme = IntercomTheme.INSTANCE;
            i6 = IntercomTheme.$stable;
            ox6 ox6VarE7 = ir9.e(eo7.j(16.0f, 12.0f, gi0.c(ir9.c(ox6Var2, 1.0f), intercomTheme.getColors(bj4VarO, i6).m757getBubbleBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i6).b)), 0.0f, 70.0f, 1);
            ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarE7);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
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
            Spanned spannedFromHtml7 = Html.fromHtml(str, 0);
            spannedFromHtml7.getClass();
            mh4<g2b> mh4Var11 = mh4Var3;
            mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml7, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), q69.h(new qs5(true, 1.0f), q69.f(bj4VarO), 14), ac4.b(intercomTheme, bj4VarO, i6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(bj4VarO, i6).getType05(), bj4VarO, 0, 0, 262136);
            bj4VarO = bj4VarO;
            b47.b(bj4VarO, ir9.n(aVar, 8.0f));
            m65.b(is7.a(R.drawable.intercom_close, bj4VarO, 0), nr1.f(bj4VarO, R.string.intercom_close), we1.c(ir9.j(aVar, 10.0f).H(new beb()), false, null, mh4Var11, 15), intercomTheme.getColors(bj4VarO, i6).getIcon().m809getMuted0d7_KjU(), bj4VarO, 8, 0);
            bj4VarO.U(true);
            mh4Var4 = mh4Var11;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new dg0(i, i2, mh4Var4, ox6Var2, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PrivacyPolicy$lambda$3(String str, ox6 ox6Var, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        PrivacyPolicy(str, ox6Var, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void PrivacyPolicyPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-520891099);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PrivacyPolicyKt.INSTANCE.m176getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new c05(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PrivacyPolicyPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        PrivacyPolicyPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
