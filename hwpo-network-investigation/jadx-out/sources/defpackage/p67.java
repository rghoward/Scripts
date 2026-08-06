package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p67 implements ci4 {
    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundleC;
        o67 o67Var = (o67) obj2;
        q57 q57Var = o67Var.b;
        LinkedHashMap linkedHashMap = q57Var.m;
        h30<r47> h30Var = q57Var.f;
        LinkedHashMap linkedHashMap2 = q57Var.l;
        ArrayList arrayList = new ArrayList();
        Bundle bundleC2 = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
        for (Map.Entry entry : qi6.l(q57Var.s.a).entrySet()) {
            ((p87) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundleC = null;
        } else {
            bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
            zx.b(bundleC2, "android-support-nav:controller:navigatorState:names", arrayList);
            bundleC.putBundle("android-support-nav:controller:navigatorState", bundleC2);
        }
        if (!h30Var.isEmpty()) {
            if (bundleC == null) {
                bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
            }
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            for (r47 r47Var : h30Var) {
                r47Var.getClass();
                int i = r47Var.u.u.d;
                String str = r47Var.y;
                u47 u47Var = r47Var.A;
                Bundle bundleA = u47Var.a();
                Bundle bundleC3 = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                u47Var.h.c(bundleC3);
                Bundle bundleC4 = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                str.getClass();
                bundleC4.putString("nav-entry-state:id", str);
                bundleC4.putInt("nav-entry-state:destination-id", i);
                if (bundleA == null) {
                    bundleA = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                }
                bundleC4.putBundle("nav-entry-state:args", bundleA);
                bundleC4.putBundle("nav-entry-state:saved-state", bundleC3);
                arrayList2.add(bundleC4);
            }
            bundleC.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
        }
        if (!linkedHashMap2.isEmpty()) {
            if (bundleC == null) {
                bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
            }
            int[] iArr = new int[linkedHashMap2.size()];
            ArrayList arrayList3 = new ArrayList();
            int i2 = 0;
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                int i3 = i2 + 1;
                iArr[i2] = iIntValue;
                if (str2 == null) {
                    str2 = BuildConfig.FLAVOR;
                }
                arrayList3.add(str2);
                i2 = i3;
            }
            bundleC.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            zx.b(bundleC, "android-support-nav:controller:backStackIds", arrayList3);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundleC == null) {
                bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str3 = (String) entry3.getKey();
                h30 h30Var2 = (h30) entry3.getValue();
                arrayList4.add(str3);
                ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                Iterator<E> it = h30Var2.iterator();
                while (it.hasNext()) {
                    a57 a57Var = ((z47) it.next()).a;
                    a57Var.getClass();
                    Bundle bundleC5 = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                    String str4 = a57Var.a;
                    str4.getClass();
                    bundleC5.putString("nav-entry-state:id", str4);
                    bundleC5.putInt("nav-entry-state:destination-id", a57Var.b);
                    Bundle bundleC6 = a57Var.c;
                    if (bundleC6 == null) {
                        bundleC6 = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                    }
                    bundleC5.putBundle("nav-entry-state:args", bundleC6);
                    Bundle bundle = a57Var.d;
                    bundle.getClass();
                    bundleC5.putBundle("nav-entry-state:saved-state", bundle);
                    arrayList5.add(bundleC5);
                }
                bundleC.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str3, arrayList5);
            }
            zx.b(bundleC, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (o67Var.e) {
            if (bundleC == null) {
                bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
            }
            bundleC.putBoolean("android-support-nav:controller:deepLinkHandled", o67Var.e);
        }
        return bundleC;
    }
}
