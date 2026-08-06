package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wj3 extends zj0 {
    public static final /* synthetic */ ho5<Object>[] N = {new ne8(wj3.class, "binding", "getBinding()Lcom/hwpo_training_app/tracking/databinding/DialogEntryActionsBinding;", 0)};
    public final vg4 K = new vg4(new a());
    public mh4<g2b> L = new rj3();
    public mh4<g2b> M = new sj3(0);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements oh4<wj3, mz2> {
        @Override // defpackage.oh4
        public final mz2 invoke(wj3 wj3Var) {
            wj3 wj3Var2 = wj3Var;
            wj3Var2.getClass();
            return mz2.bind(wj3Var2.requireView());
        }
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_entry_actions, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        T tA = this.K.a(this, N[0]);
        tA.getClass();
        mz2 mz2Var = (mz2) tA;
        xgb.a(mz2Var.c, new tj3(this, null));
        xgb.a(mz2Var.b, new uj3(this, null));
        xgb.a(mz2Var.d, new vj3(this, null));
    }
}
