package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vo1<T> extends el7<T> implements Serializable {
    public final su2 t;

    public vo1(su2 su2Var) {
        this.t = su2Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.t.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vo1) {
            return this.t.equals(((vo1) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final String toString() {
        return this.t.toString();
    }
}
