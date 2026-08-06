package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface t89 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final v89 a;
        public final v89 b;

        public a(v89 v89Var, v89 v89Var2) {
            this.a = v89Var;
            this.b = v89Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            v89 v89Var = this.a;
            sb.append(v89Var);
            v89 v89Var2 = this.b;
            if (v89Var.equals(v89Var2)) {
                str = BuildConfig.FLAVOR;
            } else {
                str = ", " + v89Var2;
            }
            return av.a(sb, str, "]");
        }
    }

    boolean b();

    default boolean d() {
        return false;
    }

    a e(long j);

    long g();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements t89 {
        public final long a;
        public final a b;

        public b(long j, long j2) {
            this.a = j;
            v89 v89Var = j2 == 0 ? v89.c : new v89(0L, j2);
            this.b = new a(v89Var, v89Var);
        }

        @Override // defpackage.t89
        public final boolean b() {
            return false;
        }

        @Override // defpackage.t89
        public final a e(long j) {
            return this.b;
        }

        @Override // defpackage.t89
        public final long g() {
            return this.a;
        }

        public b(long j) {
            this(j, 0L);
        }
    }
}
