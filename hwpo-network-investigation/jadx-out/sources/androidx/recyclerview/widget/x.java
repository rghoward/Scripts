package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import defpackage.z90;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public final RecyclerView.o a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public x(RecyclerView.o oVar) {
        this.a = oVar;
    }

    public static x a(RecyclerView.o oVar, int i) {
        if (i == 0) {
            return new v(oVar);
        }
        if (i == 1) {
            return new w(oVar);
        }
        z90.a("invalid orientation");
        return null;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);
}
