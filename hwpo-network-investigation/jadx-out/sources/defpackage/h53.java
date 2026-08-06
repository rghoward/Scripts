package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h53 extends wp5 implements oh4<i53, sxa> {
    public final /* synthetic */ cl8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h53(e53 e53Var, i53 i53Var, cl8 cl8Var) {
        super(1);
        this.u = cl8Var;
    }

    @Override // defpackage.oh4
    public final sxa invoke(i53 i53Var) {
        i53 i53Var2 = i53Var;
        if (!i53Var2.G) {
            return sxa.u;
        }
        if (i53Var2.J != null) {
            uc5.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        i53Var2.J = null;
        cl8 cl8Var = this.u;
        cl8Var.t = cl8Var.t;
        return sxa.t;
    }
}
