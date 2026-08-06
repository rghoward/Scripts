package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hr7 {
    public static final b a;
    public static final pq7 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements tx2 {
        @Override // defpackage.tx2
        public final float N0() {
            return 1.0f;
        }

        @Override // defpackage.tx2
        public final float getDensity() {
            return 1.0f;
        }
    }

    static {
        b bVar = new b();
        a = bVar;
        b = new pq7(0, 0, 0, 0, 0, 0, du9.b.a, new a(), u72.a(ff3.t), bVar, zx1.b(0, 0, 0, 0, 15));
    }

    public static final long a(iq7 iq7Var, int i) {
        long jG = (((((long) i) * ((long) (iq7Var.g() + iq7Var.i()))) + ((long) iq7Var.d())) + ((long) iq7Var.b())) - ((long) iq7Var.i());
        int iA = (int) (iq7Var.c() == fl7.u ? iq7Var.a() >> 32 : iq7Var.a() & 4294967295L);
        long jG2 = jG - ((long) (iA - uh8.g(iq7Var.k().f(iA, iq7Var.g(), iq7Var.d(), iq7Var.b()), 0, iA)));
        if (jG2 < 0) {
            return 0L;
        }
        return jG2;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements gl6 {
        @Override // defpackage.gl6
        public final int h() {
            return 0;
        }

        @Override // defpackage.gl6
        public final int j() {
            return 0;
        }

        @Override // defpackage.gl6
        public final Map<ei, Integer> l() {
            return if3.t;
        }

        @Override // defpackage.gl6
        public final void m() {
        }
    }
}
