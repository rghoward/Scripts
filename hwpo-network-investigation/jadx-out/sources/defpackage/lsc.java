package defpackage;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lsc implements Runnable {
    public final /* synthetic */ Level t;
    public final /* synthetic */ Throwable u;
    public final /* synthetic */ String v;
    public final /* synthetic */ Object[] w;

    public /* synthetic */ lsc(Level level, Throwable th, String str, Object[] objArr) {
        this.t = level;
        this.u = th;
        this.v = str;
        this.w = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8d j8dVar = jsc.a;
        l4c l4cVar = j8dVar.a;
        Level level = this.t;
        boolean zM = l4cVar.m(level);
        dyb.a.c().a((String) l4cVar.a, level, zM);
        ((g8d) ((g8d) (!zM ? j8d.b : new h8d(j8dVar, level)).b(this.u)).k()).a(this.v, this.w);
    }
}
