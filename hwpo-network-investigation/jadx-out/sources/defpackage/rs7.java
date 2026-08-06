package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rs7 {
    public String a;
    public wja b;
    public qa4.a c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public tx2 i;
    public qp j;
    public boolean k;
    public gv6 m;
    public ps7 n;
    public tq5 o;
    public long s;
    public long h = yc5.a;
    public long l = 0;
    public long p = zx1.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public rs7(String str, wja wjaVar, qa4.a aVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = wjaVar;
        this.c = aVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long g(rs7 rs7Var, long j, tq5 tq5Var) {
        wja wjaVar = rs7Var.b;
        gv6 gv6Var = rs7Var.m;
        tx2 tx2Var = rs7Var.i;
        tx2Var.getClass();
        gv6 gv6VarA = gv6.a.a(gv6Var, tq5Var, wjaVar, tx2Var, rs7Var.c);
        rs7Var.m = gv6VarA;
        return gv6VarA.a(rs7Var.g, j);
    }

    public final int a(int i, tq5 tq5Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = zx1.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = g(this, jA, tq5Var);
        }
        ps7 ps7VarE = e(tq5Var);
        long jA2 = ps5.a(jA, this.e, this.d, ps7VarE.c());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iA = ida.a(new qp((tp) ps7VarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jA2).c());
        int i6 = xx1.i(jA);
        if (iA < i6) {
            iA = i6;
        }
        this.q = i;
        this.r = iA;
        return iA;
    }

    public final boolean b(long j, tq5 tq5Var) {
        ps7 ps7Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jG = this.g > 1 ? g(this, j, tq5Var) : j;
        qp qpVar = this.j;
        boolean z2 = false;
        if (qpVar != null && (ps7Var = this.n) != null && !ps7Var.a() && tq5Var == this.o && (xx1.b(jG, this.p) || (xx1.h(jG) == xx1.h(this.p) && xx1.j(jG) == xx1.j(this.p) && xx1.g(jG) >= qpVar.c() && !qpVar.d.d))) {
            if (!xx1.b(jG, this.p)) {
                qp qpVar2 = this.j;
                qpVar2.getClass();
                long jD = zx1.d(jG, (((long) ida.a(Math.min(qpVar2.a.i.c(), qpVar2.f()))) << 32) | (((long) ida.a(qpVar2.c())) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= qpVar2.f() && ((int) (4294967295L & jD)) >= qpVar2.c())) {
                    z = false;
                }
                this.k = z;
                this.p = jG;
            }
            return false;
        }
        ps7 ps7VarE = e(tq5Var);
        long jA = ps5.a(jG, this.e, this.d, ps7VarE.c());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        qp qpVar3 = new qp((tp) ps7VarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jA);
        this.p = jG;
        long jD2 = zx1.d(jG, (((long) ida.a(qpVar3.c())) & 4294967295L) | (((long) ida.a(qpVar3.f())) << 32));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < qpVar3.f() || ((int) (jD2 & 4294967295L)) < qpVar3.c())) {
            z2 = true;
        }
        this.k = z2;
        this.j = qpVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = zx1.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(tx2 tx2Var) {
        long jA;
        tx2 tx2Var2 = this.i;
        if (tx2Var != null) {
            int i = yc5.b;
            jA = yc5.a(tx2Var.getDensity(), tx2Var.N0());
        } else {
            jA = yc5.a;
        }
        if (tx2Var2 == null) {
            this.i = tx2Var;
            this.h = jA;
        } else if (tx2Var == null || this.h != jA) {
            this.i = tx2Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final ps7 e(tq5 tq5Var) {
        ps7 tpVar = this.n;
        if (tpVar == null || tq5Var != this.o || tpVar.a()) {
            this.o = tq5Var;
            String str = this.a;
            wja wjaVarD = zu1.d(this.b, tq5Var);
            tx2 tx2Var = this.i;
            tx2Var.getClass();
            qa4.a aVar = this.c;
            hf3 hf3Var = hf3.t;
            tpVar = new tp(str, wjaVarD, hf3Var, hf3Var, aVar, tx2Var);
        }
        this.n = tpVar;
        return tpVar;
    }

    public final void f(String str, wja wjaVar, qa4.a aVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = wjaVar;
        this.c = aVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.s = (this.s << 2) | 2;
        c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) yc5.b(this.h));
        sb.append(", history=");
        return jp2.a(this.s, ", constraints=$)", sb);
    }
}
