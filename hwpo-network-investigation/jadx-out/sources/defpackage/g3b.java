package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g3b<T> implements ss5<T>, Serializable {
    public mh4<? extends T> t;
    public Object u;

    @Override // defpackage.ss5
    public final T getValue() {
        if (this.u == b1b.a) {
            mh4<? extends T> mh4Var = this.t;
            mh4Var.getClass();
            this.u = mh4Var.invoke();
            this.t = null;
        }
        return (T) this.u;
    }

    public final String toString() {
        return this.u != b1b.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
