package defpackage;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yy3 extends l55 {
    public final vg4 K;
    public static final /* synthetic */ ho5<Object>[] L = {new ne8(yy3.class, "binding", "getBinding()Lcom/hwpo_training_app/core/databinding/DialogVetricalConfirmBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            yy3 yy3Var = (yy3) this.receiver;
            a aVar = yy3.Companion;
            yy3Var.q();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            yy3 yy3Var = (yy3) this.receiver;
            a aVar = yy3.Companion;
            yy3Var.p();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<yy3, k03> {
        @Override // defpackage.oh4
        public final k03 invoke(yy3 yy3Var) {
            yy3 yy3Var2 = yy3Var;
            yy3Var2.getClass();
            return k03.bind(yy3Var2.requireView());
        }
    }

    public yy3() {
        super(R.layout.dialog_vetrical_confirm);
        this.K = new vg4(new d());
    }

    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        view.getClass();
        Resources resources = getResources();
        resources.getClass();
        Dialog dialog = this.E;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        String string = getResources().getString(R.string.are_you_sure);
        String string2 = getResources().getString(R.string.file_uploading_in_process);
        String string3 = getResources().getString(R.string.stay_on_the_page);
        String string4 = getResources().getString(R.string.leave_the_page);
        string4.getClass();
        pw1.a(resources, window, new l55.b(string, string2, string3, string4, Integer.valueOf(requireContext().getColor(R.color.alertErrorText))), s().g, s().c, s().f, s().b, new b(0, this, yy3.class, "setPositiveResult", "setPositiveResult()V", 0), new c(0, this, yy3.class, "setNegativeResult", "setNegativeResult()V", 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k03 s() {
        T tA = this.K.a(this, L[0]);
        tA.getClass();
        return (k03) tA;
    }
}
