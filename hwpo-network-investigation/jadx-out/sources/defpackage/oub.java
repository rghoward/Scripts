package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oub implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ rub u;

    public oub(rub rubVar, int i) {
        this.t = i;
        this.u = rubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.u.c(this.t);
    }
}
