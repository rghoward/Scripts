package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e2a extends eh1<String[]> {
    @Override // defpackage.eh1
    public final String[] a() {
        return new String[0];
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
            return stringArray;
        }
        xx.e(str);
        throw null;
    }

    @Override // defpackage.m77
    public final String getName() {
        return "string[]";
    }

    @Override // defpackage.m77
    public final Object parseValue(String str, Object obj) {
        String[] strArr = (String[]) obj;
        str.getClass();
        return strArr != null ? (String[]) gz3.r(strArr, new String[]{str}) : new String[]{str};
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Object obj) {
        String[] strArr = (String[]) obj;
        bundle.getClass();
        str.getClass();
        if (strArr != null) {
            bundle.putStringArray(str, strArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.m77
    public final boolean valueEquals(Object obj, Object obj2) {
        return gz3.c((String[]) obj, (String[]) obj2);
    }

    @Override // defpackage.m77
    public final Object parseValue(String str) {
        str.getClass();
        return new String[]{str};
    }
}
