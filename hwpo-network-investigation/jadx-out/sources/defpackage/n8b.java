package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n8b implements gi4 {
    @Override // defpackage.gi4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        View view = (View) obj4;
        o8b.a aVar = o8b.Companion;
        view.getClass();
        view.setPadding(view.getPaddingLeft(), iIntValue2, view.getPaddingRight(), iIntValue + ((ec5) obj5).d);
        return g2b.a;
    }
}
