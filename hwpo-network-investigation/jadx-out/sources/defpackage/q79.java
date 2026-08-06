package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {606}, m = "invokeSuspend", v = 1)
public final class q79 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ n79 u;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q79(n79 n79Var, float f, float f2, r02<? super q79> r02Var) {
        super(2, r02Var);
        this.u = n79Var;
        this.v = f;
        this.w = f2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new q79(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((q79) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            z79 z79Var = this.u.g0;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.v)) << 32) | (((long) Float.floatToRawIntBits(this.w)) & 4294967295L);
            this.t = 1;
            Object objA = d79.a(z79Var, jFloatToRawIntBits, this);
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
        return g2b.a;
    }
}
