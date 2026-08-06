package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w7 implements oh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                e8.a aVar = e8.Companion;
                return Boolean.valueOf(((p8) obj).f);
            case 1:
                return Boolean.TRUE;
            default:
                cw cwVar = (cw) obj;
                float f = cwVar.a;
                return new vf7((((long) Float.floatToRawIntBits(cwVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        }
    }
}
