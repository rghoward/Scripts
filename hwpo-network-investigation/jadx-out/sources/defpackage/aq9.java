package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aq9<E> extends n1<E> {
    public final E v;

    /* JADX WARN: Multi-variable type inference failed */
    public aq9(int i, Object obj) {
        super(i, 1);
        this.v = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (hasNext()) {
            this.t++;
            return this.v;
        }
        vl.b();
        return null;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            this.t--;
            return this.v;
        }
        vl.b();
        return null;
    }
}
