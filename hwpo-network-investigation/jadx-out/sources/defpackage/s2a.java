package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class s2a extends r2a {
    public static String b(String str) {
        Comparable comparable;
        String strSubstring;
        List listZ = z2a.z(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ) {
            if (!z2a.w((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!ta1.c(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listZ.size();
        int size2 = listZ.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listZ) {
            int i3 = i + 1;
            if (i < 0) {
                ws0.m();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == size2) && z2a.w(str3)) {
                strSubstring = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    ca0.a(pk.d(iIntValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        th1.E(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static String c(String str) {
        if (z2a.w("|")) {
            z90.a("marginPrefix must be non-blank string.");
            return null;
        }
        List listZ = z2a.z(str);
        int length = str.length();
        listZ.size();
        int size = listZ.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listZ) {
            int i2 = i + 1;
            if (i < 0) {
                ws0.m();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && z2a.w(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!ta1.c(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && w2a.m(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        th1.E(arrayList, sb, null, 124);
        return sb.toString();
    }
}
