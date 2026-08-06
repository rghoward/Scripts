package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wpa extends dl0<ypa, a> {
    public static final /* synthetic */ int C = 0;
    public final yq6 A;
    public final yq6 B;
    public final hy8 x;
    public final yq6 y;
    public final yq6 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a implements bl0 {

        /* JADX INFO: renamed from: wpa$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0277a extends a {
            public final String a;
            public final String b;
            public final ipa.b c;

            public C0277a(String str, String str2, ipa.b bVar) {
                str.getClass();
                str2.getClass();
                this.a = str;
                this.b = str2;
                this.c = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0277a)) {
                    return false;
                }
                C0277a c0277a = (C0277a) obj;
                return xj5.a(this.a, c0277a.a) && xj5.a(this.b, c0277a.b) && xj5.a(this.c, c0277a.c);
            }

            public final int hashCode() {
                int iC = ru3.c(this.a.hashCode() * 31, 31, this.b);
                ipa.b bVar = this.c;
                return iC + (bVar == null ? 0 : bVar.hashCode());
            }

            public final String toString() {
                StringBuilder sbA = vb0.a("Initialize(title=", this.a, ", descriptionText=", this.b, ", attachment=");
                sbA.append(this.c);
                sbA.append(")");
                return sbA.toString();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u60.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpa(hy8 hy8Var, q09 q09Var) {
        super(ypa.d);
        hy8Var.getClass();
        q09Var.getClass();
        ypa.Companion.getClass();
        this.x = hy8Var;
        this.y = oh7.a(this.u, new q32(3));
        this.z = oh7.a(this.u, new r32(1));
        this.A = oh7.a(this.u, new upa(0));
        this.B = oh7.a(this.u, new vpa(0));
        Object objA = q09Var.a("tips_arguments");
        if (objA == null) {
            z90.a("Required value was null.");
            throw null;
        }
        ipa ipaVar = (ipa) objA;
        e(new a.C0277a(ipaVar.t, ipaVar.u, ipaVar.v));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (!(bl0Var instanceof a.C0277a)) {
            return b();
        }
        b();
        a.C0277a c0277a = (a.C0277a) bl0Var;
        String str = c0277a.a;
        String str2 = c0277a.b;
        ipa.b bVar = c0277a.c;
        str.getClass();
        str2.getClass();
        return new ypa(str, str2, bVar);
    }
}
