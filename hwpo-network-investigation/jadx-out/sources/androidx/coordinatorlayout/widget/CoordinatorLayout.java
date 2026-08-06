package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.b13;
import defpackage.e0;
import defpackage.egb;
import defpackage.ehb;
import defpackage.ep9;
import defpackage.fib;
import defpackage.ih8;
import defpackage.jl;
import defpackage.n97;
import defpackage.o97;
import defpackage.p97;
import defpackage.pg7;
import defpackage.umb;
import defpackage.z58;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements n97, o97 {
    public static final String M;
    public static final Class<?>[] N;
    public static final ThreadLocal<Map<String, Constructor<c>>> O;
    public static final i P;
    public static final z58 Q;
    public boolean A;
    public final int[] B;
    public View C;
    public View D;
    public g E;
    public boolean F;
    public umb G;
    public boolean H;
    public Drawable I;
    public ViewGroup.OnHierarchyChangeListener J;
    public a K;
    public final p97 L;
    public final ArrayList t;
    public final b13<View> u;
    public final ArrayList v;
    public final ArrayList w;
    public final int[] x;
    public final int[] y;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements pg7 {
        public a() {
        }

        @Override // defpackage.pg7
        public final umb b(View view, umb umbVar) {
            umb.q qVar = umbVar.a;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.G, umbVar)) {
                coordinatorLayout.G = umbVar;
                boolean z = umbVar.d() > 0;
                coordinatorLayout.H = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!qVar.s()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, fib> weakHashMap = egb.a;
                        if (childAt.getFitsSystemWindows() && ((f) childAt.getLayoutParams()).a != null && qVar.s()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return umbVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        c getBehavior();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.J;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.J;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            float z = view.getZ();
            float z2 = view2.getZ();
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        M = r0 != null ? r0.getName() : null;
        P = new i();
        N = new Class[]{Context.class, AttributeSet.class};
        O = new ThreadLocal<>();
        Q = new z58(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i2);
        this.t = new ArrayList();
        this.u = new b13<>();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new int[2];
        this.y = new int[2];
        this.L = new p97();
        int[] iArr = ih8.a;
        TypedArray typedArrayObtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i2 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.B = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr2 = coordinatorLayout.B;
                iArr2[i3] = (int) (iArr2[i3] * f2);
            }
        }
        coordinatorLayout.I = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.y();
        super.setOnHierarchyChangeListener(coordinatorLayout.new e());
        WeakHashMap<View, fib> weakHashMap = egb.a;
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) Q.b();
        return rect == null ? new Rect() : rect;
    }

    public static void g(int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int iWidth;
        int iHeight;
        int i5 = fVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = fVar.d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        if (i9 != 1) {
            iWidth = i9 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i10 != 16) {
            iHeight = i10 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i7 == 1) {
            iWidth -= i3 / 2;
        } else if (i7 != 5) {
            iWidth -= i3;
        }
        if (i8 == 16) {
            iHeight -= i4 / 2;
        } else if (i8 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f i(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
                fVar.b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.b(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            fVar.b = true;
        }
        return fVar;
    }

    public static void w(int i2, View view) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.i;
        if (i3 != i2) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            view.offsetLeftAndRight(i2 - i3);
            fVar.i = i2;
        }
    }

    public static void x(int i2, View view) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.j;
        if (i3 != i2) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            view.offsetTopAndBottom(i2 - i3);
            fVar.j = i2;
        }
    }

    public final void b(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    public final void c(View view) {
        ArrayList<View> arrayList = this.u.b.get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View view2 = arrayList.get(i2);
            c cVar = ((f) view2.getLayoutParams()).a;
            if (cVar != null) {
                cVar.h(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            f(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.I;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final ArrayList e(View view) {
        ep9<View, ArrayList<View>> ep9Var = this.u.b;
        int i2 = ep9Var.v;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList<View> arrayListJ = ep9Var.j(i3);
            if (arrayListJ != null && arrayListJ.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ep9Var.f(i3));
            }
        }
        ArrayList arrayList2 = this.w;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        return arrayList2;
    }

    public final void f(Rect rect, View view) {
        ThreadLocal<Matrix> threadLocal = ehb.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = ehb.a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        ehb.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = ehb.b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.t);
    }

    public final umb getLastWindowInsets() {
        return this.G;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        p97 p97Var = this.L;
        return p97Var.b | p97Var.a;
    }

    public Drawable getStatusBarBackground() {
        return this.I;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final int h(int i2) {
        int[] iArr = this.B;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    @Override // defpackage.n97
    public final void j(int i2, View view) {
        p97 p97Var = this.L;
        if (i2 == 1) {
            p97Var.b = 0;
        } else {
            p97Var.a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i2)) {
                c cVar = fVar.a;
                if (cVar != null) {
                    cVar.u(this, childAt, view, i2);
                }
                if (i2 == 0) {
                    fVar.m = false;
                } else if (i2 == 1) {
                    fVar.n = false;
                }
                fVar.o = false;
            }
        }
        this.D = null;
    }

    @Override // defpackage.o97
    public final void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.p(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            q(1);
        }
    }

    @Override // defpackage.n97
    public final void l(View view, int i2, int i3, int i4, int i5, int i6) {
        k(view, i2, i3, i4, i5, 0, this.y);
    }

    @Override // defpackage.n97
    public final boolean m(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.a;
                if (cVar != null) {
                    boolean zT = cVar.t(this, childAt, view, view2, i2, i3);
                    z |= zT;
                    if (i3 == 0) {
                        fVar.m = zT;
                    } else if (i3 == 1) {
                        fVar.n = zT;
                    }
                } else if (i3 == 0) {
                    fVar.m = false;
                } else if (i3 == 1) {
                    fVar.n = false;
                }
            }
        }
        return z;
    }

    @Override // defpackage.n97
    public final void n(View view, View view2, int i2, int i3) {
        p97 p97Var = this.L;
        if (i3 == 1) {
            p97Var.b = i2;
        } else {
            p97Var.a = i2;
        }
        this.D = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((f) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.n97
    public final void o(View view, int i2, int i3, int[] iArr, int i4) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i4) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.o(this, childAt, view, i2, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.F) {
            if (this.E == null) {
                this.E = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.E);
        }
        if (this.G == null) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.F && this.E != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.E);
        }
        View view = this.D;
        if (view != null) {
            j(0, view);
        }
        this.A = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.H || this.I == null) {
            return;
        }
        umb umbVar = this.G;
        int iD = umbVar != null ? umbVar.d() : 0;
        if (iD > 0) {
            this.I.setBounds(0, 0, getWidth(), iD);
            this.I.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean zT = t(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zT;
        }
        v(true);
        return zT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c cVar;
        WeakHashMap<View, fib> weakHashMap = egb.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).a) == null || !cVar.l(this, view, layoutDirection))) {
                r(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:78:0x0184  */
    /* JADX WARN: Code duplicated, block: B:79:0x0187  */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        int i6;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVar;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        ArrayList arrayList;
        int i11;
        View view;
        int i12;
        boolean zM;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.u();
        int childCount = coordinatorLayout.getChildCount();
        int i13 = 0;
        loop0: while (true) {
            if (i13 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i13);
            ep9<View, ArrayList<View>> ep9Var = coordinatorLayout.u.b;
            int i14 = ep9Var.v;
            for (int i15 = 0; i15 < i14; i15++) {
                ArrayList<View> arrayListJ = ep9Var.j(i15);
                if (arrayListJ != null && arrayListJ.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i13++;
        }
        if (z != coordinatorLayout.F) {
            boolean z3 = coordinatorLayout.A;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.E == null) {
                        coordinatorLayout.E = coordinatorLayout.new g();
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.E);
                }
                coordinatorLayout.F = true;
            } else {
                if (z3 && coordinatorLayout.E != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.E);
                }
                coordinatorLayout.F = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap<View, fib> weakHashMap = egb.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i16 = paddingLeft + paddingRight;
        int i17 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.G != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList2 = coordinatorLayout.t;
        int size3 = arrayList2.size();
        int i18 = 0;
        int iCombineMeasuredStates = 0;
        while (i18 < size3) {
            View view2 = (View) arrayList2.get(i18);
            int i19 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i5 = size3;
                i12 = i18;
                i7 = paddingLeft;
                suggestedMinimumWidth = i19;
                z2 = false;
                i9 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i20 = fVar.e;
                if (i20 < 0 || mode == 0) {
                    i4 = suggestedMinimumHeight;
                } else {
                    int iH = coordinatorLayout.h(i20);
                    int i21 = fVar.c;
                    if (i21 == 0) {
                        i21 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, layoutDirection) & 7;
                    i4 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iH - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i2;
                            iMakeMeasureSpec2 = i3;
                        } else {
                            int iC = coordinatorLayout.G.c() + coordinatorLayout.G.b();
                            int iA = coordinatorLayout.G.a() + coordinatorLayout.G.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        cVar = fVar.a;
                        if (cVar != null) {
                            z2 = false;
                            i7 = paddingLeft;
                            i8 = i19;
                            i9 = paddingRight;
                            i10 = i4;
                            arrayList = arrayList2;
                            int i22 = iMakeMeasureSpec;
                            i12 = i18;
                            int i23 = iMakeMeasureSpec2;
                            zM = cVar.m(this, view2, i22, i6, i23);
                            view = view2;
                            iMakeMeasureSpec = i22;
                            i11 = i23;
                            if (zM) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i8, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax3 = Math.max(i10, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i7 = paddingLeft;
                            i8 = i19;
                            z2 = false;
                            i9 = paddingRight;
                            i10 = i4;
                            arrayList = arrayList2;
                            i11 = iMakeMeasureSpec2;
                            view = view2;
                            i12 = i18;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i6, i11, 0);
                        int iMax4 = Math.max(i8, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax5 = Math.max(i10, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iH);
                    }
                    int i24 = size3;
                    i6 = iMax;
                    i5 = i24;
                    if (z5) {
                        iMakeMeasureSpec = i2;
                        iMakeMeasureSpec2 = i3;
                    } else {
                        iMakeMeasureSpec = i2;
                        iMakeMeasureSpec2 = i3;
                    }
                    cVar = fVar.a;
                    if (cVar != null) {
                        z2 = false;
                        i7 = paddingLeft;
                        i8 = i19;
                        i9 = paddingRight;
                        i10 = i4;
                        arrayList = arrayList2;
                        int i25 = iMakeMeasureSpec;
                        i12 = i18;
                        int i26 = iMakeMeasureSpec2;
                        zM = cVar.m(this, view2, i25, i6, i26);
                        view = view2;
                        iMakeMeasureSpec = i25;
                        i11 = i26;
                        if (zM) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i8, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax7 = Math.max(i10, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i7 = paddingLeft;
                        i8 = i19;
                        z2 = false;
                        i9 = paddingRight;
                        i10 = i4;
                        arrayList = arrayList2;
                        i11 = iMakeMeasureSpec2;
                        view = view2;
                        i12 = i18;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i6, i11, 0);
                    int iMax8 = Math.max(i8, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax9 = Math.max(i10, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i5 = size3;
                i6 = 0;
                if (z5) {
                    iMakeMeasureSpec = i2;
                    iMakeMeasureSpec2 = i3;
                } else {
                    iMakeMeasureSpec = i2;
                    iMakeMeasureSpec2 = i3;
                }
                cVar = fVar.a;
                if (cVar != null) {
                    z2 = false;
                    i7 = paddingLeft;
                    i8 = i19;
                    i9 = paddingRight;
                    i10 = i4;
                    arrayList = arrayList2;
                    int i27 = iMakeMeasureSpec;
                    i12 = i18;
                    int i28 = iMakeMeasureSpec2;
                    zM = cVar.m(this, view2, i27, i6, i28);
                    view = view2;
                    iMakeMeasureSpec = i27;
                    i11 = i28;
                    if (zM) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i8, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax11 = Math.max(i10, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i7 = paddingLeft;
                    i8 = i19;
                    z2 = false;
                    i9 = paddingRight;
                    i10 = i4;
                    arrayList = arrayList2;
                    i11 = iMakeMeasureSpec2;
                    view = view2;
                    i12 = i18;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i6, i11, 0);
                int iMax12 = Math.max(i8, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax13 = Math.max(i10, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i18 = i12 + 1;
            paddingLeft = i7;
            paddingRight = i9;
            size3 = i5;
            arrayList2 = arrayList;
        }
        int i29 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i2, (-16777216) & i29), View.resolveSizeAndState(suggestedMinimumHeight, i3, i29 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        c cVar;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    zN |= cVar.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        o(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        l(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        n(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.t);
        SparseArray<Parcelable> sparseArray = hVar.v;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = i(childAt).a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (id != -1 && cVar != null && (parcelableS = cVar.s(childAt)) != null) {
                sparseArray.append(id, parcelableS);
            }
        }
        hVar.v = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return m(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        j(0, view);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zT;
        boolean zV;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.C == null) {
            zT = t(motionEvent, 1);
            if (!zT) {
                zV = false;
            }
            motionEventObtain = null;
            if (this.C == null) {
                zV |= super.onTouchEvent(motionEvent);
            } else if (zT) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zV;
            }
            v(false);
            return zV;
        }
        zT = false;
        c cVar = ((f) this.C.getLayoutParams()).a;
        if (cVar != null) {
            zV = cVar.v(this, this.C, motionEvent);
        } else {
            zV = false;
        }
        motionEventObtain = null;
        if (this.C == null) {
            zV |= super.onTouchEvent(motionEvent);
        } else if (zT) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        v(false);
        return zV;
    }

    public final boolean p(View view, int i2, int i3) {
        z58 z58Var = Q;
        Rect rectA = a();
        f(rectA, view);
        try {
            return rectA.contains(i2, i3);
        } finally {
            rectA.setEmpty();
            z58Var.a(rectA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    public final void q(int i2) {
        int i3;
        Rect rect;
        int i4;
        ArrayList arrayList;
        boolean zH;
        boolean z;
        boolean z2;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        f fVar;
        int i11;
        View view;
        c cVar;
        WeakHashMap<View, fib> weakHashMap = egb.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.t;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i12 = 0;
        while (true) {
            z58 z58Var = Q;
            if (i12 >= size) {
                Rect rect2 = rectA3;
                rectA.setEmpty();
                z58Var.a(rectA);
                rectA2.setEmpty();
                z58Var.a(rectA2);
                rect2.setEmpty();
                z58Var.a(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i12);
            f fVar2 = (f) view2.getLayoutParams();
            if (i2 != 0 || view2.getVisibility() != 8) {
                int i13 = 0;
                while (i13 < i12) {
                    if (fVar2.l == ((View) arrayList2.get(i13))) {
                        f fVar3 = (f) view2.getLayoutParams();
                        if (fVar3.k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            f fVar4 = fVar2;
                            Rect rectA6 = a();
                            f(rectA4, fVar3.k);
                            d(view2, rectA5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            fVar = fVar4;
                            i11 = i13;
                            layoutDirection = layoutDirection;
                            view = view3;
                            g(layoutDirection, rectA4, rectA6, fVar3, measuredWidth, measuredHeight);
                            boolean z3 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            b(fVar3, rectA6, measuredWidth, measuredHeight);
                            int i14 = rectA6.left - rectA5.left;
                            int i15 = rectA6.top - rectA5.top;
                            if (i14 != 0) {
                                WeakHashMap<View, fib> weakHashMap2 = egb.a;
                                view.offsetLeftAndRight(i14);
                            }
                            if (i15 != 0) {
                                WeakHashMap<View, fib> weakHashMap3 = egb.a;
                                view.offsetTopAndBottom(i15);
                            }
                            if (z3 && (cVar = fVar3.a) != null) {
                                cVar.h(this, view, fVar3.k);
                            }
                            rectA4.setEmpty();
                            z58Var.a(rectA4);
                            rectA5.setEmpty();
                            z58Var.a(rectA5);
                            rectA6.setEmpty();
                            z58Var.a(rectA6);
                        } else {
                            fVar = fVar2;
                            i11 = i13;
                            view = view2;
                        }
                    } else {
                        fVar = fVar2;
                        i11 = i13;
                        view = view2;
                    }
                    i13 = i11 + 1;
                    fVar2 = fVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i12 = i12;
                    rectA3 = rectA3;
                }
                ArrayList arrayList3 = arrayList2;
                f fVar5 = fVar2;
                int i16 = size;
                Rect rect3 = rectA3;
                i3 = i12;
                View view4 = view2;
                d(view4, rectA2, true);
                if (fVar5.g != 0 && !rectA2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar5.g, layoutDirection);
                    int i17 = absoluteGravity & 112;
                    if (i17 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i17 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i18 = absoluteGravity & 7;
                    if (i18 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i18 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (fVar5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap<View, fib> weakHashMap4 = egb.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        f fVar6 = (f) view4.getLayoutParams();
                        c cVar2 = fVar6.a;
                        Rect rectA7 = a();
                        Rect rectA8 = a();
                        rectA8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (cVar2 == null || !cVar2.e(rectA7, view4)) {
                            rectA7.set(rectA8);
                        } else if (!rectA8.contains(rectA7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA7.toShortString() + " | Bounds:" + rectA8.toShortString());
                        }
                        rectA8.setEmpty();
                        z58Var.a(rectA8);
                        if (rectA7.isEmpty()) {
                            rectA7.setEmpty();
                            z58Var.a(rectA7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i9 = (rectA7.top - ((ViewGroup.MarginLayoutParams) fVar6).topMargin) - fVar6.j) >= (i10 = rectA.top)) {
                                z = false;
                            } else {
                                x(i10 - i9, view4);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) fVar6).bottomMargin) + fVar6.j) < (i8 = rectA.bottom)) {
                                x(height - i8, view4);
                                z = true;
                            }
                            if (!z) {
                                x(0, view4);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i6 = (rectA7.left - ((ViewGroup.MarginLayoutParams) fVar6).leftMargin) - fVar6.i) >= (i7 = rectA.left)) {
                                z2 = false;
                            } else {
                                w(i7 - i6, view4);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) fVar6).rightMargin) + fVar6.i) < (i5 = rectA.right)) {
                                w(width - i5, view4);
                                z2 = true;
                            }
                            if (!z2) {
                                w(0, view4);
                            }
                            rectA7.setEmpty();
                            z58Var.a(rectA7);
                        }
                    }
                }
                if (i2 != 2) {
                    rect = rect3;
                    rect.set(((f) view4.getLayoutParams()).p);
                    if (rect.equals(rectA2)) {
                        arrayList = arrayList3;
                        i4 = i16;
                    } else {
                        ((f) view4.getLayoutParams()).p.set(rectA2);
                    }
                } else {
                    rect = rect3;
                }
                int i19 = i3 + 1;
                i4 = i16;
                while (true) {
                    arrayList = arrayList3;
                    if (i19 >= i4) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i19);
                    f fVar7 = (f) view5.getLayoutParams();
                    c cVar3 = fVar7.a;
                    if (cVar3 != null && cVar3.f(view5, view4)) {
                        if (i2 == 0 && fVar7.o) {
                            fVar7.o = false;
                        } else {
                            if (i2 != 2) {
                                zH = cVar3.h(this, view5, view4);
                            } else {
                                cVar3.i(this, view4);
                                zH = true;
                            }
                            if (i2 == 1) {
                                fVar7.o = zH;
                            }
                        }
                    }
                    i19++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i4 = size;
                rect = rectA3;
                i3 = i12;
            }
            i12 = i3 + 1;
            rectA3 = rect;
            size = i4;
            arrayList2 = arrayList;
        }
    }

    public final void r(int i2, View view) {
        int i3;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.k;
        if (view2 == null && fVar.f != -1) {
            aa0.c("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        z58 z58Var = Q;
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                f(rectA, view2);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                g(i2, rectA, rectA2, fVar2, measuredWidth, measuredHeight);
                b(fVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                z58Var.a(rectA);
                rectA2.setEmpty();
                z58Var.a(rectA2);
            }
        }
        int i4 = fVar.e;
        if (i4 < 0) {
            f fVar3 = (f) view.getLayoutParams();
            Rect rectA3 = a();
            rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
            if (this.G != null) {
                WeakHashMap<View, fib> weakHashMap = egb.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA3.left = this.G.b() + rectA3.left;
                    rectA3.top = this.G.d() + rectA3.top;
                    rectA3.right -= this.G.c();
                    rectA3.bottom -= this.G.a();
                }
            }
            Rect rectA4 = a();
            int i5 = fVar3.c;
            if ((i5 & 7) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i2);
            view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
            rectA3.setEmpty();
            z58Var.a(rectA3);
            rectA4.setEmpty();
            z58Var.a(rectA4);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        int i6 = fVar4.c;
        if (i6 == 0) {
            i6 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i4 = width - i4;
        }
        int iH = h(i4) - measuredWidth2;
        if (i7 == 1) {
            iH += measuredWidth2 / 2;
        } else if (i7 == 5) {
            iH += measuredWidth2;
        }
        if (i8 != 16) {
            i3 = i8 != 80 ? 0 : measuredHeight2;
        } else {
            i3 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, Math.min(iH, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar == null || !cVar.q(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.z) {
            return;
        }
        v(false);
        this.z = true;
    }

    public final void s(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.J = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.I = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.I.setState(getDrawableState());
                }
                Drawable drawable3 = this.I;
                WeakHashMap<View, fib> weakHashMap = egb.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.I.setVisible(getVisibility() == 0, false);
                this.I.setCallback(this);
            }
            WeakHashMap<View, fib> weakHashMap2 = egb.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? getContext().getDrawable(i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.I;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.I.setVisible(z, false);
    }

    public final boolean t(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.v;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        i iVar = P;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            c cVar = ((f) view.getLayoutParams()).a;
            if (zK && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i2 == 0) {
                        cVar.k(this, view, motionEventObtain);
                    } else if (i2 == 1) {
                        cVar.v(this, view, motionEventObtain);
                    }
                }
            } else if (!zK && cVar != null) {
                if (i2 == 0) {
                    zK = cVar.k(this, view, motionEvent);
                } else if (i2 == 1) {
                    zK = cVar.v(this, view, motionEvent);
                }
                if (zK) {
                    this.C = view;
                }
            }
        }
        arrayList.clear();
        return zK;
    }

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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v5 android.view.View
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void u() {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (cVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVar.k(this, childAt, motionEventObtain);
                } else {
                    cVar.v(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).getClass();
        }
        this.C = null;
        this.z = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.I;
    }

    public final void y() {
        WeakHashMap<View, fib> weakHashMap = egb.a;
        if (!getFitsSystemWindows()) {
            egb.d.c(this, null);
            return;
        }
        if (this.K == null) {
            this.K = new a();
        }
        egb.d.c(this, this.K);
        setSystemUiVisibility(1280);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean e(Rect rect, View view) {
            return false;
        }

        public boolean f(View view, View view2) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return false;
        }

        public boolean n(View view) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            iArr[0] = iArr[0] + i2;
            iArr[1] = iArr[1] + i3;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public Parcelable s(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean t(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            return false;
        }

        public boolean v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void j() {
        }

        public void g(f fVar) {
        }

        public void i(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void r(View view, Parcelable parcelable) {
        }

        public void u(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        public void o(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class h extends e0 {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public SparseArray<Parcelable> v;

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.v = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.v.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.v;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.v.keyAt(i2);
                parcelableArr[i2] = this.v.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new h[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b;
        public final int c;
        public int d;
        public final int e;
        public final int f;
        public final int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public final Rect p;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ih8.b);
            this.c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.M;
                c cVarNewInstance = null;
                if (!TextUtils.isEmpty(string)) {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.M;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.O;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.N);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVarNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        jl.a("Could not inflate Behavior subclass ".concat(string), e);
                        throw null;
                    }
                }
                this.a = cVarNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public final boolean a(int i) {
            if (i == 0) {
                return this.m;
            }
            if (i != 1) {
                return false;
            }
            return this.n;
        }

        public final void b(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.a = cVar;
                this.b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        public f() {
            super(-2, -2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }
    }
}
