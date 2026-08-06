package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {31}, m = "invokeSuspend", v = 1)
public final class af2 extends p6a implements ci4<hc5<Object>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ List<ze2<Object>> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public af2(List<? extends ze2<Object>> list, r02<? super af2> r02Var) {
        super(2, r02Var);
        this.v = list;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        af2 af2Var = new af2(this.v, r02Var);
        af2Var.u = obj;
        return af2Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(hc5<Object> hc5Var, r02<? super g2b> r02Var) {
        return ((af2) create(hc5Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            hc5 hc5Var = (hc5) this.u;
            this.t = 1;
            Object objA = g28.a(this.v, hc5Var, this);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
