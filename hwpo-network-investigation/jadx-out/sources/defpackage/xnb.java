package defpackage;

import android.view.View;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {223}, m = "invokeSuspend", v = 1)
public final class xnb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ gk8 u;
    public final /* synthetic */ View v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnb(gk8 gk8Var, View view, r02<? super xnb> r02Var) {
        super(2, r02Var);
        this.u = gk8Var;
        this.v = view;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new xnb(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((xnb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        gk8 gk8Var = this.u;
        View view = this.v;
        try {
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objL = yk2.l(gk8Var.u, new hk8(2, null), this);
                Object obj2 = v72.t;
                if (objL != obj2) {
                    objL = g2b.a;
                }
                if (objL == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            if (dob.a(view) == gk8Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return g2b.a;
        } catch (Throwable th) {
            if (dob.a(view) == gk8Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            throw th;
        }
    }
}
