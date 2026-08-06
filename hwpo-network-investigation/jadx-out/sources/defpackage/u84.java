package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u84 extends ox6.c implements o94, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View H;
    public ViewTreeObserver I;
    public final a J = new a();
    public final b K = new b();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<m84, g2b> {
        public a() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(m84 m84Var) {
            Rect rect;
            m84 m84Var2 = m84Var;
            u84 u84Var = u84.this;
            View viewA = s84.a(u84Var);
            if (!viewA.isFocused() && !viewA.hasFocus()) {
                g94 focusOwner = ew2.g(u84Var).getFocusOwner();
                View viewA2 = fw2.a(u84Var);
                Integer numC = z84.c(m84Var2.a());
                int[] iArr = new int[2];
                viewA2.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewA.getLocationOnScreen(iArr2);
                sk8 sk8VarO = focusOwner.o();
                if (sk8VarO == null) {
                    rect = null;
                } else {
                    int i = (int) sk8VarO.a;
                    int i2 = iArr[0];
                    int i3 = iArr2[0];
                    int i4 = (int) sk8VarO.b;
                    int i5 = iArr[1];
                    int i6 = iArr2[1];
                    rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) sk8VarO.c) + i2) - i3, (((int) sk8VarO.d) + i5) - i6);
                }
                if (!z84.b(viewA, numC, rect)) {
                    m84Var2.b();
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<m84, g2b> {
        public b() {
            super(1);
        }

        @Override // defpackage.oh4
        public final g2b invoke(m84 m84Var) {
            s84.a(u84.this);
            return g2b.a;
        }
    }

    @Override // ox6.c
    public final void U1() {
        ViewTreeObserver viewTreeObserver = fw2.a(this).getViewTreeObserver();
        this.I = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // ox6.c
    public final void V1() {
        ViewTreeObserver viewTreeObserver = this.I;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.I = null;
        fw2.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.H = null;
    }

    public final ba4 c2() {
        boolean z;
        if (!this.t.G) {
            uc5.b("visitLocalDescendants called on an unattached node");
        }
        ox6.c cVar = this.t;
        if ((cVar.w & 1024) != 0) {
            boolean z2 = false;
            for (ox6.c cVar2 = cVar.y; cVar2 != null; cVar2 = cVar2.y) {
                if ((cVar2.v & 1024) != 0) {
                    ox6.c cVarB = cVar2;
                    k37 k37Var = null;
                    while (cVarB != null) {
                        if (cVarB instanceof ba4) {
                            ba4 ba4Var = (ba4) cVarB;
                            if (z2) {
                                return ba4Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                            int i = 0;
                            for (ox6.c cVar3 = ((gw2) cVarB).I; cVar3 != null; cVar3 = cVar3.y) {
                                if ((cVar3.v & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVarB = cVar3;
                                    } else {
                                        if (k37Var == null) {
                                            k37Var = new k37(new ox6.c[16]);
                                        }
                                        if (cVarB != null) {
                                            k37Var.d(cVarB);
                                            cVarB = null;
                                        }
                                        k37Var.d(cVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cVarB = ew2.b(k37Var);
                    }
                }
            }
        }
        aa0.c("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // defpackage.o94
    public final void k0(k94 k94Var) {
        k94Var.c(false);
        k94Var.b(this.J);
        k94Var.e(this.K);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (ew2.f(this).G == null) {
            return;
        }
        View viewA = s84.a(this);
        g94 focusOwner = ew2.g(this).getFocusOwner();
        mn7 mn7VarG = ew2.g(this);
        boolean z2 = true;
        if (view != null && !view.equals(mn7VarG)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                } else {
                    if (parent == viewA.getParent()) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z = false;
            break;
        }
        if (view2 != null && !view2.equals(mn7VarG)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z2 = false;
                    break;
                } else if (parent2 == viewA.getParent()) {
                    break;
                } else {
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z && z2) {
            this.H = view2;
            return;
        }
        if (z2) {
            this.H = view2;
            ba4 ba4VarC2 = c2();
            if (ba4VarC2.a0().a()) {
                return;
            }
            ia.e(ba4VarC2);
            return;
        }
        if (!z) {
            this.H = null;
            return;
        }
        this.H = null;
        if (c2().a0().e()) {
            focusOwner.p(8, false, false);
        }
    }
}
