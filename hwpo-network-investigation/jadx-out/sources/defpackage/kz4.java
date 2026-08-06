package defpackage;

import android.net.Uri;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kz4 {
    public final a a;
    public final HashMap<String, Uri> b;
    public final ArrayList c;
    public String d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final id4 a;
        public final String b;
        public final String c;

        public a(id4 id4Var, String str, String str2) {
            id4.a aVarA = id4Var.a();
            aVarA.a = null;
            aVarA.k = null;
            this.a = new id4(aVarA);
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.a, aVar.a) && Objects.equals(this.b, aVar.b) && Objects.equals(this.c, aVar.c);
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b, this.c);
        }
    }

    public kz4(a aVar, String str, Uri uri, int i) {
        this.a = aVar;
        HashMap<String, Uri> map = new HashMap<>();
        this.b = map;
        map.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public static k95<kz4> a(List<fz4.a> list) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            fz4.a aVar = list.get(i);
            Uri uri = aVar.a;
            try {
                d(aVar.a, null, i, arrayList, new a(aVar.b, aVar.d, aVar.c), map, map2);
            } catch (ut7 unused) {
            }
        }
        return k95.q(arrayList);
    }

    public static k95<kz4> b(List<fz4.b> list) throws ut7 {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            fz4.b bVar = list.get(i);
            d(bVar.a, bVar.g, i, arrayList, new a(bVar.b, bVar.h, null), map, map2);
        }
        return k95.q(arrayList);
    }

    public static void d(Uri uri, String str, int i, ArrayList arrayList, a aVar, HashMap map, HashMap map2) throws ut7 {
        int i2;
        String str2;
        Integer num = (Integer) map.get(aVar);
        int i3 = 1;
        if (num == null) {
            map2.put(aVar, 0);
            if (str == null) {
                map2.put(aVar, 1);
                str = ".";
            }
            kz4 kz4Var = new kz4(aVar, str, uri, i);
            map.put(aVar, Integer.valueOf(arrayList.size()));
            arrayList.add(kz4Var);
            return;
        }
        if (str == null) {
            Integer num2 = (Integer) map2.get(aVar);
            num2.getClass();
            int iIntValue = num2.intValue() + 1;
            if (iIntValue <= 1) {
                xl7.d(iIntValue, "invalid count: %s", iIntValue >= 0);
                str2 = iIntValue == 0 ? BuildConfig.FLAVOR : ".";
            } else {
                long j = iIntValue;
                int i4 = (int) j;
                if (i4 != j) {
                    throw new ArrayIndexOutOfBoundsException(d43.b(j, "Required array size too large: "));
                }
                char[] cArr = new char[i4];
                ".".getChars(0, 1, cArr, 0);
                while (true) {
                    i2 = i4 - i3;
                    if (i3 >= i2) {
                        break;
                    }
                    System.arraycopy(cArr, 0, cArr, i3, i3);
                    i3 <<= 1;
                }
                System.arraycopy(cArr, 0, cArr, i3, i2);
                str2 = new String(cArr);
            }
            map2.put(aVar, Integer.valueOf(iIntValue));
            str = str2;
        }
        kz4 kz4Var2 = (kz4) arrayList.get(num.intValue());
        Uri uri2 = kz4Var2.b.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw ut7.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup");
        }
        kz4Var2.b.put(str, uri);
        if (i != -1) {
            kz4Var2.c.add(Integer.valueOf(i));
        }
    }

    public final Uri c() {
        Uri uri = this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
