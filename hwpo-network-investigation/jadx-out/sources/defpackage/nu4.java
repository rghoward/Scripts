package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class nu4 implements Iterable<js7<? extends String, ? extends String>>, zn5 {
    public static final nu4 u = new nu4(new String[0]);
    public final String[] t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ArrayList a = new ArrayList(20);

        public final void a(String str, String str2) {
            str.getClass();
            str2.getClass();
            rtb.b(str);
            rtb.c(str2, str);
            rtb.a(this, str, str2);
        }

        public final void b(String str) {
            int iT = z2a.t(str, ':', 1, 4);
            if (iT != -1) {
                rtb.a(this, str.substring(0, iT), str.substring(iT + 1));
            } else if (str.charAt(0) == ':') {
                rtb.a(this, BuildConfig.FLAVOR, str.substring(1));
            } else {
                rtb.a(this, BuildConfig.FLAVOR, str);
            }
        }

        public final void c(String str, String str2) {
            str.getClass();
            str2.getClass();
            rtb.b(str);
            rtb.a(this, str, str2);
        }

        public final nu4 d() {
            return new nu4((String[]) this.a.toArray(new String[0]));
        }

        public final String e(String str) {
            str.getClass();
            ArrayList arrayList = this.a;
            int size = arrayList.size() - 2;
            int iA = ie3.a(size, 0, -2);
            if (iA > size) {
                return null;
            }
            while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
                if (size == iA) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        public final void f(String str) {
            str.getClass();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.a;
                if (i >= arrayList.size()) {
                    return;
                }
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static nu4 a(String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (strArr2.length % 2 != 0) {
                z90.a("Expected alternating header names and values");
                return null;
            }
            String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            int length = strArr3.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (strArr3[i2] == null) {
                    z90.a("Headers cannot be null");
                    return null;
                }
                strArr3[i2] = z2a.R(strArr2[i2]).toString();
            }
            int iA = ie3.a(0, strArr3.length - 1, 2);
            if (iA >= 0) {
                while (true) {
                    String str = strArr3[i];
                    String str2 = strArr3[i + 1];
                    rtb.b(str);
                    rtb.c(str2, str);
                    if (i == iA) {
                        break;
                    }
                    i += 2;
                }
            }
            return new nu4(strArr3);
        }
    }

    public nu4(String[] strArr) {
        strArr.getClass();
        this.t = strArr;
    }

    public final String d(String str) {
        String[] strArr = this.t;
        strArr.getClass();
        int length = strArr.length - 2;
        int iA = ie3.a(length, 0, -2);
        if (iA > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iA) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String e(int i) {
        String str = (String) u30.z(i * 2, this.t);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nu4) {
            return Arrays.equals(this.t, ((nu4) obj).t);
        }
        return false;
    }

    public final a f() {
        a aVar = new a();
        ArrayList arrayList = aVar.a;
        arrayList.getClass();
        String[] strArr = this.t;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return aVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.t);
    }

    public final TreeMap i() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strE = e(i);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strE.toLowerCase(locale);
            lowerCase.getClass();
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(j(i));
        }
        return treeMap;
    }

    @Override // java.lang.Iterable
    public final Iterator<js7<? extends String, ? extends String>> iterator() {
        int size = size();
        js7[] js7VarArr = new js7[size];
        for (int i = 0; i < size; i++) {
            js7VarArr[i] = new js7(e(i), j(i));
        }
        return new i30(js7VarArr);
    }

    public final String j(int i) {
        String str = (String) u30.z((i * 2) + 1, this.t);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final List<String> k(String str) {
        str.getClass();
        int size = size();
        List<String> listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(j(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        return listUnmodifiableList == null ? hf3.t : listUnmodifiableList;
    }

    public final int size() {
        return this.t.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strE = e(i);
            String strJ = j(i);
            sb.append(strE);
            sb.append(": ");
            if (vtb.m(strE)) {
                strJ = "██";
            }
            sb.append(strJ);
            sb.append("\n");
        }
        return sb.toString();
    }
}
