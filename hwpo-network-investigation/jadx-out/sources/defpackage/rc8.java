package defpackage;

import android.icu.text.SimpleDateFormat;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rc8 {
    public static final boolean a(ArrayList arrayList) {
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            s23 s23Var = (s23) obj;
            if ((s23Var instanceof ep1) && (s23Var instanceof r89)) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            s23 s23Var2 = (s23) obj2;
            s23Var2.getClass();
            Integer numValueOf = Integer.valueOf(((r89) s23Var2).a());
            Object arrayList3 = linkedHashMap.get(numValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList4 = new ArrayList(ph1.n(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            List<s23> list = (List) linkedHashMap.get(Integer.valueOf(((Number) it.next()).intValue()));
            if (list == null) {
                z = false;
                break;
                break;
            }
            z = true;
            if (!list.isEmpty()) {
                for (s23 s23Var3 : list) {
                    s23Var3.getClass();
                    if (!((ep1) s23Var3).c()) {
                        z = false;
                        break;
                    }
                }
            }
            arrayList4.add(Boolean.valueOf(z));
        }
        return arrayList4.contains(Boolean.TRUE);
    }

    public static final bc8 b(sc8 sc8Var, bu8 bu8Var) {
        r89 zpaVar;
        w60 w60VarA;
        String str;
        r89 un4Var;
        sc8Var.getClass();
        LocalDateTime localDateTime = sc8Var.e;
        List<hd8> list = sc8Var.f;
        bu8Var.getClass();
        a08 a08Var = sc8Var.c;
        Integer num = a08Var.a;
        String str2 = a08Var.b;
        String str3 = a08Var.d;
        List<c08> list2 = a08Var.e;
        ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
        for (c08 c08Var : list2) {
            arrayList.add(new h08(c08Var.a, c08Var.b, c08Var.c));
        }
        yz7 yz7Var = new yz7(num, str2, str3, arrayList);
        ArrayList arrayList2 = new ArrayList(ph1.n(list, 10));
        for (hd8 hd8Var : list) {
            o89 o89Var = hd8Var.c;
            String str4 = hd8Var.e;
            String str5 = hd8Var.b;
            Integer num2 = hd8Var.o;
            int iOrdinal = o89Var.ordinal();
            String str6 = BuildConfig.FLAVOR;
            if (iOrdinal != 0) {
                if (iOrdinal == 4 || iOrdinal == 5) {
                    int i = hd8Var.c == o89.x ? R.drawable.img_gowod_pre : R.drawable.img_gowod_post;
                    int i2 = hd8Var.a;
                    boolean z = hd8Var.f;
                    String str7 = hd8Var.n;
                    un4Var = new un4(i2, z, str7 == null ? BuildConfig.FLAVOR : str7, i, num2 != null ? num2.intValue() : -1);
                } else {
                    int i3 = hd8Var.a;
                    int iIntValue = num2 != null ? num2.intValue() : -1;
                    String str8 = str5 == null ? BuildConfig.FLAVOR : str5;
                    o89 o89Var2 = hd8Var.c;
                    int i4 = hd8Var.d;
                    String strC = rhb.c(str4);
                    un4Var = new fd8(i3, iIntValue, str8, o89Var2, i4, strC == null ? BuildConfig.FLAVOR : strC, hd8Var.f, !hd8Var.h);
                }
                zpaVar = un4Var;
            } else {
                int i5 = hd8Var.a;
                if (str5 == null) {
                    str5 = BuildConfig.FLAVOR;
                }
                int i6 = hd8Var.d;
                m89 m89Var = hd8Var.i;
                if (m89Var != null) {
                    str = str5;
                    w60VarA = kn1.a(m89Var);
                } else {
                    String str9 = str5;
                    w60VarA = null;
                    str = str9;
                }
                String strC2 = rhb.c(str4);
                if (strC2 != null) {
                    str6 = strC2;
                }
                zpaVar = new zpa(i5, str, i6, w60VarA, str6, num2 != null ? num2.intValue() : -1);
            }
            arrayList2.add(zpaVar);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = th1.N(list, new qc8()).iterator();
        while (it.hasNext()) {
            int iOrdinal2 = ((hd8) it.next()).c.ordinal();
            if (iOrdinal2 == 1) {
                linkedHashSet.add(Integer.valueOf(R.drawable.ic_program_score));
            } else if (iOrdinal2 == 3) {
                linkedHashSet.add(Integer.valueOf(R.drawable.ic_program_challenges));
            }
        }
        List listI = ws0.i(a08.a.t, a08.a.u);
        Integer num3 = sc8Var.d;
        String strB = num3 != null ? bu8Var.b(R.string.program_date, Integer.valueOf(num3.intValue())) : null;
        int i7 = sc8Var.a;
        boolean zContains = listI.contains(a08Var.c);
        Integer num4 = sc8Var.d;
        long jZ = yk2.z(localDateTime);
        String str10 = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(Long.valueOf(yk2.w(localDateTime)));
        str10.getClass();
        return new bc8(i7, yz7Var, zContains, num4, strB, jZ, str10, arrayList2, linkedHashSet, a(arrayList2), sc8Var.g, sc8Var.h);
    }

    public static final ArrayList c(List list, bu8 bu8Var) {
        bu8Var.getClass();
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((sc8) it.next(), bu8Var));
        }
        return arrayList;
    }
}
