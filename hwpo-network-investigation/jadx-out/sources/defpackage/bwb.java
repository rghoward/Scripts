package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bwb extends nvb {
    public final db6.a c;

    public bwb(db6.a aVar, t9a t9aVar) {
        super(4, t9aVar);
        this.c = aVar;
    }

    @Override // defpackage.dvb
    public final fu3[] f(rub rubVar) {
        fvb fvbVar = (fvb) rubVar.g.get(this.c);
        if (fvbVar == null) {
            return null;
        }
        return fvbVar.a.b;
    }

    @Override // defpackage.dvb
    public final boolean g(rub rubVar) {
        fvb fvbVar = (fvb) rubVar.g.get(this.c);
        return fvbVar != null && fvbVar.a.c;
    }

    @Override // defpackage.dvb
    public final int h(rub rubVar) {
        return ((fvb) rubVar.g.get(this.c)) != null ? 0 : -1;
    }

    @Override // defpackage.nvb
    public final void i(rub rubVar) {
        fvb fvbVar = (fvb) rubVar.g.remove(this.c);
        if (fvbVar == null) {
            this.b.d(Boolean.FALSE);
            return;
        }
        fvbVar.b.a.b.accept(rubVar.c, this.b);
        fvbVar.a.a.b = null;
    }

    @Override // defpackage.ewb
    public final /* bridge */ /* synthetic */ void c(cub cubVar, boolean z) {
    }
}
