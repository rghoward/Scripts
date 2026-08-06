package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rsa {
    public final ebb a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends rsa {
        public final ebb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ebb ebbVar) {
            super(ebbVar);
            ebbVar.getClass();
            this.b = ebbVar;
        }

        @Override // defpackage.rsa
        public final ebb a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AddedOrUpdated(valueType=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends rsa {
        public final ebb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ebb ebbVar) {
            super(ebbVar);
            ebbVar.getClass();
            this.b = ebbVar;
        }

        @Override // defpackage.rsa
        public final ebb a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Deleted(valueType=" + this.b + ")";
        }
    }

    public rsa(ebb ebbVar) {
        this.a = ebbVar;
    }

    public ebb a() {
        return this.a;
    }
}
