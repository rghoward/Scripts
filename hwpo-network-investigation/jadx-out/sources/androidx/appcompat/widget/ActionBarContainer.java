package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hwpo_training_app.R;
import defpackage.ph8;
import defpackage.r8;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public final boolean A;
    public boolean B;
    public final int C;
    public boolean t;
    public b u;
    public View v;
    public View w;
    public Drawable x;
    public Drawable y;
    public Drawable z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new r8(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ph8.a);
        boolean z = false;
        this.x = typedArrayObtainStyledAttributes.getDrawable(0);
        this.y = typedArrayObtainStyledAttributes.getDrawable(2);
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.A = true;
            this.z = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.A ? !(this.x != null || this.y != null) : this.z == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.x;
        if (drawable != null && drawable.isStateful()) {
            this.x.setState(getDrawableState());
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null && drawable2.isStateful()) {
            this.y.setState(getDrawableState());
        }
        Drawable drawable3 = this.z;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.z.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.z;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.v = findViewById(R.id.action_bar);
        this.w = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.t || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        b bVar = this.u;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (bVar == null || bVar.getVisibility() == 8) ? false : true;
        if (bVar != null && bVar.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.getLayoutParams();
            int measuredHeight2 = measuredHeight - bVar.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            bVar.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.A) {
            Drawable drawable2 = this.z;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = z3;
            }
        } else {
            if (this.x != null) {
                if (this.v.getVisibility() == 0) {
                    this.x.setBounds(this.v.getLeft(), this.v.getTop(), this.v.getRight(), this.v.getBottom());
                } else {
                    View view = this.w;
                    if (view == null || view.getVisibility() != 0) {
                        this.x.setBounds(0, 0, 0, 0);
                    } else {
                        this.x.setBounds(this.w.getLeft(), this.w.getTop(), this.w.getRight(), this.w.getBottom());
                    }
                }
                z3 = true;
            }
            this.B = z4;
            if (!z4 || (drawable = this.y) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(bVar.getLeft(), bVar.getTop(), bVar.getRight(), bVar.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iA;
        int i3;
        if (this.v == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.C) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.v == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        b bVar = this.u;
        if (bVar == null || bVar.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.v;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.w;
            iA = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.w);
        } else {
            iA = a(this.v);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.u) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.x);
        }
        this.x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.v;
            if (view != null) {
                this.x.setBounds(view.getLeft(), this.v.getTop(), this.v.getRight(), this.v.getBottom());
            }
        }
        boolean z = false;
        if (!this.A ? !(this.x != null || this.y != null) : this.z == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.z;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.z);
        }
        this.z = drawable;
        boolean z = this.A;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.z) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.x != null || this.y != null) : this.z == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.y;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.y);
        }
        this.y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.B && (drawable2 = this.y) != null) {
                drawable2.setBounds(this.u.getLeft(), this.u.getTop(), this.u.getRight(), this.u.getBottom());
            }
        }
        boolean z = false;
        if (!this.A ? !(this.x != null || this.y != null) : this.z == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(b bVar) {
        b bVar2 = this.u;
        if (bVar2 != null) {
            removeView(bVar2);
        }
        this.u = bVar;
        if (bVar != null) {
            addView(bVar);
            ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            bVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.t = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.z;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.x;
        boolean z = this.A;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.y && this.B) {
            return true;
        }
        return (drawable == this.z && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
