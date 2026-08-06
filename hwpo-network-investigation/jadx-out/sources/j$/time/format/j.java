package j$.time.format;

import j$.time.temporal.TemporalField;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public class j implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final TemporalField a;
    public final int b;
    public final int c;
    public final d0 d;
    public final int e;

    public j(TemporalField temporalField, int i, int i2, d0 d0Var) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = d0Var;
        this.e = 0;
    }

    @Override // j$.time.format.e
    public int E(v vVar, CharSequence charSequence, int i) {
        boolean z;
        boolean z2;
        BigInteger bigIntegerAdd;
        boolean z3;
        int i2;
        long j;
        DateTimeFormatter dateTimeFormatter;
        int i3 = i;
        DateTimeFormatter dateTimeFormatter2 = vVar.a;
        int length = charSequence.length();
        if (i3 == length) {
            return ~i3;
        }
        char cCharAt = charSequence.charAt(i);
        DecimalStyle decimalStyle = dateTimeFormatter2.c;
        decimalStyle.getClass();
        int i4 = this.c;
        d0 d0Var = this.d;
        int i5 = this.b;
        int i6 = 0;
        boolean z4 = true;
        if (cCharAt == '+') {
            boolean z5 = vVar.c;
            boolean z6 = i5 == i4;
            int iOrdinal = d0Var.ordinal();
            if (iOrdinal == 0 ? z5 : !(iOrdinal == 1 || iOrdinal == 4 || (!z5 && !z6))) {
                return ~i3;
            }
            i3++;
            z = false;
            z2 = true;
        } else if (cCharAt == decimalStyle.b) {
            boolean z7 = vVar.c;
            boolean z8 = i5 == i4;
            int iOrdinal2 = d0Var.ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z7 || z8)) {
                return ~i3;
            }
            i3++;
            z2 = false;
            z = true;
        } else {
            if (d0Var == d0.ALWAYS && vVar.c) {
                return ~i3;
            }
            z = false;
            z2 = false;
        }
        int i7 = (vVar.c || b(vVar)) ? i5 : 1;
        int i8 = i3 + i7;
        if (i8 > length) {
            return ~i3;
        }
        if (!vVar.c && !b(vVar)) {
            i4 = 9;
        }
        int i9 = this.e;
        int iMax = Math.max(i9, 0) + i4;
        while (true) {
            bigIntegerAdd = null;
            if (i6 >= 2) {
                z3 = z;
                i2 = i3;
                j = 0;
                break;
            }
            int iMin = Math.min(i3 + iMax, length);
            boolean z9 = z4;
            long j2 = 0;
            int i10 = i3;
            while (true) {
                if (i10 >= iMin) {
                    dateTimeFormatter = dateTimeFormatter2;
                    break;
                }
                int i11 = i10 + 1;
                int iCharAt = charSequence.charAt(i10) - dateTimeFormatter2.c.a;
                dateTimeFormatter = dateTimeFormatter2;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt < 0) {
                    if (i10 >= i8) {
                        break;
                    }
                    return ~i3;
                }
                if (i11 - i3 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j2);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(iCharAt));
                } else {
                    j2 = (j2 * 10) + ((long) iCharAt);
                }
                i10 = i11;
                dateTimeFormatter2 = dateTimeFormatter;
                length = length;
                z = z;
            }
            int i12 = length;
            z3 = z;
            if (i9 <= 0 || i6 != 0) {
                i2 = i10;
                j = j2;
                break;
            }
            int iMax2 = Math.max(i7, (i10 - i3) - i9);
            i6++;
            z4 = z9;
            dateTimeFormatter2 = dateTimeFormatter;
            length = i12;
            z = z3;
            iMax = iMax2;
        }
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z3) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && vVar.c) {
                    return ~(i3 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j == 0 && vVar.c) {
                    return ~(i3 - 1);
                }
                j = -j;
            }
        } else if (d0Var == d0.EXCEEDS_PAD && vVar.c) {
            int i13 = i2 - i3;
            if (z2) {
                if (i13 <= i5) {
                    return ~(i3 - 1);
                }
            } else if (i13 > i5) {
                return ~i3;
            }
        }
        if (bigIntegerDivide == null) {
            return c(vVar, j, i3, i2);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i2--;
        }
        return c(vVar, bigIntegerDivide.longValue(), i3, i2);
    }

    public boolean b(v vVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == d0.NOT_NEGATIVE;
        }
        return true;
    }

    public int c(v vVar, long j, int i, int i2) {
        return vVar.g(this.a, j, i, i2);
    }

    public j d() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    public j e(int i) {
        return new j(this.a, this.b, this.c, this.d, this.e + i);
    }

    public String toString() {
        int i = this.c;
        TemporalField temporalField = this.a;
        d0 d0Var = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && d0Var == d0.NORMAL) {
            return "Value(" + temporalField + ")";
        }
        if (i2 == i && d0Var == d0.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i2 + ")";
        }
        return "Value(" + temporalField + "," + i2 + "," + i + "," + d0Var + ")";
    }

    @Override // j$.time.format.e
    public boolean z(x xVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long lA = xVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        long jA = a(xVar, lA.longValue());
        DecimalStyle decimalStyle = xVar.b.c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.b("Field " + temporalField + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        String strA = decimalStyle.a(string);
        int i2 = this.b;
        d0 d0Var = this.d;
        if (jA >= 0) {
            int i3 = b.a[d0Var.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[d0Var.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append(decimalStyle.b);
            } else if (i4 == 4) {
                throw new j$.time.b("Field " + temporalField + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - strA.length(); i5++) {
            sb.append(decimalStyle.a);
        }
        sb.append(strA);
        return true;
    }

    public j(TemporalField temporalField, int i, int i2, d0 d0Var, int i3) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = d0Var;
        this.e = i3;
    }

    public long a(x xVar, long j) {
        return j;
    }
}
