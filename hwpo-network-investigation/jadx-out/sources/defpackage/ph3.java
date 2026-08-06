package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ph3 extends wp5 implements oh4<kg5, bg5> {
    public final /* synthetic */ oh4<Integer, Integer> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ph3(oh4<? super Integer, Integer> oh4Var) {
        super(1);
        this.u = oh4Var;
    }

    @Override // defpackage.oh4
    public final bg5 invoke(kg5 kg5Var) {
        return new bg5(((long) this.u.invoke(Integer.valueOf((int) (kg5Var.a >> 32))).intValue()) << 32);
    }
}
