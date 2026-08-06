package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tm0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ tm0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                h37 h37Var = (h37) obj2;
                List list = (List) obj;
                if (h37Var != null) {
                    h37Var.setValue(list);
                }
                break;
            default:
                ((jz7.a) obj).l((jz7) obj2, 0, 0, 0.0f);
                break;
        }
        return g2b.a;
    }
}
