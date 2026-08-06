package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.hwpo_training_app.R;
import defpackage.aw;
import defpackage.az6;
import defpackage.kw4;
import defpackage.lw4;
import defpackage.mw4;
import defpackage.nw4;
import defpackage.ow4;
import defpackage.pk;
import defpackage.pw4;
import defpackage.qw4;
import defpackage.z90;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public TimeInterpolator A;
    public TimeInterpolator B;
    public int C;
    public int D;
    public ViewPropertyAnimator E;
    public int F;
    public int G;
    public qw4 t;
    public AccessibilityManager u;
    public nw4 v;
    public final boolean w;
    public final LinkedHashSet<a> x;
    public int y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a();
    }

    public HideViewOnScrollBehavior() {
        this.w = true;
        this.x = new LinkedHashSet<>();
        this.C = 0;
        this.D = 2;
        this.F = 0;
        this.G = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener, nw4] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean l(CoordinatorLayout coordinatorLayout, final V v, int i) {
        if (this.u == null) {
            this.u = (AccessibilityManager) v.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.u;
        if (accessibilityManager != 0 && this.v == null) {
            ?? r0 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: nw4
                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z) {
                    HideViewOnScrollBehavior hideViewOnScrollBehavior = this.t;
                    if (hideViewOnScrollBehavior.w && z && hideViewOnScrollBehavior.D == 1) {
                        hideViewOnScrollBehavior.x(v);
                    }
                }
            };
            this.v = r0;
            accessibilityManager.addTouchExplorationStateChangeListener(r0);
            v.addOnAttachStateChangeListener(new ow4(this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int i2 = ((CoordinatorLayout.f) v.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.C = this.t.a(v, marginLayoutParams);
        this.y = az6.c(v.getContext(), R.attr.motionDurationLong2, 225);
        this.z = az6.c(v.getContext(), R.attr.motionDurationMedium4, 175);
        this.A = az6.d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, aw.d);
        this.B = az6.d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, aw.c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                x(view);
            }
        } else {
            if (this.D == 1) {
                return;
            }
            if (this.w && (accessibilityManager = this.u) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.E;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            y(1, view);
            this.E = this.t.c(this.C, view).setInterpolator(this.B).setDuration(this.z).setListener(new pw4(this, view));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean t(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void w(int i) {
        qw4 qw4Var = this.t;
        if (qw4Var == null || qw4Var.b() != i) {
            if (i == 0) {
                this.t = new mw4();
                return;
            }
            if (i == 1) {
                this.t = new kw4();
            } else if (i == 2) {
                this.t = new lw4();
            } else {
                z90.a(pk.d(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
            }
        }
    }

    public final void x(V v) {
        if (this.D == 2) {
            return;
        }
        y(2, v);
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.t.getClass();
        this.E = this.t.c(0, v).setInterpolator(this.A).setDuration(this.y).setListener(new pw4(this, v));
    }

    public final void y(int i, View view) {
        this.D = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.F = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.G = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.F);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.G);
            }
        }
        Iterator<a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = true;
        this.x = new LinkedHashSet<>();
        this.C = 0;
        this.D = 2;
        this.F = 0;
        this.G = 0;
    }
}
