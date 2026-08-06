package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qo9 extends dl0<b, a> {
    public static final /* synthetic */ int H = 0;
    public final oo9 A;
    public final xo1 B;
    public final yj9 C;
    public final ww1 D;
    public final k55 E;
    public final yq6 F;
    public final yq6 G;
    public final b87 x;
    public final li7 y;
    public final cm3 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a implements bl0 {

        /* JADX INFO: renamed from: qo9$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0228a extends a {
            public static final C0228a a = new C0228a();
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
    public qo9(b87 b87Var, li7 li7Var, cm3 cm3Var, oo9 oo9Var, xo1 xo1Var, yj9 yj9Var, ww1 ww1Var, k55 k55Var) {
        super(new b(false, false));
        b87Var.getClass();
        li7Var.getClass();
        cm3Var.getClass();
        oo9Var.getClass();
        xo1Var.getClass();
        yj9Var.getClass();
        ww1Var.getClass();
        k55Var.getClass();
        this.x = b87Var;
        this.y = li7Var;
        this.z = cm3Var;
        this.A = oo9Var;
        this.B = xo1Var;
        this.C = yj9Var;
        this.D = ww1Var;
        this.E = k55Var;
        this.F = oh7.a(this.u, new vu5(2));
        this.G = oh7.a(this.u, new po9(0));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    /* JADX WARN: Code duplicated, block: B:58:0x0119  */
    /* JADX WARN: Code duplicated, block: B:63:0x0121  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r0 == r10) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0101, code lost:
    
        if (defpackage.yd3.b((defpackage.xd3) r1, r3, r8) == r10) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        if (r0 == r10) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.qo9 r13, defpackage.h5b r14, defpackage.u02 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo9.g(qo9, h5b, u02):java.lang.Object");
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var.equals(a.b.a)) {
            return b.a(b(), false, true, 1);
        }
        if (bl0Var.equals(a.C0228a.a)) {
            return b.a(b(), false, false, 1);
        }
        return bl0Var instanceof a.c ? b.a(b(), ((a.c) bl0Var).a, false, 2) : b();
    }

    public final void i(Exception exc) {
        rma.a.b(exc);
        f(new to9(this.z.a(exc)));
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
            return "State(isSignBtnEnabled=" + this.a + ", isProgress=" + this.b + ")";
        }

        public b() {
            this(false, false);
        }
    }
}
