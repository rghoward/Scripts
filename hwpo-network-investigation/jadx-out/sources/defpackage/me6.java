package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class me6 extends m77<Long> {
    @Override // defpackage.m77
    public final Long get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return Long.valueOf(j);
        }
        xx.e(str);
        throw null;
    }

    @Override // defpackage.m77
    public final String getName() {
        return "long";
    }

    @Override // defpackage.m77
    public final Long parseValue(String str) {
        long j;
        str.getClass();
        String strSubstring = w2a.h(str, "L", false) ? str.substring(0, str.length() - 1) : str;
        if (w2a.n(str, "0x", false)) {
            String strSubstring2 = strSubstring.substring(2);
            ta1.a(16);
            j = Long.parseLong(strSubstring2, 16);
        } else {
            j = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j);
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Long l) {
        long jLongValue = l.longValue();
        bundle.getClass();
        str.getClass();
        bundle.putLong(str, jLongValue);
    }
}
