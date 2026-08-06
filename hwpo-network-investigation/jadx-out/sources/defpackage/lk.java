package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lk extends wp5 implements fi4<Integer, Integer, Integer, Integer, g2b> {
    public final /* synthetic */ nk u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(nk nkVar, int i) {
        super(4);
        this.u = nkVar;
        this.v = i;
    }

    @Override // defpackage.fi4
    public final g2b invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        nk nkVar = this.u;
        nkVar.t.c(nkVar.v, this.v, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return g2b.a;
    }
}
