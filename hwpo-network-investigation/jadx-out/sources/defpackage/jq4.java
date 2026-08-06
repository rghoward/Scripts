package defpackage;

import com.hwpo_training_app.affiliated_gym.data.entity.GymFilterCityNetworkEntity;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.data.repository.GymFiltersRepositoryImpl$getCitiesForCountry$5", f = "GymFiltersRepositoryImpl.kt", l = {Carousel.ENTITY_TYPE}, m = "invokeSuspend", v = 2)
public final class jq4 extends p6a implements ei4<List<? extends GymFilterCityNetworkEntity>, Integer, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ List u;
    public /* synthetic */ int v;
    public final /* synthetic */ fq4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq4(fq4 fq4Var, r02<? super jq4> r02Var) {
        super(3, r02Var);
        this.w = fq4Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(List<? extends GymFilterCityNetworkEntity> list, Integer num, r02<? super g2b> r02Var) {
        int iIntValue = num.intValue();
        jq4 jq4Var = new jq4(this.w, r02Var);
        jq4Var.u = list;
        jq4Var.v = iIntValue;
        return jq4Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<GymFilterCityNetworkEntity> list = this.u;
        int i = this.v;
        int i2 = this.t;
        if (i2 == 0) {
            dv8.b(obj);
            q1 q1Var = this.w.c;
            ArrayList arrayList = new ArrayList(ph1.n(list, 10));
            for (GymFilterCityNetworkEntity gymFilterCityNetworkEntity : list) {
                arrayList.add(new aq4(gymFilterCityNetworkEntity.t, gymFilterCityNetworkEntity.u, gymFilterCityNetworkEntity.v));
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
