package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zk0 implements fq3 {
    public final esa a;
    public final int b;
    public final int[] c;
    public final id4[] d;
    public final long[] e;
    public int f;

    public zk0(esa esaVar, int[] iArr) {
        id4[] id4VarArr;
        int i = 0;
        xl7.r(iArr.length > 0);
        esaVar.getClass();
        this.a = esaVar;
        int length = iArr.length;
        this.b = length;
        this.d = new id4[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            id4VarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            id4VarArr[i2] = esaVar.d[iArr[i2]];
            i2++;
        }
        Arrays.sort(id4VarArr, new yk0());
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = esaVar.a(this.d[i]);
                i++;
            }
        }
    }

    @Override // defpackage.jsa
    public final esa a() {
        return this.a;
    }

    @Override // defpackage.jsa
    public final id4 b(int i) {
        return this.d[i];
    }

    @Override // defpackage.jsa
    public final int c(int i) {
        return this.c[i];
    }

    @Override // defpackage.jsa
    public final int d(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zk0 zk0Var = (zk0) obj;
            if (this.a.equals(zk0Var.a) && Arrays.equals(this.c, zk0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.fq3
    public final boolean j(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.jsa
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.fq3
    public int p(long j, List<? extends xm6> list) {
        return list.size();
    }

    @Override // defpackage.fq3
    public final int q() {
        return this.c[l()];
    }

    @Override // defpackage.fq3
    public final id4 r() {
        return this.d[l()];
    }

    @Override // defpackage.fq3
    public final boolean t(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zJ = j(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zJ) {
            zJ = (i2 == i || j(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zJ) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], n6b.a(jElapsedRealtime, j));
        return true;
    }

    @Override // defpackage.fq3
    public void i() {
    }

    @Override // defpackage.fq3
    public void o() {
    }

    @Override // defpackage.fq3
    public final void n(boolean z) {
    }

    @Override // defpackage.fq3
    public void u(float f) {
    }
}
