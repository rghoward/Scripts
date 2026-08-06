package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.presentation.horizontal_calendar.DayItemView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sq5 implements wfb {
    public final DayItemView a;
    public final MaterialTextView b;
    public final MaterialTextView c;
    public final AppCompatImageView d;

    public sq5(DayItemView dayItemView, MaterialTextView materialTextView, MaterialTextView materialTextView2, AppCompatImageView appCompatImageView) {
        this.a = dayItemView;
        this.b = materialTextView;
        this.c = materialTextView2;
        this.d = appCompatImageView;
    }

    public static sq5 bind(View view) {
        int i = R.id.dateText;
        MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.dateText, view);
        if (materialTextView != null) {
            i = R.id.dayOfWeekText;
            MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.dayOfWeekText, view);
            if (materialTextView2 != null) {
                i = R.id.indicator;
                AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.indicator, view);
                if (appCompatImageView != null) {
                    return new sq5((DayItemView) view, materialTextView, materialTextView2, appCompatImageView);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static sq5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_day_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static sq5 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
