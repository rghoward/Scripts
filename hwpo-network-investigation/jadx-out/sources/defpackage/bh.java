package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.list.AffiliatedGymListViewModel$subscribeToGymsUpdates$2", f = "AffiliatedGymListViewModel.kt", l = {157}, m = "invokeSuspend", v = 2)
public final class bh extends p6a implements ci4<xd3<? extends Exception, ? extends lr7<yp4.a>>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ pg v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<lr7<yp4.a>, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(lr7<yp4.a> lr7Var, r02<? super g2b> r02Var) {
            bl0 dVar;
            lr7<yp4.a> lr7Var2 = lr7Var;
            pg pgVar = (pg) this.receiver;
            pg.b bVar = pg.Companion;
            pgVar.getClass();
            pgVar.e(new ef.c(lr7Var2.b));
            ArrayList arrayList = lr7Var2.a;
            pgVar.e(new ef.b(arrayList));
            boolean zIsEmpty = arrayList.isEmpty();
            if (zIsEmpty) {
                dVar = ef.e.a;
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
                    yp4.a aVar = (yp4.a) obj;
                    aVar.getClass();
                    int i2 = aVar.t;
                    String str = aVar.u;
                    String str2 = aVar.w;
                    String str3 = aVar.x;
                    if (str3 == null) {
                        str3 = aVar.v;
                    }
                    arrayList2.add(new fh(str, cj2.a(str2, ", ", str3), i2, false));
                }
                dVar = new ef.d(arrayList2);
            }
            pgVar.e(dVar);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(pg pgVar, r02<? super bh> r02Var) {
        super(2, r02Var);
        this.v = pgVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        bh bhVar = new bh(this.v, r02Var);
        bhVar.u = obj;
        return bhVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends lr7<yp4.a>> xd3Var, r02<? super g2b> r02Var) {
        return ((bh) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a(2, this.v, pg.class, "gymsListUpdated", "gymsListUpdated(Lcom/hwpo_training_app/core/domain/model/PaginatedData;)V", 4);
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
