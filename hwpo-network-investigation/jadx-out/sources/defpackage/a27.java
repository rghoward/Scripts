package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a27 {
    public long[] a;
    public float[] b;
    public int c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [int] */
    /* JADX WARN: Type inference failed for: r19v3 */
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        long j;
        int iNumberOfTrailingZeros;
        boolean z4 = true;
        if (obj == this) {
            return true;
        }
        boolean z5 = false;
        if (!(obj instanceof a27)) {
            return false;
        }
        a27 a27Var = (a27) obj;
        float[] fArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (?? r14 = z5; r14 < i4; r14++) {
                    if ((255 & j2) < 128) {
                        float f = fArr[(i2 << 3) + r14];
                        int iHashCode = Float.hashCode(f) * (-862048943);
                        int i5 = iHashCode ^ (iHashCode << 16);
                        int i6 = i5 & 127;
                        z3 = z5;
                        int i7 = a27Var.c;
                        int i8 = (i5 >>> 7) & i7;
                        ?? r19 = z3;
                        while (true) {
                            long[] jArr2 = a27Var.a;
                            int i9 = i8 >> 3;
                            j = j3;
                            int i10 = (i8 & 7) << 3;
                            long j4 = (jArr2[i9] >>> i10) | ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63));
                            i = i3;
                            long j5 = j4 ^ (((long) i6) * 72340172838076673L);
                            for (long j6 = (~j5) & (j5 - 72340172838076673L) & j; j6 != 0; j6 &= j6 - 1) {
                                iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j6) >> 3)) & i7;
                                if (a27Var.b[iNumberOfTrailingZeros] == f) {
                                    break;
                                }
                            }
                            if ((j4 & ((~j4) << 6) & j) != 0) {
                                iNumberOfTrailingZeros = -1;
                                break;
                            }
                            int i11 = r19 + 8;
                            i8 = (i8 + i11) & i7;
                            i3 = i;
                            j3 = j;
                            r19 = i11;
                        }
                        if (iNumberOfTrailingZeros < 0) {
                            return z3;
                        }
                    } else {
                        z3 = z5;
                        i = i3;
                        j = j3;
                    }
                    j2 >>= i;
                    i3 = i;
                    z4 = z4;
                    z5 = z3;
                    j3 = j;
                }
                z = z4;
                z2 = z5;
                if (i4 != i3) {
                    return z;
                }
            } else {
                z = z4;
                z2 = z5;
            }
            if (i2 == length) {
                return z;
            }
            i2++;
            z4 = z;
            z5 = z2;
        }
    }

    public final int hashCode() {
        float[] fArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        iHashCode = Float.hashCode(fArr[(i << 3) + i3]) + iHashCode;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b A[DONT_INVERT, PHI: r5
      0x005b: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0024, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:0: B:5:0x0016->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        float[] fArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        float f = fArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(f);
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i++;
        }
        return sb.toString();
    }
}
