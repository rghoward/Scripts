package defpackage;

import com.intercom.twig.BuildConfig;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b04 {
    public final of8<si> a;
    public Integer b = null;

    public b04(of8 of8Var) {
        this.a = of8Var;
    }

    public static boolean a(ArrayList arrayList, a3 a3Var) {
        String str = a3Var.a;
        String str2 = a3Var.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a3 a3Var2 = (a3) obj;
            if (a3Var2.a.equals(str) && a3Var2.b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final void b(ArrayList arrayList) throws z2 {
        of8<si> of8Var = this.a;
        if (of8Var.get() == null) {
            throw new z2("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            String str = BuildConfig.FLAVOR;
            if (i >= size) {
                if (arrayList2.isEmpty()) {
                    if (of8Var.get() == null) {
                        throw new z2("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    ArrayList arrayListB = of8Var.get().b();
                    int size2 = arrayListB.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayListB.get(i2);
                        i2++;
                        of8Var.get().g(((si.a) obj).b);
                    }
                    return;
                }
                if (of8Var.get() == null) {
                    throw new z2("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList arrayListB2 = of8Var.get().b();
                ArrayList arrayList3 = new ArrayList();
                int i3 = 0;
                for (int size3 = arrayListB2.size(); i3 < size3; size3 = size3) {
                    Object obj2 = arrayListB2.get(i3);
                    i3++;
                    si.a aVar = (si.a) obj2;
                    String[] strArr = a3.g;
                    String str2 = aVar.d;
                    arrayList3.add(new a3(aVar.b, String.valueOf(aVar.c), str2 != null ? str2 : BuildConfig.FLAVOR, new Date(aVar.m), aVar.e, aVar.j));
                }
                ArrayList arrayList4 = new ArrayList();
                int size4 = arrayList3.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj3 = arrayList3.get(i4);
                    i4++;
                    a3 a3Var = (a3) obj3;
                    if (!a(arrayList2, a3Var)) {
                        arrayList4.add(a3Var.a());
                    }
                }
                int size5 = arrayList4.size();
                int i5 = 0;
                while (i5 < size5) {
                    Object obj4 = arrayList4.get(i5);
                    i5++;
                    of8Var.get().g(((si.a) obj4).b);
                }
                ArrayList arrayList5 = new ArrayList();
                int size6 = arrayList2.size();
                int i6 = 0;
                while (i6 < size6) {
                    Object obj5 = arrayList2.get(i6);
                    i6++;
                    a3 a3Var2 = (a3) obj5;
                    if (!a(arrayList3, a3Var2)) {
                        arrayList5.add(a3Var2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(of8Var.get().b());
                if (this.b == null) {
                    this.b = Integer.valueOf(of8Var.get().f());
                }
                int iIntValue = this.b.intValue();
                int size7 = arrayList5.size();
                int i7 = 0;
                while (i7 < size7) {
                    Object obj6 = arrayList5.get(i7);
                    i7++;
                    a3 a3Var3 = (a3) obj6;
                    while (arrayDeque.size() >= iIntValue) {
                        of8Var.get().g(((si.a) arrayDeque.pollFirst()).b);
                    }
                    si.a aVarA = a3Var3.a();
                    of8Var.get().d(aVarA);
                    arrayDeque.offer(aVarA);
                }
                return;
            }
            Object obj7 = arrayList.get(i);
            i++;
            Map map = (Map) obj7;
            String[] strArr2 = a3.g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = a3.g;
            for (int i8 = 0; i8 < 5; i8++) {
                String str3 = strArr3[i8];
                if (!map.containsKey(str3)) {
                    arrayList6.add(str3);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new z2(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                Date date = a3.h.parse((String) map.get("experimentStartTime"));
                long j = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                long j2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                String str4 = (String) map.get("experimentId");
                String str5 = (String) map.get("variantId");
                if (map.containsKey("triggerEvent")) {
                    str = (String) map.get("triggerEvent");
                }
                arrayList2.add(new a3(str4, str5, str, date, j, j2));
            } catch (NumberFormatException e) {
                throw new z2("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new z2("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
    }
}
