package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wl7 extends dl0<zl7, ll7> {
    public static final /* synthetic */ int G = 0;
    public final cm3 A;
    public final long B;
    public final int C;
    public final Integer D;
    public final yq6 E;
    public final yq6 F;
    public final do8 x;
    public final eo8 y;
    public final bu8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl7(q09 q09Var, do8 do8Var, eo8 eo8Var, bu8 bu8Var, cm3 cm3Var) {
        super(new zl7(false, false));
        q09Var.getClass();
        do8Var.getClass();
        eo8Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        this.x = do8Var;
        this.y = eo8Var;
        this.z = bu8Var;
        this.A = cm3Var;
        Object objA = q09Var.a("com.hwpo_training_app.report.presentation.other_reason.OtherReasonFragment.COMMENT_ID_EXTRA");
        if (objA == null) {
            z90.a("Required value was null.");
            throw null;
        }
        this.B = ((Number) objA).longValue();
        Object objA2 = q09Var.a("com.hwpo_training_app.report.presentation.other_reason.OtherReasonFragment.SCORE_ID_EXTRA");
        if (objA2 == null) {
            z90.a("Required value was null.");
            throw null;
        }
        this.C = ((Number) objA2).intValue();
        this.D = (Integer) q09Var.a("com.hwpo_training_app.report.presentation.other_reason.OtherReasonFragment.SCORE_VALUE_ID_EXTRA");
        this.E = oh7.a(this.u, new kv4(1));
        this.F = oh7.a(this.u, new c42(2));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof ll7.b) {
            return zl7.a(b(), true, false, 2);
        }
        if (bl0Var instanceof ll7.c) {
            return zl7.a(b(), false, false, 2);
        }
        return bl0Var instanceof ll7.a ? zl7.a(b(), false, ((ll7.a) bl0Var).a, 1) : b();
    }
}
