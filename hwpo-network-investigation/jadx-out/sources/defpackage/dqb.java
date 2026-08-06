package defpackage;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.workouts.WorkoutsViewModel$updateWeekItems$1", f = "WorkoutsViewModel.kt", l = {206}, m = "invokeSuspend", v = 2)
public final class dqb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ wpb u;
    public final /* synthetic */ LocalDate v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqb(wpb wpbVar, LocalDate localDate, r02<? super dqb> r02Var) {
        super(2, r02Var);
        this.u = wpbVar;
        this.v = localDate;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new dqb(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((dqb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num;
        List listA;
        int i = this.t;
        wpb wpbVar = this.u;
        if (i == 0) {
            dv8.b(obj);
            bp1 bp1Var = wpbVar.J;
            this.t = 1;
            Object objW = bp1Var.w(this);
            v72 v72Var = v72.t;
            if (objW == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        wpb.a aVar = wpb.Companion;
        LocalDate localDate = wpbVar.b().d;
        LocalDate localDate2 = wpbVar.b().f;
        LocalDate localDate3 = this.v;
        localDate3.getClass();
        localDate.getClass();
        localDate2.getClass();
        int i2 = 0;
        boolean z = localDate3.compareTo((ChronoLocalDate) localDate) >= 0 && localDate3.compareTo((ChronoLocalDate) localDate2) <= 0;
        int i3 = -1;
        if (!z) {
            listA = es3.a(localDate3);
        } else {
            if (!z) {
                u.b();
                return null;
            }
            List<rlb> list = wpbVar.b().i;
            list.getClass();
            if (localDate3.compareTo((ChronoLocalDate) list.get(1).b.get(0).a) >= 0 && localDate3.compareTo((ChronoLocalDate) list.get(1).b.get(6).a) <= 0) {
                num = 1;
            } else if (localDate3.compareTo((ChronoLocalDate) list.get(2).b.get(0).a) < 0 || localDate3.compareTo((ChronoLocalDate) list.get(2).b.get(6).a) > 0) {
                num = (localDate3.compareTo((ChronoLocalDate) list.get(0).b.get(0).a) < 0 || localDate3.compareTo((ChronoLocalDate) list.get(0).b.get(6).a) > 0) ? null : 0;
            } else {
                num = 2;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                Iterator<zl2> it = list.get(iIntValue).b.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    if (xj5.a(it.next().a, localDate3)) {
                        break;
                    }
                    i4++;
                }
                Integer numValueOf = Integer.valueOf(i4);
                if (i4 == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue2 = numValueOf.intValue();
                    ArrayList arrayList = new ArrayList(list);
                    Iterator<zl2> it2 = list.get(1).b.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i5 = -1;
                            break;
                        }
                        if (it2.next().c) {
                            break;
                        }
                        i5++;
                    }
                    Integer numValueOf2 = Integer.valueOf(i5);
                    if (i5 == -1) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        es3.b(arrayList, 1, numValueOf2.intValue(), false);
                    }
                    es3.b(arrayList, iIntValue, iIntValue2, true);
                    listA = arrayList;
                } else {
                    listA = wpbVar.b().i;
                }
            } else {
                listA = wpbVar.b().i;
            }
        }
        Iterator<zl2> it3 = ((rlb) listA.get(1)).b.iterator();
        while (it3.hasNext()) {
            if (it3.next().c) {
                i3 = i2;
                break;
            }
            i2++;
        }
        wpbVar.e(new vpb.d(i3, listA));
        if (!z) {
            oy0.d(rhb.b(wpbVar), null, null, new bqb(null, wpbVar, localDate3, true), 3);
        }
        return g2b.a;
    }
}
