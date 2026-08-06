package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ucb implements oh4 {
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        cw cwVar = (cw) obj;
        int iRound = Math.round(cwVar.a);
        if (iRound < 0) {
            iRound = 0;
        }
        int iRound2 = Math.round(cwVar.b);
        return new kg5((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
    }
}
