package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z58<T> extends x58<T> {
    public final Object c;

    public z58(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.x58, defpackage.w58
    public final boolean a(T t) {
        boolean zA;
        t.getClass();
        synchronized (this.c) {
            zA = super.a(t);
        }
        return zA;
    }

    @Override // defpackage.x58, defpackage.w58
    public final T b() {
        T t;
        synchronized (this.c) {
            t = (T) super.b();
        }
        return t;
    }
}
