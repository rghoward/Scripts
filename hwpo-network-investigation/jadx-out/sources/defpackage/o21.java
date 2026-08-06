package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface o21 extends Cloneable {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        oi8 a(jp8 jp8Var);
    }

    void cancel();

    qu8 execute();

    boolean isCanceled();

    boolean isExecuted();

    void k(v21 v21Var);

    jp8 request();

    oi8.c timeout();
}
