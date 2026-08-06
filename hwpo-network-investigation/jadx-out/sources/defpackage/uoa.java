package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uoa extends ud4 {
    public final co6 c;

    public uoa(toa toaVar, co6 co6Var) {
        super(toaVar);
        this.c = co6Var;
    }

    @Override // defpackage.ud4, defpackage.toa
    public final toa.c m(int i, toa.c cVar, long j) {
        super.m(i, cVar, j);
        co6 co6Var = this.c;
        cVar.c = co6Var;
        co6.f fVar = co6Var.b;
        cVar.b = fVar != null ? fVar.e : null;
        return cVar;
    }
}
