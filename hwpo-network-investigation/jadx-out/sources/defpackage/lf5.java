package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lf5 implements v21 {
    public final v21 t;
    public final ba7 u;
    public final zoa v;
    public final long w;

    public lf5(v21 v21Var, oxa oxaVar, zoa zoaVar, long j) {
        this.t = v21Var;
        this.u = new ba7(oxaVar);
        this.w = j;
        this.v = zoaVar;
    }

    @Override // defpackage.v21
    public final void onFailure(o21 o21Var, IOException iOException) {
        jp8 jp8VarRequest = o21Var.request();
        ba7 ba7Var = this.u;
        if (jp8VarRequest != null) {
            f55 f55Var = jp8VarRequest.a;
            if (f55Var != null) {
                ba7Var.m(f55Var.j().toString());
            }
            String str = jp8VarRequest.b;
            if (str != null) {
                ba7Var.c(str);
            }
        }
        ba7Var.g(this.w);
        b4.a(this.v, ba7Var, ba7Var);
        this.t.onFailure(o21Var, iOException);
    }

    @Override // defpackage.v21
    public final void onResponse(o21 o21Var, qu8 qu8Var) {
        FirebasePerfOkHttpClient.a(qu8Var, this.u, this.w, this.v.a());
        this.t.onResponse(o21Var, qu8Var);
    }
}
