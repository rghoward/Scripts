package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zhb implements RecyclerView.q {
    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void c(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) pVar).width == -1 && ((ViewGroup.MarginLayoutParams) pVar).height == -1) {
            return;
        }
        aa0.c("Pages must fill the whole ViewPager2 (use match_parent)");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(View view) {
    }
}
