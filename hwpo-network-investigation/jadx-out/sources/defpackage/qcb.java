package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qcb implements oh4 {
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        cw cwVar = (cw) obj;
        float f = cwVar.a;
        return new cr9((((long) Float.floatToRawIntBits(cwVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
