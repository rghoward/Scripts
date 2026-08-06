package com.hwpo_training_app.core.presentation.horizontal_calendar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.presentation.horizontal_calendar.WeeksCalendarView;
import defpackage.c10;
import defpackage.g2b;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.pt2;
import defpackage.qq2;
import defpackage.rlb;
import defpackage.tlb;
import defpackage.wk6;
import defpackage.wlb;
import defpackage.xj5;
import defpackage.xl2;
import j$.time.LocalDate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class WeeksCalendarView extends RecyclerView {
    public static final /* synthetic */ int i1 = 0;
    public oh4<? super LocalDate, g2b> f1;
    public wlb g1;
    public final o7a h1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeeksCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.h1 = new o7a(new c10(2, this));
        setItemAnimator(null);
        setOverScrollMode(2);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        getSnapHelper().a(this);
    }

    private final y getSnapHelper() {
        return (y) this.h1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tlb getWeeksAdapter() {
        RecyclerView.f adapter = getAdapter();
        if (adapter instanceof tlb) {
            return (tlb) adapter;
        }
        return null;
    }

    public static void s0(WeeksCalendarView weeksCalendarView, List list) {
        tlb weeksAdapter = weeksCalendarView.getWeeksAdapter();
        if (weeksAdapter != null) {
            list.getClass();
            weeksAdapter.e = list;
        }
        tlb weeksAdapter2 = weeksCalendarView.getWeeksAdapter();
        if (weeksAdapter2 != null) {
            weeksAdapter2.a.d(0, list.size());
        }
        weeksCalendarView.j0(1);
    }

    public static void t0(WeeksCalendarView weeksCalendarView, List list) {
        tlb weeksAdapter = weeksCalendarView.getWeeksAdapter();
        if (weeksAdapter != null) {
            list.getClass();
            weeksAdapter.e = list;
        }
        tlb weeksAdapter2 = weeksCalendarView.getWeeksAdapter();
        if (weeksAdapter2 != null) {
            weeksAdapter2.a.d(1, 1);
        }
    }

    public static void u0(WeeksCalendarView weeksCalendarView, List list) {
        tlb weeksAdapter = weeksCalendarView.getWeeksAdapter();
        if (weeksAdapter != null) {
            list.getClass();
            weeksAdapter.e = list;
        }
        tlb weeksAdapter2 = weeksCalendarView.getWeeksAdapter();
        if (weeksAdapter2 != null) {
            weeksAdapter2.a.e(0, list.size());
        }
        weeksCalendarView.j0(1);
    }

    public final oh4<LocalDate, g2b> getOnDateChanged() {
        return this.f1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        float dimension;
        float dimension2;
        xl2 xl2Var = xl2.a;
        Resources resources = getResources();
        resources.getClass();
        int size = View.MeasureSpec.getSize(i);
        xl2Var.getClass();
        Float f = xl2.b;
        if (f != null) {
            dimension = f.floatValue();
        } else {
            dimension = resources.getDimension(R.dimen.day_item_space_start_end);
            xl2.b = Float.valueOf(dimension);
        }
        float f2 = dimension * 2.0f;
        Float f3 = xl2.c;
        if (f3 != null) {
            dimension2 = f3.floatValue();
        } else {
            dimension2 = resources.getDimension(R.dimen.day_item_space_between);
            xl2.c = Float.valueOf(dimension2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(wk6.b(wk6.b(((size - f2) - (dimension2 * 12.0f)) / 7.0f) * 1.435f), 1073741824));
    }

    public final void setOnDateChanged(oh4<? super LocalDate, g2b> oh4Var) {
        this.f1 = oh4Var;
    }

    public final void w0(final List list) {
        List<rlb> list2;
        rlb rlbVar;
        List<rlb> list3;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        tlb weeksAdapter = getWeeksAdapter();
        if (weeksAdapter != null && (list3 = weeksAdapter.e) != null && list3.isEmpty()) {
            post(new Runnable() { // from class: vlb
                @Override // java.lang.Runnable
                public final void run() {
                    WeeksCalendarView.u0(this.t, list);
                }
            });
            return;
        }
        tlb weeksAdapter2 = getWeeksAdapter();
        if (xj5.a((weeksAdapter2 == null || (list2 = weeksAdapter2.e) == null || (rlbVar = list2.get(1)) == null) ? null : rlbVar.a, ((rlb) list.get(1)).a)) {
            post(new pt2(2, this, list));
        } else {
            post(new Runnable() { // from class: ulb
                @Override // java.lang.Runnable
                public final void run() {
                    WeeksCalendarView.s0(this.t, list);
                }
            });
        }
    }

    public /* synthetic */ WeeksCalendarView(Context context, AttributeSet attributeSet, int i, qq2 qq2Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
