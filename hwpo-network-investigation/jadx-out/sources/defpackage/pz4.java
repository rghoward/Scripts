package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.exoplayer.g;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pz4 implements yb6.a<vc1>, yb6.e, bd9, ls3, vz8.c {
    public static final Set<Integer> s0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final j83.a A;
    public final qb6 B;
    public final yb6 C;
    public final jq6.a D;
    public final int E;
    public final wy4.b F;
    public final ArrayList<zy4> G;
    public final List<zy4> H;
    public final mz4 I;
    public final at J;
    public final Handler K;
    public final ArrayList<lz4> L;
    public final Map<String, h83> M;
    public vc1 N;
    public b[] O;
    public int[] P;
    public final HashSet Q;
    public final SparseIntArray R;
    public a S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public int X;
    public id4 Y;
    public id4 Z;
    public boolean a0;
    public gsa b0;
    public Set<esa> c0;
    public int[] d0;
    public int e0;
    public boolean f0;
    public boolean[] g0;
    public boolean[] h0;
    public long i0;
    public long j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public long n0;
    public boolean o0;
    public long p0;
    public h83 q0;
    public zy4 r0;
    public final String t;
    public final int u;
    public final cz4.a v;
    public final wy4 w;
    public final ki x;
    public final id4 y;
    public final k83 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements hsa {
        public static final id4 f;
        public static final id4 g;
        public final hsa a;
        public final id4 b;
        public id4 c;
        public byte[] d;
        public int e;

        static {
            id4.a aVar = new id4.a();
            aVar.n = fv6.n("application/id3");
            f = new id4(aVar);
            id4.a aVar2 = new id4.a();
            aVar2.n = fv6.n("application/x-emsg");
            g = new id4(aVar2);
        }

        public a(hsa hsaVar, int i) {
            this.a = hsaVar;
            if (i == 1) {
                this.b = f;
            } else {
                if (i != 3) {
                    z90.a(pp2.a(i, "Unknown metadataType: "));
                    throw null;
                }
                this.b = g;
            }
            this.d = new byte[0];
            this.e = 0;
        }

        @Override // defpackage.hsa
        public final void a(long j, int i, int i2, int i3, hsa.a aVar) {
            this.c.getClass();
            int i4 = this.e - i3;
            pt7 pt7Var = new pt7(Arrays.copyOfRange(this.d, i4 - i2, i4));
            byte[] bArr = this.d;
            System.arraycopy(bArr, i4, bArr, 0, i3);
            this.e = i3;
            String str = this.c.o;
            id4 id4Var = this.b;
            String str2 = id4Var.o;
            String str3 = id4Var.o;
            if (!Objects.equals(str, str2)) {
                if (!"application/x-emsg".equals(this.c.o)) {
                    md6.g("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.o);
                    return;
                }
                tm3 tm3VarH1 = um3.h1(pt7Var);
                id4 id4VarA = tm3VarH1.a();
                if (id4VarA == null || !Objects.equals(str3, id4VarA.o)) {
                    md6.g("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + tm3VarH1.a());
                    return;
                }
                byte[] bArrC = tm3VarH1.c();
                bArrC.getClass();
                pt7Var = new pt7(bArrC);
            }
            int iA = pt7Var.a();
            hsa hsaVar = this.a;
            hsaVar.e(iA, pt7Var);
            hsaVar.a(j, i, iA, 0, aVar);
        }

        @Override // defpackage.hsa
        public final void b(pt7 pt7Var, int i, int i2) {
            int i3 = this.e + i;
            byte[] bArr = this.d;
            if (bArr.length < i3) {
                this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
            }
            pt7Var.k(this.d, this.e, i);
            this.e += i;
        }

        @Override // defpackage.hsa
        public final int c(ef2 ef2Var, int i, boolean z) throws EOFException {
            int i2 = this.e + i;
            byte[] bArr = this.d;
            if (bArr.length < i2) {
                this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
            }
            int i3 = ef2Var.read(this.d, this.e, i);
            if (i3 != -1) {
                this.e += i3;
                return i3;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // defpackage.hsa
        public final void g(id4 id4Var) {
            this.c = id4Var;
            this.a.g(this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends vz8 {
        public final Map<String, h83> J;
        public h83 K;

        public b() {
            throw null;
        }

        public b(ki kiVar, k83 k83Var, j83.a aVar, Map map) {
            super(kiVar, k83Var, aVar);
            this.J = map;
        }

        @Override // defpackage.vz8
        public final id4 n(id4 id4Var) {
            h83 h83Var;
            h83 h83Var2 = this.K;
            if (h83Var2 == null) {
                h83Var2 = id4Var.s;
            }
            if (h83Var2 != null && (h83Var = this.J.get(h83Var2.v)) != null) {
                h83Var2 = h83Var;
            }
            su6 su6Var = id4Var.l;
            su6 su6Var2 = null;
            if (su6Var == null) {
                su6Var = su6Var2;
            } else {
                su6.a[] aVarArr = su6Var.a;
                int length = aVarArr.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    su6.a aVar = aVarArr[i2];
                    if ((aVar instanceof v98) && "com.apple.streaming.transportStreamTimestamp".equals(((v98) aVar).b)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    if (length != 1) {
                        su6.a[] aVarArr2 = new su6.a[length - 1];
                        while (i < length) {
                            if (i != i2) {
                                aVarArr2[i < i2 ? i : i - 1] = aVarArr[i];
                            }
                            i++;
                        }
                        su6Var2 = new su6(aVarArr2);
                    }
                    su6Var = su6Var2;
                }
            }
            if (h83Var2 != id4Var.s || su6Var != id4Var.l) {
                id4.a aVarA = id4Var.a();
                aVarA.r = h83Var2;
                aVarA.k = su6Var;
                id4Var = new id4(aVarA);
            }
            return super.n(id4Var);
        }
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [mz4] */
    public pz4(String str, int i, cz4.a aVar, wy4 wy4Var, Map map, ki kiVar, long j, id4 id4Var, k83 k83Var, j83.a aVar2, qb6 qb6Var, jq6.a aVar3, int i2, em8 em8Var) {
        this.t = str;
        this.u = i;
        this.v = aVar;
        this.w = wy4Var;
        this.M = map;
        this.x = kiVar;
        this.y = id4Var;
        this.z = k83Var;
        this.A = aVar2;
        this.B = qb6Var;
        this.D = aVar3;
        this.E = i2;
        this.C = em8Var != null ? new yb6(em8Var) : new yb6("Loader:HlsSampleStreamWrapper");
        wy4.b bVar = new wy4.b();
        bVar.a = null;
        bVar.b = false;
        bVar.c = null;
        this.F = bVar;
        this.P = new int[0];
        Set<Integer> set = s0;
        this.Q = new HashSet(set.size());
        this.R = new SparseIntArray(set.size());
        this.O = new b[0];
        this.h0 = new boolean[0];
        this.g0 = new boolean[0];
        ArrayList<zy4> arrayList = new ArrayList<>();
        this.G = arrayList;
        this.H = Collections.unmodifiableList(arrayList);
        this.L = new ArrayList<>();
        this.I = new Runnable() { // from class: mz4
            @Override // java.lang.Runnable
            public final void run() {
                this.t.F();
            }
        };
        this.J = new at(1, this);
        this.K = n6b.p(null);
        this.i0 = j;
        this.j0 = j;
        this.n0 = Long.MIN_VALUE;
    }

    public static id4 A(id4 id4Var, id4 id4Var2, boolean z) {
        String strB;
        if (id4Var == null) {
            return id4Var2;
        }
        String str = id4Var.k;
        String strD = id4Var2.o;
        int iH = fv6.h(strD);
        if (n6b.t(iH, str) == 1) {
            strB = n6b.u(iH, str);
            strD = fv6.d(strB);
        } else {
            strB = fv6.b(str, strD);
        }
        id4.a aVarA = id4Var2.a();
        aVarA.a = id4Var.a;
        aVarA.b = id4Var.b;
        aVarA.c = k95.q(id4Var.c);
        aVarA.d = id4Var.d;
        aVarA.e = id4Var.e;
        aVarA.f = id4Var.f;
        aVarA.h = z ? id4Var.h : -1;
        aVarA.i = z ? id4Var.i : -1;
        aVarA.j = strB;
        if (iH == 2) {
            aVarA.u = id4Var.v;
            aVarA.v = id4Var.w;
            aVarA.y = id4Var.z;
        }
        if (strD != null) {
            aVarA.n = fv6.n(strD);
        }
        int i = id4Var.G;
        if (i != -1 && iH == 1) {
            aVarA.F = i;
        }
        su6 su6VarB = id4Var.l;
        if (su6VarB != null) {
            su6 su6Var = id4Var2.l;
            if (su6Var != null) {
                su6VarB = su6Var.b(su6VarB);
            }
            aVarA.k = su6VarB;
        }
        return new id4(aVarA);
    }

    public static int D(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public static g13 y(int i, int i2) {
        md6.g("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new g13();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    public final void B(int i) {
        ArrayList<zy4> arrayList;
        uz8.a aVar;
        uz8.a aVar2;
        boolean z = true;
        xl7.r(!this.C.b());
        int i2 = i;
        while (true) {
            arrayList = this.G;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            } else if (x(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        long j = C().h;
        zy4 zy4Var = arrayList.get(i2);
        int size = arrayList.size();
        String str = n6b.a;
        if (i2 < 0 || size > arrayList.size() || i2 > size) {
            zn3.b();
            return;
        }
        if (i2 != size) {
            arrayList.subList(i2, size).clear();
        }
        int i3 = 0;
        while (i3 < this.O.length) {
            int iE = zy4Var.e(i3);
            b bVar = this.O[i3];
            uz8 uz8Var = bVar.a;
            long jK = bVar.k(iE);
            int i4 = uz8Var.b;
            ki kiVar = uz8Var.a;
            xl7.g(jK <= uz8Var.g ? z : false);
            uz8Var.g = jK;
            if (jK != 0) {
                uz8.a aVar3 = uz8Var.d;
                if (jK == aVar3.a) {
                    aVar = uz8Var.d;
                    if (aVar.c != null) {
                        kiVar.a(aVar);
                        aVar.c = null;
                        aVar.d = null;
                    }
                    uz8.a aVar4 = new uz8.a(i4, uz8Var.g);
                    uz8Var.d = aVar4;
                    uz8Var.e = aVar4;
                    uz8Var.f = aVar4;
                } else {
                    while (true) {
                        long j2 = uz8Var.g;
                        long j3 = aVar3.b;
                        aVar2 = aVar3.d;
                        if (j2 <= j3) {
                            break;
                        } else {
                            aVar3 = aVar2;
                        }
                    }
                    aVar2.getClass();
                    if (aVar2.c != null) {
                        kiVar.a(aVar2);
                        aVar2.c = null;
                        aVar2.d = null;
                    }
                    uz8.a aVar5 = new uz8.a(i4, aVar3.b);
                    aVar3.d = aVar5;
                    if (uz8Var.g == aVar3.b) {
                        aVar3 = aVar5;
                    }
                    uz8Var.f = aVar3;
                    if (uz8Var.e == aVar2) {
                        uz8Var.e = aVar5;
                    }
                }
            } else {
                aVar = uz8Var.d;
                if (aVar.c != null) {
                    kiVar.a(aVar);
                    aVar.c = null;
                    aVar.d = null;
                }
                uz8.a aVar6 = new uz8.a(i4, uz8Var.g);
                uz8Var.d = aVar6;
                uz8Var.e = aVar6;
                uz8Var.f = aVar6;
            }
            i3++;
            z = true;
        }
        if (arrayList.isEmpty()) {
            this.j0 = this.i0;
        } else {
            ((zy4) nr1.b(arrayList)).J = true;
        }
        this.m0 = false;
        mp6 mp6Var = new mp6(1, this.T, null, 3, null, n6b.Z(zy4Var.g), n6b.Z(j));
        jq6.a aVar7 = this.D;
        bq6.b bVar2 = aVar7.b;
        bVar2.getClass();
        aVar7.a(new hq6(aVar7, bVar2, mp6Var));
    }

    public final zy4 C() {
        return (zy4) p51.b(1, this.G);
    }

    public final boolean E() {
        return this.j0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        int i;
        if (!this.a0 && this.d0 == null && this.V) {
            int i2 = 0;
            for (b bVar : this.O) {
                if (bVar.s() == null) {
                    return;
                }
            }
            gsa gsaVar = this.b0;
            if (gsaVar != null) {
                int i3 = gsaVar.a;
                int[] iArr = new int[i3];
                this.d0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        b[] bVarArr = this.O;
                        if (i5 >= bVarArr.length) {
                            break;
                        }
                        id4 id4VarS = bVarArr[i5].s();
                        id4VarS.getClass();
                        id4 id4Var = this.b0.a(i4).d[0];
                        String str = id4VarS.o;
                        String str2 = id4Var.o;
                        int iH = fv6.h(str);
                        if (iH != 3) {
                            if (iH == fv6.h(str2)) {
                                this.d0[i4] = i5;
                                break;
                            }
                            i5++;
                        } else {
                            if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || id4VarS.L == id4Var.L)) {
                                this.d0[i4] = i5;
                                break;
                                break;
                            }
                            i5++;
                        }
                    }
                }
                ArrayList<lz4> arrayList = this.L;
                int size = arrayList.size();
                while (i2 < size) {
                    lz4 lz4Var = arrayList.get(i2);
                    i2++;
                    lz4Var.e();
                }
                return;
            }
            int length = this.O.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                int i9 = 1;
                if (i6 >= length) {
                    break;
                }
                id4 id4VarS2 = this.O[i6].s();
                id4VarS2.getClass();
                String str3 = id4VarS2.o;
                if (fv6.m(str3)) {
                    i9 = 2;
                } else if (!fv6.i(str3)) {
                    i9 = fv6.l(str3) ? 3 : -2;
                }
                if (D(i9) > D(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            esa esaVar = this.w.h;
            int i10 = esaVar.a;
            this.e0 = -1;
            this.d0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.d0[i11] = i11;
            }
            esa[] esaVarArr = new esa[length];
            int i12 = 0;
            while (i12 < length) {
                id4 id4VarS3 = this.O[i12].s();
                id4VarS3.getClass();
                id4 id4Var2 = this.y;
                String str4 = this.t;
                if (i12 == i7) {
                    id4[] id4VarArr = new id4[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        id4 id4VarD = esaVar.d[i13];
                        if (i8 == 1 && id4Var2 != null) {
                            id4VarD = id4VarD.d(id4Var2);
                        }
                        id4VarArr[i13] = i10 == 1 ? id4VarS3.d(id4VarD) : A(id4VarD, id4VarS3, true);
                    }
                    esaVarArr[i12] = new esa(str4, id4VarArr);
                    this.e0 = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !fv6.i(id4VarS3.o)) {
                        id4Var2 = null;
                    }
                    StringBuilder sbB = tn2.b(str4, ":muxed:");
                    sbB.append(i12 < i7 ? i12 : i12 - 1);
                    String string = sbB.toString();
                    i = 0;
                    id4.a aVarA = A(id4Var2, id4VarS3, false).a();
                    aVarA.l = str4;
                    esaVarArr[i12] = new esa(string, new id4(aVarA));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.b0 = z(esaVarArr);
            xl7.r(this.c0 == null ? 1 : i14);
            this.c0 = Collections.EMPTY_SET;
            this.W = true;
            this.v.c();
        }
    }

    public final void G() {
        yb6 yb6Var = this.C;
        IOException iOException = yb6Var.c;
        if (iOException != null) {
            throw iOException;
        }
        yb6.c<? extends yb6.d> cVar = yb6Var.b;
        if (cVar != null) {
            int i = cVar.t;
            IOException iOException2 = cVar.x;
            if (iOException2 != null && cVar.y > i) {
                throw iOException2;
            }
        }
        wy4 wy4Var = this.w;
        un0 un0Var = wy4Var.n;
        if (un0Var != null) {
            throw un0Var;
        }
        Uri uri = wy4Var.o;
        if (uri == null || !uri.equals(wy4Var.p)) {
            return;
        }
        wy4Var.g.f(wy4Var.o);
    }

    public final void H(esa[] esaVarArr, int... iArr) {
        this.b0 = z(esaVarArr);
        this.c0 = new HashSet();
        for (int i : iArr) {
            this.c0.add(this.b0.a(i));
        }
        this.e0 = 0;
        final cz4.a aVar = this.v;
        this.K.post(new Runnable() { // from class: oz4
            @Override // java.lang.Runnable
            public final void run() {
                aVar.c();
            }
        });
        this.W = true;
    }

    public final void I() {
        for (b bVar : this.O) {
            bVar.y(this.k0);
        }
        this.k0 = false;
    }

    public final boolean J(long j, boolean z) throws Throwable {
        zy4 zy4Var;
        boolean zA;
        this.i0 = j;
        if (E()) {
            this.j0 = j;
            return true;
        }
        boolean z2 = this.w.q;
        ArrayList<zy4> arrayList = this.G;
        if (!z2) {
            zy4Var = null;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                zy4Var = null;
                break;
            }
            zy4Var = arrayList.get(i);
            if (zy4Var.g == j) {
                break;
            }
            i++;
        }
        if (this.V && !z && !arrayList.isEmpty()) {
            int length = this.O.length;
            for (int i2 = 0; i2 < length; i2++) {
                b bVar = this.O[i2];
                if (zy4Var != null) {
                    zA = bVar.z(zy4Var.e(i2));
                } else {
                    long jE = e();
                    zA = bVar.A(j, jE == Long.MIN_VALUE || j < jE);
                }
                if (zA || (!this.h0[i2] && this.f0)) {
                }
            }
            return false;
        }
        this.j0 = j;
        this.m0 = false;
        arrayList.clear();
        yb6 yb6Var = this.C;
        if (!yb6Var.b()) {
            yb6Var.c = null;
            I();
            return true;
        }
        if (this.V) {
            for (b bVar2 : this.O) {
                bVar2.j();
            }
        }
        yb6Var.a();
        return true;
    }

    @Override // yb6.e
    public final void a() {
        for (b bVar : this.O) {
            bVar.y(true);
            i83 i83Var = bVar.h;
            if (i83Var != null) {
                i83Var.c(bVar.e);
                bVar.h = null;
                bVar.g = null;
            }
        }
    }

    @Override // yb6.a
    public final void b(yb6.d dVar, long j, long j2, boolean z) {
        vc1 vc1Var = (vc1) dVar;
        this.N = null;
        long j3 = vc1Var.a;
        of2 of2Var = vc1Var.b;
        c1a c1aVar = vc1Var.i;
        rb6 rb6Var = new rb6(of2Var, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
        this.B.getClass();
        this.D.b(rb6Var, vc1Var.c, this.u, vc1Var.d, vc1Var.e, vc1Var.f, vc1Var.g, vc1Var.h);
        if (z) {
            return;
        }
        if (E() || this.X == 0) {
            I();
        }
        if (this.X > 0) {
            this.v.b(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x022f  */
    /* JADX WARN: Code duplicated, block: B:111:0x023f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0248  */
    /* JADX WARN: Code duplicated, block: B:114:0x024e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0252  */
    /* JADX WARN: Code duplicated, block: B:117:0x025a  */
    /* JADX WARN: Code duplicated, block: B:119:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0283  */
    /* JADX WARN: Code duplicated, block: B:127:0x0297  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:146:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:169:0x0302 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x0304  */
    /* JADX WARN: Code duplicated, block: B:173:0x0327  */
    /* JADX WARN: Code duplicated, block: B:174:0x0332  */
    /* JADX WARN: Code duplicated, block: B:176:0x0344  */
    /* JADX WARN: Code duplicated, block: B:177:0x0346  */
    /* JADX WARN: Code duplicated, block: B:180:0x036b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0370  */
    /* JADX WARN: Code duplicated, block: B:184:0x0386  */
    /* JADX WARN: Code duplicated, block: B:185:0x0389  */
    /* JADX WARN: Code duplicated, block: B:187:0x038d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0397  */
    /* JADX WARN: Code duplicated, block: B:190:0x039a  */
    /* JADX WARN: Code duplicated, block: B:191:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:194:0x03ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:196:0x03af  */
    /* JADX WARN: Code duplicated, block: B:198:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:199:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:202:0x03df  */
    /* JADX WARN: Code duplicated, block: B:203:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:205:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:208:0x0405  */
    /* JADX WARN: Code duplicated, block: B:210:0x0409 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x0422  */
    /* JADX WARN: Code duplicated, block: B:221:0x042b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0431  */
    /* JADX WARN: Code duplicated, block: B:227:0x0438 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x0447  */
    /* JADX WARN: Code duplicated, block: B:236:0x0450  */
    /* JADX WARN: Code duplicated, block: B:239:0x0476  */
    /* JADX WARN: Code duplicated, block: B:243:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:245:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:247:0x04b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:250:0x04c4 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:253:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:255:0x04d5 A[EDGE_INSN: B:255:0x04d5->B:274:0x0525 BREAK  A[LOOP:3: B:265:0x04fe->B:273:0x0520], PHI: r70
      0x04d5: PHI (r70v9 java.util.ArrayList<zy4>) = 
      (r70v6 java.util.ArrayList<zy4>)
      (r70v6 java.util.ArrayList<zy4>)
      (r70v6 java.util.ArrayList<zy4>)
      (r70v7 java.util.ArrayList<zy4>)
     binds: [B:254:0x04d3, B:261:0x04f2, B:263:0x04f6, B:294:0x04d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:256:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:258:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:259:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:262:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:276:0x0542 A[LOOP:1: B:275:0x0540->B:276:0x0542, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x0561  */
    /* JADX WARN: Code duplicated, block: B:281:0x056f  */
    /* JADX WARN: Code duplicated, block: B:293:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0121  */
    /* JADX WARN: Code duplicated, block: B:71:0x0135  */
    /* JADX WARN: Code duplicated, block: B:73:0x0138  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:78:0x0167  */
    /* JADX WARN: Code duplicated, block: B:81:0x0175  */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    /* JADX WARN: Code duplicated, block: B:85:0x018d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0190  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.bd9
    public final boolean c(g gVar) {
        long jMax;
        long j;
        long j2;
        long j3;
        List<zy4> list;
        long j4;
        List<zy4> list2;
        long jMax2;
        long j5;
        long j6;
        long jMax3;
        kh4 kh4Var;
        int i;
        long j7;
        kh4 kh4Var2;
        int i2;
        zy4 zy4Var;
        int iQ;
        boolean z;
        Uri uriC;
        dz4 dz4VarR;
        long jK;
        long jK2;
        long jLongValue;
        int iIntValue;
        int iIntValue2;
        int i3;
        dz4 dz4Var;
        wy4.e eVarF;
        String str;
        boolean z2;
        Uri uri;
        long j8;
        wy4.e eVarF2;
        boolean z3;
        dz4.f fVar;
        dz4.e eVar;
        ArrayList<zy4> arrayList;
        long j9;
        Uri uriD;
        wy4.a aVarG;
        wy4.b bVar;
        String str2;
        Uri uriD2;
        wy4.a aVarG2;
        boolean z4;
        boolean z5;
        if2 if2Var;
        kh4 kh4Var3;
        byte[] bArr;
        byte[] bArr2;
        Map map;
        int i4;
        boolean z6;
        byte[] bArrD;
        if2 ceVar;
        dz4.e eVar2;
        of2 of2Var;
        if2 if2Var2;
        boolean z7;
        int i5;
        u65 u65Var;
        pt7 pt7Var;
        az4 az4Var;
        SparseArray<apa> sparseArray;
        apa apaVar;
        of2 of2Var2;
        boolean z8;
        boolean z9;
        az4 az4Var2;
        boolean z10;
        byte[] bArrD2;
        if2 ceVar2;
        String str3;
        boolean z11;
        vc1 vc1Var;
        Uri uri2;
        zy4 zy4Var2;
        ArrayList<zy4> arrayList2;
        k95.a aVar;
        int i6;
        int i7;
        ArrayList<zy4> arrayList3 = this.G;
        wy4.b bVar2 = this.F;
        yb6 yb6Var = this.C;
        if (this.m0 || yb6Var.b()) {
            return false;
        }
        if (yb6Var.c != null) {
            return false;
        }
        long j10 = -9223372036854775807L;
        if (E()) {
            List<zy4> list3 = Collections.EMPTY_LIST;
            long j11 = this.j0;
            for (b bVar3 : this.O) {
                bVar3.t = this.j0;
            }
            list = list3;
            j = -9223372036854775807L;
            j2 = j11;
            j3 = j2;
        } else {
            List<zy4> list4 = this.H;
            zy4 zy4VarC = C();
            boolean z12 = zy4VarC.H;
            long j12 = zy4VarC.g;
            if (z12 && zy4VarC.f()) {
                long j13 = zy4VarC.K;
                jMax = j13 != -9223372036854775807L ? j12 + j13 : -9223372036854775807L;
            } else {
                jMax = Math.max(this.i0, j12);
            }
            long jMax4 = this.i0;
            if (this.V) {
                b[] bVarArr = this.O;
                int length = bVarArr.length;
                int i8 = 0;
                while (i8 < length) {
                    b bVar4 = bVarArr[i8];
                    synchronized (bVar4) {
                        j4 = j10;
                        list2 = list4;
                        jMax2 = Math.max(bVar4.v, bVar4.o(bVar4.s));
                    }
                    jMax4 = Math.max(jMax4, jMax2);
                    i8++;
                    j10 = j4;
                    list4 = list2;
                }
            }
            j = j10;
            j2 = jMax;
            j3 = jMax4;
            list = list4;
        }
        bVar2.a = null;
        bVar2.b = false;
        bVar2.c = null;
        wy4 wy4Var = this.w;
        boolean z13 = this.W || !list.isEmpty();
        kh4 kh4Var4 = wy4Var.j;
        kz4[] kz4VarArr = wy4Var.e;
        jz4 jz4Var = wy4Var.g;
        zy4 zy4Var3 = list.isEmpty() ? null : (zy4) nr1.b(list);
        int iA = zy4Var3 == null ? -1 : wy4Var.h.a(zy4Var3.d);
        List<zy4> list5 = list;
        long j14 = gVar.a;
        long jMax5 = j2 - j14;
        long j15 = wy4Var.s;
        long j16 = j15 != j ? j15 - j14 : j;
        if (zy4Var3 != null && !wy4Var.q) {
            j5 = j16;
            long j17 = zy4Var3.h - zy4Var3.g;
            j6 = j14;
            jMax5 = Math.max(0L, jMax5 - j17);
            if (j5 != j) {
                jMax3 = Math.max(0L, j5 - j17);
            }
            ym6[] ym6VarArrB = wy4Var.b(zy4Var3, j2);
            if (iA != -1) {
                fq3 fq3Var = wy4Var.r;
                kh4Var = kh4Var4;
                i = iA;
                boolean z14 = fq3Var.j(fq3Var.d(iA), SystemClock.elapsedRealtime());
                j7 = j2;
                kh4Var2 = kh4Var;
                i2 = i;
                zy4Var = zy4Var3;
                boolean z15 = z14;
                wy4Var.r.k(j6, jMax5, jMax3, list5, ym6VarArrB);
                iQ = wy4Var.r.q();
                if (i2 != iQ) {
                    z = true;
                } else {
                    z = false;
                }
                uriC = kz4VarArr[iQ].c();
                if (jz4Var.c(uriC)) {
                    dz4VarR = jz4Var.r(true, uriC);
                    dz4VarR.getClass();
                    wy4Var.q = dz4VarR.c;
                    if (dz4VarR.o) {
                        jK = j;
                    } else {
                        jK = (dz4VarR.h + dz4VarR.u) - jz4Var.k();
                    }
                    wy4Var.s = jK;
                    jK2 = dz4VarR.h - jz4Var.k();
                    Pair<Long, Integer> pairE = wy4Var.e(zy4Var, z, dz4VarR, jK2, j7);
                    jLongValue = ((Long) pairE.first).longValue();
                    iIntValue = ((Integer) pairE.second).intValue();
                    if (z || z15 || zy4Var == null || (jLongValue >= dz4VarR.k && ((eVarF = wy4.f(dz4VarR, jLongValue, iIntValue)) == null || jK2 + eVarF.a.x >= j3))) {
                        iIntValue2 = iIntValue;
                        dz4Var = dz4VarR;
                        i3 = iQ;
                    } else {
                        uriC = kz4VarArr[i2].c();
                        dz4 dz4VarR2 = jz4Var.r(true, uriC);
                        dz4VarR2.getClass();
                        jK2 = dz4VarR2.h - jz4Var.k();
                        Pair<Long, Integer> pairE2 = wy4Var.e(zy4Var, false, dz4VarR2, jK2, j7);
                        jLongValue = ((Long) pairE2.first).longValue();
                        iIntValue2 = ((Integer) pairE2.second).intValue();
                        i3 = i2;
                        dz4Var = dz4VarR2;
                    }
                    str = dz4Var.a;
                    z2 = dz4Var.c;
                    uri = uriC;
                    j8 = dz4Var.k;
                    k95 k95Var = dz4Var.r;
                    if (i3 != i2 && i2 != -1) {
                        jz4Var.e(kz4VarArr[i2].c());
                    }
                    if (jLongValue < j8) {
                        eVarF2 = wy4.f(dz4Var, jLongValue, iIntValue2);
                        if (eVarF2 != null) {
                            if (!dz4Var.o) {
                                bVar2.c = uri;
                                r19.p = uri;
                            } else if (!z13 || k95Var.isEmpty()) {
                                bVar2.b = true;
                            } else {
                                eVarF2 = new wy4.e((dz4.f) nr1.b(k95Var), (j8 + ((long) k95Var.size())) - 1, -1);
                            }
                        }
                        z3 = eVarF2.d;
                        fVar = eVarF2.a;
                        r19.p = null;
                        SystemClock.elapsedRealtime();
                        eVar = fVar.u;
                        arrayList = arrayList3;
                        j9 = fVar.x;
                        if (eVar != null || (str3 = eVar.z) == null) {
                            uriD = null;
                        } else {
                            uriD = a5b.d(dz4Var.a, str3);
                        }
                        aVarG = r19.g(uriD, i3, true);
                        bVar2.a = aVarG;
                        if (aVarG == null) {
                            str2 = fVar.z;
                            if (str2 == null) {
                                uriD2 = null;
                            } else {
                                uriD2 = a5b.d(dz4Var.a, str2);
                            }
                            aVarG2 = r19.g(uriD2, i3, false);
                            bVar2.a = aVarG2;
                            if (aVarG2 == null) {
                                if (fVar instanceof dz4.c) {
                                    z4 = z2;
                                } else if (!((dz4.c) fVar).E || (eVarF2.c == 0 && z2)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (zy4Var == 0) {
                                    AtomicInteger atomicInteger = zy4.M;
                                } else {
                                    if (uri.equals(zy4Var.m) || !zy4Var.H) {
                                        z5 = z4 || jK2 + j9 < j7;
                                    }
                                    if (z5 || !z3) {
                                        yy4 yy4Var = r19.a;
                                        if2Var = r19.b;
                                        id4 id4Var = r19.f[i3];
                                        List<id4> list6 = r19.i;
                                        int iS = r19.r.s();
                                        Object objV = r19.r.v();
                                        boolean z16 = r19.l;
                                        bpa bpaVar = r19.d;
                                        if (uriD2 == null) {
                                            kh4Var2.getClass();
                                            bArr = null;
                                            kh4Var3 = kh4Var2;
                                        } else {
                                            kh4Var3 = kh4Var2;
                                            bArr = ((jh4) kh4Var3.a).get(uriD2);
                                        }
                                        if (uriD == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = ((jh4) kh4Var3.a).get(uriD);
                                        }
                                        x38 x38Var = r19.k;
                                        AtomicInteger atomicInteger2 = zy4.M;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriD3 = a5b.d(str, fVar.t);
                                        long j18 = fVar.B;
                                        long j19 = fVar.C;
                                        if (z3 != 0) {
                                            i4 = 8;
                                        } else {
                                            i4 = 0;
                                        }
                                        xl7.n(uriD3, "The uri must be set.");
                                        of2 of2Var3 = new of2(uriD3, 1, null, map, j18, j19, i4);
                                        if (bArr != null) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (z6) {
                                            String str4 = fVar.A;
                                            str4.getClass();
                                            bArrD = zy4.d(str4);
                                        } else {
                                            bArrD = null;
                                        }
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            ceVar = new ce(if2Var, bArr, bArrD);
                                        } else {
                                            ceVar = if2Var;
                                        }
                                        eVar2 = fVar.u;
                                        if (eVar2 != null) {
                                            if (bArr2 != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                String str5 = eVar2.A;
                                                str5.getClass();
                                                bArrD2 = zy4.d(str5);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            Uri uriD4 = a5b.d(str, eVar2.t);
                                            long j20 = eVar2.B;
                                            long j21 = eVar2.C;
                                            xl7.n(uriD4, "The uri must be set.");
                                            of2 of2Var4 = new of2(uriD4, 1, null, map, j20, j21, 0);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                ceVar2 = new ce(if2Var, bArr2, bArrD2);
                                            } else {
                                                ceVar2 = if2Var;
                                            }
                                            z7 = z10;
                                            if2Var2 = ceVar2;
                                            of2Var = of2Var4;
                                        } else {
                                            of2Var = null;
                                            if2Var2 = null;
                                            z7 = false;
                                        }
                                        long j22 = jK2 + j9;
                                        long j23 = j22 + fVar.v;
                                        i5 = dz4Var.j + fVar.w;
                                        if (zy4Var != 0) {
                                            of2Var2 = zy4Var.q;
                                            if (of2Var != of2Var2 || (of2Var != null && of2Var2 != null && of2Var.a.equals(of2Var2.a) && of2Var.e == of2Var2.e)) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            if (uri.equals(zy4Var.m) || !zy4Var.H) {
                                                z9 = false;
                                            } else {
                                                z9 = true;
                                            }
                                            u65Var = zy4Var.y;
                                            pt7Var = zy4Var.z;
                                            if (z8 || !z9 || zy4Var.J || zy4Var.l != i5) {
                                                az4Var2 = null;
                                            } else {
                                                az4Var2 = zy4Var.C;
                                            }
                                            az4Var = az4Var2;
                                        } else {
                                            u65Var = new u65(null);
                                            pt7Var = new pt7(10);
                                            az4Var = null;
                                        }
                                        u65 u65Var2 = u65Var;
                                        pt7 pt7Var2 = pt7Var;
                                        long j24 = eVarF2.b;
                                        int i9 = eVarF2.c;
                                        boolean z17 = !z3;
                                        boolean z18 = fVar.D;
                                        sparseArray = bpaVar.a;
                                        apaVar = sparseArray.get(i5);
                                        if (apaVar == null) {
                                            apaVar = new apa(9223372036854775806L);
                                            sparseArray.put(i5, apaVar);
                                        }
                                        zy4 zy4Var4 = new zy4(yy4Var, ceVar, of2Var3, id4Var, z6, if2Var2, of2Var, z7, uri, list6, iS, objV, j22, j23, j24, i9, z17, i5, z18, z16, apaVar, fVar.y, az4Var, u65Var2, pt7Var2, z5, z4, x38Var);
                                        bVar = bVar2;
                                        bVar.a = zy4Var4;
                                    } else {
                                        bVar = bVar2;
                                        arrayList = arrayList;
                                    }
                                }
                                if (z5) {
                                }
                                yy4 yy4Var2 = r19.a;
                                if2Var = r19.b;
                                id4 id4Var2 = r19.f[i3];
                                List<id4> list7 = r19.i;
                                int iS2 = r19.r.s();
                                Object objV2 = r19.r.v();
                                boolean z19 = r19.l;
                                bpa bpaVar2 = r19.d;
                                if (uriD2 == null) {
                                    kh4Var2.getClass();
                                    bArr = null;
                                    kh4Var3 = kh4Var2;
                                } else {
                                    kh4Var3 = kh4Var2;
                                    bArr = ((jh4) kh4Var3.a).get(uriD2);
                                }
                                if (uriD == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = ((jh4) kh4Var3.a).get(uriD);
                                }
                                x38 x38Var2 = r19.k;
                                AtomicInteger atomicInteger3 = zy4.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriD5 = a5b.d(str, fVar.t);
                                long j110 = fVar.B;
                                long j111 = fVar.C;
                                if (z3 != 0) {
                                    i4 = 8;
                                } else {
                                    i4 = 0;
                                }
                                xl7.n(uriD5, "The uri must be set.");
                                of2 of2Var5 = new of2(uriD5, 1, null, map, j110, j111, i4);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str6 = fVar.A;
                                    str6.getClass();
                                    bArrD = zy4.d(str6);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    ceVar = new ce(if2Var, bArr, bArrD);
                                } else {
                                    ceVar = if2Var;
                                }
                                eVar2 = fVar.u;
                                if (eVar2 != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str7 = eVar2.A;
                                        str7.getClass();
                                        bArrD2 = zy4.d(str7);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriD6 = a5b.d(str, eVar2.t);
                                    long j25 = eVar2.B;
                                    long j26 = eVar2.C;
                                    xl7.n(uriD6, "The uri must be set.");
                                    of2 of2Var6 = new of2(uriD6, 1, null, map, j25, j26, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        ceVar2 = new ce(if2Var, bArr2, bArrD2);
                                    } else {
                                        ceVar2 = if2Var;
                                    }
                                    z7 = z10;
                                    if2Var2 = ceVar2;
                                    of2Var = of2Var6;
                                } else {
                                    of2Var = null;
                                    if2Var2 = null;
                                    z7 = false;
                                }
                                long j27 = jK2 + j9;
                                long j28 = j27 + fVar.v;
                                i5 = dz4Var.j + fVar.w;
                                if (zy4Var != 0) {
                                    of2Var2 = zy4Var.q;
                                    if (of2Var != of2Var2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uri.equals(zy4Var.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    u65Var = zy4Var.y;
                                    pt7Var = zy4Var.z;
                                    if (z8) {
                                        az4Var2 = null;
                                    } else {
                                        az4Var2 = null;
                                    }
                                    az4Var = az4Var2;
                                } else {
                                    u65Var = new u65(null);
                                    pt7Var = new pt7(10);
                                    az4Var = null;
                                }
                                u65 u65Var3 = u65Var;
                                pt7 pt7Var3 = pt7Var;
                                long j29 = eVarF2.b;
                                int i10 = eVarF2.c;
                                boolean z110 = !z3;
                                boolean z111 = fVar.D;
                                sparseArray = bpaVar2.a;
                                apaVar = sparseArray.get(i5);
                                if (apaVar == null) {
                                    apaVar = new apa(9223372036854775806L);
                                    sparseArray.put(i5, apaVar);
                                }
                                zy4 zy4Var5 = new zy4(yy4Var2, ceVar, of2Var5, id4Var2, z6, if2Var2, of2Var, z7, uri, list7, iS2, objV2, j27, j28, j29, i10, z110, i5, z111, z19, apaVar, fVar.y, az4Var, u65Var3, pt7Var3, z5, z4, x38Var2);
                                bVar = bVar2;
                                bVar.a = zy4Var5;
                            } else {
                                bVar = bVar2;
                                arrayList = arrayList;
                            }
                        } else {
                            bVar = bVar2;
                            arrayList = arrayList;
                        }
                        z11 = bVar.b;
                        vc1Var = bVar.a;
                        uri2 = bVar.c;
                        if (z11) {
                            this.j0 = j;
                            this.m0 = true;
                            return true;
                        }
                        if (vc1Var == null) {
                            if (uri2 != null) {
                                return false;
                            }
                            cz4.this.u.p(uri2);
                            return false;
                        }
                        if (vc1Var instanceof zy4) {
                            zy4Var2 = (zy4) vc1Var;
                            if (!arrayList.isEmpty()) {
                                arrayList2 = arrayList;
                                break;
                            }
                            if (!C().f()) {
                                B(arrayList.size() - 1);
                            }
                            if (!zy4Var2.n || !zy4Var2.L) {
                                arrayList2 = arrayList;
                                break;
                            }
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    arrayList2 = arrayList;
                                    break;
                                }
                                arrayList2 = arrayList;
                                long j30 = arrayList2.get(size).g;
                                long j31 = zy4Var2.g;
                                if (j30 < j31) {
                                    break;
                                }
                                if (j30 == j31 && x(size)) {
                                    B(size);
                                    zy4Var2.L = false;
                                    break;
                                }
                                size--;
                                arrayList = arrayList2;
                            }
                            this.r0 = zy4Var2;
                            this.Y = zy4Var2.d;
                            this.j0 = -9223372036854775807L;
                            arrayList2.add(zy4Var2);
                            k95.b bVar5 = k95.u;
                            aVar = new k95.a();
                            for (b bVar6 : this.O) {
                                aVar.c(Integer.valueOf(bVar6.q + bVar6.p));
                            }
                            ul8 ul8VarG = aVar.g();
                            zy4Var2.D = this;
                            zy4Var2.I = ul8VarG;
                            for (b bVar7 : this.O) {
                                bVar7.getClass();
                                bVar7.E = zy4Var2.k;
                                if (zy4Var2.L) {
                                    bVar7.I = true;
                                }
                            }
                        }
                        this.N = vc1Var;
                        yb6Var.d(vc1Var, this, this.B.c(vc1Var.c));
                        return true;
                    }
                    wy4Var.n = new un0();
                } else {
                    bVar2.c = uriC;
                    wy4Var.p = uriC;
                }
                arrayList = arrayList3;
                bVar = bVar2;
                z11 = bVar.b;
                vc1Var = bVar.a;
                uri2 = bVar.c;
                if (z11) {
                    this.j0 = j;
                    this.m0 = true;
                    return true;
                }
                if (vc1Var == null) {
                    if (uri2 != null) {
                        return false;
                    }
                    cz4.this.u.p(uri2);
                    return false;
                }
                if (vc1Var instanceof zy4) {
                    zy4Var2 = (zy4) vc1Var;
                    if (!arrayList.isEmpty()) {
                        arrayList2 = arrayList;
                        break;
                    }
                    if (!C().f()) {
                        B(arrayList.size() - 1);
                    }
                    if (!zy4Var2.n) {
                        arrayList2 = arrayList;
                        break;
                    }
                    arrayList2 = arrayList;
                    break;
                    this.r0 = zy4Var2;
                    this.Y = zy4Var2.d;
                    this.j0 = -9223372036854775807L;
                    arrayList2.add(zy4Var2);
                    k95.b bVar8 = k95.u;
                    aVar = new k95.a();
                    while (i6 < r5) {
                        aVar.c(Integer.valueOf(bVar6.q + bVar6.p));
                    }
                    ul8 ul8VarG2 = aVar.g();
                    zy4Var2.D = this;
                    zy4Var2.I = ul8VarG2;
                    while (i7 < r4) {
                        bVar7.getClass();
                        bVar7.E = zy4Var2.k;
                        if (zy4Var2.L) {
                            bVar7.I = true;
                        }
                    }
                }
                this.N = vc1Var;
                yb6Var.d(vc1Var, this, this.B.c(vc1Var.c));
                return true;
            }
            kh4Var = kh4Var4;
            i = iA;
            j7 = j2;
            kh4Var2 = kh4Var;
            i2 = i;
            zy4Var = zy4Var3;
            boolean z112 = z14;
            wy4Var.r.k(j6, jMax5, jMax3, list5, ym6VarArrB);
            iQ = wy4Var.r.q();
            if (i2 != iQ) {
                z = true;
            } else {
                z = false;
            }
            uriC = kz4VarArr[iQ].c();
            if (jz4Var.c(uriC)) {
                bVar2.c = uriC;
                wy4Var.p = uriC;
            } else {
                dz4VarR = jz4Var.r(true, uriC);
                dz4VarR.getClass();
                wy4Var.q = dz4VarR.c;
                if (dz4VarR.o) {
                    jK = j;
                } else {
                    jK = (dz4VarR.h + dz4VarR.u) - jz4Var.k();
                }
                wy4Var.s = jK;
                jK2 = dz4VarR.h - jz4Var.k();
                Pair<Long, Integer> pairE3 = wy4Var.e(zy4Var, z, dz4VarR, jK2, j7);
                jLongValue = ((Long) pairE3.first).longValue();
                iIntValue = ((Integer) pairE3.second).intValue();
                if (z) {
                    iIntValue2 = iIntValue;
                    dz4Var = dz4VarR;
                    i3 = iQ;
                } else {
                    uriC = kz4VarArr[i2].c();
                    dz4 dz4VarR3 = jz4Var.r(true, uriC);
                    dz4VarR3.getClass();
                    jK2 = dz4VarR3.h - jz4Var.k();
                    Pair<Long, Integer> pairE4 = wy4Var.e(zy4Var, false, dz4VarR3, jK2, j7);
                    jLongValue = ((Long) pairE4.first).longValue();
                    iIntValue2 = ((Integer) pairE4.second).intValue();
                    i3 = i2;
                    dz4Var = dz4VarR3;
                }
                str = dz4Var.a;
                z2 = dz4Var.c;
                uri = uriC;
                j8 = dz4Var.k;
                k95 k95Var2 = dz4Var.r;
                if (i3 != i2) {
                    jz4Var.e(kz4VarArr[i2].c());
                }
                if (jLongValue < j8) {
                    eVarF2 = wy4.f(dz4Var, jLongValue, iIntValue2);
                    if (eVarF2 != null) {
                        if (!dz4Var.o) {
                            bVar2.c = uri;
                            r19.p = uri;
                        } else {
                            if (z13) {
                            }
                            bVar2.b = true;
                        }
                    }
                    z3 = eVarF2.d;
                    fVar = eVarF2.a;
                    r19.p = null;
                    SystemClock.elapsedRealtime();
                    eVar = fVar.u;
                    arrayList = arrayList3;
                    j9 = fVar.x;
                    if (eVar != null) {
                        uriD = null;
                    } else {
                        uriD = null;
                    }
                    aVarG = r19.g(uriD, i3, true);
                    bVar2.a = aVarG;
                    if (aVarG == null) {
                        str2 = fVar.z;
                        if (str2 == null) {
                            uriD2 = null;
                        } else {
                            uriD2 = a5b.d(dz4Var.a, str2);
                        }
                        aVarG2 = r19.g(uriD2, i3, false);
                        bVar2.a = aVarG2;
                        if (aVarG2 == null) {
                            if (fVar instanceof dz4.c) {
                                z4 = z2;
                            } else if (((dz4.c) fVar).E) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (zy4Var == 0) {
                                AtomicInteger atomicInteger4 = zy4.M;
                            } else {
                                if (uri.equals(zy4Var.m)) {
                                    if (z4) {
                                    }
                                } else if (z4) {
                                }
                                if (z5) {
                                }
                                yy4 yy4Var3 = r19.a;
                                if2Var = r19.b;
                                id4 id4Var3 = r19.f[i3];
                                List<id4> list8 = r19.i;
                                int iS3 = r19.r.s();
                                Object objV3 = r19.r.v();
                                boolean z113 = r19.l;
                                bpa bpaVar3 = r19.d;
                                if (uriD2 == null) {
                                    kh4Var2.getClass();
                                    bArr = null;
                                    kh4Var3 = kh4Var2;
                                } else {
                                    kh4Var3 = kh4Var2;
                                    bArr = ((jh4) kh4Var3.a).get(uriD2);
                                }
                                if (uriD == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = ((jh4) kh4Var3.a).get(uriD);
                                }
                                x38 x38Var3 = r19.k;
                                AtomicInteger atomicInteger5 = zy4.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriD7 = a5b.d(str, fVar.t);
                                long j112 = fVar.B;
                                long j113 = fVar.C;
                                if (z3 != 0) {
                                    i4 = 8;
                                } else {
                                    i4 = 0;
                                }
                                xl7.n(uriD7, "The uri must be set.");
                                of2 of2Var7 = new of2(uriD7, 1, null, map, j112, j113, i4);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str8 = fVar.A;
                                    str8.getClass();
                                    bArrD = zy4.d(str8);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    ceVar = new ce(if2Var, bArr, bArrD);
                                } else {
                                    ceVar = if2Var;
                                }
                                eVar2 = fVar.u;
                                if (eVar2 != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str9 = eVar2.A;
                                        str9.getClass();
                                        bArrD2 = zy4.d(str9);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriD8 = a5b.d(str, eVar2.t);
                                    long j210 = eVar2.B;
                                    long j211 = eVar2.C;
                                    xl7.n(uriD8, "The uri must be set.");
                                    of2 of2Var8 = new of2(uriD8, 1, null, map, j210, j211, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        ceVar2 = new ce(if2Var, bArr2, bArrD2);
                                    } else {
                                        ceVar2 = if2Var;
                                    }
                                    z7 = z10;
                                    if2Var2 = ceVar2;
                                    of2Var = of2Var8;
                                } else {
                                    of2Var = null;
                                    if2Var2 = null;
                                    z7 = false;
                                }
                                long j212 = jK2 + j9;
                                long j213 = j212 + fVar.v;
                                i5 = dz4Var.j + fVar.w;
                                if (zy4Var != 0) {
                                    of2Var2 = zy4Var.q;
                                    if (of2Var != of2Var2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uri.equals(zy4Var.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    u65Var = zy4Var.y;
                                    pt7Var = zy4Var.z;
                                    if (z8) {
                                        az4Var2 = null;
                                    } else {
                                        az4Var2 = null;
                                    }
                                    az4Var = az4Var2;
                                } else {
                                    u65Var = new u65(null);
                                    pt7Var = new pt7(10);
                                    az4Var = null;
                                }
                                u65 u65Var4 = u65Var;
                                pt7 pt7Var4 = pt7Var;
                                long j214 = eVarF2.b;
                                int i11 = eVarF2.c;
                                boolean z114 = !z3;
                                boolean z115 = fVar.D;
                                sparseArray = bpaVar3.a;
                                apaVar = sparseArray.get(i5);
                                if (apaVar == null) {
                                    apaVar = new apa(9223372036854775806L);
                                    sparseArray.put(i5, apaVar);
                                }
                                zy4 zy4Var6 = new zy4(yy4Var3, ceVar, of2Var7, id4Var3, z6, if2Var2, of2Var, z7, uri, list8, iS3, objV3, j212, j213, j214, i11, z114, i5, z115, z113, apaVar, fVar.y, az4Var, u65Var4, pt7Var4, z5, z4, x38Var3);
                                bVar = bVar2;
                                bVar.a = zy4Var6;
                            }
                            if (z5) {
                            }
                            yy4 yy4Var4 = r19.a;
                            if2Var = r19.b;
                            id4 id4Var4 = r19.f[i3];
                            List<id4> list9 = r19.i;
                            int iS4 = r19.r.s();
                            Object objV4 = r19.r.v();
                            boolean z116 = r19.l;
                            bpa bpaVar4 = r19.d;
                            if (uriD2 == null) {
                                kh4Var2.getClass();
                                bArr = null;
                                kh4Var3 = kh4Var2;
                            } else {
                                kh4Var3 = kh4Var2;
                                bArr = ((jh4) kh4Var3.a).get(uriD2);
                            }
                            if (uriD == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = ((jh4) kh4Var3.a).get(uriD);
                            }
                            x38 x38Var4 = r19.k;
                            AtomicInteger atomicInteger6 = zy4.M;
                            map = Collections.EMPTY_MAP;
                            Uri uriD9 = a5b.d(str, fVar.t);
                            long j114 = fVar.B;
                            long j115 = fVar.C;
                            if (z3 != 0) {
                                i4 = 8;
                            } else {
                                i4 = 0;
                            }
                            xl7.n(uriD9, "The uri must be set.");
                            of2 of2Var9 = new of2(uriD9, 1, null, map, j114, j115, i4);
                            if (bArr != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                String str10 = fVar.A;
                                str10.getClass();
                                bArrD = zy4.d(str10);
                            } else {
                                bArrD = null;
                            }
                            if (bArr != null) {
                                bArrD.getClass();
                                ceVar = new ce(if2Var, bArr, bArrD);
                            } else {
                                ceVar = if2Var;
                            }
                            eVar2 = fVar.u;
                            if (eVar2 != null) {
                                if (bArr2 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    String str11 = eVar2.A;
                                    str11.getClass();
                                    bArrD2 = zy4.d(str11);
                                } else {
                                    bArrD2 = null;
                                }
                                Uri uriD10 = a5b.d(str, eVar2.t);
                                long j215 = eVar2.B;
                                long j216 = eVar2.C;
                                xl7.n(uriD10, "The uri must be set.");
                                of2 of2Var10 = new of2(uriD10, 1, null, map, j215, j216, 0);
                                if (bArr2 != null) {
                                    bArrD2.getClass();
                                    ceVar2 = new ce(if2Var, bArr2, bArrD2);
                                } else {
                                    ceVar2 = if2Var;
                                }
                                z7 = z10;
                                if2Var2 = ceVar2;
                                of2Var = of2Var10;
                            } else {
                                of2Var = null;
                                if2Var2 = null;
                                z7 = false;
                            }
                            long j217 = jK2 + j9;
                            long j218 = j217 + fVar.v;
                            i5 = dz4Var.j + fVar.w;
                            if (zy4Var != 0) {
                                of2Var2 = zy4Var.q;
                                if (of2Var != of2Var2) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                if (uri.equals(zy4Var.m)) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                u65Var = zy4Var.y;
                                pt7Var = zy4Var.z;
                                if (z8) {
                                    az4Var2 = null;
                                } else {
                                    az4Var2 = null;
                                }
                                az4Var = az4Var2;
                            } else {
                                u65Var = new u65(null);
                                pt7Var = new pt7(10);
                                az4Var = null;
                            }
                            u65 u65Var5 = u65Var;
                            pt7 pt7Var5 = pt7Var;
                            long j219 = eVarF2.b;
                            int i12 = eVarF2.c;
                            boolean z117 = !z3;
                            boolean z118 = fVar.D;
                            sparseArray = bpaVar4.a;
                            apaVar = sparseArray.get(i5);
                            if (apaVar == null) {
                                apaVar = new apa(9223372036854775806L);
                                sparseArray.put(i5, apaVar);
                            }
                            zy4 zy4Var7 = new zy4(yy4Var4, ceVar, of2Var9, id4Var4, z6, if2Var2, of2Var, z7, uri, list9, iS4, objV4, j217, j218, j219, i12, z117, i5, z118, z116, apaVar, fVar.y, az4Var, u65Var5, pt7Var5, z5, z4, x38Var4);
                            bVar = bVar2;
                            bVar.a = zy4Var7;
                        } else {
                            bVar = bVar2;
                            arrayList = arrayList;
                        }
                    } else {
                        bVar = bVar2;
                        arrayList = arrayList;
                    }
                    z11 = bVar.b;
                    vc1Var = bVar.a;
                    uri2 = bVar.c;
                    if (z11) {
                        this.j0 = j;
                        this.m0 = true;
                        return true;
                    }
                    if (vc1Var == null) {
                        if (uri2 != null) {
                            return false;
                        }
                        cz4.this.u.p(uri2);
                        return false;
                    }
                    if (vc1Var instanceof zy4) {
                        zy4Var2 = (zy4) vc1Var;
                        if (!arrayList.isEmpty()) {
                            arrayList2 = arrayList;
                            break;
                        }
                        if (!C().f()) {
                            B(arrayList.size() - 1);
                        }
                        if (!zy4Var2.n) {
                            arrayList2 = arrayList;
                            break;
                        }
                        arrayList2 = arrayList;
                        break;
                        this.r0 = zy4Var2;
                        this.Y = zy4Var2.d;
                        this.j0 = -9223372036854775807L;
                        arrayList2.add(zy4Var2);
                        k95.b bVar9 = k95.u;
                        aVar = new k95.a();
                        while (i6 < r5) {
                            aVar.c(Integer.valueOf(bVar6.q + bVar6.p));
                        }
                        ul8 ul8VarG3 = aVar.g();
                        zy4Var2.D = this;
                        zy4Var2.I = ul8VarG3;
                        while (i7 < r4) {
                            bVar7.getClass();
                            bVar7.E = zy4Var2.k;
                            if (zy4Var2.L) {
                                bVar7.I = true;
                            }
                        }
                    }
                    this.N = vc1Var;
                    yb6Var.d(vc1Var, this, this.B.c(vc1Var.c));
                    return true;
                }
                wy4Var.n = new un0();
            }
            arrayList = arrayList3;
            bVar = bVar2;
            z11 = bVar.b;
            vc1Var = bVar.a;
            uri2 = bVar.c;
            if (z11) {
                this.j0 = j;
                this.m0 = true;
                return true;
            }
            if (vc1Var == null) {
                if (uri2 != null) {
                    return false;
                }
                cz4.this.u.p(uri2);
                return false;
            }
            if (vc1Var instanceof zy4) {
                zy4Var2 = (zy4) vc1Var;
                if (!arrayList.isEmpty()) {
                    arrayList2 = arrayList;
                    break;
                }
                if (!C().f()) {
                    B(arrayList.size() - 1);
                }
                if (!zy4Var2.n) {
                    arrayList2 = arrayList;
                    break;
                }
                arrayList2 = arrayList;
                break;
                this.r0 = zy4Var2;
                this.Y = zy4Var2.d;
                this.j0 = -9223372036854775807L;
                arrayList2.add(zy4Var2);
                k95.b bVar10 = k95.u;
                aVar = new k95.a();
                while (i6 < r5) {
                    aVar.c(Integer.valueOf(bVar6.q + bVar6.p));
                }
                ul8 ul8VarG4 = aVar.g();
                zy4Var2.D = this;
                zy4Var2.I = ul8VarG4;
                while (i7 < r4) {
                    bVar7.getClass();
                    bVar7.E = zy4Var2.k;
                    if (zy4Var2.L) {
                        bVar7.I = true;
                    }
                }
            }
            this.N = vc1Var;
            yb6Var.d(vc1Var, this, this.B.c(vc1Var.c));
            return true;
        }
        j5 = j16;
        j6 = j14;
        jMax3 = j5;
        ym6[] ym6VarArrB2 = wy4Var.b(zy4Var3, j2);
        if (iA != -1) {
            fq3 fq3Var2 = wy4Var.r;
            kh4Var = kh4Var4;
            i = iA;
            if (fq3Var2.j(fq3Var2.d(iA), SystemClock.elapsedRealtime())) {
            }
            j7 = j2;
            kh4Var2 = kh4Var;
            i2 = i;
            zy4Var = zy4Var3;
            boolean z119 = z14;
            wy4Var.r.k(j6, jMax5, jMax3, list5, ym6VarArrB2);
            iQ = wy4Var.r.q();
            if (i2 != iQ) {
                z = true;
            } else {
                z = false;
            }
            uriC = kz4VarArr[iQ].c();
            if (jz4Var.c(uriC)) {
                bVar2.c = uriC;
                wy4Var.p = uriC;
            } else {
                dz4VarR = jz4Var.r(true, uriC);
                dz4VarR.getClass();
                wy4Var.q = dz4VarR.c;
                if (dz4VarR.o) {
                    jK = j;
                } else {
                    jK = (dz4VarR.h + dz4VarR.u) - jz4Var.k();
                }
                wy4Var.s = jK;
                jK2 = dz4VarR.h - jz4Var.k();
                Pair<Long, Integer> pairE5 = wy4Var.e(zy4Var, z, dz4VarR, jK2, j7);
                jLongValue = ((Long) pairE5.first).longValue();
                iIntValue = ((Integer) pairE5.second).intValue();
                if (z) {
                    iIntValue2 = iIntValue;
                    dz4Var = dz4VarR;
                    i3 = iQ;
                } else {
                    uriC = kz4VarArr[i2].c();
                    dz4 dz4VarR4 = jz4Var.r(true, uriC);
                    dz4VarR4.getClass();
                    jK2 = dz4VarR4.h - jz4Var.k();
                    Pair<Long, Integer> pairE6 = wy4Var.e(zy4Var, false, dz4VarR4, jK2, j7);
                    jLongValue = ((Long) pairE6.first).longValue();
                    iIntValue2 = ((Integer) pairE6.second).intValue();
                    i3 = i2;
                    dz4Var = dz4VarR4;
                }
                str = dz4Var.a;
                z2 = dz4Var.c;
                uri = uriC;
                j8 = dz4Var.k;
                k95 k95Var3 = dz4Var.r;
                if (i3 != i2) {
                    jz4Var.e(kz4VarArr[i2].c());
                }
                if (jLongValue < j8) {
                    eVarF2 = wy4.f(dz4Var, jLongValue, iIntValue2);
                    if (eVarF2 != null) {
                        if (!dz4Var.o) {
                            bVar2.c = uri;
                            r19.p = uri;
                        } else {
                            if (z13) {
                            }
                            bVar2.b = true;
                        }
                    }
                    z3 = eVarF2.d;
                    fVar = eVarF2.a;
                    r19.p = null;
                    SystemClock.elapsedRealtime();
                    eVar = fVar.u;
                    arrayList = arrayList3;
                    j9 = fVar.x;
                    if (eVar != null) {
                        uriD = null;
                    } else {
                        uriD = null;
                    }
                    aVarG = r19.g(uriD, i3, true);
                    bVar2.a = aVarG;
                    if (aVarG == null) {
                        str2 = fVar.z;
                        if (str2 == null) {
                            uriD2 = null;
                        } else {
                            uriD2 = a5b.d(dz4Var.a, str2);
                        }
                        aVarG2 = r19.g(uriD2, i3, false);
                        bVar2.a = aVarG2;
                        if (aVarG2 == null) {
                            if (fVar instanceof dz4.c) {
                                z4 = z2;
                            } else if (((dz4.c) fVar).E) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (zy4Var == 0) {
                                AtomicInteger atomicInteger7 = zy4.M;
                            } else {
                                if (uri.equals(zy4Var.m)) {
                                    if (z4) {
                                    }
                                } else if (z4) {
                                }
                                if (z5) {
                                }
                                yy4 yy4Var5 = r19.a;
                                if2Var = r19.b;
                                id4 id4Var5 = r19.f[i3];
                                List<id4> list10 = r19.i;
                                int iS5 = r19.r.s();
                                Object objV5 = r19.r.v();
                                boolean z1110 = r19.l;
                                bpa bpaVar5 = r19.d;
                                if (uriD2 == null) {
                                    kh4Var2.getClass();
                                    bArr = null;
                                    kh4Var3 = kh4Var2;
                                } else {
                                    kh4Var3 = kh4Var2;
                                    bArr = ((jh4) kh4Var3.a).get(uriD2);
                                }
                                if (uriD == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = ((jh4) kh4Var3.a).get(uriD);
                                }
                                x38 x38Var5 = r19.k;
                                AtomicInteger atomicInteger8 = zy4.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriD11 = a5b.d(str, fVar.t);
                                long j116 = fVar.B;
                                long j117 = fVar.C;
                                if (z3 != 0) {
                                    i4 = 8;
                                } else {
                                    i4 = 0;
                                }
                                xl7.n(uriD11, "The uri must be set.");
                                of2 of2Var11 = new of2(uriD11, 1, null, map, j116, j117, i4);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str12 = fVar.A;
                                    str12.getClass();
                                    bArrD = zy4.d(str12);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    ceVar = new ce(if2Var, bArr, bArrD);
                                } else {
                                    ceVar = if2Var;
                                }
                                eVar2 = fVar.u;
                                if (eVar2 != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str13 = eVar2.A;
                                        str13.getClass();
                                        bArrD2 = zy4.d(str13);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriD12 = a5b.d(str, eVar2.t);
                                    long j2110 = eVar2.B;
                                    long j2111 = eVar2.C;
                                    xl7.n(uriD12, "The uri must be set.");
                                    of2 of2Var12 = new of2(uriD12, 1, null, map, j2110, j2111, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        ceVar2 = new ce(if2Var, bArr2, bArrD2);
                                    } else {
                                        ceVar2 = if2Var;
                                    }
                                    z7 = z10;
                                    if2Var2 = ceVar2;
                                    of2Var = of2Var12;
                                } else {
                                    of2Var = null;
                                    if2Var2 = null;
                                    z7 = false;
                                }
                                long j2112 = jK2 + j9;
                                long j2113 = j2112 + fVar.v;
                                i5 = dz4Var.j + fVar.w;
                                if (zy4Var != 0) {
                                    of2Var2 = zy4Var.q;
                                    if (of2Var != of2Var2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uri.equals(zy4Var.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    u65Var = zy4Var.y;
                                    pt7Var = zy4Var.z;
                                    if (z8) {
                                        az4Var2 = null;
                                    } else {
                                        az4Var2 = null;
                                    }
                                    az4Var = az4Var2;
                                } else {
                                    u65Var = new u65(null);
                                    pt7Var = new pt7(10);
                                    az4Var = null;
                                }
                                u65 u65Var6 = u65Var;
                                pt7 pt7Var6 = pt7Var;
                                long j2114 = eVarF2.b;
                                int i13 = eVarF2.c;
                                boolean z1111 = !z3;
                                boolean z1112 = fVar.D;
                                sparseArray = bpaVar5.a;
                                apaVar = sparseArray.get(i5);
                                if (apaVar == null) {
                                    apaVar = new apa(9223372036854775806L);
                                    sparseArray.put(i5, apaVar);
                                }
                                zy4 zy4Var8 = new zy4(yy4Var5, ceVar, of2Var11, id4Var5, z6, if2Var2, of2Var, z7, uri, list10, iS5, objV5, j2112, j2113, j2114, i13, z1111, i5, z1112, z1110, apaVar, fVar.y, az4Var, u65Var6, pt7Var6, z5, z4, x38Var5);
                                bVar = bVar2;
                                bVar.a = zy4Var8;
                            }
                            if (z5) {
                            }
                            yy4 yy4Var6 = r19.a;
                            if2Var = r19.b;
                            id4 id4Var6 = r19.f[i3];
                            List<id4> list11 = r19.i;
                            int iS6 = r19.r.s();
                            Object objV6 = r19.r.v();
                            boolean z1113 = r19.l;
                            bpa bpaVar6 = r19.d;
                            if (uriD2 == null) {
                                kh4Var2.getClass();
                                bArr = null;
                                kh4Var3 = kh4Var2;
                            } else {
                                kh4Var3 = kh4Var2;
                                bArr = ((jh4) kh4Var3.a).get(uriD2);
                            }
                            if (uriD == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = ((jh4) kh4Var3.a).get(uriD);
                            }
                            x38 x38Var6 = r19.k;
                            AtomicInteger atomicInteger9 = zy4.M;
                            map = Collections.EMPTY_MAP;
                            Uri uriD13 = a5b.d(str, fVar.t);
                            long j118 = fVar.B;
                            long j119 = fVar.C;
                            if (z3 != 0) {
                                i4 = 8;
                            } else {
                                i4 = 0;
                            }
                            xl7.n(uriD13, "The uri must be set.");
                            of2 of2Var13 = new of2(uriD13, 1, null, map, j118, j119, i4);
                            if (bArr != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                String str14 = fVar.A;
                                str14.getClass();
                                bArrD = zy4.d(str14);
                            } else {
                                bArrD = null;
                            }
                            if (bArr != null) {
                                bArrD.getClass();
                                ceVar = new ce(if2Var, bArr, bArrD);
                            } else {
                                ceVar = if2Var;
                            }
                            eVar2 = fVar.u;
                            if (eVar2 != null) {
                                if (bArr2 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    String str15 = eVar2.A;
                                    str15.getClass();
                                    bArrD2 = zy4.d(str15);
                                } else {
                                    bArrD2 = null;
                                }
                                Uri uriD14 = a5b.d(str, eVar2.t);
                                long j2115 = eVar2.B;
                                long j2116 = eVar2.C;
                                xl7.n(uriD14, "The uri must be set.");
                                of2 of2Var14 = new of2(uriD14, 1, null, map, j2115, j2116, 0);
                                if (bArr2 != null) {
                                    bArrD2.getClass();
                                    ceVar2 = new ce(if2Var, bArr2, bArrD2);
                                } else {
                                    ceVar2 = if2Var;
                                }
                                z7 = z10;
                                if2Var2 = ceVar2;
                                of2Var = of2Var14;
                            } else {
                                of2Var = null;
                                if2Var2 = null;
                                z7 = false;
                            }
                            long j2117 = jK2 + j9;
                            long j2118 = j2117 + fVar.v;
                            i5 = dz4Var.j + fVar.w;
                            if (zy4Var != 0) {
                                of2Var2 = zy4Var.q;
                                if (of2Var != of2Var2) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                if (uri.equals(zy4Var.m)) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                u65Var = zy4Var.y;
                                pt7Var = zy4Var.z;
                                if (z8) {
                                    az4Var2 = null;
                                } else {
                                    az4Var2 = null;
                                }
                                az4Var = az4Var2;
                            } else {
                                u65Var = new u65(null);
                                pt7Var = new pt7(10);
                                az4Var = null;
                            }
                            u65 u65Var7 = u65Var;
                            pt7 pt7Var7 = pt7Var;
                            long j2119 = eVarF2.b;
                            int i14 = eVarF2.c;
                            boolean z1114 = !z3;
                            boolean z1115 = fVar.D;
                            sparseArray = bpaVar6.a;
                            apaVar = sparseArray.get(i5);
                            if (apaVar == null) {
                                apaVar = new apa(9223372036854775806L);
                                sparseArray.put(i5, apaVar);
                            }
                            zy4 zy4Var9 = new zy4(yy4Var6, ceVar, of2Var13, id4Var6, z6, if2Var2, of2Var, z7, uri, list11, iS6, objV6, j2117, j2118, j2119, i14, z1114, i5, z1115, z1113, apaVar, fVar.y, az4Var, u65Var7, pt7Var7, z5, z4, x38Var6);
                            bVar = bVar2;
                            bVar.a = zy4Var9;
                        } else {
                            bVar = bVar2;
                            arrayList = arrayList;
                        }
                    } else {
                        bVar = bVar2;
                        arrayList = arrayList;
                    }
                    z11 = bVar.b;
                    vc1Var = bVar.a;
                    uri2 = bVar.c;
                    if (z11) {
                        this.j0 = j;
                        this.m0 = true;
                        return true;
                    }
                    if (vc1Var == null) {
                        if (uri2 != null) {
                            return false;
                        }
                        cz4.this.u.p(uri2);
                        return false;
                    }
                    if (vc1Var instanceof zy4) {
                        zy4Var2 = (zy4) vc1Var;
                        if (!arrayList.isEmpty()) {
                            arrayList2 = arrayList;
                            break;
                        }
                        if (!C().f()) {
                            B(arrayList.size() - 1);
                        }
                        if (!zy4Var2.n) {
                            arrayList2 = arrayList;
                            break;
                        }
                        arrayList2 = arrayList;
                        break;
                        this.r0 = zy4Var2;
                        this.Y = zy4Var2.d;
                        this.j0 = -9223372036854775807L;
                        arrayList2.add(zy4Var2);
                        k95.b bVar11 = k95.u;
                        aVar = new k95.a();
                        while (i6 < r5) {
                            aVar.c(Integer.valueOf(bVar6.q + bVar6.p));
                        }
                        ul8 ul8VarG5 = aVar.g();
                        zy4Var2.D = this;
                        zy4Var2.I = ul8VarG5;
                        while (i7 < r4) {
                            bVar7.getClass();
                            bVar7.E = zy4Var2.k;
                            if (zy4Var2.L) {
                                bVar7.I = true;
                            }
                        }
                    }
                    this.N = vc1Var;
                    yb6Var.d(vc1Var, this, this.B.c(vc1Var.c));
                    return true;
                }
                wy4Var.n = new un0();
            }
            arrayList = arrayList3;
            bVar = bVar2;
            z11 = bVar.b;
            vc1Var = bVar.a;
            uri2 = bVar.c;
            if (z11) {
                this.j0 = j;
                this.m0 = true;
                return true;
            }
            if (vc1Var == null) {
                if (uri2 != null) {
                    return false;
                }
                cz4.this.u.p(uri2);
                return false;
            }
            if (vc1Var instanceof zy4) {
                zy4Var2 = (zy4) vc1Var;
                if (!arrayList.isEmpty()) {
                    arrayList2 = arrayList;
                    break;
                }
                if (!C().f()) {
                    B(arrayList.size() - 1);
                }
                if (!zy4Var2.n) {
                    arrayList2 = arrayList;
                    break;
                }
                arrayList2 = arrayList;
                break;
                this.r0 = zy4Var2;
                this.Y = zy4Var2.d;
                this.j0 = -9223372036854775807L;
                arrayList2.add(zy4Var2);
                k95.b bVar12 = k95.u;
                aVar = new k95.a();
                while (i6 < r5) {
                    aVar.c(Integer.valueOf(bVar6.q + bVar6.p));
                }
                ul8 ul8VarG6 = aVar.g();
                zy4Var2.D = this;
                zy4Var2.I = ul8VarG6;
                while (i7 < r4) {
                    bVar7.getClass();
                    bVar7.E = zy4Var2.k;
                    if (zy4Var2.L) {
                        bVar7.I = true;
                    }
                }
            }
            this.N = vc1Var;
            yb6Var.d(vc1Var, this, this.B.c(vc1Var.c));
            return true;
        }
        kh4Var = kh4Var4;
        i = iA;
        j7 = j2;
        kh4Var2 = kh4Var;
        i2 = i;
        zy4Var = zy4Var3;
        boolean z1116 = z14;
        wy4Var.r.k(j6, jMax5, jMax3, list5, ym6VarArrB2);
        iQ = wy4Var.r.q();
        if (i2 != iQ) {
            z = true;
        } else {
            z = false;
        }
        uriC = kz4VarArr[iQ].c();
        if (jz4Var.c(uriC)) {
            bVar2.c = uriC;
            wy4Var.p = uriC;
        } else {
            dz4VarR = jz4Var.r(true, uriC);
            dz4VarR.getClass();
            wy4Var.q = dz4VarR.c;
            if (dz4VarR.o) {
                jK = j;
            } else {
                jK = (dz4VarR.h + dz4VarR.u) - jz4Var.k();
            }
            wy4Var.s = jK;
            jK2 = dz4VarR.h - jz4Var.k();
            Pair<Long, Integer> pairE7 = wy4Var.e(zy4Var, z, dz4VarR, jK2, j7);
            jLongValue = ((Long) pairE7.first).longValue();
            iIntValue = ((Integer) pairE7.second).intValue();
            if (z) {
                iIntValue2 = iIntValue;
                dz4Var = dz4VarR;
                i3 = iQ;
            } else {
                uriC = kz4VarArr[i2].c();
                dz4 dz4VarR5 = jz4Var.r(true, uriC);
                dz4VarR5.getClass();
                jK2 = dz4VarR5.h - jz4Var.k();
                Pair<Long, Integer> pairE8 = wy4Var.e(zy4Var, false, dz4VarR5, jK2, j7);
                jLongValue = ((Long) pairE8.first).longValue();
                iIntValue2 = ((Integer) pairE8.second).intValue();
                i3 = i2;
                dz4Var = dz4VarR5;
            }
            str = dz4Var.a;
            z2 = dz4Var.c;
            uri = uriC;
            j8 = dz4Var.k;
            k95 k95Var4 = dz4Var.r;
            if (i3 != i2) {
                jz4Var.e(kz4VarArr[i2].c());
            }
            if (jLongValue < j8) {
                eVarF2 = wy4.f(dz4Var, jLongValue, iIntValue2);
                if (eVarF2 != null) {
                    if (!dz4Var.o) {
                        bVar2.c = uri;
                        r19.p = uri;
                    } else {
                        if (z13) {
                        }
                        bVar2.b = true;
                    }
                }
                z3 = eVarF2.d;
                fVar = eVarF2.a;
                r19.p = null;
                SystemClock.elapsedRealtime();
                eVar = fVar.u;
                arrayList = arrayList3;
                j9 = fVar.x;
                if (eVar != null) {
                    uriD = null;
                } else {
                    uriD = null;
                }
                aVarG = r19.g(uriD, i3, true);
                bVar2.a = aVarG;
                if (aVarG == null) {
                    str2 = fVar.z;
                    if (str2 == null) {
                        uriD2 = null;
                    } else {
                        uriD2 = a5b.d(dz4Var.a, str2);
                    }
                    aVarG2 = r19.g(uriD2, i3, false);
                    bVar2.a = aVarG2;
                    if (aVarG2 == null) {
                        if (fVar instanceof dz4.c) {
                            z4 = z2;
                        } else if (((dz4.c) fVar).E) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (zy4Var == 0) {
                            AtomicInteger atomicInteger10 = zy4.M;
                        } else {
                            if (uri.equals(zy4Var.m)) {
                                if (z4) {
                                }
                            } else if (z4) {
                            }
                            if (z5) {
                            }
                            yy4 yy4Var7 = r19.a;
                            if2Var = r19.b;
                            id4 id4Var7 = r19.f[i3];
                            List<id4> list12 = r19.i;
                            int iS7 = r19.r.s();
                            Object objV7 = r19.r.v();
                            boolean z1117 = r19.l;
                            bpa bpaVar7 = r19.d;
                            if (uriD2 == null) {
                                kh4Var2.getClass();
                                bArr = null;
                                kh4Var3 = kh4Var2;
                            } else {
                                kh4Var3 = kh4Var2;
                                bArr = ((jh4) kh4Var3.a).get(uriD2);
                            }
                            if (uriD == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = ((jh4) kh4Var3.a).get(uriD);
                            }
                            x38 x38Var7 = r19.k;
                            AtomicInteger atomicInteger11 = zy4.M;
                            map = Collections.EMPTY_MAP;
                            Uri uriD15 = a5b.d(str, fVar.t);
                            long j1110 = fVar.B;
                            long j1111 = fVar.C;
                            if (z3 != 0) {
                                i4 = 8;
                            } else {
                                i4 = 0;
                            }
                            xl7.n(uriD15, "The uri must be set.");
                            of2 of2Var15 = new of2(uriD15, 1, null, map, j1110, j1111, i4);
                            if (bArr != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                String str16 = fVar.A;
                                str16.getClass();
                                bArrD = zy4.d(str16);
                            } else {
                                bArrD = null;
                            }
                            if (bArr != null) {
                                bArrD.getClass();
                                ceVar = new ce(if2Var, bArr, bArrD);
                            } else {
                                ceVar = if2Var;
                            }
                            eVar2 = fVar.u;
                            if (eVar2 != null) {
                                if (bArr2 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    String str17 = eVar2.A;
                                    str17.getClass();
                                    bArrD2 = zy4.d(str17);
                                } else {
                                    bArrD2 = null;
                                }
                                Uri uriD16 = a5b.d(str, eVar2.t);
                                long j21110 = eVar2.B;
                                long j21111 = eVar2.C;
                                xl7.n(uriD16, "The uri must be set.");
                                of2 of2Var16 = new of2(uriD16, 1, null, map, j21110, j21111, 0);
                                if (bArr2 != null) {
                                    bArrD2.getClass();
                                    ceVar2 = new ce(if2Var, bArr2, bArrD2);
                                } else {
                                    ceVar2 = if2Var;
                                }
                                z7 = z10;
                                if2Var2 = ceVar2;
                                of2Var = of2Var16;
                            } else {
                                of2Var = null;
                                if2Var2 = null;
                                z7 = false;
                            }
                            long j21112 = jK2 + j9;
                            long j21113 = j21112 + fVar.v;
                            i5 = dz4Var.j + fVar.w;
                            if (zy4Var != 0) {
                                of2Var2 = zy4Var.q;
                                if (of2Var != of2Var2) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                if (uri.equals(zy4Var.m)) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                u65Var = zy4Var.y;
                                pt7Var = zy4Var.z;
                                if (z8) {
                                    az4Var2 = null;
                                } else {
                                    az4Var2 = null;
                                }
                                az4Var = az4Var2;
                            } else {
                                u65Var = new u65(null);
                                pt7Var = new pt7(10);
                                az4Var = null;
                            }
                            u65 u65Var8 = u65Var;
                            pt7 pt7Var8 = pt7Var;
                            long j21114 = eVarF2.b;
                            int i15 = eVarF2.c;
                            boolean z1118 = !z3;
                            boolean z1119 = fVar.D;
                            sparseArray = bpaVar7.a;
                            apaVar = sparseArray.get(i5);
                            if (apaVar == null) {
                                apaVar = new apa(9223372036854775806L);
                                sparseArray.put(i5, apaVar);
                            }
                            zy4 zy4Var10 = new zy4(yy4Var7, ceVar, of2Var15, id4Var7, z6, if2Var2, of2Var, z7, uri, list12, iS7, objV7, j21112, j21113, j21114, i15, z1118, i5, z1119, z1117, apaVar, fVar.y, az4Var, u65Var8, pt7Var8, z5, z4, x38Var7);
                            bVar = bVar2;
                            bVar.a = zy4Var10;
                        }
                        if (z5) {
                        }
                        yy4 yy4Var8 = r19.a;
                        if2Var = r19.b;
                        id4 id4Var8 = r19.f[i3];
                        List<id4> list13 = r19.i;
                        int iS8 = r19.r.s();
                        Object objV8 = r19.r.v();
                        boolean z11110 = r19.l;
                        bpa bpaVar8 = r19.d;
                        if (uriD2 == null) {
                            kh4Var2.getClass();
                            bArr = null;
                            kh4Var3 = kh4Var2;
                        } else {
                            kh4Var3 = kh4Var2;
                            bArr = ((jh4) kh4Var3.a).get(uriD2);
                        }
                        if (uriD == null) {
                            bArr2 = null;
                        } else {
                            bArr2 = ((jh4) kh4Var3.a).get(uriD);
                        }
                        x38 x38Var8 = r19.k;
                        AtomicInteger atomicInteger12 = zy4.M;
                        map = Collections.EMPTY_MAP;
                        Uri uriD17 = a5b.d(str, fVar.t);
                        long j1112 = fVar.B;
                        long j1113 = fVar.C;
                        if (z3 != 0) {
                            i4 = 8;
                        } else {
                            i4 = 0;
                        }
                        xl7.n(uriD17, "The uri must be set.");
                        of2 of2Var17 = new of2(uriD17, 1, null, map, j1112, j1113, i4);
                        if (bArr != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            String str18 = fVar.A;
                            str18.getClass();
                            bArrD = zy4.d(str18);
                        } else {
                            bArrD = null;
                        }
                        if (bArr != null) {
                            bArrD.getClass();
                            ceVar = new ce(if2Var, bArr, bArrD);
                        } else {
                            ceVar = if2Var;
                        }
                        eVar2 = fVar.u;
                        if (eVar2 != null) {
                            if (bArr2 != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                String str19 = eVar2.A;
                                str19.getClass();
                                bArrD2 = zy4.d(str19);
                            } else {
                                bArrD2 = null;
                            }
                            Uri uriD18 = a5b.d(str, eVar2.t);
                            long j21115 = eVar2.B;
                            long j21116 = eVar2.C;
                            xl7.n(uriD18, "The uri must be set.");
                            of2 of2Var18 = new of2(uriD18, 1, null, map, j21115, j21116, 0);
                            if (bArr2 != null) {
                                bArrD2.getClass();
                                ceVar2 = new ce(if2Var, bArr2, bArrD2);
                            } else {
                                ceVar2 = if2Var;
                            }
                            z7 = z10;
                            if2Var2 = ceVar2;
                            of2Var = of2Var18;
                        } else {
                            of2Var = null;
                            if2Var2 = null;
                            z7 = false;
                        }
                        long j21117 = jK2 + j9;
                        long j21118 = j21117 + fVar.v;
                        i5 = dz4Var.j + fVar.w;
                        if (zy4Var != 0) {
                            of2Var2 = zy4Var.q;
                            if (of2Var != of2Var2) {
                                z8 = true;
                            } else {
                                z8 = true;
                            }
                            if (uri.equals(zy4Var.m)) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            u65Var = zy4Var.y;
                            pt7Var = zy4Var.z;
                            if (z8) {
                                az4Var2 = null;
                            } else {
                                az4Var2 = null;
                            }
                            az4Var = az4Var2;
                        } else {
                            u65Var = new u65(null);
                            pt7Var = new pt7(10);
                            az4Var = null;
                        }
                        u65 u65Var9 = u65Var;
                        pt7 pt7Var9 = pt7Var;
                        long j21119 = eVarF2.b;
                        int i16 = eVarF2.c;
                        boolean z11111 = !z3;
                        boolean z11112 = fVar.D;
                        sparseArray = bpaVar8.a;
                        apaVar = sparseArray.get(i5);
                        if (apaVar == null) {
                            apaVar = new apa(9223372036854775806L);
                            sparseArray.put(i5, apaVar);
                        }
                        zy4 zy4Var11 = new zy4(yy4Var8, ceVar, of2Var17, id4Var8, z6, if2Var2, of2Var, z7, uri, list13, iS8, objV8, j21117, j21118, j21119, i16, z11111, i5, z11112, z11110, apaVar, fVar.y, az4Var, u65Var9, pt7Var9, z5, z4, x38Var8);
                        bVar = bVar2;
                        bVar.a = zy4Var11;
                    } else {
                        bVar = bVar2;
                        arrayList = arrayList;
                    }
                } else {
                    bVar = bVar2;
                    arrayList = arrayList;
                }
                z11 = bVar.b;
                vc1Var = bVar.a;
                uri2 = bVar.c;
                if (z11) {
                    this.j0 = j;
                    this.m0 = true;
                    return true;
                }
                if (vc1Var == null) {
                    if (uri2 != null) {
                        return false;
                    }
                    cz4.this.u.p(uri2);
                    return false;
                }
                if (vc1Var instanceof zy4) {
                    zy4Var2 = (zy4) vc1Var;
                    if (!arrayList.isEmpty()) {
                        arrayList2 = arrayList;
                        break;
                    }
                    if (!C().f()) {
                        B(arrayList.size() - 1);
                    }
                    if (!zy4Var2.n) {
                        arrayList2 = arrayList;
                        break;
                    }
                    arrayList2 = arrayList;
                    break;
                    this.r0 = zy4Var2;
                    this.Y = zy4Var2.d;
                    this.j0 = -9223372036854775807L;
                    arrayList2.add(zy4Var2);
                    k95.b bVar13 = k95.u;
                    aVar = new k95.a();
                    while (i6 < r5) {
                        aVar.c(Integer.valueOf(bVar6.q + bVar6.p));
                    }
                    ul8 ul8VarG7 = aVar.g();
                    zy4Var2.D = this;
                    zy4Var2.I = ul8VarG7;
                    while (i7 < r4) {
                        bVar7.getClass();
                        bVar7.E = zy4Var2.k;
                        if (zy4Var2.L) {
                            bVar7.I = true;
                        }
                    }
                }
                this.N = vc1Var;
                yb6Var.d(vc1Var, this, this.B.c(vc1Var.c));
                return true;
            }
            wy4Var.n = new un0();
        }
        arrayList = arrayList3;
        bVar = bVar2;
        z11 = bVar.b;
        vc1Var = bVar.a;
        uri2 = bVar.c;
        if (z11) {
            this.j0 = j;
            this.m0 = true;
            return true;
        }
        if (vc1Var == null) {
            if (uri2 != null) {
                return false;
            }
            cz4.this.u.p(uri2);
            return false;
        }
        if (vc1Var instanceof zy4) {
            zy4Var2 = (zy4) vc1Var;
            if (!arrayList.isEmpty()) {
                arrayList2 = arrayList;
                break;
            }
            if (!C().f()) {
                B(arrayList.size() - 1);
            }
            if (!zy4Var2.n) {
                arrayList2 = arrayList;
                break;
            }
            arrayList2 = arrayList;
            break;
            this.r0 = zy4Var2;
            this.Y = zy4Var2.d;
            this.j0 = -9223372036854775807L;
            arrayList2.add(zy4Var2);
            k95.b bVar14 = k95.u;
            aVar = new k95.a();
            while (i6 < r5) {
                aVar.c(Integer.valueOf(bVar6.q + bVar6.p));
            }
            ul8 ul8VarG8 = aVar.g();
            zy4Var2.D = this;
            zy4Var2.I = ul8VarG8;
            while (i7 < r4) {
                bVar7.getClass();
                bVar7.E = zy4Var2.k;
                if (zy4Var2.L) {
                    bVar7.I = true;
                }
            }
        }
        this.N = vc1Var;
        yb6Var.d(vc1Var, this, this.B.c(vc1Var.c));
        return true;
    }

    @Override // defpackage.bd9
    public final long e() {
        if (E()) {
            return this.j0;
        }
        if (this.m0) {
            return Long.MIN_VALUE;
        }
        return C().h;
    }

    @Override // yb6.a
    public final void h(yb6.d dVar, long j, long j2) {
        vc1 vc1Var = (vc1) dVar;
        this.N = null;
        if (vc1Var instanceof wy4.a) {
            wy4.a aVar = (wy4.a) vc1Var;
            byte[] bArr = aVar.j;
            wy4 wy4Var = this.w;
            wy4Var.m = bArr;
            kh4 kh4Var = wy4Var.j;
            Uri uri = aVar.b.a;
            byte[] bArr2 = aVar.l;
            bArr2.getClass();
            jh4 jh4Var = (jh4) kh4Var.a;
            uri.getClass();
            jh4Var.put(uri, bArr2);
        }
        long j3 = vc1Var.a;
        of2 of2Var = vc1Var.b;
        c1a c1aVar = vc1Var.i;
        rb6 rb6Var = new rb6(of2Var, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
        this.B.getClass();
        this.D.c(rb6Var, vc1Var.c, this.u, vc1Var.d, vc1Var.e, vc1Var.f, vc1Var.g, vc1Var.h);
        if (this.W) {
            this.v.b(this);
            return;
        }
        g.a aVar2 = new g.a();
        aVar2.a = this.i0;
        c(new g(aVar2));
    }

    @Override // defpackage.bd9
    public final boolean j() {
        return this.C.b();
    }

    @Override // defpackage.ls3
    public final void k() {
        this.o0 = true;
        this.K.post(this.J);
    }

    @Override // yb6.a
    public final void o(yb6.d dVar, long j, long j2, int i) {
        rb6 rb6Var;
        vc1 vc1Var = (vc1) dVar;
        if (i == 0) {
            long j3 = vc1Var.a;
            rb6Var = new rb6(vc1Var.b, j);
        } else {
            long j4 = vc1Var.a;
            of2 of2Var = vc1Var.b;
            c1a c1aVar = vc1Var.i;
            rb6Var = new rb6(of2Var, c1aVar.c, c1aVar.d, j, j2, c1aVar.b);
        }
        this.D.e(rb6Var, vc1Var.c, this.u, vc1Var.d, vc1Var.e, vc1Var.f, vc1Var.g, vc1Var.h, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [pz4$b[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [pz4$b[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [hsa] */
    /* JADX WARN: Type inference failed for: r5v4, types: [pz4$b, vz8] */
    /* JADX WARN: Type inference failed for: r5v6, types: [g13] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.ls3
    public final hsa p(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set<Integer> set = s0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.Q;
        SparseIntArray sparseIntArray = this.R;
        ?? bVar = 0;
        bVar = 0;
        if (zContains) {
            xl7.g(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.P[i3] = i;
                }
                bVar = this.P[i3] == i ? this.O[i3] : y(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.O;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.P[i4] == i) {
                    bVar = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (bVar == 0) {
            if (this.o0) {
                return y(i, i2);
            }
            int length = this.O.length;
            boolean z = i2 == 1 || i2 == 2;
            bVar = new b(this.x, this.z, this.A, this.M);
            bVar.t = this.i0;
            if (z) {
                bVar.K = this.q0;
                bVar.B = true;
            }
            long j = this.p0;
            if (bVar.H != j) {
                bVar.H = j;
                bVar.B = true;
            }
            zy4 zy4Var = this.r0;
            if (zy4Var != null) {
                bVar.E = zy4Var.k;
            }
            bVar.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.P, i5);
            this.P = iArrCopyOf;
            iArrCopyOf[length] = i;
            b[] bVarArr = this.O;
            String str = n6b.a;
            ?? CopyOf = Arrays.copyOf(bVarArr, bVarArr.length + 1);
            CopyOf[bVarArr.length] = bVar;
            this.O = (b[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.h0, i5);
            this.h0 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.f0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (D(i2) > D(this.T)) {
                this.U = length;
                this.T = i2;
            }
            this.g0 = Arrays.copyOf(this.g0, i5);
        }
        if (i2 != 5) {
            return bVar;
        }
        if (this.S == null) {
            this.S = new a(bVar, this.E);
        }
        return this.S;
    }

    @Override // defpackage.bd9
    public final long q() {
        long j;
        ArrayList<zy4> arrayList = this.G;
        if (this.m0) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.j0;
        }
        long jMax = this.i0;
        zy4 zy4VarC = C();
        if (!zy4VarC.H) {
            zy4VarC = arrayList.size() > 1 ? (zy4) p51.b(2, arrayList) : null;
        }
        if (zy4VarC != null) {
            jMax = Math.max(jMax, zy4VarC.h);
        }
        if (this.V) {
            for (b bVar : this.O) {
                synchronized (bVar) {
                    j = bVar.w;
                }
                jMax = Math.max(jMax, j);
            }
        }
        return jMax;
    }

    @Override // vz8.c
    public final void r() {
        this.K.post(this.I);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    @Override // yb6.a
    public final yb6.b u(yb6.d dVar, long j, long j2, IOException iOException, int i) {
        vc1 vc1Var;
        boolean zN;
        boolean z;
        int iD;
        yb6.b bVar;
        int i2;
        vc1 vc1Var2 = (vc1) dVar;
        boolean z2 = vc1Var2 instanceof zy4;
        if (z2 && !((zy4) vc1Var2).f() && (iOException instanceof n45) && ((i2 = ((n45) iOException).v) == 410 || i2 == 404)) {
            return yb6.d;
        }
        long j3 = vc1Var2.i.b;
        of2 of2Var = vc1Var2.b;
        c1a c1aVar = vc1Var2.i;
        rb6 rb6Var = new rb6(of2Var, c1aVar.c, c1aVar.d, j, j2, j3);
        n6b.Z(vc1Var2.g);
        n6b.Z(vc1Var2.h);
        qb6.c cVar = new qb6.c(iOException, i);
        boolean z3 = vc1Var2 instanceof zy4;
        wy4 wy4Var = this.w;
        qb6.a aVarA = z3 ? wy4Var.a(((zy4) vc1Var2).m) : new qb6.a(1, 0, wy4Var.r.length(), wy4Var.d(SystemClock.elapsedRealtime()));
        qb6 qb6Var = this.B;
        qb6.b bVarB = qb6Var.b(aVarA, cVar);
        if (bVarB == null) {
            z = false;
            vc1Var = null;
        } else {
            int i3 = bVarB.a;
            vc1Var = null;
            long j4 = bVarB.b;
            if (i3 != 1) {
                if (i3 != 2) {
                    aa0.c(pp2.a(i3, "Invalid fallback selection type: "));
                    return null;
                }
                int iA = wy4Var.h.a(vc1Var2.d);
                if (iA == -1 || (iD = wy4Var.r.d(iA)) == -1) {
                    z = false;
                } else {
                    zN = wy4Var.r.t(iD, j4);
                    z = zN;
                }
            } else if (z3) {
                zN = wy4Var.g.n(((zy4) vc1Var2).m, j4);
                z = zN;
            } else {
                z = false;
            }
        }
        if (z) {
            if (z2 && j3 == 0) {
                ArrayList<zy4> arrayList = this.G;
                xl7.r(arrayList.remove(arrayList.size() - 1) == vc1Var2);
                if (arrayList.isEmpty()) {
                    this.j0 = this.i0;
                } else {
                    ((zy4) nr1.b(arrayList)).J = true;
                }
            }
            bVar = yb6.e;
        } else {
            long jA = qb6Var.a(cVar);
            bVar = jA != -9223372036854775807L ? new yb6.b(0, jA) : yb6.f;
        }
        yb6.b bVar2 = bVar;
        int i4 = bVar2.a;
        boolean z4 = i4 == 0 || i4 == 1;
        this.D.d(rb6Var, vc1Var2.c, this.u, vc1Var2.d, vc1Var2.e, vc1Var2.f, vc1Var2.g, vc1Var2.h, iOException, !z4);
        if (!z4) {
            this.N = vc1Var;
        }
        if (z) {
            if (!this.W) {
                g.a aVar = new g.a();
                aVar.a = this.i0;
                c(new g(aVar));
                return bVar2;
            }
            this.v.b(this);
        }
        return bVar2;
    }

    @Override // defpackage.bd9
    public final void v(long j) {
        boolean z;
        wy4 wy4Var = this.w;
        List<zy4> list = this.H;
        yb6 yb6Var = this.C;
        if (yb6Var.c == null && !E()) {
            boolean z2 = false;
            if (yb6Var.b()) {
                this.N.getClass();
                if (wy4Var.n == null ? wy4Var.r.m(j, this.N, list) : false) {
                    yb6Var.a();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && wy4Var.c(list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                B(size);
            }
            int size2 = (wy4Var.n != null || wy4Var.r.length() < 2) ? list.size() : wy4Var.r.p(j, list);
            if (size2 < this.G.size()) {
                B(size2);
            }
            if (this.V && this.n0 != Long.MIN_VALUE) {
                boolean z3 = true;
                int i = 0;
                while (true) {
                    b[] bVarArr = this.O;
                    if (i >= bVarArr.length) {
                        break;
                    }
                    if (this.g0[i] && (this.h0[i] || !this.f0)) {
                        b bVar = bVarArr[i];
                        synchronized (bVar) {
                            z = bVar.x != -1;
                        }
                        z3 &= z;
                    }
                    i++;
                }
                z2 = z3;
            }
            if (z2) {
                this.m0 = true;
            }
        }
    }

    public final void w() {
        xl7.r(this.W);
        this.b0.getClass();
        this.c0.getClass();
    }

    public final boolean x(int i) {
        int i2 = i;
        while (true) {
            ArrayList<zy4> arrayList = this.G;
            if (i2 >= arrayList.size()) {
                zy4 zy4Var = arrayList.get(i);
                for (int i3 = 0; i3 < this.O.length; i3++) {
                    if (this.O[i3].p() > zy4Var.e(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (arrayList.get(i2).L) {
                return false;
            }
            i2++;
        }
    }

    public final gsa z(esa[] esaVarArr) {
        for (int i = 0; i < esaVarArr.length; i++) {
            esa esaVar = esaVarArr[i];
            id4[] id4VarArr = new id4[esaVar.a];
            for (int i2 = 0; i2 < esaVar.a; i2++) {
                id4 id4Var = esaVar.d[i2];
                int iG = this.z.g(id4Var);
                id4.a aVarA = id4Var.a();
                aVarA.O = iG;
                id4VarArr[i2] = new id4(aVarA);
            }
            esaVarArr[i] = new esa(esaVar.b, id4VarArr);
        }
        return new gsa(esaVarArr);
    }

    @Override // defpackage.ls3
    public final void t(t89 t89Var) {
    }
}
