package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tz8<T> implements ss5<T>, Serializable {
    public static final AtomicReferenceFieldUpdater<tz8<?>, Object> v = AtomicReferenceFieldUpdater.newUpdater(tz8.class, Object.class, "u");
    public volatile mh4<? extends T> t;
    public volatile Object u;

    public tz8() {
        throw null;
    }

    @Override // defpackage.ss5
    public final T getValue() {
        T t = (T) this.u;
        b1b b1bVar = b1b.a;
        if (t != b1bVar) {
            return t;
        }
        mh4<? extends T> mh4Var = this.t;
        if (mh4Var != null) {
            T tInvoke = mh4Var.invoke();
            AtomicReferenceFieldUpdater<tz8<?>, Object> atomicReferenceFieldUpdater = v;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b1bVar, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != b1bVar) {
                }
            }
            this.t = null;
            return tInvoke;
        }
        return (T) this.u;
    }

    public final String toString() {
        return this.u != b1b.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
