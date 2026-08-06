package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ at(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ((mh4) obj).invoke();
                break;
            default:
                pz4 pz4Var = (pz4) obj;
                for (pz4.b bVar : pz4Var.O) {
                    bVar.B(pz4Var.n0);
                }
                pz4Var.V = true;
                pz4Var.F();
                break;
        }
    }
}
