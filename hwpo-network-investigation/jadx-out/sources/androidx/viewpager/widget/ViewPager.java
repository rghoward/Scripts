package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import defpackage.aa0;
import defpackage.e0;
import defpackage.egb;
import defpackage.fib;
import defpackage.i34;
import defpackage.j4;
import defpackage.m3;
import defpackage.p23;
import defpackage.p51;
import defpackage.pg7;
import defpackage.qp7;
import defpackage.ru3;
import defpackage.umb;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] s0 = {R.attr.layout_gravity};
    public static final a t0 = new a();
    public static final b u0 = new b();
    public Parcelable A;
    public ClassLoader B;
    public Scroller C;
    public boolean D;
    public k E;
    public int F;
    public Drawable G;
    public int H;
    public int I;
    public float J;
    public float K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public float a0;
    public float b0;
    public int c0;
    public VelocityTracker d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public EdgeEffect i0;
    public EdgeEffect j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public ArrayList n0;
    public j o0;
    public ArrayList p0;
    public final c q0;
    public int r0;
    public int t;
    public final ArrayList<f> u;
    public final f v;
    public final Rect w;
    public qp7 x;
    public int y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        public final int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d implements pg7 {
        public final Rect t = new Rect();

        public d() {
        }

        @Override // defpackage.pg7
        public final umb b(View view, umb umbVar) {
            umb umbVarJ = egb.j(view, umbVar);
            if (umbVarJ.a.s()) {
                return umbVarJ;
            }
            int iB = umbVarJ.b();
            Rect rect = this.t;
            rect.left = iB;
            rect.top = umbVarJ.d();
            rect.right = umbVarJ.c();
            rect.bottom = umbVarJ.a();
            ViewPager viewPager = ViewPager.this;
            int childCount = viewPager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                umb umbVarC = egb.c(viewPager.getChildAt(i), umbVarJ);
                rect.left = Math.min(umbVarC.b(), rect.left);
                rect.top = Math.min(umbVarC.d(), rect.top);
                rect.right = Math.min(umbVarC.c(), rect.right);
                rect.bottom = Math.min(umbVarC.a(), rect.bottom);
            }
            return umbVarJ.f(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f {
        public Object a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        public float c;
        public boolean d;

        public g() {
            super(-1, -1);
            this.c = 0.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class h extends m3 {
        public h() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        @Override // defpackage.m3
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            qp7 qp7Var;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            qp7 qp7Var2 = viewPager.x;
            if (qp7Var2 != null) {
                z = qp7Var2.getCount() > 1;
            }
            accessibilityEvent.setScrollable(z);
            if (accessibilityEvent.getEventType() != 4096 || (qp7Var = viewPager.x) == null) {
                return;
            }
            accessibilityEvent.setItemCount(qp7Var.getCount());
            accessibilityEvent.setFromIndex(viewPager.y);
            accessibilityEvent.setToIndex(viewPager.y);
        }

        @Override // defpackage.m3
        public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
            super.onInitializeAccessibilityNodeInfo(view, j4Var);
            j4Var.j("androidx.viewpager.widget.ViewPager");
            ViewPager viewPager = ViewPager.this;
            qp7 qp7Var = viewPager.x;
            j4Var.q(qp7Var != null && qp7Var.getCount() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                j4Var.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                j4Var.a(8192);
            }
        }

        @Override // defpackage.m3
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.y + 1);
                return true;
            }
            if (i != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.y - 1);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface i {
        void a(ViewPager viewPager, qp7 qp7Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface j {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class k extends DataSetObserver {
        public k() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.e();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.e();
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.u = new ArrayList<>();
        this.v = new f();
        this.w = new Rect();
        this.z = -1;
        this.A = null;
        this.B = null;
        this.J = -3.4028235E38f;
        this.K = Float.MAX_VALUE;
        this.P = 1;
        this.c0 = -1;
        this.k0 = true;
        this.q0 = new c();
        this.r0 = 0;
        k();
    }

    public static boolean c(int i2, int i3, int i4, View view, boolean z) {
        int i5;
        if (!(view instanceof ViewGroup)) {
            return z ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i6 = i3 + scrollX;
            if (i6 < childAt.getLeft() || i6 >= childAt.getRight() || (i5 = i4 + scrollY) < childAt.getTop() || i5 >= childAt.getBottom() || !c(i2, i6 - childAt.getLeft(), i5 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z || !view.canScrollHorizontally(-i2)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.N != z) {
            this.N = z;
        }
    }

    public final f a(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.a = this.x.instantiateItem((ViewGroup) this, i2);
        fVar.d = this.x.getPageWidth(i2);
        ArrayList<f> arrayList = this.u;
        if (i3 < 0 || i3 >= arrayList.size()) {
            arrayList.add(fVar);
            return fVar;
        }
        arrayList.add(i3, fVar);
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f fVarH;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fVarH = h(childAt)) != null && fVarH.b == this.y) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        f fVarH;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarH = h(childAt)) != null && fVarH.b == this.y) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new g();
        }
        g gVar = (g) layoutParams;
        boolean z = gVar.a | (view.getClass().getAnnotation(e.class) != null);
        gVar.a = z;
        if (!this.M) {
            super.addView(view, i2, layoutParams);
        } else if (z) {
            aa0.c("Cannot add pager decor view during layout");
        } else {
            gVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    public final boolean b(int i2) {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        boolean z = true;
        boolean zN = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.w;
            if (i2 == 17) {
                int i3 = g(rect, viewFindNextFocus).left;
                int i4 = g(rect, viewFindFocus).left;
                if (viewFindFocus == null || i3 < i4) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    int i5 = this.y;
                    if (i5 > 0) {
                        this.O = false;
                        v(i5 - 1, 0, true, false);
                    } else {
                        z = false;
                    }
                    zN = z;
                }
            } else if (i2 == 66) {
                zRequestFocus = (viewFindFocus == null || g(rect, viewFindNextFocus).left > g(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : n();
            }
            zN = zRequestFocus;
        } else if (i2 == 17 || i2 == 1) {
            int i6 = this.y;
            if (i6 > 0) {
                this.O = false;
                v(i6 - 1, 0, true, false);
            } else {
                z = false;
            }
            zN = z;
        } else if (i2 == 66 || i2 == 2) {
            zN = n();
        }
        if (zN) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zN;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        if (this.x == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.J));
        }
        return i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.K));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.D = true;
        if (this.C.isFinished() || !this.C.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.C.getCurrX();
        int currY = this.C.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                this.C.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, fib> weakHashMap = egb.a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z) {
        boolean z2 = this.r0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.C.isFinished()) {
                this.C.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.C.getCurrX();
                int currY = this.C.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.O = false;
        int i2 = 0;
        while (true) {
            ArrayList<f> arrayList = this.u;
            if (i2 >= arrayList.size()) {
                break;
            }
            f fVar = arrayList.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z2 = true;
            }
            i2++;
        }
        if (z2) {
            c cVar = this.q0;
            if (!z) {
                cVar.run();
            } else {
                WeakHashMap<View, fib> weakHashMap = egb.a;
                postOnAnimation(cVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zB;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zB = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        zB = keyEvent.hasModifiers(2) ? n() : b(66);
                    } else if (keyCode != 61) {
                        zB = false;
                    } else if (keyEvent.hasNoModifiers()) {
                        zB = b(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        zB = b(1);
                    } else {
                        zB = false;
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    int i2 = this.y;
                    if (i2 > 0) {
                        this.O = false;
                        v(i2 - 1, 0, true, false);
                        zB = true;
                    } else {
                        zB = false;
                    }
                } else {
                    zB = b(17);
                }
            }
            if (!zB) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarH;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarH = h(childAt)) != null && fVarH.b == this.y && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        qp7 qp7Var;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (qp7Var = this.x) != null && qp7Var.getCount() > 1)) {
            if (!this.i0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.J * width);
                this.i0.setSize(height, width);
                zDraw = this.i0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.j0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.K + 1.0f)) * width2);
                this.j0.setSize(height2, width2);
                zDraw |= this.j0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.i0.finish();
            this.j0.finish();
        }
        if (zDraw) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.G;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int count = this.x.getCount();
        this.t = count;
        ArrayList<f> arrayList = this.u;
        boolean z = arrayList.size() < (this.P * 2) + 1 && arrayList.size() < count;
        int iMax = this.y;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < arrayList.size()) {
            f fVar = arrayList.get(i2);
            int itemPosition = this.x.getItemPosition(fVar.a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    arrayList.remove(i2);
                    i2--;
                    if (!z2) {
                        this.x.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.x.destroyItem((ViewGroup) this, fVar.b, fVar.a);
                    int i3 = this.y;
                    if (i3 == fVar.b) {
                        iMax = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = fVar.b;
                    if (i4 != itemPosition) {
                        if (i4 == this.y) {
                            iMax = itemPosition;
                        }
                        fVar.b = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.x.finishUpdate((ViewGroup) this);
        }
        Collections.sort(arrayList, t0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                g gVar = (g) getChildAt(i5).getLayoutParams();
                if (!gVar.a) {
                    gVar.c = 0.0f;
                }
            }
            v(iMax, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i2) {
        j jVar = this.o0;
        if (jVar != null) {
            jVar.onPageSelected(i2);
        }
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = (j) this.n0.get(i3);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i2);
                }
            }
        }
    }

    public final Rect g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        gVar.c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0);
        gVar.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return gVar;
    }

    public qp7 getAdapter() {
        return this.x;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public int getCurrentItem() {
        return this.y;
    }

    public int getOffscreenPageLimit() {
        return this.P;
    }

    public int getPageMargin() {
        return this.F;
    }

    public final f h(View view) {
        int i2 = 0;
        while (true) {
            ArrayList<f> arrayList = this.u;
            if (i2 >= arrayList.size()) {
                return null;
            }
            f fVar = arrayList.get(i2);
            if (this.x.isViewFromObject(view, fVar.a)) {
                return fVar;
            }
            i2++;
        }
    }

    public final f i() {
        f fVar;
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.F / clientWidth : 0.0f;
        int i3 = 0;
        boolean z = true;
        f fVar2 = null;
        int i4 = -1;
        float f4 = 0.0f;
        while (true) {
            ArrayList<f> arrayList = this.u;
            if (i3 >= arrayList.size()) {
                break;
            }
            f fVar3 = arrayList.get(i3);
            if (z || fVar3.b == (i2 = i4 + 1)) {
                fVar = fVar3;
            } else {
                float f5 = f2 + f4 + f3;
                f fVar4 = this.v;
                fVar4.e = f5;
                fVar4.b = i2;
                fVar4.d = this.x.getPageWidth(i2);
                i3--;
                fVar = fVar4;
            }
            f2 = fVar.e;
            float f6 = fVar.d + f2 + f3;
            if (!z && scrollX < f2) {
                break;
            }
            if (scrollX < f6 || i3 == arrayList.size() - 1) {
                return fVar;
            }
            int i5 = fVar.b;
            float f7 = fVar.d;
            i3++;
            f fVar5 = fVar;
            i4 = i5;
            f4 = f7;
            fVar2 = fVar5;
            z = false;
        }
        return fVar2;
    }

    public final f j(int i2) {
        int i3 = 0;
        while (true) {
            ArrayList<f> arrayList = this.u;
            if (i3 >= arrayList.size()) {
                return null;
            }
            f fVar = arrayList.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
            i3++;
        }
    }

    public final void k() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.C = new Scroller(context, u0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.U = viewConfiguration.getScaledPagingTouchSlop();
        this.e0 = (int) (400.0f * f2);
        this.f0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.i0 = new EdgeEffect(context);
        this.j0 = new EdgeEffect(context);
        this.g0 = (int) (25.0f * f2);
        this.h0 = (int) (2.0f * f2);
        this.S = (int) (f2 * 16.0f);
        egb.o(this, new h());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        egb.d.c(this, new d());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public final void l(int i2, float f2, int i3) {
        int iMax;
        int width;
        int left;
        if (this.m0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a) {
                    int i5 = gVar.b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = iMax;
                    width = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        j jVar = this.o0;
        if (jVar != null) {
            jVar.onPageScrolled(i2, f2, i3);
        }
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                j jVar2 = (j) this.n0.get(i7);
                if (jVar2 != null) {
                    jVar2.onPageScrolled(i2, f2, i3);
                }
            }
        }
        this.l0 = true;
    }

    public final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.c0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.V = motionEvent.getX(i2);
            this.c0 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.d0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        qp7 qp7Var = this.x;
        if (qp7Var == null || this.y >= qp7Var.getCount() - 1) {
            return false;
        }
        int i2 = this.y + 1;
        this.O = false;
        v(i2, 0, true, false);
        return true;
    }

    public final boolean o(int i2) {
        if (this.u.size() == 0) {
            if (!this.k0) {
                this.l0 = false;
                l(0, 0.0f, 0);
                if (!this.l0) {
                    aa0.c("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        f fVarI = i();
        int clientWidth = getClientWidth();
        int i3 = this.F;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = fVarI.b;
        float f3 = ((i2 / f2) - fVarI.e) / (fVarI.d + (i3 / f2));
        this.l0 = false;
        l(i5, f3, (int) (i4 * f3));
        if (this.l0) {
            return true;
        }
        aa0.c("onPageScrolled did not call superclass implementation");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.q0);
        Scroller scroller = this.C;
        if (scroller != null && !scroller.isFinished()) {
            this.C.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i2;
        float f2;
        super.onDraw(canvas);
        if (this.F <= 0 || this.G == null) {
            return;
        }
        ArrayList<f> arrayList = this.u;
        if (arrayList.size() <= 0 || this.x == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f3 = width;
        float f4 = this.F / f3;
        int i3 = 0;
        f fVar = arrayList.get(0);
        float f5 = fVar.e;
        int size = arrayList.size();
        int i4 = fVar.b;
        int i5 = arrayList.get(size - 1).b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = arrayList.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.e;
                float f7 = fVar.d;
                f2 = (f6 + f7) * f3;
                f5 = f6 + f7 + f4;
            } else {
                float pageWidth = this.x.getPageWidth(i4);
                f2 = (f5 + pageWidth) * f3;
                f5 = pageWidth + f4 + f5;
            }
            if (this.F + f2 > scrollX) {
                this.G.setBounds(Math.round(f2), this.H, Math.round(this.F + f2), this.I);
                this.G.draw(canvas);
            }
            if (f2 > scrollX + width) {
                return;
            }
            i4++;
            arrayList = arrayList;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.Q) {
                return true;
            }
            if (this.R) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.a0 = x;
            this.V = x;
            float y = motionEvent.getY();
            this.b0 = y;
            this.W = y;
            this.c0 = motionEvent.getPointerId(0);
            this.R = false;
            this.D = true;
            this.C.computeScrollOffset();
            if (this.r0 != 2 || Math.abs(this.C.getFinalX() - this.C.getCurrX()) <= this.h0) {
                d(false);
                this.Q = false;
            } else {
                this.C.abortAnimation();
                this.O = false;
                q();
                this.Q = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.c0;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.V;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.b0);
                if (f2 != 0.0f) {
                    float f3 = this.V;
                    if ((f3 >= this.T || f2 <= 0.0f) && ((f3 <= getWidth() - this.T || f2 >= 0.0f) && c((int) f2, (int) x2, (int) y2, this, false))) {
                        this.V = x2;
                        this.W = y2;
                        this.R = true;
                        return false;
                    }
                }
                float f4 = this.U;
                if (fAbs > f4 && fAbs * 0.5f > fAbs2) {
                    this.Q = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f5 = this.a0;
                    float f6 = this.U;
                    this.V = f2 > 0.0f ? f5 + f6 : f5 - f6;
                    this.W = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f4) {
                    this.R = true;
                }
                if (this.Q && p(x2)) {
                    WeakHashMap<View, fib> weakHashMap = egb.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        if (this.d0 == null) {
            this.d0 = VelocityTracker.obtain();
        }
        this.d0.addMovement(motionEvent);
        return this.Q;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        f fVarH;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a) {
                    int i10 = gVar.b;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    if (i11 != 1) {
                        if (i11 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i6 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i12 != 16) {
                            if (i12 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i12 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + paddingTop);
                            i8++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i14 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i14;
                        int i15 = paddingLeft + scrollX;
                        childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + paddingTop);
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i16;
                    if (i12 != 16) {
                        if (i12 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i12 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i17 = paddingLeft + scrollX;
                        childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + paddingTop);
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i18 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i18;
                    int i19 = paddingLeft + scrollX;
                    childAt.layout(i19, paddingTop, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + paddingTop);
                    i8++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i20 = (i6 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.a && (fVarH = h(childAt2)) != null) {
                    float f2 = i20;
                    int i22 = ((int) (fVarH.e * f2)) + paddingLeft;
                    if (gVar2.d) {
                        gVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * gVar2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.H = paddingTop;
        this.I = i7 - paddingBottom;
        this.m0 = i8;
        if (this.k0) {
            z2 = false;
            u(this.y, 0, false, false);
        } else {
            z2 = false;
        }
        this.k0 = z2;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        g gVar;
        g gVar2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.T = Math.min(measuredWidth / 10, this.S);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.a) {
                int i7 = gVar2.b;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z2 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z2) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.L = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.M = true;
        q();
        this.M = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.c), 1073741824), this.L);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        f fVarH;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fVarH = h(childAt)) != null && fVarH.b == this.y && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        ClassLoader classLoader = lVar.x;
        super.onRestoreInstanceState(lVar.t);
        qp7 qp7Var = this.x;
        if (qp7Var != null) {
            qp7Var.restoreState(lVar.w, classLoader);
            v(lVar.v, 0, false, true);
        } else {
            this.z = lVar.v;
            this.A = lVar.w;
            this.B = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.v = this.y;
        qp7 qp7Var = this.x;
        if (qp7Var != null) {
            lVar.w = qp7Var.saveState();
        }
        return lVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.F;
            s(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qp7 qp7Var;
        boolean zT = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (qp7Var = this.x) == null || qp7Var.getCount() == 0) {
            return false;
        }
        if (this.d0 == null) {
            this.d0 = VelocityTracker.obtain();
        }
        this.d0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.C.abortAnimation();
            this.O = false;
            q();
            float x = motionEvent.getX();
            this.a0 = x;
            this.V = x;
            float y = motionEvent.getY();
            this.b0 = y;
            this.W = y;
            this.c0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.V = motionEvent.getX(actionIndex);
                        this.c0 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m(motionEvent);
                        this.V = motionEvent.getX(motionEvent.findPointerIndex(this.c0));
                    }
                } else if (this.Q) {
                    u(this.y, 0, true, false);
                    zT = t();
                }
            } else if (!this.Q) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.c0);
                if (iFindPointerIndex == -1) {
                    zT = t();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.V);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.W);
                    if (fAbs > this.U && fAbs > fAbs2) {
                        this.Q = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f2 = this.a0;
                        float f3 = x2 - f2;
                        int i2 = this.U;
                        this.V = f3 > 0.0f ? f2 + i2 : f2 - i2;
                        this.W = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.Q) {
                        zT = p(motionEvent.getX(motionEvent.findPointerIndex(this.c0)));
                    }
                }
            } else if (this.Q) {
                zT = p(motionEvent.getX(motionEvent.findPointerIndex(this.c0)));
            }
        } else if (this.Q) {
            VelocityTracker velocityTracker = this.d0;
            velocityTracker.computeCurrentVelocity(1000, this.f0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.c0);
            this.O = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarI = i();
            float f4 = clientWidth;
            float f5 = this.F / f4;
            int iMax = fVarI.b;
            float f6 = ((scrollX / f4) - fVarI.e) / (fVarI.d + f5);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.c0)) - this.a0)) <= this.g0 || Math.abs(xVelocity) <= this.e0) {
                iMax += (int) (f6 + (iMax >= this.y ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList<f> arrayList = this.u;
            if (arrayList.size() > 0) {
                iMax = Math.max(arrayList.get(0).b, Math.min(iMax, ((f) p51.b(1, arrayList)).b));
            }
            v(iMax, xVelocity, true, true);
            zT = t();
        }
        if (zT) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean p(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.V - f2;
        this.V = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.J * clientWidth;
        float f5 = this.K * clientWidth;
        ArrayList<f> arrayList = this.u;
        boolean z3 = false;
        f fVar = arrayList.get(0);
        f fVar2 = (f) p51.b(1, arrayList);
        if (fVar.b != 0) {
            f4 = fVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.b != this.x.getCount() - 1) {
            f5 = fVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.i0.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.j0.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.V = (scrollX - i2) + this.V;
        scrollTo(i2, getScrollY());
        o(i2);
        return z3;
    }

    public final void q() {
        r(this.y);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c3 A[PHI: r7 r11 r15
      0x00c3: PHI (r7v13 int) = (r7v12 int), (r7v4 int), (r7v16 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r11v26 int) = (r11v1 int), (r11v25 int), (r11v29 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0145 A[PHI: r3 r12
      0x0145: PHI (r3v43 float) = (r3v41 float), (r3v42 float), (r3v40 float) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r12v10 int) = (r12v8 int), (r12v9 int), (r12v7 int) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void r(int i2) {
        f fVarJ;
        String hexString;
        ArrayList<f> arrayList;
        f fVarA;
        float f2;
        f fVarH;
        f fVarH2;
        int i3;
        int i4;
        f fVar;
        f fVar2;
        f fVar3;
        int i5 = this.y;
        if (i5 != i2) {
            fVarJ = j(i5);
            this.y = i2;
        } else {
            fVarJ = null;
        }
        if (this.x == null || this.O || getWindowToken() == null) {
            return;
        }
        this.x.startUpdate((ViewGroup) this);
        int i6 = this.P;
        int iMax = Math.max(0, this.y - i6);
        int count = this.x.getCount();
        int iMin = Math.min(count - 1, this.y + i6);
        if (count != this.t) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            p23.a(sb, this.t, ", found: ", count, " Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            ru3.e(sb, this.x.getClass());
            return;
        }
        int i7 = 0;
        while (true) {
            arrayList = this.u;
            if (i7 < arrayList.size()) {
                fVarA = arrayList.get(i7);
                int i8 = fVarA.b;
                int i9 = this.y;
                if (i8 >= i9) {
                    if (i8 != i9) {
                        break;
                    } else {
                        break;
                    }
                }
                i7++;
            }
            fVarA = null;
            break;
        }
        if (fVarA == null && count > 0) {
            fVarA = a(this.y, i7);
        }
        if (fVarA != null) {
            int i10 = i7 - 1;
            f fVar4 = i10 >= 0 ? arrayList.get(i10) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - fVarA.d);
            float f3 = 0.0f;
            for (int i11 = this.y - 1; i11 >= 0; i11--) {
                if (f3 < paddingLeft || i11 >= iMax) {
                    if (fVar4 == null || i11 != fVar4.b) {
                        f3 += a(i11, i10 + 1).d;
                        i7++;
                        if (i10 >= 0) {
                            fVar3 = arrayList.get(i10);
                        } else {
                            fVar3 = null;
                        }
                    } else {
                        f3 += fVar4.d;
                        i10--;
                        if (i10 >= 0) {
                            fVar3 = arrayList.get(i10);
                        } else {
                            fVar3 = null;
                        }
                    }
                    fVar4 = fVar3;
                } else {
                    if (fVar4 == null) {
                        break;
                    }
                    if (i11 == fVar4.b && !fVar4.c) {
                        arrayList.remove(i10);
                        this.x.destroyItem((ViewGroup) this, i11, fVar4.a);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                            fVar3 = arrayList.get(i10);
                        } else {
                            fVar3 = null;
                        }
                        fVar4 = fVar3;
                    }
                }
            }
            f2 = 0.0f;
            float f4 = fVarA.d;
            int i12 = i7 + 1;
            if (f4 < 2.0f) {
                f fVar5 = i12 < arrayList.size() ? arrayList.get(i12) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i13 = i12;
                for (int i14 = this.y + 1; i14 < count; i14++) {
                    if (f4 >= paddingRight && i14 > iMin) {
                        if (fVar5 == null) {
                            break;
                        }
                        if (i14 == fVar5.b && !fVar5.c) {
                            arrayList.remove(i13);
                            this.x.destroyItem((ViewGroup) this, i14, fVar5.a);
                            if (i13 < arrayList.size()) {
                                fVar5 = arrayList.get(i13);
                            } else {
                                fVar5 = null;
                            }
                        }
                    } else if (fVar5 == null || i14 != fVar5.b) {
                        f fVarA2 = a(i14, i13);
                        i13++;
                        f4 += fVarA2.d;
                        if (i13 < arrayList.size()) {
                            fVar5 = arrayList.get(i13);
                        } else {
                            fVar5 = null;
                        }
                    } else {
                        f4 += fVar5.d;
                        i13++;
                        if (i13 < arrayList.size()) {
                            fVar5 = arrayList.get(i13);
                        } else {
                            fVar5 = null;
                        }
                    }
                }
            }
            int count2 = this.x.getCount();
            int clientWidth2 = getClientWidth();
            float f5 = clientWidth2 > 0 ? this.F / clientWidth2 : 0.0f;
            if (fVarJ != null) {
                int i15 = fVarJ.b;
                int i16 = fVarA.b;
                if (i15 < i16) {
                    float pageWidth = fVarJ.e + fVarJ.d + f5;
                    int i17 = i15 + 1;
                    int i18 = 0;
                    while (i17 <= fVarA.b && i18 < arrayList.size()) {
                        f fVar6 = arrayList.get(i18);
                        while (true) {
                            fVar2 = fVar6;
                            if (i17 <= fVar2.b || i18 >= arrayList.size() - 1) {
                                break;
                            }
                            i18++;
                            fVar6 = arrayList.get(i18);
                        }
                        while (i17 < fVar2.b) {
                            pageWidth += this.x.getPageWidth(i17) + f5;
                            i17++;
                        }
                        fVar2.e = pageWidth;
                        pageWidth += fVar2.d + f5;
                        i17++;
                    }
                } else if (i15 > i16) {
                    int size = arrayList.size() - 1;
                    float pageWidth2 = fVarJ.e;
                    while (true) {
                        i15--;
                        if (i15 < fVarA.b || size < 0) {
                            break;
                        }
                        f fVar7 = arrayList.get(size);
                        while (true) {
                            fVar = fVar7;
                            if (i15 >= fVar.b || size <= 0) {
                                break;
                            }
                            size--;
                            fVar7 = arrayList.get(size);
                        }
                        while (i15 > fVar.b) {
                            pageWidth2 -= this.x.getPageWidth(i15) + f5;
                            i15--;
                        }
                        pageWidth2 -= fVar.d + f5;
                        fVar.e = pageWidth2;
                    }
                }
            }
            int size2 = arrayList.size();
            float pageWidth3 = fVarA.e;
            int i19 = fVarA.b;
            int i20 = i19 - 1;
            this.J = i19 == 0 ? pageWidth3 : -3.4028235E38f;
            int i21 = count2 - 1;
            this.K = i19 == i21 ? (fVarA.d + pageWidth3) - 1.0f : Float.MAX_VALUE;
            int i22 = i7 - 1;
            while (i22 >= 0) {
                f fVar8 = arrayList.get(i22);
                while (true) {
                    i4 = fVar8.b;
                    if (i20 <= i4) {
                        break;
                    }
                    pageWidth3 -= this.x.getPageWidth(i20) + f5;
                    i20--;
                }
                pageWidth3 -= fVar8.d + f5;
                fVar8.e = pageWidth3;
                if (i4 == 0) {
                    this.J = pageWidth3;
                }
                i22--;
                i20--;
            }
            float pageWidth4 = fVarA.e + fVarA.d + f5;
            int i23 = fVarA.b;
            while (true) {
                i23++;
                if (i12 >= size2) {
                    break;
                }
                f fVar9 = arrayList.get(i12);
                while (true) {
                    i3 = fVar9.b;
                    if (i23 >= i3) {
                        break;
                    }
                    pageWidth4 += this.x.getPageWidth(i23) + f5;
                    i23++;
                }
                if (i3 == i21) {
                    this.K = (fVar9.d + pageWidth4) - 1.0f;
                }
                fVar9.e = pageWidth4;
                pageWidth4 += fVar9.d + f5;
                i12++;
            }
            this.x.setPrimaryItem((ViewGroup) this, this.y, fVarA.a);
        } else {
            f2 = 0.0f;
        }
        this.x.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            g gVar = (g) childAt.getLayoutParams();
            gVar.getClass();
            if (!gVar.a && gVar.c == f2 && (fVarH2 = h(childAt)) != null) {
                gVar.c = fVarH2.d;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                fVarH = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    fVarH = h(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        fVarH = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (fVarH == null || fVarH.b != this.y) {
                for (int i25 = 0; i25 < getChildCount(); i25++) {
                    View childAt2 = getChildAt(i25);
                    f fVarH3 = h(childAt2);
                    if (fVarH3 != null && fVarH3.b == this.y && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.M) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.u.isEmpty()) {
            if (!this.C.isFinished()) {
                this.C.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        f fVarJ = j(this.y);
        int iMin = (int) ((fVarJ != null ? Math.min(fVarJ.e, this.K) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            d(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public void setAdapter(qp7 qp7Var) {
        ArrayList<f> arrayList;
        qp7 qp7Var2 = this.x;
        if (qp7Var2 != null) {
            qp7Var2.setViewPagerObserver(null);
            this.x.startUpdate((ViewGroup) this);
            int i2 = 0;
            while (true) {
                arrayList = this.u;
                if (i2 >= arrayList.size()) {
                    break;
                }
                f fVar = arrayList.get(i2);
                this.x.destroyItem((ViewGroup) this, fVar.b, fVar.a);
                i2++;
            }
            this.x.finishUpdate((ViewGroup) this);
            arrayList.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((g) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.y = 0;
            scrollTo(0, 0);
        }
        this.x = qp7Var;
        this.t = 0;
        if (qp7Var != null) {
            if (this.E == null) {
                this.E = new k();
            }
            this.x.setViewPagerObserver(this.E);
            this.O = false;
            boolean z = this.k0;
            this.k0 = true;
            this.t = this.x.getCount();
            if (this.z >= 0) {
                this.x.restoreState(this.A, this.B);
                v(this.z, 0, false, true);
                this.z = -1;
                this.A = null;
                this.B = null;
            } else if (z) {
                requestLayout();
            } else {
                q();
            }
        }
        ArrayList arrayList2 = this.p0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.p0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((i) this.p0.get(i4)).a(this, qp7Var);
        }
    }

    public void setCurrentItem(int i2) {
        this.O = false;
        v(i2, 0, !this.k0, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.P) {
            this.P = i2;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.o0 = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.F;
        this.F = i2;
        int width = getWidth();
        s(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.G = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.r0 == i2) {
            return;
        }
        this.r0 = i2;
        j jVar = this.o0;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i2);
        }
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = (j) this.n0.get(i3);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i2);
                }
            }
        }
    }

    public final boolean t() {
        this.c0 = -1;
        this.Q = false;
        this.R = false;
        VelocityTracker velocityTracker = this.d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.d0 = null;
        }
        this.i0.onRelease();
        this.j0.onRelease();
        return this.i0.isFinished() || this.j0.isFinished();
    }

    public final void u(int i2, int i3, boolean z, boolean z2) {
        int iMax;
        int scrollX;
        int iAbs;
        f fVarJ = j(i2);
        if (fVarJ != null) {
            iMax = (int) (Math.max(this.J, Math.min(fVarJ.e, this.K)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z) {
            if (z2) {
                f(i2);
            }
            d(false);
            scrollTo(iMax, 0);
            o(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.C;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                boolean z3 = this.D;
                Scroller scroller2 = this.C;
                scrollX = z3 ? scroller2.getCurrX() : scroller2.getStartX();
                this.C.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i4 = scrollX;
            int scrollY = getScrollY();
            int i5 = iMax - i4;
            int i6 = 0 - scrollY;
            if (i5 == 0 && i6 == 0) {
                d(false);
                q();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i7 = clientWidth / 2;
                float f2 = clientWidth;
                float f3 = i7;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i5) * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
                int iAbs2 = Math.abs(i3);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    iAbs = (int) (((Math.abs(i5) / ((this.x.getPageWidth(this.y) * f2) + this.F)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.D = false;
                this.C.startScroll(i4, scrollY, i5, i6, iMin);
                WeakHashMap<View, fib> weakHashMap = egb.a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            f(i2);
        }
    }

    public final void v(int i2, int i3, boolean z, boolean z2) {
        qp7 qp7Var = this.x;
        if (qp7Var == null || qp7Var.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<f> arrayList = this.u;
        if (!z2 && this.y == i2 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.x.getCount()) {
            i2 = this.x.getCount() - 1;
        }
        int i4 = this.P;
        int i5 = this.y;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                arrayList.get(i6).c = true;
            }
        }
        boolean z3 = this.y != i2;
        if (!this.k0) {
            r(i2);
            u(i2, i3, z, z3);
        } else {
            this.y = i2;
            if (z3) {
                f(i2);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.G;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class l extends e0 {
        public static final Parcelable.Creator<l> CREATOR = new a();
        public int v;
        public Parcelable w;
        public final ClassLoader x;

        public l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? l.class.getClassLoader() : classLoader;
            this.v = parcel.readInt();
            this.w = parcel.readParcelable(classLoader);
            this.x = classLoader;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return i34.b(this.v, "}", sb);
        }

        @Override // defpackage.e0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.v);
            parcel.writeParcelable(this.w, i);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class a implements Parcelable.ClassLoaderCreator<l> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new l[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }
        }
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(getContext().getDrawable(i2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = new ArrayList<>();
        this.v = new f();
        this.w = new Rect();
        this.z = -1;
        this.A = null;
        this.B = null;
        this.J = -3.4028235E38f;
        this.K = Float.MAX_VALUE;
        this.P = 1;
        this.c0 = -1;
        this.k0 = true;
        this.q0 = new c();
        this.r0 = 0;
        k();
    }
}
