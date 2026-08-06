package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend", v = 1)
public final class jj5 extends p6a implements ci4<t72, r02<Object>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ mh4<Object> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj5(mh4<Object> mh4Var, r02<? super jj5> r02Var) {
        super(2, r02Var);
        this.u = mh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        jj5 jj5Var = new jj5(this.u, r02Var);
        jj5Var.t = obj;
        return jj5Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<Object> r02Var) {
        return ((jj5) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        t72 t72Var = (t72) this.t;
        dv8.b(obj);
        h72 coroutineContext = t72Var.getCoroutineContext();
        mh4<Object> mh4Var = this.u;
        try {
            ila ilaVar = new ila();
            ilaVar.B = sd.g(sd.e(coroutineContext), ilaVar);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ila.C;
            do {
                i = atomicIntegerFieldUpdater.get(ilaVar);
                if (i != 0) {
                    if (i == 2 || i == 3) {
                        break;
                        break;
                    }
                    ila.t(i);
                    throw null;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(ilaVar, i, 0));
            try {
                return mh4Var.invoke();
            } finally {
                ilaVar.s();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
