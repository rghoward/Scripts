package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sab extends zj0 {
    public final vg4 K = new vg4(new b());
    public final boolean L = true;
    public static final /* synthetic */ ho5<Object>[] M = {new ne8(sab.class, "binding", "getBinding()Lcom/hwpo_training_app/profile/databinding/DialogValueInputBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static sab a(String str, String str2, String str3, String str4, boolean z) {
            sab sabVar = new sab();
            sabVar.setArguments(uy0.c(new js7("arg_title", str), new js7("arg_value", str2), new js7("arg_value_hint", str3), new js7("arg_value_label", str4), new js7("arg_allow_empty_value", Boolean.valueOf(z))));
            return sabVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<sab, j03> {
        @Override // defpackage.oh4
        public final j03 invoke(sab sabVar) {
            sab sabVar2 = sabVar;
            sabVar2.getClass();
            return j03.bind(sabVar2.requireView());
        }
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_value_input, viewGroup);
    }

    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        final j03 j03VarU = u();
        j03VarU.a.post(new Runnable() { // from class: rab
            @Override // java.lang.Runnable
            public final void run() {
                sab.a aVar = sab.Companion;
                ConstraintLayout constraintLayout = j03VarU.a;
                constraintLayout.getClass();
                int dimension = (int) constraintLayout.getResources().getDimension(R.dimen.bottom_sheet_top_padding);
                sab sabVar = this;
                sabVar.p().K(sabVar.u().a.getHeight() + dimension);
            }
        });
        j03 j03VarU2 = u();
        Bundle bundleRequireArguments = requireArguments();
        bundleRequireArguments.getClass();
        j03VarU2.c.setTitle(bundleRequireArguments.getString("arg_title"));
        j03VarU2.e.setText(bundleRequireArguments.getString("arg_value_label"));
        TextInputEditText textInputEditText = j03VarU2.d;
        textInputEditText.setHint(bundleRequireArguments.getString("arg_value_hint"));
        textInputEditText.setText(bundleRequireArguments.getString("arg_value"));
        if (!bundleRequireArguments.getBoolean("arg_allow_empty_value")) {
            j03 j03VarU3 = u();
            j03VarU3.d.addTextChangedListener(new tab(j03VarU3));
        }
        final j03 j03VarU4 = u();
        qd3.a(j03VarU4.d, new int[]{6}, new oh4() { // from class: pab
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                ((Integer) obj).getClass();
                sab.a aVar = sab.Companion;
                this.v(j03VarU4);
                return g2b.a;
            }
        });
        xgb.a(j03VarU4.b, new uab(this, j03VarU4, null));
        j03VarU4.c.setNavigationOnClickListener(new View.OnClickListener() { // from class: qab
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                sab.a aVar = sab.Companion;
                this.t.i();
            }
        });
    }

    @Override // defpackage.zj0
    public final boolean r() {
        return this.L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j03 u() {
        T tA = this.K.a(this, M[0]);
        tA.getClass();
        return (j03) tA;
    }

    public final void v(j03 j03Var) {
        Editable text = j03Var.d.getText();
        getParentFragmentManager().e0(uy0.c(new js7("arg_value", text != null ? text.toString() : null)), "RESULT_VALUE_INPUT_DIALOG");
        i();
    }
}
