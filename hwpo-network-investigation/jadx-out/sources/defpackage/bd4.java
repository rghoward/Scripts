package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class bd4 extends dl0<b, a> {
    public static final /* synthetic */ int C = 0;
    public final yq6 A;
    public final yq6 B;
    public final li7 x;
    public final cm3 y;
    public final vu8 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a implements bl0 {

        /* JADX INFO: renamed from: bd4$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0031a extends a {
            public static final C0031a a = new C0031a();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c extends a {
            public final boolean a;

            public c(boolean z) {
                this.a = z;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd4(li7 li7Var, cm3 cm3Var, vu8 vu8Var) {
        super(new b(false, false));
        li7Var.getClass();
        cm3Var.getClass();
        vu8Var.getClass();
        this.x = li7Var;
        this.y = cm3Var;
        this.z = vu8Var;
        this.A = oh7.a(this.u, new tc4(0));
        this.B = oh7.a(this.u, new zc(1));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var.equals(a.b.a)) {
            return b.a(b(), false, true, 1);
        }
        if (bl0Var.equals(a.C0031a.a)) {
            return b.a(b(), false, false, 1);
        }
        return bl0Var instanceof a.c ? b.a(b(), ((a.c) bl0Var).a, false, 2) : new b(false, false);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements el0 {
        public final boolean a;
        public final boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public static b a(b bVar, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                z = bVar.a;
            }
            if ((i & 2) != 0) {
                z2 = bVar.b;
            }
            bVar.getClass();
            return new b(z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "State(isRestorePasswordBtnEnabled=" + this.a + ", isProgress=" + this.b + ")";
        }

        public b() {
            this(false, false);
        }
    }
}
