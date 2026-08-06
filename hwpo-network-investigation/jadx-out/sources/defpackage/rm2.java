package defpackage;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.hwpo_training_app.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rm2 extends BaseAdapter {
    public static final int w;
    public final Calendar t;
    public final int u;
    public final int v;

    static {
        w = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public rm2() {
        Calendar calendarE = f6b.e(null);
        this.t = calendarE;
        this.u = calendarE.getMaximum(7);
        this.v = calendarE.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.u;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.u;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.v;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.v;
        int i3 = this.u;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.t;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, w, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public rm2(int i) {
        Calendar calendarE = f6b.e(null);
        this.t = calendarE;
        this.u = calendarE.getMaximum(7);
        this.v = i;
    }
}
