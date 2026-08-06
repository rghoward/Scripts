package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fb3 implements gi4 {
    @Override // defpackage.gi4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        int iIntValue3 = ((Integer) obj3).intValue();
        View view = (View) obj4;
        ec5 ec5Var = (ec5) obj5;
        rb3.a aVar = rb3.Companion;
        view.getClass();
        int i = ec5Var.d;
        view.setPadding(view.getPaddingLeft(), ec5Var.b + iIntValue3, view.getPaddingRight(), iIntValue == 0 ? iIntValue2 + i : iIntValue + i);
        return g2b.a;
    }
}
