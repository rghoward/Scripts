package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class nz8<T> implements r02<T>, w72 {
    public static final AtomicReferenceFieldUpdater<nz8<?>, Object> u = AtomicReferenceFieldUpdater.newUpdater(nz8.class, Object.class, "result");
    private volatile Object result;
    public final r02<T> t;

    public nz8() {
        throw null;
    }

    public nz8(r02 r02Var, v72 v72Var) {
        this.t = r02Var;
        this.result = v72Var;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        v72 v72Var = v72.u;
        if (obj == v72Var) {
            AtomicReferenceFieldUpdater<nz8<?>, Object> atomicReferenceFieldUpdater = u;
            v72 v72Var2 = v72.t;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, v72Var, v72Var2)) {
                if (atomicReferenceFieldUpdater.get(this) != v72Var) {
                    obj = this.result;
                }
            }
            return v72.t;
        }
        if (obj == v72.v) {
            return v72.t;
        }
        if (obj instanceof av8.a) {
            throw ((av8.a) obj).t;
        }
        return obj;
    }

    @Override // defpackage.w72
    public final w72 getCallerFrame() {
        r02<T> r02Var = this.t;
        if (r02Var instanceof w72) {
            return (w72) r02Var;
        }
        return null;
    }

    @Override // defpackage.r02
    public final h72 getContext() {
        return this.t.getContext();
    }

    @Override // defpackage.r02
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            v72 v72Var = v72.u;
            if (obj2 == v72Var) {
                AtomicReferenceFieldUpdater<nz8<?>, Object> atomicReferenceFieldUpdater = u;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, v72Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != v72Var) {
                    }
                }
                return;
            }
            v72 v72Var2 = v72.t;
            if (obj2 != v72Var2) {
                aa0.c("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater<nz8<?>, Object> atomicReferenceFieldUpdater2 = u;
            v72 v72Var3 = v72.v;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, v72Var2, v72Var3)) {
                    this.t.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == v72Var2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.t;
    }
}
