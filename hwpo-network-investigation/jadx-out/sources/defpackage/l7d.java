package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l7d implements w40 {
    public final /* synthetic */ i7d a;
    public final /* synthetic */ w40 b;

    public l7d(i7d i7dVar, w40 w40Var) {
        this.a = i7dVar;
        this.b = w40Var;
    }

    @Override // defpackage.w40
    public final ListenableFuture call() {
        h7d h7dVarC = m6d.c();
        i7d i7dVarB = m6d.b(h7dVarC, this.a);
        try {
            ListenableFuture listenableFutureCall = this.b.call();
            m6d.b(h7dVarC, i7dVarB);
            listenableFutureCall.getClass();
            return listenableFutureCall;
        } catch (Throwable th) {
            try {
                i6d.a(th);
                throw th;
            } catch (Throwable th2) {
                m6d.b(h7dVarC, i7dVarB);
                throw th2;
            }
        }
    }

    public final String toString() {
        w40 w40Var = this.b;
        StringBuilder sb = new StringBuilder(w40Var.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(w40Var);
        sb.append("]");
        return sb.toString();
    }
}
