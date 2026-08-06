package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ly5 implements iy5 {
    public final nz5 a;
    public final gy5 b;
    public final gv5 c;
    public final u87 d;

    public ly5(nz5 nz5Var, gy5 gy5Var, gv5 gv5Var, u87 u87Var) {
        this.a = nz5Var;
        this.b = gy5Var;
        this.c = gv5Var;
        this.d = u87Var;
    }

    @Override // defpackage.iy5
    public final kw5 a() {
        return this.d;
    }

    @Override // defpackage.hw5
    public final int b() {
        return this.b.g().b;
    }

    @Override // defpackage.iy5
    public final d27 c() {
        this.b.getClass();
        return vf5.a;
    }

    @Override // defpackage.hw5
    public final int d(Object obj) {
        return this.d.d(obj);
    }

    @Override // defpackage.hw5
    public final void e(final int i, Object obj, jt1 jt1Var, final int i2) {
        final int i3;
        final Object obj2;
        bj4 bj4VarO = jt1Var.o(-462424778);
        int i4 = (bj4VarO.h(i) ? 4 : 2) | i2 | (bj4VarO.j(obj) ? 32 : 16) | (bj4VarO.J(this) ? 256 : 128);
        if (bj4VarO.A(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            u7d.g(obj2, i3, this.a.s, gr1.b(-824725566, new ci4() { // from class: jy5
                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    jt1 jt1Var2 = (jt1) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ly5 ly5Var = this.t;
                        j27<dy5> j27Var = ly5Var.b.a;
                        int i5 = i;
                        lj5<dy5> lj5VarB = j27Var.b(i5);
                        ((dy5) lj5VarB.c).c.invoke(ly5Var.c, Integer.valueOf(i5 - lj5VarB.a), jt1Var2, 0);
                    } else {
                        jt1Var2.u();
                    }
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i3, obj2, i2) { // from class: ky5
                public final /* synthetic */ int u;
                public final /* synthetic */ Object v;

                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iS = gz3.s(1);
                    this.t.e(this.u, this.v, (jt1) obj3, iS);
                    return g2b.a;
                }
            };
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly5)) {
            return false;
        }
        return xj5.a(this.b, ((ly5) obj).b);
    }

    @Override // defpackage.hw5
    public final Object f(int i) {
        Object objA = this.d.a(i);
        return objA == null ? this.b.h(i) : objA;
    }

    @Override // defpackage.hw5
    public final Object g(int i) {
        return this.b.f(i);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.iy5
    public final gv5 i() {
        return this.c;
    }
}
