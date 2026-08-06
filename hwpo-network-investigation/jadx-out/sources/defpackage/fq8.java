package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fq8<T> implements Runnable {
    public fb4 t;
    public gb4 u;
    public Handler v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public final /* synthetic */ gb4 t;
        public final /* synthetic */ Object u;

        public a(gb4 gb4Var, Object obj) {
            this.t = gb4Var;
            this.u = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.t.accept(this.u);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.t.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.v.post(new a(this.u, objCall));
    }
}
