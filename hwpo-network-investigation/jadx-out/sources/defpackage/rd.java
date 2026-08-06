package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.add_value.AddValueViewModel$subscribeToValuesUpdates$2", f = "AddValueViewModel.kt", l = {203}, m = "invokeSuspend", v = 2)
public final class rd extends p6a implements ci4<xd3<? extends Exception, ? extends lr7<cbb>>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ gd v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<lr7<cbb>, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(lr7<cbb> lr7Var, r02<? super g2b> r02Var) {
            bl0 cVar;
            lr7<cbb> lr7Var2 = lr7Var;
            gd gdVar = (gd) this.receiver;
            gd.a aVar = gd.Companion;
            gdVar.getClass();
            gdVar.e(new pb.b(lr7Var2.b));
            ArrayList arrayList = lr7Var2.a;
            gdVar.e(new pb.d(arrayList));
            boolean zIsEmpty = arrayList.isEmpty();
            if (zIsEmpty) {
                cVar = pb.e.a;
            } else {
                if (zIsEmpty) {
                    u.b();
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    cbb cbbVar = (cbb) obj;
                    arrayList2.add(new rc(cbbVar.a, cbbVar.b, false));
                }
                cVar = new pb.c(arrayList2);
            }
            gdVar.e(cVar);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(gd gdVar, r02<? super rd> r02Var) {
        super(2, r02Var);
        this.v = gdVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        rd rdVar = new rd(this.v, r02Var);
        rdVar.u = obj;
        return rdVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends lr7<cbb>> xd3Var, r02<? super g2b> r02Var) {
        return ((rd) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a(2, this.v, gd.class, "valuesToAddUpdated", "valuesToAddUpdated(Lcom/hwpo_training_app/core/domain/model/PaginatedData;)V", 4);
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
