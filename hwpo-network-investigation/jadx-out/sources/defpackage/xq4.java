package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.filters.location_filter.GymLocationFilterFragment$initListeners$1$1", f = "GymLocationFilterFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xq4 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ wq4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq4(wq4 wq4Var, r02<? super xq4> r02Var) {
        super(3, r02Var);
        this.t = wq4Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new xq4(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        oq4 aVar;
        Object obj2;
        dv8.b(obj);
        wq4.a aVar2 = wq4.Companion;
        rr4 rr4VarW = this.t.w();
        List<w23> list = rr4VarW.b().d;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof mr4) {
                arrayList.add(obj3);
            }
        }
        int size = arrayList.size();
        int i = 0;
        do {
            aVar = null;
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i);
            i++;
        } while (!((mr4) obj2).c);
        mr4 mr4Var = (mr4) obj2;
        ed6 ed6Var = rr4VarW.J;
        if (!(ed6Var instanceof ed6.b)) {
            if (!(ed6Var instanceof ed6.a)) {
                u.b();
                return null;
            }
            if (mr4Var != null) {
                aVar = new oq4.a(mr4Var.a, mr4Var.b);
            }
        } else if (mr4Var != null) {
            aVar = new oq4.b(mr4Var.b);
        }
        rr4VarW.f(new rq4(aVar));
        return g2b.a;
    }
}
