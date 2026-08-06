package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.egb;
import defpackage.fib;
import defpackage.j4;
import defpackage.p51;
import defpackage.z90;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    public final d B;
    public final int C;
    public boolean D;
    public boolean E;
    public e F;
    public final Rect G;
    public final b H;
    public final boolean I;
    public int[] J;
    public final a K;
    public final int p;
    public final f[] q;
    public final x r;
    public final x s;
    public final int t;
    public int u;
    public final r v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.K0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            a();
        }

        public final void a() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends RecyclerView.p {
        public f e;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d {
        public int[] a;
        public ArrayList b;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0025a();
            public int t;
            public int u;
            public int[] v;
            public boolean w;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public class C0025a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    a aVar = new a();
                    aVar.t = parcel.readInt();
                    aVar.u = parcel.readInt();
                    aVar.w = parcel.readInt() == 1;
                    int i = parcel.readInt();
                    if (i > 0) {
                        int[] iArr = new int[i];
                        aVar.v = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return aVar;
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i) {
                    return new a[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.t + ", mGapDir=" + this.u + ", mHasUnwantedGapAfter=" + this.w + ", mGapPerSpan=" + Arrays.toString(this.v) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.t);
                parcel.writeInt(this.u);
                parcel.writeInt(this.w ? 1 : 0);
                int[] iArr = this.v;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.v);
                }
            }
        }

        public final void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public final void b(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void c(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                int i4 = aVar.t;
                if (i4 >= i) {
                    aVar.t = i4 + i2;
                }
            }
        }

        public final void d(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                int i4 = aVar.t;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        aVar.t = i4 - i2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public boolean A;
        public boolean B;
        public boolean C;
        public int t;
        public int u;
        public int v;
        public int[] w;
        public int x;
        public int[] y;
        public ArrayList z;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e();
                eVar.t = parcel.readInt();
                eVar.u = parcel.readInt();
                int i = parcel.readInt();
                eVar.v = i;
                if (i > 0) {
                    int[] iArr = new int[i];
                    eVar.w = iArr;
                    parcel.readIntArray(iArr);
                }
                int i2 = parcel.readInt();
                eVar.x = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    eVar.y = iArr2;
                    parcel.readIntArray(iArr2);
                }
                eVar.A = parcel.readInt() == 1;
                eVar.B = parcel.readInt() == 1;
                eVar.C = parcel.readInt() == 1;
                eVar.z = parcel.readArrayList(d.a.class.getClassLoader());
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i) {
                return new e[i];
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
            parcel.writeInt(this.v);
            if (this.v > 0) {
                parcel.writeIntArray(this.w);
            }
            parcel.writeInt(this.x);
            if (this.x > 0) {
                parcel.writeIntArray(this.y);
            }
            parcel.writeInt(this.A ? 1 : 0);
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeList(this.z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class f {
        public final ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public f(int i) {
            this.e = i;
        }

        public final void a() {
            View view = (View) p51.b(1, this.a);
            c cVar = (c) view.getLayoutParams();
            this.c = StaggeredGridLayoutManager.this.r.b(view);
            cVar.getClass();
        }

        public final void b() {
            this.a.clear();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public final int c() {
            boolean z = StaggeredGridLayoutManager.this.w;
            ArrayList<View> arrayList = this.a;
            return z ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
        }

        public final int d() {
            boolean z = StaggeredGridLayoutManager.this.w;
            ArrayList<View> arrayList = this.a;
            return z ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
        }

        public final int e(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iK = staggeredGridLayoutManager.r.k();
            int iG = staggeredGridLayoutManager.r.g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int iE = staggeredGridLayoutManager.r.e(view);
                int iB = staggeredGridLayoutManager.r.b(view);
                boolean z = iE <= iG;
                boolean z2 = iB >= iK;
                if (z && z2 && (iE < iK || iB > iG)) {
                    return RecyclerView.o.M(view);
                }
                i += i3;
            }
            return -1;
        }

        public final int f(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            a();
            return this.c;
        }

        public final View g(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            ArrayList<View> arrayList = this.a;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.w && RecyclerView.o.M(view2) >= i) || ((!staggeredGridLayoutManager.w && RecyclerView.o.M(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && RecyclerView.o.M(view3) <= i) || ((!staggeredGridLayoutManager.w && RecyclerView.o.M(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        public final int h(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            ArrayList<View> arrayList = this.a;
            if (arrayList.size() == 0) {
                return i;
            }
            View view = arrayList.get(0);
            c cVar = (c) view.getLayoutParams();
            this.b = StaggeredGridLayoutManager.this.r.e(view);
            cVar.getClass();
            return this.b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        d dVar = new d();
        this.B = dVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.o.c cVarN = RecyclerView.o.N(context, attributeSet, i, i2);
        int i3 = cVarN.a;
        if (i3 != 0 && i3 != 1) {
            z90.a("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            x xVar = this.r;
            this.r = this.s;
            this.s = xVar;
            v0();
        }
        int i4 = cVarN.b;
        c(null);
        if (i4 != this.p) {
            dVar.a();
            v0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new f[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new f(i5);
            }
            v0();
        }
        boolean z = cVarN.c;
        c(null);
        e eVar = this.F;
        if (eVar != null && eVar.A != z) {
            eVar.A = z;
        }
        this.w = z;
        v0();
        r rVar = new r();
        rVar.a = true;
        rVar.f = 0;
        rVar.g = 0;
        this.v = rVar;
        this.r = x.a(this, this.t);
        this.s = x.a(this, 1 - this.t);
    }

    public static int k1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void B0(Rect rect, int i, int i2) {
        int iH;
        int iH2;
        int iK = K() + J();
        int I = I() + L();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int iHeight = rect.height() + I;
            RecyclerView recyclerView = this.b;
            WeakHashMap<View, fib> weakHashMap = egb.a;
            iH2 = RecyclerView.o.h(i2, iHeight, recyclerView.getMinimumHeight());
            iH = RecyclerView.o.h(i, (this.u * i4) + iK, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iK;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap<View, fib> weakHashMap2 = egb.a;
            iH = RecyclerView.o.h(i, iWidth, recyclerView2.getMinimumWidth());
            iH2 = RecyclerView.o.h(i2, (this.u * i4) + I, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iH, iH2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void H0(RecyclerView recyclerView, int i) {
        s sVar = new s(recyclerView.getContext());
        sVar.a = i;
        I0(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean J0() {
        return this.F == null;
    }

    public final boolean K0() {
        int iR0;
        if (w() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iR0 = S0();
                R0();
            } else {
                iR0 = R0();
                S0();
            }
            if (iR0 == 0 && W0() != null) {
                this.B.a();
                this.f = true;
                v0();
                return true;
            }
        }
        return false;
    }

    public final int L0(RecyclerView.a0 a0Var) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return e0.b(a0Var, this.r, O0(z), N0(z), this, this.I, this.x);
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    public final int M0(RecyclerView.v vVar, r rVar, RecyclerView.a0 a0Var) {
        int i;
        f[] fVarArr;
        int iT0;
        BitSet bitSet;
        f[] fVarArr2;
        f fVar;
        ?? r5;
        int iH;
        int iC;
        int iC2;
        int iG;
        BitSet bitSet2;
        int i2;
        int i3;
        RecyclerView.v vVar2 = vVar;
        BitSet bitSet3 = this.y;
        int i4 = this.p;
        bitSet3.set(0, i4, true);
        r rVar2 = this.v;
        if (rVar2.i) {
            i = rVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = rVar.e == 1 ? rVar.g + rVar.b : rVar.f - rVar.b;
        }
        int i5 = rVar.e;
        int i6 = 0;
        while (true) {
            fVarArr = this.q;
            if (i6 >= i4) {
                break;
            }
            if (!fVarArr[i6].a.isEmpty()) {
                j1(fVarArr[i6], i5, i);
            }
            i6++;
        }
        boolean z = this.x;
        x xVar = this.r;
        int iG2 = z ? xVar.g() : xVar.k();
        boolean z2 = false;
        while (true) {
            int i7 = rVar.c;
            if (i7 < 0 || i7 >= a0Var.b() || (!rVar2.i && bitSet3.isEmpty())) {
                break;
            }
            View viewD = vVar2.d(rVar.c);
            rVar.c += rVar.d;
            c cVar = (c) viewD.getLayoutParams();
            int iD = cVar.a.d();
            d dVar = this.B;
            int[] iArr = dVar.a;
            int i8 = (iArr == null || iD >= iArr.length) ? -1 : iArr[iD];
            if (i8 == -1) {
                if (a1(rVar.e)) {
                    i3 = i4 - 1;
                    i4 = -1;
                    i2 = -1;
                } else {
                    i2 = 1;
                    i3 = 0;
                }
                f fVar2 = null;
                int i9 = i2;
                if (rVar.e == 1) {
                    int iK = xVar.k();
                    fVarArr2 = fVarArr;
                    int i10 = i3;
                    int i11 = Integer.MAX_VALUE;
                    while (i10 != i4) {
                        int i12 = i10;
                        f fVar3 = fVarArr2[i12];
                        BitSet bitSet4 = bitSet3;
                        int iF = fVar3.f(iK);
                        if (iF < i11) {
                            i11 = iF;
                            fVar2 = fVar3;
                        }
                        i10 = i12 + i9;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    fVarArr2 = fVarArr;
                    int iG3 = xVar.g();
                    int i13 = i3;
                    int i14 = Integer.MIN_VALUE;
                    while (i13 != i4) {
                        f fVar4 = fVarArr2[i13];
                        int i15 = i4;
                        int iH2 = fVar4.h(iG3);
                        if (iH2 > i14) {
                            i14 = iH2;
                            fVar2 = fVar4;
                        }
                        i13 += i9;
                        i4 = i15;
                    }
                }
                fVar = fVar2;
                dVar.b(iD);
                dVar.a[iD] = fVar.e;
            } else {
                bitSet = bitSet3;
                i4 = i4;
                fVarArr2 = fVarArr;
                fVar = fVarArr2[i8];
            }
            cVar.e = fVar;
            if (rVar.e == 1) {
                r5 = 0;
                b(viewD, -1, false);
            } else {
                r5 = 0;
                b(viewD, 0, false);
            }
            int i16 = this.t;
            if (i16 == 1) {
                Y0(viewD, RecyclerView.o.x(r5, this.u, this.l, r5, ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.o.x(true, this.o, this.m, I() + L(), ((ViewGroup.MarginLayoutParams) cVar).height));
            } else {
                Y0(viewD, RecyclerView.o.x(true, this.n, this.l, K() + J(), ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.o.x(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) cVar).height));
            }
            if (rVar.e == 1) {
                iC = fVar.f(iG2);
                iH = xVar.c(viewD) + iC;
            } else {
                iH = fVar.h(iG2);
                iC = iH - xVar.c(viewD);
            }
            int i17 = rVar.e;
            f fVar5 = cVar.e;
            if (i17 == 1) {
                fVar5.getClass();
                c cVar2 = (c) viewD.getLayoutParams();
                cVar2.e = fVar5;
                ArrayList<View> arrayList = fVar5.a;
                arrayList.add(viewD);
                fVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    fVar5.b = Integer.MIN_VALUE;
                }
                if (cVar2.a.j() || cVar2.a.m()) {
                    fVar5.d = StaggeredGridLayoutManager.this.r.c(viewD) + fVar5.d;
                }
            } else {
                fVar5.getClass();
                c cVar3 = (c) viewD.getLayoutParams();
                cVar3.e = fVar5;
                ArrayList<View> arrayList2 = fVar5.a;
                arrayList2.add(0, viewD);
                fVar5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    fVar5.c = Integer.MIN_VALUE;
                }
                if (cVar3.a.j() || cVar3.a.m()) {
                    fVar5.d = StaggeredGridLayoutManager.this.r.c(viewD) + fVar5.d;
                }
            }
            boolean zX0 = X0();
            x xVar2 = this.s;
            if (zX0 && i16 == 1) {
                iG = xVar2.g() - (((i4 - 1) - fVar.e) * this.u);
                iC2 = iG - xVar2.c(viewD);
            } else {
                int iK2 = (fVar.e * this.u) + xVar2.k();
                int iC3 = xVar2.c(viewD) + iK2;
                iC2 = iK2;
                iG = iC3;
            }
            z2 = true;
            if (i16 == 1) {
                RecyclerView.o.T(viewD, iC2, iC, iG, iH);
            } else {
                RecyclerView.o.T(viewD, iC, iC2, iH, iG);
            }
            j1(fVar, rVar2.e, i);
            vVar2 = vVar;
            c1(vVar2, rVar2);
            if (rVar2.h && viewD.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(fVar.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i4 = i4;
            fVarArr = fVarArr2;
        }
        if (!z2) {
            c1(vVar2, rVar2);
        }
        if (rVar2.e == -1) {
            iT0 = xVar.k() - U0(xVar.k());
        } else {
            iT0 = T0(xVar.g()) - xVar.g();
        }
        if (iT0 > 0) {
            return Math.min(rVar.b, iT0);
        }
        return 0;
    }

    public final View N0(boolean z) {
        x xVar = this.r;
        int iK = xVar.k();
        int iG = xVar.g();
        View view = null;
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            int iE = xVar.e(viewV);
            int iB = xVar.b(viewV);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int O(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.t == 0) {
            return Math.min(this.p, a0Var.b());
        }
        return -1;
    }

    public final View O0(boolean z) {
        x xVar = this.r;
        int iK = xVar.k();
        int iG = xVar.g();
        int iW = w();
        View view = null;
        for (int i = 0; i < iW; i++) {
            View viewV = v(i);
            int iE = xVar.e(viewV);
            if (xVar.b(viewV) > iK && iE < iG) {
                if (iE >= iK || !z) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    public final void P0(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int iG;
        int iT0 = T0(Integer.MIN_VALUE);
        if (iT0 != Integer.MIN_VALUE && (iG = this.r.g() - iT0) > 0) {
            int i = iG - (-g1(-iG, vVar, a0Var));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean Q() {
        return this.C != 0;
    }

    public final void Q0(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int iK;
        int iU0 = U0(Integer.MAX_VALUE);
        if (iU0 != Integer.MAX_VALUE && (iK = iU0 - this.r.k()) > 0) {
            int iG1 = iK - g1(iK, vVar, a0Var);
            if (!z || iG1 <= 0) {
                return;
            }
            this.r.o(-iG1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean R() {
        return this.w;
    }

    public final int R0() {
        if (w() == 0) {
            return 0;
        }
        return RecyclerView.o.M(v(0));
    }

    public final int S0() {
        int iW = w();
        if (iW == 0) {
            return 0;
        }
        return RecyclerView.o.M(v(iW - 1));
    }

    public final int T0(int i) {
        int iF = this.q[0].f(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iF2 = this.q[i2].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void U(int i) {
        super.U(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            f fVar = this.q[i2];
            int i3 = fVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.b = i3 + i;
            }
            int i4 = fVar.c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.c = i4 + i;
            }
        }
    }

    public final int U0(int i) {
        int iH = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iH2 = this.q[i2].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void V(int i) {
        super.V(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            f fVar = this.q[i2];
            int i3 = fVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.b = i3 + i;
            }
            int i4 = fVar.c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    /* JADX WARN: Code duplicated, block: B:22:0x0033  */
    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[LOOP:0: B:23:0x0038->B:27:0x0047, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068 A[LOOP:1: B:32:0x0059->B:36:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x004b A[EDGE_INSN: B:62:0x004b->B:29:0x004b BREAK  A[LOOP:0: B:23:0x0038->B:27:0x0047], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x006c A[EDGE_INSN: B:64:0x006c->B:38:0x006c BREAK  A[LOOP:1: B:32:0x0059->B:36:0x0068], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final void V0(int i, int i2, int i3) {
        int i4;
        int i5;
        d dVar;
        int[] iArr;
        int iS0;
        ArrayList arrayList;
        int size;
        d.a aVar;
        int size2;
        int i6;
        int i7;
        int[] iArr2;
        int iS1 = this.x ? S0() : R0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            dVar = this.B;
            iArr = dVar.a;
            if (iArr != null && i5 < iArr.length) {
                arrayList = dVar.b;
                if (arrayList == null) {
                    i7 = -1;
                } else {
                    size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            aVar = null;
                            break;
                        }
                        aVar = (d.a) dVar.b.get(size);
                        if (aVar.t == i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (aVar != null) {
                        dVar.b.remove(aVar);
                    }
                    size2 = dVar.b.size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            i6 = -1;
                            break;
                        } else if (((d.a) dVar.b.get(i6)).t >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        d.a aVar2 = (d.a) dVar.b.get(i6);
                        dVar.b.remove(i6);
                        i7 = aVar2.t;
                    } else {
                        i7 = -1;
                    }
                }
                iArr2 = dVar.a;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = dVar.a.length;
                } else {
                    Arrays.fill(dVar.a, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                dVar.c(i, i2);
            } else if (i3 != 2) {
                dVar.d(i, i2);
            } else if (i3 == 8) {
                dVar.d(i, 1);
                dVar.c(i2, 1);
            }
            if (i4 <= iS1) {
                return;
            }
            if (this.x) {
                iS0 = R0();
            } else {
                iS0 = S0();
            }
            if (i5 <= iS0) {
                v0();
            }
        }
        i4 = i + i2;
        i5 = i;
        dVar = this.B;
        iArr = dVar.a;
        if (iArr != null) {
            arrayList = dVar.b;
            if (arrayList == null) {
                i7 = -1;
            } else {
                size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        aVar = null;
                        break;
                    }
                    aVar = (d.a) dVar.b.get(size);
                    if (aVar.t == i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (aVar != null) {
                    dVar.b.remove(aVar);
                }
                size2 = dVar.b.size();
                i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        i6 = -1;
                        break;
                    } else {
                        if (((d.a) dVar.b.get(i6)).t >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    d.a aVar3 = (d.a) dVar.b.get(i6);
                    dVar.b.remove(i6);
                    i7 = aVar3.t;
                } else {
                    i7 = -1;
                }
            }
            iArr2 = dVar.a;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = dVar.a.length;
            } else {
                Arrays.fill(dVar.a, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            dVar.c(i, i2);
        } else if (i3 != 2) {
            dVar.d(i, i2);
        } else if (i3 == 8) {
            dVar.d(i, 1);
            dVar.c(i2, 1);
        }
        if (i4 <= iS1) {
            return;
        }
        if (this.x) {
            iS0 = R0();
        } else {
            iS0 = S0();
        }
        if (i5 <= iS0) {
            v0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void W() {
        this.B.a();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    public final View W0() {
        boolean z;
        boolean z2;
        int iW = w();
        int i = iW - 1;
        int i2 = this.p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b2 = (this.t == 1 && X0()) ? (byte) 1 : (byte) -1;
        if (this.x) {
            iW = -1;
        } else {
            i = 0;
        }
        int i3 = i < iW ? 1 : -1;
        while (i != iW) {
            View viewV = v(i);
            c cVar = (c) viewV.getLayoutParams();
            boolean z3 = bitSet.get(cVar.e.e);
            x xVar = this.r;
            if (z3) {
                f fVar = cVar.e;
                if (this.x) {
                    int i4 = fVar.c;
                    if (i4 == Integer.MIN_VALUE) {
                        fVar.a();
                        i4 = fVar.c;
                    }
                    if (i4 < xVar.g()) {
                        ((c) ((View) p51.b(1, fVar.a)).getLayoutParams()).getClass();
                        return viewV;
                    }
                } else {
                    int i5 = fVar.b;
                    ArrayList<View> arrayList = fVar.a;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = arrayList.get(0);
                        c cVar2 = (c) view.getLayoutParams();
                        fVar.b = StaggeredGridLayoutManager.this.r.e(view);
                        cVar2.getClass();
                        i5 = fVar.b;
                    }
                    if (i5 > xVar.k()) {
                        ((c) arrayList.get(0).getLayoutParams()).getClass();
                        return viewV;
                    }
                }
                bitSet.clear(cVar.e.e);
            }
            i += i3;
            if (i != iW) {
                View viewV2 = v(i);
                if (this.x) {
                    int iB = xVar.b(viewV);
                    int iB2 = xVar.b(viewV2);
                    if (iB >= iB2) {
                        if (iB == iB2) {
                            if (cVar.e.e - ((c) viewV2.getLayoutParams()).e.e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b2 < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewV;
                }
                int iE = xVar.e(viewV);
                int iE2 = xVar.e(viewV2);
                if (iE <= iE2) {
                    if (iE == iE2) {
                        if (cVar.e.e - ((c) viewV2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b2 < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewV;
            }
        }
        return null;
    }

    public final boolean X0() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void Y(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void Y0(View view, int i, int i2) {
        Rect rect = this.G;
        d(rect, view);
        c cVar = (c) view.getLayoutParams();
        int iK1 = k1(i, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int iK2 = k1(i2, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (E0(view, iK1, iK2, cVar)) {
            view.measure(iK1, iK2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046  */
    /* JADX WARN: Code duplicated, block: B:34:0x004d  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final View Z(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View viewD;
        int i2;
        if (w() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewD = recyclerView.D(view)) == null || this.a.c.contains(viewD)) {
                viewD = null;
            }
            if (viewD != null) {
                f1();
                int i3 = this.t;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && X0()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && X0()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    c cVar = (c) viewD.getLayoutParams();
                    cVar.getClass();
                    f fVar = cVar.e;
                    int iS0 = i2 == 1 ? S0() : R0();
                    i1(iS0, a0Var);
                    h1(i2);
                    r rVar = this.v;
                    rVar.c = rVar.d + iS0;
                    rVar.b = (int) (this.r.l() * 0.33333334f);
                    rVar.h = true;
                    rVar.a = false;
                    M0(vVar, rVar, a0Var);
                    this.D = this.x;
                    View viewG = fVar.g(iS0, i2);
                    if (viewG != null && viewG != viewD) {
                        return viewG;
                    }
                    boolean zA1 = a1(i2);
                    f[] fVarArr = this.q;
                    int i4 = this.p;
                    if (zA1) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewG2 = fVarArr[i5].g(iS0, i2);
                            if (viewG2 != null && viewG2 != viewD) {
                                return viewG2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewG3 = fVarArr[i6].g(iS0, i2);
                            if (viewG3 != null && viewG3 != viewD) {
                                return viewG3;
                            }
                        }
                    }
                    boolean z = (this.w ^ true) == (i2 == -1);
                    View viewR = r(z ? fVar.c() : fVar.d());
                    if (viewR != null && viewR != viewD) {
                        return viewR;
                    }
                    if (a1(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != fVar.e) {
                                View viewR2 = r(z ? fVarArr[i7].c() : fVarArr[i7].d());
                                if (viewR2 != null && viewR2 != viewD) {
                                    return viewR2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewR3 = r(z ? fVarArr[i8].c() : fVarArr[i8].d());
                            if (viewR3 != null && viewR3 != viewD) {
                                return viewR3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
    public final void Z0(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        e eVar;
        int iW;
        int i2;
        int iM;
        int iM2;
        int iW2;
        boolean z4;
        int i3;
        boolean z5;
        e eVar2 = this.F;
        b bVar = this.H;
        if (!(eVar2 == null && this.z == -1) && a0Var.b() == 0) {
            q0(vVar);
            bVar.a();
            return;
        }
        boolean z6 = bVar.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        boolean z7 = (z6 && this.z == -1 && this.F == null) ? false : true;
        f[] fVarArr = this.q;
        int i4 = this.p;
        d dVar = this.B;
        if (z7) {
            bVar.a();
            e eVar3 = this.F;
            x xVar = this.r;
            if (eVar3 != null) {
                int i5 = eVar3.v;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            fVarArr[i6].b();
                            e eVar4 = this.F;
                            int iG = eVar4.w[i6];
                            if (iG != Integer.MIN_VALUE) {
                                iG += eVar4.B ? xVar.g() : xVar.k();
                            }
                            f fVar = fVarArr[i6];
                            fVar.b = iG;
                            fVar.c = iG;
                        }
                    } else {
                        eVar3.w = null;
                        eVar3.v = 0;
                        eVar3.x = 0;
                        eVar3.y = null;
                        eVar3.z = null;
                        eVar3.t = eVar3.u;
                    }
                }
                e eVar5 = this.F;
                this.E = eVar5.C;
                boolean z8 = eVar5.A;
                c(null);
                e eVar6 = this.F;
                if (eVar6 != null && eVar6.A != z8) {
                    eVar6.A = z8;
                }
                this.w = z8;
                v0();
                f1();
                e eVar7 = this.F;
                int i7 = eVar7.t;
                if (i7 != -1) {
                    this.z = i7;
                    bVar.c = eVar7.B;
                } else {
                    bVar.c = this.x;
                }
                if (eVar7.x > 1) {
                    dVar.a = eVar7.y;
                    dVar.b = eVar7.z;
                }
            } else {
                f1();
                bVar.c = this.x;
            }
            if (a0Var.g || (i3 = this.z) == -1) {
                if (this.D) {
                    int iB = a0Var.b();
                    iW2 = w() - 1;
                    while (true) {
                        if (iW2 < 0) {
                            iM2 = 0;
                            break;
                        }
                        iM2 = RecyclerView.o.M(v(iW2));
                        if (iM2 < 0 && iM2 < iB) {
                            break;
                        } else {
                            iW2--;
                        }
                    }
                } else {
                    int iB2 = a0Var.b();
                    iW = w();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iW) {
                            iM2 = 0;
                            break;
                        }
                        iM = RecyclerView.o.M(v(i2));
                        if (iM < 0 && iM < iB2) {
                            iM2 = iM;
                            break;
                        }
                        i2++;
                    }
                }
                bVar.a = iM2;
                bVar.b = Integer.MIN_VALUE;
                z4 = true;
            } else if (i3 < 0 || i3 >= a0Var.b()) {
                this.z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                    int iB3 = a0Var.b();
                    iW2 = w() - 1;
                    while (true) {
                        if (iW2 < 0) {
                            iM2 = 0;
                            break;
                        } else {
                            iM2 = RecyclerView.o.M(v(iW2));
                            if (iM2 < 0) {
                            }
                            iW2--;
                        }
                    }
                } else {
                    int iB4 = a0Var.b();
                    iW = w();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iW) {
                            iM2 = 0;
                            break;
                        } else {
                            iM = RecyclerView.o.M(v(i2));
                            if (iM < 0) {
                            }
                            i2++;
                        }
                    }
                }
                bVar.a = iM2;
                bVar.b = Integer.MIN_VALUE;
                z4 = true;
            } else {
                e eVar8 = this.F;
                if (eVar8 == null || eVar8.t == -1 || eVar8.v < 1) {
                    View viewR = r(this.z);
                    if (viewR != null) {
                        bVar.a = this.x ? S0() : R0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (xVar.g() - this.A) - xVar.b(viewR);
                            } else {
                                bVar.b = (xVar.k() + this.A) - xVar.e(viewR);
                            }
                        } else if (xVar.c(viewR) > xVar.l()) {
                            bVar.b = bVar.c ? xVar.g() : xVar.k();
                        } else {
                            int iE = xVar.e(viewR) - xVar.k();
                            if (iE < 0) {
                                bVar.b = -iE;
                            } else {
                                int iG2 = xVar.g() - xVar.b(viewR);
                                if (iG2 < 0) {
                                    bVar.b = iG2;
                                } else {
                                    bVar.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i8 = this.z;
                        bVar.a = i8;
                        int i9 = this.A;
                        if (i9 == Integer.MIN_VALUE) {
                            if (w() != 0) {
                                if ((i8 < R0()) != this.x) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.x) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            bVar.c = z5;
                            x xVar2 = staggeredGridLayoutManager.r;
                            bVar.b = z5 ? xVar2.g() : xVar2.k();
                        } else {
                            boolean z9 = bVar.c;
                            x xVar3 = staggeredGridLayoutManager.r;
                            if (z9) {
                                bVar.b = xVar3.g() - i9;
                            } else {
                                bVar.b = xVar3.k() + i9;
                            }
                        }
                        z4 = true;
                        bVar.d = true;
                    }
                } else {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.z;
                }
                z4 = true;
            }
            bVar.e = z4;
        }
        if (this.F == null && this.z == -1 && !(bVar.c == this.D && X0() == this.E)) {
            dVar.a();
            i = 1;
            bVar.d = true;
        } else {
            i = 1;
        }
        if (w() > 0 && ((eVar = this.F) == null || eVar.v < i)) {
            if (bVar.d) {
                for (int i10 = 0; i10 < i4; i10++) {
                    fVarArr[i10].b();
                    int i11 = bVar.b;
                    if (i11 != Integer.MIN_VALUE) {
                        f fVar2 = fVarArr[i10];
                        fVar2.b = i11;
                        fVar2.c = i11;
                    }
                }
            } else if (z7 || bVar.f == null) {
                for (int i12 = 0; i12 < i4; i12++) {
                    f fVar3 = fVarArr[i12];
                    boolean z10 = this.x;
                    int i13 = bVar.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    int iF = z10 ? fVar3.f(Integer.MIN_VALUE) : fVar3.h(Integer.MIN_VALUE);
                    fVar3.b();
                    if (iF != Integer.MIN_VALUE && ((!z10 || iF >= staggeredGridLayoutManager2.r.g()) && (z10 || iF <= staggeredGridLayoutManager2.r.k()))) {
                        if (i13 != Integer.MIN_VALUE) {
                            iF += i13;
                        }
                        fVar3.c = iF;
                        fVar3.b = iF;
                    }
                }
                int length = fVarArr.length;
                int[] iArr = bVar.f;
                if (iArr == null || iArr.length < length) {
                    bVar.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    bVar.f[i14] = fVarArr[i14].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < i4; i15++) {
                    f fVar4 = fVarArr[i15];
                    fVar4.b();
                    int i16 = bVar.f[i15];
                    fVar4.b = i16;
                    fVar4.c = i16;
                }
            }
        }
        q(vVar);
        r rVar = this.v;
        rVar.a = false;
        x xVar4 = this.s;
        int iL = xVar4.l();
        this.u = iL / i4;
        View.MeasureSpec.makeMeasureSpec(iL, xVar4.i());
        i1(bVar.a, a0Var);
        if (bVar.c) {
            h1(-1);
            M0(vVar, rVar, a0Var);
            h1(1);
            rVar.c = bVar.a + rVar.d;
            M0(vVar, rVar, a0Var);
        } else {
            h1(1);
            M0(vVar, rVar, a0Var);
            h1(-1);
            rVar.c = bVar.a + rVar.d;
            M0(vVar, rVar, a0Var);
        }
        if (xVar4.i() != 1073741824) {
            int iW3 = w();
            float fMax = 0.0f;
            for (int i17 = 0; i17 < iW3; i17++) {
                View viewV = v(i17);
                float fC = xVar4.c(viewV);
                if (fC >= fMax) {
                    ((c) viewV.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i18 = this.u;
            int iRound = Math.round(fMax * i4);
            if (xVar4.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, xVar4.l());
            }
            this.u = iRound / i4;
            View.MeasureSpec.makeMeasureSpec(iRound, xVar4.i());
            if (this.u != i18) {
                for (int i19 = 0; i19 < iW3; i19++) {
                    View viewV2 = v(i19);
                    c cVar = (c) viewV2.getLayoutParams();
                    cVar.getClass();
                    boolean zX0 = X0();
                    int i20 = this.t;
                    if (zX0 && i20 == 1) {
                        int i21 = -((i4 - 1) - cVar.e.e);
                        viewV2.offsetLeftAndRight((this.u * i21) - (i21 * i18));
                    } else {
                        int i22 = cVar.e.e;
                        int i23 = this.u * i22;
                        int i24 = i22 * i18;
                        if (i20 == 1) {
                            viewV2.offsetLeftAndRight(i23 - i24);
                        } else {
                            viewV2.offsetTopAndBottom(i23 - i24);
                        }
                    }
                }
            }
        }
        if (w() <= 0) {
            z2 = true;
        } else if (this.x) {
            z2 = true;
            P0(vVar, a0Var, true);
            Q0(vVar, a0Var, false);
        } else {
            z2 = true;
            Q0(vVar, a0Var, true);
            P0(vVar, a0Var, false);
        }
        if (!z || a0Var.g || this.C == 0 || w() <= 0 || W0() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            if (K0()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (a0Var.g) {
            bVar.a();
        }
        this.D = bVar.c;
        this.E = X0();
        if (z3) {
            bVar.a();
            Z0(vVar, a0Var, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF a(int i) {
        int i2 = -1;
        if (w() != 0) {
            if ((i < R0()) == this.x) {
                i2 = 1;
            }
        } else if (this.x) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void a0(AccessibilityEvent accessibilityEvent) {
        super.a0(accessibilityEvent);
        if (w() > 0) {
            View viewO0 = O0(false);
            View viewN0 = N0(false);
            if (viewO0 == null || viewN0 == null) {
                return;
            }
            int iM = RecyclerView.o.M(viewO0);
            int iM2 = RecyclerView.o.M(viewN0);
            if (iM < iM2) {
                accessibilityEvent.setFromIndex(iM);
                accessibilityEvent.setToIndex(iM2);
            } else {
                accessibilityEvent.setFromIndex(iM2);
                accessibilityEvent.setToIndex(iM);
            }
        }
    }

    public final boolean a1(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == X0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void b0(RecyclerView.v vVar, RecyclerView.a0 a0Var, j4 j4Var) {
        super.b0(vVar, a0Var, j4Var);
        j4Var.j("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void b1(int i, RecyclerView.a0 a0Var) {
        int iR0;
        int i2;
        if (i > 0) {
            iR0 = S0();
            i2 = 1;
        } else {
            iR0 = R0();
            i2 = -1;
        }
        r rVar = this.v;
        rVar.a = true;
        i1(iR0, a0Var);
        h1(i2);
        rVar.c = iR0 + rVar.d;
        rVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    public final void c1(RecyclerView.v vVar, r rVar) {
        if (!rVar.a || rVar.i) {
            return;
        }
        int i = rVar.b;
        int i2 = rVar.e;
        if (i == 0) {
            if (i2 == -1) {
                d1(vVar, rVar.g);
                return;
            } else {
                e1(vVar, rVar.f);
                return;
            }
        }
        int i3 = this.p;
        f[] fVarArr = this.q;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = rVar.f;
            int iH = fVarArr[0].h(i5);
            while (i4 < i3) {
                int iH2 = fVarArr[i4].h(i5);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i4++;
            }
            int i6 = i5 - iH;
            int iMin = rVar.g;
            if (i6 >= 0) {
                iMin -= Math.min(i6, rVar.b);
            }
            d1(vVar, iMin);
            return;
        }
        int i7 = rVar.g;
        int iF = fVarArr[0].f(i7);
        while (i4 < i3) {
            int iF2 = fVarArr[i4].f(i7);
            if (iF2 < iF) {
                iF = iF2;
            }
            i4++;
        }
        int i8 = iF - rVar.g;
        int iMin2 = rVar.f;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, rVar.b);
        }
        e1(vVar, iMin2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, j4 j4Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            c0(view, j4Var);
            return;
        }
        f fVar = ((c) layoutParams).e;
        if (this.t == 0) {
            j4Var.l(j4.h.a(false, fVar == null ? -1 : fVar.e, 1, -1, -1));
        } else {
            j4Var.l(j4.h.a(false, -1, -1, fVar == null ? -1 : fVar.e, 1));
        }
    }

    public final void d1(RecyclerView.v vVar, int i) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            x xVar = this.r;
            if (xVar.e(viewV) < i || xVar.n(viewV) < i) {
                return;
            }
            c cVar = (c) viewV.getLayoutParams();
            cVar.getClass();
            if (cVar.e.a.size() == 1) {
                return;
            }
            f fVar = cVar.e;
            ArrayList<View> arrayList = fVar.a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.e = null;
            if (cVar2.a.j() || cVar2.a.m()) {
                fVar.d -= StaggeredGridLayoutManager.this.r.c(viewRemove);
            }
            if (size == 1) {
                fVar.b = Integer.MIN_VALUE;
            }
            fVar.c = Integer.MIN_VALUE;
            s0(viewV, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean e() {
        return this.t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void e0(int i, int i2) {
        V0(i, i2, 1);
    }

    public final void e1(RecyclerView.v vVar, int i) {
        while (w() > 0) {
            View viewV = v(0);
            x xVar = this.r;
            if (xVar.b(viewV) > i || xVar.m(viewV) > i) {
                return;
            }
            c cVar = (c) viewV.getLayoutParams();
            cVar.getClass();
            if (cVar.e.a.size() == 1) {
                return;
            }
            f fVar = cVar.e;
            ArrayList<View> arrayList = fVar.a;
            View viewRemove = arrayList.remove(0);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.e = null;
            if (arrayList.size() == 0) {
                fVar.c = Integer.MIN_VALUE;
            }
            if (cVar2.a.j() || cVar2.a.m()) {
                fVar.d -= StaggeredGridLayoutManager.this.r.c(viewRemove);
            }
            fVar.b = Integer.MIN_VALUE;
            s0(viewV, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean f() {
        return this.t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void f0() {
        this.B.a();
        v0();
    }

    public final void f1() {
        if (this.t == 1 || !X0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean g(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void g0(int i, int i2) {
        V0(i, i2, 8);
    }

    public final int g1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        b1(i, a0Var);
        r rVar = this.v;
        int iM0 = M0(vVar, rVar, a0Var);
        if (rVar.b >= iM0) {
            i = i < 0 ? -iM0 : iM0;
        }
        this.r.o(-i);
        this.D = this.x;
        rVar.b = 0;
        c1(vVar, rVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void h0(int i, int i2) {
        V0(i, i2, 2);
    }

    public final void h1(int i) {
        r rVar = this.v;
        rVar.e = i;
        rVar.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void i(int i, int i2, RecyclerView.a0 a0Var, o.b bVar) {
        r rVar;
        int iF;
        if (this.t != 0) {
            i = i2;
        }
        if (w() == 0 || i == 0) {
            return;
        }
        b1(i, a0Var);
        int[] iArr = this.J;
        int i3 = this.p;
        if (iArr == null || iArr.length < i3) {
            this.J = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            rVar = this.v;
            if (i4 >= i3) {
                break;
            }
            int i6 = rVar.d;
            f[] fVarArr = this.q;
            if (i6 == -1) {
                int i7 = rVar.f;
                iF = i7 - fVarArr[i4].h(i7);
            } else {
                iF = fVarArr[i4].f(rVar.g) - rVar.g;
            }
            if (iF >= 0) {
                this.J[i5] = iF;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = rVar.c;
            if (i9 < 0 || i9 >= a0Var.b()) {
                return;
            }
            bVar.a(rVar.c, this.J[i8]);
            rVar.c += rVar.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void i0(int i, int i2) {
        V0(i, i2, 4);
    }

    public final void i1(int i, RecyclerView.a0 a0Var) {
        int iL;
        int iL2;
        int i2;
        r rVar = this.v;
        boolean z = false;
        rVar.b = 0;
        rVar.c = i;
        RecyclerView.z zVar = this.e;
        x xVar = this.r;
        if (zVar == null || !zVar.e || (i2 = a0Var.a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iL = xVar.l();
                iL2 = 0;
            } else {
                iL2 = xVar.l();
                iL = 0;
            }
        }
        if (y()) {
            rVar.f = xVar.k() - iL2;
            rVar.g = xVar.g() + iL;
        } else {
            rVar.g = xVar.f() + iL;
            rVar.f = -iL2;
        }
        rVar.h = false;
        rVar.a = true;
        if (xVar.i() == 0 && xVar.f() == 0) {
            z = true;
        }
        rVar.i = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        Z0(vVar, a0Var, true);
    }

    public final void j1(f fVar, int i, int i2) {
        int i3 = fVar.d;
        int i4 = fVar.e;
        BitSet bitSet = this.y;
        if (i != -1) {
            int i5 = fVar.c;
            if (i5 == Integer.MIN_VALUE) {
                fVar.a();
                i5 = fVar.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = fVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = fVar.a.get(0);
            c cVar = (c) view.getLayoutParams();
            fVar.b = StaggeredGridLayoutManager.this.r.e(view);
            cVar.getClass();
            i6 = fVar.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int k(RecyclerView.a0 a0Var) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return e0.a(a0Var, this.r, O0(z), N0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void k0(RecyclerView.a0 a0Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int l(RecyclerView.a0 a0Var) {
        return L0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.F = eVar;
            if (this.z != -1) {
                eVar.t = -1;
                eVar.u = -1;
                eVar.w = null;
                eVar.v = 0;
                eVar.x = 0;
                eVar.y = null;
                eVar.z = null;
            }
            v0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int m(RecyclerView.a0 a0Var) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return e0.c(a0Var, this.r, O0(z), N0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable m0() {
        int iH;
        int iK;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            e eVar2 = new e();
            eVar2.v = eVar.v;
            eVar2.t = eVar.t;
            eVar2.u = eVar.u;
            eVar2.w = eVar.w;
            eVar2.x = eVar.x;
            eVar2.y = eVar.y;
            eVar2.A = eVar.A;
            eVar2.B = eVar.B;
            eVar2.C = eVar.C;
            eVar2.z = eVar.z;
            return eVar2;
        }
        e eVar3 = new e();
        eVar3.A = this.w;
        eVar3.B = this.D;
        eVar3.C = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.a) == null) {
            eVar3.x = 0;
        } else {
            eVar3.y = iArr;
            eVar3.x = iArr.length;
            eVar3.z = dVar.b;
        }
        if (w() <= 0) {
            eVar3.t = -1;
            eVar3.u = -1;
            eVar3.v = 0;
            return eVar3;
        }
        eVar3.t = this.D ? S0() : R0();
        View viewN0 = this.x ? N0(true) : O0(true);
        eVar3.u = viewN0 != null ? RecyclerView.o.M(viewN0) : -1;
        int i = this.p;
        eVar3.v = i;
        eVar3.w = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.D;
            x xVar = this.r;
            f[] fVarArr = this.q;
            if (z) {
                iH = fVarArr[i2].f(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = xVar.g();
                    iH -= iK;
                }
            } else {
                iH = fVarArr[i2].h(Integer.MIN_VALUE);
                if (iH != Integer.MIN_VALUE) {
                    iK = xVar.k();
                    iH -= iK;
                }
            }
            eVar3.w[i2] = iH;
        }
        return eVar3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int n(RecyclerView.a0 a0Var) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return e0.a(a0Var, this.r, O0(z), N0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void n0(int i) {
        if (i == 0) {
            K0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int o(RecyclerView.a0 a0Var) {
        return L0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int p(RecyclerView.a0 a0Var) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return e0.c(a0Var, this.r, O0(z), N0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p s() {
        return this.t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p t(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int w0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return g1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void x0(int i) {
        e eVar = this.F;
        if (eVar != null && eVar.t != i) {
            eVar.w = null;
            eVar.v = 0;
            eVar.t = -1;
            eVar.u = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        v0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int y0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return g1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int z(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.t == 1) {
            return Math.min(this.p, a0Var.b());
        }
        return -1;
    }
}
