package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dv0 {
    public static final c37<di, fl6> a = c(true);
    public static final c37<di, fl6> b = c(false);
    public static final a c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements fl6 {
        public static final a a = new a();

        @Override // defpackage.fl6
        public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
            return hl6Var.y0(xx1.j(j), xx1.i(j), if3.t, new cv0(0));
        }
    }

    static {
        new hv0(di.a.a, false);
        c = a.a;
    }

    public static final void a(final ox6 ox6Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-211209833);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(bj4VarO.T);
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
            kw7 kw7VarP = bj4VarO.P();
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
            rd7.d(bj4VarO, bt1.a.f, c);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: bv0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    dv0.a(ox6Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(jz7.a aVar, jz7 jz7Var, cl6 cl6Var, tq5 tq5Var, int i, int i2, di diVar) {
        sp0 sp0Var;
        Object objG = cl6Var.g();
        av0 av0Var = objG instanceof av0 ? (av0) objG : null;
        jz7.a.q(aVar, jz7Var, ((av0Var == null || (sp0Var = av0Var.H) == null) ? diVar : sp0Var).a((((long) jz7Var.t) << 32) | (((long) jz7Var.u) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), tq5Var));
    }

    public static final c37<di, fl6> c(boolean z) {
        c37<di, fl6> c37Var = new c37<>(9);
        sp0 sp0Var = di.a.a;
        c37Var.m(sp0Var, new hv0(sp0Var, z));
        sp0 sp0Var2 = di.a.b;
        c37Var.m(sp0Var2, new hv0(sp0Var2, z));
        sp0 sp0Var3 = di.a.c;
        c37Var.m(sp0Var3, new hv0(sp0Var3, z));
        sp0 sp0Var4 = di.a.d;
        c37Var.m(sp0Var4, new hv0(sp0Var4, z));
        sp0 sp0Var5 = di.a.e;
        c37Var.m(sp0Var5, new hv0(sp0Var5, z));
        sp0 sp0Var6 = di.a.f;
        c37Var.m(sp0Var6, new hv0(sp0Var6, z));
        sp0 sp0Var7 = di.a.g;
        c37Var.m(sp0Var7, new hv0(sp0Var7, z));
        sp0 sp0Var8 = di.a.h;
        c37Var.m(sp0Var8, new hv0(sp0Var8, z));
        sp0 sp0Var9 = di.a.i;
        c37Var.m(sp0Var9, new hv0(sp0Var9, z));
        return c37Var;
    }

    public static final fl6 d(di diVar, boolean z) {
        fl6 fl6VarD = (z ? a : b).d(diVar);
        return fl6VarD == null ? new hv0(diVar, z) : fl6VarD;
    }
}
