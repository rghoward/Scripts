package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend", v = 1)
public final class ch9 extends p6a implements ci4<t72, r02<Object>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ oh4<t72, Object> v;
    public final /* synthetic */ AtomicReference<bh9<Object>> w;
    public final /* synthetic */ ci4<Object, r02<Object>, Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ch9(oh4<? super t72, Object> oh4Var, AtomicReference<bh9<Object>> atomicReference, ci4<Object, ? super r02<Object>, ? extends Object> ci4Var, r02<? super ch9> r02Var) {
        super(2, r02Var);
        this.v = oh4Var;
        this.w = atomicReference;
        this.x = ci4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ch9 ch9Var = new ch9(this.v, this.w, this.x, r02Var);
        ch9Var.u = obj;
        return ch9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<Object> r02Var) {
        return ((ch9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        bh9<Object> bh9Var;
        bh9<Object> bh9Var2;
        int i = this.t;
        AtomicReference<bh9<Object>> atomicReference = this.w;
        v72 v72Var = v72.t;
        try {
            if (i == 0) {
                dv8.b(obj);
                t72 t72Var = (t72) this.u;
                bh9Var = new bh9<>(sd.e(t72Var.getCoroutineContext()), this.v.invoke(t72Var));
                bh9<Object> andSet = atomicReference.getAndSet(bh9Var);
                if (andSet != null) {
                    el5 el5Var = andSet.a;
                    this.u = bh9Var;
                    this.t = 1;
                    el5Var.k(null);
                    Object objP0 = el5Var.p0(this);
                    if (objP0 != v72Var) {
                        objP0 = g2b.a;
                    }
                    if (objP0 != v72Var) {
                    }
                }
                return v72Var;
            }
            if (i != 1) {
                if (i != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bh9Var2 = (bh9) this.u;
                try {
                    dv8.b(obj);
                    while (!atomicReference.compareAndSet(bh9Var2, null) && atomicReference.get() == bh9Var2) {
                    }
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    while (!atomicReference.compareAndSet(bh9Var2, null) && atomicReference.get() == bh9Var2) {
                    }
                    throw th;
                }
            }
            bh9Var = (bh9) this.u;
            dv8.b(obj);
            ci4<Object, r02<Object>, Object> ci4Var = this.x;
            Object obj2 = bh9Var.b;
            this.u = bh9Var;
            this.t = 2;
            obj = ci4Var.invoke(obj2, this);
            if (obj != v72Var) {
                bh9Var2 = bh9Var;
                while (!atomicReference.compareAndSet(bh9Var2, null)) {
                }
                return obj;
            }
            return v72Var;
        } catch (Throwable th2) {
            th = th2;
            bh9Var2 = bh9Var;
            while (!atomicReference.compareAndSet(bh9Var2, null)) {
            }
            throw th;
        }
    }
}
