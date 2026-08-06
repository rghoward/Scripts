package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class xhb<V extends View> extends CoordinatorLayout.c<V> {
    public yhb t;
    public int u;

    public xhb() {
        this.u = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        y(coordinatorLayout, v, i);
        if (this.t == null) {
            this.t = new yhb(v);
        }
        yhb yhbVar = this.t;
        View view = yhbVar.a;
        yhbVar.b = view.getTop();
        yhbVar.c = view.getLeft();
        this.t.a();
        int i2 = this.u;
        if (i2 == 0) {
            return true;
        }
        yhb yhbVar2 = this.t;
        if (yhbVar2.d != i2) {
            yhbVar2.d = i2;
            yhbVar2.a();
        }
        this.u = 0;
        return true;
    }

    public final int w() {
        yhb yhbVar = this.t;
        if (yhbVar != null) {
            return yhbVar.d;
        }
        return 0;
    }

    public int x() {
        return w();
    }

    public void y(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.r(i, v);
    }

    public xhb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = 0;
    }
}
