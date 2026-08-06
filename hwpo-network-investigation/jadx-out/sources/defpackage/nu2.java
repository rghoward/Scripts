package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nu2 {
    public static final m68 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ei4<uh1, jt1, Integer, g2b> {
        public final /* synthetic */ sca t;

        public a(sca scaVar) {
            this.t = scaVar;
        }

        @Override // defpackage.ei4
        public final g2b invoke(uh1 uh1Var, jt1 jt1Var, Integer num) {
            long j = uh1Var.a;
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= jt1Var2.i(j) ? 4 : 2;
            }
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 19) != 18)) {
                nu2.b(this.t.c, j, jt1Var2, (iIntValue << 3) & 112);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements mh4<fca> {
        @Override // defpackage.mh4
        public final fca invoke() {
            return ((gca) this.receiver).G0();
        }
    }

    static {
        a = new m68((30 & 1) == 0, s89.t, true, 0);
    }

    public static final void a(final ada adaVar, final fca fcaVar, jt1 jt1Var, final int i) {
        final Context context;
        bj4 bj4VarO = jt1Var.o(1904307118);
        int i2 = (bj4VarO.J(adaVar) ? 4 : 2) | i | (bj4VarO.j(fcaVar) ? 32 : 16);
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                bj4VarO.K(-1009482584);
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-1009433480);
                bj4VarO.U(false);
                context = null;
            }
            boolean zJ = bj4VarO.j(fcaVar) | ((i2 & 14) == 4) | bj4VarO.j(context);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: hu2
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        e02 e02Var = (e02) obj;
                        List<dca> list = fcaVar.a;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            dca dcaVar = list.get(i3);
                            if (dcaVar instanceof sca) {
                                final sca scaVar = (sca) dcaVar;
                                ci4 ci4Var = new ci4() { // from class: ju2
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj2, Object obj3) {
                                        jt1 jt1Var2 = (jt1) obj2;
                                        ((Integer) obj3).getClass();
                                        jt1Var2.K(666084174);
                                        String str = scaVar.b;
                                        jt1Var2.B();
                                        return str;
                                    }
                                };
                                fr1 fr1Var = scaVar.c == 0 ? null : new fr1(true, -1930700965, new nu2.a(scaVar));
                                final ada adaVar2 = adaVar;
                                e02.b(e02Var, ci4Var, fr1Var, new mh4() { // from class: ku2
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        scaVar.d.invoke(adaVar2);
                                        return g2b.a;
                                    }
                                }, 6);
                            } else if (dcaVar instanceof bda) {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    rca.f(e02Var, context, (bda) dcaVar);
                                }
                            } else if (dcaVar instanceof zca) {
                                e02Var.a.add(qr1.b);
                            }
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            }
            m02.b(null, null, (oh4) objF, bj4VarO, 0, 3);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(fcaVar, i) { // from class: iu2
                public final /* synthetic */ fca u;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    nu2.a(this.t, this.u, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final int i, final long j, jt1 jt1Var, final int i2) {
        int i3;
        xj8 xj8VarW;
        ci4<? super jt1, ? super Integer, g2b> ci4Var;
        bj4 bj4VarO = jt1Var.o(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.h(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.i(j) ? 32 : 16;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            boolean zJ = ((i3 & 14) == 4) | bj4VarO.J(context);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                bj4VarO.C(objF);
            }
            int iIntValue = ((Number) objF).intValue();
            if (iIntValue == -1) {
                xj8VarW = bj4VarO.W();
                if (xj8VarW == null) {
                    return;
                } else {
                    ci4Var = new ci4() { // from class: lu2
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iS = gz3.s(i2 | 1);
                            nu2.b(i, j, (jt1) obj, iS);
                            return g2b.a;
                        }
                    };
                }
            } else {
                es7 es7VarA = is7.a(iIntValue, bj4VarO, 0);
                boolean z = (i3 & 112) == 32;
                Object objF2 = bj4VarO.f();
                if (z || objF2 == c0187a) {
                    objF2 = j == 16 ? null : new wq0(5, j);
                    bj4VarO.C(objF2);
                }
                dv0.a(gs7.a(ir9.j(ox6.a.t, f02.e), es7VarA, null, nz1.a.b, 0.0f, (wh1) objF2, 22), bj4VarO, 0);
            }
            xj8VarW.d = ci4Var;
        }
        bj4VarO.u();
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            ci4Var = new ci4() { // from class: mu2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i2 | 1);
                    nu2.b(i, j, (jt1) obj, iS);
                    return g2b.a;
                }
            };
            xj8VarW.d = ci4Var;
        }
    }

    public static final void c(final ada adaVar, final gca gcaVar, final mh4<? extends qq5> mh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bj4VarO.J(adaVar) : bj4VarO.j(adaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bj4VarO.J(gcaVar) : bj4VarO.j(gcaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        boolean z = true;
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && bj4VarO.J(gcaVar));
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z2 || objF == c0187a) {
                objF = new dh6(new t2c(new mh4() { // from class: cu2
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return new bg5(cg5.c(gcaVar.z((qq5) mh4Var.invoke())));
                    }
                }));
                bj4VarO.C(objF);
            }
            dh6 dh6Var = (dh6) objF;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !bj4VarO.j(adaVar))) {
                z = false;
            }
            Object objF2 = bj4VarO.f();
            if (z || objF2 == c0187a) {
                objF2 = new eu2(0, adaVar);
                bj4VarO.C(objF2);
            }
            fq.a(dh6Var, (mh4) objF2, a, gr1.b(1315155414, new ci4() { // from class: fu2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    jt1 jt1Var2 = (jt1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        gca gcaVar2 = gcaVar;
                        boolean zJ = jt1Var2.J(gcaVar2);
                        Object objF3 = jt1Var2.f();
                        if (zJ || objF3 == jt1.a.a) {
                            objF3 = bl7.f(new nu2.b(0, gcaVar2, gca.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0));
                            jt1Var2.C(objF3);
                        }
                        nu2.a(adaVar, (fca) ((yz9) objF3).getValue(), jt1Var2, 0);
                    } else {
                        jt1Var2.u();
                    }
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3456, 0);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gu2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i | 1);
                    nu2.c(adaVar, gcaVar, mh4Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void d(final ox6 ox6Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(1392105195);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            wl0.a(ox6Var, yca.a, fr1Var, bj4VarO, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: du2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    nu2.d(ox6Var, fr1Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
