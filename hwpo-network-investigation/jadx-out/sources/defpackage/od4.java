package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class od4<V> extends nd4<V> implements ListenableFuture<V> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a<V> extends od4<V> {
        public final b1 x;

        public a(b1 b1Var) {
            super(10);
            this.x = b1Var;
        }

        @Override // defpackage.ln4
        public final Object E0() {
            return this.x;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void Q(Runnable runnable, Executor executor) {
        ((a) this).x.Q(runnable, executor);
    }
}
