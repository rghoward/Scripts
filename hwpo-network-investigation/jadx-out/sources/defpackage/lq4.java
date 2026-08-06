package defpackage;

import com.hwpo_training_app.affiliated_gym.data.entity.GymFilterCountryNetworkEntity;
import com.hwpo_training_app.affiliated_gym.data.entity.response.GymFilterCountriesResponse;
import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.data.repository.GymFiltersRepositoryImpl$getCountries$3", f = "GymFiltersRepositoryImpl.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class lq4 extends p6a implements ei4<Integer, String, r02<? super js7<? extends List<? extends GymFilterCountryNetworkEntity>, ? extends PagingPaginationNetworkEntity>>, Object> {
    public int t;
    public /* synthetic */ Integer u;
    public final /* synthetic */ fq4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq4(fq4 fq4Var, r02<? super lq4> r02Var) {
        super(3, r02Var);
        this.v = fq4Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(Integer num, String str, r02<? super js7<? extends List<? extends GymFilterCountryNetworkEntity>, ? extends PagingPaginationNetworkEntity>> r02Var) {
        lq4 lq4Var = new lq4(this.v, r02Var);
        lq4Var.u = num;
        return lq4Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num = this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            es4 es4Var = this.v.a;
            this.u = null;
            this.t = 1;
            obj = es4Var.b(num, 25, this);
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
        GymFilterCountriesResponse gymFilterCountriesResponse = (GymFilterCountriesResponse) obj;
        return new js7(gymFilterCountriesResponse.a, gymFilterCountriesResponse.b);
    }
}
