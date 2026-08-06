package defpackage;

import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.ValueToAddNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.ValuesToAddResponse;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.data.repository.TrackingValuesRepositoryImpl$fetchValuesToAdd$3", f = "TrackingValuesRepositoryImpl.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class eua extends p6a implements ei4<Integer, String, r02<? super js7<? extends List<? extends ValueToAddNetworkEntity>, ? extends PagingPaginationNetworkEntity>>, Object> {
    public int t;
    public /* synthetic */ Integer u;
    public /* synthetic */ String v;
    public final /* synthetic */ tta w;
    public final /* synthetic */ ebb x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eua(tta ttaVar, ebb ebbVar, r02<? super eua> r02Var) {
        super(3, r02Var);
        this.w = ttaVar;
        this.x = ebbVar;
    }

    @Override // defpackage.ei4
    public final Object invoke(Integer num, String str, r02<? super js7<? extends List<? extends ValueToAddNetworkEntity>, ? extends PagingPaginationNetworkEntity>> r02Var) {
        eua euaVar = new eua(this.w, this.x, r02Var);
        euaVar.u = num;
        euaVar.v = str;
        return euaVar.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num = this.u;
        String str = this.v;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            rta rtaVar = this.w.a;
            String str2 = this.x.t;
            this.u = null;
            this.v = null;
            this.t = 1;
            obj = rtaVar.f(str2, num, 15, str, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        ValuesToAddResponse valuesToAddResponse = (ValuesToAddResponse) obj;
        return new js7(valuesToAddResponse.a, valuesToAddResponse.b);
    }
}
