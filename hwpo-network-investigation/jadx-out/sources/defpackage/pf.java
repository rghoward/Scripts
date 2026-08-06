package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pf implements gi4 {
    @Override // defpackage.gi4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        int iIntValue3 = ((Integer) obj3).intValue();
        View view = (View) obj4;
        qf.a aVar = qf.Companion;
        view.getClass();
        int i = ((ec5) obj5).b;
        int i2 = iIntValue3 + i;
        if (iIntValue == 0) {
            iIntValue = iIntValue2;
        }
        view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i + iIntValue);
        return g2b.a;
    }
}
