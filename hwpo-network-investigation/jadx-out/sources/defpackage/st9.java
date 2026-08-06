package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class st9 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ oh4 v;

    public /* synthetic */ st9(int i, oh4 oh4Var, Object obj) {
        this.t = i;
        this.u = obj;
        this.v = oh4Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        oh4 oh4Var = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                dl8 dl8Var = (dl8) obj2;
                float fFloatValue = dl8Var.t - ((Float) obj).floatValue();
                dl8Var.t = fFloatValue;
                oh4Var.invoke(Float.valueOf(fFloatValue));
                return g2b.a;
            default:
                g32 g32Var = (g32) obj2;
                uca.a aVar = (uca.a) oh4Var;
                txa txaVar = (txa) obj;
                if (txaVar instanceof lb) {
                    g32Var.invoke(((lb) txaVar).H);
                } else {
                    if (!(txaVar instanceof lz3)) {
                        aa0.c("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                        return null;
                    }
                    aVar.invoke(null);
                }
                return Boolean.TRUE;
        }
    }
}
