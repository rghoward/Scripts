package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class afa implements oh4 {
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        ufa ufaVar = (ufa) obj;
        String str = ufaVar.g.u;
        long j = ufaVar.f;
        int i = lja.c;
        int iC = rh0.c((int) (j & 4294967295L), str);
        if (iC != -1) {
            return new lx2(0, iC - ((int) (ufaVar.f & 4294967295L)));
        }
        return null;
    }
}
