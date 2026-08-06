package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vra extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, hl7.a {
    public final qx9.a v;
    public final GestureDetector x;
    public final PointF t = new PointF();
    public final PointF u = new PointF();
    public final float w = 25.0f;
    public volatile float y = 3.1415927f;

    public vra(Context context, qx9.a aVar) {
        this.v = aVar;
        this.x = new GestureDetector(context, this);
    }

    @Override // hl7.a
    public final void a(float[] fArr, float f) {
        this.y = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.t.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.t.x) / this.w;
        float y = motionEvent2.getY();
        PointF pointF = this.t;
        float f3 = (y - pointF.y) / this.w;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.y;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.u;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        qx9.a aVar = this.v;
        PointF pointF3 = this.u;
        synchronized (aVar) {
            float f5 = pointF3.y;
            aVar.z = f5;
            Matrix.setRotateM(aVar.x, 0, -f5, (float) Math.cos(aVar.A), (float) Math.sin(aVar.A), 0.0f);
            Matrix.setRotateM(aVar.y, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return qx9.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.x.onTouchEvent(motionEvent);
    }
}
