package defpackage;

import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ni9 implements oh4<vz7, g2b> {
    public final /* synthetic */ uf4 t;
    public final /* synthetic */ hi9 u;

    public ni9(uf4 uf4Var, hi9 hi9Var) {
        this.t = uf4Var;
        this.u = hi9Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(vz7 vz7Var) {
        PlaceHolder placeHolder = this.t.c;
        hi9.a aVar = hi9.Companion;
        placeHolder.g(vz7Var, new li9(0, this.u.q(), lj9.class, "getProgramDetails", "getProgramDetails()Lkotlinx/coroutines/Job;", 8));
        return g2b.a;
    }
}
