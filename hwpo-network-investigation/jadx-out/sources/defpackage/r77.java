package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.BaselineLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r77 extends FrameLayout implements v77 {
    public static final int[] C0 = {R.attr.state_checked};
    public static final b D0 = new b();
    public static final c E0 = new c();
    public float A;
    public boolean A0;
    public float B;
    public Rect B0;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public boolean H;
    public final LinearLayout I;
    public final LinearLayout J;
    public final View K;
    public final FrameLayout L;
    public final ImageView M;
    public final BaselineLayout N;
    public final TextView O;
    public final TextView P;
    public final BaselineLayout Q;
    public final TextView R;
    public final TextView S;
    public BaselineLayout T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public ColorStateList c0;
    public boolean d0;
    public h e0;
    public ColorStateList f0;
    public Drawable g0;
    public Drawable h0;
    public ValueAnimator i0;
    public b j0;
    public float k0;
    public boolean l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public boolean q0;
    public int r0;
    public int s0;
    public boolean t;
    public ti0 t0;
    public ColorStateList u;
    public int u0;
    public Drawable v;
    public int v0;
    public int w;
    public int w0;
    public int x;
    public boolean x0;
    public int y;
    public boolean y0;
    public int z;
    public boolean z0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public final /* synthetic */ int t;

        public a(int i) {
            this.t = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            r77.this.j(this.t);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public float a(float f) {
            return 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends b {
        @Override // r77.b
        public final float a(float f) {
            return aw.a(0.4f, 1.0f, f);
        }
    }

    public r77(Context context) {
        super(context);
        this.t = false;
        this.U = -1;
        this.V = 0;
        this.W = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.d0 = false;
        this.j0 = D0;
        this.k0 = 0.0f;
        this.l0 = false;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = -2;
        this.p0 = 0;
        this.q0 = false;
        this.r0 = 0;
        this.s0 = 0;
        this.v0 = 0;
        this.w0 = 49;
        this.x0 = false;
        this.y0 = false;
        this.z0 = false;
        this.A0 = false;
        this.B0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.I = (LinearLayout) findViewById(com.hwpo_training_app.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.hwpo_training_app.R.id.navigation_bar_item_inner_content_container);
        this.J = linearLayout;
        this.K = findViewById(com.hwpo_training_app.R.id.navigation_bar_item_active_indicator_view);
        this.L = (FrameLayout) findViewById(com.hwpo_training_app.R.id.navigation_bar_item_icon_container);
        this.M = (ImageView) findViewById(com.hwpo_training_app.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.hwpo_training_app.R.id.navigation_bar_item_labels_group);
        this.N = baselineLayout;
        TextView textView = (TextView) findViewById(com.hwpo_training_app.R.id.navigation_bar_item_small_label_view);
        this.O = textView;
        TextView textView2 = (TextView) findViewById(com.hwpo_training_app.R.id.navigation_bar_item_large_label_view);
        this.P = textView2;
        float dimension = getResources().getDimension(com.hwpo_training_app.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.hwpo_training_app.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext());
        this.Q = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.Q.setDuplicateParentStateEnabled(true);
        this.Q.setMeasurePaddingFromBaseline(this.z0);
        TextView textView3 = new TextView(getContext());
        this.R = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.R;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.R.setDuplicateParentStateEnabled(true);
        this.R.setIncludeFontPadding(false);
        this.R.setGravity(16);
        this.R.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.S = textView5;
        textView5.setMaxLines(1);
        this.S.setEllipsize(truncateAt);
        this.S.setDuplicateParentStateEnabled(true);
        this.S.setVisibility(4);
        this.S.setIncludeFontPadding(false);
        this.S.setGravity(16);
        this.S.setTextSize(dimension2);
        this.Q.addView(this.R);
        this.Q.addView(this.S);
        this.T = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.w = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.x = baselineLayout.getPaddingBottom();
        this.y = 0;
        this.z = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.R.setImportantForAccessibility(2);
        this.S.setImportantForAccessibility(2);
        setFocusable(true);
        a();
        this.p0 = getResources().getDimensionPixelSize(com.hwpo_training_app.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        final st0 st0Var = (st0) this;
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: q77
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                boolean z;
                ti0 ti0Var;
                st0 st0Var2 = st0Var;
                View view2 = st0Var2.K;
                ImageView imageView = st0Var2.M;
                if (imageView.getVisibility() == 0 && (ti0Var = st0Var2.t0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    ti0Var.setBounds(rect);
                    ti0Var.k(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) st0Var2.J.getLayoutParams();
                int i9 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i10 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z2 = true;
                if (st0Var2.u0 == 1 && st0Var2.o0 == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (st0Var2.o0 != -2 || view2.getMeasuredWidth() == i9) {
                        z = false;
                    } else {
                        layoutParams2.width = Math.max(i9, Math.min(st0Var2.m0, st0Var2.getMeasuredWidth() - (st0Var2.r0 * 2)));
                        z = true;
                    }
                    if (view2.getMeasuredHeight() < i10) {
                        layoutParams2.height = i10;
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        view2.setLayoutParams(layoutParams2);
                    }
                }
            }
        });
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof r77) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        ti0 ti0Var = this.t0;
        int minimumWidth = ti0Var == null ? 0 : ti0Var.getMinimumWidth() - this.t0.x.b.P.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.L.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.M.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(View view, int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public final void a() {
        float textSize = this.O.getTextSize();
        float textSize2 = this.P.getTextSize();
        this.A = textSize - textSize2;
        this.B = (textSize2 * 1.0f) / textSize;
        this.C = (textSize * 1.0f) / textSize2;
        float textSize3 = this.R.getTextSize();
        float textSize4 = this.S.getTextSize();
        this.D = textSize3 - textSize4;
        this.E = (textSize4 * 1.0f) / textSize3;
        this.F = (textSize3 * 1.0f) / textSize4;
    }

    public final void b() {
        Drawable focusRingDrawable = this.v;
        Drawable drawable = null;
        drawable = null;
        drawable = null;
        drawable = null;
        boolean z = true;
        if (this.u != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.l0 && activeIndicatorDrawable != null) {
                RippleDrawable rippleDrawable = new RippleDrawable(dx8.c(this.u), null, activeIndicatorDrawable);
                FocusRingDrawable.e(getContext(), rippleDrawable, activeIndicatorDrawable instanceof kk6 ? (kk6) activeIndicatorDrawable : null);
                drawable = rippleDrawable;
                z = false;
            } else if (focusRingDrawable == null) {
                RippleDrawable rippleDrawable2 = new RippleDrawable(dx8.a(this.u), null, null);
                Context context = getContext();
                ColorDrawable colorDrawable = FocusRingDrawable.I;
                focusRingDrawable = !bj6.c(context.getTheme(), com.hwpo_training_app.R.attr.focusRingsEnabled, false) ? rippleDrawable2 : new FocusRingDrawable(context, rippleDrawable2);
            }
        }
        FrameLayout frameLayout = this.L;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(drawable);
        setBackground(focusRingDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        this.e0 = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.e);
        setId(hVar.a);
        if (!TextUtils.isEmpty(hVar.q)) {
            setContentDescription(hVar.q);
        }
        pqa.a(this, !TextUtils.isEmpty(hVar.r) ? hVar.r : hVar.e);
        l();
        this.t = true;
    }

    public final void d(float f, float f2) {
        b bVar = this.j0;
        bVar.getClass();
        float fA = aw.a(0.4f, 1.0f, f);
        View view = this.K;
        view.setScaleX(fA);
        view.setScaleY(bVar.a(f));
        view.setAlpha(aw.b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        this.k0 = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.l0) {
            this.L.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i = this.M.getLayoutParams().width > 0 ? this.z : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.Q.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f, float f2) {
        i(this.I, this.u0 == 0 ? (int) (this.w + f2) : 0, 0, this.w0);
        int i = this.u0;
        i(this.J, i == 0 ? 0 : this.B0.top, i == 0 ? 0 : this.B0.bottom, i == 0 ? 17 : 8388627);
        int i2 = this.x;
        BaselineLayout baselineLayout = this.N;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i2);
        this.T.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f);
        textView2.setScaleY(f);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i = this.w;
        i(this.I, i, i, this.u0 == 0 ? 17 : this.w0);
        i(this.J, 0, 0, 17);
        BaselineLayout baselineLayout = this.N;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.T.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.K.getBackground();
    }

    public ti0 getBadge() {
        return this.t0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.Q;
    }

    public int getItemBackgroundResId() {
        return com.hwpo_training_app.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.e0;
    }

    public int getItemDefaultMarginResId() {
        return com.hwpo_training_app.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.U;
    }

    public BaselineLayout getLabelGroup() {
        return this.N;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.I;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.u0 == 1) {
            LinearLayout linearLayout = this.J;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.N;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final void h(TextView textView, int i) {
        int iRound;
        if (this.A0) {
            textView.setTextAppearance(i);
            return;
        }
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ph8.w);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                int complexUnit = typedValue.getComplexUnit();
                int i2 = typedValue.data;
                iRound = complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i2) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i2, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public final void j(int i) {
        if (i > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.m0, i - (this.r0 * 2));
            int iMax = this.n0;
            if (this.u0 == 1) {
                int measuredWidth = i - (this.s0 * 2);
                int i2 = this.o0;
                if (i2 != -1) {
                    measuredWidth = i2 == -2 ? this.I.getMeasuredWidth() : Math.min(i2, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.p0, this.J.getMeasuredHeight());
            }
            View view = this.K;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.q0 && this.G == 2) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void k(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(jk6.d(textView.getContext(), i));
        ColorStateList colorStateList = this.c0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.P;
        textView2.setTypeface(textView2.getTypeface(), this.d0 ? 1 : 0);
        TextView textView3 = this.S;
        textView3.setTypeface(textView3.getTypeface(), this.d0 ? 1 : 0);
    }

    public final void l() {
        h hVar = this.e0;
        if (hVar != null) {
            setVisibility((!hVar.isVisible() || (!this.x0 && this.y0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.e0;
        if (hVar != null && hVar.isCheckable() && this.e0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ti0 ti0Var = this.t0;
        if (ti0Var != null && ti0Var.isVisible()) {
            h hVar = this.e0;
            CharSequence charSequence = hVar.e;
            if (!TextUtils.isEmpty(hVar.q)) {
                charSequence = this.e0.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.t0.d()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) j4.h.a(isSelected(), 0, 1, getItemVisiblePosition(), 1).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) j4.a.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.hwpo_training_app.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new a(i));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.K.setBackground(drawable);
        b();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.l0 = z;
        b();
        this.K.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.p0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i) {
        this.s0 = i;
        if (this.u0 == 1) {
            setPadding(i, 0, i, 0);
        }
        j(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.B0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.o0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.n0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.y != i) {
            this.y = i;
            ((LinearLayout.LayoutParams) this.N.getLayoutParams()).topMargin = i;
            BaselineLayout baselineLayout = this.Q;
            if (baselineLayout.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.r0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.q0 = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.m0 = i;
        j(getWidth());
    }

    public void setBadge(ti0 ti0Var) {
        ti0 ti0Var2 = this.t0;
        if (ti0Var2 == ti0Var) {
            return;
        }
        ImageView imageView = this.M;
        if (ti0Var2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.t0 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ti0 ti0Var3 = this.t0;
                if (ti0Var3 != null) {
                    if (ti0Var3.e() != null) {
                        ti0Var3.e().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(ti0Var3);
                    }
                }
                this.t0 = null;
            }
        }
        this.t0 = ti0Var;
        int i = this.v0;
        zi0 zi0Var = ti0Var.x;
        if (zi0Var.l != i) {
            zi0Var.l = i;
            ti0Var.l();
        }
        if (imageView == null || this.t0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        ti0 ti0Var4 = this.t0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        ti0Var4.setBounds(rect);
        ti0Var4.k(imageView, null);
        if (ti0Var4.e() != null) {
            ti0Var4.e().setForeground(ti0Var4);
        } else {
            imageView.getOverlay().add(ti0Var4);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.P;
        setLabelPivots(textView);
        TextView textView2 = this.O;
        setLabelPivots(textView2);
        TextView textView3 = this.S;
        setLabelPivots(textView3);
        TextView textView4 = this.R;
        setLabelPivots(textView4);
        float f = z ? 1.0f : 0.0f;
        if (this.l0 && this.t && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.i0 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.k0, f);
            this.i0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new s77(this, f));
            this.i0.setInterpolator(az6.d(getContext(), com.hwpo_training_app.R.attr.motionEasingEmphasizedInterpolator, aw.b));
            this.i0.setDuration(az6.c(getContext(), com.hwpo_training_app.R.attr.motionDurationLong2, getResources().getInteger(com.hwpo_training_app.R.integer.material_motion_duration_long_1)));
            this.i0.start();
        } else {
            d(f, f);
        }
        float f2 = this.A;
        float f3 = this.B;
        float f4 = this.C;
        if (this.u0 == 1) {
            f2 = this.D;
            f3 = this.E;
            f4 = this.F;
            textView = textView3;
            textView2 = textView4;
        }
        int i = this.G;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        g();
                    }
                } else if (z) {
                    f(textView, textView2, f3, f2);
                } else {
                    f(textView2, textView, f4, 0.0f);
                }
            } else if (z) {
                f(textView, textView2, f3, 0.0f);
            } else {
                g();
            }
        } else if (this.H) {
            if (z) {
                f(textView, textView2, f3, 0.0f);
            } else {
                g();
            }
        } else if (z) {
            f(textView, textView2, f3, f2);
        } else {
            f(textView2, textView, f4, 0.0f);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.O.setEnabled(z);
        this.P.setEnabled(z);
        this.R.setEnabled(z);
        this.S.setEnabled(z);
        this.M.setEnabled(z);
    }

    @Override // defpackage.v77
    public void setExpanded(boolean z) {
        this.x0 = z;
        l();
    }

    public void setHorizontalTextAppearanceActive(int i) {
        this.a0 = i;
        if (i == 0) {
            i = this.V;
        }
        k(this.S, i);
    }

    public void setHorizontalTextAppearanceInactive(int i) {
        this.b0 = i;
        if (i == 0) {
            i = this.W;
        }
        TextView textView = this.R;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(jk6.d(textView.getContext(), i));
        ColorStateList colorStateList = this.c0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.g0) {
            return;
        }
        this.g0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.h0 = drawable;
            ColorStateList colorStateList = this.f0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.M.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.z != i) {
            this.z = i;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        ImageView imageView = this.M;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f0 = colorStateList;
        if (this.e0 == null || (drawable = this.h0) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.h0.invalidateSelf();
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.v = drawable;
        b();
    }

    public void setItemGravity(int i) {
        this.w0 = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.u0 != i) {
            this.u0 = i;
            this.v0 = 0;
            BaselineLayout baselineLayout = this.N;
            this.T = baselineLayout;
            BaselineLayout baselineLayout2 = this.Q;
            LinearLayout linearLayout = this.J;
            int i8 = 8;
            if (i == 1) {
                if (baselineLayout2.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(baselineLayout2, layoutParams);
                    e();
                }
                Rect rect = this.B0;
                int i9 = rect.left;
                int i10 = rect.right;
                int i11 = rect.top;
                i2 = rect.bottom;
                this.v0 = 1;
                int i12 = this.s0;
                this.T = baselineLayout2;
                i6 = i11;
                i5 = i10;
                i4 = i9;
                i3 = i12;
                i7 = 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 8;
                i8 = 0;
            }
            baselineLayout.setVisibility(i8);
            baselineLayout2.setVisibility(i7);
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).gravity = this.w0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i5;
            layoutParams2.topMargin = i6;
            layoutParams2.bottomMargin = i2;
            setPadding(i3, 0, i3, 0);
            j(getWidth());
            b();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.x != i) {
            this.x = i;
            h hVar = this.e0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.w != i) {
            this.w = i;
            h hVar = this.e0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.U = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.u = colorStateList;
        b();
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.A0 = z;
        setTextAppearanceActive(this.V);
        setTextAppearanceInactive(this.W);
        setHorizontalTextAppearanceActive(this.a0);
        setHorizontalTextAppearanceInactive(this.b0);
    }

    public void setLabelMaxLines(int i) {
        TextView textView = this.O;
        textView.setMaxLines(i);
        TextView textView2 = this.P;
        textView2.setMaxLines(i);
        this.R.setMaxLines(i);
        this.S.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.G != i) {
            this.G = i;
            if (this.q0 && i == 2) {
                this.j0 = E0;
            } else {
                this.j0 = D0;
            }
            j(getWidth());
            h hVar = this.e0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.z0 = z;
        this.N.setMeasurePaddingFromBaseline(z);
        this.O.setIncludeFontPadding(z);
        this.P.setIncludeFontPadding(z);
        this.Q.setMeasurePaddingFromBaseline(z);
        this.R.setIncludeFontPadding(z);
        this.S.setIncludeFontPadding(z);
        requestLayout();
    }

    @Override // defpackage.v77
    public void setOnlyShowWhenExpanded(boolean z) {
        this.y0 = z;
        l();
    }

    public void setShifting(boolean z) {
        if (this.H != z) {
            this.H = z;
            h hVar = this.e0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        this.V = i;
        k(this.P, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.d0 = z;
        setTextAppearanceActive(this.V);
        setHorizontalTextAppearanceActive(this.a0);
        TextView textView = this.P;
        textView.setTypeface(textView.getTypeface(), this.d0 ? 1 : 0);
        TextView textView2 = this.S;
        textView2.setTypeface(textView2.getTypeface(), this.d0 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        this.W = i;
        TextView textView = this.O;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(jk6.d(textView.getContext(), i));
        ColorStateList colorStateList = this.c0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.c0 = colorStateList;
        if (colorStateList != null) {
            this.O.setTextColor(colorStateList);
            this.P.setTextColor(colorStateList);
            this.R.setTextColor(colorStateList);
            this.S.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.O.setText(charSequence);
        this.P.setText(charSequence);
        this.R.setText(charSequence);
        this.S.setText(charSequence);
        h hVar = this.e0;
        if (hVar == null || TextUtils.isEmpty(hVar.q)) {
            setContentDescription(charSequence);
        }
        h hVar2 = this.e0;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.r)) {
            charSequence = this.e0.r;
        }
        pqa.a(this, charSequence);
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }
}
