package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.benchamrks.BenchmarksTextSectionLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qe4 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final RecyclerView c;
    public final BenchmarksTextSectionLayout d;
    public final MaterialButton e;
    public final RelativeLayout f;
    public final RecyclerView g;
    public final TextInputEditText h;
    public final MaterialTextView i;
    public final SimpleProgressBar j;
    public final MaterialTextView k;
    public final MaterialToolbar l;

    public qe4(ConstraintLayout constraintLayout, MaterialButton materialButton, RecyclerView recyclerView, BenchmarksTextSectionLayout benchmarksTextSectionLayout, MaterialButton materialButton2, RelativeLayout relativeLayout, RecyclerView recyclerView2, TextInputEditText textInputEditText, MaterialTextView materialTextView, SimpleProgressBar simpleProgressBar, MaterialTextView materialTextView2, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = recyclerView;
        this.d = benchmarksTextSectionLayout;
        this.e = materialButton2;
        this.f = relativeLayout;
        this.g = recyclerView2;
        this.h = textInputEditText;
        this.i = materialTextView;
        this.j = simpleProgressBar;
        this.k = materialTextView2;
        this.l = materialToolbar;
    }

    public static qe4 bind(View view) {
        int i = R.id.attachBtn;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.attachBtn, view);
        if (materialButton != null) {
            i = R.id.attachmentsList;
            RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.attachmentsList, view);
            if (recyclerView != null) {
                i = R.id.benchmarksSection;
                BenchmarksTextSectionLayout benchmarksTextSectionLayout = (BenchmarksTextSectionLayout) nt3.b(R.id.benchmarksSection, view);
                if (benchmarksTextSectionLayout != null) {
                    i = R.id.btnSave;
                    MaterialButton materialButton2 = (MaterialButton) nt3.b(R.id.btnSave, view);
                    if (materialButton2 != null) {
                        i = R.id.dateLabel;
                        if (((MaterialTextView) nt3.b(R.id.dateLabel, view)) != null) {
                            i = R.id.dateSelection;
                            RelativeLayout relativeLayout = (RelativeLayout) nt3.b(R.id.dateSelection, view);
                            if (relativeLayout != null) {
                                i = R.id.fileAttachmentsList;
                                RecyclerView recyclerView2 = (RecyclerView) nt3.b(R.id.fileAttachmentsList, view);
                                if (recyclerView2 != null) {
                                    i = R.id.notesEditText;
                                    TextInputEditText textInputEditText = (TextInputEditText) nt3.b(R.id.notesEditText, view);
                                    if (textInputEditText != null) {
                                        i = R.id.notesSymbolsCountText;
                                        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.notesSymbolsCountText, view);
                                        if (materialTextView != null) {
                                            i = R.id.notesTextInputLayout;
                                            if (((TextInputLayout) nt3.b(R.id.notesTextInputLayout, view)) != null) {
                                                i = R.id.progress;
                                                SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                                if (simpleProgressBar != null) {
                                                    i = R.id.selectedDate;
                                                    MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.selectedDate, view);
                                                    if (materialTextView2 != null) {
                                                        i = R.id.toolbar;
                                                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                        if (materialToolbar != null) {
                                                            return new qe4((ConstraintLayout) view, materialButton, recyclerView, benchmarksTextSectionLayout, materialButton2, relativeLayout, recyclerView2, textInputEditText, materialTextView, simpleProgressBar, materialTextView2, materialToolbar);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static qe4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_enter_value, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static qe4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
