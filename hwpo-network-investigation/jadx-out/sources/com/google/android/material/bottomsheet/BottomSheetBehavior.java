package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.hwpo_training_app.R;
import defpackage.av;
import defpackage.aw;
import defpackage.bh8;
import defpackage.e0;
import defpackage.egb;
import defpackage.fib;
import defpackage.fj6;
import defpackage.gh0;
import defpackage.ij6;
import defpackage.j4;
import defpackage.jj6;
import defpackage.jk6;
import defpackage.kk6;
import defpackage.ll9;
import defpackage.m3;
import defpackage.ogb;
import defpackage.pp2;
import defpackage.qt3;
import defpackage.umb;
import defpackage.vt0;
import defpackage.wib;
import defpackage.wt0;
import defpackage.xt0;
import defpackage.yd5;
import defpackage.ym7;
import defpackage.z90;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements fj6 {
    public int A;
    public HashMap A0;
    public final int B;
    public final SparseIntArray B0;
    public final kk6 C;
    public final SparseIntArray C0;
    public final ColorStateList D;
    public final SparseIntArray D0;
    public final int E;
    public final Rect E0;
    public final int F;
    public final c F0;
    public int G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public int P;
    public int Q;
    public final boolean R;
    public final ll9 S;
    public boolean T;
    public final BottomSheetBehavior<V>.f U;
    public final ValueAnimator V;
    public final int W;
    public int X;
    public int Y;
    public final float Z;
    public int a0;
    public final float b0;
    public boolean c0;
    public boolean d0;
    public final boolean e0;
    public final boolean f0;
    public boolean g0;
    public final boolean h0;
    public int i0;
    public ogb j0;
    public boolean k0;
    public int l0;
    public boolean m0;
    public final float n0;
    public int o0;
    public int p0;
    public int q0;
    public WeakReference<V> r0;
    public final ArrayList s0;
    public final int t;
    public final ArrayList<d> t0;
    public boolean u;
    public VelocityTracker u0;
    public final float v;
    public jj6 v0;
    public final int w;
    public int w0;
    public final boolean x;
    public int x0;
    public int y;
    public WeakReference<View> y0;
    public boolean z;
    public boolean z0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public final /* synthetic */ View t;
        public final /* synthetic */ int u;

        public a(View view, int i) {
            this.t = view;
            this.u = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.O(this.t, this.u, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.M(5);
            WeakReference<V> weakReference = bottomSheetBehavior.r0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            bottomSheetBehavior.r0.get().requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends ogb.c {
        public c() {
        }

        @Override // ogb.c
        public final int a(int i, View view) {
            return view.getLeft();
        }

        @Override // ogb.c
        public final int b(int i, View view) {
            return ym7.d(i, BottomSheetBehavior.this.E(), d());
        }

        @Override // ogb.c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.c0 ? bottomSheetBehavior.q0 : bottomSheetBehavior.a0;
        }

        @Override // ogb.c
        public final void f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.e0) {
                    bottomSheetBehavior.M(1);
                }
            }
        }

        @Override // ogb.c
        public final void g(View view, int i, int i2) {
            BottomSheetBehavior.this.A(i2);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0049  */
        /* JADX WARN: Code duplicated, block: B:34:0x0082  */
        /* JADX WARN: Code duplicated, block: B:6:0x000d  */
        @Override // ogb.c
        public final void h(View view, float f, float f2) {
            int i = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f2 < 0.0f) {
                if (bottomSheetBehavior.u) {
                    i = 3;
                } else {
                    int top = view.getTop();
                    SystemClock.uptimeMillis();
                    if (top <= bottomSheetBehavior.Y) {
                        i = 3;
                    }
                }
            } else if (bottomSheetBehavior.c0 && bottomSheetBehavior.N(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.w) {
                    if (view.getTop() > (bottomSheetBehavior.E() + bottomSheetBehavior.q0) / 2) {
                        i = 5;
                    } else if (bottomSheetBehavior.u || Math.abs(view.getTop() - bottomSheetBehavior.E()) < Math.abs(view.getTop() - bottomSheetBehavior.Y)) {
                        i = 3;
                    }
                } else {
                    i = 5;
                }
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.u) {
                    int i2 = bottomSheetBehavior.Y;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - bottomSheetBehavior.a0)) {
                            i = 3;
                        }
                    } else if (Math.abs(top2 - i2) >= Math.abs(top2 - bottomSheetBehavior.a0)) {
                        i = 4;
                    }
                } else if (Math.abs(top2 - bottomSheetBehavior.X) < Math.abs(top2 - bottomSheetBehavior.a0)) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else if (bottomSheetBehavior.u) {
                i = 4;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.Y) >= Math.abs(top3 - bottomSheetBehavior.a0)) {
                    i = 4;
                }
            }
            bottomSheetBehavior.O(view, i, true);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0045  */
        @Override // ogb.c
        public final boolean i(int i, View view) {
            WeakReference<V> weakReference;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.i0;
            if (i2 != 1 && !bottomSheetBehavior.z0) {
                if (i2 == 3 && bottomSheetBehavior.w0 == i) {
                    View view2 = null;
                    if (bottomSheetBehavior.x) {
                        WeakReference<View> weakReference2 = bottomSheetBehavior.y0;
                        if (weakReference2 != null) {
                            view2 = weakReference2.get();
                        }
                    } else {
                        ArrayList arrayList = bottomSheetBehavior.s0;
                        if (!arrayList.isEmpty()) {
                            view2 = (View) ((WeakReference) arrayList.get(0)).get();
                        }
                    }
                    if (view2 == null || !view2.canScrollVertically(-1)) {
                        SystemClock.uptimeMillis();
                        weakReference = bottomSheetBehavior.r0;
                        if (weakReference == null) {
                        }
                    }
                } else {
                    SystemClock.uptimeMillis();
                    weakReference = bottomSheetBehavior.r0;
                    if (weakReference == null && weakReference.get() == view) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class f {
        public int a;
        public boolean b;
        public final a c = new a();

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                f fVar = f.this;
                fVar.b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                ogb ogbVar = bottomSheetBehavior.j0;
                if (ogbVar != null && ogbVar.f()) {
                    fVar.a(fVar.a);
                } else if (bottomSheetBehavior.i0 == 2) {
                    bottomSheetBehavior.M(fVar.a);
                }
            }
        }

        public f() {
        }

        public final void a(int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.r0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            bottomSheetBehavior.r0.get().postOnAnimation(this.c);
            this.b = true;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.t = 0;
        this.u = true;
        this.E = -1;
        this.F = -1;
        this.U = new f();
        this.Z = 0.5f;
        this.b0 = -1.0f;
        this.e0 = true;
        this.f0 = true;
        this.h0 = true;
        this.i0 = 4;
        this.n0 = 0.1f;
        this.s0 = new ArrayList();
        this.t0 = new ArrayList<>();
        this.x0 = -1;
        this.B0 = new SparseIntArray();
        this.C0 = new SparseIntArray();
        this.D0 = new SparseIntArray();
        this.E0 = new Rect();
        this.F0 = new c();
        this.B = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bh8.e);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.D = jk6.b(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.S = ll9.g(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        ll9 ll9Var = this.S;
        if (ll9Var != null) {
            kk6 kk6Var = new kk6(ll9Var);
            this.C = kk6Var;
            kk6Var.l(context);
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                this.C.p(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.C.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(y(), 1.0f);
        this.V = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.V.addUpdateListener(new vt0(this));
        this.b0 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            K(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            K(i);
        }
        J(typedArrayObtainStyledAttributes.getBoolean(10, false));
        this.H = typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.u != z) {
            this.u = z;
            if (this.r0 != null) {
                x();
            }
            M((this.u && this.i0 == 6) ? 3 : this.i0);
            Q(this.i0, true);
            P();
        }
        this.d0 = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.e0 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f0 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.t = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f2 = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            z90.a("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.Z = f2;
        if (this.r0 != null) {
            this.Y = (int) ((1.0f - f2) * this.q0);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                z90.a("offset must be greater than or equal to 0");
                throw null;
            }
            this.W = dimensionPixelOffset;
            Q(this.i0, true);
        } else {
            int i2 = typedValuePeekValue2.data;
            if (i2 < 0) {
                z90.a("offset must be greater than or equal to 0");
                throw null;
            }
            this.W = i2;
            Q(this.i0, true);
        }
        this.w = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.x = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.h0 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.I = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.J = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.L = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.M = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.N = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.O = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.R = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewB = B(viewGroup.getChildAt(i));
            if (viewB != null) {
                return viewB;
            }
        }
        return null;
    }

    public static <V extends View> BottomSheetBehavior<V> C(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            z90.a("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        z90.a("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public static int D(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        V v = this.r0.get();
        if (v != null) {
            ArrayList<d> arrayList = this.t0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.a0;
            if (i <= i2 && i2 != E()) {
                E();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList.get(i3).b(v);
            }
        }
    }

    public final int E() {
        if (this.u) {
            return this.X;
        }
        return Math.max(this.W, this.L ? 0 : this.Q);
    }

    public final int F(int i) {
        if (i == 3) {
            return E();
        }
        if (i == 4) {
            return this.a0;
        }
        if (i == 5) {
            return this.q0;
        }
        if (i == 6) {
            return this.Y;
        }
        z90.a(pp2.a(i, "Invalid state to get top offset: "));
        return 0;
    }

    public final boolean G() {
        WeakReference<V> weakReference = this.r0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.r0.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean H(View view) {
        ArrayList arrayList = this.s0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((WeakReference) obj).get() == view) {
                return true;
            }
        }
        return false;
    }

    public final void I(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.s0.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                I(viewGroup.getChildAt(i));
            }
        }
    }

    public final void J(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            if (!z && this.i0 == 5) {
                L(4);
            }
            P();
        }
    }

    public final void K(int i) {
        boolean z = this.z;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.z = true;
            }
        } else {
            if (!z && this.y == i) {
                return;
            }
            this.z = false;
            this.y = Math.max(0, i);
        }
        S();
    }

    public final void L(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(av.a(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.c0 && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.u && F(i) <= this.X) ? 3 : i;
        WeakReference<V> weakReference = this.r0;
        if (weakReference == null || weakReference.get() == null) {
            M(i);
            return;
        }
        V v = this.r0.get();
        a aVar = new a(v, i2);
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
            v.post(aVar);
        } else {
            aVar.run();
        }
    }

    public final void M(int i) {
        V v;
        if (this.i0 == i) {
            return;
        }
        this.i0 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.c0;
        }
        WeakReference<V> weakReference = this.r0;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            R(true);
        } else if (i == 6 || i == 5 || i == 4) {
            R(false);
        }
        Q(i, true);
        while (true) {
            ArrayList<d> arrayList = this.t0;
            if (i2 >= arrayList.size()) {
                P();
                return;
            } else {
                arrayList.get(i2).c(i, v);
                i2++;
            }
        }
    }

    public final boolean N(View view, float f2) {
        if (this.d0) {
            return true;
        }
        if (view.getTop() < this.a0) {
            return false;
        }
        return Math.abs(((f2 * this.n0) + ((float) view.getTop())) - ((float) this.a0)) / ((float) z()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        M(2);
        Q(r4, true);
        r2.U.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.F(r4)
            ogb r1 = r2.j0
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.n(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.M(r3)
            r3 = 1
            r2.Q(r4, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$f r2 = r2.U
            r2.a(r4)
            return
        L40:
            r2.M(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.O(android.view.View, int, boolean):void");
    }

    public final void P() {
        V v;
        WeakReference<V> weakReference = this.r0;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        egb.l(1048576, v);
        egb.i(0, v);
        egb.l(524288, v);
        egb.i(0, v);
        egb.l(262144, v);
        egb.i(0, v);
        SparseIntArray sparseIntArray = this.C0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            egb.l(i, v);
            egb.i(0, v);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.B0;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            egb.l(i2, v);
            egb.i(0, v);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.D0;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            egb.l(i3, v);
            egb.i(0, v);
            sparseIntArray3.delete(0);
        }
        if (!this.u && this.i0 != 6) {
            sparseIntArray2.put(0, w(v, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.c0 && this.i0 != 5) {
            egb.m(v, j4.a.l, new xt0(this, 5));
        }
        int i4 = this.i0;
        if (i4 == 3) {
            if (this.d0 && this.c0) {
                return;
            }
            sparseIntArray3.put(0, w(v, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i4 == 4) {
            sparseIntArray.put(0, w(v, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i4 != 6) {
                return;
            }
            if (!this.d0 || !this.c0) {
                sparseIntArray3.put(0, w(v, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, w(v, R.string.bottomsheet_action_expand, 3));
        }
    }

    public final void Q(int i, boolean z) {
        kk6 kk6Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.i0 == 3 && (this.R || G());
        if (this.T == z2 || (kk6Var = this.C) == null) {
            return;
        }
        this.T = z2;
        ValueAnimator valueAnimator = this.V;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            kk6Var.q(this.T ? y() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(kk6Var.u.i, z2 ? y() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void R(boolean z) {
        WeakReference<V> weakReference = this.r0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.A0 != null) {
                    return;
                } else {
                    this.A0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.r0.get() && z) {
                    this.A0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.A0 = null;
        }
    }

    public final void S() {
        V v;
        if (this.r0 != null) {
            x();
            if (this.i0 != 4 || (v = this.r0.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    @Override // defpackage.fj6
    public final void a() {
        jj6 jj6Var = this.v0;
        if (jj6Var == null) {
            return;
        }
        int i = jj6Var.d;
        int i2 = jj6Var.c;
        gh0 gh0Var = jj6Var.f;
        jj6Var.f = null;
        if (gh0Var != null) {
            float f2 = gh0Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.c0) {
                    AnimatorSet animatorSetA = jj6Var.a();
                    animatorSetA.setDuration(aw.c(i2, f2, i));
                    animatorSetA.start();
                    L(4);
                    return;
                }
                b bVar = new b();
                V v = jj6Var.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v, (Property<V, Float>) View.TRANSLATION_Y, v.getScaleY() * v.getHeight());
                objectAnimatorOfFloat.setInterpolator(new qt3());
                objectAnimatorOfFloat.setDuration(aw.c(i2, f2, i));
                objectAnimatorOfFloat.addListener(new ij6(jj6Var));
                objectAnimatorOfFloat.addListener(bVar);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        L(this.c0 ? 5 : 4);
    }

    @Override // defpackage.fj6
    public final void b(gh0 gh0Var) {
        jj6 jj6Var = this.v0;
        if (jj6Var == null) {
            return;
        }
        if (jj6Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        gh0 gh0Var2 = jj6Var.f;
        jj6Var.f = gh0Var;
        if (gh0Var2 == null) {
            return;
        }
        jj6Var.b(gh0Var.c);
    }

    @Override // defpackage.fj6
    public final void c(gh0 gh0Var) {
        jj6 jj6Var = this.v0;
        if (jj6Var == null) {
            return;
        }
        jj6Var.f = gh0Var;
    }

    @Override // defpackage.fj6
    public final void d() {
        jj6 jj6Var = this.v0;
        if (jj6Var == null) {
            return;
        }
        if (jj6Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        gh0 gh0Var = jj6Var.f;
        jj6Var.f = null;
        if (gh0Var == null) {
            return;
        }
        AnimatorSet animatorSetA = jj6Var.a();
        animatorSetA.setDuration(jj6Var.e);
        animatorSetA.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void g(CoordinatorLayout.f fVar) {
        this.r0 = null;
        this.j0 = null;
        this.v0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void j() {
        this.r0 = null;
        this.j0 = null;
        this.v0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i;
        ogb ogbVar;
        if (!v.isShown() || !this.e0) {
            this.k0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.w0 = -1;
            this.x0 = -1;
            this.y0 = null;
            VelocityTracker velocityTracker = this.u0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.u0 = null;
            }
        }
        if (this.u0 == null) {
            this.u0 = VelocityTracker.obtain();
        }
        this.u0.addMovement(motionEvent);
        ArrayList arrayList = this.s0;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.x0 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        view = null;
                        break;
                    }
                    Object obj = arrayList.get(i2);
                    i2++;
                    view = (View) ((WeakReference) obj).get();
                    if (view != null && coordinatorLayout.p(view, x2, y)) {
                        break;
                    }
                }
            }
            WeakReference<View> weakReference = new WeakReference<>(view);
            this.y0 = weakReference;
            if (this.i0 != 2 && weakReference.get() != null) {
                this.w0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.z0 = true;
            }
            this.k0 = this.w0 == -1 && !coordinatorLayout.p(v, x, this.x0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.z0 = false;
            this.y0 = null;
            this.w0 = -1;
            if (this.k0) {
                this.k0 = false;
                return false;
            }
        }
        if (this.k0 || (ogbVar = this.j0) == null || !ogbVar.o(motionEvent)) {
            if (actionMasked == 2) {
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    if (((WeakReference) obj2).get() != null) {
                        if (!this.k0 && this.i0 != 1) {
                            if (!this.x) {
                                View view2 = !arrayList.isEmpty() ? (View) ((WeakReference) arrayList.get(0)).get() : null;
                                if (view2 != null && coordinatorLayout.p(view2, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    break;
                                }
                                if (this.j0 == null) {
                                    break;
                                }
                            } else {
                                WeakReference<View> weakReference2 = this.y0;
                                if (weakReference2 != null && weakReference2.get() != null) {
                                    break;
                                }
                                if (this.j0 == null || (i = this.x0) == -1 || Math.abs(i - motionEvent.getY()) <= this.j0.b) {
                                    break;
                                }
                            }
                        } else {
                            break;
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.r0 == null) {
            this.A = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.H || this.z) ? false : true;
            if (this.I || this.J || this.K || this.M || this.N || this.O || z) {
                wib.a(v, new wt0(this, z));
            }
            egb.q(v, new yd5(v));
            this.r0 = new WeakReference<>(v);
            this.v0 = new jj6(v);
            kk6 kk6Var = this.C;
            if (kk6Var != null) {
                v.setBackground(kk6Var);
                float elevation = this.b0;
                if (elevation == -1.0f) {
                    elevation = v.getElevation();
                }
                kk6Var.o(elevation);
            } else {
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    v.setBackgroundTintList(colorStateList);
                }
            }
            P();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.j0 == null) {
            this.j0 = new ogb(coordinatorLayout.getContext(), coordinatorLayout, this.F0);
        }
        int top = v.getTop();
        coordinatorLayout.r(i, v);
        this.p0 = coordinatorLayout.getWidth();
        this.q0 = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.o0 = height;
        int iMin = this.q0;
        int i3 = iMin - height;
        int i4 = this.Q;
        if (i3 < i4) {
            boolean z2 = this.L;
            int i5 = this.F;
            if (z2) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.o0 = iMin;
            } else {
                int iMin2 = iMin - i4;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.o0 = iMin2;
            }
        }
        this.X = Math.max(0, this.q0 - this.o0);
        this.Y = (int) ((1.0f - this.Z) * this.q0);
        x();
        int i6 = this.i0;
        if (i6 == 3) {
            int iE = E();
            WeakHashMap<View, fib> weakHashMap = egb.a;
            v.offsetTopAndBottom(iE);
        } else if (i6 == 6) {
            int i7 = this.Y;
            WeakHashMap<View, fib> weakHashMap2 = egb.a;
            v.offsetTopAndBottom(i7);
        } else if (this.c0 && i6 == 5) {
            int i8 = this.q0;
            WeakHashMap<View, fib> weakHashMap3 = egb.a;
            v.offsetTopAndBottom(i8);
        } else if (i6 == 4) {
            int i9 = this.a0;
            WeakHashMap<View, fib> weakHashMap4 = egb.a;
            v.offsetTopAndBottom(i9);
        } else if (i6 == 1 || i6 == 2) {
            int top2 = top - v.getTop();
            WeakHashMap<View, fib> weakHashMap5 = egb.a;
            v.offsetTopAndBottom(top2);
        }
        Q(this.i0, false);
        ArrayList arrayList = this.s0;
        arrayList.clear();
        if (this.x) {
            I(v);
        } else {
            arrayList.add(new WeakReference(B(v)));
        }
        while (true) {
            ArrayList<d> arrayList2 = this.t0;
            if (i2 >= arrayList2.size()) {
                return true;
            }
            arrayList2.get(i2).a(v);
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(D(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.E, marginLayoutParams.width), D(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.F, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean n(View view) {
        ArrayList arrayList = this.s0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((WeakReference) obj).get() != null) {
                if (!H(view) || this.i0 == 3 || this.g0) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void o(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        boolean zH;
        if (i3 != 1 && (zH = H(view))) {
            int top = v.getTop();
            int i4 = top - i2;
            boolean z = this.e0;
            boolean z2 = this.f0;
            if (i2 > 0) {
                if (!this.m0 && !z2 && zH && view.canScrollVertically(1)) {
                    this.g0 = true;
                    return;
                }
                if (i4 < E()) {
                    int iE = top - E();
                    iArr[1] = iE;
                    WeakHashMap<View, fib> weakHashMap = egb.a;
                    v.offsetTopAndBottom(-iE);
                    M(3);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap<View, fib> weakHashMap2 = egb.a;
                    v.offsetTopAndBottom(-i2);
                    M(1);
                }
            } else if (i2 < 0) {
                boolean zCanScrollVertically = view.canScrollVertically(-1);
                if (!this.m0 && !z2 && zH && zCanScrollVertically) {
                    this.g0 = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    int i5 = this.a0;
                    if (i4 > i5 && !this.c0) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        WeakHashMap<View, fib> weakHashMap3 = egb.a;
                        v.offsetTopAndBottom(-i6);
                        M(4);
                    } else {
                        if (!z) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap<View, fib> weakHashMap4 = egb.a;
                        v.offsetTopAndBottom(-i2);
                        M(1);
                    }
                }
            }
            A(v.getTop());
            this.l0 = i2;
            this.m0 = true;
            this.g0 = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean q(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
        if (!this.h0 || v.isInTouchMode()) {
            return false;
        }
        int i = this.i0;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.E0;
        if (v.getLocalVisibleRect(rect2)) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            umb umbVarA = egb.e.a(v);
            if (umbVarA != null) {
                rect2.bottom -= umbVarA.a.i(519).d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        L(3);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void r(View view, Parcelable parcelable) {
        e eVar = (e) parcelable;
        int i = this.t;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.y = eVar.w;
            }
            if (i == -1 || (i & 2) == 2) {
                this.u = eVar.x;
            }
            if (i == -1 || (i & 4) == 4) {
                this.c0 = eVar.y;
            }
            if (i == -1 || (i & 8) == 8) {
                this.d0 = eVar.z;
            }
        }
        int i2 = eVar.v;
        if (i2 == 1 || i2 == 2) {
            this.i0 = 4;
        } else {
            this.i0 = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new e(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean t(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.l0 = 0;
        this.m0 = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void u(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == E()) {
            M(3);
            return;
        }
        if (H(view) && this.m0) {
            if (this.l0 > 0) {
                if (!this.u && v.getTop() > this.Y) {
                    i3 = 6;
                }
            } else if (this.c0) {
                VelocityTracker velocityTracker = this.u0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.v);
                    yVelocity = this.u0.getYVelocity(this.w0);
                }
                if (N(v, yVelocity)) {
                    i3 = 5;
                } else if (this.l0 == 0) {
                    top2 = v.getTop();
                    if (this.u) {
                        i2 = this.Y;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.a0)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.a0)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.X) >= Math.abs(top2 - this.a0)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.u) {
                        top = v.getTop();
                        if (Math.abs(top - this.Y) < Math.abs(top - this.a0)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.l0 == 0) {
                top2 = v.getTop();
                if (this.u) {
                    i2 = this.Y;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.a0)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.a0)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.X) >= Math.abs(top2 - this.a0)) {
                    i3 = 4;
                }
            } else {
                if (!this.u) {
                    top = v.getTop();
                    if (Math.abs(top - this.Y) < Math.abs(top - this.a0)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            O(v, i3, false);
            this.m0 = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.i0;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ogb ogbVar = this.j0;
        boolean z = this.e0;
        if (ogbVar != null && (z || i == 1)) {
            ogbVar.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.w0 = -1;
            this.x0 = -1;
            this.y0 = null;
            VelocityTracker velocityTracker = this.u0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.u0 = null;
            }
        }
        if (this.u0 == null) {
            this.u0 = VelocityTracker.obtain();
        }
        this.u0.addMovement(motionEvent);
        if (this.j0 != null && ((z || this.i0 == 1) && actionMasked == 2 && !this.k0)) {
            float fAbs = Math.abs(this.x0 - motionEvent.getY());
            ogb ogbVar2 = this.j0;
            if (fAbs > ogbVar2.b) {
                ogbVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.k0;
    }

    public final int w(View view, int i, int i2) {
        int iA;
        String string = view.getResources().getString(i);
        xt0 xt0Var = new xt0(this, i2);
        ArrayList arrayListG = egb.g(view);
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListG.size()) {
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    int[] iArr = egb.d;
                    if (i4 >= 32 || i5 != -1) {
                        break;
                    }
                    int i6 = iArr[i4];
                    boolean z = true;
                    for (int i7 = 0; i7 < arrayListG.size(); i7++) {
                        z &= ((j4.a) arrayListG.get(i7)).a() != i6;
                    }
                    if (z) {
                        i5 = i6;
                    }
                    i4++;
                }
                iA = i5;
                break;
            }
            if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((j4.a) arrayListG.get(i3)).a).getLabel())) {
                iA = ((j4.a) arrayListG.get(i3)).a();
                break;
            }
            i3++;
        }
        if (iA != -1) {
            j4.a aVar = new j4.a(null, iA, string, xt0Var, null);
            View.AccessibilityDelegate accessibilityDelegateE = egb.e(view);
            m3 m3Var = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof m3.a ? ((m3.a) accessibilityDelegateE).a : new m3(accessibilityDelegateE);
            if (m3Var == null) {
                m3Var = new m3();
            }
            egb.o(view, m3Var);
            egb.l(aVar.a(), view);
            egb.g(view).add(aVar);
            egb.i(0, view);
        }
        return iA;
    }

    public final void x() {
        int iZ = z();
        boolean z = this.u;
        int i = this.q0;
        if (z) {
            this.a0 = Math.max(i - iZ, this.X);
        } else {
            this.a0 = i - iZ;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    public final float y() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        float f2;
        float f3 = 0.0f;
        kk6 kk6Var = this.C;
        if (kk6Var != null && (weakReference = this.r0) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v = this.r0.get();
            if (G() && (rootWindowInsets = v.getRootWindowInsets()) != null) {
                float fI = kk6Var.i();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fI <= 0.0f) {
                        f2 = 0.0f;
                    } else {
                        f2 = radius / fI;
                    }
                } else {
                    f2 = 0.0f;
                }
                float[] fArr = kk6Var.V;
                float fA = fArr != null ? fArr[0] : kk6Var.u.a.d().f.a(kk6Var.e());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA > 0.0f) {
                        f3 = radius2 / fA;
                    }
                }
                return Math.max(f2, f3);
            }
        }
        return 0.0f;
    }

    public final int z() {
        int iMin;
        int i;
        int i2;
        if (this.z) {
            iMin = Math.min(Math.max(this.A, this.q0 - ((this.p0 * 9) / 16)), this.o0);
            i = this.P;
        } else {
            if (!this.H && !this.I && (i2 = this.G) > 0) {
                return Math.max(this.y, i2 + this.B);
            }
            iMin = this.y;
            i = this.P;
        }
        return iMin + i;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e extends e0 {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public final int v;
        public final int w;
        public final boolean x;
        public final boolean y;
        public final boolean z;

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.v = parcel.readInt();
            this.w = parcel.readInt();
            this.x = parcel.readInt() == 1;
            this.y = parcel.readInt() == 1;
            this.z = parcel.readInt() == 1;
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.v);
            parcel.writeInt(this.w);
            parcel.writeInt(this.x ? 1 : 0);
            parcel.writeInt(this.y ? 1 : 0);
            parcel.writeInt(this.z ? 1 : 0);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new e[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }
        }

        public e(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.v = bottomSheetBehavior.i0;
            this.w = bottomSheetBehavior.y;
            this.x = bottomSheetBehavior.u;
            this.y = bottomSheetBehavior.c0;
            this.z = bottomSheetBehavior.d0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class d {
        public abstract void b(View view);

        public abstract void c(int i, View view);

        public void a(View view) {
        }
    }

    public BottomSheetBehavior() {
        this.t = 0;
        this.u = true;
        this.E = -1;
        this.F = -1;
        this.U = new f();
        this.Z = 0.5f;
        this.b0 = -1.0f;
        this.e0 = true;
        this.f0 = true;
        this.h0 = true;
        this.i0 = 4;
        this.n0 = 0.1f;
        this.s0 = new ArrayList();
        this.t0 = new ArrayList<>();
        this.x0 = -1;
        this.B0 = new SparseIntArray();
        this.C0 = new SparseIntArray();
        this.D0 = new SparseIntArray();
        this.E0 = new Rect();
        this.F0 = new c();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
