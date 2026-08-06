package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2", f = "TimePicker.kt", l = {754}, m = "invokeSuspend")
public final class ni extends p6a implements oh4<r02<? super uv<Float, bw>>, Object> {
    public int t;
    public final /* synthetic */ qi u;
    public final /* synthetic */ float v;
    public final /* synthetic */ wv<Float> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(qi qiVar, float f, wv<Float> wvVar, r02<? super ni> r02Var) {
        super(1, r02Var);
        this.u = qiVar;
        this.v = f;
        this.w = wvVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new ni(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super uv<Float, bw>> r02Var) {
        return ((ni) create(r02Var)).invokeSuspend(g2b.a);
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
        qt<Float, bw> qtVar = this.u.f;
        Float f = new Float(this.v);
        this.t = 1;
        Object objC = qt.c(qtVar, f, this.w, null, this, 12);
        v72 v72Var = v72.t;
        return objC == v72Var ? v72Var : objC;
    }
}
