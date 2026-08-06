package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b58 {
    public final we6<a> a = new we6<>((Object) null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }
    }

    public final ij5 a(c58 c58Var, cm cmVar) {
        long j;
        long j2;
        boolean z;
        List<d58> list = c58Var.a;
        we6 we6Var = new we6(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            d58 d58Var = list.get(i);
            long j3 = d58Var.a;
            we6<a> we6Var2 = this.a;
            a aVarB = we6Var2.b(j3);
            if (aVarB == null) {
                j2 = d58Var.b;
                j = d58Var.d;
                z = false;
            } else {
                long j4 = aVarB.a;
                boolean z2 = aVarB.c;
                j = cmVar.j(aVarB.b);
                j2 = j4;
                z = z2;
            }
            long j5 = d58Var.a;
            List<d58> list2 = list;
            int i2 = size;
            we6Var.f(j5, new a58(j5, d58Var.b, d58Var.d, d58Var.e, d58Var.f, j2, j, z, d58Var.g, d58Var.i, d58Var.j, d58Var.k, d58Var.l, d58Var.m));
            boolean z3 = d58Var.e;
            if (z3) {
                we6Var2.f(j3, new a(d58Var.b, d58Var.c, z3));
            } else {
                we6Var2.g(j3);
            }
            i++;
            list = list2;
            size = i2;
        }
        return new ij5(we6Var, c58Var);
    }
}
