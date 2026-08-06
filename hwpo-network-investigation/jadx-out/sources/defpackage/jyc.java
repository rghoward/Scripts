package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jyc extends sxc {
    public static final boolean j(String str) {
        String str2 = (String) wfc.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (java.lang.Math.abs(r6.hashCode() % 100) < r8.M().x()) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hyc h(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyc.h(java.lang.String):hyc");
    }

    public final String i(String str) {
        ujc ujcVar = this.b.a;
        lzc.U(ujcVar);
        String strT = ujcVar.t(str);
        if (TextUtils.isEmpty(strT)) {
            return (String) wfc.r.a(null);
        }
        Uri uri = Uri.parse((String) wfc.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strT).length() + 1 + String.valueOf(authority).length());
        sb.append(strT);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
