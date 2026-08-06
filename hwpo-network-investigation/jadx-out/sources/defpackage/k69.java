package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend", v = 1)
public final class k69 extends p6a implements ci4<t69, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ float v;
    public final /* synthetic */ wv<Float> w;
    public final /* synthetic */ dl8 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k69(float f, wv<Float> wvVar, dl8 dl8Var, r02<? super k69> r02Var) {
        super(2, r02Var);
        this.v = f;
        this.w = wvVar;
        this.x = dl8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        k69 k69Var = new k69(this.v, this.w, this.x, r02Var);
        k69Var.u = obj;
        return k69Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t69 t69Var, r02<? super g2b> r02Var) {
        return ((k69) create(t69Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            final t69 t69Var = (t69) this.u;
            final dl8 dl8Var = this.x;
            ci4 ci4Var = new ci4() { // from class: j69
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).getClass();
                    dl8 dl8Var2 = dl8Var;
                    float f = dl8Var2.t;
                    dl8Var2.t = t69Var.f(fFloatValue - f) + f;
                    return g2b.a;
                }
            };
            this.t = 1;
            Object objC = o6a.c(0.0f, this.v, this.w, ci4Var, this, 4);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
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
