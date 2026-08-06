package io.intercom.android.sdk.m5.helpcenter.ui.components;

import defpackage.b40;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.e40;
import defpackage.eo7;
import defpackage.f40;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
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
import defpackage.we1;
import defpackage.xj8;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleRowComponentKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void ArticleRowComponent(ox6 ox6Var, final CollectionDetailsRow.ArticleRow articleRow, oh4<? super String, g2b> oh4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        oh4<? super String, g2b> oh4Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        jt1.a.C0187a c0187a;
        int i4;
        final oh4<? super String, g2b> oh4Var3;
        boolean z;
        boolean z2;
        boolean z3;
        Object objF;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bj4 bj4Var;
        final ox6 ox6Var4;
        final oh4<? super String, g2b> oh4Var4;
        Object objF2;
        xj8 xj8VarW;
        articleRow.getClass();
        bj4 bj4VarO = jt1Var.o(1326302174);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= bj4VarO.J(articleRow) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                oh4Var2 = oh4Var;
                i3 |= bj4VarO.j(oh4Var2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i5 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                i4 = 0;
                if (i6 != 0) {
                    bj4VarO.K(1587295895);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b40(i4);
                        bj4VarO.C(objF2);
                    }
                    oh4Var3 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                ox6 ox6VarC2 = ir9.c(ox6Var3, 1.0f);
                bj4VarO.K(1587298991);
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | z;
                objF = bj4VarO.f();
                if (z3 || objF == c0187a) {
                    objF = new mh4() { // from class: c40
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ArticleRowComponentKt.ArticleRowComponent$lambda$3$lambda$2(oh4Var3, articleRow);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6VarK = eo7.k(eo7.m(we1.c(ox6VarC2, false, null, (mh4) objF, 15), 16.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 12.0f, 1);
                ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK);
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
                String title = articleRow.getTitle();
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i7 = IntercomTheme.$stable;
                mia.b(title, new qs5(true, 1.0f), gh5.a(intercomTheme, bj4VarO, i7), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i7).getType04Point5(), bj4VarO, 0, 0, 131064);
                bj4Var = bj4VarO;
                IntercomChevronKt.IntercomChevron(eo7.k(aVar, 22.0f, 0.0f, 2), bj4Var, 6, 0);
                bj4Var.U(true);
                ox6Var4 = ox6Var3;
                oh4Var4 = oh4Var3;
            } else {
                bj4VarO.u();
                ox6Var4 = ox6Var2;
                oh4Var4 = oh4Var2;
                bj4Var = bj4VarO;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: d40
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$5(ox6Var4, articleRow, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        oh4Var2 = oh4Var;
        if ((i3 & 147) == 146) {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            c0187a = jt1.a.a;
            i4 = 0;
            if (i6 != 0) {
                bj4VarO.K(1587295895);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new b40(i4);
                    bj4VarO.C(objF2);
                }
                oh4Var3 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            ox6 ox6VarC3 = ir9.c(ox6Var3, 1.0f);
            bj4VarO.K(1587298991);
            if ((i3 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | z;
            objF = bj4VarO.f();
            if (z3) {
                objF = new mh4() { // from class: c40
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$3$lambda$2(oh4Var3, articleRow);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: c40
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$3$lambda$2(oh4Var3, articleRow);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarK2 = eo7.k(eo7.m(we1.c(ox6VarC3, false, null, (mh4) objF, 15), 16.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 12.0f, 1);
            ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarK2);
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
            String title2 = articleRow.getTitle();
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i8 = IntercomTheme.$stable;
            mia.b(title2, new qs5(true, 1.0f), gh5.a(intercomTheme2, bj4VarO, i8), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(bj4VarO, i8).getType04Point5(), bj4VarO, 0, 0, 131064);
            bj4Var = bj4VarO;
            IntercomChevronKt.IntercomChevron(eo7.k(aVar, 22.0f, 0.0f, 2), bj4Var, 6, 0);
            bj4Var.U(true);
            ox6Var4 = ox6Var3;
            oh4Var4 = oh4Var3;
        } else {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            c0187a = jt1.a.a;
            i4 = 0;
            if (i6 != 0) {
                bj4VarO.K(1587295895);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new b40(i4);
                    bj4VarO.C(objF2);
                }
                oh4Var3 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            ox6 ox6VarC4 = ir9.c(ox6Var3, 1.0f);
            bj4VarO.K(1587298991);
            if ((i3 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | z;
            objF = bj4VarO.f();
            if (z3) {
                objF = new mh4() { // from class: c40
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$3$lambda$2(oh4Var3, articleRow);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: c40
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ArticleRowComponentKt.ArticleRowComponent$lambda$3$lambda$2(oh4Var3, articleRow);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarK3 = eo7.k(eo7.m(we1.c(ox6VarC4, false, null, (mh4) objF, 15), 16.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 12.0f, 1);
            ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarK3);
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
            String title3 = articleRow.getTitle();
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i9 = IntercomTheme.$stable;
            mia.b(title3, new qs5(true, 1.0f), gh5.a(intercomTheme3, bj4VarO, i9), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(bj4VarO, i9).getType04Point5(), bj4VarO, 0, 0, 131064);
            bj4Var = bj4VarO;
            IntercomChevronKt.IntercomChevron(eo7.k(aVar, 22.0f, 0.0f, 2), bj4Var, 6, 0);
            bj4Var.U(true);
            ox6Var4 = ox6Var3;
            oh4Var4 = oh4Var3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: d40
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ArticleRowComponentKt.ArticleRowComponent$lambda$5(ox6Var4, articleRow, oh4Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ArticleRowComponent$lambda$1$lambda$0(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ArticleRowComponent$lambda$3$lambda$2(oh4 oh4Var, CollectionDetailsRow.ArticleRow articleRow) {
        oh4Var.invoke(articleRow.getId());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ArticleRowComponent$lambda$5(ox6 ox6Var, CollectionDetailsRow.ArticleRow articleRow, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        ArticleRowComponent(ox6Var, articleRow, oh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ArticleRowComponentLongTextPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(2014154163);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleRowComponentKt.INSTANCE.m312getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new f40(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ArticleRowComponentLongTextPreview$lambda$7(int i, jt1 jt1Var, int i2) {
        ArticleRowComponentLongTextPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ArticleRowComponentPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(761606012);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleRowComponentKt.INSTANCE.m311getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new e40(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ArticleRowComponentPreview$lambda$6(int i, jt1 jt1Var, int i2) {
        ArticleRowComponentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
