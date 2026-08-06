package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pr3 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        public boolean t;
        public final /* synthetic */ View u;
        public final /* synthetic */ mh4<g2b> v;

        public a(View view, mh4<g2b> mh4Var) {
            this.u = view;
            this.v = mh4Var;
            view.addOnAttachStateChangeListener(this);
            if (this.t || !view.isAttachedToWindow()) {
                return;
            }
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.t = true;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.v.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            if (this.t) {
                return;
            }
            View view2 = this.u;
            if (view2.isAttachedToWindow()) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.t = true;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (this.t) {
                this.u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.t = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements b33 {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.b33
        public final void dispose() {
            a aVar = this.a;
            View view = aVar.u;
            if (aVar.t) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
                aVar.t = false;
            }
            view.removeOnAttachStateChangeListener(aVar);
        }
    }

    public static final void a(final mh4<g2b> mh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-1646555525);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(mh4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            b((View) bj4VarO.F(AndroidCompositionLocals_androidKt.f), (tx2) bj4VarO.F(qu1.h), mh4Var, bj4VarO, (i2 << 6) & 896);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mr3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    pr3.a(mh4Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final View view, final tx2 tx2Var, final mh4<g2b> mh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-1319522472);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(tx2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            boolean zJ = bj4VarO.j(view) | ((i2 & 896) == 256);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: nr3
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return new pr3.b(new pr3.a(view, mh4Var));
                    }
                };
                bj4VarO.C(objF);
            }
            wd3.b(view, tx2Var, (oh4) objF, bj4VarO);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: or3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i | 1);
                    pr3.b(view, tx2Var, mh4Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
