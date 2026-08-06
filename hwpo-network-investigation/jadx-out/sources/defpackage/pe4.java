package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pe4 implements wfb {
    public final RelativeLayout a;
    public final AppCompatImageButton b;
    public final MaterialButton c;
    public final RecyclerView d;
    public final RecyclerView e;
    public final LinearLayoutCompat f;
    public final AppCompatCheckBox g;
    public final AppCompatCheckBox h;
    public final TextInputEditText i;
    public final MaterialTextView j;
    public final SimpleProgressBar k;
    public final MaterialButton l;
    public final AppCompatCheckBox m;
    public final LinearLayoutCompat n;
    public final NestedScrollView o;
    public final MaterialToolbar p;
    public final AppCompatImageButton q;

    public pe4(RelativeLayout relativeLayout, AppCompatImageButton appCompatImageButton, MaterialButton materialButton, RecyclerView recyclerView, RecyclerView recyclerView2, LinearLayoutCompat linearLayoutCompat, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, TextInputEditText textInputEditText, MaterialTextView materialTextView, SimpleProgressBar simpleProgressBar, MaterialButton materialButton2, AppCompatCheckBox appCompatCheckBox3, LinearLayoutCompat linearLayoutCompat2, NestedScrollView nestedScrollView, MaterialToolbar materialToolbar, AppCompatImageButton appCompatImageButton2) {
        this.a = relativeLayout;
        this.b = appCompatImageButton;
        this.c = materialButton;
        this.d = recyclerView;
        this.e = recyclerView2;
        this.f = linearLayoutCompat;
        this.g = appCompatCheckBox;
        this.h = appCompatCheckBox2;
        this.i = textInputEditText;
        this.j = materialTextView;
        this.k = simpleProgressBar;
        this.l = materialButton2;
        this.m = appCompatCheckBox3;
        this.n = linearLayoutCompat2;
        this.o = nestedScrollView;
        this.p = materialToolbar;
        this.q = appCompatImageButton2;
    }

    public static pe4 bind(View view) {
        int i = R.id.actionBtn;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) nt3.b(R.id.actionBtn, view);
        if (appCompatImageButton != null) {
            i = R.id.attachBtn;
            MaterialButton materialButton = (MaterialButton) nt3.b(R.id.attachBtn, view);
            if (materialButton != null) {
                i = R.id.attachmentsList;
                RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.attachmentsList, view);
                if (recyclerView != null) {
                    i = R.id.buttonBackground;
                    if (((FrameLayout) nt3.b(R.id.buttonBackground, view)) != null) {
                        i = R.id.fileAttachmentsList;
                        RecyclerView recyclerView2 = (RecyclerView) nt3.b(R.id.fileAttachmentsList, view);
                        if (recyclerView2 != null) {
                            i = R.id.isScaledLayout;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) nt3.b(R.id.isScaledLayout, view);
                            if (linearLayoutCompat != null) {
                                i = R.id.linkMediaCheckBox;
                                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) nt3.b(R.id.linkMediaCheckBox, view);
                                if (appCompatCheckBox != null) {
                                    i = R.id.linkNotesCheckBox;
                                    AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) nt3.b(R.id.linkNotesCheckBox, view);
                                    if (appCompatCheckBox2 != null) {
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
                                                        i = R.id.savePerformanceBtn;
                                                        MaterialButton materialButton2 = (MaterialButton) nt3.b(R.id.savePerformanceBtn, view);
                                                        if (materialButton2 != null) {
                                                            i = R.id.scaledCheckBox;
                                                            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) nt3.b(R.id.scaledCheckBox, view);
                                                            if (appCompatCheckBox3 != null) {
                                                                i = R.id.scoreDataLayout;
                                                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) nt3.b(R.id.scoreDataLayout, view);
                                                                if (linearLayoutCompat2 != null) {
                                                                    i = R.id.scrollView;
                                                                    NestedScrollView nestedScrollView = (NestedScrollView) nt3.b(R.id.scrollView, view);
                                                                    if (nestedScrollView != null) {
                                                                        i = R.id.toolbar;
                                                                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                                        if (materialToolbar != null) {
                                                                            i = R.id.tooltipButton;
                                                                            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) nt3.b(R.id.tooltipButton, view);
                                                                            if (appCompatImageButton2 != null) {
                                                                                return new pe4((RelativeLayout) view, appCompatImageButton, materialButton, recyclerView, recyclerView2, linearLayoutCompat, appCompatCheckBox, appCompatCheckBox2, textInputEditText, materialTextView, simpleProgressBar, materialButton2, appCompatCheckBox3, linearLayoutCompat2, nestedScrollView, materialToolbar, appCompatImageButton2);
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
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static pe4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_edit_performance, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static pe4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
