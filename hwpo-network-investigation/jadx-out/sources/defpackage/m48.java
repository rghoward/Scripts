package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m48 extends ud4 {
    public final toa.c c;

    public m48(toa toaVar) {
        super(toaVar);
        this.c = new toa.c();
    }

    @Override // defpackage.ud4, defpackage.toa
    public final toa.b f(int i, toa.b bVar, boolean z) {
        toa toaVar = this.b;
        toa.b bVarF = toaVar.f(i, bVar, z);
        if (toaVar.m(bVarF.c, this.c, 0L).a()) {
            bVarF.h(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, sa.c, true);
            return bVarF;
        }
        bVarF.f = true;
        return bVarF;
    }
}
