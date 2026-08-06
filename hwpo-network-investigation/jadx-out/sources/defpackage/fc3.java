package defpackage;

import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fc3 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ fc3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                rb3 rb3Var = (rb3) obj;
                rb3.a aVar = rb3.Companion;
                NestedScrollView nestedScrollView = rb3Var.r().o;
                nestedScrollView.v(0 - nestedScrollView.getScrollX(), false, rb3Var.r().d.getTop() - nestedScrollView.getScrollY());
                break;
            default:
                ((mzc) obj).b();
                break;
        }
    }
}
