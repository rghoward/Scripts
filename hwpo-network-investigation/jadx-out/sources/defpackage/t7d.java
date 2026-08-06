package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t7d implements Runnable {
    public final /* synthetic */ q6d t;
    public final /* synthetic */ Callable u;

    public t7d(q6d q6dVar, Callable callable) {
        this.t = q6dVar;
        this.u = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q6d q6dVar = this.t;
        try {
            q6dVar.p(this.u.call());
        } catch (Exception e) {
            q6dVar.r(e);
        } catch (Throwable th) {
            q6dVar.r(new RuntimeException(th));
        }
    }
}
