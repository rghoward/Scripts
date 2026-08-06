package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d31 {
    public final kza.a a;
    public final eq8 b;

    public d31(kza.a aVar, eq8 eq8Var) {
        this.a = aVar;
        this.b = eq8Var;
    }

    public final void a(hb4.a aVar) {
        int i = aVar.b;
        eq8 eq8Var = this.b;
        kza.a aVar2 = this.a;
        if (i == 0) {
            eq8Var.execute(new b31(aVar2, aVar.a));
        } else {
            eq8Var.execute(new c31(aVar2, i));
        }
    }
}
