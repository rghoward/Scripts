package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k80 {
    public static final k80 d = new a().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public boolean a;
        public boolean b;
        public boolean c;

        public final k80 a() {
            if (this.a || !(this.b || this.c)) {
                return new k80(this);
            }
            aa0.c("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }
    }

    public k80(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k80.class != obj.getClass()) {
            return false;
        }
        k80 k80Var = (k80) obj;
        return this.a == k80Var.a && this.b == k80Var.b && this.c == k80Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
