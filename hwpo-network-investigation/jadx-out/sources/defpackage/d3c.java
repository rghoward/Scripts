package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d3c extends Exception {
    public final ax1 t;

    public d3c(ax1 ax1Var) {
        a78.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (ax1Var.u == 0 || ax1Var.v == null) ? false : true);
        this.t = ax1Var;
    }
}
