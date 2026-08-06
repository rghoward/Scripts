package defpackage;

import io.intercom.android.sdk.m5.components.FooterNoticeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yb4 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ yb4(int i, int i2, Object obj, Object obj2) {
        this.t = i2;
        this.v = obj;
        this.w = obj2;
        this.u = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return FooterNoticeKt.FooterTitle$lambda$9((String) this.v, (List) this.w, this.u, (jt1) obj, iIntValue);
            default:
                ((Integer) obj2).intValue();
                int iS = gz3.s(this.u | 1);
                ((tva) this.v).a(this.w, (jt1) obj, iS);
                return g2b.a;
        }
    }
}
