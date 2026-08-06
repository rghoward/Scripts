package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ob5 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ pb5 t;

    public ob5(pb5 pb5Var) {
        this.t = pb5Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        pb5 pb5Var = this.t;
        cm.k kVar = pb5Var.a;
        if (!pb5Var.c) {
            int i = pb5Var.b;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    cm.this.getFocusOwner().j(f > 0.0f ? 1 : 2, false);
                    g2b g2bVar = g2b.a;
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                cm.this.getFocusOwner().j(f2 > 0.0f ? 1 : 2, false);
                g2b g2bVar2 = g2b.a;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
