package defpackage;

import io.ably.lib.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {Log.NONE}, m = "invokeSuspend", v = 1)
public final class q11 extends p6a implements ei4<i17<Object>, i17<Object>, r02<? super i17<Object>>, Object> {
    public int t;
    public /* synthetic */ i17 u;
    public /* synthetic */ i17 v;

    @Override // defpackage.ei4
    public final Object invoke(i17<Object> i17Var, i17<Object> i17Var2, r02<? super i17<Object>> r02Var) {
        q11 q11Var = new q11(3, r02Var);
        q11Var.u = i17Var;
        q11Var.v = i17Var2;
        return q11Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i != 0) {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i17 i17Var = this.u;
            dv8.b(obj);
            return i17Var;
        }
        dv8.b(obj);
        i17 i17Var2 = this.u;
        i17 i17Var3 = this.v;
        this.u = i17Var3;
        this.t = 1;
        i17Var2.b.d.k(null);
        g2b g2bVar = g2b.a;
        v72 v72Var = v72.t;
        return g2bVar == v72Var ? v72Var : i17Var3;
    }
}
