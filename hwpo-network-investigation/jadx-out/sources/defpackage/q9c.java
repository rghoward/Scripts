package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q9c implements u9c {
    public final cgc a;
    public final String b;

    public q9c(cgc cgcVar, String str) {
        this.a = cgcVar;
        this.b = str;
    }

    @Override // defpackage.u9c
    public final cgc a(a8c a8cVar) {
        cgc cgcVarC = this.a.c();
        String str = this.b;
        cgcVarC.f(str, a8cVar);
        cgcVarC.d.put(str, Boolean.TRUE);
        return cgcVarC;
    }
}
