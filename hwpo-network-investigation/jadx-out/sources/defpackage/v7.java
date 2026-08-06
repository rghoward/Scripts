package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v7 implements oh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                e8.a aVar = e8.Companion;
                return ((p8) obj).e;
            case 1:
                vf7 vf7Var = (vf7) obj;
                long j = vf7Var.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new cw(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & vf7Var.a))) : eb9.a;
            case 2:
                return g2b.a;
            default:
                ufa ufaVar = (ufa) obj;
                Integer numA = ufaVar.a();
                if (numA == null) {
                    return null;
                }
                int iIntValue = numA.intValue();
                long j2 = ufaVar.f;
                int i = lja.c;
                return new lx2(0, iIntValue - ((int) (4294967295L & j2)));
        }
    }
}
