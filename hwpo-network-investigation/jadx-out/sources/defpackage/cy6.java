package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cy6 extends BaseAdapter {
    public final by6 t;
    public final wk2<?> u;
    public Collection<Long> v;
    public n21 w;
    public final a21 x;
    public final am2 y;
    public static final int z = f6b.e(null).getMaximum(4);
    public static final int A = (f6b.e(null).getMaximum(7) + f6b.e(null).getMaximum(5)) - 1;

    public cy6(by6 by6Var, wk2<?> wk2Var, a21 a21Var, am2 am2Var) {
        this.t = by6Var;
        this.u = wk2Var;
        this.x = a21Var;
        this.y = am2Var;
        this.v = wk2Var.t();
    }

    public final int b(int i) {
        do {
            i++;
            if (i > g()) {
                return -1;
            }
        } while (!f(i));
        return i;
    }

    public final int c(int i) {
        do {
            i--;
            if (i < d()) {
                return -1;
            }
        } while (!f(i));
        return i;
    }

    public final int d() {
        int firstDayOfWeek = this.x.x;
        by6 by6Var = this.t;
        Calendar calendar = by6Var.t;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + by6Var.w : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < d() || i > g()) {
            return null;
        }
        int iD = (i - d()) + 1;
        Calendar calendarC = f6b.c(this.t.t);
        calendarC.set(5, iD);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final boolean f(int i) {
        Long item = getItem(i);
        return item != null && this.x.v.p(item.longValue());
    }

    public final int g() {
        return (d() + this.t.x) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return A;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.t.w;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        Context context = viewGroup.getContext();
        if (this.w == null) {
            this.w = new n21(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iD = i - d();
        if (iD >= 0) {
            by6 by6Var = this.t;
            if (iD >= by6Var.x) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i2 = -1;
            } else {
                i2 = iD + 1;
                textView.setTag(by6Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i2 = -1;
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        h(textView, item.longValue(), i2);
        return textView;
    }

    public final void h(TextView textView, long j, int i) {
        g21 g21Var;
        boolean z2;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z3 = f6b.d().getTimeInMillis() == j;
        wk2<?> wk2Var = this.u;
        ArrayList arrayListI = wk2Var.i();
        int size = arrayListI.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListI.get(i2);
            i2++;
            ((ks7) obj).getClass();
        }
        ArrayList arrayListI2 = wk2Var.i();
        int size2 = arrayListI2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayListI2.get(i3);
            i3++;
            ((ks7) obj2).getClass();
        }
        Calendar calendarD = f6b.d();
        Calendar calendarE = f6b.e(null);
        calendarE.setTimeInMillis(j);
        String str = calendarD.get(1) == calendarE.get(1) ? f6b.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : f6b.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (z3) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        textView.setContentDescription(str);
        if (this.x.v.p(j)) {
            textView.setEnabled(true);
            ArrayList arrayListT = wk2Var.t();
            int size3 = arrayListT.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size3) {
                    z2 = false;
                    break;
                }
                Object obj3 = arrayListT.get(i4);
                i4++;
                if (f6b.a(j) == f6b.a(((Long) obj3).longValue())) {
                    z2 = true;
                    break;
                }
            }
            textView.setSelected(z2);
            if (z2) {
                g21Var = this.w.b;
            } else {
                boolean z4 = f6b.d().getTimeInMillis() == j;
                n21 n21Var = this.w;
                g21Var = z4 ? n21Var.c : n21Var.a;
            }
        } else {
            textView.setEnabled(false);
            g21Var = this.w.g;
        }
        if (this.y == null || i == -1) {
            g21Var.b(textView);
            return;
        }
        int i5 = this.t.v;
        g21Var.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public final void i(MaterialCalendarGridView materialCalendarGridView, long j) {
        by6 by6VarG = by6.g(j);
        by6 by6Var = this.t;
        if (by6VarG.equals(by6Var)) {
            Calendar calendarC = f6b.c(by6Var.t);
            calendarC.setTimeInMillis(j);
            int i = calendarC.get(5);
            h((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.b().d() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }
}
