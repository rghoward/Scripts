package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s73 {
    public static final ss5 a = hv5.c(j26.u, a.u);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<Handler> {
        public static final a u = new a(0);

        @Override // defpackage.mh4
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }
}
