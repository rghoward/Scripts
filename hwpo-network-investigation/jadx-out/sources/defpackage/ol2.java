package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ol2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ol2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ql2.a aVar = ql2.Companion;
                o7a o7aVar = ((ql2) obj).E;
                return new eeb(((Number) o7aVar.getValue()).intValue(), ((Number) o7aVar.getValue()).intValue(), ((Number) o7aVar.getValue()).intValue(), 8, 0);
            case 1:
                u47 u47Var = ((r47) obj).A;
                if (!u47Var.i) {
                    aa0.c("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (u47Var.j.d != s66.b.t) {
                    return ((u47.a) thb.b.a(u47Var.a, (thb.c) u47Var.m.getValue(), 4).a(ll8.a(u47.a.class))).t;
                }
                aa0.c("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                return null;
            default:
                rbb rbbVar = (rbb) obj;
                rbb.a aVar2 = rbb.Companion;
                return new ibb(new rbb.b(1, rbbVar.q(), ybb.class, "onItemClicked", "onItemClicked(Lcom/hwpo_training_app/tracking/presentation/values_list/model/item/ValueItemModel;)Lkotlinx/coroutines/Job;", 8), new rbb.c(1, rbbVar.q(), ybb.class, "onItemShown", "onItemShown(I)V", 0));
        }
    }
}
