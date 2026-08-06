package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.g;
import androidx.fragment.app.l;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import com.google.android.material.bottomsheet.c;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zj0 extends c {
    public boolean J;

    @Override // com.google.android.material.bottomsheet.c, androidx.fragment.app.e
    public final void i() {
        if (this.J) {
            this.J = false;
            super.i();
        }
    }

    @Override // androidx.fragment.app.e
    public final int l() {
        return R.style.BottomSheetDialogTheme;
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.sz, androidx.fragment.app.e
    public final Dialog m() {
        yj0 yj0Var = new yj0(this, requireContext());
        if (r()) {
            yj0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: vj0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    dialogInterface.getClass();
                    View viewFindViewById = ((b) dialogInterface).findViewById(R.id.design_bottom_sheet);
                    if (viewFindViewById == null) {
                        z90.a("Required value was null.");
                        return;
                    }
                    FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    zj0 zj0Var = this.a;
                    g gVarRequireActivity = zj0Var.requireActivity();
                    gVarRequireActivity.getClass();
                    int iA = m23.a(gVarRequireActivity);
                    if (layoutParams != null) {
                        layoutParams.height = iA;
                    }
                    frameLayout.setLayoutParams(layoutParams);
                    zj0Var.p().L(3);
                }
            });
        }
        return yj0Var;
    }

    @Override // androidx.fragment.app.e
    public final void o(l lVar, String str) {
        lVar.getClass();
        if (this.J) {
            return;
        }
        this.J = true;
        super.o(lVar, str);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (this.J) {
            this.J = false;
        }
    }

    public final BottomSheetBehavior<FrameLayout> p() {
        Dialog dialog = this.E;
        dialog.getClass();
        b bVar = (b) dialog;
        if (bVar.z == null) {
            bVar.f();
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = bVar.z;
        bottomSheetBehavior.getClass();
        return bottomSheetBehavior;
    }

    public mh4<g2b> q() {
        return null;
    }

    public boolean r() {
        return false;
    }

    public final void s(l lVar) {
        o(lVar, getClass().getName());
    }

    public final void t(String str) {
        Window window;
        str.getClass();
        rh7 activity = getActivity();
        View decorView = null;
        zn9 zn9Var = activity instanceof zn9 ? (zn9) activity : null;
        if (zn9Var != null) {
            Dialog dialog = this.E;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            zn9Var.c(decorView, str);
        }
    }
}
