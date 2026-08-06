package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r69 extends ox6.c implements lr5, qb9 {
    public x69 H;
    public boolean I;

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        ec9.h(hc9Var);
        int i = 2;
        c69 c69Var = new c69(new w22(i, this), new x22(i, this));
        if (this.I) {
            gc9<c69> gc9Var = ac9.w;
            ho5<Object> ho5Var = ec9.a[13];
            hc9Var.d(gc9Var, c69Var);
        } else {
            gc9<c69> gc9Var2 = ac9.v;
            ho5<Object> ho5Var2 = ec9.a[12];
            hc9Var.d(gc9Var2, c69Var);
        }
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        hnb.a(j, this.I ? fl7.t : fl7.u);
        jz7 jz7VarE = cl6Var.E(xx1.a(0, this.I ? xx1.h(j) : Integer.MAX_VALUE, 0, this.I ? Integer.MAX_VALUE : xx1.g(j), 5, j));
        int i = jz7VarE.t;
        int iH = xx1.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = jz7VarE.u;
        int iG = xx1.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = jz7VarE.u - i2;
        int i4 = jz7VarE.t - i;
        if (!this.I) {
            i3 = i4;
        }
        x69 x69Var = this.H;
        bt7 bt7Var = x69Var.e;
        bt7 bt7Var2 = x69Var.a;
        bt7Var.j(i3);
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            if (bt7Var2.k() > i3) {
                bt7Var2.j(i3);
            }
            g2b g2bVar = g2b.a;
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            this.H.b.j(this.I ? i2 : i);
            this.H.c.j(this.I ? jz7VarE.u : jz7VarE.t);
            return hl6Var.y0(i, i2, if3.t, new v22(i3, 1, this, jz7VarE));
        } catch (Throwable th) {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            throw th;
        }
    }

    @Override // defpackage.lr5
    public final int f(df6 df6Var, pj5 pj5Var, int i) {
        if (!this.I) {
            i = Integer.MAX_VALUE;
        }
        return pj5Var.o(i);
    }

    @Override // defpackage.lr5
    public final int j(df6 df6Var, pj5 pj5Var, int i) {
        if (!this.I) {
            i = Integer.MAX_VALUE;
        }
        return pj5Var.c0(i);
    }

    @Override // defpackage.lr5
    public final int v(df6 df6Var, pj5 pj5Var, int i) {
        if (this.I) {
            i = Integer.MAX_VALUE;
        }
        return pj5Var.A(i);
    }

    @Override // defpackage.lr5
    public final int x(df6 df6Var, pj5 pj5Var, int i) {
        if (this.I) {
            i = Integer.MAX_VALUE;
        }
        return pj5Var.C(i);
    }
}
