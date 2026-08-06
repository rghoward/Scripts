package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.w;
import androidx.recyclerview.widget.x;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cs2 extends g0 {
    public static final a Companion = new a();
    public w d;
    public v e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public static int g(RecyclerView.o oVar, View view, x xVar) {
        int iF;
        int iC = (xVar.c(view) / 2) + xVar.e(view);
        boolean zY = oVar.y();
        if (zY) {
            iF = (xVar.l() / 2) + xVar.k();
        } else {
            if (zY) {
                u.b();
                return 0;
            }
            iF = xVar.f() / 2;
        }
        return iC - iF;
    }

    public static View i(RecyclerView.o oVar, x xVar) {
        if (oVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar;
            View viewY0 = linearLayoutManager.Y0(0, linearLayoutManager.w(), true, false);
            if ((viewY0 == null ? -1 : RecyclerView.o.M(viewY0)) == 0) {
                return oVar.v(0);
            }
            if (linearLayoutManager.V0() == linearLayoutManager.H() - 1) {
                return oVar.v(linearLayoutManager.H() - 1);
            }
        }
        int iW = oVar.w();
        View view = null;
        if (iW == 0) {
            return null;
        }
        int iL = oVar.y() ? (xVar.l() / 2) + xVar.k() : xVar.f() / 2;
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
        int iG;
        oVar.getClass();
        view.getClass();
        boolean zE = oVar.e();
        int iG2 = 0;
        if (zE) {
            iG = g(oVar, view, j(oVar));
        } else {
            if (zE) {
                u.b();
                return null;
            }
            iG = 0;
        }
        boolean zF = oVar.f();
        if (zF) {
            iG2 = g(oVar, view, k(oVar));
        } else if (zF) {
            u.b();
            return null;
        }
        return new int[]{iG, iG2};
    }

    @Override // androidx.recyclerview.widget.g0
    public final View d(RecyclerView.o oVar) {
        if (oVar.f()) {
            return i(oVar, k(oVar));
        }
        if (oVar.e()) {
            return i(oVar, j(oVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.g0
    public final int e(RecyclerView.o oVar, int i, int i2) {
        int iH;
        int iH2;
        if (oVar instanceof RecyclerView.z.b) {
            int iH3 = oVar.H();
            Integer numValueOf = Integer.valueOf(iH3);
            if (iH3 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                View viewD = d(oVar);
                if (viewD != null) {
                    int iM = RecyclerView.o.M(viewD);
                    Integer numValueOf2 = Integer.valueOf(iM);
                    if (iM == -1) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        int iIntValue2 = numValueOf2.intValue();
                        int i3 = iIntValue - 1;
                        PointF pointFA = ((RecyclerView.z.b) oVar).a(i3);
                        if (pointFA != null) {
                            boolean zE = oVar.e();
                            if (zE) {
                                iH = h(oVar, j(oVar), i, 0, pointFA.x);
                            } else {
                                if (zE) {
                                    u.b();
                                    return 0;
                                }
                                iH = 0;
                            }
                            boolean zF = oVar.f();
                            if (zF) {
                                iH2 = h(oVar, k(oVar), 0, i2, pointFA.y);
                            } else {
                                if (zF) {
                                    u.b();
                                    return 0;
                                }
                                iH2 = 0;
                            }
                            boolean zF2 = oVar.f();
                            if (zF2) {
                                iH = iH2;
                            } else if (zF2) {
                                u.b();
                                return 0;
                            }
                            Integer numValueOf3 = iH != 0 ? Integer.valueOf(iH) : null;
                            if (numValueOf3 != null) {
                                int iIntValue3 = numValueOf3.intValue() + iIntValue2;
                                if (iIntValue3 < 0) {
                                    return 0;
                                }
                                return iIntValue3 >= iIntValue ? i3 : iIntValue3;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public final int h(RecyclerView.o oVar, x xVar, int i, int i2, float f) {
        int i3;
        int i4;
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int iW = oVar.w();
        Integer numValueOf = Integer.valueOf(iW);
        if (iW == 0) {
            numValueOf = null;
        }
        float f2 = 1.0f;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            View view = null;
            View view2 = null;
            for (int i7 = 0; i7 < iIntValue; i7++) {
                View viewV = oVar.v(i7);
                if (viewV != null) {
                    int iM = RecyclerView.o.M(viewV);
                    Integer numValueOf2 = Integer.valueOf(iM);
                    if (iM == -1) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        int iIntValue2 = numValueOf2.intValue();
                        if (iIntValue2 < i5) {
                            i5 = iIntValue2;
                            view = viewV;
                        } else if (iIntValue2 > i6) {
                            i6 = iIntValue2;
                            view2 = viewV;
                        }
                    }
                }
            }
            i3 = 0;
            if (view != null && view2 != null) {
                int iE = xVar.e(view);
                int iE2 = xVar.e(view2);
                if (iE > iE2) {
                    iE = iE2;
                }
                int iB = xVar.b(view);
                int iB2 = xVar.b(view2);
                if (iB < iB2) {
                    iB = iB2;
                }
                int i8 = iB - iE;
                boolean z = i8 == 0;
                if (!z) {
                    if (z) {
                        u.b();
                        return 0;
                    }
                    f2 = (i8 * 1.0f) / ((i6 - i5) + 1);
                }
            }
        } else {
            i3 = 0;
        }
        Float fValueOf = f2 > 0.0f ? Float.valueOf(f2) : null;
        if (fValueOf != null) {
            float fFloatValue = fValueOf.floatValue();
            int i9 = Math.abs(iArr[i3]) > Math.abs(iArr[1]) ? 1 : i3;
            if (i9 == 1) {
                i4 = iArr[i3];
            } else if (i9 == 0) {
                i4 = iArr[1];
            } else {
                u.b();
            }
            int iRound = Math.round(i4 / fFloatValue);
            return f < 0.0f ? -iRound : iRound;
        }
        return i3;
    }

    public final x j(RecyclerView.o oVar) {
        v vVar = this.e;
        if (vVar == null || vVar.a != oVar) {
            this.e = new v(oVar);
        }
        v vVar2 = this.e;
        vVar2.getClass();
        return vVar2;
    }

    public final x k(RecyclerView.o oVar) {
        w wVar = this.d;
        if (wVar == null || wVar.a != oVar) {
            this.d = new w(oVar);
        }
        w wVar2 = this.d;
        wVar2.getClass();
        return wVar2;
    }
}
