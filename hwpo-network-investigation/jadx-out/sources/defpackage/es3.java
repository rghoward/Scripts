package defpackage;

import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class es3 {
    public static e96 a(LocalDate localDate) {
        localDate.getClass();
        qlb.Companion.getClass();
        qlb qlbVarA = qlb.a.a(localDate);
        List<LocalDate> list = qlbVarA.a;
        LocalDate localDateMinusWeeks = list.get(0).minusWeeks(1L);
        localDateMinusWeeks.getClass();
        qlb qlbVarA2 = qlb.a.a(localDateMinusWeeks);
        LocalDate localDatePlusWeeks = list.get(0).plusWeeks(1L);
        localDatePlusWeeks.getClass();
        qlb qlbVarA3 = qlb.a.a(localDatePlusWeeks);
        e96 e96VarF = ws0.f();
        if3 if3Var = if3.t;
        e96VarF.add(ji6.a(qlbVarA2, localDate, if3Var));
        e96VarF.add(ji6.a(qlbVarA, localDate, if3Var));
        e96VarF.add(ji6.a(qlbVarA3, localDate, if3Var));
        return ws0.e(e96VarF);
    }

    public static final void b(ArrayList arrayList, int i, int i2, boolean z) {
        rlb rlbVar = (rlb) arrayList.get(i);
        ArrayList arrayList2 = new ArrayList(((rlb) arrayList.get(i)).b);
        arrayList2.set(i2, zl2.a((zl2) arrayList2.get(i2), null, z, 11));
        g2b g2bVar = g2b.a;
        arrayList.set(i, rlb.a(rlbVar, arrayList2));
    }
}
