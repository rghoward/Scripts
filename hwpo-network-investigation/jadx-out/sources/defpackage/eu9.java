package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import com.hwpo_training_app.core.presentation.horizontal_calendar.WeeksCalendarView;
import j$.time.LocalDate;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eu9 extends RecyclerView.t {
    public final y a;
    public final WeeksCalendarView.a b;

    public eu9(y yVar, WeeksCalendarView.a aVar) {
        this.a = yVar;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Runnable, wlb] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void a(RecyclerView recyclerView, int i) {
        View viewD;
        if (i == 0) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            final int iM = -1;
            if (layoutManager != null && (viewD = this.a.d(layoutManager)) != null) {
                iM = RecyclerView.o.M(viewD);
            }
            final WeeksCalendarView weeksCalendarView = WeeksCalendarView.this;
            if (iM == 1) {
                return;
            }
            weeksCalendarView.removeCallbacks(weeksCalendarView.g1);
            ?? r2 = new Runnable() { // from class: wlb
                @Override // java.lang.Runnable
                public final void run() {
                    List<rlb> list;
                    rlb rlbVar;
                    Object next;
                    LocalDate localDate;
                    LocalDate localDateMinusWeeks;
                    WeeksCalendarView weeksCalendarView2 = weeksCalendarView;
                    tlb weeksAdapter = weeksCalendarView2.getWeeksAdapter();
                    if (weeksAdapter == null || (list = weeksAdapter.e) == null || (rlbVar = (rlb) th1.B(1, list)) == null) {
                        return;
                    }
                    Iterator<T> it = rlbVar.b.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((zl2) next).c);
                    zl2 zl2Var = (zl2) next;
                    if (zl2Var == null || (localDate = zl2Var.a) == null) {
                        return;
                    }
                    int i2 = iM;
                    if (i2 == 0) {
                        localDateMinusWeeks = localDate.minusWeeks(1L);
                    } else if (i2 != 2) {
                        return;
                    } else {
                        localDateMinusWeeks = localDate.plusWeeks(1L);
                    }
                    oh4<LocalDate, g2b> onDateChanged = weeksCalendarView2.getOnDateChanged();
                    if (onDateChanged != null) {
                        localDateMinusWeeks.getClass();
                        onDateChanged.invoke(localDateMinusWeeks);
                    }
                }
            };
            weeksCalendarView.g1 = r2;
            weeksCalendarView.post(r2);
        }
    }
}
