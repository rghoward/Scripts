package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mk1 extends wp5 implements ei4 {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk1(int i, int i2) {
        super(i);
        this.u = i2;
    }

    @Override // defpackage.ei4
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                ((Number) obj3).intValue();
                ((List) obj2).getClass();
                return Boolean.valueOf(obj instanceof sk1.b);
            default:
                ((Number) obj3).intValue();
                ((List) obj2).getClass();
                return Boolean.valueOf(obj instanceof zpa);
        }
    }
}
