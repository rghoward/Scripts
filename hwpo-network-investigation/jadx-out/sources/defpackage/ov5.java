package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ov5 extends ox6.c implements lr5, op0, lp0 {
    public static final a K = new a();
    public pv5 H;
    public kv5 I;
    public fl7 J;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lp0.a {
        @Override // lp0.a
        public final boolean a() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements lp0.a {
        public final /* synthetic */ gl8<kv5.a> b;
        public final /* synthetic */ int c;

        public b(gl8<kv5.a> gl8Var, int i) {
            this.b = gl8Var;
            this.c = i;
        }

        @Override // lp0.a
        public final boolean a() {
            return ov5.this.c2(this.b.t, this.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object, kv5$a] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.Object, kv5$a] */
    @Override // defpackage.lp0
    public final Object K0(oh4 oh4Var, int i) {
        if (this.H.b() <= 0 || !this.H.e() || !this.G) {
            return oh4Var.invoke(K);
        }
        boolean zD2 = d2(i);
        pv5 pv5Var = this.H;
        int iC = zD2 ? pv5Var.c() : pv5Var.f();
        gl8 gl8Var = new gl8();
        kv5 kv5Var = this.I;
        kv5Var.getClass();
        ?? aVar = new kv5.a(iC, iC);
        kv5Var.a.d(aVar);
        gl8Var.t = aVar;
        int iD = this.H.d() * 2;
        int iB = this.H.b();
        if (iD > iB) {
            iD = iB;
        }
        Object objInvoke = null;
        int i2 = 0;
        while (objInvoke == null && c2((kv5.a) gl8Var.t, i) && i2 < iD) {
            kv5.a aVar2 = (kv5.a) gl8Var.t;
            int i3 = aVar2.a;
            int i4 = aVar2.b;
            if (d2(i)) {
                i4++;
            } else {
                i3--;
            }
            kv5 kv5Var2 = this.I;
            kv5Var2.getClass();
            ?? aVar3 = new kv5.a(i3, i4);
            kv5Var2.a.d(aVar3);
            this.I.a.n((kv5.a) gl8Var.t);
            gl8Var.t = aVar3;
            i2++;
            ew2.f(this).i();
            objInvoke = oh4Var.invoke(new b(gl8Var, i));
        }
        this.I.a.n((kv5.a) gl8Var.t);
        ew2.f(this).i();
        return objInvoke;
    }

    public final boolean c2(kv5.a aVar, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.J != fl7.t) {
                }
            } else if (i != 1 && i != 2) {
                aa0.c("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (d2(i) ? aVar.a > 0 : aVar.b < this.H.b() - 1) {
                return true;
            }
        } else if (this.J != fl7.u) {
            if (d2(i)) {
            }
        }
        return false;
    }

    public final boolean d2(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = ew2.f(this).S.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            u.b();
            return false;
        }
        if (i != 4) {
            aa0.c("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = ew2.f(this).S.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        u.b();
        return false;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        jz7 jz7VarE = cl6Var.E(j);
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new nv5(0, jz7VarE));
    }

    @Override // defpackage.op0
    public final ov5 a1() {
        return this;
    }
}
