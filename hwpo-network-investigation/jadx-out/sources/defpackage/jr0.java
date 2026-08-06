package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jr0<T> extends x0<T> {
    public final Thread y;
    public final pm3 z;

    public jr0(h72 h72Var, Thread thread, pm3 pm3Var) {
        super(h72Var, true);
        this.y = thread;
        this.z = pm3Var;
    }

    @Override // defpackage.ll5
    public final void r(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.y;
        if (xj5.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
