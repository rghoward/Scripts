package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rb6 {
    public static final AtomicLong c = new AtomicLong();
    public final Map<String, List<String>> a;
    public final long b;

    public rb6(of2 of2Var, long j) {
        this(of2Var, of2Var.a, Collections.EMPTY_MAP, j, 0L, 0L);
    }

    public rb6(of2 of2Var, Uri uri, Map map, long j, long j2, long j3) {
        this.a = map;
        this.b = j2;
    }
}
