package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ij9 extends dl0<jj9, zi9> {
    public static final a Companion = new a();
    public hy8 A;
    public final yq6 B;
    public final hy8 x;
    public final i7a y;
    public final q09 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ij9(hy8 hy8Var, i7a i7aVar, q09 q09Var) {
        hy8Var.getClass();
        i7aVar.getClass();
        q09Var.getClass();
        Object objA = q09Var.a("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_PROGRAM_DATE");
        if (objA == null) {
            z90.a("Required value was null.");
            throw null;
        }
        LocalDate localDateP = yk2.p(((Number) objA).longValue());
        localDateP.getClass();
        Object objA2 = q09Var.a("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_PROGRAM_ID");
        if (objA2 == null) {
            z90.a("Required value was null.");
            throw null;
        }
        int iIntValue = ((Number) objA2).intValue();
        Object objA3 = q09Var.a("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_SUBTITLE");
        if (objA3 == null) {
            z90.a("Required value was null.");
            throw null;
        }
        qi9 qi9Var = (qi9) objA3;
        Object objA4 = q09Var.a("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_TITLE");
        if (objA4 == null) {
            z90.a("Required value was null.");
            throw null;
        }
        String str = (String) objA4;
        Boolean bool = (Boolean) q09Var.a("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_CAN_RESCHEDULE");
        super(new jj9(new js7(new sh9(null, new sh9.a(new xi9.b(iIntValue, localDateP), str, qi9Var, bool != null ? bool.booleanValue() : false), null), 0), false, tf0.w));
        this.x = hy8Var;
        this.y = i7aVar;
        this.z = q09Var;
        this.B = oh7.a(this.u, new hj9());
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof zi9.b) {
            return jj9.a(b(), ((zi9.b) bl0Var).a, null, 6);
        }
        return bl0Var instanceof zi9.a ? jj9.a(b(), null, ((zi9.a) bl0Var).a, 1) : b();
    }
}
