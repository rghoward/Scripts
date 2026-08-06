package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ue extends dl0<xe, de> {
    public static final /* synthetic */ int B = 0;
    public final yq6 A;
    public final is4 x;
    public ed6 y;
    public final yq6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue(q09 q09Var, is4 is4Var) {
        super(new xe(null, null));
        q09Var.getClass();
        is4Var.getClass();
        xe.Companion.getClass();
        this.x = is4Var;
        this.z = oh7.a(this.u, new se(0));
        this.A = oh7.a(this.u, new te(0));
        oq4.b bVar = (oq4.b) q09Var.a("com.hwpo_training_app.affilated_gym.filters.screen.AffilatedGymFilterFragment.PRESELECTED_COUNTRY_KEY");
        if (bVar != null) {
            e(new de.b(bVar));
        }
        oq4.a aVar = (oq4.a) q09Var.a("com.hwpo_training_app.affilated_gym.filters.screen.AffilatedGymFilterFragment.PRESELECTED_CITY_KEY");
        if (aVar != null) {
            e(new de.a(aVar));
        }
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof de.b) {
            return xe.a(b(), ((de.b) bl0Var).a, null, 5);
        }
        return bl0Var instanceof de.a ? xe.a(b(), null, ((de.a) bl0Var).a, 3) : b();
    }
}
