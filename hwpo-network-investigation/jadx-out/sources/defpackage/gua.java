package defpackage;

import com.hwpo_training_app.tracking.data.entity.ValueToAddNetworkEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.data.repository.TrackingValuesRepositoryImpl$fetchValuesToAdd$5", f = "TrackingValuesRepositoryImpl.kt", l = {88}, m = "invokeSuspend", v = 2)
public final class gua extends p6a implements ei4<List<? extends ValueToAddNetworkEntity>, Integer, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ List u;
    public /* synthetic */ int v;
    public final /* synthetic */ tta w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gua(tta ttaVar, r02<? super gua> r02Var) {
        super(3, r02Var);
        this.w = ttaVar;
    }

    @Override // defpackage.ei4
    public final Object invoke(List<? extends ValueToAddNetworkEntity> list, Integer num, r02<? super g2b> r02Var) {
        int iIntValue = num.intValue();
        gua guaVar = new gua(this.w, r02Var);
        guaVar.u = list;
        guaVar.v = iIntValue;
        return guaVar.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.u;
        int i = this.v;
        int i2 = this.t;
        if (i2 == 0) {
            dv8.b(obj);
            p1<cbb> p1Var = this.w.c;
            ArrayList arrayList = new ArrayList(ph1.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ValueToAddNetworkEntity) it.next()).a());
            }
            this.u = null;
            this.v = i;
            this.t = 1;
            g2b g2bVarE = p1Var.e(i, arrayList);
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
