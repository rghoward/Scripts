package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xf implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ xf(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                qf qfVar = (qf) obj2;
                qfVar.k(new bg(qfVar, (List) obj));
                break;
            default:
                ((uf4) obj2).d.setEnabled(((yl2) obj) == yl2.u);
                break;
        }
        return g2b.a;
    }
}
