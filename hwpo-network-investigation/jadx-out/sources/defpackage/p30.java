package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class p30 {
    public static final int a;

    static {
        Object aVar;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            aVar = property != null ? v2a.f(property) : null;
        } catch (Throwable th) {
            aVar = new av8.a(th);
        }
        Integer num = (Integer) (aVar instanceof av8.a ? null : aVar);
        a = num != null ? num.intValue() : 2097152;
    }
}
