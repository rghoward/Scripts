package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gp8 extends dl0<hp8, po8> {
    public static final /* synthetic */ int E = 0;
    public final wn8 A;
    public final cm3 B;
    public final yq6 C;
    public final yq6 D;
    public final q09 x;
    public final do8 y;
    public final bl4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp8(q09 q09Var, do8 do8Var, bl4 bl4Var, wn8 wn8Var, cm3 cm3Var) {
        super(new hp8(0));
        q09Var.getClass();
        do8Var.getClass();
        bl4Var.getClass();
        wn8Var.getClass();
        cm3Var.getClass();
        this.x = q09Var;
        this.y = do8Var;
        this.z = bl4Var;
        this.A = wn8Var;
        this.B = cm3Var;
        this.C = oh7.a(this.u, new dp8());
        this.D = oh7.a(this.u, new af5(2));
        oy0.d(rhb.b(this), null, null, new ep8(this, null), 3);
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof po8.a) {
            return hp8.a(b(), false, ((po8.a) bl0Var).a, 1);
        }
        if (bl0Var instanceof po8.b) {
            return hp8.a(b(), true, null, 2);
        }
        return bl0Var instanceof po8.c ? hp8.a(b(), false, null, 2) : b();
    }

    public final long g() {
        Object objA = this.x.a("com.hwpo_training_app.report.presentation.reasons.ReportReasonsFragment.COMMENT_ID_EXTRA");
        if (objA != null) {
            return ((Number) objA).longValue();
        }
        z90.a("Required value was null.");
        return 0L;
    }
}
