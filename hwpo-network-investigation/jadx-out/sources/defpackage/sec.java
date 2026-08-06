package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sec {
    public final q8c a;
    public final cgc b;
    public final cgc c;
    public final nmc d;

    public sec() {
        q8c q8cVar = new q8c();
        this.a = q8cVar;
        cgc cgcVar = new cgc(null, q8cVar);
        this.c = cgcVar;
        this.b = cgcVar.c();
        nmc nmcVar = new nmc();
        this.d = nmcVar;
        cgcVar.e("require", new o6d(nmcVar));
        nmcVar.a.put("internal.platform", ndc.a);
        cgcVar.e("runtime.counter", new d5c(Double.valueOf(0.0d)));
    }

    public final a8c a(cgc cgcVar, bnc... bncVarArr) {
        a8c a8cVarB = a8c.l;
        for (bnc bncVar : bncVarArr) {
            a8cVarB = ikc.b(bncVar);
            gic.k(this.c);
            if ((a8cVarB instanceof c8c) || (a8cVarB instanceof y7c)) {
                a8cVarB = this.a.b(cgcVar, a8cVarB);
            }
        }
        return a8cVarB;
    }
}
