package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rl1 implements gi4 {
    @Override // defpackage.gi4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj2).getClass();
        int iIntValue = ((Integer) obj3).intValue();
        View view = (View) obj4;
        am1.a aVar = am1.Companion;
        view.getClass();
        view.setPadding(view.getPaddingLeft(), ((ec5) obj5).b + iIntValue, view.getPaddingRight(), view.getPaddingBottom());
        return g2b.a;
    }
}
