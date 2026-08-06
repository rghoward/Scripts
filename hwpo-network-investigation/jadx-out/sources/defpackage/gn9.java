package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.SheetState$animateTo$2", f = "SheetDefaults.kt", l = {245}, m = "invokeSuspend")
public final class gn9 extends p6a implements fi4<ej, g63<in9>, in9, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ ej u;
    public /* synthetic */ g63 v;
    public /* synthetic */ in9 w;
    public final /* synthetic */ hn9 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ a04<Float> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn9(hn9 hn9Var, float f, a04<Float> a04Var, r02<? super gn9> r02Var) {
        super(4, r02Var);
        this.x = hn9Var;
        this.y = f;
        this.z = a04Var;
    }

    @Override // defpackage.fi4
    public final Object invoke(ej ejVar, g63<in9> g63Var, in9 in9Var, r02<? super g2b> r02Var) {
        float f = this.y;
        a04<Float> a04Var = this.z;
        gn9 gn9Var = new gn9(this.x, f, a04Var, r02Var);
        gn9Var.u = ejVar;
        gn9Var.v = g63Var;
        gn9Var.w = in9Var;
        return gn9Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            ej ejVar = this.u;
            float fD = this.v.d(this.w);
            if (!Float.isNaN(fD)) {
                dl8 dl8Var = new dl8();
                hn9 hn9Var = this.x;
                float fH = Float.isNaN(hn9Var.d.j.h()) ? 0.0f : hn9Var.d.j.h();
                dl8Var.t = fH;
                ft5 ft5Var = new ft5(1, ejVar, dl8Var);
                this.u = null;
                this.v = null;
                this.t = 1;
                Object objA = o6a.a(fH, fD, this.y, this.z, ft5Var, this);
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
