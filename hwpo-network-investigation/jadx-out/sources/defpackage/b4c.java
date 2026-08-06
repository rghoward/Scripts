package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b4c extends RuntimeException {
    public b4c() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final k2c a() {
        return new k2c(getMessage());
    }
}
