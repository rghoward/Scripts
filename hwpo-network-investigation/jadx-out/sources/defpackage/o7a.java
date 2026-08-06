package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o7a<T> implements ss5<T>, Serializable {
    public mh4<? extends T> t;
    public volatile Object u;
    public final Object v;

    public o7a(mh4 mh4Var) {
        mh4Var.getClass();
        this.t = mh4Var;
        this.u = b1b.a;
        this.v = this;
    }

    @Override // defpackage.ss5
    public final T getValue() {
        T tInvoke;
        T t = (T) this.u;
        b1b b1bVar = b1b.a;
        if (t != b1bVar) {
            return t;
        }
        synchronized (this.v) {
            tInvoke = (T) this.u;
            if (tInvoke == b1bVar) {
                mh4<? extends T> mh4Var = this.t;
                mh4Var.getClass();
                tInvoke = mh4Var.invoke();
                this.u = tInvoke;
                this.t = null;
            }
        }
        return tInvoke;
    }

    public final String toString() {
        return this.u != b1b.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
