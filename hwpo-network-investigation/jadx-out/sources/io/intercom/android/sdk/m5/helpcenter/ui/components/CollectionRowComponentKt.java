package io.intercom.android.sdk.m5.helpcenter.ui.components;

import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.fh1;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.hh1;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.we1;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z2a;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CollectionRowComponentKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    /* JADX WARN: Code duplicated, block: B:73:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0170  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x0223  */
    /* JADX WARN: Code duplicated, block: B:84:0x0269  */
    /* JADX WARN: Code duplicated, block: B:86:0x0279  */
    /* JADX WARN: Code duplicated, block: B:88:0x027e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0283  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void CollectionRowComponent(final CollectionRowData collectionRowData, final oh4<? super String, g2b> oh4Var, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        boolean z;
        boolean z2;
        boolean z3;
        Object objF;
        c30.k kVar;
        sp0.a aVar2;
        aj1 aj1VarA;
        ox6 ox6Var4;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar3;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        ny8 ny8VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        aj1 aj1VarA2;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        bj4 bj4Var;
        final ox6 ox6Var5;
        xj8 xj8VarW;
        collectionRowData.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-471072842);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(collectionRowData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                ox6 ox6VarC4 = ir9.c(ox6Var3, 1.0f);
                bj4VarO.K(1498669980);
                if ((i3 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | z;
                objF = bj4VarO.f();
                if (z3 || objF == jt1.a.a) {
                    objF = new hh1(oh4Var, collectionRowData);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6VarM = eo7.m(we1.c(ox6VarC4, false, null, (mh4) objF, 15), 16.0f, 16.0f, 0.0f, 0.0f, 12);
                kVar = c30.c;
                aVar2 = di.a.m;
                aj1VarA = yi1.a(kVar, aVar2, bj4VarO, 0);
                ox6Var4 = ox6Var3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarM);
                bt1.c.getClass();
                aVar3 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                qs5 qs5Var = new qs5(true, 1.0f);
                aj1VarA2 = yi1.a(kVar, aVar2, bj4VarO, 0);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, qs5Var);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                String titleText = collectionRowData.getTitleText();
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i5 = IntercomTheme.$stable;
                mia.b(titleText, null, 0L, 0L, ob4.A, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i5).getType04Point5(), bj4VarO, 1572864, 0, 131006);
                bj4Var = bj4VarO;
                if (collectionRowData.getDescriptionVisibility() == 0 || z2a.w(collectionRowData.getDescriptionText())) {
                    bj4Var.K(-515673200);
                    b47.b(bj4Var, ir9.d(aVar, 4.0f));
                    bj4Var.U(false);
                } else {
                    bj4Var.K(-516077564);
                    b47.b(bj4Var, ir9.d(aVar, 4.0f));
                    mia.b(collectionRowData.getDescriptionText(), null, 0L, 0L, null, 0L, null, 0L, 2, false, 3, 0, null, intercomTheme.getTypography(bj4Var, i5).getType04Point5(), bj4Var, 0, 24960, 110590);
                    bj4Var = bj4Var;
                    b47.b(bj4Var, ir9.d(aVar, 8.0f));
                    bj4Var.U(false);
                }
                ArticleCountComponentKt.ArticleCountComponent(null, collectionRowData.getArticlesCount(), bj4Var, 0, 1);
                bj4Var.U(true);
                IntercomChevronKt.IntercomChevron(eo7.k(aVar, 22.0f, 0.0f, 2), bj4Var, 6, 0);
                bj4Var.U(true);
                IntercomDividerKt.IntercomDivider(eo7.m(aVar, 0.0f, 16.0f, 16.0f, 0.0f, 9), bj4Var, 6, 0);
                bj4Var.U(true);
                ox6Var5 = ox6Var4;
            } else {
                bj4VarO.u();
                bj4Var = bj4VarO;
                ox6Var5 = ox6Var2;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ih1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CollectionRowComponentKt.CollectionRowComponent$lambda$5(collectionRowData, oh4Var, ox6Var5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        if ((i3 & 147) == 146) {
            aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            ox6 ox6VarC5 = ir9.c(ox6Var3, 1.0f);
            bj4VarO.K(1498669980);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | z;
            objF = bj4VarO.f();
            if (z3) {
                objF = new hh1(oh4Var, collectionRowData);
                bj4VarO.C(objF);
            } else {
                objF = new hh1(oh4Var, collectionRowData);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarM2 = eo7.m(we1.c(ox6VarC5, false, null, (mh4) objF, 15), 16.0f, 16.0f, 0.0f, 0.0f, 12);
            kVar = c30.c;
            aVar2 = di.a.m;
            aj1VarA = yi1.a(kVar, aVar2, bj4VarO, 0);
            ox6Var4 = ox6Var3;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarM2);
            bt1.c.getClass();
            aVar3 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf2);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            qs5 qs5Var2 = new qs5(true, 1.0f);
            aj1VarA2 = yi1.a(kVar, aVar2, bj4VarO, 0);
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, qs5Var2);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA2);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            String titleText2 = collectionRowData.getTitleText();
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i6 = IntercomTheme.$stable;
            mia.b(titleText2, null, 0L, 0L, ob4.A, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(bj4VarO, i6).getType04Point5(), bj4VarO, 1572864, 0, 131006);
            bj4Var = bj4VarO;
            if (collectionRowData.getDescriptionVisibility() == 0) {
                bj4Var.K(-515673200);
                b47.b(bj4Var, ir9.d(aVar, 4.0f));
                bj4Var.U(false);
            } else {
                bj4Var.K(-515673200);
                b47.b(bj4Var, ir9.d(aVar, 4.0f));
                bj4Var.U(false);
            }
            ArticleCountComponentKt.ArticleCountComponent(null, collectionRowData.getArticlesCount(), bj4Var, 0, 1);
            bj4Var.U(true);
            IntercomChevronKt.IntercomChevron(eo7.k(aVar, 22.0f, 0.0f, 2), bj4Var, 6, 0);
            bj4Var.U(true);
            IntercomDividerKt.IntercomDivider(eo7.m(aVar, 0.0f, 16.0f, 16.0f, 0.0f, 9), bj4Var, 6, 0);
            bj4Var.U(true);
            ox6Var5 = ox6Var4;
        } else {
            aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            ox6 ox6VarC6 = ir9.c(ox6Var3, 1.0f);
            bj4VarO.K(1498669980);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | z;
            objF = bj4VarO.f();
            if (z3) {
                objF = new hh1(oh4Var, collectionRowData);
                bj4VarO.C(objF);
            } else {
                objF = new hh1(oh4Var, collectionRowData);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarM3 = eo7.m(we1.c(ox6VarC6, false, null, (mh4) objF, 15), 16.0f, 16.0f, 0.0f, 0.0f, 12);
            kVar = c30.c;
            aVar2 = di.a.m;
            aj1VarA = yi1.a(kVar, aVar2, bj4VarO, 0);
            ox6Var4 = ox6Var3;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarM3);
            bt1.c.getClass();
            aVar3 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf3);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            qs5 qs5Var3 = new qs5(true, 1.0f);
            aj1VarA2 = yi1.a(kVar, aVar2, bj4VarO, 0);
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, qs5Var3);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA2);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            String titleText3 = collectionRowData.getTitleText();
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i7 = IntercomTheme.$stable;
            mia.b(titleText3, null, 0L, 0L, ob4.A, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(bj4VarO, i7).getType04Point5(), bj4VarO, 1572864, 0, 131006);
            bj4Var = bj4VarO;
            if (collectionRowData.getDescriptionVisibility() == 0) {
                bj4Var.K(-515673200);
                b47.b(bj4Var, ir9.d(aVar, 4.0f));
                bj4Var.U(false);
            } else {
                bj4Var.K(-515673200);
                b47.b(bj4Var, ir9.d(aVar, 4.0f));
                bj4Var.U(false);
            }
            ArticleCountComponentKt.ArticleCountComponent(null, collectionRowData.getArticlesCount(), bj4Var, 0, 1);
            bj4Var.U(true);
            IntercomChevronKt.IntercomChevron(eo7.k(aVar, 22.0f, 0.0f, 2), bj4Var, 6, 0);
            bj4Var.U(true);
            IntercomDividerKt.IntercomDivider(eo7.m(aVar, 0.0f, 16.0f, 16.0f, 0.0f, 9), bj4Var, 6, 0);
            bj4Var.U(true);
            ox6Var5 = ox6Var4;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ih1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CollectionRowComponentKt.CollectionRowComponent$lambda$5(collectionRowData, oh4Var, ox6Var5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CollectionRowComponent$lambda$1$lambda$0(oh4 oh4Var, CollectionRowData collectionRowData) {
        oh4Var.invoke(collectionRowData.getId());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CollectionRowComponent$lambda$5(CollectionRowData collectionRowData, oh4 oh4Var, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        CollectionRowComponent(collectionRowData, oh4Var, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void RowPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(2042373209);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CollectionRowComponentKt.INSTANCE.m317getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gh1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CollectionRowComponentKt.RowPreview$lambda$6(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b RowPreview$lambda$6(int i, jt1 jt1Var, int i2) {
        RowPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void RowWithNoDescriptionPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-613238090);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CollectionRowComponentKt.INSTANCE.m319getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new fh1(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b RowWithNoDescriptionPreview$lambda$7(int i, jt1 jt1Var, int i2) {
        RowWithNoDescriptionPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
