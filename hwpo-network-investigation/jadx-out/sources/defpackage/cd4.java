package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cd4 extends dl0<dd4, ec4> {
    public static final /* synthetic */ int B = 0;
    public final yq6 A;
    public final cm3 x;
    public final vu8 y;
    public final yq6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd4(cm3 cm3Var, vu8 vu8Var) {
        super(dd4.d);
        cm3Var.getClass();
        vu8Var.getClass();
        dd4.Companion.getClass();
        this.x = cm3Var;
        this.y = vu8Var;
        this.z = oh7.a(this.u, new yc(2));
        this.A = oh7.a(this.u, new ad(1));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof ec4.d) {
            return dd4.a(b(), null, false, true, 7);
        }
        if (bl0Var instanceof ec4.c) {
            return dd4.a(b(), null, false, false, 7);
        }
        if (bl0Var instanceof ec4.a) {
            return dd4.a(b(), ((ec4.a) bl0Var).a, false, false, 14);
        }
        return bl0Var instanceof ec4.b ? dd4.a(b(), null, ((ec4.b) bl0Var).a, false, 11) : b();
    }
}
