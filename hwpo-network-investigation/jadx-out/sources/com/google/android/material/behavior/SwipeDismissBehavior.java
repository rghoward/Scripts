package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.a7a;
import defpackage.egb;
import defpackage.j4;
import defpackage.ogb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public ogb t;
    public boolean u;
    public boolean v;
    public int w = 2;
    public final float x = 0.5f;
    public float y = 0.0f;
    public float z = 0.5f;
    public final a A = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Runnable {
        public final View t;
        public final boolean u;

        public b(View view, boolean z) {
            this.t = view;
            this.u = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ogb ogbVar = SwipeDismissBehavior.this.t;
            if (ogbVar == null || !ogbVar.f()) {
                return;
            }
            this.t.postOnAnimation(this);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zP = this.u;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zP = coordinatorLayout.p(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.u = zP;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.u = false;
        }
        if (zP) {
            if (this.t == null) {
                this.t = new ogb(coordinatorLayout.getContext(), coordinatorLayout, this.A);
            }
            if (!this.v && this.t.o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            egb.l(1048576, v);
            egb.i(0, v);
            if (w(v)) {
                egb.m(v, j4.a.l, new a7a(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.t == null) {
            return false;
        }
        if (this.v && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.t.i(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ogb.c {
        public int a;
        public int b = -1;

        public a() {
        }

        @Override // ogb.c
        public final int a(int i, View view) {
            int width;
            int width2;
            boolean z = view.getLayoutDirection() == 1;
            int i2 = SwipeDismissBehavior.this.w;
            if (i2 == 0) {
                width = this.a;
                if (z) {
                    width -= view.getWidth();
                    width2 = this.a;
                } else {
                    width2 = view.getWidth() + width;
                }
            } else {
                int i3 = this.a;
                if (i2 != 1) {
                    width = i3 - view.getWidth();
                    width2 = this.a + view.getWidth();
                } else if (z) {
                    width2 = view.getWidth() + i3;
                    width = i3;
                } else {
                    width = i3 - view.getWidth();
                    width2 = this.a;
                }
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // ogb.c
        public final int b(int i, View view) {
            return view.getTop();
        }

        @Override // ogb.c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // ogb.c
        public final void e(int i, View view) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.v = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.v = false;
            }
        }

        @Override // ogb.c
        public final void g(View view, int i, int i2) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f = width * swipeDismissBehavior.y;
            float width2 = view.getWidth() * swipeDismissBehavior.z;
            float fAbs = Math.abs(i - this.a);
            if (fAbs <= f) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0050  */
        /* JADX WARN: Code duplicated, block: B:29:0x0054  */
        /* JADX WARN: Code duplicated, block: B:32:0x005d  */
        /* JADX WARN: Code duplicated, block: B:33:0x005f  */
        /* JADX WARN: Code duplicated, block: B:35:0x0065  */
        @Override // ogb.c
        public final void h(View view, float f, float f2) {
            int i;
            int left;
            int i2;
            this.b = -1;
            int width = view.getWidth();
            boolean z = false;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (f != 0.0f) {
                boolean z2 = view.getLayoutDirection() == 1;
                int i3 = swipeDismissBehavior.w;
                if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                    i = this.a;
                } else {
                    if (f >= 0.0f) {
                        left = view.getLeft();
                        i2 = this.a;
                        if (left < i2) {
                            i = this.a - width;
                        } else {
                            i = i2 + width;
                        }
                    } else {
                        i = this.a - width;
                    }
                    z = true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.a) >= Math.round(view.getWidth() * swipeDismissBehavior.x)) {
                    if (f >= 0.0f) {
                        left = view.getLeft();
                        i2 = this.a;
                        if (left < i2) {
                            i = this.a - width;
                        } else {
                            i = i2 + width;
                        }
                    } else {
                        i = this.a - width;
                    }
                    z = true;
                } else {
                    i = this.a;
                }
            }
            if (swipeDismissBehavior.t.n(i, view.getTop())) {
                view.postOnAnimation(new b(view, z));
            }
        }

        @Override // ogb.c
        public final boolean i(int i, View view) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.w(view);
        }

        @Override // ogb.c
        public final void f(int i) {
        }
    }
}
