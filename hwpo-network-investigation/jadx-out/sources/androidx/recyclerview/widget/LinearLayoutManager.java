package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.j4;
import defpackage.pi1;
import defpackage.pp2;
import defpackage.z90;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    public final a A;
    public final b B;
    public final int C;
    public final int[] D;
    public int p;
    public c q;
    public x r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public d z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public x a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            c();
        }

        public final void a() {
            boolean z = this.d;
            x xVar = this.a;
            this.c = z ? xVar.g() : xVar.k();
        }

        public final void b(int i, View view) {
            x xVar = this.a;
            int iL = Integer.MIN_VALUE == xVar.b ? 0 : xVar.l() - xVar.b;
            if (iL >= 0) {
                boolean z = this.d;
                x xVar2 = this.a;
                if (z) {
                    int iB = xVar2.b(view);
                    x xVar3 = this.a;
                    this.c = (Integer.MIN_VALUE != xVar3.b ? xVar3.l() - xVar3.b : 0) + iB;
                } else {
                    this.c = xVar2.e(view);
                }
                this.b = i;
                return;
            }
            this.b = i;
            boolean z2 = this.d;
            x xVar4 = this.a;
            if (!z2) {
                int iE = xVar4.e(view);
                int iK = iE - this.a.k();
                this.c = iE;
                if (iK > 0) {
                    int iG = (this.a.g() - Math.min(0, (this.a.g() - iL) - this.a.b(view))) - (this.a.c(view) + iE);
                    if (iG < 0) {
                        this.c -= Math.min(iK, -iG);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG2 = (xVar4.g() - iL) - this.a.b(view);
            this.c = this.a.g() - iG2;
            if (iG2 > 0) {
                int iC = this.c - this.a.c(view);
                int iK2 = this.a.k();
                int iMin = iC - (Math.min(this.a.e(view) - iK2, 0) + iK2);
                if (iMin < 0) {
                    this.c = Math.min(iG2, -iMin) + this.c;
                }
            }
        }

        public final void c() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            return pi1.a(sb, this.e, '}');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public List<RecyclerView.e0> k;
        public boolean l;

        public final void a(View view) {
            int iD;
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.k.get(i2).a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.a.j() && (iD = (pVar.a.d() - this.d) * this.e) >= 0 && iD < i) {
                    view2 = view3;
                    if (iD == 0) {
                        break;
                    } else {
                        i = iD;
                    }
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.p) view2.getLayoutParams()).a.d();
            }
        }

        public final View b(RecyclerView.v vVar) {
            List<RecyclerView.e0> list = this.k;
            if (list == null) {
                View viewD = vVar.d(this.d);
                this.d += this.e;
                return viewD;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = this.k.get(i).a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.a.j() && this.d == pVar.a.d()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int t;
        public int u;
        public boolean v;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d();
                dVar.t = parcel.readInt();
                dVar.u = parcel.readInt();
                dVar.v = parcel.readInt() == 1;
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.t);
            parcel.writeInt(this.u);
            parcel.writeInt(this.v ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.o.c cVarN = RecyclerView.o.N(context, attributeSet, i, i2);
        m1(cVarN.a);
        boolean z = cVarN.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            v0();
        }
        n1(cVarN.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean F0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int iW = w();
            for (int i = 0; i < iW; i++) {
                ViewGroup.LayoutParams layoutParams = v(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void H0(RecyclerView recyclerView, int i) {
        s sVar = new s(recyclerView.getContext());
        sVar.a = i;
        I0(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean J0() {
        return this.z == null && this.s == this.v;
    }

    public void K0(RecyclerView.a0 a0Var, int[] iArr) {
        int i;
        int iL = a0Var.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    public void L0(RecyclerView.a0 a0Var, c cVar, o.b bVar) {
        int i = cVar.d;
        if (i < 0 || i >= a0Var.b()) {
            return;
        }
        bVar.a(i, Math.max(0, cVar.g));
    }

    public final int M0(RecyclerView.a0 a0Var) {
        if (w() == 0) {
            return 0;
        }
        Q0();
        x xVar = this.r;
        boolean z = !this.w;
        return e0.a(a0Var, xVar, T0(z), S0(z), this, this.w);
    }

    public final int N0(RecyclerView.a0 a0Var) {
        if (w() == 0) {
            return 0;
        }
        Q0();
        x xVar = this.r;
        boolean z = !this.w;
        return e0.b(a0Var, xVar, T0(z), S0(z), this, this.w, this.u);
    }

    public final int O0(RecyclerView.a0 a0Var) {
        if (w() == 0) {
            return 0;
        }
        Q0();
        x xVar = this.r;
        boolean z = !this.w;
        return e0.c(a0Var, xVar, T0(z), S0(z), this, this.w);
    }

    public final int P0(int i) {
        if (i == 1) {
            return (this.p != 1 && e1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && e1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.p == 0 ? 1 : Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean Q() {
        return true;
    }

    public final void Q0() {
        if (this.q == null) {
            c cVar = new c();
            cVar.a = true;
            cVar.h = 0;
            cVar.i = 0;
            cVar.k = null;
            this.q = cVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean R() {
        return this.t;
    }

    public final int R0(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z) {
        int i;
        int i2 = cVar.c;
        int i3 = cVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.g = i3 + i2;
            }
            h1(vVar, cVar);
        }
        int i4 = cVar.c + cVar.h;
        while (true) {
            if ((!cVar.l && i4 <= 0) || (i = cVar.d) < 0 || i >= a0Var.b()) {
                break;
            }
            b bVar = this.B;
            bVar.a = 0;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            f1(vVar, a0Var, cVar, bVar);
            if (!bVar.b) {
                int i5 = cVar.b;
                int i6 = bVar.a;
                cVar.b = (cVar.f * i6) + i5;
                if (!bVar.c || cVar.k != null || !a0Var.g) {
                    cVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = cVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.g = i8;
                    int i9 = cVar.c;
                    if (i9 < 0) {
                        cVar.g = i8 + i9;
                    }
                    h1(vVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.c;
    }

    public final View S0(boolean z) {
        return this.u ? Y0(0, w(), z, true) : Y0(w() - 1, -1, z, true);
    }

    public final View T0(boolean z) {
        return this.u ? Y0(w() - 1, -1, z, true) : Y0(0, w(), z, true);
    }

    public final int U0() {
        View viewY0 = Y0(0, w(), false, true);
        if (viewY0 == null) {
            return -1;
        }
        return RecyclerView.o.M(viewY0);
    }

    public final int V0() {
        View viewY0 = Y0(w() - 1, -1, true, false);
        if (viewY0 == null) {
            return -1;
        }
        return RecyclerView.o.M(viewY0);
    }

    public final int W0() {
        View viewY0 = Y0(w() - 1, -1, false, true);
        if (viewY0 == null) {
            return -1;
        }
        return RecyclerView.o.M(viewY0);
    }

    public final View X0(int i, int i2) {
        int i3;
        int i4;
        Q0();
        if (i2 <= i && i2 >= i) {
            return v(i);
        }
        if (this.r.e(v(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.a(i, i2, i3, i4) : this.d.a(i, i2, i3, i4);
    }

    public final View Y0(int i, int i2, boolean z, boolean z2) {
        Q0();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.p == 0 ? this.c.a(i, i2, i3, i4) : this.d.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View Z(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int iP0;
        View viewX0;
        j1();
        if (w() != 0 && (iP0 = P0(i)) != Integer.MIN_VALUE) {
            Q0();
            o1(iP0, (int) (this.r.l() * 0.33333334f), false, a0Var);
            c cVar = this.q;
            cVar.g = Integer.MIN_VALUE;
            cVar.a = false;
            R0(vVar, cVar, a0Var, true);
            boolean z = this.u;
            if (iP0 == -1) {
                viewX0 = z ? X0(w() - 1, -1) : X0(0, w());
            } else {
                viewX0 = z ? X0(0, w()) : X0(w() - 1, -1);
            }
            View viewD1 = iP0 == -1 ? d1() : c1();
            if (!viewD1.hasFocusable()) {
                return viewX0;
            }
            if (viewX0 != null) {
                return viewD1;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View Z0(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z, boolean z2) {
        int i;
        int iW;
        int i2;
        Q0();
        int iW2 = w();
        if (z2) {
            iW = w() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iW2;
            iW = 0;
            i2 = 1;
        }
        int iB = a0Var.b();
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iW != i) {
            View viewV = v(iW);
            int iM = RecyclerView.o.M(viewV);
            int iE = this.r.e(viewV);
            int iB2 = this.r.b(viewV);
            if (iM >= 0 && iM < iB) {
                if (!((RecyclerView.p) viewV.getLayoutParams()).a.j()) {
                    boolean z3 = iB2 <= iK && iE < iK;
                    boolean z4 = iE >= iG && iB2 > iG;
                    if (!z3 && !z4) {
                        return viewV;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewV;
                        } else if (view == null) {
                            view = viewV;
                        }
                    } else if (z3) {
                        view2 = viewV;
                    } else if (view == null) {
                        view = viewV;
                    }
                } else if (view3 == null) {
                    view3 = viewV;
                }
            }
            iW += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF a(int i) {
        if (w() == 0) {
            return null;
        }
        int i2 = (i < RecyclerView.o.M(v(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void a0(AccessibilityEvent accessibilityEvent) {
        super.a0(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(U0());
            accessibilityEvent.setToIndex(W0());
        }
    }

    public final int a1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int iG;
        int iG2 = this.r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i2 = -k1(-iG2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (iG = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(iG);
        return iG + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b0(RecyclerView.v vVar, RecyclerView.a0 a0Var, j4 j4Var) {
        super.b0(vVar, a0Var, j4Var);
        RecyclerView.f fVar = this.b.F;
        if (fVar == null || fVar.f() <= 0) {
            return;
        }
        j4Var.b(j4.a.m);
    }

    public final int b1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int iK;
        int iK2 = i - this.r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i2 = -k1(iK2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (iK = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.o(-iK);
        return i2 - iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public final View c1() {
        return v(this.u ? 0 : w() - 1);
    }

    public final View d1() {
        return v(this.u ? w() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean e() {
        return this.p == 0;
    }

    public final boolean e1() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean f() {
        return this.p == 1;
    }

    public void f1(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i;
        int iD;
        int i2;
        int iD2;
        View viewB = cVar.b(vVar);
        if (viewB == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) viewB.getLayoutParams();
        List<RecyclerView.e0> list = cVar.k;
        boolean z = this.u;
        int i3 = cVar.f;
        if (list == null) {
            if (z == (i3 == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        RecyclerView.p pVar2 = (RecyclerView.p) viewB.getLayoutParams();
        Rect rectP = this.b.P(viewB);
        int i4 = rectP.left + rectP.right;
        int i5 = rectP.top + rectP.bottom;
        int iX = RecyclerView.o.x(e(), this.n, this.l, K() + J() + ((ViewGroup.MarginLayoutParams) pVar2).leftMargin + ((ViewGroup.MarginLayoutParams) pVar2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) pVar2).width);
        int iX2 = RecyclerView.o.x(f(), this.o, this.m, I() + L() + ((ViewGroup.MarginLayoutParams) pVar2).topMargin + ((ViewGroup.MarginLayoutParams) pVar2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) pVar2).height);
        if (E0(viewB, iX, iX2, pVar2)) {
            viewB.measure(iX, iX2);
        }
        bVar.a = this.r.c(viewB);
        if (this.p == 1) {
            if (e1()) {
                iD2 = this.n - K();
                iD = iD2 - this.r.d(viewB);
            } else {
                int iJ = J();
                iD2 = this.r.d(viewB) + iJ;
                iD = iJ;
            }
            int i6 = cVar.f;
            i2 = cVar.b;
            int i7 = bVar.a;
            if (i6 == -1) {
                int i8 = i2 - i7;
                i = i2;
                i2 = i8;
            } else {
                i = i7 + i2;
            }
        } else {
            int iL = L();
            int iD3 = this.r.d(viewB) + iL;
            int i9 = cVar.f;
            int i10 = cVar.b;
            int i11 = bVar.a;
            if (i9 == -1) {
                int i12 = i10 - i11;
                iD2 = i10;
                i2 = iL;
                i = iD3;
                iD = i12;
            } else {
                int i13 = i10 + i11;
                i = iD3;
                iD = i10;
                i2 = iL;
                iD2 = i13;
            }
        }
        RecyclerView.o.T(viewB, iD, i2, iD2, i);
        if (pVar.a.j() || pVar.a.m()) {
            bVar.c = true;
        }
        bVar.d = viewB.hasFocusable();
    }

    public final void h1(RecyclerView.v vVar, c cVar) {
        if (!cVar.a || cVar.l) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            int iW = w();
            if (i < 0) {
                return;
            }
            int iF = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iW; i3++) {
                    View viewV = v(i3);
                    if (this.r.e(viewV) < iF || this.r.n(viewV) < iF) {
                        i1(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iW - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewV2 = v(i5);
                if (this.r.e(viewV2) < iF || this.r.n(viewV2) < iF) {
                    i1(vVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iW2 = w();
        if (!this.u) {
            for (int i7 = 0; i7 < iW2; i7++) {
                View viewV3 = v(i7);
                if (this.r.b(viewV3) > i6 || this.r.m(viewV3) > i6) {
                    i1(vVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iW2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewV4 = v(i9);
            if (this.r.b(viewV4) > i6 || this.r.m(viewV4) > i6) {
                i1(vVar, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void i(int i, int i2, RecyclerView.a0 a0Var, o.b bVar) {
        if (this.p != 0) {
            i = i2;
        }
        if (w() == 0 || i == 0) {
            return;
        }
        Q0();
        o1(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
        L0(a0Var, this.q, bVar);
    }

    public final void i1(RecyclerView.v vVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewV = v(i);
                t0(i);
                vVar.i(viewV);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewV2 = v(i3);
            t0(i3);
            vVar.i(viewV2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j(int i, o.b bVar) {
        boolean z;
        int i2;
        d dVar = this.z;
        if (dVar == null || (i2 = dVar.t) < 0) {
            j1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = dVar.v;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            bVar.a(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019f  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:123:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:126:0x020a  */
    /* JADX WARN: Code duplicated, block: B:130:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x022e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0235  */
    /* JADX WARN: Code duplicated, block: B:138:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x023a  */
    /* JADX WARN: Code duplicated, block: B:141:0x023e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0242  */
    /* JADX WARN: Code duplicated, block: B:145:0x0249  */
    /* JADX WARN: Code duplicated, block: B:146:0x024f  */
    /* JADX WARN: Code duplicated, block: B:95:0x018a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewZ0;
        boolean z3;
        x xVar;
        int iE;
        int iB2;
        int iK;
        int iG;
        boolean z4;
        boolean z5;
        x xVar2;
        int iL;
        RecyclerView.p pVar;
        int i;
        int iE2;
        int i2;
        int i3;
        ?? r4;
        List<RecyclerView.e0> list;
        int i4;
        int i5;
        int iA1;
        int i6;
        View viewR;
        int iE3;
        int iG2;
        int i7;
        int i8 = -1;
        if (!(this.z == null && this.x == -1) && a0Var.b() == 0) {
            q0(vVar);
            return;
        }
        d dVar = this.z;
        if (dVar != null && (i7 = dVar.t) >= 0) {
            this.x = i7;
        }
        Q0();
        boolean z6 = false;
        this.q.a = false;
        j1();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.a.c.contains(focusedChild)) {
            focusedChild = null;
        }
        a aVar = this.A;
        if (!aVar.e || this.x != -1 || this.z != null) {
            aVar.c();
            aVar.d = this.u ^ this.v;
            if (a0Var.g || (i = this.x) == -1) {
                if (w() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.a.c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        pVar = (RecyclerView.p) focusedChild2.getLayoutParams();
                        if (!pVar.a.j() || pVar.a.d() < 0 || pVar.a.d() >= a0Var.b()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2 || (viewZ0 = Z0(vVar, a0Var, aVar.d, z2)) == null) {
                                aVar.a();
                                if (this.v) {
                                    iB = a0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                int iM = RecyclerView.o.M(viewZ0);
                                z3 = aVar.d;
                                xVar = aVar.a;
                                if (z3) {
                                    int iB3 = xVar.b(viewZ0);
                                    xVar2 = aVar.a;
                                    if (Integer.MIN_VALUE == xVar2.b) {
                                        iL = 0;
                                    } else {
                                        iL = xVar2.l() - xVar2.b;
                                    }
                                    aVar.c = iL + iB3;
                                } else {
                                    aVar.c = xVar.e(viewZ0);
                                }
                                aVar.b = iM;
                                if (!a0Var.g && J0()) {
                                    iE = this.r.e(viewZ0);
                                    iB2 = this.r.b(viewZ0);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK || iE >= iK) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iE >= iG || iB2 <= iG) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    }
                                }
                            }
                        } else {
                            aVar.b(RecyclerView.o.M(focusedChild2), focusedChild2);
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            aVar.a();
                            if (this.v) {
                                iB = a0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            aVar.b = iB;
                        } else {
                            int iM2 = RecyclerView.o.M(viewZ0);
                            z3 = aVar.d;
                            xVar = aVar.a;
                            if (z3) {
                                int iB4 = xVar.b(viewZ0);
                                xVar2 = aVar.a;
                                if (Integer.MIN_VALUE == xVar2.b) {
                                    iL = 0;
                                } else {
                                    iL = xVar2.l() - xVar2.b;
                                }
                                aVar.c = iL + iB4;
                            } else {
                                aVar.c = xVar.e(viewZ0);
                            }
                            aVar.b = iM2;
                            if (!a0Var.g) {
                                iE = this.r.e(viewZ0);
                                iB2 = this.r.b(viewZ0);
                                iK = this.r.k();
                                iG = this.r.g();
                                if (iB2 <= iK) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iE >= iG) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                } else {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.v) {
                        iB = a0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    aVar.b = iB;
                }
            } else if (i < 0 || i >= a0Var.b()) {
                this.x = -1;
                this.y = Integer.MIN_VALUE;
                if (w() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        pVar = (RecyclerView.p) focusedChild2.getLayoutParams();
                        if (pVar.a.j()) {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                aVar.a();
                                if (this.v) {
                                    iB = a0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                int iM3 = RecyclerView.o.M(viewZ0);
                                z3 = aVar.d;
                                xVar = aVar.a;
                                if (z3) {
                                    int iB5 = xVar.b(viewZ0);
                                    xVar2 = aVar.a;
                                    if (Integer.MIN_VALUE == xVar2.b) {
                                        iL = 0;
                                    } else {
                                        iL = xVar2.l() - xVar2.b;
                                    }
                                    aVar.c = iL + iB5;
                                } else {
                                    aVar.c = xVar.e(viewZ0);
                                }
                                aVar.b = iM3;
                                if (!a0Var.g) {
                                    iE = this.r.e(viewZ0);
                                    iB2 = this.r.b(viewZ0);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iE >= iG) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    } else {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    }
                                }
                            }
                        } else {
                            z = this.s;
                            z2 = this.v;
                            if (z == z2) {
                                aVar.a();
                                if (this.v) {
                                    iB = a0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                aVar.b = iB;
                            } else {
                                int iM4 = RecyclerView.o.M(viewZ0);
                                z3 = aVar.d;
                                xVar = aVar.a;
                                if (z3) {
                                    int iB6 = xVar.b(viewZ0);
                                    xVar2 = aVar.a;
                                    if (Integer.MIN_VALUE == xVar2.b) {
                                        iL = 0;
                                    } else {
                                        iL = xVar2.l() - xVar2.b;
                                    }
                                    aVar.c = iL + iB6;
                                } else {
                                    aVar.c = xVar.e(viewZ0);
                                }
                                aVar.b = iM4;
                                if (!a0Var.g) {
                                    iE = this.r.e(viewZ0);
                                    iB2 = this.r.b(viewZ0);
                                    iK = this.r.k();
                                    iG = this.r.g();
                                    if (iB2 <= iK) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iE >= iG) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    } else {
                                        if (aVar.d) {
                                            iK = iG;
                                        }
                                        aVar.c = iK;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.s;
                        z2 = this.v;
                        if (z == z2) {
                            aVar.a();
                            if (this.v) {
                                iB = a0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            aVar.b = iB;
                        } else {
                            int iM5 = RecyclerView.o.M(viewZ0);
                            z3 = aVar.d;
                            xVar = aVar.a;
                            if (z3) {
                                int iB7 = xVar.b(viewZ0);
                                xVar2 = aVar.a;
                                if (Integer.MIN_VALUE == xVar2.b) {
                                    iL = 0;
                                } else {
                                    iL = xVar2.l() - xVar2.b;
                                }
                                aVar.c = iL + iB7;
                            } else {
                                aVar.c = xVar.e(viewZ0);
                            }
                            aVar.b = iM5;
                            if (!a0Var.g) {
                                iE = this.r.e(viewZ0);
                                iB2 = this.r.b(viewZ0);
                                iK = this.r.k();
                                iG = this.r.g();
                                if (iB2 <= iK) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iE >= iG) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                } else {
                                    if (aVar.d) {
                                        iK = iG;
                                    }
                                    aVar.c = iK;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.v) {
                        iB = a0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    aVar.b = iB;
                }
            } else {
                int i9 = this.x;
                aVar.b = i9;
                d dVar2 = this.z;
                if (dVar2 != null && dVar2.t >= 0) {
                    boolean z7 = dVar2.v;
                    aVar.d = z7;
                    x xVar3 = this.r;
                    if (z7) {
                        aVar.c = xVar3.g() - this.z.u;
                    } else {
                        aVar.c = xVar3.k() + this.z.u;
                    }
                } else if (this.y == Integer.MIN_VALUE) {
                    View viewR2 = r(i9);
                    if (viewR2 == null) {
                        if (w() > 0) {
                            aVar.d = (this.x < RecyclerView.o.M(v(0))) == this.u;
                        }
                        aVar.a();
                    } else if (this.r.c(viewR2) > this.r.l()) {
                        aVar.a();
                    } else {
                        int iE4 = this.r.e(viewR2) - this.r.k();
                        x xVar4 = this.r;
                        if (iE4 < 0) {
                            aVar.c = xVar4.k();
                            aVar.d = false;
                        } else if (xVar4.g() - this.r.b(viewR2) < 0) {
                            aVar.c = this.r.g();
                            aVar.d = true;
                        } else {
                            boolean z8 = aVar.d;
                            x xVar5 = this.r;
                            if (z8) {
                                int iB8 = xVar5.b(viewR2);
                                x xVar6 = this.r;
                                iE2 = (Integer.MIN_VALUE == xVar6.b ? 0 : xVar6.l() - xVar6.b) + iB8;
                            } else {
                                iE2 = xVar5.e(viewR2);
                            }
                            aVar.c = iE2;
                        }
                    }
                } else {
                    boolean z9 = this.u;
                    aVar.d = z9;
                    x xVar7 = this.r;
                    if (z9) {
                        aVar.c = xVar7.g() - this.y;
                    } else {
                        aVar.c = xVar7.k() + this.y;
                    }
                }
            }
            aVar.e = true;
        } else if (focusedChild != null && (this.r.e(focusedChild) >= this.r.g() || this.r.b(focusedChild) <= this.r.k())) {
            aVar.b(RecyclerView.o.M(focusedChild), focusedChild);
        }
        c cVar = this.q;
        cVar.f = cVar.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        K0(a0Var, iArr);
        int iK2 = this.r.k() + Math.max(0, iArr[0]);
        int iH = this.r.h() + Math.max(0, iArr[1]);
        if (a0Var.g && (i6 = this.x) != -1 && this.y != Integer.MIN_VALUE && (viewR = r(i6)) != null) {
            boolean z10 = this.u;
            x xVar8 = this.r;
            if (z10) {
                iG2 = xVar8.g() - this.r.b(viewR);
                iE3 = this.y;
            } else {
                iE3 = xVar8.e(viewR) - this.r.k();
                iG2 = this.y;
            }
            int i10 = iG2 - iE3;
            if (i10 > 0) {
                iK2 += i10;
            } else {
                iH -= i10;
            }
        }
        boolean z11 = aVar.d;
        boolean z12 = this.u;
        if (!z11 ? !z12 : z12) {
            i8 = 1;
        }
        g1(vVar, a0Var, aVar, i8);
        q(vVar);
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        boolean z13 = aVar.d;
        int i11 = aVar.b;
        if (z13) {
            q1(i11, aVar.c);
            c cVar2 = this.q;
            cVar2.h = iK2;
            R0(vVar, cVar2, a0Var, false);
            c cVar3 = this.q;
            i3 = cVar3.b;
            int i12 = cVar3.d;
            int i13 = cVar3.c;
            if (i13 > 0) {
                iH += i13;
            }
            p1(aVar.b, aVar.c);
            c cVar4 = this.q;
            cVar4.h = iH;
            cVar4.d += cVar4.e;
            R0(vVar, cVar4, a0Var, false);
            c cVar5 = this.q;
            i2 = cVar5.b;
            int i14 = cVar5.c;
            if (i14 > 0) {
                q1(i12, i3);
                c cVar6 = this.q;
                cVar6.h = i14;
                R0(vVar, cVar6, a0Var, false);
                i3 = this.q.b;
            }
        } else {
            p1(i11, aVar.c);
            c cVar7 = this.q;
            cVar7.h = iH;
            R0(vVar, cVar7, a0Var, false);
            c cVar8 = this.q;
            i2 = cVar8.b;
            int i15 = cVar8.d;
            int i16 = cVar8.c;
            if (i16 > 0) {
                iK2 += i16;
            }
            q1(aVar.b, aVar.c);
            c cVar9 = this.q;
            cVar9.h = iK2;
            cVar9.d += cVar9.e;
            R0(vVar, cVar9, a0Var, false);
            c cVar10 = this.q;
            int i17 = cVar10.b;
            int i18 = cVar10.c;
            if (i18 > 0) {
                p1(i15, i2);
                c cVar11 = this.q;
                cVar11.h = i18;
                R0(vVar, cVar11, a0Var, false);
                i2 = this.q.b;
            }
            i3 = i17;
        }
        if (w() > 0) {
            if (this.u ^ this.v) {
                int iA2 = a1(i2, vVar, a0Var, true);
                i4 = i3 + iA2;
                i5 = i2 + iA2;
                iA1 = b1(i4, vVar, a0Var, false);
            } else {
                int iB1 = b1(i3, vVar, a0Var, true);
                i4 = i3 + iB1;
                i5 = i2 + iB1;
                iA1 = a1(i5, vVar, a0Var, false);
            }
            i3 = i4 + iA1;
            i2 = i5 + iA1;
        }
        if (a0Var.k && w() != 0 && !a0Var.g && J0()) {
            List<RecyclerView.e0> list2 = vVar.d;
            int size = list2.size();
            int iM6 = RecyclerView.o.M(v(0));
            int i19 = 0;
            int iC = 0;
            int iC2 = 0;
            while (i19 < size) {
                RecyclerView.e0 e0Var = list2.get(i19);
                boolean zJ = e0Var.j();
                View view = e0Var.a;
                if (!zJ) {
                    boolean z14 = e0Var.d() < iM6 ? true : z6;
                    boolean z15 = this.u;
                    x xVar9 = this.r;
                    if (z14 != z15) {
                        iC += xVar9.c(view);
                    } else {
                        iC2 += xVar9.c(view);
                    }
                }
                i19++;
                z6 = false;
            }
            this.q.k = list2;
            if (iC > 0) {
                q1(RecyclerView.o.M(d1()), i3);
                c cVar12 = this.q;
                cVar12.h = iC;
                r4 = 0;
                cVar12.c = 0;
                cVar12.a(null);
                R0(vVar, this.q, a0Var, false);
            } else {
                r4 = 0;
            }
            if (iC2 > 0) {
                p1(RecyclerView.o.M(c1()), i2);
                c cVar13 = this.q;
                cVar13.h = iC2;
                cVar13.c = r4;
                list = null;
                cVar13.a(null);
                R0(vVar, this.q, a0Var, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (a0Var.g) {
            aVar.c();
        } else {
            x xVar10 = this.r;
            xVar10.b = xVar10.l();
        }
        this.s = this.v;
    }

    public final void j1() {
        if (this.p == 1 || !e1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int k(RecyclerView.a0 a0Var) {
        return M0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k0(RecyclerView.a0 a0Var) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final int k1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (w() != 0 && i != 0) {
            Q0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            o1(i2, iAbs, true, a0Var);
            c cVar = this.q;
            int iR0 = R0(vVar, cVar, a0Var, false) + cVar.g;
            if (iR0 >= 0) {
                if (iAbs > iR0) {
                    i = i2 * iR0;
                }
                this.r.o(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int l(RecyclerView.a0 a0Var) {
        return N0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.z = dVar;
            if (this.x != -1) {
                dVar.t = -1;
            }
            v0();
        }
    }

    public final void l1(int i, int i2) {
        this.x = i;
        this.y = i2;
        d dVar = this.z;
        if (dVar != null) {
            dVar.t = -1;
        }
        v0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int m(RecyclerView.a0 a0Var) {
        return O0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable m0() {
        d dVar = this.z;
        if (dVar != null) {
            d dVar2 = new d();
            dVar2.t = dVar.t;
            dVar2.u = dVar.u;
            dVar2.v = dVar.v;
            return dVar2;
        }
        d dVar3 = new d();
        if (w() <= 0) {
            dVar3.t = -1;
            return dVar3;
        }
        Q0();
        boolean z = this.s ^ this.u;
        dVar3.v = z;
        if (z) {
            View viewC1 = c1();
            dVar3.u = this.r.g() - this.r.b(viewC1);
            dVar3.t = RecyclerView.o.M(viewC1);
            return dVar3;
        }
        View viewD1 = d1();
        dVar3.t = RecyclerView.o.M(viewD1);
        dVar3.u = this.r.e(viewD1) - this.r.k();
        return dVar3;
    }

    public final void m1(int i) {
        if (i != 0 && i != 1) {
            z90.a(pp2.a(i, "invalid orientation:"));
            return;
        }
        c(null);
        if (i != this.p || this.r == null) {
            x xVarA = x.a(this, i);
            this.r = xVarA;
            this.A.a = xVarA;
            this.p = i;
            v0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int n(RecyclerView.a0 a0Var) {
        return M0(a0Var);
    }

    public void n1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        v0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int o(RecyclerView.a0 a0Var) {
        return N0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean o0(int i, Bundle bundle) {
        int iMin;
        if (super.o0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.p == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.b;
                iMin = Math.min(i2, O(recyclerView.v, recyclerView.B0) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.b;
                iMin = Math.min(i3, z(recyclerView2.v, recyclerView2.B0) - 1);
            }
            if (iMin >= 0) {
                l1(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public final void o1(int i, int i2, boolean z, RecyclerView.a0 a0Var) {
        int iK;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        K0(a0Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        c cVar = this.q;
        int i3 = z2 ? iMax2 : iMax;
        cVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        cVar.i = iMax;
        if (z2) {
            cVar.h = this.r.h() + i3;
            View viewC1 = c1();
            c cVar2 = this.q;
            cVar2.e = this.u ? -1 : 1;
            int iM = RecyclerView.o.M(viewC1);
            c cVar3 = this.q;
            cVar2.d = iM + cVar3.e;
            cVar3.b = this.r.b(viewC1);
            iK = this.r.b(viewC1) - this.r.g();
        } else {
            View viewD1 = d1();
            c cVar4 = this.q;
            cVar4.h = this.r.k() + cVar4.h;
            c cVar5 = this.q;
            cVar5.e = this.u ? 1 : -1;
            int iM2 = RecyclerView.o.M(viewD1);
            c cVar6 = this.q;
            cVar5.d = iM2 + cVar6.e;
            cVar6.b = this.r.e(viewD1);
            iK = (-this.r.e(viewD1)) + this.r.k();
        }
        c cVar7 = this.q;
        cVar7.c = i2;
        if (z) {
            cVar7.c = i2 - iK;
        }
        cVar7.g = iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int p(RecyclerView.a0 a0Var) {
        return O0(a0Var);
    }

    public final void p1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        c cVar = this.q;
        cVar.e = this.u ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public final void q1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        c cVar = this.q;
        cVar.d = i;
        cVar.e = this.u ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final View r(int i) {
        int iW = w();
        if (iW == 0) {
            return null;
        }
        int iM = i - RecyclerView.o.M(v(0));
        if (iM >= 0 && iM < iW) {
            View viewV = v(iM);
            if (RecyclerView.o.M(viewV) == i) {
                return viewV;
            }
        }
        return super.r(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p s() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.p == 1) {
            return 0;
        }
        return k1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        d dVar = this.z;
        if (dVar != null) {
            dVar.t = -1;
        }
        v0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.p == 0) {
            return 0;
        }
        return k1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        m1(i);
        c(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        v0();
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public void g1(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i) {
    }
}
