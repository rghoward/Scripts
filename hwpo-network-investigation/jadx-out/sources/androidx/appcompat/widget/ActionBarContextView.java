package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.c0;
import defpackage.e00;
import defpackage.egb;
import defpackage.ph8;
import defpackage.u8;
import defpackage.yib;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends c0 {
    public CharSequence B;
    public CharSequence C;
    public View D;
    public View E;
    public View F;
    public LinearLayout G;
    public TextView H;
    public TextView I;
    public final int J;
    public final int K;
    public boolean L;
    public final int M;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements View.OnClickListener {
        public final /* synthetic */ u8 t;

        public a(u8 u8Var) {
            this.t = u8Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.t.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ph8.d, i, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : e00.b(context, resourceId));
        this.J = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.x = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f(u8 u8Var) {
        View view = this.D;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.M, (ViewGroup) this, false);
            this.D = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.D);
        }
        View viewFindViewById = this.D.findViewById(R.id.action_mode_close_button);
        this.E = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(u8Var));
        f fVarE = u8Var.e();
        androidx.appcompat.widget.a aVar = this.w;
        if (aVar != null) {
            aVar.b();
            androidx.appcompat.widget.a.C0005a c0005a = aVar.N;
            if (c0005a != null && c0005a.b()) {
                c0005a.i.dismiss();
            }
        }
        androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(getContext());
        this.w = aVar2;
        aVar2.F = true;
        aVar2.G = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        fVarE.b(this.w, this.u);
        androidx.appcompat.widget.a aVar3 = this.w;
        k kVar = aVar3.A;
        if (kVar == null) {
            k kVar2 = (k) aVar3.w.inflate(aVar3.y, (ViewGroup) this, false);
            aVar3.A = kVar2;
            kVar2.b(aVar3.v);
            aVar3.d(true);
        }
        k kVar3 = aVar3.A;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(aVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.v = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.v, layoutParams);
    }

    public final void g() {
        if (this.G == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.G = linearLayout;
            this.H = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.I = (TextView) this.G.findViewById(R.id.action_bar_subtitle);
            int i = this.J;
            if (i != 0) {
                this.H.setTextAppearance(getContext(), i);
            }
            int i2 = this.K;
            if (i2 != 0) {
                this.I.setTextAppearance(getContext(), i2);
            }
        }
        this.H.setText(this.B);
        this.I.setText(this.C);
        boolean zIsEmpty = TextUtils.isEmpty(this.B);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.C);
        this.I.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.G.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.G.getParent() == null) {
            addView(this.G);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.c0
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // defpackage.c0
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public final void h() {
        removeAllViews();
        this.F = null;
        this.v = null;
        this.w = null;
        View view = this.E;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.w;
        if (aVar != null) {
            aVar.b();
            androidx.appcompat.widget.a.C0005a c0005a = this.w.N;
            if (c0005a == null || !c0005a.b()) {
                return;
            }
            c0005a.i.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = yib.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.D;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.D.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iD = c0.d(i7, paddingTop, paddingTop2, this.D, z3) + i7;
            paddingRight = z3 ? iD - i6 : iD + i6;
        }
        LinearLayout linearLayout = this.G;
        if (linearLayout != null && this.F == null && linearLayout.getVisibility() != 8) {
            paddingRight += c0.d(paddingRight, paddingTop, paddingTop2, this.G, z3);
        }
        View view2 = this.F;
        if (view2 != null) {
            c0.d(paddingRight, paddingTop, paddingTop2, view2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.v;
        if (actionMenuView != null) {
            c0.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            aa0.c(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            aa0.c(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.x;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.D;
        if (view != null) {
            int iC = c0.c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.D.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.v;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c0.c(this.v, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.G;
        if (linearLayout != null && this.F == null) {
            if (this.L) {
                this.G.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.G.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.G.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = c0.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.F;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.F.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.x > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // defpackage.c0
    public void setContentHeight(int i) {
        this.x = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.F;
        if (view2 != null) {
            removeView(view2);
        }
        this.F = view;
        if (view != null && (linearLayout = this.G) != null) {
            removeView(linearLayout);
            this.G = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.C = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.B = charSequence;
        g();
        egb.p(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.L) {
            requestLayout();
        }
        this.L = z;
    }

    @Override // defpackage.c0, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
