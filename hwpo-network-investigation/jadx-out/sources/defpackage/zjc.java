package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zjc implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ fkc b;

    public zjc(fkc fkcVar, String str) {
        this.b = fkcVar;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        thc thcVar = this.b.a.f;
        tkc.m(thcVar);
        thcVar.f.b(th, this.a);
    }
}
