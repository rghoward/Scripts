package defpackage;

import com.hwpo_training_app.affiliated_gym.data.entity.GymFilterCityNetworkEntity;
import com.hwpo_training_app.affiliated_gym.data.entity.response.GymFilterCitiesResponse;
import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.data.repository.GymFiltersRepositoryImpl$getCitiesForCountry$3", f = "GymFiltersRepositoryImpl.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class hq4 extends p6a implements ei4<Integer, String, r02<? super js7<? extends List<? extends GymFilterCityNetworkEntity>, ? extends PagingPaginationNetworkEntity>>, Object> {
    public int t;
    public /* synthetic */ Integer u;
    public final /* synthetic */ fq4 v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq4(fq4 fq4Var, String str, r02<? super hq4> r02Var) {
        super(3, r02Var);
        this.v = fq4Var;
        this.w = str;
    }

    @Override // defpackage.ei4
    public final Object invoke(Integer num, String str, r02<? super js7<? extends List<? extends GymFilterCityNetworkEntity>, ? extends PagingPaginationNetworkEntity>> r02Var) {
        hq4 hq4Var = new hq4(this.v, this.w, r02Var);
        hq4Var.u = num;
        return hq4Var.invokeSuspend(g2b.a);
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
            obj = es4Var.c(this.w, num, 25, this);
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
        GymFilterCitiesResponse gymFilterCitiesResponse = (GymFilterCitiesResponse) obj;
        return new js7(gymFilterCitiesResponse.a, gymFilterCitiesResponse.b);
    }
}
