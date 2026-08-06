package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.filters.location_filter.GymLocationFilterViewModel$subscribeToFilterItemUpdates$2", f = "GymLocationFilterViewModel.kt", l = {144}, m = "invokeSuspend", v = 2)
public final class zr4 extends p6a implements ci4<xd3<? extends Exception, ? extends lr7<? extends dq4>>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ rr4 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<lr7<? extends dq4>, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(lr7<? extends dq4> lr7Var, r02<? super g2b> r02Var) {
            bl0 cVar;
            boolean zA;
            lr7<? extends dq4> lr7Var2 = lr7Var;
            rr4 rr4Var = (rr4) this.receiver;
            rr4.a aVar = rr4.Companion;
            rr4Var.getClass();
            rr4Var.e(new pq4.b(lr7Var2.b));
            ArrayList arrayList = lr7Var2.a;
            boolean zIsEmpty = arrayList.isEmpty();
            if (zIsEmpty) {
                cVar = pq4.d.a;
            } else {
                if (zIsEmpty) {
                    u.b();
                    return null;
                }
                ed6 ed6Var = rr4Var.J;
                ed6Var.getClass();
                ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    dq4 dq4Var = (dq4) obj;
                    if (ed6Var instanceof ed6.a) {
                        oq4.a aVar2 = ((ed6.a) ed6Var).u;
                        zA = aVar2 != null && dq4Var.getId() == aVar2.t;
                    } else {
                        if (!(ed6Var instanceof ed6.b)) {
                            u.b();
                            return null;
                        }
                        String name = dq4Var.getName();
                        oq4.b bVar = ((ed6.b) ed6Var).t;
                        zA = xj5.a(name, bVar != null ? bVar.t : null);
                    }
                    arrayList2.add(new mr4(dq4Var.getId(), dq4Var.getName(), zA));
                }
                cVar = new pq4.c(arrayList2);
            }
            rr4Var.e(cVar);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr4(rr4 rr4Var, r02<? super zr4> r02Var) {
        super(2, r02Var);
        this.v = rr4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        zr4 zr4Var = new zr4(this.v, r02Var);
        zr4Var.u = obj;
        return zr4Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends lr7<? extends dq4>> xd3Var, r02<? super g2b> r02Var) {
        return ((zr4) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a(2, this.v, rr4.class, "filterItemsListUpdated", "filterItemsListUpdated(Lcom/hwpo_training_app/core/domain/model/PaginatedData;)V", 4);
            this.u = null;
            this.t = 1;
            Object objB = yd3.b(xd3Var, aVar, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
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
