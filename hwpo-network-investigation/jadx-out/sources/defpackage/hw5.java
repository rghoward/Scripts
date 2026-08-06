package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface hw5 {
    int b();

    default int d(Object obj) {
        return -1;
    }

    void e(int i, Object obj, jt1 jt1Var, int i2);

    default Object f(int i) {
        return new yr2(i);
    }

    default Object g(int i) {
        return null;
    }
}
