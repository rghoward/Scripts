package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class of4 implements wfb {
    public final ConstraintLayout a;
    public final MaterialButton b;
    public final Group c;
    public final MaterialTextView d;
    public final TextInputEditText e;
    public final TextInputLayout f;
    public final PlaceHolder g;
    public final SimpleProgressBar h;
    public final MaterialTextView i;
    public final MaterialToolbar j;
    public final MaterialTextView k;

    public of4(ConstraintLayout constraintLayout, MaterialButton materialButton, Group group, MaterialTextView materialTextView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, PlaceHolder placeHolder, SimpleProgressBar simpleProgressBar, MaterialTextView materialTextView2, MaterialToolbar materialToolbar, MaterialTextView materialTextView3) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = group;
        this.d = materialTextView;
        this.e = textInputEditText;
        this.f = textInputLayout;
        this.g = placeHolder;
        this.h = simpleProgressBar;
        this.i = materialTextView2;
        this.j = materialToolbar;
        this.k = materialTextView3;
    }

    public static of4 bind(View view) {
        int i = R.id.btn_save;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.btn_save, view);
        if (materialButton != null) {
            i = R.id.contentToHide;
            Group group = (Group) nt3.b(R.id.contentToHide, view);
            if (group != null) {
                i = R.id.dayBetweenCaption;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.dayBetweenCaption, view);
                if (materialTextView != null) {
                    i = R.id.dayCaption;
                    if (((MaterialTextView) nt3.b(R.id.dayCaption, view)) != null) {
                        i = R.id.dayEditText;
                        TextInputEditText textInputEditText = (TextInputEditText) nt3.b(R.id.dayEditText, view);
                        if (textInputEditText != null) {
                            i = R.id.dayTextInputLayout;
                            TextInputLayout textInputLayout = (TextInputLayout) nt3.b(R.id.dayTextInputLayout, view);
                            if (textInputLayout != null) {
                                i = R.id.end;
                                if (((Guideline) nt3.b(R.id.end, view)) != null) {
                                    i = R.id.placeholder;
                                    PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
                                    if (placeHolder != null) {
                                        i = R.id.progress;
                                        SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                                        if (simpleProgressBar != null) {
                                            i = R.id.start;
                                            if (((Guideline) nt3.b(R.id.start, view)) != null) {
                                                i = R.id.todayCaption;
                                                if (((MaterialTextView) nt3.b(R.id.todayCaption, view)) != null) {
                                                    i = R.id.todayValue;
                                                    MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.todayValue, view);
                                                    if (materialTextView2 != null) {
                                                        i = R.id.toolbar;
                                                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                                        if (materialToolbar != null) {
                                                            i = R.id.whatDayCaption;
                                                            MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.whatDayCaption, view);
                                                            if (materialTextView3 != null) {
                                                                return new of4((ConstraintLayout) view, materialButton, group, materialTextView, textInputEditText, textInputLayout, placeHolder, simpleProgressBar, materialTextView2, materialToolbar, materialTextView3);
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

    public static of4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_reschedule, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static of4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
