package defpackage;

import com.hwpo_training_app.country.data.network.entity.CountryNetworkEntity;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e82 {
    public final iu3 a;

    public e82(iu3 iu3Var) {
        iu3Var.getClass();
        this.a = iu3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(u02 u02Var) throws Throwable {
        d82 d82Var;
        if (u02Var instanceof d82) {
            d82Var = (d82) u02Var;
            int i = d82Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                d82Var.v = i - Integer.MIN_VALUE;
            } else {
                d82Var = new d82(this, u02Var);
            }
        } else {
            d82Var = new d82(this, u02Var);
        }
        Object objA = d82Var.t;
        int i2 = d82Var.v;
        if (i2 == 0) {
            dv8.b(objA);
            d82Var.v = 1;
            objA = this.a.a(d82Var);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objA);
        }
        Iterable<CountryNetworkEntity> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(ph1.n(iterable, 10));
        for (CountryNetworkEntity countryNetworkEntity : iterable) {
            countryNetworkEntity.getClass();
            arrayList.add(new l82(countryNetworkEntity.a, countryNetworkEntity.b));
        }
        return arrayList;
    }
}
