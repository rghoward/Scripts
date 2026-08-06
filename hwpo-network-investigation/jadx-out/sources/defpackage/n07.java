package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n07 {
    public iw a;
    public qa4.a b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List<iw.c<mz7>> g;
    public gv6 h;
    public tx2 j;
    public wja k;
    public m07 l;
    public tq5 m;
    public ria n;
    public long q;
    public long i = yc5.a;
    public int o = -1;
    public int p = -1;

    public n07(iw iwVar, wja wjaVar, qa4.a aVar, int i, boolean z, int i2, int i3, List list) {
        this.a = iwVar;
        this.b = aVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = wjaVar;
    }

    public final int a(int i, tq5 tq5Var) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = zx1.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            gv6 gv6Var = this.h;
            wja wjaVar = this.k;
            tx2 tx2Var = this.j;
            tx2Var.getClass();
            gv6 gv6VarA = gv6.a.a(gv6Var, tq5Var, wjaVar, tx2Var, this.b);
            this.h = gv6VarA;
            jA = gv6VarA.a(this.f, jA);
        }
        int iA = ida.a(b(jA, tq5Var).e);
        int i4 = xx1.i(jA);
        if (iA < i4) {
            iA = i4;
        }
        this.o = i;
        this.p = iA;
        return iA;
    }

    public final l07 b(long j, tq5 tq5Var) {
        m07 m07VarE = e(tq5Var);
        long jA = ps5.a(j, this.d, this.c, m07VarE.c());
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new l07(m07VarE, jA, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, tq5 tq5Var) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            gv6 gv6Var = this.h;
            wja wjaVar = this.k;
            tx2 tx2Var = this.j;
            tx2Var.getClass();
            gv6 gv6VarA = gv6.a.a(gv6Var, tq5Var, wjaVar, tx2Var, this.b);
            this.h = gv6VarA;
            j = gv6VarA.a(this.f, j);
        }
        ria riaVar = this.n;
        if (riaVar != null) {
            l07 l07Var = riaVar.b;
            qia qiaVar = riaVar.a;
            if (!l07Var.a.a()) {
                tq5 tq5Var2 = qiaVar.h;
                long j2 = qiaVar.j;
                if (tq5Var == tq5Var2 && (xx1.b(j, j2) || (xx1.h(j) == xx1.h(j2) && xx1.j(j) == xx1.j(j2) && xx1.g(j) >= l07Var.e && !l07Var.c))) {
                    ria riaVar2 = this.n;
                    riaVar2.getClass();
                    if (xx1.b(j, riaVar2.a.j)) {
                        return false;
                    }
                    ria riaVar3 = this.n;
                    riaVar3.getClass();
                    this.n = f(tq5Var, j, riaVar3.b);
                    return true;
                }
            }
        }
        this.n = f(tq5Var, j, b(j, tq5Var));
        return true;
    }

    public final void d(tx2 tx2Var) {
        long jA;
        tx2 tx2Var2 = this.j;
        if (tx2Var != null) {
            int i = yc5.b;
            jA = yc5.a(tx2Var.getDensity(), tx2Var.N0());
        } else {
            jA = yc5.a;
        }
        if (tx2Var2 == null) {
            this.j = tx2Var;
            this.i = jA;
        } else if (tx2Var == null || this.i != jA) {
            this.j = tx2Var;
            this.i = jA;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final m07 e(tq5 tq5Var) {
        m07 m07Var = this.l;
        if (m07Var == null || tq5Var != this.m || m07Var.a()) {
            this.m = tq5Var;
            iw iwVar = this.a;
            wja wjaVarD = zu1.d(this.k, tq5Var);
            tx2 tx2Var = this.j;
            tx2Var.getClass();
            qa4.a aVar = this.b;
            List list = this.g;
            if (list == null) {
                list = hf3.t;
            }
            m07Var = new m07(iwVar, wjaVarD, list, tx2Var, aVar);
        }
        this.l = m07Var;
        return m07Var;
    }

    public final ria f(tq5 tq5Var, long j, l07 l07Var) {
        float fMin = Math.min(l07Var.a.c(), l07Var.d);
        iw iwVar = this.a;
        wja wjaVar = this.k;
        List list = this.g;
        if (list == null) {
            list = hf3.t;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        tx2 tx2Var = this.j;
        tx2Var.getClass();
        return new ria(new qia(iwVar, wjaVar, list, i, z, i2, tx2Var, tq5Var, this.b, j), l07Var, zx1.d(j, (((long) ida.a(fMin)) << 32) | (((long) ida.a(l07Var.e)) & 4294967295L)));
    }

    public final void g(iw iwVar, wja wjaVar, qa4.a aVar, int i, boolean z, int i2, int i3, List list) {
        this.a = iwVar;
        boolean zC = wjaVar.c(this.k);
        this.k = wjaVar;
        if (!zC) {
            this.q <<= 2;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
        this.b = aVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.q = (this.q << 2) | 2;
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }

    public final String toString() {
        qia qiaVar;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object xx1Var = "null";
        sb.append(this.n != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) yc5.b(this.i));
        sb.append(", history=");
        sb.append(this.q);
        sb.append(", constraints=");
        ria riaVar = this.n;
        if (riaVar != null && (qiaVar = riaVar.a) != null) {
            xx1Var = new xx1(qiaVar.j);
        }
        sb.append(xx1Var);
        sb.append(')');
        return sb.toString();
    }
}
