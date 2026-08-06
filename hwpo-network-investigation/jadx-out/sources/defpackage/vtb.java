package defpackage;

import io.ably.lib.http.HttpConstants;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vtb {
    public static final byte[] a = new byte[0];
    public static final yk7 b;

    static {
        g01 g01Var = g01.w;
        g01[] g01VarArr = {g01.a.b("efbbbf"), g01.a.b("feff"), g01.a.b("fffe0000"), g01.a.b("fffe"), g01.a.b("0000feff")};
        ArrayList arrayList = new ArrayList(new f30(g01VarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList2.set(ws0.d(arrayList, g01VarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((g01) arrayList.get(0)).g() <= 0) {
            z90.a("the empty byte string is not a supported option");
            return;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            g01 g01Var2 = (g01) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                g01 g01Var3 = (g01) arrayList.get(i6);
                g01Var3.getClass();
                g01Var2.getClass();
                if (!g01Var3.o(0, g01Var2, g01Var2.g())) {
                    break;
                }
                if (g01Var3.g() == g01Var2.g()) {
                    r.a(g01Var3, "duplicate option: ");
                    return;
                } else if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    ((Number) arrayList2.remove(i6)).intValue();
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        tx0 tx0Var = new tx0();
        yk7.a.a(0L, tx0Var, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (tx0Var.u / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = tx0Var.readInt();
        }
        b = new yk7((g01[]) Arrays.copyOf(g01VarArr, 5), iArr);
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbB = ao3.b("length=", j, ", offset=");
            sbB.append(j2);
            sbB.append(", count=");
            sbB.append(j2);
            throw new ArrayIndexOutOfBoundsException(sbB.toString());
        }
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void c(fy3 fy3Var, du7 du7Var) throws IOException {
        fy3Var.getClass();
        try {
            IOException iOException = null;
            for (du7 du7Var2 : fy3Var.y(du7Var)) {
                try {
                    if (fy3Var.B(du7Var2).b) {
                        c(fy3Var, du7Var2);
                    }
                    fy3Var.t(du7Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void d(r13 r13Var, du7 du7Var) {
        r13Var.getClass();
        du7Var.getClass();
        try {
            r13Var.u.t(du7Var);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(int i, int i2, String str, String str2) {
        str.getClass();
        while (i < i2) {
            if (z2a.p(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, char c, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return f(str, c, i, i2);
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int i(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (xj5.b(cCharAt, 31) <= 0 || xj5.b(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int j(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int k(int i, int i2, String str) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] l(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean m(String str) {
        str.getClass();
        return str.equalsIgnoreCase(HttpConstants.Headers.AUTHORIZATION) || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase(HttpConstants.Headers.PROXY_AUTHORIZATION) || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int n(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int o(hy0 hy0Var) {
        hy0Var.getClass();
        return (hy0Var.readByte() & MessagePack.Code.EXT_TIMESTAMP) | ((hy0Var.readByte() & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((hy0Var.readByte() & MessagePack.Code.EXT_TIMESTAMP) << 8);
    }

    public static final int p(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
