package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zm2<T, V extends fw> implements lv<T, V> {
    public final ldb a;
    public final cza<T, V> b;
    public final T c;
    public final V d;
    public final V e;
    public final V f;
    public final T g;
    public final long h;

    public zm2(an2<T> an2Var, cza<T, V> czaVar, T t, V v) {
        ldb ldbVarA = an2Var.a();
        this.a = ldbVarA;
        this.b = czaVar;
        this.c = t;
        V vInvoke = czaVar.a().invoke(t);
        this.d = vInvoke;
        this.e = (V) gw.b(v);
        this.g = (T) czaVar.b().invoke(ldbVarA.b(vInvoke, v));
        if (ldbVarA.c == null) {
            ldbVarA.c = (V) vInvoke.c();
        }
        V v2 = ldbVarA.c;
        if (v2 == null) {
            xj5.e("velocityVector");
            throw null;
        }
        int iB = v2.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            r44 r44Var = ldbVarA.a;
            vInvoke.getClass();
            jMax = Math.max(jMax, r44Var.d(v.a(i)));
        }
        this.h = jMax;
        V v3 = (V) gw.b(ldbVarA.c(jMax, vInvoke, v));
        this.f = v3;
        int iB2 = v3.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            V v4 = this.f;
            v4.e(uh8.f(v4.a(i2), -this.a.a(), this.a.a()), i2);
        }
    }

    @Override // defpackage.lv
    public final boolean b() {
        return false;
    }

    @Override // defpackage.lv
    public final long c() {
        return this.h;
    }

    @Override // defpackage.lv
    public final cza<T, V> d() {
        return this.b;
    }

    @Override // defpackage.lv
    public final V e(long j) {
        if (f(j)) {
            return this.f;
        }
        return (V) this.a.c(j, this.d, this.e);
    }

    @Override // defpackage.lv
    public final T g(long j) {
        if (f(j)) {
            return this.g;
        }
        oh4<V, T> oh4VarB = this.b.b();
        ldb ldbVar = this.a;
        V v = ldbVar.b;
        V v2 = this.d;
        if (v == null) {
            ldbVar.b = (V) v2.c();
        }
        V v3 = ldbVar.b;
        if (v3 == null) {
            xj5.e("valueVector");
            throw null;
        }
        int iB = v3.b();
        int i = 0;
        while (true) {
            V v4 = ldbVar.b;
            if (i >= iB) {
                if (v4 != null) {
                    return oh4VarB.invoke(v4);
                }
                xj5.e("valueVector");
                throw null;
            }
            if (v4 == null) {
                xj5.e("valueVector");
                throw null;
            }
            v4.e(ldbVar.a.c(v2.a(i), this.e.a(i), j), i);
            i++;
        }
    }

    @Override // defpackage.lv
    public final T h() {
        return this.g;
    }
}
