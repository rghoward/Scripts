package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tj6 extends RecyclerView.n {
    public final /* synthetic */ rj6 a;

    public tj6(rj6 rj6Var) {
        this.a = rj6Var;
        f6b.e(null);
        f6b.e(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof prb) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            ArrayList arrayListI = this.a.v.i();
            int size = arrayListI.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListI.get(i);
                i++;
                ((ks7) obj).getClass();
            }
        }
    }
}
