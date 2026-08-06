package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface p21<T> extends Cloneable {
    void cancel();

    p21<T> clone();

    void enqueue(u21<T> u21Var);

    boolean isCanceled();

    boolean isExecuted();

    jp8 request();

    voa timeout();
}
