package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l2a extends m77<String> {
    @Override // defpackage.m77
    public final String get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || wx.c(bundle, str)) {
            return null;
        }
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        xx.e(str);
        throw null;
    }

    @Override // defpackage.m77
    public final String getName() {
        return "string";
    }

    @Override // defpackage.m77
    public final String parseValue(String str) {
        str.getClass();
        if (str.equals("null")) {
            return null;
        }
        return str;
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, String str2) {
        String str3 = str2;
        bundle.getClass();
        str.getClass();
        if (str3 != null) {
            bundle.putString(str, str3);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.m77
    public final String serializeAsValue(String str) {
        String str2 = str;
        if (str2 == null) {
            return "null";
        }
        String strEncode = Uri.encode(str2, null);
        strEncode.getClass();
        return strEncode;
    }
}
