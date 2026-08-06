package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import defpackage.aa0;
import defpackage.d43;
import defpackage.egb;
import defpackage.j4;
import defpackage.jt3;
import defpackage.oh8;
import defpackage.q0a;
import defpackage.z4;
import defpackage.z90;
import defpackage.zhb;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public int A;
    public Parcelable B;
    public k C;
    public j D;
    public androidx.viewpager2.widget.c E;
    public androidx.viewpager2.widget.a F;
    public jt3 G;
    public androidx.viewpager2.widget.b H;
    public RecyclerView.l I;
    public boolean J;
    public boolean K;
    public int L;
    public h M;
    public final Rect t;
    public final Rect u;
    public final androidx.viewpager2.widget.a v;
    public int w;
    public boolean x;
    public final a y;
    public f z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends e {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e, androidx.recyclerview.widget.RecyclerView.h
        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.x = true;
            viewPager2.E.l = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends g {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void a(int i) {
            if (i == 0) {
                ViewPager2.this.e();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.w != i) {
                viewPager2.w = i;
                viewPager2.M.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends g {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.clearFocus();
            if (viewPager2.hasFocus()) {
                viewPager2.C.requestFocus(2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public abstract class d {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class e extends RecyclerView.h {
        @Override // androidx.recyclerview.widget.RecyclerView.h
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void b() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void c(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void e(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void f(int i, int i2) {
            a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class f extends LinearLayoutManager {
        public f(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void K0(RecyclerView.a0 a0Var, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.K0(a0Var, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void b0(RecyclerView.v vVar, RecyclerView.a0 a0Var, j4 j4Var) {
            super.b0(vVar, a0Var, j4Var);
            ViewPager2.this.M.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void d0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, j4 j4Var) {
            int iM;
            int iM2;
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getOrientation() == 1) {
                viewPager2.z.getClass();
                iM = RecyclerView.o.M(view);
            } else {
                iM = 0;
            }
            if (viewPager2.getOrientation() == 0) {
                viewPager2.z.getClass();
                iM2 = RecyclerView.o.M(view);
            } else {
                iM2 = 0;
            }
            j4Var.l(j4.h.a(false, iM, 1, iM2, 1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean p0(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, Bundle bundle) {
            ViewPager2.this.M.getClass();
            return super.p0(vVar, a0Var, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean u0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class h extends d {
        public final a a = new a();
        public final b b = new b();
        public androidx.viewpager2.widget.d c;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements z4 {
            public a() {
            }

            @Override // defpackage.z4
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.K) {
                    viewPager2.d(currentItem, true);
                }
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class b implements z4 {
            public b() {
            }

            @Override // defpackage.z4
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.K) {
                    viewPager2.d(currentItem, true);
                }
                return true;
            }
        }

        public h() {
        }

        public final void a() {
            int iF;
            int i = R.id.accessibilityActionPageLeft;
            ViewPager2 viewPager2 = ViewPager2.this;
            egb.l(R.id.accessibilityActionPageLeft, viewPager2);
            egb.i(0, viewPager2);
            egb.l(R.id.accessibilityActionPageRight, viewPager2);
            egb.i(0, viewPager2);
            egb.l(R.id.accessibilityActionPageUp, viewPager2);
            egb.i(0, viewPager2);
            egb.l(R.id.accessibilityActionPageDown, viewPager2);
            egb.i(0, viewPager2);
            if (viewPager2.getAdapter() == null || (iF = viewPager2.getAdapter().f()) == 0 || !viewPager2.K) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.b;
            a aVar = this.a;
            if (orientation != 0) {
                if (viewPager2.w < iF - 1) {
                    egb.m(viewPager2, new j4.a(R.id.accessibilityActionPageDown, (String) null), aVar);
                }
                if (viewPager2.w > 0) {
                    egb.m(viewPager2, new j4.a(R.id.accessibilityActionPageUp, (String) null), bVar);
                    return;
                }
                return;
            }
            boolean z = viewPager2.z.b.getLayoutDirection() == 1;
            int i2 = z ? 16908360 : 16908361;
            if (z) {
                i = 16908361;
            }
            if (viewPager2.w < iF - 1) {
                egb.m(viewPager2, new j4.a(i2, (String) null), aVar);
            }
            if (viewPager2.w > 0) {
                egb.m(viewPager2, new j4.a(i, (String) null), bVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface i {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class j extends y {
        public j() {
        }

        @Override // androidx.recyclerview.widget.y, androidx.recyclerview.widget.g0
        public final View d(RecyclerView.o oVar) {
            androidx.viewpager2.widget.c cVar = ViewPager2.this.G.a;
            return super.d(oVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class k extends RecyclerView {
        public k(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.M.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.w);
            accessibilityEvent.setToIndex(viewPager2.w);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.K && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.K && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class m implements Runnable {
        public final int t;
        public final RecyclerView u;

        public m(int i, k kVar) {
            this.t = i;
            this.u = kVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.u.m0(this.t);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.t = new Rect();
        this.u = new Rect();
        this.v = new androidx.viewpager2.widget.a();
        this.x = false;
        this.y = new a();
        this.A = -1;
        this.I = null;
        this.J = false;
        this.K = true;
        this.L = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.M = new h();
        k kVar = new k(context);
        this.C = kVar;
        kVar.setId(View.generateViewId());
        this.C.setDescendantFocusability(131072);
        f fVar = new f(context);
        this.z = fVar;
        this.C.setLayoutManager(fVar);
        this.C.setScrollingTouchSlop(1);
        int[] iArr = oh8.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        egb.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.C.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            k kVar2 = this.C;
            zhb zhbVar = new zhb();
            if (kVar2.W == null) {
                kVar2.W = new ArrayList();
            }
            kVar2.W.add(zhbVar);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
            this.E = cVar;
            this.G = new jt3(cVar);
            j jVar = new j();
            this.D = jVar;
            jVar.a(this.C);
            this.C.i(this.E);
            androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
            this.F = aVar;
            this.E.a = aVar;
            b bVar = new b();
            c cVar2 = new c();
            this.F.a.add(bVar);
            this.F.a.add(cVar2);
            h hVar = this.M;
            k kVar3 = this.C;
            hVar.getClass();
            kVar3.setImportantForAccessibility(2);
            hVar.c = new androidx.viewpager2.widget.d(hVar);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            androidx.viewpager2.widget.a aVar2 = this.F;
            aVar2.a.add(this.v);
            androidx.viewpager2.widget.b bVar2 = new androidx.viewpager2.widget.b();
            this.H = bVar2;
            this.F.a.add(bVar2);
            k kVar4 = this.C;
            attachViewToParent(kVar4, 0, kVar4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        RecyclerView.f adapter;
        if (this.A == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.B;
        if (parcelable != null) {
            if (adapter instanceof q0a) {
                ((q0a) adapter).b(parcelable);
            }
            this.B = null;
        }
        int iMax = Math.max(0, Math.min(this.A, adapter.f() - 1));
        this.w = iMax;
        this.A = -1;
        this.C.j0(iMax);
        this.M.a();
    }

    public final void c(int i2, boolean z) {
        androidx.viewpager2.widget.c cVar = this.G.a;
        d(i2, z);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.C.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.C.canScrollVertically(i2);
    }

    public final void d(int i2, boolean z) {
        RecyclerView.f adapter = getAdapter();
        if (adapter == null) {
            if (this.A != -1) {
                this.A = Math.max(i2, 0);
                return;
            }
            return;
        }
        if (adapter.f() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i2, 0), adapter.f() - 1);
        int i3 = this.w;
        if (iMin == i3 && this.E.f == 0) {
            return;
        }
        if (iMin == i3 && z) {
            return;
        }
        double d2 = i3;
        this.w = iMin;
        this.M.a();
        androidx.viewpager2.widget.c cVar = this.E;
        if (cVar.f != 0) {
            cVar.f();
            androidx.viewpager2.widget.c.a aVar = cVar.g;
            d2 = ((double) aVar.a) + ((double) aVar.b);
        }
        androidx.viewpager2.widget.c cVar2 = this.E;
        cVar2.getClass();
        cVar2.e = z ? 2 : 3;
        boolean z2 = cVar2.i != iMin;
        cVar2.i = iMin;
        cVar2.d(2);
        if (z2) {
            cVar2.c(iMin);
        }
        if (!z) {
            this.C.j0(iMin);
            return;
        }
        double d3 = iMin;
        double dAbs = Math.abs(d3 - d2);
        k kVar = this.C;
        if (dAbs <= 3.0d) {
            kVar.m0(iMin);
            return;
        }
        kVar.j0(d3 > d2 ? iMin - 3 : iMin + 3);
        k kVar2 = this.C;
        kVar2.post(new m(iMin, kVar2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof l) {
            int i2 = ((l) parcelable).t;
            sparseArray.put(this.C.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public final void e() {
        j jVar = this.D;
        if (jVar == null) {
            aa0.c("Design assumption violated.");
            return;
        }
        View viewD = jVar.d(this.z);
        if (viewD == null) {
            return;
        }
        this.z.getClass();
        int iM = RecyclerView.o.M(viewD);
        if (iM != this.w && getScrollState() == 0) {
            this.F.c(iM);
        }
        this.x = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.M.getClass();
        this.M.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.f getAdapter() {
        return this.C.getAdapter();
    }

    public int getCurrentItem() {
        return this.w;
    }

    public int getItemDecorationCount() {
        return this.C.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.L;
    }

    public int getOrientation() {
        return this.z.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        k kVar = this.C;
        if (getOrientation() == 0) {
            height = kVar.getWidth() - kVar.getPaddingLeft();
            paddingBottom = kVar.getPaddingRight();
        } else {
            height = kVar.getHeight() - kVar.getPaddingTop();
            paddingBottom = kVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.E.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iF;
        int iF2;
        int iF3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            iF = 0;
            iF2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iF = viewPager2.getAdapter().f();
            iF2 = 1;
        } else {
            iF2 = viewPager2.getAdapter().f();
            iF = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.g.a(iF, iF2, 0).a);
        RecyclerView.f adapter = viewPager2.getAdapter();
        if (adapter == null || (iF3 = adapter.f()) == 0 || !viewPager2.K) {
            return;
        }
        if (viewPager2.w > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.w < iF3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.C.getMeasuredWidth();
        int measuredHeight = this.C.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.t;
        rect.left = paddingLeft;
        rect.right = (i4 - i2) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i5 - i3) - getPaddingBottom();
        Rect rect2 = this.u;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.C.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.x) {
            e();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        measureChild(this.C, i2, i3);
        int measuredWidth = this.C.getMeasuredWidth();
        int measuredHeight = this.C.getMeasuredHeight();
        int measuredState = this.C.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.A = lVar.u;
        this.B = lVar.v;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.t = this.C.getId();
        int i2 = this.A;
        if (i2 == -1) {
            i2 = this.w;
        }
        lVar.u = i2;
        Parcelable parcelable = this.B;
        if (parcelable != null) {
            lVar.v = parcelable;
            return lVar;
        }
        Object adapter = this.C.getAdapter();
        if (adapter instanceof q0a) {
            lVar.v = ((q0a) adapter).a();
        }
        return lVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        this.M.getClass();
        if (i2 != 8192 && i2 != 4096) {
            return super.performAccessibilityAction(i2, bundle);
        }
        h hVar = this.M;
        hVar.getClass();
        ViewPager2 viewPager2 = ViewPager2.this;
        if (i2 != 8192 && i2 != 4096) {
            d43.c();
            return false;
        }
        int currentItem = i2 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.K) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    public void setAdapter(RecyclerView.f fVar) {
        RecyclerView.f adapter = this.C.getAdapter();
        h hVar = this.M;
        if (adapter != null) {
            adapter.t(hVar.c);
        } else {
            hVar.getClass();
        }
        a aVar = this.y;
        if (adapter != null) {
            adapter.t(aVar);
        }
        this.C.setAdapter(fVar);
        this.w = 0;
        b();
        h hVar2 = this.M;
        hVar2.a();
        if (fVar != null) {
            fVar.r(hVar2.c);
        }
        if (fVar != null) {
            fVar.r(aVar);
        }
    }

    public void setCurrentItem(int i2) {
        c(i2, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.M.a();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            z90.a("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.L = i2;
            this.C.requestLayout();
        }
    }

    public void setOrientation(int i2) {
        this.z.m1(i2);
        this.M.a();
    }

    public void setPageTransformer(i iVar) {
        boolean z = this.J;
        if (iVar != null) {
            if (!z) {
                this.I = this.C.getItemAnimator();
                this.J = true;
            }
            this.C.setItemAnimator(null);
        } else if (z) {
            this.C.setItemAnimator(this.I);
            this.I = null;
            this.J = false;
        }
        this.H.getClass();
        if (iVar == null) {
            return;
        }
        this.H.getClass();
        this.H.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.K = z;
        this.M.a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class g {
        public void a(int i) {
        }

        public void c(int i) {
        }

        public void b(int i, float f, int i2) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class l extends View.BaseSavedState {
        public static final Parcelable.Creator<l> CREATOR = new a();
        public int t;
        public int u;
        public Parcelable v;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.t);
            parcel.writeInt(this.u);
            parcel.writeParcelable(this.v, i);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.ClassLoaderCreator<l> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                l lVar = new l(parcel, null);
                lVar.t = parcel.readInt();
                lVar.u = parcel.readInt();
                lVar.v = parcel.readParcelable(null);
                return lVar;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new l[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                l lVar = new l(parcel, classLoader);
                lVar.t = parcel.readInt();
                lVar.u = parcel.readInt();
                lVar.v = parcel.readParcelable(classLoader);
                return lVar;
            }
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = new Rect();
        this.u = new Rect();
        this.v = new androidx.viewpager2.widget.a();
        this.x = false;
        this.y = new a();
        this.A = -1;
        this.I = null;
        this.J = false;
        this.K = true;
        this.L = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.t = new Rect();
        this.u = new Rect();
        this.v = new androidx.viewpager2.widget.a();
        this.x = false;
        this.y = new a();
        this.A = -1;
        this.I = null;
        this.J = false;
        this.K = true;
        this.L = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.t = new Rect();
        this.u = new Rect();
        this.v = new androidx.viewpager2.widget.a();
        this.x = false;
        this.y = new a();
        this.A = -1;
        this.I = null;
        this.J = false;
        this.K = true;
        this.L = -1;
        a(context, attributeSet);
    }
}
