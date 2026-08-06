package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q2b<T, B> {
    public abstract void a(int i, int i2, Object obj);

    public abstract void b(Object obj, long j, int i);

    public abstract void c(int i, Object obj, Object obj2);

    public abstract void d(B b, int i, e01 e01Var);

    public abstract void e(Object obj, long j, int i);

    public abstract s2b f(Object obj);

    public abstract s2b g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract s2b k(Object obj, Object obj2);

    public final boolean l(B b, hi8 hi8Var, int i) throws fk5 {
        rg1 rg1Var;
        int i2 = ((rg1) hi8Var).b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            rg1 rg1Var2 = (rg1) hi8Var;
            rg1Var2.w(0);
            e(b, rg1Var2.a.n(), i3);
            return true;
        }
        if (i4 == 1) {
            rg1 rg1Var3 = (rg1) hi8Var;
            rg1Var3.w(1);
            b(b, rg1Var3.a.k(), i3);
            return true;
        }
        if (i4 == 2) {
            d(b, i3, ((rg1) hi8Var).e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw fk5.b();
            }
            rg1 rg1Var4 = (rg1) hi8Var;
            rg1Var4.w(5);
            a(i3, rg1Var4.a.j(), b);
            return true;
        }
        s2b s2bVarM = m();
        int i5 = (i3 << 3) | 4;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new fk5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        do {
            rg1Var = (rg1) hi8Var;
            if (rg1Var.a() == Integer.MAX_VALUE) {
                break;
            }
        } while (l(s2bVarM, rg1Var, i6));
        if (i5 != rg1Var.b) {
            throw new fk5("Protocol message end-group tag did not match expected tag.");
        }
        c(i3, b, p(s2bVarM));
        return true;
    }

    public abstract s2b m();

    public abstract void n(Object obj, B b);

    public abstract void o(Object obj, T t);

    public abstract s2b p(Object obj);

    public abstract void q(T t, drb drbVar);

    public abstract void r(T t, drb drbVar);
}
