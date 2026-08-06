package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class doc implements Executor {
    public final /* synthetic */ hrc t;

    public doc(hrc hrcVar) {
        this.t = hrcVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        fkc fkcVar = this.t.a.g;
        tkc.m(fkcVar);
        fkcVar.p(runnable);
    }
}
