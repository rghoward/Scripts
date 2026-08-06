package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nv5 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ nv5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((jz7.a) obj).l((jz7) obj2, 0, 0, 0.0f);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                jz7.a aVar = (jz7.a) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    aVar.l((jz7) arrayList.get(i2), 0, 0, 0.0f);
                }
                break;
        }
        return g2b.a;
    }
}
