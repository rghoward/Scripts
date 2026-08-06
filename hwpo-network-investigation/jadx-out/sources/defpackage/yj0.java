package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedCallback;
import com.google.android.material.bottomsheet.b;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yj0 extends b {
    public yj0(final zj0 zj0Var, Context context) {
        super(context, 0);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.H = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, new OnBackInvokedCallback() { // from class: xj0
                public final void onBackInvoked() {
                    zj0 zj0Var2 = zj0Var;
                    Context contextRequireContext = zj0Var2.requireContext();
                    contextRequireContext.getClass();
                    Window window = this.getWindow();
                    View decorView = window != null ? window.getDecorView() : null;
                    Object systemService = contextRequireContext.getSystemService("input_method");
                    systemService.getClass();
                    if (((InputMethodManager) systemService).hideSoftInputFromWindow(decorView != null ? decorView.getWindowToken() : null, 0)) {
                        return;
                    }
                    mh4<g2b> mh4VarQ = zj0Var2.q();
                    if (mh4VarQ != null) {
                        mh4VarQ.invoke();
                        return;
                    }
                    Dialog dialog = zj0Var2.E;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
        }
    }

    @Override // com.google.android.material.bottomsheet.b, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            jmb.a(window, false);
        }
        final View viewFindViewById = findViewById(R.id.container);
        if (viewFindViewById != null) {
            viewFindViewById.setFitsSystemWindows(false);
            ee5.a(new gi4() { // from class: wj0
                @Override // defpackage.gi4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj).intValue();
                    int iIntValue2 = ((Integer) obj2).intValue();
                    ((Integer) obj3).getClass();
                    ((View) obj4).getClass();
                    int i = ((ec5) obj5).d;
                    if (iIntValue != 0) {
                        i = (iIntValue + i) - iIntValue2;
                    }
                    View childAt = ((ViewGroup) viewFindViewById.findViewById(R.id.design_bottom_sheet)).getChildAt(0);
                    childAt.getClass();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams == null) {
                        ac4.c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = i;
                    childAt.setLayoutParams(marginLayoutParams);
                    return g2b.a;
                }
            }, viewFindViewById);
        }
        View viewFindViewById2 = findViewById(R.id.coordinator);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setFitsSystemWindows(false);
        }
    }
}
