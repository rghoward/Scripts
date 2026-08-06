package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l9a<T, V extends fw> implements lv<T, V> {
    public final edb<V> a;
    public final cza<T, V> b;
    public T c;
    public T d;
    public V e;
    public V f;
    public final V g;
    public long h;
    public V i;

    public l9a() {
        throw null;
    }

    public l9a(wv<T> wvVar, cza<T, V> czaVar, T t, T t2, V v) {
        this.a = wvVar.a(czaVar);
        this.b = czaVar;
        this.c = t2;
        this.d = t;
        this.e = czaVar.a().invoke(t);
        this.f = czaVar.a().invoke(t2);
        this.g = v != null ? (V) gw.b(v) : (V) czaVar.a().invoke(t).c();
        this.h = -1L;
    }

    public final void a(T t) {
        if (xj5.a(t, this.d)) {
            return;
        }
        this.d = t;
        this.e = this.b.a().invoke(t);
        this.i = null;
        this.h = -1L;
    }

    @Override // defpackage.lv
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.lv
    public final long c() {
        if (this.h < 0) {
            this.h = this.a.d(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.lv
    public final cza<T, V> d() {
        return this.b;
    }

    @Override // defpackage.lv
    public final V e(long j) {
        if (!f(j)) {
            return (V) this.a.e(j, this.e, this.f, this.g);
        }
        V v = this.i;
        if (v != null) {
            return v;
        }
        V v2 = (V) this.a.h(this.e, this.f, this.g);
        this.i = v2;
        return v2;
    }

    @Override // defpackage.lv
    public final T g(long j) {
        if (f(j)) {
            return this.c;
        }
        fw fwVarG = this.a.g(j, this.e, this.f, this.g);
        int iB = fwVarG.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(fwVarG.a(i))) {
                e78.b("AnimationVector cannot contain a NaN. " + fwVarG + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return (T) this.b.b().invoke(fwVarG);
    }

    @Override // defpackage.lv
    public final T h() {
        return this.c;
    }

    public final void i(T t) {
        if (xj5.a(this.c, t)) {
            return;
        }
        this.c = t;
        this.f = this.b.a().invoke(t);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
