package defpackage;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n55 extends l55 {
    public final vg4 K;
    public static final /* synthetic */ ho5<Object>[] L = {new ne8(n55.class, "binding", "getBinding()Lcom/hwpo_training_app/core/databinding/DialogVetricalConfirmBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            ((n55) this.receiver).q();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            ((n55) this.receiver).p();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements oh4<n55, k03> {
        @Override // defpackage.oh4
        public final k03 invoke(n55 n55Var) {
            n55 n55Var2 = n55Var;
            n55Var2.getClass();
            return k03.bind(n55Var2.requireView());
        }
    }

    public n55() {
        super(R.layout.dialog_vetrical_confirm);
        this.K = new vg4(new d());
    }

    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Parcelable parcelable;
        view.getClass();
        Resources resources = getResources();
        resources.getClass();
        Dialog dialog = this.E;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Bundle bundleRequireArguments = requireArguments();
        bundleRequireArguments.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundleRequireArguments.getParcelable("dialog_params", l55.b.class);
        } else {
            Parcelable parcelable2 = bundleRequireArguments.getParcelable("dialog_params");
            if (!(parcelable2 instanceof l55.b)) {
                parcelable2 = null;
            }
            parcelable = (l55.b) parcelable2;
        }
        if (parcelable != null) {
            pw1.a(resources, window, (l55.b) parcelable, s().g, s().c, s().f, s().b, new b(0, this, n55.class, "setPositiveResult", "setPositiveResult()V", 0), new c(0, this, n55.class, "setNegativeResult", "setNegativeResult()V", 0));
        } else {
            z90.a("Required value was null.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k03 s() {
        T tA = this.K.a(this, L[0]);
        tA.getClass();
        return (k03) tA;
    }
}
