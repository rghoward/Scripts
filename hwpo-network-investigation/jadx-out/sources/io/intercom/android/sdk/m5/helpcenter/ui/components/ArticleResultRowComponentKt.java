package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.fda;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.iw;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.u7d;
import defpackage.we1;
import defpackage.ww9;
import defpackage.xj8;
import defpackage.y30;
import defpackage.yi1;
import defpackage.z2a;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.helpcenter.search.HighlightTagHandler;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleResultRowComponentKt;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleResultRowComponentKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x0243  */
    /* JADX WARN: Code duplicated, block: B:79:0x0253  */
    /* JADX WARN: Code duplicated, block: B:81:0x0258  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void ArticleResultRowComponent(final ArticleSearchResultRow.ArticleResultRow articleResultRow, final oh4<? super String, g2b> oh4Var, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        Object objF;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        aj1 aj1VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        Context context;
        IntercomTheme intercomTheme;
        int i5;
        ox6 ox6Var4;
        bj4 bj4Var;
        final ox6 ox6Var5;
        xj8 xj8VarW;
        articleResultRow.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-506618245);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(articleResultRow) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                ox6 ox6VarC3 = ir9.c(ox6Var3, 1.0f);
                bj4VarO.K(-866808730);
                i4 = 0;
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
                    objF = new y30(i4, oh4Var, articleResultRow);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6VarM = eo7.m(eo7.k(we1.c(ox6VarC3, false, null, (mh4) objF, 15), 0.0f, 16.0f, 1), 16.0f, 0.0f, 0.0f, 0.0f, 14);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarM);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                qs5 qs5Var = new qs5(true, 1.0f);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, qs5Var);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                iw annotatedString = BlockExtensionsKt.toAnnotatedString(highlightedText(articleResultRow.getTitleText()), context, (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                intercomTheme = IntercomTheme.INSTANCE;
                i5 = IntercomTheme.$stable;
                ox6Var4 = ox6Var3;
                mia.c(annotatedString, null, gh5.a(intercomTheme, bj4VarO, i5), 0L, null, 0L, null, 0L, 2, false, 0, 0, null, null, intercomTheme.getTypography(bj4VarO, i5).getType04(), bj4VarO, 0, 384, 258042);
                bj4Var = bj4VarO;
                bj4Var.K(1612603965);
                if (articleResultRow.getSummaryVisibility() == 0 && !z2a.w(articleResultRow.getSummaryText())) {
                    b47.b(bj4Var, ir9.d(ox6Var4, 4.0f));
                    mia.c(BlockExtensionsKt.toAnnotatedString(highlightedText(articleResultRow.getSummaryText()), context, (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), null, u7d.d(4286611584L), 0L, null, 0L, null, 0L, 2, false, 0, 0, null, null, intercomTheme.getTypography(bj4Var, i5).getType04Point5(), bj4Var, 384, 384, 258042);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                IntercomChevronKt.IntercomChevron(eo7.k(aVar, 22.0f, 0.0f, 2), bj4Var, 6, 0);
                bj4Var.U(true);
                ox6Var5 = ox6Var4;
            } else {
                bj4VarO.u();
                bj4Var = bj4VarO;
                ox6Var5 = ox6Var2;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: z30
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$4(articleResultRow, oh4Var, ox6Var5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        if ((i3 & 147) == 146) {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            ox6 ox6VarC4 = ir9.c(ox6Var3, 1.0f);
            bj4VarO.K(-866808730);
            i4 = 0;
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
                objF = new y30(i4, oh4Var, articleResultRow);
                bj4VarO.C(objF);
            } else {
                objF = new y30(i4, oh4Var, articleResultRow);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarM2 = eo7.m(eo7.k(we1.c(ox6VarC4, false, null, (mh4) objF, 15), 0.0f, 16.0f, 1), 16.0f, 0.0f, 0.0f, 0.0f, 14);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarM2);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, ny8VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf2);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            qs5 qs5Var2 = new qs5(true, 1.0f);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, qs5Var2);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            iw annotatedString2 = BlockExtensionsKt.toAnnotatedString(highlightedText(articleResultRow.getTitleText()), context, (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
            intercomTheme = IntercomTheme.INSTANCE;
            i5 = IntercomTheme.$stable;
            ox6Var4 = ox6Var3;
            mia.c(annotatedString2, null, gh5.a(intercomTheme, bj4VarO, i5), 0L, null, 0L, null, 0L, 2, false, 0, 0, null, null, intercomTheme.getTypography(bj4VarO, i5).getType04(), bj4VarO, 0, 384, 258042);
            bj4Var = bj4VarO;
            bj4Var.K(1612603965);
            if (articleResultRow.getSummaryVisibility() == 0) {
                b47.b(bj4Var, ir9.d(ox6Var4, 4.0f));
                mia.c(BlockExtensionsKt.toAnnotatedString(highlightedText(articleResultRow.getSummaryText()), context, (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), null, u7d.d(4286611584L), 0L, null, 0L, null, 0L, 2, false, 0, 0, null, null, intercomTheme.getTypography(bj4Var, i5).getType04Point5(), bj4Var, 384, 384, 258042);
                bj4Var = bj4Var;
            }
            bj4Var.U(false);
            bj4Var.U(true);
            IntercomChevronKt.IntercomChevron(eo7.k(aVar, 22.0f, 0.0f, 2), bj4Var, 6, 0);
            bj4Var.U(true);
            ox6Var5 = ox6Var4;
        } else {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            ox6 ox6VarC5 = ir9.c(ox6Var3, 1.0f);
            bj4VarO.K(-866808730);
            i4 = 0;
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
                objF = new y30(i4, oh4Var, articleResultRow);
                bj4VarO.C(objF);
            } else {
                objF = new y30(i4, oh4Var, articleResultRow);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarM3 = eo7.m(eo7.k(we1.c(ox6VarC5, false, null, (mh4) objF, 15), 0.0f, 16.0f, 1), 16.0f, 0.0f, 0.0f, 0.0f, 14);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarM3);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, ny8VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf3);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            qs5 qs5Var3 = new qs5(true, 1.0f);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, qs5Var3);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            iw annotatedString3 = BlockExtensionsKt.toAnnotatedString(highlightedText(articleResultRow.getTitleText()), context, (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
            intercomTheme = IntercomTheme.INSTANCE;
            i5 = IntercomTheme.$stable;
            ox6Var4 = ox6Var3;
            mia.c(annotatedString3, null, gh5.a(intercomTheme, bj4VarO, i5), 0L, null, 0L, null, 0L, 2, false, 0, 0, null, null, intercomTheme.getTypography(bj4VarO, i5).getType04(), bj4VarO, 0, 384, 258042);
            bj4Var = bj4VarO;
            bj4Var.K(1612603965);
            if (articleResultRow.getSummaryVisibility() == 0) {
                b47.b(bj4Var, ir9.d(ox6Var4, 4.0f));
                mia.c(BlockExtensionsKt.toAnnotatedString(highlightedText(articleResultRow.getSummaryText()), context, (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), null, u7d.d(4286611584L), 0L, null, 0L, null, 0L, 2, false, 0, 0, null, null, intercomTheme.getTypography(bj4Var, i5).getType04Point5(), bj4Var, 384, 384, 258042);
                bj4Var = bj4Var;
            }
            bj4Var.U(false);
            bj4Var.U(true);
            IntercomChevronKt.IntercomChevron(eo7.k(aVar, 22.0f, 0.0f, 2), bj4Var, 6, 0);
            bj4Var.U(true);
            ox6Var5 = ox6Var4;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: z30
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ArticleResultRowComponentKt.ArticleResultRowComponent$lambda$4(articleResultRow, oh4Var, ox6Var5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ArticleResultRowComponent$lambda$1$lambda$0(oh4 oh4Var, ArticleSearchResultRow.ArticleResultRow articleResultRow) {
        oh4Var.invoke(articleResultRow.getId());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ArticleResultRowComponent$lambda$4(ArticleSearchResultRow.ArticleResultRow articleResultRow, oh4 oh4Var, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        ArticleResultRowComponent(articleResultRow, oh4Var, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ArticleRowComponentPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(387759007);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleResultRowComponentKt.INSTANCE.m310getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: a40
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ArticleResultRowComponentKt.ArticleRowComponentPreview$lambda$5(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ArticleRowComponentPreview$lambda$5(int i, jt1 jt1Var, int i2) {
        ArticleRowComponentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final Spanned highlightedText(String str) {
        Spanned spannedFromHtml = Html.fromHtml("&zwj;" + str, 0, null, new HighlightTagHandler());
        spannedFromHtml.getClass();
        return spannedFromHtml;
    }
}
