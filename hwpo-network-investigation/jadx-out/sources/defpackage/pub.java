package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pub implements Runnable {
    public final /* synthetic */ qub t;

    public pub(qub qubVar) {
        this.t = qubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rub rubVar = this.t.a;
        rubVar.c.c(rubVar.c.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
