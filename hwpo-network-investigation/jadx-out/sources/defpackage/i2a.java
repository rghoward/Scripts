package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i2a extends eh1<List<? extends String>> {
    @Override // defpackage.eh1
    public final /* bridge */ /* synthetic */ List<? extends String> a() {
        return hf3.t;
    }

    @Override // defpackage.m77
    public final Object get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || wx.c(bundle, str)) {
            return null;
        }
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return u30.E(stringArray);
        }
        xx.e(str);
        throw null;
    }

    @Override // defpackage.m77
    public final String getName() {
        return "List<String>";
    }

    @Override // defpackage.m77
    public final Object parseValue(String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        return list != null ? th1.K(list, ws0.h(str)) : ws0.h(str);
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
        String[] strArr = (String[]) list.toArray(new String[0]);
        strArr.getClass();
        bundle.putStringArray(str, strArr);
    }

    @Override // defpackage.m77
    public final boolean valueEquals(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return gz3.c(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
    }

    @Override // defpackage.m77
    public final Object parseValue(String str) {
        str.getClass();
        return ws0.h(str);
    }
}
