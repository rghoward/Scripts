package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yx6 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ yx6(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return ((oh4) obj2).invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                o8b o8bVar = (o8b) obj2;
                o8b.a aVar = o8b.Companion;
                o8bVar.q().h.g((vz7) obj, new g9b(0, o8bVar.r(), o9b.class, "onRetryClick", "onRetryClick()Lkotlinx/coroutines/Job;", 8));
                return g2b.a;
        }
    }
}
