package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ab extends zk0 {
    public final cj0 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final k95<a> o;
    public final z7a p;
    public float q;
    public int r;
    public int s;
    public long t;
    public xm6 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
    }

    public ab(esa esaVar, int[] iArr, cj0 cj0Var, k95 k95Var) {
        super(esaVar, iArr);
        this.g = cj0Var;
        this.h = 10000000L;
        this.i = 25000000L;
        this.j = 25000000L;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = k95.q(k95Var);
        this.p = vf1.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void e(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            k95.a aVar = (k95.a) arrayList.get(i);
            if (aVar != null) {
                aVar.c(new a(j, jArr[i]));
            }
        }
    }

    public static long g(List list) {
        if (!list.isEmpty()) {
            xm6 xm6Var = (xm6) nr1.b(list);
            long j = xm6Var.g;
            if (j != -9223372036854775807L) {
                long j2 = xm6Var.h;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int f(long j, long j2) {
        long jE = (long) (((long) (this.g.e() * this.m)) / this.q);
        k95<a> k95Var = this.o;
        if (!k95Var.isEmpty()) {
            int i = 1;
            while (i < k95Var.size() - 1 && k95Var.get(i).a < jE) {
                i++;
            }
            a aVar = k95Var.get(i - 1);
            a aVar2 = k95Var.get(i);
            long j3 = aVar.a;
            float f = (jE - j3) / (aVar2.a - j3);
            long j4 = aVar.b;
            jE = ((long) (f * (aVar2.b - j4))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !j(i3, j)) {
                if (this.d[i3].j <= jE) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.zk0, defpackage.fq3
    public final void i() {
        this.u = null;
    }

    @Override // defpackage.fq3
    public final void k(long j, long j2, long j3, List<? extends xm6> list, ym6[] ym6VarArr) {
        long jG;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        int i2 = 0;
        if (i >= ym6VarArr.length || !ym6VarArr[i].next()) {
            int length = ym6VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    jG = g(list);
                    break;
                }
                ym6 ym6Var = ym6VarArr[i3];
                if (ym6Var.next()) {
                    jG = ym6Var.b() - ym6Var.a();
                    break;
                }
                i3++;
            }
        } else {
            ym6 ym6Var2 = ym6VarArr[this.r];
            jG = ym6Var2.b() - ym6Var2.a();
        }
        int i4 = this.s;
        if (i4 == 0) {
            this.s = 1;
            this.r = f(jElapsedRealtime, jG);
            return;
        }
        int i5 = this.r;
        boolean zIsEmpty = list.isEmpty();
        id4[] id4VarArr = this.d;
        if (!zIsEmpty) {
            id4 id4Var = ((xm6) nr1.b(list)).d;
            while (true) {
                if (i2 >= this.b) {
                    i2 = -1;
                    break;
                } else if (id4VarArr[i2] == id4Var) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i2 = -1;
            break;
        }
        if (i2 != -1) {
            i4 = ((xm6) nr1.b(list)).e;
            i5 = i2;
        }
        int iF = f(jElapsedRealtime, jG);
        if (iF != i5 && !j(i5, jElapsedRealtime)) {
            id4 id4Var2 = id4VarArr[i5];
            id4 id4Var3 = id4VarArr[iF];
            long jMin = this.h;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jG != -9223372036854775807L ? j3 - jG : j3) * this.n), jMin);
            }
            int i6 = id4Var3.j;
            int i7 = id4Var2.j;
            if ((i6 > i7 && j2 < jMin) || (i6 < i7 && j2 >= this.i)) {
                iF = i5;
            }
        }
        if (iF != i5) {
            i4 = 3;
        }
        this.s = i4;
        this.r = iF;
    }

    @Override // defpackage.fq3
    public final int l() {
        return this.r;
    }

    @Override // defpackage.zk0, defpackage.fq3
    public final void o() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.zk0, defpackage.fq3
    public final int p(long j, List<? extends xm6> list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((xm6) nr1.b(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (xm6) nr1.b(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jA = n6b.A(this.q, list.get(size - 1).g - j);
        long j3 = this.j;
        if (jA >= j3) {
            id4 id4Var = this.d[f(jElapsedRealtime, g(list))];
            for (int i3 = 0; i3 < size; i3++) {
                xm6 xm6Var = list.get(i3);
                id4 id4Var2 = xm6Var.d;
                if (n6b.A(this.q, xm6Var.g - j) >= j3 && id4Var2.j < id4Var.j && (i = id4Var2.w) != -1 && i <= this.l && (i2 = id4Var2.v) != -1 && i2 <= this.k && i < id4Var.w) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.fq3
    public final int s() {
        return this.s;
    }

    @Override // defpackage.zk0, defpackage.fq3
    public final void u(float f) {
        this.q = f;
    }

    @Override // defpackage.fq3
    public final Object v() {
        return null;
    }
}
