package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.egb;
import defpackage.kh8;
import defpackage.qq2;
import defpackage.qz1;
import defpackage.sk0;
import defpackage.sp2;
import defpackage.umb;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList t;
    public final ArrayList u;
    public View.OnApplyWindowInsetsListener v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, l lVar) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        lVar.getClass();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.w = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kh8.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        f fVarD = lVar.D(id);
        if (classAttribute != null && fVarD == null) {
            if (id == -1) {
                aa0.c(sk0.c("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : BuildConfig.FLAVOR));
                throw null;
            }
            f fVarA = lVar.J().a(context.getClassLoader(), classAttribute);
            fVarA.getClass();
            fVarA.mFragmentId = id;
            fVarA.mContainerId = id;
            fVarA.mTag = string;
            fVarA.mFragmentManager = lVar;
            fVarA.mHost = lVar.x;
            fVarA.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(lVar);
            aVar.p = true;
            fVarA.mContainer = this;
            fVarA.mInDynamicContainer = true;
            aVar.d(getId(), fVarA, string, 1);
            if (aVar.g) {
                aa0.c("This transaction is already being added to the back stack");
                throw null;
            }
            aVar.h = false;
            aVar.r.B(aVar, true);
        }
        ArrayList arrayListD = lVar.c.d();
        int size = arrayListD.size();
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            p pVar = (p) obj;
            f fVar = pVar.c;
            if (fVar.mContainerId == getId() && (view = fVar.mView) != null && view.getParent() == null) {
                fVar.mContainer = this;
                pVar.b();
                pVar.k();
            }
        }
    }

    public final void a(View view) {
        if (this.u.contains(view)) {
            this.t.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof f ? (f) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            qz1.a(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        umb umbVarJ;
        windowInsets.getClass();
        umb umbVarH = umb.h(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.v;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.getClass();
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            umbVarJ = umb.h(windowInsetsOnApplyWindowInsets, null);
        } else {
            umbVarJ = egb.j(this, umbVarH);
        }
        if (!umbVarJ.a.s()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                egb.c(getChildAt(i), umbVarJ);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.w) {
            ArrayList arrayList = this.t;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.w) {
            ArrayList arrayList = this.t;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.u.remove(view);
        if (this.t.remove(view)) {
            this.w = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends f> F getFragment() {
        f fVar;
        g gVar;
        l supportFragmentManager;
        View view = this;
        while (true) {
            if (view == null) {
                fVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            fVar = tag instanceof f ? (f) tag : null;
            if (fVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    gVar = null;
                    break;
                }
                if (context instanceof g) {
                    gVar = (g) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (gVar == null) {
                sp2.b(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            supportFragmentManager = gVar.getSupportFragmentManager();
        } else {
            if (!fVar.isAdded()) {
                throw new IllegalStateException("The Fragment " + fVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fVar.getChildFragmentManager();
        }
        return (F) supportFragmentManager.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.w = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.v = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.u.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        context.getClass();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.w = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        context.getClass();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.w = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kh8.b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }
}
