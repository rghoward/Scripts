package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kdb<V extends fw> implements jdb<V> {
    public final hw t;
    public V u;
    public V v;
    public V w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements hw {
        public final /* synthetic */ m44 a;

        public a(m44 m44Var) {
            this.a = m44Var;
        }

        @Override // defpackage.hw
        public final m44 get(int i) {
            return this.a;
        }
    }

    public kdb(m44 m44Var) {
        this(new a(m44Var));
    }

    @Override // defpackage.edb
    public final long d(V v, V v2, V v3) {
        int iB = v.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, this.t.get(i).c(v.a(i), v2.a(i), v3.a(i)));
        }
        return jMax;
    }

    @Override // defpackage.edb
    public final V e(long j, V v, V v2, V v3) {
        if (this.v == null) {
            this.v = (V) v3.c();
        }
        V v4 = this.v;
        if (v4 == null) {
            xj5.e("velocityVector");
            throw null;
        }
        int iB = v4.b();
        int i = 0;
        while (true) {
            V v5 = this.v;
            if (i >= iB) {
                if (v5 != null) {
                    return v5;
                }
                xj5.e("velocityVector");
                throw null;
            }
            if (v5 == null) {
                xj5.e("velocityVector");
                throw null;
            }
            v5.e(this.t.get(i).b(j, v.a(i), v2.a(i), v3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.edb
    public final V g(long j, V v, V v2, V v3) {
        if (this.u == null) {
            this.u = (V) v.c();
        }
        V v4 = this.u;
        if (v4 == null) {
            xj5.e("valueVector");
            throw null;
        }
        int iB = v4.b();
        int i = 0;
        while (true) {
            V v5 = this.u;
            if (i >= iB) {
                if (v5 != null) {
                    return v5;
                }
                xj5.e("valueVector");
                throw null;
            }
            if (v5 == null) {
                xj5.e("valueVector");
                throw null;
            }
            v5.e(this.t.get(i).e(j, v.a(i), v2.a(i), v3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.edb
    public final V h(V v, V v2, V v3) {
        if (this.w == null) {
            this.w = (V) v3.c();
        }
        V v4 = this.w;
        if (v4 == null) {
            xj5.e("endVelocityVector");
            throw null;
        }
        int iB = v4.b();
        int i = 0;
        while (true) {
            V v5 = this.w;
            if (i >= iB) {
                if (v5 != null) {
                    return v5;
                }
                xj5.e("endVelocityVector");
                throw null;
            }
            if (v5 == null) {
                xj5.e("endVelocityVector");
                throw null;
            }
            v5.e(this.t.get(i).d(v.a(i), v2.a(i), v3.a(i)), i);
            i++;
        }
    }

    public kdb(hw hwVar) {
        this.t = hwVar;
    }
}
