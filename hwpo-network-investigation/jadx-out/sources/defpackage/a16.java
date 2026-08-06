package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a16 implements x06 {
    public final c26 a;
    public final v06 b;
    public final u87 c;

    public a16(c26 c26Var, v06 v06Var, u87 u87Var) {
        this.a = c26Var;
        this.b = v06Var;
        this.c = u87Var;
    }

    @Override // defpackage.x06
    public final kw5 a() {
        return this.c;
    }

    @Override // defpackage.hw5
    public final int b() {
        return this.b.g().b;
    }

    @Override // defpackage.hw5
    public final int d(Object obj) {
        return this.c.d(obj);
    }

    @Override // defpackage.hw5
    public final void e(final int i, Object obj, jt1 jt1Var, final int i2) {
        final int i3;
        final Object obj2;
        bj4 bj4VarO = jt1Var.o(89098518);
        int i4 = (bj4VarO.h(i) ? 4 : 2) | i2 | (bj4VarO.j(obj) ? 32 : 16) | (bj4VarO.J(this) ? 256 : 128);
        if (bj4VarO.A(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            u7d.g(obj2, i3, this.a.s, gr1.b(608834466, new ci4() { // from class: y06
                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    jt1 jt1Var2 = (jt1) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        j27<u06> j27Var = this.t.b.a;
                        int i5 = i;
                        lj5<u06> lj5VarB = j27Var.b(i5);
                        ((u06) lj5VarB.c).b.invoke(e16.a, Integer.valueOf(i5 - lj5VarB.a), jt1Var2, 6);
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
            xj8VarW.d = new ci4(i3, obj2, i2) { // from class: z06
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
        if (!(obj instanceof a16)) {
            return false;
        }
        return xj5.a(this.b, ((a16) obj).b);
    }

    @Override // defpackage.hw5
    public final Object f(int i) {
        Object objA = this.c.a(i);
        return objA == null ? this.b.h(i) : objA;
    }

    @Override // defpackage.hw5
    public final Object g(int i) {
        return this.b.f(i);
    }

    @Override // defpackage.x06
    public final y16 h() {
        return this.b.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
