package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l2d {
    public final Context a;

    public l2d(Context context) {
        new ConcurrentHashMap();
        h4c.b(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }
}
