package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {323}, m = "invokeSuspend", v = 1)
public final class o63 extends p6a implements ci4<f63, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ y53.b.a v;
    public final /* synthetic */ p63 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o63(y53.b.a aVar, p63 p63Var, r02 r02Var) {
        super(2, r02Var);
        this.v = aVar;
        this.w = p63Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        o63 o63Var = new o63(this.v, this.w, r02Var);
        o63Var.u = obj;
        return o63Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(f63 f63Var, r02<? super g2b> r02Var) {
        return ((o63) create(f63Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            final f63 f63Var = (f63) this.u;
            final p63 p63Var = this.w;
            oh4<? super n53.b, ? extends g2b> oh4Var = new oh4() { // from class: n63
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    long jF = vf7.f(1.0f, ((n53.b) obj2).a);
                    fl7 fl7Var = p63Var.d0;
                    m63.a aVar = m63.a;
                    f63Var.a(Float.intBitsToFloat((int) (fl7Var == fl7.t ? jF & 4294967295L : jF >> 32)));
                    return g2b.a;
                }
            };
            this.t = 1;
            Object objInvoke = this.v.invoke(oh4Var, this);
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
