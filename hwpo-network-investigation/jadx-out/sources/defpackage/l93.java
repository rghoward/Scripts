package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l93 implements Comparable<l93> {
    public static final a u = new a();
    public static final long v = o93.b(4611686018427387903L);
    public static final long w = o93.b(-4611686018427387903L);
    public static final long x = 9223372036854759646L;
    public final long t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jA = o93.a(j, j3);
        if (-4611686018426L > jA || jA >= 4611686018427L) {
            return o93.b(jA);
        }
        return o93.d((jA * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void e(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strA = z2a.A(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strA.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strA.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strA, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strA, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int f(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return xj5.c(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final int g(long j) {
        if (h(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean h(long j) {
        return j == v || j == w;
    }

    public static final long i(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? o93.b(j3 / 1000000) : o93.d(j3);
        }
        long jA = o93.a(j >> 1, j2 >> 1);
        if (jA != 9223372036854759646L) {
            return (jA == 4611686018427387903L || jA == -4611686018427387903L) ? o93.b(jA) : o93.c(jA);
        }
        z90.a("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    public static final long j(long j, q93 q93Var) {
        if (j == v) {
            return Long.MAX_VALUE;
        }
        if (j == w) {
            return Long.MIN_VALUE;
        }
        return q93Var.t.convert(j >> 1, ((((int) j) & 1) == 0 ? q93.NANOSECONDS : q93.MILLISECONDS).t);
    }

    public static final long k(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = n93.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(l93 l93Var) {
        return f(this.t, l93Var.t);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l93) {
            return this.t == ((l93) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.t);
    }

    public final String toString() {
        long jK = this.t;
        if (jK == 0) {
            return "0s";
        }
        if (jK == v) {
            return "Infinity";
        }
        if (jK == w) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = jK < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (jK < 0) {
            jK = k(jK);
        }
        long j = j(jK, q93.DAYS);
        int iJ = h(jK) ? 0 : (int) (j(jK, q93.HOURS) % 24);
        int iJ2 = h(jK) ? 0 : (int) (j(jK, q93.MINUTES) % 60);
        int iJ3 = h(jK) ? 0 : (int) (j(jK, q93.SECONDS) % 60);
        int iG = g(jK);
        boolean z2 = j != 0;
        boolean z3 = iJ != 0;
        boolean z4 = iJ2 != 0;
        boolean z5 = (iJ3 == 0 && iG == 0) ? false : true;
        if (z2) {
            sb.append(j);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iJ);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iJ2);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iJ3 != 0 || z2 || z3 || z4) {
                e(sb, iJ3, iG, 9, "s", false);
            } else if (iG >= 1000000) {
                e(sb, iG / 1000000, iG % 1000000, 6, "ms", false);
            } else if (iG >= 1000) {
                e(sb, iG / 1000, iG % 1000, 3, "us", false);
            } else {
                sb.append(iG);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
