package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r4 {
    public static final void a(final m76 m76Var, final oh4 oh4Var, final mh4 mh4Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1868327245);
        int i2 = (bj4VarO.j(m76Var) ? 4 : 2) | i | (bj4VarO.j(oh4Var) ? 32 : 16) | (bj4VarO.j(mh4Var) ? 256 : 128);
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            boolean zJ = ((i2 & 112) == 32) | bj4VarO.j(m76Var) | ((i2 & 896) == 256);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: n4
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v2, types: [l76, p4] */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        final oh4 oh4Var2 = oh4Var;
                        ?? r3 = new g76() { // from class: p4
                            @Override // defpackage.g76
                            public final void t(m76 m76Var2, s66.a aVar) {
                                oh4Var2.invoke(aVar);
                            }
                        };
                        m76 m76Var2 = m76Var;
                        m76Var2.getLifecycle().a(r3);
                        return new q4(mh4Var, m76Var2, r3);
                    }
                };
                bj4VarO.C(objF);
            }
            wd3.a(m76Var, (oh4) objF, bj4VarO);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(oh4Var, mh4Var, i) { // from class: o4
                public final /* synthetic */ oh4 u;
                public final /* synthetic */ mh4 v;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    r4.a(this.t, this.u, this.v, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final cb6 b(int i, jt1 jt1Var, int i2) {
        boolean z = (i2 & 4) != 0;
        Object systemService = ((Context) jt1Var.F(AndroidCompositionLocals_androidKt.b)).getSystemService("accessibility");
        systemService.getClass();
        final AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean z2 = ((((i & 896) ^ 384) > 256 && jt1Var.c(z)) || (i & 384) == 256) | ((((i & 14) ^ 6) > 4 && jt1Var.c(true)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && jt1Var.c(true)) || (i & 48) == 32);
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (z2 || objF == obj) {
            objF = new cb6(true, true, z);
            jt1Var.C(objF);
        }
        final cb6 cb6Var = (cb6) objF;
        m76 m76Var = (m76) jt1Var.F(kc6.a);
        boolean zJ = jt1Var.J(cb6Var) | jt1Var.j(accessibilityManager);
        Object objF2 = jt1Var.f();
        if (zJ || objF2 == obj) {
            objF2 = new oh4() { // from class: l4
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    if (((s66.a) obj2) == s66.a.ON_RESUME) {
                        cb6Var.f(accessibilityManager);
                    }
                    return g2b.a;
                }
            };
            jt1Var.C(objF2);
        }
        oh4 oh4Var = (oh4) objF2;
        boolean zJ2 = jt1Var.J(cb6Var) | jt1Var.j(accessibilityManager);
        Object objF3 = jt1Var.f();
        if (zJ2 || objF3 == obj) {
            objF3 = new mh4() { // from class: m4
                @Override // defpackage.mh4
                public final Object invoke() {
                    cb6Var.i(accessibilityManager);
                    return g2b.a;
                }
            };
            jt1Var.C(objF3);
        }
        a(m76Var, oh4Var, (mh4) objF3, jt1Var, 0);
        return cb6Var;
    }
}
