package defpackage;

import android.os.Bundle;
import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tr0 extends m77<Boolean> {
    @Override // defpackage.m77
    public final Boolean get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || wx.c(bundle, str)) {
            return null;
        }
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return Boolean.valueOf(z);
        }
        xx.e(str);
        throw null;
    }

    @Override // defpackage.m77
    public final String getName() {
        return AttributeType.BOOLEAN;
    }

    @Override // defpackage.m77
    public final Boolean parseValue(String str) {
        boolean z;
        str.getClass();
        if (str.equals("true")) {
            z = true;
        } else {
            if (!str.equals("false")) {
                z90.a("A boolean NavType only accepts \"true\" or \"false\" values.");
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        bundle.getClass();
        str.getClass();
        bundle.putBoolean(str, zBooleanValue);
    }
}
