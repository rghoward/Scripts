package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import defpackage.egb;
import defpackage.fib;
import defpackage.i34;
import defpackage.j4;
import defpackage.pp2;
import defpackage.ru3;
import defpackage.u43;
import defpackage.z90;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set<Integer> P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public c K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int d(int i) {
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends RecyclerView.p {
        public int e;
        public int f;

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        public boolean c = false;

        public final int a(int i, int i2) {
            if (!this.c) {
                return b(i, i2);
            }
            SparseIntArray sparseIntArray = this.b;
            int i3 = sparseIntArray.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iB = b(i, i2);
            sparseIntArray.put(i, iB);
            return iB;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0049  */
        public final int b(int i, int i2) {
            int i3;
            int i4;
            int iD;
            if (this.c) {
                SparseIntArray sparseIntArray = this.b;
                int size = sparseIntArray.size() - 1;
                int i5 = 0;
                while (i5 <= size) {
                    int i6 = (i5 + size) >>> 1;
                    if (sparseIntArray.keyAt(i6) < i) {
                        i5 = i6 + 1;
                    } else {
                        size = i6 - 1;
                    }
                }
                int i7 = i5 - 1;
                int iKeyAt = (i7 < 0 || i7 >= sparseIntArray.size()) ? -1 : sparseIntArray.keyAt(i7);
                if (iKeyAt != -1) {
                    i3 = sparseIntArray.get(iKeyAt);
                    i4 = iKeyAt + 1;
                    iD = d(iKeyAt) + c(iKeyAt, i2);
                    if (iD == i2) {
                        i3++;
                        iD = 0;
                    }
                } else {
                    i3 = 0;
                    i4 = 0;
                    iD = 0;
                }
            } else {
                i3 = 0;
                i4 = 0;
                iD = 0;
            }
            int iD2 = d(i);
            while (i4 < i) {
                int iD3 = d(i4);
                iD += iD3;
                if (iD == i2) {
                    i3++;
                    iD = 0;
                } else if (iD > i2) {
                    i3++;
                    iD = iD3;
                }
                i4++;
            }
            return iD + iD2 > i2 ? i3 + 1 : i3;
        }

        public int c(int i, int i2) {
            int iD = d(i);
            if (iD == i2) {
                return 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int iD2 = d(i4);
                i3 += iD2;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = iD2;
                }
            }
            if (iD + i3 <= i2) {
                return i3;
            }
            return 0;
        }

        public abstract int d(int i);

        public final void e() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        C1(RecyclerView.o.N(context, attributeSet, i, i2).b);
    }

    public final int A1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!a0Var.g) {
            return this.K.d(i);
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = vVar.b(i);
        if (iB != -1) {
            return this.K.d(iB);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void B0(Rect rect, int i, int i2) {
        int iH;
        int iH2;
        if (this.G == null) {
            super.B0(rect, i, i2);
        }
        int iK = K() + J();
        int I = I() + L();
        if (this.p == 1) {
            int iHeight = rect.height() + I;
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, fib> weakHashMap = egb.a;
            iH2 = RecyclerView.o.h(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iH = RecyclerView.o.h(i, iArr[iArr.length - 1] + iK, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iK;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap<View, fib> weakHashMap2 = egb.a;
            iH = RecyclerView.o.h(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iH2 = RecyclerView.o.h(i2, iArr2[iArr2.length - 1] + I, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iH, iH2);
    }

    public final void B1(View view, int i, boolean z) {
        int iX;
        int iX2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iX1 = x1(bVar.e, bVar.f);
        if (this.p == 1) {
            iX2 = RecyclerView.o.x(false, iX1, i, i3, ((ViewGroup.MarginLayoutParams) bVar).width);
            iX = RecyclerView.o.x(true, this.r.l(), this.m, i2, ((ViewGroup.MarginLayoutParams) bVar).height);
        } else {
            int iX3 = RecyclerView.o.x(false, iX1, i, i2, ((ViewGroup.MarginLayoutParams) bVar).height);
            int iX4 = RecyclerView.o.x(true, this.r.l(), this.l, i3, ((ViewGroup.MarginLayoutParams) bVar).width);
            iX = iX3;
            iX2 = iX4;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z ? G0(view, iX2, iX, pVar) : E0(view, iX2, iX, pVar)) {
            view.measure(iX2, iX);
        }
    }

    public final void C1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            z90.a(pp2.a(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.F = i;
        this.K.e();
        v0();
    }

    public final void D1() {
        int I;
        int iL;
        if (this.p == 1) {
            I = this.n - K();
            iL = J();
        } else {
            I = this.o - I();
            iL = L();
        }
        r1(I - iL);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean J0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void L0(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, o.b bVar) {
        int i;
        int iD = this.F;
        for (int i2 = 0; i2 < this.F && (i = cVar.d) >= 0 && i < a0Var.b() && iD > 0; i2++) {
            int i3 = cVar.d;
            bVar.a(i3, Math.max(0, cVar.g));
            iD -= this.K.d(i3);
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int O(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.p == 0) {
            return Math.min(this.F, H());
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return y1(a0Var.b() - 1, vVar, a0Var) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Z(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.v r25, androidx.recyclerview.widget.RecyclerView.a0 r26) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Z(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Z0(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z, boolean z2) {
        int i;
        int iW;
        int iW2 = w();
        int i2 = 1;
        if (z2) {
            iW = w() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iW2;
            iW = 0;
        }
        int iB = a0Var.b();
        Q0();
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        View view2 = null;
        while (iW != i) {
            View viewV = v(iW);
            int iM = RecyclerView.o.M(viewV);
            if (iM >= 0 && iM < iB && z1(iM, vVar, a0Var) == 0) {
                if (((RecyclerView.p) viewV.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = viewV;
                    }
                } else {
                    if (this.r.e(viewV) < iG && this.r.b(viewV) >= iK) {
                        return viewV;
                    }
                    if (view == null) {
                        view = viewV;
                    }
                }
            }
            iW += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void b0(RecyclerView.v vVar, RecyclerView.a0 a0Var, j4 j4Var) {
        super.b0(vVar, a0Var, j4Var);
        j4Var.j("android.widget.GridView");
        RecyclerView.f fVar = this.b.F;
        if (fVar == null || fVar.f() <= 1) {
            return;
        }
        j4Var.b(j4.a.r);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, j4 j4Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            c0(view, j4Var);
            return;
        }
        b bVar = (b) layoutParams;
        int iY1 = y1(bVar.a.d(), vVar, a0Var);
        int i = this.p;
        int i2 = bVar.e;
        int i3 = bVar.f;
        if (i == 0) {
            j4Var.l(j4.h.a(false, i2, i3, iY1, 1));
        } else {
            j4Var.l(j4.h.a(false, iY1, 1, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void e0(int i, int i2) {
        this.K.e();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void f0() {
        this.K.e();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void f1(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int iD;
        int iJ;
        int iX;
        int iX2;
        boolean z;
        int i4;
        View viewB;
        int iJ2 = this.r.j();
        boolean z2 = iJ2 != 1073741824;
        int i5 = w() > 0 ? this.G[this.F] : 0;
        if (z2) {
            D1();
        }
        boolean z3 = cVar.e == 1;
        int iZ1 = this.F;
        if (!z3) {
            iZ1 = z1(cVar.d, vVar, a0Var) + A1(cVar.d, vVar, a0Var);
        }
        int i6 = 0;
        while (i6 < this.F && (i4 = cVar.d) >= 0 && i4 < a0Var.b() && iZ1 > 0) {
            int i7 = cVar.d;
            int iA1 = A1(i7, vVar, a0Var);
            if (iA1 > this.F) {
                z90.a(i34.b(this.F, " spans.", u43.b("Item at position ", " requires ", " spans but GridLayoutManager has only ", i7, iA1)));
                return;
            }
            iZ1 -= iA1;
            if (iZ1 < 0 || (viewB = cVar.b(vVar)) == null) {
                break;
            }
            this.H[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            bVar.b = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.H[i];
            b bVar2 = (b) view.getLayoutParams();
            int iA2 = A1(RecyclerView.o.M(view), vVar, a0Var);
            bVar2.f = iA2;
            bVar2.e = i8;
            i8 += iA2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.H[i10];
            if (cVar.k != null) {
                z = false;
                if (z3) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z3) {
                z = false;
                b(view2, -1, false);
            } else {
                z = false;
                b(view2, 0, false);
            }
            d(this.L, view2);
            B1(view2, iJ2, z);
            int iC = this.r.c(view2);
            if (iC > i9) {
                i9 = iC;
            }
            float fD = (this.r.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z2) {
            r1(Math.max(Math.round(f * this.F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.H[i11];
                B1(view3, 1073741824, true);
                int iC2 = this.r.c(view3);
                if (iC2 > i9) {
                    i9 = iC2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.H[i12];
            if (this.r.c(view4) != i9) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.b;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int iX1 = x1(bVar3.e, bVar3.f);
                if (this.p == 1) {
                    iX2 = RecyclerView.o.x(false, iX1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) bVar3).width);
                    iX = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iX = RecyclerView.o.x(false, iX1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) bVar3).height);
                    iX2 = iMakeMeasureSpec;
                }
                if (G0(view4, iX2, iX, (RecyclerView.p) view4.getLayoutParams())) {
                    view4.measure(iX2, iX);
                }
            }
        }
        int iL = 0;
        bVar.a = i9;
        int i15 = this.p;
        int i16 = cVar.f;
        int iD2 = cVar.b;
        if (i15 != 1) {
            if (i16 == -1) {
                iJ = iD2 - i9;
                iD = iD2;
            } else {
                iD = iD2 + i9;
                iJ = iD2;
            }
            iD2 = iL;
        } else if (i16 == -1) {
            iL = iD2 - i9;
            iJ = 0;
            iD = 0;
        } else {
            iD = 0;
            iL = iD2;
            iD2 += i9;
            iJ = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.H;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.p != 1) {
                iL = L() + this.G[bVar4.e];
                iD2 = this.r.d(view5) + iL;
            } else if (e1()) {
                int iJ3 = J() + this.G[this.F - bVar4.e];
                iD = iJ3;
                iJ = iJ3 - this.r.d(view5);
            } else {
                iJ = J() + this.G[bVar4.e];
                iD = this.r.d(view5) + iJ;
            }
            RecyclerView.o.T(view5, iJ, iL, iD, iD2);
            if (bVar4.a.j() || bVar4.a.m()) {
                bVar.c = true;
            }
            bVar.d = view5.hasFocusable() | bVar.d;
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean g(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void g0(int i, int i2) {
        this.K.e();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void g1(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        D1();
        if (a0Var.b() > 0 && !a0Var.g) {
            boolean z = i == 1;
            int iZ1 = z1(aVar.b, vVar, a0Var);
            if (z) {
                while (iZ1 > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    iZ1 = z1(i3, vVar, a0Var);
                }
            } else {
                int iB = a0Var.b() - 1;
                int i4 = aVar.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iZ2 = z1(i5, vVar, a0Var);
                    if (iZ2 <= iZ1) {
                        break;
                    }
                    i4 = i5;
                    iZ1 = iZ2;
                }
                aVar.b = i4;
            }
        }
        s1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void h0(int i, int i2) {
        this.K.e();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void i0(int i, int i2) {
        this.K.e();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void j0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        boolean z = a0Var.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iW = w();
            for (int i = 0; i < iW; i++) {
                b bVar = (b) v(i).getLayoutParams();
                int iD = bVar.a.d();
                sparseIntArray2.put(iD, bVar.f);
                sparseIntArray.put(iD, bVar.e);
            }
        }
        super.j0(vVar, a0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void k0(RecyclerView.a0 a0Var) {
        View viewR;
        super.k0(a0Var);
        this.E = false;
        int i = this.M;
        if (i == -1 || (viewR = r(i)) == null) {
            return;
        }
        viewR.sendAccessibilityEvent(67108864);
        this.M = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int l(RecyclerView.a0 a0Var) {
        return N0(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int m(RecyclerView.a0 a0Var) {
        return O0(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void n1(boolean z) {
        if (z) {
            ru3.f("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.n1(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int o(RecyclerView.a0 a0Var) {
        return N0(a0Var);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9 A[EDGE_INSN: B:122:0x01a9->B:166:0x027c BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da A[LOOP:3: B:129:0x01c7->B:134:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:206:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[LOOP:4: B:137:0x01ed->B:211:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[LOOP:7: B:161:0x025c->B:221:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean o0(int i, Bundle bundle) {
        View viewV;
        RecyclerView.e0 e0VarN;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == j4.a.r.a() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= w()) {
                    viewV = null;
                    break;
                }
                View viewV2 = v(i5);
                Objects.requireNonNull(viewV2);
                if (viewV2.isAccessibilityFocused()) {
                    viewV = v(i5);
                    break;
                }
                i5++;
            }
            if (viewV != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (P.contains(Integer.valueOf(i6)) && (e0VarN = this.b.N(viewV)) != null) {
                    int iB = e0VarN.b();
                    int iU1 = u1(iB);
                    int iT1 = t1(iB);
                    if (iU1 >= 0 && iT1 >= 0) {
                        if (!v1(iB).contains(Integer.valueOf(this.N)) || !w1(t1(iB), iB).contains(Integer.valueOf(this.O))) {
                            this.N = iU1;
                            this.O = iT1;
                        }
                        int i7 = this.N;
                        if (i7 == -1) {
                            i7 = iU1;
                        }
                        int i8 = this.O;
                        if (i8 != -1) {
                            iT1 = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = iB - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iU2 = u1(iIntValue);
                                    int iT2 = t1(iIntValue);
                                    if (iU2 >= 0 && iT2 >= 0) {
                                        if (this.p != 1) {
                                            if (v1(iIntValue).contains(Integer.valueOf(i7)) && iT2 < iT1) {
                                                this.O = iT2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iU2 == i7 && iT2 < iT1) || iU2 < i7) {
                                                this.N = iU2;
                                                this.O = iT2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iU1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < H()) {
                                                    it2 = v1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iU1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iU1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < H()) {
                                                it4 = v1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iU1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = t1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                x0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = iB - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iU3 = u1(iIntValue);
                                    int iT3 = t1(iIntValue);
                                    if (iU3 >= 0 && iT3 >= 0) {
                                        if (this.p != 1) {
                                            if (iU3 < i7 && iT3 == iT1) {
                                                this.N = ((Integer) Collections.max(v1(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iU3 < i7 && w1(t1(iIntValue), iIntValue).contains(Integer.valueOf(iT1))) {
                                                this.N = iU3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iU1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < H()) {
                                                    it2 = v1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iU1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iU1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < H()) {
                                                it4 = v1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iU1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = t1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                x0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iB + 1;
                            while (true) {
                                if (iIntValue < H()) {
                                    int iU4 = u1(iIntValue);
                                    int iT4 = t1(iIntValue);
                                    if (iU4 >= 0 && iT4 >= 0) {
                                        if (this.p != 1) {
                                            if (iT4 > iT1 && v1(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.O = iT4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iU4 == i7 && iT4 > iT1) || iU4 > i7) {
                                                this.N = iU4;
                                                this.O = iT4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iU1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < H()) {
                                                    it2 = v1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iU1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.N = iIntValue2;
                                                                this.O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iU1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < H()) {
                                                it4 = v1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iU1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.N = iIntValue3;
                                                            this.O = t1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                x0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iB + 1;
                            while (true) {
                                if (iIntValue < H()) {
                                    int iU5 = u1(iIntValue);
                                    int iT5 = t1(iIntValue);
                                    if (iU5 >= 0 && iT5 >= 0) {
                                        if (this.p != 1) {
                                            if (iU5 > i7 && iT5 == iT1) {
                                                this.N = u1(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iU5 > i7 && (iT5 == iT1 || w1(t1(iIntValue), iIntValue).contains(Integer.valueOf(iT1)))) {
                                                this.N = iU5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.p) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iU1 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < H()) {
                                                it2 = v1(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iU1) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.N = iIntValue2;
                                                            this.O = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iU1 < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < H()) {
                                            it4 = v1(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iU1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.N = iIntValue3;
                                                        this.O = t1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                x0(iIntValue);
                                this.M = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.o0(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iF = this.b.F.f();
                int i11 = 0;
                while (true) {
                    if (i11 >= iF) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.b;
                    int iZ1 = z1(i11, recyclerView.v, recyclerView.B0);
                    RecyclerView recyclerView2 = this.b;
                    int iY1 = y1(i11, recyclerView2.v, recyclerView2.B0);
                    if (this.p != 1) {
                        if (iZ1 == i9 && iY1 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iZ1 == i10 && iY1 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    l1(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int p(RecyclerView.a0 a0Var) {
        return O0(a0Var);
    }

    public final void r1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p s() {
        return this.p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public final void s1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p t(Context context, AttributeSet attributeSet) {
        b bVar = new b(context, attributeSet);
        bVar.e = -1;
        bVar.f = 0;
        return bVar;
    }

    public final int t1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 0 ? y1(i, recyclerView.v, recyclerView.B0) : z1(i, recyclerView.v, recyclerView.B0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar.e = -1;
            bVar.f = 0;
            return bVar;
        }
        b bVar2 = new b(layoutParams);
        bVar2.e = -1;
        bVar2.f = 0;
        return bVar2;
    }

    public final int u1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 1 ? y1(i, recyclerView.v, recyclerView.B0) : z1(i, recyclerView.v, recyclerView.B0);
    }

    public final HashSet v1(int i) {
        return w1(u1(i), i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int w0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        D1();
        s1();
        return super.w0(i, vVar, a0Var);
    }

    public final HashSet w1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int iA1 = A1(i2, recyclerView.v, recyclerView.B0);
        for (int i3 = i; i3 < i + iA1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public final int x1(int i, int i2) {
        if (this.p != 1 || !e1()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int y0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        D1();
        s1();
        return super.y0(i, vVar, a0Var);
    }

    public final int y1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!a0Var.g) {
            return this.K.a(i, this.F);
        }
        int iB = vVar.b(i);
        if (iB != -1) {
            return this.K.a(iB, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int z(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.p == 1) {
            return Math.min(this.F, H());
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return y1(a0Var.b() - 1, vVar, a0Var) + 1;
    }

    public final int z1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!a0Var.g) {
            return this.K.c(i, this.F);
        }
        int i2 = this.J.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = vVar.b(i);
        if (iB != -1) {
            return this.K.c(iB, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        C1(i);
    }

    public GridLayoutManager(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, 1, false);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        C1(i);
    }
}
