package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.iq3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public int t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View t;
        public final /* synthetic */ int u;
        public final /* synthetic */ iq3 v;

        public a(View view, int i, iq3 iq3Var) {
            this.t = view;
            this.u = i;
            this.v = iq3Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.t;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.t == this.u) {
                iq3 iq3Var = this.v;
                expandableBehavior.w((View) iq3Var, view, iq3Var.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.t = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        iq3 iq3Var = (iq3) view2;
        boolean zA = iq3Var.a();
        int i = this.t;
        if (zA) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        this.t = iq3Var.a() ? 1 : 2;
        w((View) iq3Var, view, iq3Var.a(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        iq3 iq3Var;
        if (!view.isLaidOut()) {
            ArrayList arrayListE = coordinatorLayout.e(view);
            int size = arrayListE.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    iq3Var = null;
                    break;
                }
                View view2 = (View) arrayListE.get(i2);
                if (f(view, view2)) {
                    iq3Var = (iq3) view2;
                    break;
                }
                i2++;
            }
            if (iq3Var != null) {
                boolean zA = iq3Var.a();
                int i3 = this.t;
                if (!zA ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    int i4 = iq3Var.a() ? 1 : 2;
                    this.t = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i4, iq3Var));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = 0;
    }
}
