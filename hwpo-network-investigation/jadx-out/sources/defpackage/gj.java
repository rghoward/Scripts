package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {682}, m = "invokeSuspend")
public final class gj extends p6a implements fi4<ej, g63<Object>, Object, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ ej u;
    public /* synthetic */ g63 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ wj<Object> x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(wj<Object> wjVar, float f, r02<? super gj> r02Var) {
        super(4, r02Var);
        this.x = wjVar;
        this.y = f;
    }

    @Override // defpackage.fi4
    public final Object invoke(ej ejVar, g63<Object> g63Var, Object obj, r02<? super g2b> r02Var) {
        gj gjVar = new gj(this.x, this.y, r02Var);
        gjVar.u = ejVar;
        gjVar.v = g63Var;
        gjVar.w = obj;
        return gjVar.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            final ej ejVar = this.u;
            float fD = this.v.d(this.w);
            if (!Float.isNaN(fD)) {
                final dl8 dl8Var = new dl8();
                wj<Object> wjVar = this.x;
                float fH = Float.isNaN(wjVar.j.h()) ? 0.0f : wjVar.j.h();
                dl8Var.t = fH;
                wv<Float> wvVar = ((hn9) wjVar.c.u).c;
                ci4 ci4Var = new ci4() { // from class: fj
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        float fFloatValue = ((Float) obj2).floatValue();
                        ejVar.a(fFloatValue, ((Float) obj3).floatValue());
                        dl8Var.t = fFloatValue;
                        return g2b.a;
                    }
                };
                this.u = null;
                this.v = null;
                this.t = 1;
                Object objA = o6a.a(fH, fD, this.y, wvVar, ci4Var, this);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
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
