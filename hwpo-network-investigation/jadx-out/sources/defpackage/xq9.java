package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xq9<E> extends q95<E> {
    public final transient E w;

    public xq9(E e) {
        e.getClass();
        this.w = e;
    }

    @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.w.equals(obj);
    }

    @Override // defpackage.q95, defpackage.b95
    public final k95<E> d() {
        return k95.v(this.w);
    }

    @Override // defpackage.b95
    public final int e(int i, Object[] objArr) {
        objArr[i] = this.w;
        return i + 1;
    }

    @Override // defpackage.q95, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.w.hashCode();
    }

    @Override // defpackage.b95
    public final boolean k() {
        return false;
    }

    @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: l */
    public final w2b iterator() {
        return new sk5.b(this.w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.w.toString() + ']';
    }
}
