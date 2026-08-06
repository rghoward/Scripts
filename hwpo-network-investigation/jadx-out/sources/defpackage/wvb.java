package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wvb extends nvb {
    public final fvb c;

    public wvb(fvb fvbVar, t9a t9aVar) {
        super(3, t9aVar);
        this.c = fvbVar;
    }

    @Override // defpackage.dvb
    public final fu3[] f(rub rubVar) {
        return this.c.a.b;
    }

    @Override // defpackage.dvb
    public final boolean g(rub rubVar) {
        return this.c.a.c;
    }

    @Override // defpackage.dvb
    public final int h(rub rubVar) {
        return 0;
    }

    @Override // defpackage.nvb
    public final void i(rub rubVar) {
        fvb fvbVar = this.c;
        gvb gvbVar = fvbVar.a;
        gvbVar.d.a.accept(rubVar.c, this.b);
        db6.a aVar = gvbVar.a.b;
        if (aVar != null) {
            rubVar.g.put(aVar, fvbVar);
        }
    }

    @Override // defpackage.ewb
    public final /* bridge */ /* synthetic */ void c(cub cubVar, boolean z) {
    }
}
