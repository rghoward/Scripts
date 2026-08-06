package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$listenSessionCompletionUpdate$1", f = "SessionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tj9 extends p6a implements ci4<gya<? extends Integer, ? extends Boolean, ? extends Boolean>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ lj9 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj9(lj9 lj9Var, r02<? super tj9> r02Var) {
        super(2, r02Var);
        this.u = lj9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        tj9 tj9Var = new tj9(this.u, r02Var);
        tj9Var.t = obj;
        return tj9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(gya<? extends Integer, ? extends Boolean, ? extends Boolean> gyaVar, r02<? super g2b> r02Var) {
        return ((tj9) create(gyaVar, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        gya gyaVar = (gya) this.t;
        dv8.b(obj);
        int iIntValue = ((Number) gyaVar.t).intValue();
        boolean zBooleanValue = ((Boolean) gyaVar.u).booleanValue();
        boolean zBooleanValue2 = ((Boolean) gyaVar.v).booleanValue();
        lj9.a aVar = lj9.Companion;
        lj9 lj9Var = this.u;
        List<s23> list = lj9Var.b().b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ep1) {
                arrayList.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                if (((ep1) obj3).getId() == iIntValue) {
                    ArrayList arrayListK = lj9.k(iIntValue, lj9Var.b().b, zBooleanValue, zBooleanValue2);
                    bc8 bc8Var = lj9Var.b().a;
                    ArrayList arrayListK2 = lj9.k(iIntValue, bc8Var != null ? bc8Var.A : hf3.t, zBooleanValue, zBooleanValue2);
                    lj9Var.e(new kj9.f(arrayListK));
                    bc8 bc8Var2 = lj9Var.b().a;
                    if (bc8Var2 != null) {
                        lj9Var.e(new kj9.e(bc8.a(bc8Var2, arrayListK2, false, 3967)));
                    }
                    return g2b.a;
                }
            }
        }
        return g2b.a;
    }
}
