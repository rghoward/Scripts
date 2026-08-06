package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p7b {
    public final int a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends p7b {
        public final int b;
        public final String c;

        public a(int i, String str) {
            super(i);
            this.b = i;
            this.c = str;
        }

        @Override // defpackage.p7b
        public final int a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && xj5.a(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.b) * 31;
            String str = this.c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Invalid(validatingId=" + this.b + ", errorMessage=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends p7b {
        public final int b;

        public b(int i) {
            super(i);
            this.b = i;
        }

        @Override // defpackage.p7b
        public final int a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return pk.d(this.b, "Valid(validatingId=", ")");
        }
    }

    public p7b(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
