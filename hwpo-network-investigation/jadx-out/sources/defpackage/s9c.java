package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s9c implements u9c {
    public final cgc a;
    public final String b;

    public s9c(cgc cgcVar, String str) {
        this.a = cgcVar;
        this.b = str;
    }

    @Override // defpackage.u9c
    public final cgc a(a8c a8cVar) {
        cgc cgcVarC = this.a.c();
        cgcVarC.f(this.b, a8cVar);
        return cgcVarC;
    }
}
