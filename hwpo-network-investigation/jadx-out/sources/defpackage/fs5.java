package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.performance_view.PerformanceView;
import net.cachapa.expandablelayout.ExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fs5 implements wfb {
    public final View a;
    public final MaterialButton b;
    public final AppCompatImageButton c;
    public final PerformanceView d;
    public final AppCompatImageView e;
    public final LinearLayoutCompat f;
    public final ExpandableLayout g;

    public fs5(View view, MaterialButton materialButton, AppCompatImageButton appCompatImageButton, PerformanceView performanceView, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, ExpandableLayout expandableLayout) {
        this.a = view;
        this.b = materialButton;
        this.c = appCompatImageButton;
        this.d = performanceView;
        this.e = appCompatImageView;
        this.f = linearLayoutCompat;
        this.g = expandableLayout;
    }

    public static fs5 bind(View view) {
        int i = R.id.editButton;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.editButton, view);
        if (materialButton != null) {
            i = R.id.isSessionCompletedButton;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) nt3.b(R.id.isSessionCompletedButton, view);
            if (appCompatImageButton != null) {
                i = R.id.performance;
                PerformanceView performanceView = (PerformanceView) nt3.b(R.id.performance, view);
                if (performanceView != null) {
                    i = R.id.performanceArrowImg;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.performanceArrowImg, view);
                    if (appCompatImageView != null) {
                        i = R.id.performanceHeader;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) nt3.b(R.id.performanceHeader, view);
                        if (linearLayoutCompat != null) {
                            i = R.id.performanceLayout;
                            ExpandableLayout expandableLayout = (ExpandableLayout) nt3.b(R.id.performanceLayout, view);
                            if (expandableLayout != null) {
                                return new fs5(view, materialButton, appCompatImageButton, performanceView, appCompatImageView, linearLayoutCompat, expandableLayout);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static fs5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.layout_performance_expandable, viewGroup);
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
