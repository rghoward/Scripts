package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends s {
    public final /* synthetic */ g0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g0 g0Var, Context context) {
        super(context);
        this.q = g0Var;
    }

    @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.RecyclerView.z
    public final void e(View view, RecyclerView.z.a aVar) {
        g0 g0Var = this.q;
        RecyclerView recyclerView = g0Var.a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrB = g0Var.b(recyclerView.getLayoutManager(), view);
        int i = iArrB[0];
        int i2 = iArrB[1];
        int iCeil = (int) Math.ceil(((double) k(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            aVar.a = i;
            aVar.b = i2;
            aVar.c = iCeil;
            aVar.e = this.j;
            aVar.f = true;
        }
    }

    @Override // androidx.recyclerview.widget.s
    public final float j(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
