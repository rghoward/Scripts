package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.performance_view.PerformanceView;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ie4 implements wfb {
    public final ConstraintLayout a;
    public final ImageView b;
    public final PerformanceView c;
    public final PlaceHolder d;
    public final SimpleProgressBar e;
    public final MaterialToolbar f;

    public ie4(ConstraintLayout constraintLayout, ImageView imageView, PerformanceView performanceView, PlaceHolder placeHolder, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = performanceView;
        this.d = placeHolder;
        this.e = simpleProgressBar;
        this.f = materialToolbar;
    }

    public static ie4 bind(View view) {
        int i = R.id.buttonEditEntry;
        ImageView imageView = (ImageView) nt3.b(R.id.buttonEditEntry, view);
        if (imageView != null) {
            i = R.id.performanceView;
            PerformanceView performanceView = (PerformanceView) nt3.b(R.id.performanceView, view);
            if (performanceView != null) {
                i = R.id.placeholder;
                PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
                if (placeHolder != null) {
                    i = R.id.progress;
                    SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                    if (simpleProgressBar != null) {
                        i = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                        if (materialToolbar != null) {
                            return new ie4((ConstraintLayout) view, imageView, performanceView, placeHolder, simpleProgressBar, materialToolbar);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ie4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_challenge_entry_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ie4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
