package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wf5 extends eh1<List<? extends Integer>> {
    @Override // defpackage.eh1
    public final /* bridge */ /* synthetic */ List<? extends Integer> a() {
        return hf3.t;
    }

    @Override // defpackage.m77
    public final Object get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || wx.c(bundle, str)) {
            return null;
        }
        int[] intArray = bundle.getIntArray(str);
        if (intArray == null) {
            xx.e(str);
            throw null;
        }
        int length = intArray.length;
        if (length == 0) {
            return hf3.t;
        }
        if (length == 1) {
            return ws0.h(Integer.valueOf(intArray[0]));
        }
        ArrayList arrayList = new ArrayList(intArray.length);
        for (int i : intArray) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    @Override // defpackage.m77
    public final String getName() {
        return "List<Int>";
    }

    @Override // defpackage.m77
    public final Object parseValue(String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        return list != null ? th1.K(list, ws0.h(m77.IntType.parseValue(str))) : ws0.h(m77.IntType.parseValue(str));
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        bundle.getClass();
        str.getClass();
        if (list != null) {
            bundle.putIntArray(str, th1.S(list));
        }
    }

    @Override // defpackage.m77
    public final boolean valueEquals(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return gz3.c(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
    }

    @Override // defpackage.m77
    public final Object parseValue(String str) {
        str.getClass();
        return ws0.h(m77.IntType.parseValue(str));
    }
}
