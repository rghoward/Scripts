package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rmc implements Runnable {
    public final t9a t;

    public rmc() {
        this.t = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            t9a t9aVar = this.t;
            if (t9aVar != null) {
                t9aVar.c(e);
            }
        }
    }

    public rmc(t9a t9aVar) {
        this.t = t9aVar;
    }
}
