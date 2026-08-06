package defpackage;

import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jb9 {
    public final Region a = new Region();

    public final boolean a(gg5 gg5Var) {
        return this.a.op(gg5Var.a, gg5Var.b, gg5Var.c, gg5Var.d, Region.Op.DIFFERENCE);
    }

    public final gg5 b() {
        Rect bounds = this.a.getBounds();
        return new gg5(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    public final boolean c(jb9 jb9Var) {
        return this.a.op(jb9Var.a, Region.Op.INTERSECT);
    }

    public final void d(gg5 gg5Var) {
        this.a.set(gg5Var.a, gg5Var.b, gg5Var.c, gg5Var.d);
    }
}
