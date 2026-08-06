package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.hwpo_training_app.R;
import defpackage.aw;
import defpackage.az6;
import defpackage.hw4;
import defpackage.iw4;
import defpackage.jw4;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public hw4 A;
    public final boolean B;
    public int C;
    public ViewPropertyAnimator D;
    public int E;
    public int F;
    public final LinkedHashSet<a> t;
    public int u;
    public int v;
    public TimeInterpolator w;
    public TimeInterpolator x;
    public int y;
    public AccessibilityManager z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.t = new LinkedHashSet<>();
        this.y = 0;
        this.B = true;
        this.C = 2;
        this.E = 0;
        this.F = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener, hw4] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, final V v, int i) {
        this.y = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.u = az6.c(v.getContext(), R.attr.motionDurationLong2, 225);
        this.v = az6.c(v.getContext(), R.attr.motionDurationMedium4, 175);
        this.w = az6.d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, aw.d);
        this.x = az6.d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, aw.c);
        if (this.z == null) {
            this.z = (AccessibilityManager) v.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.z;
        if (accessibilityManager == 0 || this.A != null) {
            return false;
        }
        ?? r4 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: hw4
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                if (z) {
                    HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.t;
                    if (hideBottomViewOnScrollBehavior.C == 1) {
                        hideBottomViewOnScrollBehavior.w(v);
                    }
                }
            }
        };
        this.A = r4;
        accessibilityManager.addTouchExplorationStateChangeListener(r4);
        v.addOnAttachStateChangeListener(new iw4(this));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                w(view);
            }
        } else {
            if (this.C == 1) {
                return;
            }
            if (this.B && (accessibilityManager = this.z) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.D;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            x(1, view);
            this.D = view.animate().translationY(this.y).setInterpolator(this.x).setDuration(this.v).setListener(new jw4(this, view));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void w(V v) {
        if (this.C == 2) {
            return;
        }
        x(2, v);
        ViewPropertyAnimator viewPropertyAnimator = this.D;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.D = v.animate().translationY(0.0f).setInterpolator(this.w).setDuration(this.u).setListener(new jw4(this, v));
    }

    public final void x(int i, View view) {
        this.C = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.E = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.F = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.E);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.F);
            }
        }
        Iterator<a> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = new LinkedHashSet<>();
        this.y = 0;
        this.B = true;
        this.C = 2;
        this.E = 0;
        this.F = 0;
    }
}
