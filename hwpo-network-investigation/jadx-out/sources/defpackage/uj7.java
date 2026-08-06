package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uj7 implements gi4 {
    public final /* synthetic */ int t;

    @Override // defpackage.gi4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Integer num = (Integer) obj2;
        switch (this.t) {
            case 0:
                int iIntValue = num.intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                View view = (View) obj4;
                ec5 ec5Var = (ec5) obj5;
                ho5<Object>[] ho5VarArr = wj7.D;
                view.getClass();
                view.setPadding(view.getPaddingLeft(), ec5Var.b + iIntValue2, view.getPaddingRight(), ec5Var.d + iIntValue);
                break;
            default:
                int iIntValue3 = num.intValue();
                int iIntValue4 = ((Integer) obj3).intValue();
                View view2 = (View) obj4;
                ec5 ec5Var2 = (ec5) obj5;
                to8.a aVar = to8.Companion;
                view2.getClass();
                view2.setPadding(view2.getPaddingLeft(), ec5Var2.b + iIntValue4, view2.getPaddingRight(), ec5Var2.d + iIntValue3);
                break;
        }
        return g2b.a;
    }
}
