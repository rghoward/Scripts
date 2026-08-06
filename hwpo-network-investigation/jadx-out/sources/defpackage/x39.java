package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.e;
import androidx.fragment.app.l;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x39 extends e {
    public static final /* synthetic */ ho5<Object>[] L = {new ne8(x39.class, "binding", "getBinding()Lcom/hwpo_training_app/edit_performance/databinding/DialogScaledTooltipBinding;", 0)};
    public final vg4 J;
    public boolean K;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements oh4<x39, h03> {
        @Override // defpackage.oh4
        public final h03 invoke(x39 x39Var) {
            x39 x39Var2 = x39Var;
            x39Var2.getClass();
            return h03.bind(x39Var2.requireView());
        }
    }

    public x39() {
        super(R.layout.dialog_scaled_tooltip);
        this.J = new vg4(new a());
    }

    @Override // androidx.fragment.app.e
    public final void i() {
        if (this.K) {
            this.K = false;
            k(false, false);
        }
    }

    @Override // androidx.fragment.app.e
    public final void o(l lVar, String str) {
        lVar.getClass();
        if (this.K) {
            return;
        }
        this.K = true;
        super.o(lVar, str);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (this.K) {
            this.K = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Window window2;
        view.getClass();
        super.onViewCreated(view, bundle);
        Dialog dialog = this.E;
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = this.E;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setLayout((int) (((double) getResources().getDisplayMetrics().widthPixels) * 0.72d), -2);
        }
        T tA = this.J.a(this, L[0]);
        tA.getClass();
        xgb.a(((h03) tA).c, new w39(this, null));
    }
}
