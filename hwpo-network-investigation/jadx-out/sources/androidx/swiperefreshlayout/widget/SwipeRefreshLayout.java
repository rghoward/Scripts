package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import defpackage.bd1;
import defpackage.c7a;
import defpackage.d7a;
import defpackage.e7a;
import defpackage.egb;
import defpackage.fib;
import defpackage.jd1;
import defpackage.l97;
import defpackage.m97;
import defpackage.n97;
import defpackage.nh8;
import defpackage.o97;
import defpackage.p97;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements o97, n97, l97 {
    public static final int[] g0 = {R.attr.enabled};
    public final m97 A;
    public final int[] B;
    public final int[] C;
    public final int[] D;
    public boolean E;
    public final int F;
    public int G;
    public float H;
    public float I;
    public boolean J;
    public int K;
    public final DecelerateInterpolator L;
    public final bd1 M;
    public int N;
    public int O;
    public final int P;
    public final int Q;
    public int R;
    public final jd1 S;
    public c7a T;
    public d7a U;
    public e7a V;
    public e7a W;
    public boolean a0;
    public int b0;
    public boolean c0;
    public final a d0;
    public final c e0;
    public final d f0;
    public View t;
    public f u;
    public boolean v;
    public final int w;
    public float x;
    public float y;
    public final p97 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = swipeRefreshLayout.Q - Math.abs(swipeRefreshLayout.P);
            int i = swipeRefreshLayout.O;
            swipeRefreshLayout.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout.M.getTop());
            jd1 jd1Var = swipeRefreshLayout.S;
            float f2 = 1.0f - f;
            jd1.a aVar = jd1Var.t;
            if (f2 != aVar.p) {
                aVar.p = f2;
            }
            jd1Var.invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends Animation {
        public d() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.e(f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface f {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = false;
        this.x = -1.0f;
        this.B = new int[2];
        this.C = new int[2];
        this.D = new int[2];
        this.K = -1;
        this.N = -1;
        this.d0 = new a();
        this.e0 = new c();
        this.f0 = new d();
        this.w = ViewConfiguration.get(context).getScaledTouchSlop();
        this.F = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.L = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.b0 = (int) (displayMetrics.density * 40.0f);
        bd1 bd1Var = new bd1(getContext());
        float f2 = bd1Var.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = bd1Var.getContext().obtainStyledAttributes(nh8.a);
        bd1Var.u = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap<View, fib> weakHashMap = egb.a;
        bd1Var.setElevation(f2 * 4.0f);
        shapeDrawable.getPaint().setColor(bd1Var.u);
        bd1Var.setBackground(shapeDrawable);
        this.M = bd1Var;
        jd1 jd1Var = new jd1(getContext());
        this.S = jd1Var;
        jd1Var.c(1);
        this.M.setImageDrawable(this.S);
        this.M.setVisibility(8);
        addView(this.M);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.Q = i;
        this.x = i;
        this.z = new p97();
        this.A = new m97(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.b0;
        this.G = i2;
        this.P = i2;
        e(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g0);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.M.getBackground().setAlpha(i);
        this.S.setAlpha(i);
    }

    public final boolean a() {
        View view = this.t;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.t == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.M)) {
                    this.t = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f2) {
        if (f2 > this.x) {
            g(true, true);
            return;
        }
        this.v = false;
        jd1 jd1Var = this.S;
        jd1.a aVar = jd1Var.t;
        aVar.e = 0.0f;
        aVar.f = 0.0f;
        jd1Var.invalidateSelf();
        b bVar = new b();
        this.O = this.G;
        d dVar = this.f0;
        dVar.reset();
        dVar.setDuration(200L);
        dVar.setInterpolator(this.L);
        bd1 bd1Var = this.M;
        bd1Var.t = bVar;
        bd1Var.clearAnimation();
        bd1Var.startAnimation(dVar);
        jd1.a aVar2 = jd1Var.t;
        if (aVar2.n) {
            aVar2.n = false;
        }
        jd1Var.invalidateSelf();
    }

    public final void d(float f2) {
        e7a e7aVar;
        e7a e7aVar2;
        jd1 jd1Var = this.S;
        jd1.a aVar = jd1Var.t;
        if (!aVar.n) {
            aVar.n = true;
        }
        jd1Var.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f2 / this.x));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f2) - this.x;
        int i = this.R;
        if (i <= 0) {
            i = this.Q;
        }
        float f3 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.P + ((int) ((f3 * fMin) + (f3 * fPow * 2.0f)));
        bd1 bd1Var = this.M;
        if (bd1Var.getVisibility() != 0) {
            bd1Var.setVisibility(0);
        }
        bd1Var.setScaleX(1.0f);
        bd1Var.setScaleY(1.0f);
        if (f2 < this.x) {
            if (jd1Var.t.t > 76 && ((e7aVar2 = this.V) == null || !e7aVar2.hasStarted() || e7aVar2.hasEnded())) {
                e7a e7aVar3 = new e7a(this, jd1Var.t.t, 76);
                e7aVar3.setDuration(300L);
                bd1Var.t = null;
                bd1Var.clearAnimation();
                bd1Var.startAnimation(e7aVar3);
                this.V = e7aVar3;
            }
        } else if (jd1Var.t.t < 255 && ((e7aVar = this.W) == null || !e7aVar.hasStarted() || e7aVar.hasEnded())) {
            e7a e7aVar4 = new e7a(this, jd1Var.t.t, 255);
            e7aVar4.setDuration(300L);
            bd1Var.t = null;
            bd1Var.clearAnimation();
            bd1Var.startAnimation(e7aVar4);
            this.W = e7aVar4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        jd1.a aVar2 = jd1Var.t;
        aVar2.e = 0.0f;
        aVar2.f = fMin2;
        jd1Var.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        jd1.a aVar3 = jd1Var.t;
        if (fMin3 != aVar3.p) {
            aVar3.p = fMin3;
        }
        jd1Var.invalidateSelf();
        jd1Var.t.g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        jd1Var.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.G);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        h(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.A.a(f2, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.A.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A.d(i, i2, i3, i4, iArr, 0, null);
    }

    public final void e(float f2) {
        int i = this.O;
        setTargetOffsetTopAndBottom((i + ((int) ((this.P - i) * f2))) - this.M.getTop());
    }

    public final void f() {
        this.M.clearAnimation();
        this.S.stop();
        this.M.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.P - this.G);
        this.G = this.M.getTop();
    }

    public final void g(boolean z, boolean z2) {
        if (this.v != z) {
            this.a0 = z2;
            b();
            this.v = z;
            bd1 bd1Var = this.M;
            a aVar = this.d0;
            if (!z) {
                d7a d7aVar = new d7a(this);
                this.U = d7aVar;
                d7aVar.setDuration(150L);
                bd1Var.t = aVar;
                bd1Var.clearAnimation();
                bd1Var.startAnimation(this.U);
                return;
            }
            this.O = this.G;
            c cVar = this.e0;
            cVar.reset();
            cVar.setDuration(200L);
            cVar.setInterpolator(this.L);
            if (aVar != null) {
                bd1Var.t = aVar;
            }
            bd1Var.clearAnimation();
            bd1Var.startAnimation(cVar);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.N;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        p97 p97Var = this.z;
        return p97Var.b | p97Var.a;
    }

    public int getProgressCircleDiameter() {
        return this.b0;
    }

    public int getProgressViewEndOffset() {
        return this.Q;
    }

    public int getProgressViewStartOffset() {
        return this.P;
    }

    public final void h(boolean z, boolean z2) {
        if (!z || this.v == z) {
            g(z, false);
            return;
        }
        this.v = z;
        setTargetOffsetTopAndBottom((this.Q + this.P) - this.G);
        this.a0 = z2;
        bd1 bd1Var = this.M;
        bd1Var.setVisibility(0);
        this.S.setAlpha(255);
        c7a c7aVar = new c7a(this);
        this.T = c7aVar;
        c7aVar.setDuration(this.F);
        a aVar = this.d0;
        if (aVar != null) {
            bd1Var.t = aVar;
        }
        bd1Var.clearAnimation();
        bd1Var.startAnimation(this.T);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.A.f(0);
    }

    public final void i(float f2) {
        float f3 = this.I;
        float f4 = f2 - f3;
        float f5 = this.w;
        if (f4 <= f5 || this.J) {
            return;
        }
        this.H = f3 + f5;
        this.J = true;
        this.S.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.A.d;
    }

    @Override // defpackage.n97
    public final void j(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.o97
    public final void k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.A.d(i, i2, i3, i4, this.C, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? this.C[1] + i4 : i7;
        if (i8 >= 0 || a()) {
            return;
        }
        float fAbs = this.y + Math.abs(i8);
        this.y = fAbs;
        d(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // defpackage.n97
    public final void l(View view, int i, int i2, int i3, int i4, int i5) {
        k(view, i, i2, i3, i4, i5, this.D);
    }

    @Override // defpackage.n97
    public final boolean m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // defpackage.n97
    public final void n(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.n97
    public final void o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.v && !this.E) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.J = false;
                    this.K = -1;
                } else if (actionMasked == 2) {
                    int i = this.K;
                    if (i == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex >= 0) {
                        i(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.J = false;
                    this.K = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.K) {
                        this.K = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.J;
            }
            setTargetOffsetTopAndBottom(this.P - this.M.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.K = pointerId;
            this.J = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.I = motionEvent.getY(iFindPointerIndex2);
                return this.J;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.t == null) {
            b();
        }
        View view = this.t;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.M.getMeasuredWidth();
        int measuredHeight2 = this.M.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.G;
        this.M.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.t == null) {
            b();
        }
        View view = this.t;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.M.measure(View.MeasureSpec.makeMeasureSpec(this.b0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.b0, 1073741824));
        this.N = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.M) {
                this.N = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return this.A.a(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.A.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f2 = this.y;
            if (f2 > 0.0f) {
                float f3 = i2;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.y = 0.0f;
                } else {
                    this.y = f2 - f3;
                    iArr[1] = i2;
                }
                d(this.y);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.B;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        k(view, i, i2, i3, i4, 0, this.D);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.z.a = i;
        startNestedScroll(i & 2);
        this.y = 0.0f;
        this.E = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        setRefreshing(gVar.t);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new g(super.onSaveInstanceState(), this.v);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.v || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.z.a = 0;
        this.E = false;
        float f2 = this.y;
        if (f2 > 0.0f) {
            c(f2);
            this.y = 0.0f;
        } else {
            post(new Runnable() { // from class: b7a
                @Override // java.lang.Runnable
                public final void run() {
                    int[] iArr = SwipeRefreshLayout.g0;
                    this.t.f();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.v && !this.E) {
            if (actionMasked == 0) {
                this.K = motionEvent.getPointerId(0);
                this.J = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.K);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.J) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.H) * 0.5f;
                    this.J = false;
                    c(y);
                }
                this.K = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.K);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                i(y2);
                if (this.J) {
                    float f2 = (y2 - this.H) * 0.5f;
                    if (f2 > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        d(f2);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.K) {
                            this.K = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.K = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.c0 && (view = this.t) != null) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f2) {
        this.M.setScaleX(f2);
        this.M.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        jd1 jd1Var = this.S;
        jd1.a aVar = jd1Var.t;
        aVar.i = iArr;
        aVar.a(0);
        aVar.a(0);
        jd1Var.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.x = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        f();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.c0 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        m97 m97Var = this.A;
        if (m97Var.d) {
            ViewGroup viewGroup = m97Var.c;
            WeakHashMap<View, fib> weakHashMap = egb.a;
            viewGroup.stopNestedScroll();
        }
        m97Var.d = z;
    }

    public void setOnRefreshListener(f fVar) {
        this.u = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.M.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        h(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.b0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.b0 = (int) (displayMetrics.density * 40.0f);
            }
            this.M.setImageDrawable(null);
            this.S.c(i);
            this.M.setImageDrawable(this.S);
        }
    }

    public void setSlingshotDistance(int i) {
        this.R = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        bd1 bd1Var = this.M;
        bd1Var.bringToFront();
        WeakHashMap<View, fib> weakHashMap = egb.a;
        bd1Var.offsetTopAndBottom(i);
        this.G = bd1Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.A.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.A.h(0);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public final boolean t;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel) {
            super(parcel);
            this.t = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        }

        public g(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.t = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            f fVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.v) {
                swipeRefreshLayout.f();
                return;
            }
            swipeRefreshLayout.S.setAlpha(255);
            swipeRefreshLayout.S.start();
            if (swipeRefreshLayout.a0 && (fVar = swipeRefreshLayout.u) != null) {
                fVar.a();
            }
            swipeRefreshLayout.G = swipeRefreshLayout.M.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            d7a d7aVar = new d7a(swipeRefreshLayout);
            swipeRefreshLayout.U = d7aVar;
            d7aVar.setDuration(150L);
            bd1 bd1Var = swipeRefreshLayout.M;
            bd1Var.t = null;
            bd1Var.clearAnimation();
            swipeRefreshLayout.M.startAnimation(swipeRefreshLayout.U);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(e eVar) {
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }
}
