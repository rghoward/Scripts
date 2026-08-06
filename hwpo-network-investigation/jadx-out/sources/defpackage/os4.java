package defpackage;

import com.hwpo_training_app.affiliated_gym.data.entity.response.GymsListResponse;
import com.hwpo_training_app.core.data.model.gym.GymNetworkEntity;
import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.data.repository.GymsRepositoryImpl$getListOfGyms$3", f = "GymsRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class os4 extends p6a implements ei4<Integer, String, r02<? super js7<? extends List<? extends GymNetworkEntity>, ? extends PagingPaginationNetworkEntity>>, Object> {
    public int t;
    public /* synthetic */ Integer u;
    public /* synthetic */ String v;
    public final /* synthetic */ ms4 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os4(ms4 ms4Var, String str, String str2, r02<? super os4> r02Var) {
        super(3, r02Var);
        this.w = ms4Var;
        this.x = str;
        this.y = str2;
    }

    @Override // defpackage.ei4
    public final Object invoke(Integer num, String str, r02<? super js7<? extends List<? extends GymNetworkEntity>, ? extends PagingPaginationNetworkEntity>> r02Var) {
        String str2 = this.x;
        String str3 = this.y;
        os4 os4Var = new os4(this.w, str2, str3, r02Var);
        os4Var.u = num;
        os4Var.v = str;
        return os4Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num = this.u;
        String str = this.v;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            es4 es4Var = this.w.a;
            this.u = null;
            this.v = null;
            this.t = 1;
            obj = es4Var.a(str, num, 25, this.x, this.y, this);
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
        GymsListResponse gymsListResponse = (GymsListResponse) obj;
        return new js7(gymsListResponse.a, gymsListResponse.b);
    }
}
