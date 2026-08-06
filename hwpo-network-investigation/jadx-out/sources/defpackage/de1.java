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
public final class de1 extends e {
    public static final /* synthetic */ ho5<Object>[] M = {new ne8(de1.class, "binding", "getBinding()Lcom/hwpo_training_app/edit_performance/databinding/DialogPerformanceBinding;", 0)};
    public mh4<g2b> J;
    public final vg4 K;
    public boolean L;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements oh4<de1, b03> {
        @Override // defpackage.oh4
        public final b03 invoke(de1 de1Var) {
            de1 de1Var2 = de1Var;
            de1Var2.getClass();
            return b03.bind(de1Var2.requireView());
        }
    }

    public de1() {
        super(R.layout.dialog_performance);
        this.J = new ae1();
        this.K = new vg4(new a());
    }

    @Override // androidx.fragment.app.e
    public final void i() {
        if (this.L) {
            this.L = false;
            k(false, false);
        }
    }

    @Override // androidx.fragment.app.e
    public final void o(l lVar, String str) {
        lVar.getClass();
        if (this.L) {
            return;
        }
        this.L = true;
        super.o(lVar, str);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (this.L) {
            this.L = false;
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
        ho5<?>[] ho5VarArr = M;
        ho5<?> ho5Var = ho5VarArr[0];
        vg4 vg4Var = this.K;
        T tA = vg4Var.a(this, ho5Var);
        tA.getClass();
        xgb.a(((b03) tA).b, new be1(this, null));
        T tA2 = vg4Var.a(this, ho5VarArr[0]);
        tA2.getClass();
        xgb.a(((b03) tA2).c, new ce1(this, null));
    }
}
