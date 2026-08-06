package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zv1 extends ln4 {
    public static zv1 x;
    public static final Map<Long, String> y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends HashMap<Long, String> {
    }

    static {
        a aVar = new a();
        aVar.put(461L, "FIREPERF_AUTOPUSH");
        aVar.put(462L, "FIREPERF");
        aVar.put(675L, "FIREPERF_INTERNAL_LOW");
        aVar.put(676L, "FIREPERF_INTERNAL_HIGH");
        y = Collections.unmodifiableMap(aVar);
    }

    public zv1() {
        super(7);
    }

    @Override // defpackage.ln4
    public final String J0() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
