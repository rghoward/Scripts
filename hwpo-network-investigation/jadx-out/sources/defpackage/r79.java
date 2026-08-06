package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {610}, m = "invokeSuspend", v = 1)
public final class r79 extends p6a implements ci4<vf7, r02<? super vf7>, Object> {
    public int t;
    public /* synthetic */ long u;
    public final /* synthetic */ n79 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r79(n79 n79Var, r02<? super r79> r02Var) {
        super(2, r02Var);
        this.v = n79Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        r79 r79Var = new r79(this.v, r02Var);
        r79Var.u = ((vf7) obj).a;
        return r79Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(vf7 vf7Var, r02<? super vf7> r02Var) {
        long j = vf7Var.a;
        r79 r79Var = new r79(this.v, r02Var);
        r79Var.u = j;
        return r79Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i != 0) {
            if (i == 1) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        long j = this.u;
        z79 z79Var = this.v.g0;
        this.t = 1;
        Object objA = d79.a(z79Var, j, this);
        v72 v72Var = v72.t;
        return objA == v72Var ? v72Var : objA;
    }
}
