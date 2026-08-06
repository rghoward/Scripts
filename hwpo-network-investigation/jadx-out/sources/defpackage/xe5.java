package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xe5 implements Comparable<xe5>, Serializable {
    public static final xe5 v = new xe5(0, -31557014167219200L);
    public static final xe5 w = new xe5(999999999, 31556889864403199L);
    public final long t;
    public final int u;

    public xe5(int i, long j) {
        this.t = j;
        this.u = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            z90.a("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(xe5 xe5Var) {
        xe5 xe5Var2 = xe5Var;
        xe5Var2.getClass();
        int iC = xj5.c(this.t, xe5Var2.t);
        return iC != 0 ? iC : xj5.b(this.u, xe5Var2.u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe5)) {
            return false;
        }
        xe5 xe5Var = (xe5) obj;
        return this.t == xe5Var.t && this.u == xe5Var.u;
    }

    public final int hashCode() {
        return (this.u * 51) + Long.hashCode(this.t);
    }

    public final String toString() {
        long j;
        int[] iArr;
        int i;
        StringBuilder sb = new StringBuilder();
        r1b.h.getClass();
        long j2 = this.t;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i2 = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i3 = (int) j8;
        int i4 = ((i3 * 5) + 2) / 153;
        int i5 = ((i4 + 2) % 12) + 1;
        int i6 = (i3 - (((i4 * 306) + 5) / 10)) + 1;
        int i7 = (int) (j7 + j + ((long) (i4 / 10)));
        int i8 = i2 / 3600;
        int i9 = i2 - (i8 * 3600);
        int i10 = i9 / 60;
        int i11 = i9 - (i10 * 60);
        int i12 = this.u;
        r1b r1bVar = new r1b(i7, i5, i6, i8, i10, i11, i12);
        int i13 = 0;
        if (Math.abs(i7) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i7 >= 0) {
                sb2.append(i7 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i7 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i7 >= 10000) {
                sb.append('+');
            }
            sb.append(i7);
        }
        sb.append('-');
        cf5.a(sb, sb, i5);
        sb.append('-');
        cf5.a(sb, sb, i6);
        sb.append('T');
        cf5.a(sb, sb, i8);
        sb.append(':');
        cf5.a(sb, sb, i10);
        sb.append(':');
        cf5.a(sb, sb, i11);
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                int i14 = i13 + 1;
                iArr = cf5.a;
                int i15 = iArr[i14];
                i = r1bVar.g;
                if (i % i15 != 0) {
                    break;
                }
                i13 = i14;
            }
            int i16 = i13 - (i13 % 3);
            String strValueOf = String.valueOf((i / iArr[i16]) + iArr[9 - i16]);
            strValueOf.getClass();
            sb.append(strValueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
