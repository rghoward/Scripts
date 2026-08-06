package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zj2 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ zj2(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return g2b.a;
            case 1:
                List list = (List) obj;
                return new nz5(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                int i = o9b.m0;
                return ((gab) obj).l;
        }
    }
}
