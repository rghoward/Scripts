package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q9d extends v2 {
    public final Object[] d;
    public final StringBuilder e;
    public int f;

    public q9d(gyb gybVar, Object[] objArr, StringBuilder sb) {
        super(gybVar);
        this.f = 0;
        this.d = objArr;
        this.e = sb;
    }

    public static void e(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(z9d.a(obj));
        sb.append("]");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0128  */
    /* JADX WARN: Code duplicated, block: B:108:0x012e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:64:0x0090  */
    public final void d(Object obj, r9d r9dVar, x9d x9dVar) {
        String simpleName;
        x9d x9dVar2;
        boolean zIsValidCodePoint;
        int i = r9dVar.u;
        String string = r9dVar.w;
        int iA = uu3.a(i);
        StringBuilder sb = this.e;
        if (iA != 0) {
            if (iA == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iA != 2) {
                if (iA != 3) {
                    if (iA != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                e(sb, obj, string);
                return;
            }
        }
        int iOrdinal = r9dVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (x9dVar.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 5) {
                        if (x9dVar.a()) {
                            x9dVar2 = x9dVar;
                        } else {
                            int i2 = x9dVar.a;
                            int i3 = i2 & 128;
                            if (i3 == 0) {
                                x9dVar2 = x9d.e;
                            } else if (i3 == i2 && x9dVar.b == -1 && x9dVar.c == -1) {
                                x9dVar2 = x9dVar;
                            } else {
                                x9dVar2 = new x9d(i3, -1, -1);
                            }
                        }
                        if (x9dVar2.equals(x9dVar)) {
                            Number number = (Number) obj;
                            Locale locale = z9d.a;
                            boolean zC = x9dVar.c();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                z9d.b(sb, jLongValue, zC);
                                return;
                            }
                            if (number instanceof Integer) {
                                z9d.b(sb, jLongValue & 4294967295L, zC);
                                return;
                            }
                            if (number instanceof Byte) {
                                z9d.b(sb, jLongValue & 255, zC);
                                return;
                            }
                            if (number instanceof Short) {
                                z9d.b(sb, jLongValue & 65535, zC);
                                return;
                            }
                            if (!(number instanceof BigInteger)) {
                                aa0.c("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                return;
                            }
                            String string2 = ((BigInteger) number).toString(16);
                            if (zC) {
                                string2 = string2.toUpperCase(z9d.a);
                            }
                            sb.append(string2);
                            return;
                        }
                    }
                } else if (x9dVar.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (x9dVar.a()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = z9d.a;
                int i4 = x9dVar.a;
                int i5 = i4 & 162;
                if (i5 != 0) {
                    i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & 128) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, z9d.a);
                try {
                    formattable.formatTo(formatter, i5, x9dVar.b, x9dVar.c);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        appendableOut.append(z9d.c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (x9dVar.a()) {
                sb.append(z9d.a(obj));
                return;
            }
        }
        if (!x9dVar.a()) {
            int i6 = r9dVar.t;
            if (x9dVar.c()) {
                i6 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            x9dVar.d(sb2);
            sb2.append((char) i6);
            string = sb2.toString();
        }
        sb.append(String.format(z9d.a, string, obj));
    }
}
