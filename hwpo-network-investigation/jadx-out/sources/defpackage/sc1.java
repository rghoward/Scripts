package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.g;
import com.google.android.material.bottomsheet.b;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sc1 extends zj0 {
    public oh4<? super h08, g2b> K = new qc1();
    public final vg4 L = new vg4(new c());
    public static final /* synthetic */ ho5<Object>[] M = {new ne8(sc1.class, "binding", "getBinding()Lcom/hwpo_training_app/sessions/databinding/DialogChoosePlanOptionsBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.ChoosePlanOptionsBottomSheetDialog$onViewCreated$1", f = "ChoosePlanOptionsBottomSheetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public b(r02<? super b> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return sc1.this.new b(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            sc1.this.i();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<sc1, jz2> {
        @Override // defpackage.oh4
        public final jz2 invoke(sc1 sc1Var) {
            sc1 sc1Var2 = sc1Var;
            sc1Var2.getClass();
            return jz2.bind(sc1Var2.requireView());
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Iterable<h08> parcelableArrayList;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments == null) {
            parcelableArrayList = hf3.t;
        } else {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("com.hwpo_training_app.client.ui.sessions.details.ChoosePlanOptionsBottomSheetDialog.OPTIONS_ARG_KEY", h08.class) : arguments.getParcelableArrayList("com.hwpo_training_app.client.ui.sessions.details.ChoosePlanOptionsBottomSheetDialog.OPTIONS_ARG_KEY");
            if (parcelableArrayList == null) {
                parcelableArrayList = hf3.t;
            }
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_choose_plan_options, viewGroup);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate.findViewById(R.id.optionsList);
        if (linearLayoutCompat != null) {
            int dimension = (int) viewInflate.getResources().getDimension(R.dimen.plan_option_item_height);
            for (h08 h08Var : parcelableArrayList) {
                TextView textView = new TextView(linearLayoutCompat.getContext(), null, 0, R.style.PlanOptionItem);
                textView.setText(h08Var.u);
                xgb.a(textView, new tc1(this, h08Var, null));
                linearLayoutCompat.addView(textView);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    ac4.c("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams.height = dimension;
                textView.setLayoutParams(layoutParams);
            }
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        viewInflate.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        final int measuredHeight = viewInflate.getMeasuredHeight();
        Dialog dialog = this.E;
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: rc1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    sc1.a aVar = sc1.Companion;
                    dialogInterface.getClass();
                    b bVar = (b) dialogInterface;
                    sc1 sc1Var = this.a;
                    sc1Var.p().d0 = true;
                    g gVarRequireActivity = sc1Var.requireActivity();
                    gVarRequireActivity.getClass();
                    int iA = m23.a(gVarRequireActivity);
                    if (measuredHeight <= iA) {
                        return;
                    }
                    View viewFindViewById = bVar.findViewById(R.id.design_bottom_sheet);
                    if (viewFindViewById == null) {
                        z90.a("Required value was null.");
                        return;
                    }
                    FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = iA;
                    }
                    frameLayout.setLayoutParams(layoutParams2);
                }
            });
        }
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        T tA = this.L.a(this, M[0]);
        tA.getClass();
        xgb.a(((jz2) tA).b, new b(null));
    }
}
