package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface fy8 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        boolean b();

        b c();

        void cancel();

        pi8 d();

        a e();

        a g();
    }

    boolean a(f55 f55Var);

    boolean b(pi8 pi8Var);

    wd c();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final b a;
        public final b b;
        public final Throwable c;

        public /* synthetic */ a(b bVar, vw1 vw1Var, Throwable th, int i) {
            this(bVar, (i & 2) != 0 ? null : vw1Var, (i & 4) != 0 ? null : th);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && xj5.a(this.b, aVar.b) && xj5.a(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            b bVar = this.b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Throwable th = this.c;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
        }

        public a(b bVar, b bVar2, Throwable th) {
            this.a = bVar;
            this.b = bVar2;
            this.c = th;
        }
    }
}
