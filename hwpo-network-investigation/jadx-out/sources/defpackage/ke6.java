package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ke6 extends eh1<List<? extends Long>> {
    @Override // defpackage.eh1
    public final /* bridge */ /* synthetic */ List<? extends Long> a() {
        return hf3.t;
    }

    @Override // defpackage.m77
    public final Object get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || wx.c(bundle, str)) {
            return null;
        }
        long[] longArray = bundle.getLongArray(str);
        if (longArray == null) {
            xx.e(str);
            throw null;
        }
        longArray.getClass();
        int length = longArray.length;
        if (length == 0) {
            return hf3.t;
        }
        if (length == 1) {
            return ws0.h(Long.valueOf(longArray[0]));
        }
        ArrayList arrayList = new ArrayList(longArray.length);
        for (long j : longArray) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @Override // defpackage.m77
    public final String getName() {
        return "List<Long>";
    }

    @Override // defpackage.m77
    public final Object parseValue(String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        return list != null ? th1.K(list, ws0.h(m77.LongType.parseValue(str))) : ws0.h(m77.LongType.parseValue(str));
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        bundle.getClass();
        str.getClass();
        if (list == null) {
            bundle.putString(str, null);
            return;
        }
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        bundle.putLongArray(str, jArr);
    }

    @Override // defpackage.m77
    public final boolean valueEquals(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return gz3.c(list != null ? (Long[]) list.toArray(new Long[0]) : null, list2 != null ? (Long[]) list2.toArray(new Long[0]) : null);
    }

    @Override // defpackage.m77
    public final Object parseValue(String str) {
        str.getClass();
        return ws0.h(m77.LongType.parseValue(str));
    }
}
