package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o93 {
    public static final long a(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : uh8.h(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final long b(long j) {
        long j2 = (j << 1) + 1;
        l93.u.getClass();
        int i = n93.a;
        return j2;
    }

    public static final long c(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? b(uh8.h(j, -4611686018427387903L, 4611686018427387903L)) : d(j * 1000000);
    }

    public static final long d(long j) {
        l93.a aVar = l93.u;
        long j2 = j << 1;
        int i = n93.a;
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0199 A[LOOP:7: B:106:0x0197->B:107:0x0199, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x0221  */
    /* JADX WARN: Code duplicated, block: B:139:0x0225  */
    /* JADX WARN: Code duplicated, block: B:141:0x0229  */
    /* JADX WARN: Code duplicated, block: B:143:0x022d  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:0x0235  */
    /* JADX WARN: Code duplicated, block: B:148:0x0238  */
    /* JADX WARN: Code duplicated, block: B:149:0x023a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0213 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0192 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    public static long e(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        long j2;
        char cCharAt;
        q93 q93Var;
        char cCharAt2;
        q93 q93Var2;
        long jA;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        int i15;
        double d;
        long jC;
        char cCharAt3;
        int i16;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        int i17;
        int i18;
        char cCharAt7;
        if (str.length() == 0) {
            z90.a("The string is empty");
            return 0L;
        }
        char cCharAt8 = str.charAt(0);
        int i19 = 1;
        char c = '-';
        char c2 = '+';
        if (cCharAt8 != '+') {
            i2 = cCharAt8 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            z90.a("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            z90.a(BuildConfig.FLAVOR);
            return 0L;
        }
        int i20 = i2 + 1;
        if (i20 == str.length()) {
            z90.a(BuildConfig.FLAVOR);
            return 0L;
        }
        int i21 = 0;
        q93 q93Var3 = null;
        long jC2 = 0;
        long j3 = 0;
        while (i20 < str.length()) {
            char cCharAt9 = str.charAt(i20);
            if (cCharAt9 != 'T') {
                oe6 oe6Var = oe6.c;
                int i22 = i19;
                char cCharAt10 = str.charAt(i20);
                if (cCharAt10 != c2) {
                    if (cCharAt10 != c) {
                        i3 = i20;
                    } else {
                        i3 = i20 + 1;
                        i4 = -1;
                    }
                    while (i3 < str.length() && str.charAt(i3) == '0') {
                        i3++;
                    }
                    j = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            cCharAt6 = str.charAt(i3);
                            i5 = i20;
                            if ('0' > cCharAt6 && cCharAt6 < ':') {
                                i17 = cCharAt6 - '0';
                                i18 = i;
                                long j4 = oe6Var.a;
                                if (j > j4 || (j == j4 && i17 > oe6Var.b)) {
                                    i6 = i18;
                                    while (i3 < str.length() && '0' <= (cCharAt7 = str.charAt(i3)) && cCharAt7 < ':') {
                                        i3++;
                                    }
                                    if (i3 != str.length()) {
                                        if (i3 != i5 + ((cCharAt9 == '+' || cCharAt9 == '-') ? i22 : 0)) {
                                            j = 4611686018427387903L;
                                        }
                                    }
                                    z90.a(BuildConfig.FLAVOR);
                                    return 0L;
                                }
                                j = (j << 3) + (j << i22) + ((long) i17);
                                i3++;
                                i20 = i5;
                                oe6Var = oe6Var;
                                i = i18;
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            q93Var = q93.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                for (i9 = i8; i9 < iMin; i9++) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                        for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                            i10 = (i10 << 1) + (i10 << 3);
                                        }
                                        iMin2 = Math.min(i9 + 9, str.length());
                                        i12 = i9;
                                        i13 = 0;
                                        while (true) {
                                            if (i12 < iMin2) {
                                                i16 = iMin2;
                                                cCharAt4 = str.charAt(i12);
                                                i14 = i12;
                                                if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                    i12 = i14 + 1;
                                                    iMin2 = i16;
                                                }
                                            } else {
                                                i14 = i12;
                                            }
                                        }
                                        for (i15 = 0; i15 < 9 - (i14 - i9); i15++) {
                                            i13 = (i13 << 1) + (i13 << 3);
                                        }
                                        i3 = i14;
                                        while (i3 < str.length() && '0' <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < ':') {
                                            i3++;
                                        }
                                        if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                            z90.a(BuildConfig.FLAVOR);
                                            return 0L;
                                        }
                                        long j5 = (((long) i10) * 1000000000) + ((long) i13);
                                        long j6 = i4;
                                        double d2 = j5;
                                        switch (q93Var.ordinal()) {
                                            case 0:
                                                d = 1.0E-15d;
                                                jC = wk6.c(d2 * d);
                                                break;
                                            case 1:
                                                d = 1.0E-12d;
                                                jC = wk6.c(d2 * d);
                                                break;
                                            case 2:
                                                d = 1.0E-9d;
                                                jC = wk6.c(d2 * d);
                                                break;
                                            case 3:
                                                d = 1.0E-6d;
                                                jC = wk6.c(d2 * d);
                                                break;
                                            case 4:
                                                d = 6.0E-5d;
                                                jC = wk6.c(d2 * d);
                                                break;
                                            case 5:
                                                d = 0.0036d;
                                                jC = wk6.c(d2 * d);
                                                break;
                                            case 6:
                                                d = 0.0864d;
                                                jC = wk6.c(d2 * d);
                                                break;
                                            default:
                                                tn2.d(q93Var, "Unknown unit: ");
                                                jC = 0;
                                                break;
                                        }
                                        j3 = jC * j6;
                                    } else {
                                        i10 = (cCharAt5 - '0') + (i10 << 3) + (i10 << 1);
                                    }
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                z90.a(BuildConfig.FLAVOR);
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            q93Var2 = q93.DAYS;
                            if (cCharAt2 == 'D') {
                                q93Var = q93Var2;
                            } else if (cCharAt2 == 'H') {
                                q93Var = q93.HOURS;
                            } else if (cCharAt2 == 'M') {
                                q93Var = q93.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                q93Var = null;
                            }
                            if (q93Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (q93Var3 == null && q93Var3.compareTo(q93Var) <= 0) {
                                z90.a("Unexpected order of duration components");
                                return 0L;
                            }
                            if (q93Var == q93Var2) {
                                if (i21 != 0) {
                                    z90.a(BuildConfig.FLAVOR);
                                    return 0L;
                                }
                                jC2 = un2.c(j2, q93Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    z90.a(BuildConfig.FLAVOR);
                                    return 0L;
                                }
                                jA = a(jC2, un2.c(j2, q93Var) * ((long) i4));
                                if (jA == 9223372036854759646L) {
                                    z90.a(BuildConfig.FLAVOR);
                                    return 0L;
                                }
                                jC2 = jA;
                            }
                            i20 = i3 + 1;
                            q93Var3 = q93Var;
                            i19 = i22;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        } else {
                            i5 = i20;
                        }
                        i6 = i;
                        if (i3 == str.length()) {
                            if (cCharAt9 != '+' || cCharAt9 == '-') {
                                i7 = i22;
                            } else {
                                i7 = 0;
                            }
                            if (i3 == i5 + i7) {
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            q93Var = q93.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        if (i12 < iMin2) {
                                            i16 = iMin2;
                                            cCharAt4 = str.charAt(i12);
                                            i14 = i12;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                        i12 = i14 + 1;
                                        iMin2 = i16;
                                    }
                                    while (i15 < 9 - (i14 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i14;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    z90.a(BuildConfig.FLAVOR);
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                z90.a(BuildConfig.FLAVOR);
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            q93Var2 = q93.DAYS;
                            if (cCharAt2 == 'D') {
                                q93Var = q93Var2;
                            } else if (cCharAt2 == 'H') {
                                q93Var = q93.HOURS;
                            } else if (cCharAt2 == 'M') {
                                q93Var = q93.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                q93Var = null;
                            }
                            if (q93Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (q93Var3 == null) {
                            }
                            if (q93Var == q93Var2) {
                                if (i21 != 0) {
                                    z90.a(BuildConfig.FLAVOR);
                                    return 0L;
                                }
                                jC2 = un2.c(j2, q93Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    z90.a(BuildConfig.FLAVOR);
                                    return 0L;
                                }
                                jA = a(jC2, un2.c(j2, q93Var) * ((long) i4));
                                if (jA == 9223372036854759646L) {
                                    z90.a(BuildConfig.FLAVOR);
                                    return 0L;
                                }
                                jC2 = jA;
                            }
                            i20 = i3 + 1;
                            q93Var3 = q93Var;
                            i19 = i22;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        }
                        z90.a(BuildConfig.FLAVOR);
                        return 0L;
                    }
                }
                i3 = i20 + 1;
                i4 = i22;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        cCharAt6 = str.charAt(i3);
                        i5 = i20;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        i5 = i20;
                    }
                    i6 = i;
                    if (i3 == str.length()) {
                        if (cCharAt9 != '+') {
                            i7 = i22;
                        } else {
                            i7 = i22;
                        }
                        if (i3 == i5 + i7) {
                        }
                        j2 = j;
                        cCharAt = str.charAt(i3);
                        q93Var = q93.SECONDS;
                        if (cCharAt == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            while (i9 < iMin) {
                                cCharAt5 = str.charAt(i9);
                                if ('0' <= cCharAt5) {
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                z90.a(BuildConfig.FLAVOR);
                                return 0L;
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i12 = i9;
                            i13 = 0;
                            while (true) {
                                if (i12 < iMin2) {
                                    i16 = iMin2;
                                    cCharAt4 = str.charAt(i12);
                                    i14 = i12;
                                    if ('0' > cCharAt4) {
                                    }
                                } else {
                                    i14 = i12;
                                }
                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                i12 = i14 + 1;
                                iMin2 = i16;
                            }
                            while (i15 < 9 - (i14 - i9)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            i3 = i14;
                            while (i3 < str.length()) {
                                i3++;
                            }
                            if (i3 != i8) {
                            }
                            z90.a(BuildConfig.FLAVOR);
                            return 0L;
                        }
                        cCharAt2 = str.charAt(i3);
                        q93Var2 = q93.DAYS;
                        if (cCharAt2 == 'D') {
                            q93Var = q93Var2;
                        } else if (cCharAt2 == 'H') {
                            q93Var = q93.HOURS;
                        } else if (cCharAt2 == 'M') {
                            q93Var = q93.MINUTES;
                        } else if (cCharAt2 != 'S') {
                            q93Var = null;
                        }
                        if (q93Var == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (q93Var3 == null) {
                        }
                        if (q93Var == q93Var2) {
                            if (i21 != 0) {
                                z90.a(BuildConfig.FLAVOR);
                                return 0L;
                            }
                            jC2 = un2.c(j2, q93Var) * ((long) i4);
                        } else {
                            if (i21 == 0) {
                                z90.a(BuildConfig.FLAVOR);
                                return 0L;
                            }
                            jA = a(jC2, un2.c(j2, q93Var) * ((long) i4));
                            if (jA == 9223372036854759646L) {
                                z90.a(BuildConfig.FLAVOR);
                                return 0L;
                            }
                            jC2 = jA;
                        }
                        i20 = i3 + 1;
                        q93Var3 = q93Var;
                        i19 = i22;
                        i = i6;
                        c = '-';
                        c2 = '+';
                    }
                    z90.a(BuildConfig.FLAVOR);
                    return 0L;
                    j = (j << 3) + (j << i22) + ((long) i17);
                    i3++;
                    i20 = i5;
                    oe6Var = oe6Var;
                    i = i18;
                }
            } else {
                if (i21 != 0 || (i20 = i20 + 1) == str.length()) {
                    z90.a(BuildConfig.FLAVOR);
                    return 0L;
                }
                i21 = i19;
            }
        }
        int i23 = i;
        long jI = l93.i(g(jC2, q93.MILLISECONDS), g(j3, q93.NANOSECONDS));
        return (i23 == 0 || jI == l93.x) ? jI : l93.k(jI);
    }

    public static final long f(int i, q93 q93Var) {
        if (q93Var.compareTo(q93.SECONDS) > 0) {
            return g(i, q93Var);
        }
        return d(TimeUnit.NANOSECONDS.convert(i, q93Var.t));
    }

    public static final long g(long j, q93 q93Var) {
        TimeUnit timeUnit = q93Var.t;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            return d(timeUnit2.convert(j, timeUnit));
        }
        if (q93Var.compareTo(q93.MILLISECONDS) < 0) {
            return b(uh8.h(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return b(un2.c(Math.abs(j), q93Var) * jSignum);
    }
}
