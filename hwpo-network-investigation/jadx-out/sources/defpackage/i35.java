package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i35 extends wp5 implements oh4<j35, Boolean> {
    public final /* synthetic */ gl8<j35> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i35(gl8<j35> gl8Var) {
        super(1);
        this.u = gl8Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, j35, java.lang.Object] */
    @Override // defpackage.oh4
    public final Boolean invoke(j35 j35Var) {
        j35 j35Var2 = j35Var;
        gl8<j35> gl8Var = this.u;
        j35 j35Var3 = gl8Var.t;
        if (j35Var3 == null && j35Var2.J) {
            gl8Var.t = j35Var2;
        } else if (j35Var3 != null) {
            j35Var2.getClass();
        }
        return Boolean.TRUE;
    }
}
