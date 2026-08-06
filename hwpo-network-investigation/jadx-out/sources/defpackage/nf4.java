package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class nf4 implements wfb {
    public final ConstraintLayout a;
    public final SimpleProgressBar b;
    public final RecyclerView c;
    public final MaterialToolbar d;

    public nf4(ConstraintLayout constraintLayout, SimpleProgressBar simpleProgressBar, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = simpleProgressBar;
        this.c = recyclerView;
        this.d = materialToolbar;
    }

    public static nf4 bind(View view) {
        int i = R.id.end;
        if (((Guideline) nt3.b(R.id.end, view)) != null) {
            i = R.id.progress;
            SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
            if (simpleProgressBar != null) {
                i = R.id.reportReasonsList;
                RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.reportReasonsList, view);
                if (recyclerView != null) {
                    i = R.id.start;
                    if (((Guideline) nt3.b(R.id.start, view)) != null) {
                        i = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                        if (materialToolbar != null) {
                            i = R.id.whyAreYouReportingDescription;
                            if (((MaterialTextView) nt3.b(R.id.whyAreYouReportingDescription, view)) != null) {
                                i = R.id.whyAreYouReportingText;
                                if (((MaterialTextView) nt3.b(R.id.whyAreYouReportingText, view)) != null) {
                                    return new nf4((ConstraintLayout) view, simpleProgressBar, recyclerView, materialToolbar);
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

    public static nf4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_report_reasons, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static nf4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
