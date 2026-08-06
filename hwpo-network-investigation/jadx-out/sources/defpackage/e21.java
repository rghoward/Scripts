package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CalendarView;
import androidx.fragment.app.e;
import androidx.fragment.app.l;
import com.hwpo_training_app.R;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e21 extends e {
    public oh4<? super LocalDate, g2b> J;
    public final vg4 K;
    public boolean L;
    public static final /* synthetic */ ho5<Object>[] M = {new ne8(e21.class, "binding", "getBinding()Lcom/hwpo_training_app/core/databinding/DialogCalendarBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static e21 a(long j, Long l, Long l2) {
            e21 e21Var = new e21();
            e21Var.setArguments(uy0.c(new js7("arg_selected_date", Long.valueOf(j)), new js7("arg_min_date", l), new js7("arg_max_date", l2)));
            return e21Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<e21, hz2> {
        @Override // defpackage.oh4
        public final hz2 invoke(e21 e21Var) {
            e21 e21Var2 = e21Var;
            e21Var2.getClass();
            return hz2.bind(e21Var2.requireView());
        }
    }

    public e21() {
        super(R.layout.dialog_calendar);
        this.J = new d21(0);
        this.K = new vg4(new b());
    }

    @Override // androidx.fragment.app.e
    public final void i() {
        if (this.L) {
            this.L = false;
            k(false, false);
        }
    }

    @Override // androidx.fragment.app.e
    public final void o(l lVar, String str) {
        lVar.getClass();
        if (this.L) {
            return;
        }
        this.L = true;
        super.o(lVar, str);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (this.L) {
            this.L = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Window window2;
        view.getClass();
        super.onViewCreated(view, bundle);
        Dialog dialog = this.E;
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = this.E;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setLayout((int) (((double) getResources().getDisplayMetrics().widthPixels) * 0.92d), -2);
        }
        ho5<?>[] ho5VarArr = M;
        ho5<?> ho5Var = ho5VarArr[0];
        vg4 vg4Var = this.K;
        T tA = vg4Var.a(this, ho5Var);
        tA.getClass();
        CalendarView calendarView = ((hz2) tA).b;
        Bundle bundleRequireArguments = requireArguments();
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        calendarView.setDate(bundleRequireArguments.getLong("arg_selected_date", yk2.v(localDateNow)));
        long j = bundleRequireArguments.getLong("arg_min_date", -1L);
        Long lValueOf = Long.valueOf(j);
        if (j == -1) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            calendarView.setMinDate(lValueOf.longValue());
        }
        long j2 = bundleRequireArguments.getLong("arg_max_date", -1L);
        Long lValueOf2 = j2 != -1 ? Long.valueOf(j2) : null;
        if (lValueOf2 != null) {
            calendarView.setMaxDate(lValueOf2.longValue());
        }
        T tA2 = vg4Var.a(this, ho5VarArr[0]);
        tA2.getClass();
        ((hz2) tA2).b.setOnDateChangeListener(new CalendarView.OnDateChangeListener() { // from class: c21
            @Override // android.widget.CalendarView.OnDateChangeListener
            public final void onSelectedDayChange(CalendarView calendarView2, int i, int i2, int i3) {
                e21.a aVar = e21.Companion;
                calendarView2.getClass();
                e21 e21Var = this.a;
                oh4<? super LocalDate, g2b> oh4Var = e21Var.J;
                LocalDate localDateOf = LocalDate.of(i, i2 + 1, i3);
                localDateOf.getClass();
                oh4Var.invoke(localDateOf);
                e21Var.i();
            }
        });
    }
}
