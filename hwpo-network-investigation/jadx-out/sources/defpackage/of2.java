package defpackage;

import android.net.Uri;
import io.ably.lib.http.HttpConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class of2 {
    public static final /* synthetic */ int h = 0;
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map<String, String> d;
    public final long e;
    public final long f;
    public final int g;

    static {
        cp6.a("media3.datasource");
    }

    public of2(Uri uri, int i, byte[] bArr, Map map, long j, long j2, int i2) {
        xl7.g(j >= 0);
        xl7.g(j >= 0);
        xl7.g(j2 > 0 || j2 == -1);
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j2;
        this.g = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.b;
        if (i == 1) {
            str = HttpConstants.Methods.GET;
        } else if (i == 2) {
            str = HttpConstants.Methods.POST;
        } else {
            if (i != 3) {
                d43.c();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", null, ");
        return i34.b(this.g, "]", sb);
    }
}
