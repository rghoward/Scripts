package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yx7 extends zj0 {
    public mh4<g2b> K = new b56(2);
    public mh4<g2b> L = new oh(2);
    public final vg4 M = new vg4(new b());
    public static final /* synthetic */ ho5<Object>[] N = {new ne8(yx7.class, "binding", "getBinding()Lcom/hwpo_training_app/profile/databinding/DialogPickAvatarOptionsBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<yx7, c03> {
        @Override // defpackage.oh4
        public final c03 invoke(yx7 yx7Var) {
            yx7 yx7Var2 = yx7Var;
            yx7Var2.getClass();
            return c03.bind(yx7Var2.requireView());
        }
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_pick_avatar_options, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        T tA = this.M.a(this, N[0]);
        tA.getClass();
        c03 c03Var = (c03) tA;
        xgb.a(c03Var.d, new zx7(this, null));
        xgb.a(c03Var.c, new ay7(this, null));
        xgb.a(c03Var.b, new by7(this, null));
    }
}
