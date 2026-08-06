package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wg0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ wg0(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                xg0.a aVar = (xg0.a) obj3;
                xg0 xg0Var = (xg0) obj2;
                kla.a aVar2 = aVar.H;
                if (aVar2 != null) {
                    aVar2.b();
                }
                aVar.H = null;
                bp1 bp1Var = xg0Var.u;
                if (bp1Var != null) {
                    bp1Var.h0(g2b.a);
                }
                xg0Var.u = null;
                break;
            default:
                jz7.a aVar3 = (jz7.a) obj;
                m67 m67Var = new m67(1, (ArrayList) obj2);
                aVar3.t = true;
                m67Var.invoke(aVar3);
                aVar3.t = false;
                ((h37) obj3).getValue();
                break;
        }
        return g2b.a;
    }
}
