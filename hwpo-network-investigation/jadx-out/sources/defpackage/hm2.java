package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.day_workouts.DayViewModel$listenSessionCompletionUpdates$1", f = "DayViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hm2 extends p6a implements ci4<gya<? extends Integer, ? extends Boolean, ? extends Boolean>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ cm2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm2(cm2 cm2Var, r02<? super hm2> r02Var) {
        super(2, r02Var);
        this.u = cm2Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        hm2 hm2Var = new hm2(this.u, r02Var);
        hm2Var.t = obj;
        return hm2Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(gya<? extends Integer, ? extends Boolean, ? extends Boolean> gyaVar, r02<? super g2b> r02Var) {
        return ((hm2) create(gyaVar, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        gya gyaVar = (gya) this.t;
        dv8.b(obj);
        int i = cm2.I;
        cm2 cm2Var = this.u;
        if (cm2Var.b().d.isEmpty()) {
            return g2b.a;
        }
        int iIntValue = ((Number) gyaVar.t).intValue();
        boolean zBooleanValue = ((Boolean) gyaVar.u).booleanValue();
        boolean zBooleanValue2 = ((Boolean) gyaVar.v).booleanValue();
        Set setI = cm2.i(iIntValue, cm2Var.j());
        ArrayList arrayListJ = cm2Var.j();
        ArrayList arrayList = new ArrayList(ph1.n(arrayListJ, 10));
        int size = arrayListJ.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayListJ.get(i2);
            i2++;
            bc8 bc8VarA = (bc8) obj2;
            if (setI.contains(new Integer(bc8VarA.t))) {
                List<s23> list = bc8VarA.A;
                ArrayList arrayList2 = new ArrayList(ph1.n(list, 10));
                for (s23 s23Var : list) {
                    if (s23Var.getId() == iIntValue && (s23Var instanceof ep1)) {
                        s23Var = (s23) ((ep1) s23Var).b(zBooleanValue, zBooleanValue2);
                    }
                    arrayList2.add(s23Var);
                }
                bc8VarA = bc8.a(bc8VarA, arrayList2, rc8.a(arrayList2), 3455);
            }
            arrayList.add(bc8VarA);
        }
        cm2Var.e(new cm2.b.c(arrayList));
        bc8 bc8Var = (bc8) th1.A(arrayList);
        if (bc8Var != null) {
            cm2Var.e(new cm2.b.d(bc8Var.A));
        }
        return g2b.a;
    }
}
