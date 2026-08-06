package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class y6b implements Comparable<y6b>, Serializable {
    public static final y6b v = new y6b(0, 0);
    public final long t;
    public final long u;

    public y6b(long j, long j2) {
        this.t = j;
        this.u = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(y6b y6bVar) {
        y6b y6bVar2 = y6bVar;
        y6bVar2.getClass();
        long j = y6bVar2.t;
        long j2 = this.t;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.u ^ Long.MIN_VALUE, y6bVar2.u ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6b)) {
            return false;
        }
        y6b y6bVar = (y6b) obj;
        return this.t == y6bVar.t && this.u == y6bVar.u;
    }

    public final int hashCode() {
        return Long.hashCode(this.t ^ this.u);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        iw5.c(this.t, bArr, 0, 0, 4);
        bArr[8] = 45;
        iw5.c(this.t, bArr, 9, 4, 6);
        bArr[13] = 45;
        iw5.c(this.t, bArr, 14, 6, 8);
        bArr[18] = 45;
        iw5.c(this.u, bArr, 19, 0, 2);
        bArr[23] = 45;
        iw5.c(this.u, bArr, 24, 2, 8);
        return new String(bArr, ua1.b);
    }
}
