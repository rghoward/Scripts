package defpackage;

import com.hwpo_training_app.core.data.model.gym.GymNetworkEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.data.repository.GymsRepositoryImpl$getListOfGyms$5", f = "GymsRepositoryImpl.kt", l = {37}, m = "invokeSuspend", v = 2)
public final class qs4 extends p6a implements ei4<List<? extends GymNetworkEntity>, Integer, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ List u;
    public /* synthetic */ int v;
    public final /* synthetic */ ms4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs4(ms4 ms4Var, r02<? super qs4> r02Var) {
        super(3, r02Var);
        this.w = ms4Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(List<? extends GymNetworkEntity> list, Integer num, r02<? super g2b> r02Var) {
        int iIntValue = num.intValue();
        qs4 qs4Var = new qs4(this.w, r02Var);
        qs4Var.u = list;
        qs4Var.v = iIntValue;
        return qs4Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.u;
        int i = this.v;
        int i2 = this.t;
        if (i2 == 0) {
            dv8.b(obj);
            q1 q1Var = this.w.b;
            ArrayList arrayList = new ArrayList(ph1.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((GymNetworkEntity) it.next()).a());
            }
            this.u = null;
            this.v = i;
            this.t = 1;
            g2b g2bVarE = q1Var.e(i, arrayList);
            v72 v72Var = v72.t;
            if (g2bVarE == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
