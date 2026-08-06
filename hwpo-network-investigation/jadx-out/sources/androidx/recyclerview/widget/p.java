package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import com.hwpo_training_app.R;
import defpackage.egb;
import defpackage.fib;
import defpackage.g7a;
import defpackage.go;
import defpackage.z90;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class p extends RecyclerView.n implements RecyclerView.q {
    public Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final g7a m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public GestureDetector x;
    public e y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public RecyclerView.e0 c = null;
    public int l = -1;
    public int n = 0;
    public final ArrayList p = new ArrayList();
    public final a s = new a();
    public View w = null;
    public final b z = new b();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007b  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
        @Override // java.lang.Runnable
        public final void run() {
            int iD;
            int iD2;
            p pVar = p.this;
            if (pVar.c != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = pVar.B;
                long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                RecyclerView.o layoutManager = pVar.r.getLayoutManager();
                if (pVar.A == null) {
                    pVar.A = new Rect();
                }
                layoutManager.d(pVar.A, pVar.c.a);
                if (layoutManager.e()) {
                    int i = (int) (pVar.j + pVar.h);
                    int paddingLeft = (i - pVar.A.left) - pVar.r.getPaddingLeft();
                    float f = pVar.h;
                    if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((pVar.c.a.getWidth() + i) + pVar.A.right) - (pVar.r.getWidth() - pVar.r.getPaddingRight())) <= 0)) {
                        iD = 0;
                    } else {
                        iD = paddingLeft;
                    }
                } else {
                    iD = 0;
                }
                if (layoutManager.f()) {
                    int i2 = (int) (pVar.k + pVar.i);
                    iD2 = (i2 - pVar.A.top) - pVar.r.getPaddingTop();
                    float f2 = pVar.i;
                    if ((f2 >= 0.0f || iD2 >= 0) && (f2 <= 0.0f || (iD2 = ((pVar.c.a.getHeight() + i2) + pVar.A.bottom) - (pVar.r.getHeight() - pVar.r.getPaddingBottom())) <= 0)) {
                        iD2 = 0;
                    }
                } else {
                    iD2 = 0;
                }
                if (iD != 0) {
                    g7a g7aVar = pVar.m;
                    RecyclerView recyclerView = pVar.r;
                    int width = pVar.c.a.getWidth();
                    pVar.r.getWidth();
                    iD = g7aVar.d(recyclerView, width, iD, j2);
                }
                int i3 = iD;
                if (iD2 != 0) {
                    g7a g7aVar2 = pVar.m;
                    RecyclerView recyclerView2 = pVar.r;
                    int height = pVar.c.a.getHeight();
                    pVar.r.getHeight();
                    iD2 = g7aVar2.d(recyclerView2, height, iD2, j2);
                }
                if (i3 == 0 && iD2 == 0) {
                    pVar.B = Long.MIN_VALUE;
                    return;
                }
                if (pVar.B == Long.MIN_VALUE) {
                    pVar.B = jCurrentTimeMillis;
                }
                pVar.r.scrollBy(i3, iD2);
                RecyclerView.e0 e0Var = pVar.c;
                if (e0Var != null) {
                    pVar.p(e0Var);
                }
                pVar.r.removeCallbacks(pVar.s);
                RecyclerView recyclerView3 = pVar.r;
                WeakHashMap<View, fib> weakHashMap = egb.a;
                recyclerView3.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void a(MotionEvent motionEvent) {
            p pVar = p.this;
            a aVar = pVar.s;
            pVar.x.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = pVar.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (pVar.l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(pVar.l);
            if (iFindPointerIndex >= 0) {
                pVar.j(actionMasked, iFindPointerIndex, motionEvent);
            }
            RecyclerView.e0 e0Var = pVar.c;
            if (e0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        pVar.r(pVar.o, iFindPointerIndex, motionEvent);
                        pVar.p(e0Var);
                        pVar.r.removeCallbacks(aVar);
                        aVar.run();
                        pVar.r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == pVar.l) {
                        pVar.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        pVar.r(pVar.o, actionIndex, motionEvent);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = pVar.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            pVar.q(null, 0);
            pVar.l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final boolean d(MotionEvent motionEvent) {
            int iFindPointerIndex;
            p pVar = p.this;
            pVar.x.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                pVar.l = motionEvent.getPointerId(0);
                pVar.d = motionEvent.getX();
                pVar.e = motionEvent.getY();
                VelocityTracker velocityTracker = pVar.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                pVar.t = VelocityTracker.obtain();
                if (pVar.c == null) {
                    ArrayList arrayList = pVar.p;
                    if (!arrayList.isEmpty()) {
                        View viewM = pVar.m(motionEvent);
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.e.a == viewM) {
                                fVar = fVar2;
                                break;
                            }
                        }
                    }
                    if (fVar != null) {
                        RecyclerView.e0 e0Var = fVar.e;
                        pVar.d -= fVar.i;
                        pVar.e -= fVar.j;
                        pVar.l(e0Var, true);
                        if (pVar.a.remove(e0Var.a)) {
                            pVar.m.getClass();
                            d.a(e0Var);
                        }
                        pVar.q(e0Var, fVar.f);
                        pVar.r(pVar.o, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                pVar.l = -1;
                pVar.q(null, 0);
            } else {
                int i = pVar.l;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    pVar.j(actionMasked, iFindPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = pVar.t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return pVar.c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void e(boolean z) {
            if (z) {
                p.this.q(null, 0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends f {
        public final /* synthetic */ int n;
        public final /* synthetic */ RecyclerView.e0 o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.e0 e0Var, int i, float f, float f2, float f3, float f4, int i2, RecyclerView.e0 e0Var2) {
            super(e0Var, i, f, f2, f3, f4);
            this.n = i2;
            this.o = e0Var2;
        }

        @Override // androidx.recyclerview.widget.p.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.k) {
                return;
            }
            int i = this.n;
            RecyclerView.e0 e0Var = this.o;
            p pVar = p.this;
            if (i <= 0) {
                pVar.m.getClass();
                d.a(e0Var);
            } else {
                pVar.a.add(e0Var.a);
                this.h = true;
                if (i > 0) {
                    a0 a0Var = (a0) pVar;
                    a0Var.r.post(new z(this, a0Var, i));
                }
            }
            View view = pVar.w;
            View view2 = e0Var.a;
            if (view == view2 && view2 == view) {
                pVar.w = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class d {
        public static final a b = new a();
        public static final b c = new b();
        public int a;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static void a(RecyclerView.e0 e0Var) {
            View view = e0Var.a;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap<View, fib> weakHashMap = egb.a;
                view.setElevation(fFloatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public static int b(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public static int c(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public final int d(RecyclerView recyclerView, int i, int i2, long j) {
            if (this.a == -1) {
                this.a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int interpolation = (int) (b.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.a)));
            if (interpolation == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return interpolation;
        }

        public void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f, float f2, int i, boolean z) {
            View view = e0Var.a;
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, fib> weakHashMap = egb.a;
                Float fValueOf = Float.valueOf(view.getElevation());
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        WeakHashMap<View, fib> weakHashMap2 = egb.a;
                        float elevation = childAt.getElevation();
                        if (elevation > f3) {
                            f3 = elevation;
                        }
                    }
                }
                view.setElevation(f3 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e extends GestureDetector.SimpleOnGestureListener {
        public boolean t = true;
        public final /* synthetic */ a0 u;

        public e(a0 a0Var) {
            this.u = a0Var;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            View viewM;
            RecyclerView.e0 e0VarN;
            a0 a0Var = this.u;
            g7a g7aVar = a0Var.m;
            if (!this.t || (viewM = a0Var.m(motionEvent)) == null || (e0VarN = a0Var.r.N(viewM)) == null) {
                return;
            }
            if ((d.b(g7aVar.f(), a0Var.r.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i = a0Var.l;
                if (pointerId == i) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    a0Var.d = x;
                    a0Var.e = y;
                    a0Var.i = 0.0f;
                    a0Var.h = 0.0f;
                    g7aVar.getClass();
                    a0Var.q(e0VarN, 2);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class g extends d {
        public int d;

        public final int f() {
            int i = this.d;
            return i | (i << 8);
        }
    }

    public p(g7a g7aVar) {
        this.m = g7aVar;
    }

    public static boolean o(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(View view) {
        if (view == this.w) {
            this.w = null;
        }
        RecyclerView.e0 e0VarN = this.r.N(view);
        if (e0VarN == null) {
            return;
        }
        RecyclerView.e0 e0Var = this.c;
        if (e0Var != null && e0VarN == e0Var) {
            q(null, 0);
            return;
        }
        l(e0VarN, false);
        if (this.a.remove(e0VarN.a)) {
            this.m.getClass();
            d.a(e0VarN);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        float f2;
        float f3;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        RecyclerView.e0 e0Var = this.c;
        int i = this.n;
        g7a g7aVar = this.m;
        g7aVar.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            f fVar = (f) arrayList.get(i2);
            RecyclerView.e0 e0Var2 = fVar.e;
            float f5 = fVar.a;
            float f6 = fVar.c;
            if (f5 == f6) {
                fVar.i = e0Var2.a.getTranslationX();
            } else {
                fVar.i = go.a(f6, f5, fVar.m, f5);
            }
            float f7 = fVar.b;
            float f8 = fVar.d;
            if (f7 == f8) {
                fVar.j = e0Var2.a.getTranslationY();
            } else {
                fVar.j = go.a(f8, f7, fVar.m, f7);
            }
            int iSave = canvas.save();
            RecyclerView.e0 e0Var3 = fVar.e;
            float f9 = fVar.i;
            float f10 = fVar.j;
            int i3 = fVar.f;
            g7a g7aVar2 = g7aVar;
            g7aVar2.e(canvas, recyclerView, e0Var3, f9, f10, i3, false);
            canvas.restoreToCount(iSave);
            i2++;
            g7aVar = g7aVar2;
        }
        g7a g7aVar3 = g7aVar;
        if (e0Var != null) {
            int iSave2 = canvas.save();
            g7aVar3.e(canvas, recyclerView, e0Var, f3, f2, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f2 = fArr[0];
            float f3 = fArr[1];
        }
        RecyclerView.e0 e0Var = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f fVar = (f) arrayList.get(i);
            int iSave = canvas.save();
            View view = fVar.e.a;
            canvas.restoreToCount(iSave);
        }
        if (e0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            f fVar2 = (f) arrayList.get(i2);
            boolean z2 = fVar2.l;
            if (z2 && !fVar2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final int i(RecyclerView.e0 e0Var, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        g7a g7aVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f2 = this.g;
            g7aVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f2);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fG = g7aVar.g(e0Var) * this.r.getWidth();
        if ((i & i2) == 0 || Math.abs(this.h) <= fG) {
            return 0;
        }
        return i2;
    }

    public final void j(int i, int i2, MotionEvent motionEvent) {
        View viewM;
        if (this.c == null && i == 2 && this.n != 2) {
            g7a g7aVar = this.m;
            g7aVar.getClass();
            if (this.r.getScrollState() == 1) {
                return;
            }
            RecyclerView.o layoutManager = this.r.getLayoutManager();
            int i3 = this.l;
            RecyclerView.e0 e0VarN = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.d;
                float y = motionEvent.getY(iFindPointerIndex) - this.e;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f2 = this.q;
                if ((fAbs >= f2 || fAbs2 >= f2) && ((fAbs <= fAbs2 || !layoutManager.e()) && ((fAbs2 <= fAbs || !layoutManager.f()) && (viewM = m(motionEvent)) != null))) {
                    e0VarN = this.r.N(viewM);
                }
            }
            if (e0VarN == null) {
                return;
            }
            int iB = (d.b(g7aVar.f(), this.r.getLayoutDirection()) & 65280) >> 8;
            if (iB == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f3 = x2 - this.d;
            float f4 = y2 - this.e;
            float fAbs3 = Math.abs(f3);
            float fAbs4 = Math.abs(f4);
            float f5 = this.q;
            if (fAbs3 >= f5 || fAbs4 >= f5) {
                if (fAbs3 > fAbs4) {
                    if (f3 < 0.0f && (iB & 4) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (iB & 8) == 0) {
                        return;
                    }
                } else {
                    if (f4 < 0.0f && (iB & 1) == 0) {
                        return;
                    }
                    if (f4 > 0.0f && (iB & 2) == 0) {
                        return;
                    }
                }
                this.i = 0.0f;
                this.h = 0.0f;
                this.l = motionEvent.getPointerId(0);
                q(e0VarN, 1);
            }
        }
    }

    public final int k(RecyclerView.e0 e0Var, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        g7a g7aVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f2 = this.g;
            g7aVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f2);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float fG = g7aVar.g(e0Var) * this.r.getHeight();
        if ((i & i2) == 0 || Math.abs(this.i) <= fG) {
            return 0;
        }
        return i2;
    }

    public final void l(RecyclerView.e0 e0Var, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            if (fVar.e == e0Var) {
                fVar.k |= z;
                if (!fVar.l) {
                    fVar.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.e0 e0Var = this.c;
        if (e0Var != null) {
            View view = e0Var.a;
            if (o(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            View view2 = fVar.e.a;
            if (o(view2, x, y, fVar.i, fVar.j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.r;
        for (int iE = recyclerView.y.e() - 1; iE >= 0; iE--) {
            View viewD = recyclerView.y.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (x >= viewD.getLeft() + translationX && x <= viewD.getRight() + translationX && y >= viewD.getTop() + translationY && y <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public final void n(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void p(RecyclerView.e0 e0Var) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        if (this.r.isLayoutRequested()) {
            return;
        }
        char c2 = 2;
        if (this.n != 2) {
            return;
        }
        this.m.getClass();
        int i = (int) (this.j + this.h);
        int i2 = (int) (this.k + this.i);
        View view = e0Var.a;
        if (Math.abs(i2 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i - view.getLeft()) >= view.getWidth() * 0.5f) {
            ArrayList arrayList = this.u;
            if (arrayList == null) {
                this.u = new ArrayList();
                this.v = new ArrayList();
            } else {
                arrayList.clear();
                this.v.clear();
            }
            int iRound = Math.round(this.j + this.h);
            int iRound2 = Math.round(this.k + this.i);
            int width = view.getWidth() + iRound;
            int height = view.getHeight() + iRound2;
            int i3 = (iRound + width) / 2;
            int i4 = (iRound2 + height) / 2;
            RecyclerView.o layoutManager = this.r.getLayoutManager();
            int iW = layoutManager.w();
            int i5 = 0;
            while (i5 < iW) {
                char c3 = c2;
                View viewV = layoutManager.v(i5);
                if (viewV != view && viewV.getBottom() >= iRound2 && viewV.getTop() <= height && viewV.getRight() >= iRound && viewV.getLeft() <= width) {
                    RecyclerView.e0 e0VarN = this.r.N(viewV);
                    int iAbs5 = Math.abs(i3 - ((viewV.getRight() + viewV.getLeft()) / 2));
                    int iAbs6 = Math.abs(i4 - ((viewV.getBottom() + viewV.getTop()) / 2));
                    int i6 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                    int size = this.u.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size) {
                        int i9 = size;
                        if (i6 <= ((Integer) this.v.get(i7)).intValue()) {
                            break;
                        }
                        i8++;
                        i7++;
                        size = i9;
                    }
                    this.u.add(i8, e0VarN);
                    this.v.add(i8, Integer.valueOf(i6));
                }
                i5++;
                c2 = c3;
                i = i;
                i2 = i2;
            }
            int i10 = i;
            int i11 = i2;
            ArrayList arrayList2 = this.u;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = view.getWidth() + i10;
            int height2 = view.getHeight() + i11;
            int left2 = i10 - view.getLeft();
            int top2 = i11 - view.getTop();
            int size2 = arrayList2.size();
            RecyclerView.e0 e0Var2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size2; i13++) {
                RecyclerView.e0 e0Var3 = (RecyclerView.e0) arrayList2.get(i13);
                if (left2 > 0 && (right = e0Var3.a.getRight() - width2) < 0 && e0Var3.a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    e0Var2 = e0Var3;
                    i12 = iAbs4;
                }
                if (left2 < 0 && (left = e0Var3.a.getLeft() - i10) > 0 && e0Var3.a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    e0Var2 = e0Var3;
                    i12 = iAbs3;
                }
                if (top2 < 0 && (top = e0Var3.a.getTop() - i11) > 0 && e0Var3.a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    e0Var2 = e0Var3;
                    i12 = iAbs2;
                }
                if (top2 > 0 && (bottom = e0Var3.a.getBottom() - height2) < 0 && e0Var3.a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    e0Var2 = e0Var3;
                    i12 = iAbs;
                }
            }
            if (e0Var2 == null) {
                this.u.clear();
                this.v.clear();
            } else {
                e0Var2.b();
                e0Var.b();
                this.r.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [androidx.recyclerview.widget.p] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.recyclerview.widget.RecyclerView$e0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void q(RecyclerView.e0 e0Var, int i) {
        g7a g7aVar;
        ?? r12;
        boolean z;
        ?? r13;
        ?? r14;
        RecyclerView.e0 e0Var2;
        boolean z2;
        int iK;
        char c2;
        float fSignum;
        Object obj;
        long j;
        if (e0Var == this.c && i == this.n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i2 = this.n;
        l(e0Var, true);
        this.n = i;
        if (i == 2) {
            if (e0Var == null) {
                z90.a("Must pass a ViewHolder when dragging");
                return;
            }
            this.w = e0Var.a;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.c;
        g7a g7aVar2 = this.m;
        if (r2 != 0) {
            View view = r2.a;
            if (view.getParent() != null) {
                if (i2 == 2 || this.n == 2) {
                    iK = 0;
                } else {
                    int iF = g7aVar2.f();
                    int iB = (d.b(iF, this.r.getLayoutDirection()) & 65280) >> 8;
                    if (iB == 0) {
                        iK = 0;
                    } else {
                        int i4 = (iF & 65280) >> 8;
                        if (Math.abs(this.h) > Math.abs(this.i)) {
                            iK = i(r2, iB);
                            if (iK <= 0) {
                                iK = k(r2, iB);
                                if (iK <= 0) {
                                    iK = 0;
                                }
                            } else if ((i4 & iK) == 0) {
                                iK = d.c(iK, this.r.getLayoutDirection());
                            }
                        } else {
                            iK = k(r2, iB);
                            if (iK <= 0) {
                                iK = i(r2, iB);
                                if (iK <= 0) {
                                    iK = 0;
                                } else if ((i4 & iK) == 0) {
                                    iK = d.c(iK, this.r.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.t = null;
                }
                char c3 = 4;
                float fSignum2 = 0.0f;
                if (iK == 1 || iK == 2) {
                    c2 = 0;
                    fSignum = Math.signum(this.i) * this.r.getHeight();
                    obj = null;
                } else if (iK == 4 || iK == 8 || iK == 16 || iK == 32) {
                    c2 = 0;
                    obj = null;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.h) * this.r.getWidth();
                } else {
                    obj = null;
                    c2 = 0;
                    fSignum = 0.0f;
                }
                if (i2 == 2) {
                    c3 = '\b';
                } else if (iK > 0) {
                    c3 = 2;
                }
                float[] fArr = this.b;
                n(fArr);
                g7aVar = g7aVar2;
                char c4 = c3;
                ?? r15 = c2;
                c cVar = new c(r2, i2, fArr[c2], fArr[1], fSignum2, fSignum, iK, r2);
                RecyclerView recyclerView = this.r;
                g7aVar.getClass();
                RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator == null) {
                    j = c4 == '\b' ? 200L : 250L;
                } else {
                    j = c4 == '\b' ? itemAnimator.e : itemAnimator.d;
                }
                ValueAnimator valueAnimator = cVar.g;
                valueAnimator.setDuration(j);
                this.p.add(cVar);
                r2.p(r15);
                valueAnimator.start();
                z2 = true;
                e0Var2 = null;
                r14 = r15;
            } else {
                g7aVar = g7aVar2;
                r14 = 0;
                if (view == this.w) {
                    e0Var2 = null;
                    this.w = null;
                } else {
                    e0Var2 = null;
                }
                g7aVar.getClass();
                d.a(r2);
                z2 = false;
            }
            this.c = e0Var2;
            z = z2;
            r12 = r14;
        } else {
            g7aVar = g7aVar2;
            r12 = 0;
            z = false;
        }
        if (e0Var != null) {
            View view2 = e0Var.a;
            this.o = (d.b(g7aVar.f(), this.r.getLayoutDirection()) & i3) >> (this.n * 8);
            this.j = view2.getLeft();
            this.k = view2.getTop();
            this.c = e0Var;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.r.getParent();
        if (parent != 0) {
            if (this.c != null) {
                r13 = r12;
                r13 = 1;
            }
            r13 = r12;
            parent.requestDisallowInterceptTouchEvent(r13);
        }
        if (!z) {
            this.r.getLayoutManager().f = true;
        }
        g7aVar.getClass();
        this.r.invalidate();
    }

    public final void r(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f2 = x - this.d;
        this.h = f2;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            this.h = Math.max(0.0f, f2);
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f implements Animator.AnimatorListener {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final RecyclerView.e0 e;
        public final int f;
        public final ValueAnimator g;
        public boolean h;
        public float i;
        public float j;
        public boolean k = false;
        public boolean l = false;
        public float m;

        public f(RecyclerView.e0 e0Var, int i, float f, float f2, float f3, float f4) {
            this.f = i;
            this.e = e0Var;
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new q(this));
            valueAnimatorOfFloat.setTarget(e0Var.a);
            valueAnimatorOfFloat.addListener(this);
            this.m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.l) {
                this.e.p(true);
            }
            this.l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void c(View view) {
    }
}
