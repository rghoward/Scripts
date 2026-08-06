package defpackage;

import android.os.Bundle;
import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yf5 extends m77<Integer> {
    @Override // defpackage.m77
    public final Integer get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return Integer.valueOf(wx.b(bundle, str));
    }

    @Override // defpackage.m77
    public final String getName() {
        return AttributeType.INTEGER;
    }

    @Override // defpackage.m77
    public final Integer parseValue(String str) {
        int i;
        str.getClass();
        if (w2a.n(str, "0x", false)) {
            String strSubstring = str.substring(2);
            ta1.a(16);
            i = Integer.parseInt(strSubstring, 16);
        } else {
            i = Integer.parseInt(str);
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Integer num) {
        int iIntValue = num.intValue();
        bundle.getClass();
        str.getClass();
        bundle.putInt(str, iIntValue);
    }
}
