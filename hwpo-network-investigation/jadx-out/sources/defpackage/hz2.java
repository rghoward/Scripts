package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import com.google.android.material.card.MaterialCardView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hz2 implements wfb {
    public final MaterialCardView a;
    public final CalendarView b;

    public hz2(MaterialCardView materialCardView, CalendarView calendarView) {
        this.a = materialCardView;
        this.b = calendarView;
    }

    public static hz2 bind(View view) {
        CalendarView calendarView = (CalendarView) nt3.b(R.id.calendarView, view);
        if (calendarView != null) {
            return new hz2((MaterialCardView) view, calendarView);
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.calendarView)));
        return null;
    }

    public static hz2 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_calendar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static hz2 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
