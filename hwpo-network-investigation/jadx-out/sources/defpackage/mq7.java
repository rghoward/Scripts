package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mq7 implements hw5 {
    public final dr7 a;
    public final rv5<xp7> b;
    public final u87 c;

    public mq7(dr7 dr7Var, jq7 jq7Var, u87 u87Var) {
        this.a = dr7Var;
        this.b = jq7Var;
        this.c = u87Var;
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
        bj4 bj4VarO = jt1Var.o(-1201380429);
        int i4 = (bj4VarO.h(i) ? 4 : 2) | i2 | (bj4VarO.j(obj) ? 32 : 16) | (bj4VarO.J(this) ? 256 : 128);
        if (bj4VarO.A(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            u7d.g(obj2, i3, this.a.y, gr1.b(1142237095, new ci4() { // from class: kq7
                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    jt1 jt1Var2 = (jt1) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        j27 j27VarG = this.t.b.g();
                        int i5 = i;
                        lj5 lj5VarB = j27VarG.b(i5);
                        ((xp7) lj5VarB.c).b.invoke(rq7.a, Integer.valueOf(i5 - lj5VarB.a), jt1Var2, 0);
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
            xj8VarW.d = new ci4(i3, obj2, i2) { // from class: lq7
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
        if (!(obj instanceof mq7)) {
            return false;
        }
        return xj5.a(this.b, ((mq7) obj).b);
    }

    @Override // defpackage.hw5
    public final Object f(int i) {
        Object objA = this.c.a(i);
        return objA == null ? this.b.h(i) : objA;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
