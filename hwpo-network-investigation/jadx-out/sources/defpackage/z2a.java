package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class z2a extends w2a {
    public static String A(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            z90.a(pk.d(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean B(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ta1.b(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String C(String str, String str2) {
        str.getClass();
        return w2a.n(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String D(String str, String str2) {
        return r(str2, str) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String E(String str) {
        return (str.length() >= 2 && w2a.n(str, "\"", false) && r("\"", str)) ? str.substring(1, str.length() - 1) : str;
    }

    public static StringBuilder F(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            r.b(a30.b("End index (", ") is less than start index (", ").", i2, i));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final void G(int i) {
        if (i >= 0) {
            return;
        }
        ca0.a(pp2.a(i, "Limit must be non-negative, but was "));
    }

    public static final List H(int i, CharSequence charSequence, String str) {
        G(i);
        int iS = s(charSequence, str, 0, false);
        if (iS == -1 || i == 1) {
            return ws0.h(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iS).toString());
            length = str.length() + iS;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iS = s(charSequence, str, length, false);
        } while (iS != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List I(CharSequence charSequence, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return H(i2, charSequence, str);
            }
        }
        G(i2);
        final List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        j52 j52Var = new j52(new rx2(charSequence, i2, new ci4() { // from class: y2a
            /* JADX WARN: Code duplicated, block: B:9:0x002c  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ci4
            public final Object invoke(Object obj, Object obj2) {
                Object next;
                js7 js7Var;
                String str2;
                Object next2;
                String str3;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence2.getClass();
                List list = listAsList;
                if (list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    fg5 fg5Var = new fg5(iIntValue, charSequence2.length(), 1);
                    boolean z = charSequence2 instanceof String;
                    int i3 = fg5Var.v;
                    int i4 = fg5Var.u;
                    if (!z) {
                        if ((i3 > 0 && iIntValue <= i4) || (i3 < 0 && i4 <= iIntValue)) {
                            int i5 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    str2 = (String) next;
                                } while (!z2a.B(str2, 0, charSequence2, i5, str2.length(), false));
                                String str4 = (String) next;
                                if (str4 == null) {
                                    if (i5 == i4) {
                                        js7Var = null;
                                        break;
                                    }
                                    i5 += i3;
                                } else {
                                    js7Var = new js7(Integer.valueOf(i5), str4);
                                    break;
                                }
                            }
                        } else {
                            js7Var = null;
                            break;
                        }
                    } else if ((i3 > 0 && iIntValue <= i4) || (i3 < 0 && i4 <= iIntValue)) {
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                str3 = (String) next2;
                            } while (!str3.regionMatches(0, (String) charSequence2, iIntValue, str3.length()));
                            String str5 = (String) next2;
                            if (str5 == null) {
                                if (iIntValue == i4) {
                                    js7Var = null;
                                    break;
                                }
                                iIntValue += i3;
                            } else {
                                js7Var = new js7(Integer.valueOf(iIntValue), str5);
                                break;
                            }
                        }
                    } else {
                        js7Var = null;
                        break;
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        px1.b("List is empty.");
                        return null;
                    }
                    if (size != 1) {
                        z90.a("List has more than one element.");
                        return null;
                    }
                    String str6 = (String) list.get(0);
                    int iU = z2a.u(charSequence2, str6, iIntValue, false, 4);
                    if (iU < 0) {
                        js7Var = null;
                        break;
                    }
                    js7Var = new js7(Integer.valueOf(iU), str6);
                }
                if (js7Var != null) {
                    return new js7(js7Var.t, Integer.valueOf(((String) js7Var.u).length()));
                }
                return null;
            }
        }));
        ArrayList arrayList = new ArrayList(ph1.n(j52Var, 10));
        Iterator it = j52Var.iterator();
        while (true) {
            rx2.a aVar = (rx2.a) it;
            if (!aVar.hasNext()) {
                return arrayList;
            }
            fg5 fg5Var = (fg5) aVar.next();
            fg5Var.getClass();
            arrayList.add(charSequence.subSequence(fg5Var.t, fg5Var.u + 1).toString());
        }
    }

    public static List J(String str, final char[] cArr) {
        if (cArr.length == 1) {
            return H(0, str, String.valueOf(cArr[0]));
        }
        G(0);
        j52 j52Var = new j52(new rx2(str, 0, new ci4() { // from class: x2a
            @Override // defpackage.ci4
            public final Object invoke(Object obj, Object obj2) {
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iV = z2a.v(charSequence, cArr, iIntValue, false);
                if (iV < 0) {
                    return null;
                }
                return new js7(Integer.valueOf(iV), 1);
            }
        }));
        ArrayList arrayList = new ArrayList(ph1.n(j52Var, 10));
        Iterator it = j52Var.iterator();
        while (true) {
            rx2.a aVar = (rx2.a) it;
            if (!aVar.hasNext()) {
                return arrayList;
            }
            fg5 fg5Var = (fg5) aVar.next();
            fg5Var.getClass();
            arrayList.add(str.subSequence(fg5Var.t, fg5Var.u + 1).toString());
        }
    }

    public static boolean K(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && ta1.b(charSequence.charAt(0), c, false);
    }

    public static String L(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iU = u(str, str2, 0, false, 6);
        return iU == -1 ? str3 : str.substring(str2.length() + iU, str.length());
    }

    public static String M(char c, String str, String str2) {
        int iY = y(str, c, 0, 6);
        return iY == -1 ? str2 : str.substring(iY + 1, str.length());
    }

    public static String N(String str, String str2) {
        str.getClass();
        str.getClass();
        int iX = x(6, str, str2);
        return iX == -1 ? str : str.substring(str2.length() + iX, str.length());
    }

    public static String O(String str, char c) {
        int iT = t(str, c, 0, 6);
        return iT == -1 ? str : str.substring(0, iT);
    }

    public static String P(String str, String str2) {
        int iU = u(str, str2, 0, false, 6);
        return iU == -1 ? str : str.substring(0, iU);
    }

    public static String Q(String str, char c) {
        str.getClass();
        str.getClass();
        int iY = y(str, c, 0, 6);
        return iY == -1 ? str : str.substring(0, iY);
    }

    public static CharSequence R(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zC = ta1.c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean o(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        return u(charSequence, str, 0, z, 2) >= 0;
    }

    public static boolean p(CharSequence charSequence, char c) {
        charSequence.getClass();
        return t(charSequence, c, 0, 2) >= 0;
    }

    public static boolean q(String str, char c) {
        return str.length() > 0 && ta1.b(str.charAt(str.length() - 1), c, false);
    }

    public static boolean r(String str, CharSequence charSequence) {
        return charSequence instanceof String ? w2a.h((String) charSequence, str, false) : B(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int s(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        fg5 fg5Var = new fg5(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = fg5Var.v;
        int i3 = fg5Var.u;
        int i4 = fg5Var.t;
        if (!z2 || !(str instanceof String)) {
            boolean z3 = z;
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (true) {
                    CharSequence charSequence2 = charSequence;
                    boolean z4 = z3;
                    int i5 = i4;
                    if (B(str, 0, charSequence2, i5, str.length(), z4)) {
                        return i5;
                    }
                    if (i5 != i3) {
                        i4 = i5 + i2;
                        charSequence = charSequence2;
                        z3 = z4;
                    }
                }
            }
        } else if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            int i6 = i4;
            while (true) {
                String str2 = str;
                boolean z5 = z;
                if (w2a.j(0, i6, str.length(), str2, (String) charSequence, z5)) {
                    return i6;
                }
                if (i6 != i3) {
                    i6 += i2;
                    str = str2;
                    z = z5;
                }
            }
        }
        return -1;
    }

    public static int t(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? v(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int u(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return s(charSequence, str, i, z);
    }

    public static final int v(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(u30.D(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (ta1.b(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean w(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ta1.c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int x(int i, String str, String str2) {
        int length;
        if ((i & 2) != 0) {
            str.getClass();
            length = str.length() - 1;
        } else {
            length = 0;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, length);
    }

    public static int y(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            charSequence.getClass();
            i = charSequence.length() - 1;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(u30.D(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (ta1.b(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static final List z(String str) {
        k86 k86Var = new k86(str);
        if (!k86Var.hasNext()) {
            return hf3.t;
        }
        Object next = k86Var.next();
        if (!k86Var.hasNext()) {
            return ws0.h(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (k86Var.hasNext()) {
            arrayList.add(k86Var.next());
        }
        return arrayList;
    }
}
