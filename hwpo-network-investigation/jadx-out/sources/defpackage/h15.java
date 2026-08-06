package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h15 extends wp5 implements ci4<jz7.a, Float, Float> {
    public final /* synthetic */ j15[] u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h15(j15[] j15VarArr) {
        super(2);
        this.u = j15VarArr;
    }

    @Override // defpackage.ci4
    public final Float invoke(jz7.a aVar, Float f) {
        return Float.valueOf(vy8.a(aVar, true, this.u, f.floatValue()));
    }
}
