package defpackage;

import com.intercom.twig.BuildConfig;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ut7 extends IOException {
    public final boolean t;
    public final int u;

    public ut7(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.t = z;
        this.u = i;
    }

    public static ut7 a(RuntimeException runtimeException, String str) {
        return new ut7(str, runtimeException, true, 1);
    }

    public static ut7 b(String str) {
        return new ut7(str, null, true, 4);
    }

    public static ut7 c(String str) {
        return new ut7(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : BuildConfig.FLAVOR);
        sb.append("{contentIsMalformed=");
        sb.append(this.t);
        sb.append(", dataType=");
        return i34.b(this.u, "}", sb);
    }
}
