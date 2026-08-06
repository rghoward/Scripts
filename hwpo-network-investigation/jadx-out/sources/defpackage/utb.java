package defpackage;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class utb {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final had b = new had();
    public static final iad c = new iad();
    public static final /* synthetic */ int d = 0;

    public static String a(int i, int i2, int i3, String str, String str2) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i5 = i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        return b(str, i4, i5, str2, z, z2, z3, z4, 128);
    }

    public static String b(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) throws EOFException {
        char c2;
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) == 0 ? z4 : false;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z7) || z2a.p(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !c(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                tx0 tx0Var = new tx0();
                tx0Var.f0(i4, iCharCount, str);
                tx0 tx0Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (z5 && (iCodePointAt2 == 9 || iCodePointAt2 == 10 || iCodePointAt2 == 12 || iCodePointAt2 == 13)) {
                        g2b g2bVar = g2b.a;
                    } else {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            tx0Var.g0("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            tx0Var.g0(z5 ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z7) || z2a.p(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !c(iCharCount, length, str)))))) {
                                if (tx0Var2 == null) {
                                    tx0Var2 = new tx0();
                                }
                                tx0Var2.j0(iCodePointAt2);
                                while (!tx0Var2.z()) {
                                    byte b2 = tx0Var2.readByte();
                                    int i6 = b2 & MessagePack.Code.EXT_TIMESTAMP;
                                    tx0Var.Z(37);
                                    char[] cArr = a;
                                    tx0Var.Z(cArr[(i6 >> 4) & 15]);
                                    tx0Var.Z(cArr[b2 & 15]);
                                }
                                c2 = '%';
                                g2b g2bVar2 = g2b.a;
                            } else {
                                tx0Var.j0(iCodePointAt2);
                            }
                            iCharCount += Character.charCount(iCodePointAt2);
                            i5 = 128;
                        }
                    }
                    c2 = '%';
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                }
                return tx0Var.N();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    public static final boolean c(int i, int i2, String str) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && vtb.n(str.charAt(i + 1)) != -1 && vtb.n(str.charAt(i3)) != -1;
    }

    public static String d(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                tx0 tx0Var = new tx0();
                tx0Var.f0(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iN = vtb.n(str.charAt(iCharCount + 1));
                        int iN2 = vtb.n(str.charAt(i4));
                        if (iN == -1 || iN2 == -1) {
                            tx0Var.j0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            tx0Var.Z((iN << 4) + iN2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        tx0Var.Z(32);
                        iCharCount++;
                    } else {
                        tx0Var.j0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return tx0Var.N();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static boolean e(zq2 zq2Var, boolean z) {
        int i;
        pt7 pt7Var = new pt7(16);
        boolean z2 = true;
        while (true) {
            pt7Var.J(8);
            if (!zq2Var.f(pt7Var.a, 0, 8, true)) {
                break;
            }
            long jB = pt7Var.B();
            int iM = pt7Var.m();
            if (jB != 1) {
                i = 8;
            } else {
                if (!zq2Var.f(pt7Var.a, 8, 8, true)) {
                    break;
                }
                jB = pt7Var.F();
                i = 16;
            }
            long j = i;
            if (jB < j) {
                break;
            }
            int i2 = (int) (jB - j);
            if (z2) {
                if (iM != 1718909296 || i2 < 8) {
                    break;
                }
                pt7Var.J(4);
                zq2Var.f(pt7Var.a, 0, 4, false);
                if (pt7Var.m() != 1751476579) {
                    break;
                }
                if (!z) {
                    return true;
                }
                zq2Var.o(i2 - 4, false);
                z2 = false;
            } else {
                if (iM == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    zq2Var.o(i2, false);
                }
            }
        }
        return false;
    }

    public static dad f(Set set) {
        dad dadVar = new dad();
        dadVar.d = c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d9d d9dVar = (d9d) it.next();
            qzb.a(d9dVar, "key");
            boolean z = d9dVar.c;
            HashMap map = dadVar.b;
            HashMap map2 = dadVar.a;
            if (!z) {
                map.remove(d9dVar);
                map2.put(d9dVar, dad.e);
            } else {
                if (!z) {
                    z90.a("key must be repeating");
                    return null;
                }
                map2.remove(d9dVar);
                map.put(d9dVar, dad.f);
            }
        }
        return dadVar;
    }
}
