package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nj0 extends db1<mj0<? extends oj0<? extends r55<? extends qj3>>>> {
    public sf6 A;
    public float B;
    public float C;
    public float D;
    public r55 E;
    public VelocityTracker F;
    public long G;
    public sf6 H;
    public sf6 I;
    public float J;
    public float K;
    public Matrix x;
    public Matrix y;
    public sf6 z;

    public static float d(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    public final sf6 a(float f, float f2) {
        mj0 mj0Var = this.w;
        bib viewPortHandler = mj0Var.getViewPortHandler();
        float f3 = f - viewPortHandler.b.left;
        b();
        return sf6.b(f3, -((mj0Var.getMeasuredHeight() - f2) - viewPortHandler.h()));
    }

    public final void b() {
        mj0 mj0Var = this.w;
        if (this.E == null) {
            mj0Var.r0.getClass();
            mj0Var.s0.getClass();
        }
        r55 r55Var = this.E;
        if (r55Var != null) {
            mj0Var.h(r55Var.G());
        }
    }

    public final void c(MotionEvent motionEvent) {
        this.y.set(this.x);
        sf6 sf6Var = this.z;
        sf6Var.b = motionEvent.getX();
        sf6Var.c = motionEvent.getY();
        mj0 mj0Var = this.w;
        rw4 rw4VarC = mj0Var.c(motionEvent.getX(), motionEvent.getY());
        this.E = rw4VarC != null ? (r55) ((oj0) mj0Var.u).b(rw4VarC.f) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        mj0 mj0Var = this.w;
        mj0Var.getOnChartGestureListener();
        if (mj0Var.e0 && ((oj0) mj0Var.getData()).d() > 0) {
            sf6 sf6VarA = a(motionEvent.getX(), motionEvent.getY());
            float f = mj0Var.i0 ? 1.4f : 1.0f;
            float f2 = mj0Var.j0 ? 1.4f : 1.0f;
            float f3 = sf6VarA.b;
            float f4 = sf6VarA.c;
            bib bibVar = mj0Var.L;
            Matrix matrix = mj0Var.B0;
            bibVar.getClass();
            matrix.reset();
            matrix.set(bibVar.a);
            matrix.postScale(f, f2, f3, -f4);
            mj0Var.L.i(matrix, mj0Var, false);
            mj0Var.b();
            mj0Var.postInvalidate();
            if (mj0Var.t) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + sf6VarA.b + ", y: " + sf6VarA.c);
            }
            sf6.c(sf6VarA);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.w.getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.w.getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        mj0 mj0Var = this.w;
        mj0Var.getOnChartGestureListener();
        if (!mj0Var.v) {
            return false;
        }
        rw4 rw4VarC = mj0Var.c(motionEvent.getX(), motionEvent.getY());
        if (rw4VarC == null || rw4VarC.a(this.u)) {
            mj0Var.d(null, true);
            this.u = null;
        } else {
            mj0Var.d(rw4VarC, true);
            this.u = rw4VarC;
        }
        return super.onSingleTapUp(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01d3  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        rw4 rw4VarC;
        VelocityTracker velocityTracker;
        Matrix matrix = this.y;
        sf6 sf6Var = this.I;
        sf6 sf6Var2 = this.H;
        sf6 sf6Var3 = this.A;
        sf6 sf6Var4 = this.z;
        mj0 mj0Var = this.w;
        if (this.F == null) {
            this.F = VelocityTracker.obtain();
        }
        this.F.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.F) != null) {
            velocityTracker.recycle();
            this.F = null;
        }
        if (this.t == 0) {
            this.v.onTouchEvent(motionEvent);
        }
        if (!mj0Var.g0 && !mj0Var.h0 && !mj0Var.i0 && !mj0Var.j0) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            int i = 0;
            if (action == 1) {
                VelocityTracker velocityTracker2 = this.F;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, t6b.c);
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((Math.abs(xVelocity) > t6b.b || Math.abs(yVelocity) > t6b.b) && this.t == 1 && mj0Var.w) {
                    sf6Var.b = 0.0f;
                    sf6Var.c = 0.0f;
                    this.G = AnimationUtils.currentAnimationTimeMillis();
                    sf6Var2.b = motionEvent.getX();
                    sf6Var2.c = motionEvent.getY();
                    sf6Var.b = xVelocity;
                    sf6Var.c = yVelocity;
                    mj0Var.postInvalidateOnAnimation();
                }
                int i2 = this.t;
                if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                    mj0Var.b();
                    mj0Var.postInvalidate();
                }
                this.t = 0;
                ViewParent parent = mj0Var.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.F;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.F = null;
                }
                mj0Var.getOnChartGestureListener();
            } else if (action == 2) {
                int i3 = this.t;
                if (i3 == 1) {
                    ViewParent parent2 = mj0Var.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    float x = mj0Var.g0 ? motionEvent.getX() - sf6Var4.b : 0.0f;
                    float y = mj0Var.h0 ? motionEvent.getY() - sf6Var4.c : 0.0f;
                    this.x.set(matrix);
                    mj0Var.getOnChartGestureListener();
                    b();
                    this.x.postTranslate(x, y);
                } else if (i3 == 2 || i3 == 3 || i3 == 4) {
                    ViewParent parent3 = mj0Var.getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(true);
                    }
                    if ((mj0Var.i0 || mj0Var.j0) && motionEvent.getPointerCount() >= 2) {
                        mj0Var.getOnChartGestureListener();
                        float fD = d(motionEvent);
                        if (fD > this.K) {
                            sf6 sf6VarA = a(sf6Var3.b, sf6Var3.c);
                            bib viewPortHandler = mj0Var.getViewPortHandler();
                            int i4 = this.t;
                            if (i4 == 4) {
                                float f = fD / this.D;
                                boolean z = f < 1.0f;
                                boolean z2 = !z ? viewPortHandler.i >= viewPortHandler.h : viewPortHandler.i <= viewPortHandler.g;
                                if (!z ? viewPortHandler.j < viewPortHandler.f : viewPortHandler.j > viewPortHandler.e) {
                                    i = 1;
                                }
                                float f2 = mj0Var.i0 ? f : 1.0f;
                                float f3 = mj0Var.j0 ? f : 1.0f;
                                if (i != 0 || z2) {
                                    this.x.set(matrix);
                                    this.x.postScale(f2, f3, sf6VarA.b, sf6VarA.c);
                                }
                            } else if (i4 == 2 && mj0Var.i0) {
                                float fAbs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.B;
                                if (fAbs >= 1.0f ? viewPortHandler.i < viewPortHandler.h : viewPortHandler.i > viewPortHandler.g) {
                                    this.x.set(matrix);
                                    this.x.postScale(fAbs, 1.0f, sf6VarA.b, sf6VarA.c);
                                }
                            } else if (i4 == 3 && mj0Var.j0) {
                                float fAbs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.C;
                                if (fAbs2 >= 1.0f ? viewPortHandler.j < viewPortHandler.f : viewPortHandler.j > viewPortHandler.e) {
                                    this.x.set(matrix);
                                    this.x.postScale(1.0f, fAbs2, sf6VarA.b, sf6VarA.c);
                                }
                            }
                            sf6.c(sf6VarA);
                        }
                    }
                } else if (i3 == 0) {
                    float x2 = motionEvent.getX() - sf6Var4.b;
                    float y2 = motionEvent.getY() - sf6Var4.c;
                    if (Math.abs((float) Math.sqrt((y2 * y2) + (x2 * x2))) > this.J && (mj0Var.g0 || mj0Var.h0)) {
                        bib bibVar = mj0Var.L;
                        if (bibVar.a() && bibVar.b()) {
                            bib bibVar2 = mj0Var.L;
                            if (bibVar2.l > 0.0f || bibVar2.m > 0.0f) {
                                float fAbs3 = Math.abs(motionEvent.getX() - sf6Var4.b);
                                float fAbs4 = Math.abs(motionEvent.getY() - sf6Var4.c);
                                if (mj0Var.g0) {
                                    this.t = 1;
                                } else {
                                    this.t = 1;
                                }
                            } else {
                                boolean z3 = mj0Var.f0;
                                if (z3 && z3 && (rw4VarC = mj0Var.c(motionEvent.getX(), motionEvent.getY())) != null && !rw4VarC.a(this.u)) {
                                    this.u = rw4VarC;
                                    mj0Var.d(rw4VarC, true);
                                }
                            }
                        } else {
                            float fAbs5 = Math.abs(motionEvent.getX() - sf6Var4.b);
                            float fAbs6 = Math.abs(motionEvent.getY() - sf6Var4.c);
                            if ((mj0Var.g0 || fAbs6 >= fAbs5) && (mj0Var.h0 || fAbs6 <= fAbs5)) {
                                this.t = 1;
                            }
                        }
                    }
                }
            } else if (action == 3) {
                this.t = 0;
                mj0Var.getOnChartGestureListener();
            } else if (action != 5) {
                if (action == 6) {
                    VelocityTracker velocityTracker4 = this.F;
                    velocityTracker4.computeCurrentVelocity(1000, t6b.c);
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float xVelocity2 = velocityTracker4.getXVelocity(pointerId2);
                    float yVelocity2 = velocityTracker4.getYVelocity(pointerId2);
                    int pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        if (i != actionIndex) {
                            int pointerId3 = motionEvent.getPointerId(i);
                            if ((velocityTracker4.getYVelocity(pointerId3) * yVelocity2) + (velocityTracker4.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                                velocityTracker4.clear();
                                break;
                            }
                        }
                        i++;
                    }
                    this.t = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ViewParent parent4 = mj0Var.getParent();
                if (parent4 != null) {
                    parent4.requestDisallowInterceptTouchEvent(true);
                }
                c(motionEvent);
                this.B = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                this.C = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                float fD2 = d(motionEvent);
                this.D = fD2;
                if (fD2 > 10.0f) {
                    if (mj0Var.d0) {
                        this.t = 4;
                    } else {
                        boolean z4 = mj0Var.i0;
                        if (z4 != mj0Var.j0) {
                            this.t = z4 ? 2 : 3;
                        } else {
                            this.t = this.B > this.C ? 2 : 3;
                        }
                    }
                }
                float x3 = motionEvent.getX(1) + motionEvent.getX(0);
                float y3 = motionEvent.getY(1) + motionEvent.getY(0);
                sf6Var3.b = x3 / 2.0f;
                sf6Var3.c = y3 / 2.0f;
            }
        } else {
            mj0Var.getOnChartGestureListener();
            sf6Var.b = 0.0f;
            sf6Var.c = 0.0f;
            c(motionEvent);
        }
        bib viewPortHandler2 = mj0Var.getViewPortHandler();
        Matrix matrix2 = this.x;
        viewPortHandler2.i(matrix2, mj0Var, true);
        this.x = matrix2;
        return true;
    }
}
