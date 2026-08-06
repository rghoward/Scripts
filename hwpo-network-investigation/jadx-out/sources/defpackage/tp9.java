package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tp9<T> implements mf8<T> {
    public static final Object c = new Object();
    public volatile ce2.a a;
    public volatile Object b;

    @Override // defpackage.nf8
    public final T get() {
        T t = (T) this.b;
        if (t != c) {
            return t;
        }
        ce2.a aVar = this.a;
        if (aVar == null) {
            return (T) this.b;
        }
        T t2 = (T) aVar.get();
        this.b = t2;
        this.a = null;
        return t2;
    }
}
