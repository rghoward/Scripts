package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hs1 extends View.DragShadowBuilder {
    public final xx2 a;
    public final long b;
    public final oh4<d73, g2b> c;

    public hs1(xx2 xx2Var, long j, oh4 oh4Var) {
        this.a = xx2Var;
        this.b = j;
        this.c = oh4Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        s41 s41Var = new s41();
        Canvas canvas2 = pl.a;
        ol olVar = new ol();
        olVar.a = canvas;
        s41.a aVar = s41Var.t;
        tx2 tx2Var = aVar.a;
        tq5 tq5Var = aVar.b;
        n41 n41Var = aVar.c;
        long j = aVar.d;
        aVar.a = this.a;
        aVar.b = tq5.t;
        aVar.c = olVar;
        aVar.d = this.b;
        olVar.f();
        this.c.invoke(s41Var);
        olVar.o();
        aVar.a = tx2Var;
        aVar.b = tq5Var;
        aVar.c = n41Var;
        aVar.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        xx2 xx2Var = this.a;
        point.set(xx2Var.n1(fIntBitsToFloat / xx2Var.getDensity()), xx2Var.n1(Float.intBitsToFloat((int) (j & 4294967295L)) / xx2Var.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
