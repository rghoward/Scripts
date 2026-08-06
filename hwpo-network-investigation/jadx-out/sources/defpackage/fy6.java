package defpackage;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fy6 extends RecyclerView.f<a> {
    public final a21 d;
    public final wk2<?> e;
    public final am2 f;
    public final rj6.c g;
    public final rj6.d h;
    public final int i;
    public by6 j;
    public int k = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends RecyclerView.e0 {
        public final TextView u;
        public final MaterialCalendarGridView v;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.u = textView;
            WeakHashMap<View, fib> weakHashMap = egb.a;
            new dgb(R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(textView, Boolean.TRUE);
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public fy6(ContextThemeWrapper contextThemeWrapper, wk2 wk2Var, a21 a21Var, am2 am2Var, rj6.c cVar, rj6.d dVar) {
        by6 by6Var = a21Var.t;
        by6 by6Var2 = a21Var.u;
        by6 by6Var3 = a21Var.w;
        if (by6Var.compareTo(by6Var3) > 0) {
            z90.a("firstPage cannot be after currentPage");
            throw null;
        }
        if (by6Var3.compareTo(by6Var2) > 0) {
            z90.a("currentPage cannot be after lastPage");
            throw null;
        }
        this.i = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * cy6.z) + (gk6.r(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.d = a21Var;
        this.e = wk2Var;
        this.f = am2Var;
        this.g = cVar;
        this.h = dVar;
        this.j = by6Var3;
        s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int f() {
        return this.d.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final long g(int i) {
        Calendar calendarC = f6b.c(this.d.t.t);
        calendarC.add(2, i);
        calendarC.set(5, 1);
        Calendar calendarC2 = f6b.c(calendarC);
        calendarC2.get(2);
        calendarC2.get(1);
        calendarC2.getMaximum(7);
        calendarC2.getActualMaximum(5);
        calendarC2.getTimeInMillis();
        return calendarC2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void j(RecyclerView.e0 e0Var, int i) {
        a aVar = (a) e0Var;
        a21 a21Var = this.d;
        Calendar calendarC = f6b.c(a21Var.t.t);
        calendarC.add(2, i);
        by6 by6Var = new by6(calendarC);
        aVar.u.setText(by6Var.h());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !by6Var.equals(materialCalendarGridView.b().t)) {
            cy6 cy6Var = new cy6(by6Var, this.e, a21Var, this.f);
            materialCalendarGridView.setNumColumns(by6Var.w);
            materialCalendarGridView.setAdapter((ListAdapter) cy6Var);
        } else {
            materialCalendarGridView.invalidate();
            cy6 cy6VarB = materialCalendarGridView.b();
            wk2<?> wk2Var = cy6VarB.u;
            Iterator<Long> it = cy6VarB.v.iterator();
            while (it.hasNext()) {
                cy6VarB.i(materialCalendarGridView, it.next().longValue());
            }
            if (wk2Var != null) {
                ArrayList arrayListT = wk2Var.t();
                int size = arrayListT.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListT.get(i2);
                    i2++;
                    cy6VarB.i(materialCalendarGridView, ((Long) obj).longValue());
                }
                cy6VarB.v = wk2Var.t();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new ey6(this, materialCalendarGridView));
        materialCalendarGridView.u = this.h;
        boolean zR = gk6.r(aVar.a.getContext(), android.R.attr.windowFullscreen);
        if (zR || by6Var.equals(this.j)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(131072);
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(393216);
        }
        if (zR || !by6Var.equals(this.j)) {
            return;
        }
        final int i3 = this.k;
        this.k = 0;
        materialCalendarGridView.post(new Runnable(this) { // from class: dy6
            @Override // java.lang.Runnable
            public final void run() {
                int i4;
                int iB;
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                if (!materialCalendarGridView2.hasFocus() || (i4 = i3) == 0) {
                    return;
                }
                cy6 cy6VarB2 = materialCalendarGridView2.b();
                if (i4 == 1) {
                    iB = cy6VarB2.c(cy6VarB2.g() + 1);
                    if (iB == -1) {
                        iB = cy6VarB2.g();
                    }
                } else {
                    iB = cy6VarB2.b(cy6VarB2.d() - 1);
                    if (iB == -1) {
                        iB = cy6VarB2.d();
                    }
                }
                materialCalendarGridView2.setSelection(iB);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.e0 l(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!gk6.r(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.i));
        return new a(linearLayout, true);
    }

    public final by6 u(int i) {
        Calendar calendarC = f6b.c(this.d.t.t);
        calendarC.add(2, i);
        return new by6(calendarC);
    }

    public final int v(by6 by6Var) {
        return this.d.t.j(by6Var);
    }
}
