package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final /* synthetic */ RecyclerView a;

    public b0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.q(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
