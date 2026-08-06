package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e3b extends ut7 {
    public final k95<nv9> v;

    public e3b(String str, ul8 ul8Var) {
        super(str, null, false, 1);
        this.v = k95.q(ul8Var);
    }

    @Override // defpackage.ut7, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        k95<nv9> k95Var = this.v;
        if (k95Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + k95Var;
    }
}
