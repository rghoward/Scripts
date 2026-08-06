package defpackage;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kr3 {
    public static final void a(boolean z, oh4 oh4Var, ox6 ox6Var, fr1 fr1Var, jt1 jt1Var, final int i) {
        oh4 oh4Var2;
        fr1 fr1Var2;
        ox6 ox6Var2;
        int i2;
        boolean z2;
        final boolean z3 = z;
        bj4 bj4VarO = jt1Var.o(1597265892);
        int i3 = i | (bj4VarO.c(z3) ? 4 : 2) | (bj4VarO.J(ox6Var) ? 256 : 128);
        if (bj4VarO.A(i3 & 1, (i3 & 1171) != 1170)) {
            Configuration configuration = (Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a);
            View view = (View) bj4VarO.F(AndroidCompositionLocals_androidKt.f);
            boolean zJ = bj4VarO.J(configuration) | bj4VarO.J(view);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new hmb(view);
                bj4VarO.C(objF);
            }
            final hmb hmbVar = (hmb) objF;
            tx2 tx2Var = (tx2) bj4VarO.F(qu1.h);
            final int iN1 = tx2Var.n1(48.0f);
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = bl7.i(null);
                bj4VarO.C(objF2);
            }
            final h37 h37Var = (h37) objF2;
            Object objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = new bt7(0);
                bj4VarO.C(objF3);
            }
            final g27 g27Var = (g27) objF3;
            Object objF4 = bj4VarO.f();
            if (objF4 == c0187a) {
                objF4 = new bt7(0);
                bj4VarO.C(objF4);
            }
            final g27 g27Var2 = (g27) objF4;
            Object objF5 = bj4VarO.f();
            if (objF5 == c0187a) {
                objF5 = new p94();
                bj4VarO.C(objF5);
            }
            final p94 p94Var = (p94) objF5;
            xv9 xv9Var = (xv9) bj4VarO.F(qu1.q);
            String strB = ws3.b(bj4VarO, R.string.m3c_dropdown_menu_expanded);
            String strB2 = ws3.b(bj4VarO, R.string.m3c_dropdown_menu_collapsed);
            String strB3 = ws3.b(bj4VarO, R.string.m3c_dropdown_menu_toggle);
            Object objF6 = bj4VarO.f();
            if (objF6 == c0187a) {
                objF6 = bl7.i(new tq3());
                bj4VarO.C(objF6);
            }
            h37 h37Var2 = (h37) objF6;
            Object objF7 = bj4VarO.f();
            if (objF7 == c0187a) {
                objF7 = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF7);
            }
            h37 h37Var3 = (h37) objF7;
            int i4 = i3 & 14;
            boolean zJ2 = (i4 == 4) | bj4VarO.J(hmbVar) | bj4VarO.J(tx2Var);
            Object objF8 = bj4VarO.f();
            if (zJ2 || objF8 == c0187a) {
                i2 = i4;
                hr3 hr3Var = new hr3(p94Var, z, h37Var3, strB, strB2, strB3, xv9Var, h37Var2, oh4Var, g27Var, g27Var2);
                p94Var = p94Var;
                z3 = z;
                bj4VarO.C(hr3Var);
                objF8 = hr3Var;
            } else {
                z3 = z;
                i2 = i4;
            }
            hr3 hr3Var2 = (hr3) objF8;
            boolean zJ3 = bj4VarO.j(hmbVar) | bj4VarO.h(iN1);
            Object objF9 = bj4VarO.f();
            if (zJ3 || objF9 == c0187a) {
                objF9 = new oh4() { // from class: zq3
                    /* JADX WARN: Code duplicated, block: B:15:0x006a  */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        int iB;
                        qq5 qq5Var = (qq5) obj;
                        h37 h37Var4 = h37Var;
                        h37Var4.setValue(qq5Var);
                        g27Var.j((int) (qq5Var.a() >> 32));
                        View view2 = hmbVar.a;
                        Rect rect = new Rect();
                        view2.getWindowVisibleDisplayFrame(rect);
                        int i5 = rect.top;
                        int i6 = rect.bottom;
                        qq5 qq5Var2 = (qq5) h37Var4.getValue();
                        sk8 sk8VarA = (qq5Var2 == null || !qq5Var2.e()) ? sk8.e : tk8.a(qq5Var2.q(0L), c43.c(qq5Var2.a()));
                        int i7 = iN1;
                        int i8 = i5 + i7;
                        int i9 = i6 - i7;
                        float f = sk8VarA.b;
                        if (f <= i6) {
                            float f2 = sk8VarA.d;
                            if (f2 < i5) {
                                iB = i9 - i8;
                            } else {
                                iB = wk6.b(Math.max(f - i8, i9 - f2));
                            }
                        } else {
                            iB = i9 - i8;
                        }
                        g27Var2.j(Math.max(iB, 0));
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF9);
            }
            ox6Var2 = ox6Var;
            ox6 ox6VarB = oh7.b(ox6Var2, (oh4) objF9);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarB);
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
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            fr1Var2 = fr1Var;
            fr1Var2.invoke(hr3Var2, bj4VarO, 48);
            bj4VarO.U(true);
            if (z3) {
                bj4VarO.K(209894723);
                boolean zJ4 = bj4VarO.j(hmbVar) | bj4VarO.h(iN1);
                Object objF10 = bj4VarO.f();
                if (zJ4 || objF10 == c0187a) {
                    objF10 = new mh4() { // from class: ar3
                        /* JADX WARN: Code duplicated, block: B:15:0x0058  */
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            int iB;
                            View view2 = hmbVar.a;
                            Rect rect = new Rect();
                            view2.getWindowVisibleDisplayFrame(rect);
                            int i5 = rect.top;
                            int i6 = rect.bottom;
                            qq5 qq5Var = (qq5) h37Var.getValue();
                            sk8 sk8VarA = (qq5Var == null || !qq5Var.e()) ? sk8.e : tk8.a(qq5Var.q(0L), c43.c(qq5Var.a()));
                            int i7 = iN1;
                            int i8 = i5 + i7;
                            int i9 = i6 - i7;
                            float f = sk8VarA.b;
                            if (f <= i6) {
                                float f2 = sk8VarA.d;
                                if (f2 < i5) {
                                    iB = i9 - i8;
                                } else {
                                    iB = wk6.b(Math.max(f - i8, i9 - f2));
                                }
                            } else {
                                iB = i9 - i8;
                            }
                            g27Var2.j(Math.max(iB, 0));
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF10);
                }
                z2 = false;
                pr3.a((mh4) objF10, bj4VarO, 0);
                bj4VarO.U(false);
            } else {
                z2 = false;
                bj4VarO.K(210228190);
                bj4VarO.U(false);
            }
            int i5 = i2;
            boolean z4 = i5 == 4 ? true : z2;
            Object objF11 = bj4VarO.f();
            if (z4 || objF11 == c0187a) {
                objF11 = new mh4() { // from class: br3
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        if (z3) {
                            p94.a(p94Var);
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF11);
            }
            c33 c33Var = wd3.a;
            bj4VarO.w((mh4) objF11);
            Object objF12 = bj4VarO.f();
            if (objF12 == c0187a) {
                oh4Var2 = oh4Var;
                objF12 = new q62(1, oh4Var2);
                bj4VarO.C(objF12);
            } else {
                oh4Var2 = oh4Var;
            }
            th0.b(z3, (mh4) objF12, bj4VarO, i5);
        } else {
            oh4Var2 = oh4Var;
            fr1Var2 = fr1Var;
            ox6Var2 = ox6Var;
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final ox6 ox6Var3 = ox6Var2;
            final fr1 fr1Var3 = fr1Var2;
            final oh4 oh4Var3 = oh4Var2;
            xj8VarW.d = new ci4(z3, oh4Var3, ox6Var3, fr1Var3, i) { // from class: cr3
                public final /* synthetic */ boolean t;
                public final /* synthetic */ oh4 u;
                public final /* synthetic */ ox6 v;
                public final /* synthetic */ fr1 w;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(3121);
                    kr3.a(this.t, this.u, this.v, this.w, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
