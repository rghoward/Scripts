package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sr0 extends eh1<List<? extends Boolean>> {
    @Override // defpackage.eh1
    public final /* bridge */ /* synthetic */ List<? extends Boolean> a() {
        return hf3.t;
    }

    @Override // defpackage.m77
    public final Object get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || wx.c(bundle, str)) {
            return null;
        }
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray == null) {
            xx.e(str);
            throw null;
        }
        booleanArray.getClass();
        int length = booleanArray.length;
        if (length == 0) {
            return hf3.t;
        }
        if (length == 1) {
            return ws0.h(Boolean.valueOf(booleanArray[0]));
        }
        ArrayList arrayList = new ArrayList(booleanArray.length);
        for (boolean z : booleanArray) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    @Override // defpackage.m77
    public final String getName() {
        return "List<Boolean>";
    }

    @Override // defpackage.m77
    public final Object parseValue(String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        return list != null ? th1.K(list, ws0.h(m77.BoolType.parseValue(str))) : ws0.h(m77.BoolType.parseValue(str));
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        bundle.getClass();
        str.getClass();
        if (list != null) {
            bundle.putBooleanArray(str, th1.P(list));
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.m77
    public final boolean valueEquals(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return gz3.c(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
    }

    @Override // defpackage.m77
    public final Object parseValue(String str) {
        str.getClass();
        return ws0.h(m77.BoolType.parseValue(str));
    }
}
