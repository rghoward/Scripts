package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mb3 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ mb3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                rb3 rb3Var = (rb3) obj2;
                Editable editable = (Editable) obj;
                rb3.a aVar = rb3.Companion;
                if (editable != null) {
                    rb3Var.s().n(-1, editable.toString());
                }
                return g2b.a;
            default:
                return new nwa((tva) obj2);
        }
    }
}
