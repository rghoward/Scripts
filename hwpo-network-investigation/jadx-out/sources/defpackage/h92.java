package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h92 implements Callable {
    public final /* synthetic */ l92 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ h92(l92 l92Var, long j, String str) {
        this.a = l92Var;
        this.b = j;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        final l92 l92Var = this.a;
        oa2 oa2Var = l92Var.o.b;
        final long j = this.b;
        final String str = this.c;
        return oa2Var.a(new Runnable() { // from class: j92
            @Override // java.lang.Runnable
            public final void run() {
                d92 d92Var = l92Var.g;
                la2 la2Var = d92Var.n;
                if (la2Var == null || !la2Var.e.get()) {
                    d92Var.i.b.c(j, str);
                }
            }
        });
    }
}
