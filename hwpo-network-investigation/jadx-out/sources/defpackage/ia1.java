package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend", v = 1)
public final class ia1 extends p6a implements ci4<t72, r02<? super ga1<? extends g2b>>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ sc9<Object> v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(sc9<Object> sc9Var, Object obj, r02<? super ia1> r02Var) {
        super(2, r02Var);
        this.v = sc9Var;
        this.w = obj;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ia1 ia1Var = new ia1(this.v, this.w, r02Var);
        ia1Var.u = obj;
        return ia1Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super ga1<? extends g2b>> r02Var) {
        return ((ia1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object aVar;
        int i = this.t;
        try {
            if (i == 0) {
                dv8.b(obj);
                sc9<Object> sc9Var = this.v;
                Object obj2 = this.w;
                this.u = null;
                this.t = 1;
                Object objA = sc9Var.a(this, obj2);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            aVar = g2b.a;
        } catch (Throwable th) {
            aVar = new av8.a(th);
        }
        return new ga1(!(aVar instanceof av8.a) ? g2b.a : new ga1.a(av8.a(aVar)));
    }
}
