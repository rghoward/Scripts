package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gh3 extends wp5 implements oh4<wg3, ava> {
    public final /* synthetic */ ava u;
    public final /* synthetic */ th3 v;
    public final /* synthetic */ jo3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh3(ava avaVar, th3 th3Var, jo3 jo3Var) {
        super(1);
        this.u = avaVar;
        this.v = th3Var;
        this.w = jo3Var;
    }

    @Override // defpackage.oh4
    public final ava invoke(wg3 wg3Var) {
        int iOrdinal = wg3Var.ordinal();
        ava avaVar = null;
        th3 th3Var = this.v;
        jo3 jo3Var = this.w;
        if (iOrdinal == 0) {
            t39 t39Var = th3Var.a().d;
            if (t39Var != null) {
                avaVar = new ava(t39Var.b);
            } else {
                t39 t39Var2 = jo3Var.a().d;
                if (t39Var2 != null) {
                    avaVar = new ava(t39Var2.b);
                }
            }
        } else if (iOrdinal == 1) {
            avaVar = this.u;
        } else {
            if (iOrdinal != 2) {
                u.b();
                return null;
            }
            t39 t39Var3 = jo3Var.a().d;
            if (t39Var3 != null) {
                avaVar = new ava(t39Var3.b);
            } else {
                t39 t39Var4 = th3Var.a().d;
                if (t39Var4 != null) {
                    avaVar = new ava(t39Var4.b);
                }
            }
        }
        return new ava(avaVar != null ? avaVar.a : ava.b);
    }
}
