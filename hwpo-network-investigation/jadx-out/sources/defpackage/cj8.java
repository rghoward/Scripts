package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cj8 implements ar6 {
    public final c3a a;
    public final lkb b;

    public cj8(c3a c3aVar, lkb lkbVar) {
        this.a = c3aVar;
        this.b = lkbVar;
    }

    @Override // defpackage.ar6
    public final void a(int i) {
        this.a.a(i);
        this.b.a(i);
    }

    @Override // defpackage.ar6
    public final ar6.b b(ar6.a aVar) {
        ar6.b bVarB = this.a.b(aVar);
        return bVarB == null ? this.b.b(aVar) : bVarB;
    }

    @Override // defpackage.ar6
    public final void c(ar6.a aVar, ar6.b bVar) {
        this.a.c(new ar6.a(aVar.t, e.b(aVar.u)), bVar.a, e.b(bVar.b));
    }
}
