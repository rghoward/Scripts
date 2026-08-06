package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oh3 extends wp5 implements oh4 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh3(int i, Object obj) {
        super(1);
        this.u = i;
        this.v = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.u;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new bg5(((long) ((Number) ((oh4) obj2).invoke(Integer.valueOf((int) (((kg5) obj).a & 4294967295L)))).intValue()) & 4294967295L);
            default:
                if (hn4.b.compareAndSet(false, true)) {
                    ((zx0) obj2).n(g2b.a);
                }
                return g2b.a;
        }
    }
}
