package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wd5 implements View.OnTouchListener {
    public final Dialog t;
    public final int u;
    public final int v;
    public final int w;

    public wd5(Dialog dialog, Rect rect) {
        this.t = dialog;
        this.u = rect.left;
        this.v = rect.top;
        this.w = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.u;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.v;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            float f = (-this.w) - 1;
            motionEventObtain.setLocation(f, f);
        }
        view.performClick();
        return this.t.onTouchEvent(motionEventObtain);
    }
}
