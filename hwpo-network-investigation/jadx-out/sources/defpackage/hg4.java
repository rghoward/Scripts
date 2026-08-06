package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hg4 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final MaterialToolbar c;

    public hg4(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = materialToolbar;
    }

    public static hg4 bind(View view) {
        int i = R.id.bottomContainer;
        if (((FrameLayout) nt3.b(R.id.bottomContainer, view)) != null) {
            i = R.id.btnDone;
            MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btnDone, view);
            if (materialButton != null) {
                i = R.id.checkmark;
                if (((ImageView) nt3.b(R.id.checkmark, view)) != null) {
                    i = R.id.end;
                    if (((Guideline) nt3.b(R.id.end, view)) != null) {
                        i = R.id.start;
                        if (((Guideline) nt3.b(R.id.start, view)) != null) {
                            i = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                            if (materialToolbar != null) {
                                i = R.id.whyAreYouReportingDescription;
                                if (((MaterialTextView) nt3.b(R.id.whyAreYouReportingDescription, view)) != null) {
                                    i = R.id.whyAreYouReportingText;
                                    if (((MaterialTextView) nt3.b(R.id.whyAreYouReportingText, view)) != null) {
                                        return new hg4((ConstraintLayout) view, materialButton, materialToolbar);
                                    }
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

    public static hg4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_thank_you, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static hg4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
