package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.domain.use_case.UncompletePerformanceUseCase", f = "UncompletePerformanceUseCase.kt", l = {h4c.e, 19}, m = "executeOnBackground", v = 2)
public final class u1b extends u02 {
    public Iterator t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ t1b w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1b(t1b t1bVar, u02 u02Var) {
        super(u02Var);
        this.w = t1bVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
