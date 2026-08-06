package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class u30 extends gz3 {
    public static <T> int A(T[] tArr, T t) {
        tArr.getClass();
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (t.equals(tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int B(int[] iArr) {
        if (iArr.length == 0) {
            vl.b();
            return 0;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static Integer C(int[] iArr) {
        iArr.getClass();
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static char D(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            px1.b("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        z90.a("Array has more than one element.");
        return (char) 0;
    }

    public static <T> List<T> E(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        if (length == 0) {
            return hf3.t;
        }
        if (length == 1) {
            return ws0.h(tArr[0]);
        }
        List<T> listAsList = Arrays.asList(Arrays.copyOf(tArr, tArr.length));
        listAsList.getClass();
        return listAsList;
    }

    public static <T> Set<T> F(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return of3.t;
        }
        if (length == 1) {
            Set<T> setSingleton = Collections.singleton(tArr[0]);
            setSingleton.getClass();
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(pi6.g(tArr.length));
        for (T t : tArr) {
            linkedHashSet.add(t);
        }
        return linkedHashSet;
    }

    public static boolean t(Object obj, Object[] objArr) {
        objArr.getClass();
        return A(objArr, obj) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static boolean u(int[] iArr, int i) {
        iArr.getClass();
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public static ArrayList v(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T w(T[] tArr) {
        tArr.getClass();
        if (tArr.length != 0) {
            return tArr[0];
        }
        px1.b("Array is empty.");
        return null;
    }

    public static fg5 x(int[] iArr) {
        return new fg5(0, iArr.length - 1, 1);
    }

    public static int y(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Object z(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }
}
