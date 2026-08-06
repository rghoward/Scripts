package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m7d implements x40 {
    public final /* synthetic */ i7d a;
    public final /* synthetic */ x40 b;

    public m7d(i7d i7dVar, x40 x40Var) {
        this.a = i7dVar;
        this.b = x40Var;
    }

    @Override // defpackage.x40
    public final ListenableFuture apply(Object obj) {
        h7d h7dVarC = m6d.c();
        i7d i7dVarB = m6d.b(h7dVarC, this.a);
        try {
            ListenableFuture listenableFutureApply = this.b.apply(obj);
            if (listenableFutureApply == null) {
                throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
            }
            m6d.b(h7dVarC, i7dVarB);
            return listenableFutureApply;
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
        x40 x40Var = this.b;
        StringBuilder sb = new StringBuilder(x40Var.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(x40Var);
        sb.append("]");
        return sb.toString();
    }
}
