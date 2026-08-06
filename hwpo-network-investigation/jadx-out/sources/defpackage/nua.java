package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class nua extends dl0<qua, ssa> {
    public static final /* synthetic */ int B = 0;
    public final yq6 A;
    public final pta x;
    public final bu8 y;
    public final yq6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nua(pta ptaVar, bu8 bu8Var) {
        super(qua.d);
        ptaVar.getClass();
        bu8Var.getClass();
        qua.Companion.getClass();
        this.x = ptaVar;
        this.y = bu8Var;
        this.z = oh7.a(this.u, new lua(0));
        this.A = oh7.a(this.u, new mua(0));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof ssa.c) {
            return qua.a(b(), 0, ((ssa.c) bl0Var).a, false, 5);
        }
        if (bl0Var instanceof ssa.b) {
            return qua.a(b(), 0, null, ((ssa.b) bl0Var).a, 3);
        }
        return bl0Var instanceof ssa.a ? qua.a(b(), ((ssa.a) bl0Var).a, null, false, 6) : b();
    }
}
