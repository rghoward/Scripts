package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bc9 {
    public static final gc9<Boolean> a = new gc9<>("TestTagsAsResourceId", false, b.u);
    public static final gc9<String> b = new gc9<>("AccessibilityClassName", true, a.u);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements ci4<String, String, String> {
        public static final a u = new a(2);

        @Override // defpackage.ci4
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements ci4<Boolean, Boolean, Boolean> {
        public static final b u = new b(2);

        @Override // defpackage.ci4
        public final Boolean invoke(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool;
            bool2.booleanValue();
            return bool3;
        }
    }
}
