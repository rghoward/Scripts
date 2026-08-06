package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d03 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final RecyclerView c;
    public final SimpleProgressBar d;
    public final MaterialToolbar e;

    public d03(ConstraintLayout constraintLayout, MaterialButton materialButton, RecyclerView recyclerView, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = recyclerView;
        this.d = simpleProgressBar;
        this.e = materialToolbar;
    }

    public static d03 bind(View view) {
        int i = R.id.bottomContainer;
        if (((FrameLayout) nt3.b(R.id.bottomContainer, view)) != null) {
            i = R.id.btn_save;
            MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btn_save, view);
            if (materialButton != null) {
                i = R.id.countries_list;
                RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.countries_list, view);
                if (recyclerView != null) {
                    i = R.id.pick_country_label;
                    if (((MaterialTextView) nt3.b(R.id.pick_country_label, view)) != null) {
                        i = R.id.progress;
                        SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                        if (simpleProgressBar != null) {
                            i = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                            if (materialToolbar != null) {
                                return new d03((ConstraintLayout) view, materialButton, recyclerView, simpleProgressBar, materialToolbar);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static d03 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_pick_country, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static d03 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
