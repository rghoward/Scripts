package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xy7 extends zj0 {
    public static final /* synthetic */ ho5<Object>[] P = {new ne8(xy7.class, "binding", "getBinding()Lcom/hwpo_training_app/core/databinding/DialogPickMediaBinding;", 0)};
    public mh4<g2b> K = new py7();
    public mh4<g2b> L = new qy7();
    public mh4<g2b> M = new ry7();
    public mh4<g2b> N = new a66(1);
    public final vg4 O = new vg4(new a());

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements oh4<xy7, e03> {
        @Override // defpackage.oh4
        public final e03 invoke(xy7 xy7Var) {
            xy7 xy7Var2 = xy7Var;
            xy7Var2.getClass();
            return e03.bind(xy7Var2.requireView());
        }
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_pick_media, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        T tA = this.O.a(this, P[0]);
        tA.getClass();
        e03 e03Var = (e03) tA;
        xgb.a(e03Var.d, new sy7(this, null));
        xgb.a(e03Var.f, new ty7(this, null));
        xgb.a(e03Var.c, new uy7(this, null));
        xgb.a(e03Var.e, new vy7(this, null));
        xgb.a(e03Var.b, new wy7(this, null));
    }
}
