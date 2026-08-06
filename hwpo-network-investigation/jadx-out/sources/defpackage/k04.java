package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class k04 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k04(String str) {
        super(str);
        a78.e(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k04(String str, Throwable th) {
        super(str, th);
        a78.e(str, "Detail message must not be empty");
    }
}
