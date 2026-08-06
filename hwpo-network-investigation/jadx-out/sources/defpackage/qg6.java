package defpackage;

import com.hwpo_training_app.R;
import com.hwpo_training_app.notifications.domain.ObserveSocketNotificationsFlowUseCase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qg6 extends dl0<ch6, a> {
    public static final b Companion = new b();
    public final uk4 A;
    public final xo1 B;
    public final yj9 C;
    public final xb1 D;
    public final ck9 E;
    public final bu8 F;
    public final cm3 G;
    public final q09 H;
    public final yq6 I;
    public final yq6 J;
    public final hy8 x;
    public final rb1 y;
    public final tb1 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a implements bl0 {

        /* JADX INFO: renamed from: qg6$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0226a extends a {
            public final int a;

            public C0226a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0226a) && this.a == ((C0226a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pk.d(this.a, "SelectTab(selectedTab=", ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends a {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pk.d(this.a, "UnreadCountsChanged(unreadNotificationsCount=", ")");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qg6(hy8 hy8Var, ObserveSocketNotificationsFlowUseCase observeSocketNotificationsFlowUseCase, rb1 rb1Var, tb1 tb1Var, uk4 uk4Var, xo1 xo1Var, yj9 yj9Var, xb1 xb1Var, ck9 ck9Var, bu8 bu8Var, cm3 cm3Var, q09 q09Var) {
        hy8Var.getClass();
        observeSocketNotificationsFlowUseCase.getClass();
        rb1Var.getClass();
        tb1Var.getClass();
        uk4Var.getClass();
        xo1Var.getClass();
        yj9Var.getClass();
        xb1Var.getClass();
        ck9Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        q09Var.getClass();
        Integer num = (Integer) q09Var.a("SELECTED_TAB_KEY");
        super(new ch6(num != null ? num.intValue() : R.id.calendar, 2, 0));
        this.x = hy8Var;
        this.y = rb1Var;
        this.z = tb1Var;
        this.A = uk4Var;
        this.B = xo1Var;
        this.C = yj9Var;
        this.D = xb1Var;
        this.E = ck9Var;
        this.F = bu8Var;
        this.G = cm3Var;
        this.H = q09Var;
        this.I = oh7.a(this.u, new p32(2));
        this.J = oh7.a(this.u, new q32(1));
        oy0.d(rhb.b(this), null, null, new xg6(this, null), 3);
        oy0.d(rhb.b(this), null, null, new rg6(this, null), 3);
        yk2.o(yk2.r(new k74(observeSocketNotificationsFlowUseCase.b(g2b.a), new zg6(this, null)), new ah6(2, null)), rhb.b(this));
        oy0.d(rhb.b(this), null, null, new yg6(this, null), 3);
        oy0.d(rhb.b(this), null, null, new wg6(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        if (r2 == r11) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.qg6 r20, defpackage.h5b r21, defpackage.u02 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg6.g(qg6, h5b, u02):java.lang.Object");
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof a.C0226a) {
            return new ch6(((a.C0226a) bl0Var).a, b().b);
        }
        if (!(bl0Var instanceof a.b)) {
            return b();
        }
        ch6 ch6VarB = b();
        return new ch6(ch6VarB.a, ((a.b) bl0Var).a);
    }
}
