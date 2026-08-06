package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lib implements ViewTreeObserver.OnPreDrawListener {
    public boolean t;
    public final /* synthetic */ mib<View> u;
    public final /* synthetic */ ViewTreeObserver v;
    public final /* synthetic */ e41 w;

    public lib(mib mibVar, ViewTreeObserver viewTreeObserver, e41 e41Var) {
        this.u = mibVar;
        this.v = viewTreeObserver;
        this.w = e41Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        mib<View> mibVar = this.u;
        br9 size = mibVar.getSize();
        if (size != null) {
            mibVar.d(this.v, this);
            if (!this.t) {
                this.t = true;
                this.w.resumeWith(size);
            }
        }
        return true;
    }
}
