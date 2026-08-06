package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1150}, m = "invokeSuspend", v = 1)
public final class g79 extends p6a implements ci4<k97, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ z79 v;
    public final /* synthetic */ long w;
    public final /* synthetic */ dl8 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g79(z79 z79Var, long j, dl8 dl8Var, r02<? super g79> r02Var) {
        super(2, r02Var);
        this.v = z79Var;
        this.w = j;
        this.x = dl8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        g79 g79Var = new g79(this.v, this.w, this.x, r02Var);
        g79Var.u = obj;
        return g79Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(k97 k97Var, r02<? super g2b> r02Var) {
        return ((g79) create(k97Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            final k97 k97Var = (k97) this.u;
            long j = this.w;
            final z79 z79Var = this.v;
            float fG = z79Var.g(j);
            final dl8 dl8Var = this.x;
            ci4 ci4Var = new ci4() { // from class: f79
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).getClass();
                    dl8 dl8Var2 = dl8Var;
                    float f = fFloatValue - dl8Var2.t;
                    z79 z79Var2 = z79Var;
                    dl8Var2.t += z79Var2.d(z79Var2.g(k97Var.a(z79Var2.h(z79Var2.d(f)))));
                    return g2b.a;
                }
            };
            this.t = 1;
            Object objC = o6a.c(0.0f, fG, null, ci4Var, this, 12);
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
