package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y58<T> {
    public final Object[] a = new Object[256];
    public int b;

    public final void a(q30 q30Var) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = q30Var;
            this.b = i + 1;
        }
    }
}
