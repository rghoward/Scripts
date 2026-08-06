package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wv8<T> extends el7<T> implements Serializable {
    public final el7<? super T> t;

    public wv8(el7<? super T> el7Var) {
        this.t = el7Var;
    }

    @Override // defpackage.el7
    public final <S extends T> el7<S> a() {
        return this.t;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.t.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wv8) {
            return this.t.equals(((wv8) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        return -this.t.hashCode();
    }

    public final String toString() {
        return this.t + ".reverse()";
    }
}
