package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dm7 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends dm7 {
        public final cu7 a;

        public a(cu7 cu7Var) {
            this.a = cu7Var;
        }

        @Override // defpackage.dm7
        public final sk8 a() {
            return this.a.getBounds();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends dm7 {
        public final sk8 a;

        public b(sk8 sk8Var) {
            this.a = sk8Var;
        }

        @Override // defpackage.dm7
        public final sk8 a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return xj5.a(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends dm7 {
        public final vx8 a;
        public final vp b;

        public c(vx8 vx8Var) {
            vp vpVarA;
            this.a = vx8Var;
            if (dc4.c(vx8Var)) {
                vpVarA = null;
            } else {
                vpVarA = xp.a();
                vpVarA.q(vx8Var);
            }
            this.b = vpVarA;
        }

        @Override // defpackage.dm7
        public final sk8 a() {
            vx8 vx8Var = this.a;
            return new sk8(vx8Var.a, vx8Var.b, vx8Var.c, vx8Var.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return xj5.a(this.a, ((c) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public abstract sk8 a();
}
