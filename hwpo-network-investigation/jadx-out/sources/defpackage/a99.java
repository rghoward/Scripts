package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {465}, m = "invokeSuspend", v = 1)
public final class a99 extends p6a implements oh4<r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ w89<Object> u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ tva<Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a99(r02 r02Var, w89 w89Var, tva tvaVar, Object obj) {
        super(1, r02Var);
        this.u = w89Var;
        this.v = obj;
        this.w = tvaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        Object obj = this.v;
        return new a99(r02Var, this.u, this.w, obj);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((a99) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        float f;
        int i = this.t;
        tva<Object> tvaVar = this.w;
        if (i == 0) {
            dv8.b(obj);
            bw bwVar = w89.s;
            w89<Object> w89Var = this.u;
            w89Var.z();
            dt7 dt7Var = w89Var.b;
            w89Var.m = Long.MIN_VALUE;
            w89Var.D(0.0f);
            Object value = w89Var.c.getValue();
            Object obj2 = this.v;
            if (obj2.equals(value)) {
                f = -4.0f;
            } else {
                f = obj2.equals(dt7Var.getValue()) ? -5.0f : -3.0f;
            }
            tvaVar.p(obj2);
            tvaVar.n(0L);
            dt7Var.setValue(obj2);
            w89Var.D(0.0f);
            w89Var.f(obj2);
            tvaVar.j(f);
            if (f == -3.0f) {
                this.t = 1;
                Object objX = w89.x(w89Var, this);
                v72 v72Var = v72.t;
                if (objX == v72Var) {
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
        tvaVar.i();
        return g2b.a;
    }
}
