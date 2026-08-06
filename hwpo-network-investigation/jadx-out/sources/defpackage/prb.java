package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.focus.FocusRingDrawable;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class prb extends RecyclerView.f<a> {
    public final rj6<?> d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends RecyclerView.e0 {
        public final TextView u;

        public a(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    public prb(rj6<?> rj6Var) {
        this.d = rj6Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int f() {
        return this.d.w.y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void j(RecyclerView.e0 e0Var, int i) {
        a aVar = (a) e0Var;
        rj6<?> rj6Var = this.d;
        int i2 = rj6Var.w.t.v + i;
        aVar.u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = aVar.u;
        Context context = textView.getContext();
        textView.setContentDescription(f6b.d().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        n21 n21Var = rj6Var.A;
        Calendar calendarD = f6b.d();
        g21 g21Var = calendarD.get(1) == i2 ? n21Var.f : n21Var.d;
        ArrayList arrayListT = rj6Var.v.t();
        int size = arrayListT.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListT.get(i3);
            i3++;
            calendarD.setTimeInMillis(((Long) obj).longValue());
            if (calendarD.get(1) == i2) {
                g21Var = n21Var.e;
            }
        }
        g21Var.b(textView);
        if (!(textView.getForeground() instanceof FocusRingDrawable)) {
            Context context2 = textView.getContext();
            Drawable foreground = textView.getForeground();
            ColorDrawable colorDrawable = FocusRingDrawable.I;
            if (bj6.c(context2.getTheme(), R.attr.focusRingsEnabled, false)) {
                foreground = new FocusRingDrawable(context2, foreground);
            }
            if (foreground instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) foreground;
                ll9 ll9Var = g21Var.f;
                FocusRingDrawable.b bVar = focusRingDrawable.H;
                bVar.t = ll9Var;
                bVar.p = g21Var.a.top;
                textView.setForeground(focusRingDrawable);
            }
        }
        textView.setSelected(g21Var == n21Var.e);
        textView.setOnClickListener(new orb(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.e0 l(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
