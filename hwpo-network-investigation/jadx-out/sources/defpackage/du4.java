package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class du4<V extends View> extends xhb<V> {
    public int A;
    public VelocityTracker B;
    public a v;
    public OverScroller w;
    public boolean x;
    public int y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public final CoordinatorLayout t;
        public final V u;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.t = coordinatorLayout;
            this.u = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            du4 du4Var;
            OverScroller overScroller;
            V v = this.u;
            if (v == null || (overScroller = (du4Var = du4.this).w) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.t;
            if (!zComputeScrollOffset) {
                du4Var.C(coordinatorLayout, v);
            } else {
                du4Var.E(coordinatorLayout, v, du4Var.w.getCurrY());
                v.postOnAnimation(this);
            }
        }
    }

    public du4() {
        this.y = -1;
        this.A = -1;
    }

    public int A(V v) {
        return -v.getHeight();
    }

    public int B(V v) {
        return v.getHeight();
    }

    public int D(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iD;
        int iW = w();
        if (i2 == 0 || iW < i2 || iW > i3 || iW == (iD = ym7.d(i, i2, i3))) {
            return 0;
        }
        yhb yhbVar = this.t;
        if (yhbVar == null) {
            this.u = iD;
        } else if (yhbVar.d != iD) {
            yhbVar.d = iD;
            yhbVar.a();
        }
        return iW - iD;
    }

    public final void E(CoordinatorLayout coordinatorLayout, View view, int i) {
        D(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y;
        boolean z;
        OverScroller overScroller;
        int iFindPointerIndex;
        if (this.A < 0) {
            this.A = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.x) {
            int i = this.y;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.z) > this.A) {
                    this.z = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.y = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    if (z(v)) {
                        z = false;
                    } else {
                        z = false;
                    }
                    this.x = z;
                    if (z) {
                        this.z = y;
                        this.y = motionEvent.getPointerId(0);
                        if (this.B == null) {
                            this.B = VelocityTracker.obtain();
                        }
                        overScroller = this.w;
                        if (overScroller != null) {
                            this.w.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.B;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.y = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (z(v) || !coordinatorLayout.p(v, x2, y)) {
                    z = false;
                } else {
                    z = true;
                }
                this.x = z;
                if (z) {
                    this.z = y;
                    this.y = motionEvent.getPointerId(0);
                    if (this.B == null) {
                        this.B = VelocityTracker.obtain();
                    }
                    overScroller = this.w;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.w.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.B;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8 A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.y);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i = this.z - y;
                    this.z = y;
                    D(coordinatorLayout, v, x() - i, A(v), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.y = motionEvent.getPointerId(i2);
                    this.z = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.B;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.x || z;
        }
        VelocityTracker velocityTracker3 = this.B;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.B.computeCurrentVelocity(1000);
            float yVelocity = this.B.getYVelocity(this.y);
            int i3 = -B(v);
            Runnable runnable = this.v;
            if (runnable != null) {
                v.removeCallbacks(runnable);
                this.v = null;
            }
            if (this.w == null) {
                this.w = new OverScroller(v.getContext());
            }
            this.w.fling(0, w(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.w.computeScrollOffset()) {
                a aVar = new a(coordinatorLayout, v);
                this.v = aVar;
                v.postOnAnimation(aVar);
            } else {
                C(coordinatorLayout, v);
            }
            z = true;
        }
        this.x = false;
        this.y = -1;
        velocityTracker = this.B;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.B = null;
        }
        velocityTracker2 = this.B;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.x) {
        }
        z = false;
        this.x = false;
        this.y = -1;
        velocityTracker = this.B;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.B = null;
        }
        velocityTracker2 = this.B;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.x) {
        }
    }

    public boolean z(V v) {
        return false;
    }

    public du4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = -1;
        this.A = -1;
    }

    public void C(CoordinatorLayout coordinatorLayout, V v) {
    }
}
