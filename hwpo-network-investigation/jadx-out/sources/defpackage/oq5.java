package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import net.cachapa.expandablelayout.ExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oq5 implements wfb {
    public final View a;
    public final LinearLayoutCompat b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final LinearLayoutCompat e;
    public final ExpandableLayout f;
    public final MaterialButton g;

    public oq5(View view, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayoutCompat linearLayoutCompat2, ExpandableLayout expandableLayout, MaterialButton materialButton) {
        this.a = view;
        this.b = linearLayoutCompat;
        this.c = appCompatImageView;
        this.d = appCompatImageView2;
        this.e = linearLayoutCompat2;
        this.f = expandableLayout;
        this.g = materialButton;
    }

    public static oq5 bind(View view) {
        int i = R.id.benchmarks;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) nt3.b(R.id.benchmarks, view);
        if (linearLayoutCompat != null) {
            i = R.id.benchmarksArrowImg;
            AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.benchmarksArrowImg, view);
            if (appCompatImageView != null) {
                i = R.id.benchmarksFulfillingStateImage;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) nt3.b(R.id.benchmarksFulfillingStateImage, view);
                if (appCompatImageView2 != null) {
                    i = R.id.benchmarksHeader;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) nt3.b(R.id.benchmarksHeader, view);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.benchmarksLayout;
                        ExpandableLayout expandableLayout = (ExpandableLayout) nt3.b(R.id.benchmarksLayout, view);
                        if (expandableLayout != null) {
                            i = R.id.editBenchmarksButton;
                            MaterialButton materialButton = (MaterialButton) nt3.b(R.id.editBenchmarksButton, view);
                            if (materialButton != null) {
                                return new oq5(view, linearLayoutCompat, appCompatImageView, appCompatImageView2, linearLayoutCompat2, expandableLayout, materialButton);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static oq5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.layout_benchmarks_expandable, viewGroup);
            return bind(viewGroup);
        }
        ac4.c("parent");
        return null;
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }
}
