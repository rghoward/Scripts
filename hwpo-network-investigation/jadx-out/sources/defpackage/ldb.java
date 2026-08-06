package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ldb<V extends fw> {
    public final r44 a;
    public V b;
    public V c;
    public V d;
    public final float e;

    public ldb(r44 r44Var) {
        this.a = r44Var;
        this.e = r44Var.a();
    }

    public final float a() {
        return this.e;
    }

    public final V b(V v, V v2) {
        if (this.d == null) {
            this.d = (V) v.c();
        }
        V v3 = this.d;
        if (v3 == null) {
            xj5.e("targetVector");
            throw null;
        }
        int iB = v3.b();
        int i = 0;
        while (true) {
            V v4 = this.d;
            if (i >= iB) {
                if (v4 != null) {
                    return v4;
                }
                xj5.e("targetVector");
                throw null;
            }
            if (v4 == null) {
                xj5.e("targetVector");
                throw null;
            }
            v4.e(this.a.e(v.a(i), v2.a(i)), i);
            i++;
        }
    }

    public final V c(long j, V v, V v2) {
        if (this.c == null) {
            this.c = (V) v.c();
        }
        V v3 = this.c;
        if (v3 == null) {
            xj5.e("velocityVector");
            throw null;
        }
        int iB = v3.b();
        int i = 0;
        while (true) {
            V v4 = this.c;
            if (i >= iB) {
                if (v4 != null) {
                    return v4;
                }
                xj5.e("velocityVector");
                throw null;
            }
            if (v4 == null) {
                xj5.e("velocityVector");
                throw null;
            }
            v.getClass();
            v4.e(this.a.b(v2.a(i), j), i);
            i++;
        }
    }
}
