package defpackage;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.client.onboarding_settings.benchmark_input.presentation.RequiredBenchmarkInputDialog$initListeners$1$1", f = "RequiredBenchmarkInputDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fr8 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ er8 t;
    public final /* synthetic */ g03 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr8(er8 er8Var, g03 g03Var, r02<? super fr8> r02Var) {
        super(3, r02Var);
        this.t = er8Var;
        this.u = g03Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new fr8(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        dv8.b(obj);
        er8.a aVar = er8.Companion;
        jr8 jr8VarW = this.t.w();
        HashMap<Integer, String> benchmarksText = this.u.b.getBenchmarksText();
        benchmarksText.getClass();
        vn0 vn0Var = jr8VarW.b().b;
        if (vn0Var != null && (str = benchmarksText.get(Integer.valueOf(jr8VarW.B))) != null) {
            jr8VarW.e(br8.c.a);
            oy0.d(rhb.b(jr8VarW), null, null, new nr8(vn0Var, str, jr8VarW, null), 3);
        }
        return g2b.a;
    }
}
