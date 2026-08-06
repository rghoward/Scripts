package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l09 implements f09 {
    public static final au3 x = new au3(new h09(), new fp6(1));
    public final Map<Object, Map<String, List<Object>>> t;
    public final c37<Object, m09> u;
    public m09 v;
    public final g09 w;

    public l09(Map<Object, Map<String, List<Object>>> map) {
        this.t = map;
        this.u = z39.b();
        this.w = new g09(this);
    }

    @Override // defpackage.f09
    public final void e(final Object obj, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(533563200);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(this) ? 256 : 128;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            bj4VarO.m(obj);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                g09 g09Var = this.w;
                if (!((Boolean) g09Var.invoke(obj)).booleanValue()) {
                    ca0.c(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map<String, List<Object>> map = this.t.get(obj);
                y0a y0aVar = o09.a;
                p09 p09Var = new p09(new n09(map, g09Var));
                bj4VarO.C(p09Var);
                objF = p09Var;
            }
            final p09 p09Var2 = (p09) objF;
            nu1.b(new kf8[]{o09.a.a(p09Var2), uc6.a.a(p09Var2)}, fr1Var, bj4VarO, (i2 & 112) | 8);
            g2b g2bVar = g2b.a;
            boolean zJ = bj4VarO.j(this) | bj4VarO.j(obj) | bj4VarO.j(p09Var2);
            Object objF2 = bj4VarO.f();
            if (zJ || objF2 == c0187a) {
                objF2 = new oh4() { // from class: i09
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        l09 l09Var = this.t;
                        c37<Object, m09> c37Var = l09Var.u;
                        Object obj3 = obj;
                        if (c37Var.a(obj3)) {
                            ca0.c(obj3, " was used multiple times ", "Key ");
                            return null;
                        }
                        l09Var.t.remove(obj3);
                        p09 p09Var3 = p09Var2;
                        c37Var.m(obj3, p09Var3);
                        return new k09(l09Var, obj3, p09Var3);
                    }
                };
                bj4VarO.C(objF2);
            }
            wd3.a(g2bVar, (oh4) objF2, bj4VarO);
            bj4VarO.d();
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: j09
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iS = gz3.s(i | 1);
                    this.t.e(obj, fr1Var, (jt1) obj2, iS);
                    return g2b.a;
                }
            };
        }
    }

    @Override // defpackage.f09
    public final void f(Object obj) {
        if (this.u.k(obj) == null) {
            this.t.remove(obj);
        }
    }

    public l09() {
        this(0);
    }

    public /* synthetic */ l09(int i) {
        this(new LinkedHashMap());
    }
}
