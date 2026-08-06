package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListViewModel$onItemClicked$1", f = "ValuesListViewModel.kt", l = {251}, m = "invokeSuspend", v = 2)
public final class ccb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ybb u;
    public final /* synthetic */ wab v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccb(ybb ybbVar, wab wabVar, r02<? super ccb> r02Var) {
        super(2, r02Var);
        this.u = ybbVar;
        this.v = wabVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ccb(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ccb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        ybb ybbVar = this.u;
        wab wabVar = this.v;
        if (i == 0) {
            dv8.b(obj);
            ll4 ll4Var = ybbVar.B;
            Integer num = new Integer(wabVar.c());
            this.t = 1;
            ll4Var.getClass();
            obj = g5b.b(ll4Var, num, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        osa osaVar = (osa) yd3.e((xd3) obj, null);
        if (osaVar == null) {
            return g2b.a;
        }
        ybbVar.x.l(ybbVar.I.ordinal(), wabVar.c(), osaVar.c().ordinal(), osaVar.g().ordinal(), wabVar.e());
        return g2b.a;
    }
}
