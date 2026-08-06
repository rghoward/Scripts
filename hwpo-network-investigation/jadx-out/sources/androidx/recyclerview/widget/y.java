package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class y extends g0 {
    public w d;
    public v e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends s {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.RecyclerView.z
        public final void e(View view, RecyclerView.z.a aVar) {
            y yVar = y.this;
            int[] iArrB = yVar.b(yVar.a.getLayoutManager(), view);
            int i = iArrB[0];
            int i2 = iArrB[1];
            int iCeil = (int) Math.ceil(((double) k(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
            if (iCeil > 0) {
                aVar.a = i;
                aVar.b = i2;
                aVar.c = iCeil;
                aVar.e = this.j;
                aVar.f = true;
            }
        }

        @Override // androidx.recyclerview.widget.s
        public final float j(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.s
        public final int k(int i) {
            return Math.min(100, super.k(i));
        }
    }

    public static int g(View view, x xVar) {
        return ((xVar.c(view) / 2) + xVar.e(view)) - ((xVar.l() / 2) + xVar.k());
    }

    public static View h(RecyclerView.o oVar, x xVar) {
        int iW = oVar.w();
        View view = null;
        if (iW == 0) {
            return null;
        }
        int iL = (xVar.l() / 2) + xVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iW; i2++) {
            View viewV = oVar.v(i2);
            int iAbs = Math.abs(((xVar.c(viewV) / 2) + xVar.e(viewV)) - iL);
            if (iAbs < i) {
                view = viewV;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.g0
    public final int[] b(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.e()) {
            iArr[0] = g(view, i(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.f()) {
            iArr[1] = g(view, j(oVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.g0
    public final RecyclerView.z c(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.z.b) {
            return new a(this.a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.g0
    public View d(RecyclerView.o oVar) {
        if (oVar.f()) {
            return h(oVar, j(oVar));
        }
        if (oVar.e()) {
            return h(oVar, i(oVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.g0
    public final int e(RecyclerView.o oVar, int i, int i2) {
        PointF pointFA;
        int iH = oVar.H();
        if (iH != 0) {
            View view = null;
            x xVarJ = oVar.f() ? j(oVar) : oVar.e() ? i(oVar) : null;
            if (xVarJ != null) {
                int iW = oVar.w();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < iW; i5++) {
                    View viewV = oVar.v(i5);
                    if (viewV != null) {
                        int iG = g(viewV, xVarJ);
                        if (iG <= 0 && iG > i4) {
                            view2 = viewV;
                            i4 = iG;
                        }
                        if (iG >= 0 && iG < i3) {
                            view = viewV;
                            i3 = iG;
                        }
                    }
                }
                boolean z2 = !oVar.e() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return RecyclerView.o.M(view);
                }
                if (!z2 && view2 != null) {
                    return RecyclerView.o.M(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int iM = RecyclerView.o.M(view);
                    int iH2 = oVar.H();
                    if ((oVar instanceof RecyclerView.z.b) && (pointFA = ((RecyclerView.z.b) oVar).a(iH2 - 1)) != null && (pointFA.x < 0.0f || pointFA.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = iM + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < iH) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    public final x i(RecyclerView.o oVar) {
        v vVar = this.e;
        if (vVar == null || vVar.a != oVar) {
            this.e = new v(oVar);
        }
        return this.e;
    }

    public final x j(RecyclerView.o oVar) {
        w wVar = this.d;
        if (wVar == null || wVar.a != oVar) {
            this.d = new w(oVar);
        }
        return this.d;
    }
}
