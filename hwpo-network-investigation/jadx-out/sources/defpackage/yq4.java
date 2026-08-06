package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.filters.location_filter.GymLocationFilterFragment$initListeners$1$2", f = "GymLocationFilterFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yq4 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ wq4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq4(wq4 wq4Var, r02<? super yq4> r02Var) {
        super(3, r02Var);
        this.t = wq4Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new yq4(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        wq4.a aVar = wq4.Companion;
        rr4 rr4VarW = this.t.w();
        Iterator<w23> it = rr4VarW.b().d.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            w23 next = it.next();
            if ((next instanceof mr4) && ((mr4) next).c) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            Object objB = th1.B(iIntValue, rr4VarW.b().d);
            mr4 mr4Var = objB instanceof mr4 ? (mr4) objB : null;
            if (mr4Var != null) {
                ArrayList arrayList = new ArrayList(rr4VarW.b().d);
                arrayList.set(iIntValue, mr4.a(mr4Var, false));
                boolean z = rr4VarW.J.b() != null;
                rr4VarW.e(new pq4.c(arrayList));
                rr4VarW.e(new pq4.i(z));
            }
        }
        return g2b.a;
    }
}
