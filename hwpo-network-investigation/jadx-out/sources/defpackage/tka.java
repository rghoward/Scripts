package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tka extends dl0<uka, kka> {
    public static final /* synthetic */ int A = 0;
    public final q09 x;
    public final do8 y;
    public final yq6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tka(q09 q09Var, do8 do8Var) {
        super(new uka(0));
        q09Var.getClass();
        do8Var.getClass();
        this.x = q09Var;
        this.y = do8Var;
        this.z = oh7.a(this.u, new jg(3));
        Object objA = q09Var.a("com.hwpo_training_app.report.presentation.thank_you.ThankYouFragment.REASON_TEXT_EXTRA");
        if (objA != null) {
            e(new kka.a((String) objA));
        } else {
            z90.a("Required value was null.");
            throw null;
        }
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (!(bl0Var instanceof kka.a)) {
            return b();
        }
        b();
        return new uka(((kka.a) bl0Var).a);
    }

    public final void g() {
        Object objA = this.x.a("com.hwpo_training_app.report.presentation.thank_you.ThankYouFragment.COMMENT_ID_EXTRA");
        if (objA == null) {
            z90.a("Required value was null.");
        } else {
            f(new lka.a(((Number) objA).longValue()));
            this.y.a();
        }
    }
}
