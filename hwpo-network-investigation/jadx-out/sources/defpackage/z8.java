package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z8 implements Runnable {
    public final /* synthetic */ a9 t;

    public z8(a9 a9Var) {
        this.t = a9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9 a9Var = this.t;
        while (true) {
            try {
                a9Var.b((a9.a) a9Var.c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
