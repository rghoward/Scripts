package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fi7 extends pi4 implements ei4<gi7, p99<?>, Object, g2b> {
    public static final fi7 t = new fi7(3, gi7.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.ei4
    public final g2b invoke(gi7 gi7Var, p99<?> p99Var, Object obj) {
        final gi7 gi7Var2 = gi7Var;
        final p99<?> p99Var2 = p99Var;
        long j = gi7Var2.a;
        if (j <= 0) {
            p99Var2.d(g2b.a);
        } else {
            Runnable runnable = new Runnable() { // from class: ei7
                @Override // java.lang.Runnable
                public final void run() {
                    p99Var2.b(gi7Var2, g2b.a);
                }
            };
            p99Var2.getClass();
            n99 n99Var = (n99) p99Var2;
            h72 h72Var = n99Var.t;
            n99Var.v = bw2.c(h72Var).K(j, runnable, h72Var);
        }
        return g2b.a;
    }
}
