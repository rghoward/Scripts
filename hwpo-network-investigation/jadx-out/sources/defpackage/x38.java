package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x38 {
    public static final x38 c;
    public final String a;
    public final a b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public LogSessionId a = LogSessionId.LOG_SESSION_ID_NONE;

        public final void a(LogSessionId logSessionId) {
            xl7.r(this.a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.a = logSessionId;
        }
    }

    static {
        new x38(BuildConfig.FLAVOR);
        c = new x38("preload");
    }

    public x38(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
    }

    public final synchronized LogSessionId a() {
        a aVar;
        aVar = this.b;
        aVar.getClass();
        return aVar.a;
    }
}
