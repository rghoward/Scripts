package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$listenDetailsUpdate$2", f = "SessionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pj9 extends p6a implements ci4<gd8, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ lj9 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj9(lj9 lj9Var, r02<? super pj9> r02Var) {
        super(2, r02Var);
        this.u = lj9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        pj9 pj9Var = new pj9(this.u, r02Var);
        pj9Var.t = obj;
        return pj9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(gd8 gd8Var, r02<? super g2b> r02Var) {
        return ((pj9) create(gd8Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        gd8 gd8Var = (gd8) this.t;
        dv8.b(obj);
        lj9.a aVar = lj9.Companion;
        lj9 lj9Var = this.u;
        List<s23> list = lj9Var.b().b;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof fd8) {
                arrayList.add(obj3);
            }
        }
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i);
            i++;
        } while (((fd8) obj2).t != gd8Var.a);
        if (((fd8) obj2) != null) {
            ArrayList arrayListL = lj9.l(gd8Var, lj9Var.b().b);
            bc8 bc8Var = lj9Var.b().a;
            ArrayList arrayListL2 = lj9.l(gd8Var, bc8Var != null ? bc8Var.A : hf3.t);
            lj9Var.e(new kj9.f(arrayListL));
            bc8 bc8Var2 = lj9Var.b().a;
            if (bc8Var2 != null) {
                lj9Var.e(new kj9.e(bc8.a(bc8Var2, arrayListL2, false, 3967)));
            }
        }
        return g2b.a;
    }
}
