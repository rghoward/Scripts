package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.j4;
import defpackage.m3;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m3 {
    public final /* synthetic */ AppBarLayout t;
    public final /* synthetic */ CoordinatorLayout u;
    public final /* synthetic */ AppBarLayout.BaseBehavior v;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.v = baseBehavior;
        this.t = appBarLayout;
        this.u = coordinatorLayout;
    }

    @Override // defpackage.m3
    public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
        super.onInitializeAccessibilityNodeInfo(view, j4Var);
        j4Var.j("android.widget.ScrollView");
        AppBarLayout appBarLayout = this.t;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.u;
        AppBarLayout.BaseBehavior baseBehavior = this.v;
        View viewF = AppBarLayout.BaseBehavior.F(baseBehavior, coordinatorLayout);
        if (viewF == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((AppBarLayout.d) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                if (baseBehavior.x() != (-appBarLayout.getTotalScrollRange())) {
                    j4Var.b(j4.a.i);
                    j4Var.q(true);
                }
                if (baseBehavior.x() != 0) {
                    if (!viewF.canScrollVertically(-1)) {
                        j4Var.b(j4.a.j);
                        j4Var.q(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            j4Var.b(j4.a.j);
                            j4Var.q(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.m3
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.t;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.v;
        if (baseBehavior.x() != 0) {
            CoordinatorLayout coordinatorLayout = this.u;
            View viewF = AppBarLayout.BaseBehavior.F(baseBehavior, coordinatorLayout);
            if (!viewF.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                baseBehavior.I(coordinatorLayout, this.t, viewF, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
