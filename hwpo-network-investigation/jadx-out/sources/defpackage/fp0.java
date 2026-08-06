package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fp0 extends dl0<b, a> {
    public static final /* synthetic */ int K = 0;
    public final hy8 A;
    public final cb B;
    public final hl4 C;
    public final pf9 D;
    public final p43 E;
    public final cm3 F;
    public final bu8 G;
    public final yq6 H;
    public final yq6 I;
    public final yq6 J;
    public final int x;
    public final int y;
    public final List<vn0> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a implements bl0 {

        /* JADX INFO: renamed from: fp0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0090a extends a {
            public final boolean a;

            public C0090a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0090a) && this.a == ((C0090a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return cq2.a("ChangeButtonState(isEnabled=", ")", this.a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements el0 {
        public final int a;
        public final List<vn0> b;
        public final boolean c;
        public final boolean d;

        public b(int i, List<vn0> list, boolean z, boolean z2) {
            this.a = i;
            this.b = list;
            this.c = z;
            this.d = z2;
        }

        public static b a(b bVar, boolean z, boolean z2, int i) {
            int i2 = bVar.a;
            List<vn0> list = bVar.b;
            if ((i & 4) != 0) {
                z = bVar.c;
            }
            if ((i & 8) != 0) {
                z2 = bVar.d;
            }
            bVar.getClass();
            return new b(i2, list, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + uo2.a(ho2.a(Integer.hashCode(this.a) * 31, 31, this.b), this.c, 31);
        }

        public final String toString() {
            return "State(sessionId=" + this.a + ", benchmarks=" + this.b + ", isProgress=" + this.c + ", buttonEnabled=" + this.d + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(int i, int i2, List<vn0> list, hy8 hy8Var, cb cbVar, hl4 hl4Var, pf9 pf9Var, n89 n89Var, p43 p43Var, cm3 cm3Var, bu8 bu8Var) {
        super(new b(i2, list, false, false));
        list.getClass();
        hy8Var.getClass();
        cbVar.getClass();
        hl4Var.getClass();
        pf9Var.getClass();
        n89Var.getClass();
        p43Var.getClass();
        cm3Var.getClass();
        bu8Var.getClass();
        int i3 = 0;
        this.x = i;
        this.y = i2;
        this.z = list;
        this.A = hy8Var;
        this.B = cbVar;
        this.C = hl4Var;
        this.D = pf9Var;
        this.E = p43Var;
        this.F = cm3Var;
        this.G = bu8Var;
        this.H = oh7.a(this.u, new cp0(i3));
        this.I = oh7.a(this.u, new dp0(i3));
        this.J = oh7.a(this.u, new ep0(i3));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var.equals(a.c.a)) {
            return b.a(b(), true, false, 11);
        }
        if (bl0Var.equals(a.b.a)) {
            return b.a(b(), false, false, 11);
        }
        return bl0Var instanceof a.C0090a ? b.a(b(), false, ((a.C0090a) bl0Var).a, 7) : b();
    }
}
