package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q45 extends RuntimeException {
    public final transient ru8<?> t;

    public q45(ru8<?> ru8Var) {
        StringBuilder sb = new StringBuilder("HTTP ");
        qu8 qu8Var = ru8Var.a;
        sb.append(qu8Var.w);
        sb.append(" ");
        sb.append(qu8Var.v);
        super(sb.toString());
        this.t = ru8Var;
    }
}
