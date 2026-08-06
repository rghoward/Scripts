package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ff4 implements wfb {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final MaterialButton c;
    public final MaterialButton d;
    public final NestedScrollView e;
    public final SimpleProgressBar f;
    public final MaterialToolbar g;

    public ff4(ConstraintLayout constraintLayout, RecyclerView recyclerView, MaterialButton materialButton, MaterialButton materialButton2, NestedScrollView nestedScrollView, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = materialButton;
        this.d = materialButton2;
        this.e = nestedScrollView;
        this.f = simpleProgressBar;
        this.g = materialToolbar;
    }

    public static ff4 bind(View view) {
        int i = R.id.benchmarks_recycler;
        RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.benchmarks_recycler, view);
        if (recyclerView != null) {
            i = R.id.bottomContainer;
            if (((FrameLayout) nt3.b(R.id.bottomContainer, view)) != null) {
                i = R.id.btn_back;
                MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btn_back, view);
                if (materialButton != null) {
                    i = R.id.btn_next;
                    MaterialButton materialButton2 = (MaterialButton) nt3.b(R.id.btn_next, view);
                    if (materialButton2 != null) {
                        i = R.id.content_scroll_container;
                        NestedScrollView nestedScrollView = (NestedScrollView) nt3.b(R.id.content_scroll_container, view);
                        if (nestedScrollView != null) {
                            i = R.id.progress;
                            SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                            if (simpleProgressBar != null) {
                                i = R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                if (materialToolbar != null) {
                                    return new ff4((ConstraintLayout) view, recyclerView, materialButton, materialButton2, nestedScrollView, simpleProgressBar, materialToolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ff4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_onboarding_settings_second_page, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ff4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
