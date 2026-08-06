package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$2", f = "TapGestureDetector.kt", l = {136}, m = "invokeSuspend", v = 1)
public final class w8a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ei4<j88, vf7, r02<? super g2b>, Object> u;
    public final /* synthetic */ m88 v;
    public final /* synthetic */ a58 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w8a(ei4<? super j88, ? super vf7, ? super r02<? super g2b>, ? extends Object> ei4Var, m88 m88Var, a58 a58Var, r02<? super w8a> r02Var) {
        super(2, r02Var);
        this.u = ei4Var;
        this.v = m88Var;
        this.w = a58Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new w8a(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((w8a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            vf7 vf7Var = new vf7(this.w.c);
            this.t = 1;
            Object objInvoke = this.u.invoke(this.v, vf7Var, this);
            v72 v72Var = v72.t;
            if (objInvoke == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
