package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.egb;
import defpackage.fib;
import defpackage.gib;
import defpackage.lmb;
import defpackage.n97;
import defpackage.o97;
import defpackage.p97;
import defpackage.qn2;
import defpackage.rn2;
import defpackage.umb;
import defpackage.xd5;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements qn2, n97, o97 {
    public static final int[] V = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final umb W;
    public static final Rect a0;
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final Rect F;
    public final Rect G;
    public final Rect H;
    public final Rect I;
    public umb J;
    public umb K;
    public umb L;
    public umb M;
    public d N;
    public OverScroller O;
    public ViewPropertyAnimator P;
    public final a Q;
    public final b R;
    public final c S;
    public final p97 T;
    public final f U;
    public int t;
    public int u;
    public ContentFrameLayout v;
    public ActionBarContainer w;
    public rn2 x;
    public Drawable y;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.P = null;
            actionBarOverlayLayout.C = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.P = null;
            actionBarOverlayLayout.C = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.P = actionBarOverlayLayout.w.animate().translationY(0.0f).setListener(actionBarOverlayLayout.Q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.P = actionBarOverlayLayout.w.animate().translationY(-actionBarOverlayLayout.w.getHeight()).setListener(actionBarOverlayLayout.Q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e extends ViewGroup.MarginLayoutParams {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        umb.h bVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            bVar = new umb.g();
        } else if (i >= 35) {
            bVar = new umb.f();
        } else if (i >= 34) {
            bVar = new umb.e();
        } else if (i >= 31) {
            bVar = new umb.d();
        } else if (i >= 30) {
            bVar = new umb.c();
        } else {
            bVar = i >= 29 ? new umb.b() : new umb.a();
        }
        bVar.h(xd5.c(0, 1, 0, 1));
        W = bVar.b();
        a0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = 0;
        this.F = new Rect();
        this.G = new Rect();
        this.H = new Rect();
        this.I = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        umb umbVar = umb.b;
        this.J = umbVar;
        this.K = umbVar;
        this.L = umbVar;
        this.M = umbVar;
        this.Q = new a();
        this.R = new b();
        this.S = new c();
        r(context);
        this.T = new p97();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.U = fVar;
        addView(fVar);
    }

    public static boolean p(View view, Rect rect, boolean z) {
        boolean z2;
        e eVar = (e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.qn2
    public final void a(Menu menu, j.a aVar) {
        s();
        this.x.a(menu, aVar);
    }

    @Override // defpackage.qn2
    public final boolean b() {
        s();
        return this.x.b();
    }

    @Override // defpackage.qn2
    public final void c() {
        s();
        this.x.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // defpackage.qn2
    public final boolean d() {
        s();
        return this.x.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.y != null) {
            if (this.w.getVisibility() == 0) {
                translationY = (int) (this.w.getTranslationY() + this.w.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.y.setBounds(0, translationY, getWidth(), this.y.getIntrinsicHeight() + translationY);
            this.y.draw(canvas);
        }
    }

    @Override // defpackage.qn2
    public final boolean e() {
        s();
        return this.x.e();
    }

    @Override // defpackage.qn2
    public final boolean f() {
        s();
        return this.x.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.qn2
    public final boolean g() {
        s();
        return this.x.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.w;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        p97 p97Var = this.T;
        return p97Var.b | p97Var.a;
    }

    public CharSequence getTitle() {
        s();
        return this.x.getTitle();
    }

    @Override // defpackage.qn2
    public final void h(int i) {
        s();
        if (i == 2) {
            this.x.p();
        } else if (i == 5) {
            this.x.q();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // defpackage.qn2
    public final void i() {
        s();
        this.x.h();
    }

    @Override // defpackage.n97
    public final void j(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.o97
    public final void k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        l(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.n97
    public final void l(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.n97
    public final boolean m(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.n97
    public final void n(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        umb umbVarH = umb.h(windowInsets, this);
        boolean zP = p(this.w, new Rect(umbVarH.b(), umbVarH.d(), umbVarH.c(), umbVarH.a()), false);
        WeakHashMap<View, fib> weakHashMap = egb.a;
        Rect rect = this.F;
        egb.d.b(this, umbVarH, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        umb.q qVar = umbVarH.a;
        umb umbVarR = qVar.r(i, i2, i3, i4);
        this.J = umbVarR;
        boolean z = true;
        if (!this.K.equals(umbVarR)) {
            this.K = this.J;
            zP = true;
        }
        Rect rect2 = this.G;
        if (rect2.equals(rect)) {
            z = zP;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return qVar.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, fib> weakHashMap = egb.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00da  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        umb umbVar;
        int i3;
        umb.h aVar;
        s();
        measureChildWithMargins(this.w, i, 0, i2, 0);
        e eVar = (e) this.w.getLayoutParams();
        int iMax = Math.max(0, this.w.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.w.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.w.getMeasuredState());
        WeakHashMap<View, fib> weakHashMap = egb.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.t;
            if (this.A && this.w.getTabContainer() != null) {
                measuredHeight += this.t;
            }
        } else {
            measuredHeight = this.w.getVisibility() != 8 ? this.w.getMeasuredHeight() : 0;
        }
        Rect rect = this.F;
        Rect rect2 = this.H;
        rect2.set(rect);
        this.L = this.J;
        if (this.z || z) {
            xd5 xd5VarC = xd5.c(this.L.b(), this.L.d() + measuredHeight, this.L.c(), this.L.a());
            umbVar = this.L;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                aVar = new umb.g(umbVar);
            } else if (i3 >= 35) {
                aVar = new umb.f(umbVar);
            } else if (i3 >= 34) {
                aVar = new umb.e(umbVar);
            } else if (i3 >= 31) {
                aVar = new umb.d(umbVar);
            } else if (i3 >= 30) {
                aVar = new umb.c(umbVar);
            } else if (i3 >= 29) {
                aVar = new umb.b(umbVar);
            } else {
                aVar = new umb.a(umbVar);
            }
            aVar.h(xd5VarC);
            this.L = aVar.b();
        } else {
            f fVar = this.U;
            umb umbVar2 = W;
            Rect rect3 = this.I;
            egb.d.b(fVar, umbVar2, rect3);
            if (rect3.equals(a0)) {
                xd5 xd5VarC2 = xd5.c(this.L.b(), this.L.d() + measuredHeight, this.L.c(), this.L.a());
                umbVar = this.L;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 36) {
                    aVar = new umb.g(umbVar);
                } else if (i3 >= 35) {
                    aVar = new umb.f(umbVar);
                } else if (i3 >= 34) {
                    aVar = new umb.e(umbVar);
                } else if (i3 >= 31) {
                    aVar = new umb.d(umbVar);
                } else if (i3 >= 30) {
                    aVar = new umb.c(umbVar);
                } else if (i3 >= 29) {
                    aVar = new umb.b(umbVar);
                } else {
                    aVar = new umb.a(umbVar);
                }
                aVar.h(xd5VarC2);
                this.L = aVar.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.L = this.L.a.r(0, measuredHeight, 0, 0);
            }
        }
        p(this.v, rect2, true);
        if (!this.M.equals(this.L)) {
            umb umbVar3 = this.L;
            this.M = umbVar3;
            egb.c(this.v, umbVar3);
        }
        measureChildWithMargins(this.v, i, 0, i2, 0);
        e eVar2 = (e) this.v.getLayoutParams();
        int iMax3 = Math.max(iMax, this.v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.v.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.B || !z) {
            return false;
        }
        this.O.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.O.getFinalY() > this.w.getHeight()) {
            q();
            this.S.run();
        } else {
            q();
            this.R.run();
        }
        this.C = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.D + i2;
        this.D = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        lmb lmbVar;
        gib gibVar;
        this.T.a = i;
        this.D = getActionBarHideOffset();
        q();
        d dVar = this.N;
        if (dVar == null || (gibVar = (lmbVar = (lmb) dVar).s) == null) {
            return;
        }
        gibVar.a();
        lmbVar.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.w.getVisibility() != 0) {
            return false;
        }
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.B || this.C) {
            return;
        }
        if (this.D <= this.w.getHeight()) {
            q();
            postDelayed(this.R, 600L);
        } else {
            q();
            postDelayed(this.S, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        s();
        int i2 = this.E ^ i;
        this.E = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        d dVar = this.N;
        if (dVar != null) {
            lmb lmbVar = (lmb) dVar;
            lmbVar.o = !z2;
            if (z || !z2) {
                if (lmbVar.p) {
                    lmbVar.p = false;
                    lmbVar.t(true);
                }
            } else if (!lmbVar.p) {
                lmbVar.p = true;
                lmbVar.t(true);
            }
        }
        if ((i2 & 256) == 0 || this.N == null) {
            return;
        }
        WeakHashMap<View, fib> weakHashMap = egb.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.u = i;
        d dVar = this.N;
        if (dVar != null) {
            ((lmb) dVar).n = i;
        }
    }

    public final void q() {
        removeCallbacks(this.R);
        removeCallbacks(this.S);
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(V);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.y = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.O = new OverScroller(context);
    }

    public final void s() {
        rn2 wrapper;
        if (this.v == null) {
            this.v = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.w = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof rn2) {
                wrapper = (rn2) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    aa0.c("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.x = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        q();
        this.w.setTranslationY(-Math.max(0, Math.min(i, this.w.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.N = dVar;
        if (getWindowToken() != null) {
            ((lmb) this.N).n = this.u;
            int i = this.E;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, fib> weakHashMap = egb.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.A = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.B) {
            this.B = z;
            if (z) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        s();
        this.x.setIcon(i);
    }

    public void setLogo(int i) {
        s();
        this.x.l(i);
    }

    public void setOverlayMode(boolean z) {
        this.z = z;
    }

    @Override // defpackage.qn2
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.x.setWindowCallback(callback);
    }

    @Override // defpackage.qn2
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.x.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setIcon(Drawable drawable) {
        s();
        this.x.setIcon(drawable);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.n97
    public final void o(View view, int i, int i2, int[] iArr, int i3) {
    }
}
