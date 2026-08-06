package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.settings.presentation.view.AccountSettingsView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gz2 implements wfb {
    public final ConstraintLayout a;
    public final AccountSettingsView b;
    public final MaterialButton c;
    public final SimpleProgressBar d;
    public final MaterialToolbar e;

    public gz2(ConstraintLayout constraintLayout, AccountSettingsView accountSettingsView, MaterialButton materialButton, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = accountSettingsView;
        this.c = materialButton;
        this.d = simpleProgressBar;
        this.e = materialToolbar;
    }

    public static gz2 bind(View view) {
        int i = R.id.account_settings_view;
        AccountSettingsView accountSettingsView = (AccountSettingsView) nt3.b(R.id.account_settings_view, view);
        if (accountSettingsView != null) {
            i = R.id.bottomContainer;
            if (((FrameLayout) nt3.b(R.id.bottomContainer, view)) != null) {
                i = R.id.btn_save;
                MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btn_save, view);
                if (materialButton != null) {
                    i = R.id.progress;
                    SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                    if (simpleProgressBar != null) {
                        i = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                        if (materialToolbar != null) {
                            return new gz2((ConstraintLayout) view, accountSettingsView, materialButton, simpleProgressBar, materialToolbar);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static gz2 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_account_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static gz2 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
