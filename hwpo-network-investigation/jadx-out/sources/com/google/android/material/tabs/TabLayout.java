package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.focus.FocusRingDrawable;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.ae3;
import defpackage.aw;
import defpackage.az6;
import defpackage.bh8;
import defpackage.bj6;
import defpackage.dx8;
import defpackage.e00;
import defpackage.egb;
import defpackage.f83;
import defpackage.fib;
import defpackage.ht3;
import defpackage.j4;
import defpackage.jk6;
import defpackage.kk6;
import defpackage.lk6;
import defpackage.ph8;
import defpackage.pqa;
import defpackage.qp7;
import defpackage.ti0;
import defpackage.uk6;
import defpackage.vka;
import defpackage.vz1;
import defpackage.wib;
import defpackage.x58;
import defpackage.z58;
import defpackage.z90;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    public static final z58 t0 = new z58(16);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public ColorStateList E;
    public ColorStateList F;
    public ColorStateList G;
    public Drawable H;
    public int I;
    public final PorterDuff.Mode J;
    public final float K;
    public final float L;
    public final float M;
    public final int N;
    public int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public int T;
    public final int U;
    public int V;
    public int W;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public boolean e0;
    public com.google.android.material.tabs.a f0;
    public final TimeInterpolator g0;
    public c h0;
    public final ArrayList<c> i0;
    public j j0;
    public ValueAnimator k0;
    public ViewPager l0;
    public qp7 m0;
    public e n0;
    public h o0;
    public b p0;
    public boolean q0;
    public int r0;
    public final x58 s0;
    public int t;
    public final ArrayList<g> u;
    public g v;
    public final f w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements ViewPager.i {
        public boolean a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(ViewPager viewPager, qp7 qp7Var) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.l0 == viewPager) {
                tabLayout.m(qp7Var, this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Deprecated
    public interface c<T extends g> {
        void a(T t);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d extends c<g> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.j();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class f extends LinearLayout {
        public static final /* synthetic */ int v = 0;
        public ValueAnimator t;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View a;
            public final /* synthetic */ View b;

            public a(View view, View view2) {
                this.a = view;
                this.b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.c(this.a, this.b, valueAnimator.getAnimatedFraction());
            }
        }

        public f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.r0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                com.google.android.material.tabs.a aVar = tabLayout.f0;
                Drawable drawable = tabLayout.H;
                aVar.getClass();
                RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, childAt);
                drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
                tabLayout.t = i;
            }
        }

        public final void b(int i) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.H.getBounds();
            tabLayout.H.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void c(View view, View view2, float f) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.H;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.H.getBounds().bottom);
            } else {
                tabLayout.f0.b(tabLayout, view, view2, f, tabLayout.H);
            }
            postInvalidateOnAnimation();
        }

        public final void d(int i, boolean z, int i2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.t == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.t = i;
            a aVar = new a(childAt, childAt2);
            if (!z) {
                this.t.removeAllUpdateListeners();
                this.t.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.t = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.g0);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int iHeight = tabLayout.H.getBounds().height();
            if (iHeight < 0) {
                iHeight = tabLayout.H.getIntrinsicHeight();
            }
            int i = tabLayout.V;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    iHeight = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (tabLayout.H.getBounds().width() > 0) {
                Rect bounds = tabLayout.H.getBounds();
                tabLayout.H.setBounds(bounds.left, height, bounds.right, iHeight);
                tabLayout.H.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.t;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), false, -1);
                return;
            }
            if (tabLayout.t == -1) {
                tabLayout.t = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.t);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.T == 1 || tabLayout.W == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) wib.b(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    tabLayout.T = 0;
                    tabLayout.p(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g {
        public Drawable a;
        public CharSequence b;
        public CharSequence c;
        public int d = -1;
        public View e;
        public TabLayout f;
        public i g;

        public final void a() {
            i iVar = this.g;
            if (iVar != null) {
                iVar.d();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class h implements ViewPager.j {
        public final WeakReference<TabLayout> t;
        public int u;
        public int v;

        public h(TabLayout tabLayout) {
            this.t = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            this.u = this.v;
            this.v = i;
            TabLayout tabLayout = this.t.get();
            if (tabLayout != null) {
                tabLayout.r0 = this.v;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.t.get();
            if (tabLayout != null) {
                int i3 = this.v;
                boolean z = true;
                if (i3 == 2 && this.u != 1) {
                    z = false;
                }
                if (i3 == 2 && this.u == 0) {
                    z = false;
                }
                tabLayout.n(i, f, z, z, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            TabLayout tabLayout = this.t.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.v;
            tabLayout.l(tabLayout.h(i), i2 == 0 || (i2 == 2 && this.u == 0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class i extends LinearLayout {
        public static final /* synthetic */ int E = 0;
        public ImageView A;
        public Drawable B;
        public int C;
        public g t;
        public TextView u;
        public ImageView v;
        public View w;
        public ti0 x;
        public View y;
        public TextView z;

        public i(Context context) {
            super(context);
            this.C = 2;
            e(context);
            setPaddingRelative(TabLayout.this.x, TabLayout.this.y, TabLayout.this.z, TabLayout.this.A);
            setGravity(17);
            setOrientation(!TabLayout.this.a0 ? 1 : 0);
            setClickable(true);
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            WeakHashMap<View, fib> weakHashMap = egb.a;
            egb.f.a(this, systemIcon);
        }

        private ti0 getBadge() {
            return this.x;
        }

        private ti0 getOrCreateBadge() {
            if (this.x == null) {
                this.x = new ti0(getContext(), null);
            }
            b();
            ti0 ti0Var = this.x;
            if (ti0Var != null) {
                return ti0Var;
            }
            aa0.c("Unable to create badge");
            return null;
        }

        public final void a() {
            if (this.x != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.w;
                if (view != null) {
                    ti0 ti0Var = this.x;
                    if (ti0Var != null) {
                        if (ti0Var.e() != null) {
                            ti0Var.e().setForeground(null);
                        } else {
                            view.getOverlay().remove(ti0Var);
                        }
                    }
                    this.w = null;
                }
            }
        }

        public final void b() {
            g gVar;
            if (this.x != null) {
                if (this.y != null) {
                    a();
                    return;
                }
                ImageView imageView = this.v;
                if (imageView != null && (gVar = this.t) != null && gVar.a != null) {
                    if (this.w == imageView) {
                        c(imageView);
                        return;
                    }
                    a();
                    ImageView imageView2 = this.v;
                    if (this.x == null || imageView2 == null) {
                        return;
                    }
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    ti0 ti0Var = this.x;
                    Rect rect = new Rect();
                    imageView2.getDrawingRect(rect);
                    ti0Var.setBounds(rect);
                    ti0Var.k(imageView2, null);
                    if (ti0Var.e() != null) {
                        ti0Var.e().setForeground(ti0Var);
                    } else {
                        imageView2.getOverlay().add(ti0Var);
                    }
                    this.w = imageView2;
                    return;
                }
                TextView textView = this.u;
                if (textView == null || this.t == null) {
                    a();
                    return;
                }
                if (this.w == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.u;
                if (this.x == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                ti0 ti0Var2 = this.x;
                Rect rect2 = new Rect();
                textView2.getDrawingRect(rect2);
                ti0Var2.setBounds(rect2);
                ti0Var2.k(textView2, null);
                if (ti0Var2.e() != null) {
                    ti0Var2.e().setForeground(ti0Var2);
                } else {
                    textView2.getOverlay().add(ti0Var2);
                }
                this.w = textView2;
            }
        }

        public final void c(View view) {
            ti0 ti0Var = this.x;
            if (ti0Var == null || view != this.w) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            ti0Var.setBounds(rect);
            ti0Var.k(view, null);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e  */
        public final void d() {
            boolean z;
            f();
            g gVar = this.t;
            if (gVar == null) {
                z = false;
            } else {
                TabLayout tabLayout = gVar.f;
                if (tabLayout == null) {
                    z90.a("Tab not attached to a TabLayout");
                    return;
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition == -1 || selectedTabPosition != gVar.d) {
                    z = false;
                } else {
                    z = true;
                }
            }
            setSelected(z);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.B;
            if ((drawable == null || !drawable.isStateful()) ? false : this.B.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e(Context context) {
            Drawable rippleDrawable;
            TabLayout tabLayout = TabLayout.this;
            int i = tabLayout.N;
            if (i != 0) {
                Drawable drawableB = e00.b(context, i);
                this.B = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.B.setState(getDrawableState());
                }
            } else {
                this.B = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable focusRingDrawable = gradientDrawable;
            if (tabLayout.G != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = dx8.a(tabLayout.G);
                if (tabLayout.e0) {
                    rippleDrawable = new RippleDrawable(colorStateListA, null, null);
                    ColorDrawable colorDrawable = FocusRingDrawable.I;
                    if (bj6.c(context.getTheme(), R.attr.focusRingsEnabled, false)) {
                        focusRingDrawable = rippleDrawable;
                        focusRingDrawable = new FocusRingDrawable(context, rippleDrawable);
                    }
                } else {
                    RippleDrawable rippleDrawable2 = new RippleDrawable(colorStateListA, gradientDrawable, gradientDrawable2);
                    FocusRingDrawable.e(context, rippleDrawable2, null);
                    focusRingDrawable = rippleDrawable2;
                }
            }
            focusRingDrawable = rippleDrawable;
            setBackground(focusRingDrawable);
            tabLayout.invalidate();
        }

        public final void f() {
            int i;
            ViewParent parent;
            g gVar = this.t;
            View view = gVar != null ? gVar.e : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.y;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.y);
                    }
                    addView(view);
                }
                this.y = view;
                TextView textView = this.u;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.v;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.v.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
                this.z = textView2;
                if (textView2 != null) {
                    this.C = textView2.getMaxLines();
                }
                this.A = (ImageView) view.findViewById(android.R.id.icon);
            } else {
                View view3 = this.y;
                if (view3 != null) {
                    removeView(view3);
                    this.y = null;
                }
                this.z = null;
                this.A = null;
            }
            if (this.y == null) {
                if (this.v == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.v = imageView2;
                    addView(imageView2, 0);
                }
                if (this.u == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.u = textView3;
                    addView(textView3);
                    this.C = this.u.getMaxLines();
                }
                TextView textView4 = this.u;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.B);
                if (!isSelected() || (i = tabLayout.D) == -1) {
                    this.u.setTextAppearance(tabLayout.C);
                } else {
                    this.u.setTextAppearance(i);
                }
                ColorStateList colorStateList = tabLayout.E;
                if (colorStateList != null) {
                    this.u.setTextColor(colorStateList);
                }
                g(this.u, this.v, true);
                b();
                ImageView imageView3 = this.v;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, imageView3));
                }
                TextView textView5 = this.u;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, textView5));
                }
            } else {
                TextView textView6 = this.z;
                if (textView6 != null || this.A != null) {
                    g(textView6, this.A, false);
                }
            }
            if (gVar == null || TextUtils.isEmpty(gVar.c)) {
                return;
            }
            setContentDescription(gVar.c);
        }

        public final void g(TextView textView, ImageView imageView, boolean z) {
            boolean z2;
            Drawable drawable;
            g gVar = this.t;
            Drawable drawableMutate = (gVar == null || (drawable = gVar.a) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (drawableMutate != null) {
                drawableMutate.setTintList(tabLayout.F);
                PorterDuff.Mode mode = tabLayout.J;
                if (mode != null) {
                    drawableMutate.setTintMode(mode);
                }
            }
            g gVar2 = this.t;
            CharSequence charSequence = gVar2 != null ? gVar2.b : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (zIsEmpty) {
                    z2 = false;
                } else {
                    this.t.getClass();
                    z2 = true;
                }
                textView.setText(!zIsEmpty ? charSequence : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iB = (z2 && imageView.getVisibility() == 0) ? (int) wib.b(getContext(), 8) : 0;
                if (tabLayout.a0) {
                    if (iB != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iB);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iB != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iB;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.t;
            CharSequence charSequence2 = gVar3 != null ? gVar3.c : null;
            if (zIsEmpty) {
                charSequence = charSequence2;
            }
            pqa.a(this, charSequence);
        }

        public int getContentHeight() {
            View[] viewArr = {this.u, this.v, this.y};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.u, this.v, this.y};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public g getTab() {
            return this.t;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            ti0 ti0Var = this.x;
            if (ti0Var != null && ti0Var.isVisible()) {
                accessibilityNodeInfo.setContentDescription(this.x.d());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) j4.h.a(isSelected(), 0, 1, this.t.d, 1).a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) j4.a.e.a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(tabLayout.O, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.u != null) {
                float f = tabLayout.K;
                if (isSelected() && tabLayout.D != -1) {
                    f = tabLayout.L;
                }
                int i3 = this.C;
                ImageView imageView = this.v;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.u;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = tabLayout.M;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.u.getTextSize();
                int lineCount = this.u.getLineCount();
                int maxLines = this.u.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (tabLayout.W == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.u.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.u.setTextSize(0, f);
                    this.u.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.t == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            g gVar = this.t;
            TabLayout tabLayout = gVar.f;
            if (tabLayout != null) {
                tabLayout.l(gVar, true);
                return true;
            }
            z90.a("Tab not attached to a TabLayout");
            return false;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.u;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.v;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.y;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.t) {
                this.t = gVar;
                d();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class j implements d {
        public final ViewPager a;

        public j(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(g gVar) {
            this.a.setCurrentItem(gVar.d);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(uk6.a(context, attributeSet, i2, R.style.Widget_Design_TabLayout), attributeSet, i2);
        this.t = -1;
        this.u = new ArrayList<>();
        this.D = -1;
        this.I = 0;
        this.O = Integer.MAX_VALUE;
        this.c0 = -1;
        this.i0 = new ArrayList<>();
        this.s0 = new x58(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.w = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = vka.d(context2, attributeSet, bh8.G, i2, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListA = f83.a(getBackground());
        if (colorStateListA != null) {
            kk6 kk6Var = new kk6();
            kk6Var.p(colorStateListA);
            kk6Var.l(context2);
            kk6Var.o(getElevation());
            setBackground(kk6Var);
        }
        setSelectedTabIndicator(jk6.c(context2, typedArrayD, 5));
        setSelectedTabIndicatorColor(typedArrayD.getColor(8, 0));
        fVar.b(typedArrayD.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(9, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(16, 0);
        this.A = dimensionPixelSize;
        this.z = dimensionPixelSize;
        this.y = dimensionPixelSize;
        this.x = dimensionPixelSize;
        this.x = typedArrayD.getDimensionPixelSize(19, dimensionPixelSize);
        this.y = typedArrayD.getDimensionPixelSize(20, dimensionPixelSize);
        this.z = typedArrayD.getDimensionPixelSize(18, dimensionPixelSize);
        this.A = typedArrayD.getDimensionPixelSize(17, dimensionPixelSize);
        if (bj6.c(context2.getTheme(), R.attr.isMaterial3Theme, false)) {
            this.B = R.attr.textAppearanceTitleSmall;
        } else {
            this.B = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.C = resourceId;
        int[] iArr = ph8.w;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.K = dimensionPixelSize2;
            this.E = jk6.b(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(22)) {
                this.D = typedArrayD.getResourceId(22, resourceId);
            }
            int i3 = this.D;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i3 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i3, iArr);
                try {
                    this.L = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListB = jk6.b(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListB != null) {
                        this.E = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{colorStateListB.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListB.getDefaultColor()), this.E.getDefaultColor()});
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayD.hasValue(25)) {
                this.E = jk6.b(context2, typedArrayD, 25);
            }
            if (typedArrayD.hasValue(23)) {
                this.E = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{typedArrayD.getColor(23, 0), this.E.getDefaultColor()});
            }
            this.F = jk6.b(context2, typedArrayD, 3);
            this.J = wib.c(typedArrayD.getInt(4, -1), null);
            this.G = jk6.b(context2, typedArrayD, 21);
            this.U = typedArrayD.getInt(6, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
            this.g0 = az6.d(context2, R.attr.motionEasingEmphasizedInterpolator, aw.b);
            this.P = typedArrayD.getDimensionPixelSize(14, -1);
            this.Q = typedArrayD.getDimensionPixelSize(13, -1);
            this.N = typedArrayD.getResourceId(0, 0);
            this.S = typedArrayD.getDimensionPixelSize(1, 0);
            this.W = typedArrayD.getInt(15, 1);
            this.T = typedArrayD.getInt(2, 0);
            this.a0 = typedArrayD.getBoolean(12, false);
            this.e0 = typedArrayD.getBoolean(26, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.M = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.R = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            e();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        ArrayList<g> arrayList = this.u;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = arrayList.get(i2);
            if (gVar != null && gVar.a != null && !TextUtils.isEmpty(gVar.b)) {
                return !this.a0 ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i2 = this.P;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.W;
        if (i3 == 0 || i3 == 2) {
            return this.R;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.w.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i2) {
        f fVar = this.w;
        int childCount = fVar.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = fVar.getChildAt(i3);
                if ((i3 != i2 || childAt.isSelected()) && (i3 == i2 || !childAt.isSelected())) {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                } else {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                    if (childAt instanceof i) {
                        ((i) childAt).f();
                    }
                }
                i3++;
            }
        }
    }

    @Deprecated
    public final void a(c cVar) {
        ArrayList<c> arrayList = this.i0;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    public final void b(g gVar, boolean z) {
        ArrayList<g> arrayList = this.u;
        int size = arrayList.size();
        if (gVar.f != this) {
            z90.a("Tab belongs to a different TabLayout.");
            return;
        }
        gVar.d = size;
        arrayList.add(size, gVar);
        int size2 = arrayList.size();
        int i2 = -1;
        for (int i3 = size + 1; i3 < size2; i3++) {
            if (arrayList.get(i3).d == this.t) {
                i2 = i3;
            }
            arrayList.get(i3).d = i3;
        }
        this.t = i2;
        i iVar = gVar.g;
        iVar.setSelected(false);
        iVar.setActivated(false);
        int i4 = gVar.d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.W == 1 && this.T == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.w.addView(iVar, i4, layoutParams);
        if (z) {
            TabLayout tabLayout = gVar.f;
            if (tabLayout != null) {
                tabLayout.l(gVar, true);
            } else {
                z90.a("Tab not attached to a TabLayout");
            }
        }
    }

    public final void c(View view) {
        if (!(view instanceof TabItem)) {
            z90.a("Only TabItem instances can be added to TabLayout");
            return;
        }
        TabItem tabItem = (TabItem) view;
        g gVarI = i();
        CharSequence charSequence = tabItem.t;
        if (charSequence != null) {
            if (TextUtils.isEmpty(gVarI.c) && !TextUtils.isEmpty(charSequence)) {
                gVarI.g.setContentDescription(charSequence);
            }
            gVarI.b = charSequence;
            gVarI.a();
        }
        Drawable drawable = tabItem.u;
        if (drawable != null) {
            gVarI.a = drawable;
            TabLayout tabLayout = gVarI.f;
            if (tabLayout.T == 1 || tabLayout.W == 2) {
                tabLayout.p(true);
            }
            gVarI.a();
        }
        int i2 = tabItem.v;
        if (i2 != 0) {
            gVarI.e = LayoutInflater.from(gVarI.g.getContext()).inflate(i2, (ViewGroup) gVarI.g, false);
            gVarI.a();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            gVarI.c = tabItem.getContentDescription();
            gVarI.a();
        }
        b(gVarI, this.u.isEmpty());
    }

    public final void d(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            f fVar = this.w;
            int childCount = fVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (fVar.getChildAt(i3).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iF = f(0.0f, i2);
            if (scrollX != iF) {
                g();
                this.k0.setIntValues(scrollX, iF);
                this.k0.start();
            }
            ValueAnimator valueAnimator = fVar.t;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.t != i2) {
                fVar.t.cancel();
            }
            fVar.d(i2, true, this.U);
            return;
        }
        n(i2, 0.0f, true, true, true);
    }

    public final void e() {
        int i2 = this.W;
        int iMax = (i2 == 0 || i2 == 2) ? Math.max(0, this.S - this.x) : 0;
        f fVar = this.w;
        fVar.setPaddingRelative(iMax, 0, 0, 0);
        int i3 = this.W;
        if (i3 == 0) {
            int i4 = this.T;
            if (i4 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i4 == 1) {
                fVar.setGravity(1);
            } else if (i4 == 2) {
            }
            fVar.setGravity(8388611);
        } else if (i3 == 1 || i3 == 2) {
            if (this.T == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            fVar.setGravity(1);
        }
        p(true);
    }

    public final int f(float f2, int i2) {
        f fVar;
        View childAt;
        int i3 = this.W;
        if ((i3 != 0 && i3 != 2) || (childAt = (fVar = this.w).getChildAt(i2)) == null) {
            return 0;
        }
        int i4 = i2 + 1;
        View childAt2 = i4 < fVar.getChildCount() ? fVar.getChildAt(i4) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * f2);
        return getLayoutDirection() == 0 ? left + i5 : left - i5;
    }

    public final void g() {
        if (this.k0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.k0 = valueAnimator;
            valueAnimator.setInterpolator(this.g0);
            this.k0.setDuration(this.U);
            this.k0.addUpdateListener(new a());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.v;
        if (gVar != null) {
            return gVar.d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.u.size();
    }

    public int getTabGravity() {
        return this.T;
    }

    public ColorStateList getTabIconTint() {
        return this.F;
    }

    public int getTabIndicatorAnimationMode() {
        return this.d0;
    }

    public int getTabIndicatorGravity() {
        return this.V;
    }

    public int getTabMaxWidth() {
        return this.O;
    }

    public int getTabMode() {
        return this.W;
    }

    public ColorStateList getTabRippleColor() {
        return this.G;
    }

    public Drawable getTabSelectedIndicator() {
        return this.H;
    }

    public ColorStateList getTabTextColors() {
        return this.E;
    }

    public final g h(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.u.get(i2);
    }

    public final g i() {
        g gVar = (g) t0.b();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.f = this;
        x58 x58Var = this.s0;
        i iVar = x58Var != null ? (i) x58Var.b() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.c)) {
            iVar.setContentDescription(gVar.b);
        } else {
            iVar.setContentDescription(gVar.c);
        }
        gVar.g = iVar;
        return gVar;
    }

    public final void j() {
        int currentItem;
        k();
        qp7 qp7Var = this.m0;
        if (qp7Var != null) {
            int count = qp7Var.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                g gVarI = i();
                CharSequence pageTitle = this.m0.getPageTitle(i2);
                if (TextUtils.isEmpty(gVarI.c) && !TextUtils.isEmpty(pageTitle)) {
                    gVarI.g.setContentDescription(pageTitle);
                }
                gVarI.b = pageTitle;
                gVarI.a();
                b(gVarI, false);
            }
            ViewPager viewPager = this.l0;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            l(h(currentItem), true);
        }
    }

    public final void k() {
        f fVar = this.w;
        int childCount = fVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            i iVar = (i) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab(null);
                iVar.setSelected(false);
                this.s0.a(iVar);
            }
            requestLayout();
        }
        Iterator<g> it = this.u.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f = null;
            next.g = null;
            next.a = null;
            next.b = null;
            next.c = null;
            next.d = -1;
            next.e = null;
            t0.a(next);
        }
        this.v = null;
    }

    public final void l(g gVar, boolean z) {
        TabLayout tabLayout;
        g gVar2 = this.v;
        ArrayList<c> arrayList = this.i0;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).getClass();
                }
                d(gVar.d);
                return;
            }
            return;
        }
        int i2 = gVar != null ? gVar.d : -1;
        if (z) {
            if ((gVar2 == null || gVar2.d == -1) && i2 != -1) {
                tabLayout = this;
                tabLayout.n(i2, 0.0f, true, true, true);
            } else {
                tabLayout = this;
                tabLayout.d(i2);
            }
            if (i2 != -1) {
                tabLayout.setSelectedTabView(i2);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.v = gVar;
        if (gVar2 != null && gVar2.f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).getClass();
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).a(gVar);
            }
        }
    }

    public final void m(qp7 qp7Var, boolean z) {
        e eVar;
        qp7 qp7Var2 = this.m0;
        if (qp7Var2 != null && (eVar = this.n0) != null) {
            qp7Var2.unregisterDataSetObserver(eVar);
        }
        this.m0 = qp7Var;
        if (z && qp7Var != null) {
            if (this.n0 == null) {
                this.n0 = new e();
            }
            qp7Var.registerDataSetObserver(this.n0);
        }
        j();
    }

    public final void n(int i2, float f2, boolean z, boolean z2, boolean z3) {
        float f3 = i2 + f2;
        int iRound = Math.round(f3);
        if (iRound >= 0) {
            f fVar = this.w;
            if (iRound >= fVar.getChildCount()) {
                return;
            }
            if (z2) {
                TabLayout.this.t = Math.round(f3);
                ValueAnimator valueAnimator = fVar.t;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.t.cancel();
                }
                fVar.c(fVar.getChildAt(i2), fVar.getChildAt(i2 + 1), f2);
            }
            ValueAnimator valueAnimator2 = this.k0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.k0.cancel();
            }
            int iF = f(f2, i2);
            int scrollX = getScrollX();
            boolean z4 = (i2 < getSelectedTabPosition() && iF >= scrollX) || (i2 > getSelectedTabPosition() && iF <= scrollX) || i2 == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z4 = (i2 < getSelectedTabPosition() && iF <= scrollX) || (i2 > getSelectedTabPosition() && iF >= scrollX) || i2 == getSelectedTabPosition();
            }
            if (z4 || this.r0 == 1 || z3) {
                if (i2 < 0) {
                    iF = 0;
                }
                scrollTo(iF, 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void o(ViewPager viewPager, boolean z) {
        TabLayout tabLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.l0;
        if (viewPager2 != null) {
            h hVar = this.o0;
            if (hVar != null && (arrayList2 = viewPager2.n0) != null) {
                arrayList2.remove(hVar);
            }
            b bVar = this.p0;
            if (bVar != null && (arrayList = this.l0.p0) != null) {
                arrayList.remove(bVar);
            }
        }
        j jVar = this.j0;
        if (jVar != null) {
            this.i0.remove(jVar);
            this.j0 = null;
        }
        if (viewPager != null) {
            this.l0 = viewPager;
            if (this.o0 == null) {
                this.o0 = new h(this);
            }
            h hVar2 = this.o0;
            hVar2.v = 0;
            hVar2.u = 0;
            if (viewPager.n0 == null) {
                viewPager.n0 = new ArrayList();
            }
            viewPager.n0.add(hVar2);
            j jVar2 = new j(viewPager);
            this.j0 = jVar2;
            a(jVar2);
            qp7 adapter = viewPager.getAdapter();
            if (adapter != null) {
                m(adapter, true);
            }
            if (this.p0 == null) {
                this.p0 = new b();
            }
            b bVar2 = this.p0;
            bVar2.a = true;
            if (viewPager.p0 == null) {
                viewPager.p0 = new ArrayList();
            }
            viewPager.p0.add(bVar2);
            tabLayout = this;
            tabLayout.n(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            tabLayout = this;
            tabLayout.l0 = null;
            tabLayout.m(null, false);
        }
        tabLayout.q0 = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lk6.e(this);
        if (this.l0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                o((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.q0) {
            setupWithViewPager(null);
            this.q0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i iVar;
        Drawable drawable;
        int i2 = 0;
        while (true) {
            f fVar = this.w;
            if (i2 >= fVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if ((childAt instanceof i) && (drawable = (iVar = (i) childAt).B) != null) {
                drawable.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
                iVar.B.draw(canvas);
            }
            i2++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.g.a(1, getTabCount(), 1).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iRound = Math.round(wib.b(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int iB = this.Q;
            if (iB <= 0) {
                iB = (int) (size - wib.b(getContext(), 56));
            }
            this.O = iB;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.W;
            if (i4 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(boolean z) {
        int i2 = 0;
        while (true) {
            f fVar = this.w;
            if (i2 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.W == 1 && this.T == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i2++;
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        lk6.c(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.a0 == z) {
            return;
        }
        this.a0 = z;
        int i2 = 0;
        while (true) {
            f fVar = this.w;
            if (i2 >= fVar.getChildCount()) {
                e();
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if (childAt instanceof i) {
                i iVar = (i) childAt;
                iVar.setOrientation(!TabLayout.this.a0 ? 1 : 0);
                TextView textView = iVar.z;
                if (textView == null && iVar.A == null) {
                    iVar.g(iVar.u, iVar.v, true);
                } else {
                    iVar.g(textView, iVar.A, false);
                }
            }
            i2++;
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.h0;
        if (cVar2 != null) {
            this.i0.remove(cVar2);
        }
        this.h0 = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.k0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.H = drawableMutate;
        int i2 = this.I;
        if (i2 != 0) {
            drawableMutate.setTint(i2);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.c0;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.H.getIntrinsicHeight();
        }
        this.w.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.I = i2;
        Drawable drawable = this.H;
        if (i2 != 0) {
            drawable.setTint(i2);
        } else {
            drawable.setTintList(null);
        }
        p(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.V != i2) {
            this.V = i2;
            this.w.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.c0 = i2;
        this.w.b(i2);
    }

    public void setTabGravity(int i2) {
        if (this.T != i2) {
            this.T = i2;
            e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            ArrayList<g> arrayList = this.u;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2).a();
            }
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(vz1.b(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.d0 = i2;
        if (i2 == 0) {
            this.f0 = new com.google.android.material.tabs.a();
            return;
        }
        if (i2 == 1) {
            this.f0 = new ae3();
        } else {
            if (i2 == 2) {
                this.f0 = new ht3();
                return;
            }
            throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.b0 = z;
        int i2 = f.v;
        f fVar = this.w;
        fVar.a(TabLayout.this.getSelectedTabPosition());
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i2) {
        if (i2 != this.W) {
            this.W = i2;
            e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.G == colorStateList) {
            return;
        }
        this.G = colorStateList;
        int i2 = 0;
        while (true) {
            f fVar = this.w;
            if (i2 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if (childAt instanceof i) {
                Context context = getContext();
                int i3 = i.E;
                ((i) childAt).e(context);
            }
            i2++;
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(vz1.b(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            ArrayList<g> arrayList = this.u;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2).a();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(qp7 qp7Var) {
        m(qp7Var, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.e0 == z) {
            return;
        }
        this.e0 = z;
        int i2 = 0;
        while (true) {
            f fVar = this.w;
            if (i2 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if (childAt instanceof i) {
                Context context = getContext();
                int i3 = i.E;
                ((i) childAt).e(context);
            }
            i2++;
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        o(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(e00.b(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
