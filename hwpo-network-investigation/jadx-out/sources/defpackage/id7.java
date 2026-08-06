package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public enum id7 {
    NOTIFICATION_CREATED;

    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static id7 a(String str) {
            for (id7 id7Var : id7.values()) {
                id7Var.getClass();
                if ("notification_created".equals(str)) {
                    return id7Var;
                }
            }
            px1.b("Array contains no element matching the predicate.");
            return null;
        }
    }
}
