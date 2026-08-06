package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wy4 {
    public final yy4 a;
    public final if2 b;
    public final if2 c;
    public final bpa d;
    public final kz4[] e;
    public final id4[] f;
    public final jz4 g;
    public final esa h;
    public final List<id4> i;
    public final x38 k;
    public boolean l;
    public un0 n;
    public Uri o;
    public Uri p;
    public boolean q;
    public fq3 r;
    public final kh4 j = new kh4();
    public byte[] m = n6b.b;
    public long s = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends re2 {
        public byte[] l;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public vc1 a;
        public boolean b;
        public Uri c;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends pk0 {
        public final List<dz4.f> d;
        public final long e;

        public c(long j, List list) {
            super(list.size() - 1);
            this.e = j;
            this.d = list;
        }

        @Override // defpackage.ym6
        public final long a() {
            long j = this.c;
            if (j < 0 || j > this.b) {
                vl.b();
                return 0L;
            }
            return this.e + this.d.get((int) j).x;
        }

        @Override // defpackage.ym6
        public final long b() {
            long j = this.c;
            if (j < 0 || j > this.b) {
                vl.b();
                return 0L;
            }
            dz4.f fVar = this.d.get((int) j);
            return this.e + fVar.x + fVar.v;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends zk0 {
        public int g;

        @Override // defpackage.fq3
        public final void k(long j, long j2, long j3, List<? extends xm6> list, ym6[] ym6VarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (j(this.g, jElapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!j(i, jElapsedRealtime)) {
                        this.g = i;
                        return;
                    }
                }
                d43.c();
            }
        }

        @Override // defpackage.fq3
        public final int l() {
            return this.g;
        }

        @Override // defpackage.fq3
        public final int s() {
            return 0;
        }

        @Override // defpackage.fq3
        public final Object v() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public final dz4.f a;
        public final long b;
        public final int c;
        public final boolean d;

        public e(dz4.f fVar, long j, int i) {
            this.a = fVar;
            this.b = j;
            this.c = i;
            this.d = (fVar instanceof dz4.c) && ((dz4.c) fVar).F;
        }
    }

    public wy4(yy4 yy4Var, jz4 jz4Var, kz4[] kz4VarArr, id4[] id4VarArr, xy4 xy4Var, yua yuaVar, bpa bpaVar, List list, x38 x38Var) {
        this.a = yy4Var;
        this.g = jz4Var;
        this.e = kz4VarArr;
        this.f = id4VarArr;
        this.d = bpaVar;
        this.i = list;
        this.k = x38Var;
        if2 if2VarA = xy4Var.a();
        this.b = if2VarA;
        if (yuaVar != null) {
            if2VarA.d(yuaVar);
        }
        this.c = xy4Var.a();
        this.h = new esa(BuildConfig.FLAVOR, id4VarArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < kz4VarArr.length; i2++) {
            if ((id4VarArr[i2].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        esa esaVar = this.h;
        int[] iArrM1 = ek5.m1(arrayList);
        d dVar = new d(esaVar, iArrM1);
        id4 id4Var = esaVar.d[iArrM1[0]];
        while (i < dVar.b) {
            if (dVar.d[i] == id4Var) {
                dVar.g = i;
                this.r = dVar;
            }
            i++;
        }
        i = -1;
        dVar.g = i;
        this.r = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e f(dz4 dz4Var, long j, int i) {
        long j2 = dz4Var.k;
        k95 k95Var = dz4Var.s;
        int i2 = (int) (j - j2);
        k95 k95Var2 = dz4Var.r;
        if (i2 == k95Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < k95Var.size()) {
                return new e((dz4.f) k95Var.get(i), j, i);
            }
            return null;
        }
        dz4.e eVar = (dz4.e) k95Var2.get(i2);
        if (i == -1) {
            return new e(eVar, j, -1);
        }
        if (i < eVar.F.size()) {
            return new e((dz4.f) eVar.F.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < k95Var2.size()) {
            return new e((dz4.f) k95Var2.get(i3), j + 1, -1);
        }
        if (k95Var.isEmpty()) {
            return null;
        }
        return new e((dz4.f) k95Var.get(0), j + 1, 0);
    }

    public final qb6.a a(Uri uri) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        jz4 jz4Var = this.g;
        kz4 kz4VarQ = jz4Var.q(uri);
        kz4VarQ.getClass();
        HashMap<String, Uri> map = kz4VarQ.b;
        int size = map.size();
        w2b it = q95.p(map.values()).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (jz4Var.d((Uri) it.next(), jElapsedRealtime)) {
                i++;
            }
        }
        return new qb6.a(size, i, this.r.length(), d(jElapsedRealtime));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ym6[] b(zy4 zy4Var, long j) {
        List listUnmodifiableList;
        wy4 wy4Var = this;
        zy4 zy4Var2 = zy4Var;
        int iA = zy4Var2 == null ? -1 : wy4Var.h.a(zy4Var2.d);
        int length = wy4Var.r.length();
        ym6[] ym6VarArr = new ym6[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iC = wy4Var.r.c(i);
            Uri uriC = wy4Var.e[iC].c();
            jz4 jz4Var = wy4Var.g;
            if (jz4Var.c(uriC)) {
                dz4 dz4VarR = jz4Var.r(z, uriC);
                dz4VarR.getClass();
                long jK = dz4VarR.h - jz4Var.k();
                Pair<Long, Integer> pairE = wy4Var.e(zy4Var2, iC != iA ? true : z, dz4VarR, jK, j);
                long jLongValue = ((Long) pairE.first).longValue();
                int iIntValue = ((Integer) pairE.second).intValue();
                long j2 = dz4VarR.k;
                k95 k95Var = dz4VarR.s;
                k95 k95Var2 = dz4VarR.r;
                int i2 = (int) (jLongValue - j2);
                if (i2 < 0 || k95Var2.size() < i2) {
                    k95.b bVar = k95.u;
                    listUnmodifiableList = ul8.x;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < k95Var2.size()) {
                        if (iIntValue != -1) {
                            dz4.e eVar = (dz4.e) k95Var2.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(eVar);
                            } else if (iIntValue < eVar.F.size()) {
                                k95 k95Var3 = eVar.F;
                                arrayList.addAll(k95Var3.subList(iIntValue, k95Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(k95Var2.subList(i2, k95Var2.size()));
                        iIntValue = 0;
                    }
                    if (dz4VarR.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < k95Var.size()) {
                            arrayList.addAll(k95Var.subList(iIntValue, k95Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                ym6VarArr[i] = new c(jK, listUnmodifiableList);
            } else {
                ym6VarArr[i] = ym6.a;
            }
            i++;
            wy4Var = this;
            zy4Var2 = zy4Var;
            z = false;
        }
        return ym6VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int c(zy4 zy4Var) {
        int i = zy4Var.o;
        if (i == -1) {
            return 1;
        }
        dz4 dz4VarR = this.g.r(false, zy4Var.m);
        dz4VarR.getClass();
        k95 k95Var = dz4VarR.r;
        int i2 = (int) (zy4Var.j - dz4VarR.k);
        if (i2 < 0) {
            return 1;
        }
        k95 k95Var2 = i2 < k95Var.size() ? ((dz4.e) k95Var.get(i2)).F : dz4VarR.s;
        if (i >= k95Var2.size()) {
            return 2;
        }
        dz4.c cVar = (dz4.c) k95Var2.get(i);
        if (cVar.F) {
            return 0;
        }
        return Objects.equals(Uri.parse(a5b.c(dz4VarR.a, cVar.t)), zy4Var.b.a) ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final int d(long j) {
        fq3 fq3Var = this.r;
        int length = fq3Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int iC = fq3Var.c(i2);
            if (fq3Var.j(i2, j)) {
                i++;
            } else {
                if (this.g.a(this.e[iC], j)) {
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<Long, Integer> e(zy4 zy4Var, boolean z, dz4 dz4Var, long j, long j2) {
        int i;
        k95 k95Var;
        boolean z2 = true;
        if (zy4Var != null) {
            long j3 = zy4Var.j;
            int i2 = zy4Var.o;
            if (!z) {
                if (!zy4Var.H) {
                    return new Pair<>(Long.valueOf(j3), Integer.valueOf(i2));
                }
                if (i2 == -1) {
                    j3 = j3 != -1 ? j3 + 1 : -1L;
                }
                return new Pair<>(Long.valueOf(j3), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
            }
        }
        long j4 = dz4Var.u;
        long j5 = dz4Var.k;
        k95 k95Var2 = dz4Var.s;
        k95 k95Var3 = dz4Var.r;
        long j6 = j + j4;
        long j7 = (zy4Var == null || this.q) ? j2 : zy4Var.g;
        if (!dz4Var.o && j7 >= j6) {
            return new Pair<>(Long.valueOf(j5 + ((long) k95Var3.size())), -1);
        }
        long j8 = j7 - j;
        Long lValueOf = Long.valueOf(j8);
        jz4 jz4Var = this.g;
        if (jz4Var.l() && zy4Var != null) {
            z2 = false;
        }
        int iD = n6b.d(k95Var3, z2, lValueOf);
        long j9 = ((long) iD) + j5;
        if (!jz4Var.l()) {
            return new Pair<>(Long.valueOf(j9), -1);
        }
        if (iD < 0) {
            i = -1;
        } else {
            if (k95Var3.isEmpty()) {
                k95Var = k95Var2;
            } else {
                dz4.e eVar = (dz4.e) k95Var3.get(iD);
                if (j8 < eVar.x + eVar.v) {
                    k95Var = eVar.F;
                } else {
                    k95Var = k95Var2;
                }
            }
            for (int i3 = 0; i3 < k95Var.size(); i3++) {
                dz4.c cVar = (dz4.c) k95Var.get(i3);
                if (j8 < cVar.x + cVar.v) {
                    if (cVar.E) {
                        j9 += (k95Var != k95Var2 || k95Var3.isEmpty()) ? 0L : 1L;
                        i = i3;
                    }
                }
            }
            i = -1;
        }
        return new Pair<>(Long.valueOf(j9), Integer.valueOf(i));
    }

    public final a g(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        kh4 kh4Var = this.j;
        byte[] bArrRemove = ((jh4) kh4Var.a).remove(uri);
        if (bArrRemove != null) {
            ((jh4) kh4Var.a).put(uri, bArrRemove);
            return null;
        }
        of2 of2Var = new of2(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, 1);
        id4 id4Var = this.f[i];
        int iS = this.r.s();
        Object objV = this.r.v();
        byte[] bArr = this.m;
        a aVar = new a(this.c, of2Var, 3, id4Var, iS, objV, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr = n6b.b;
        }
        aVar.j = bArr;
        return aVar;
    }
}
