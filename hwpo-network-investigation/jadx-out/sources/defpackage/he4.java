package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.benchamrks.BenchmarksTextSectionLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class he4 implements wfb {
    public final RelativeLayout a;
    public final BenchmarksTextSectionLayout b;
    public final SimpleProgressBar c;
    public final MaterialButton d;
    public final MaterialToolbar e;

    public he4(RelativeLayout relativeLayout, BenchmarksTextSectionLayout benchmarksTextSectionLayout, SimpleProgressBar simpleProgressBar, MaterialButton materialButton, MaterialToolbar materialToolbar) {
        this.a = relativeLayout;
        this.b = benchmarksTextSectionLayout;
        this.c = simpleProgressBar;
        this.d = materialButton;
        this.e = materialToolbar;
    }

    public static he4 bind(View view) {
        int i = R.id.benchmarksTextSection;
        BenchmarksTextSectionLayout benchmarksTextSectionLayout = (BenchmarksTextSectionLayout) nt3.b(R.id.benchmarksTextSection, view);
        if (benchmarksTextSectionLayout != null) {
            i = R.id.buttonBackground;
            if (((FrameLayout) nt3.b(R.id.buttonBackground, view)) != null) {
                i = R.id.progress;
                SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                if (simpleProgressBar != null) {
                    i = R.id.saveBenchmarksBtn;
                    MaterialButton materialButton = (MaterialButton) nt3.b(R.id.saveBenchmarksBtn, view);
                    if (materialButton != null) {
                        i = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                        if (materialToolbar != null) {
                            return new he4((RelativeLayout) view, benchmarksTextSectionLayout, simpleProgressBar, materialButton, materialToolbar);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static he4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_benchmarks, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static he4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
