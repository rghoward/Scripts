package defpackage;

import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ec3 implements Runnable {
    public final /* synthetic */ rb3 t;

    public ec3(rb3 rb3Var) {
        this.t = rb3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rb3.a aVar = rb3.Companion;
        rb3 rb3Var = this.t;
        NestedScrollView nestedScrollView = rb3Var.r().o;
        nestedScrollView.v(0 - nestedScrollView.getScrollX(), false, rb3Var.r().e.getTop() - nestedScrollView.getScrollY());
    }
}
