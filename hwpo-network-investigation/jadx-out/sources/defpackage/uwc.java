package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uwc extends hxc {
    public volatile double x;

    @Override // defpackage.cwc
    public final /* synthetic */ Object a() {
        return Double.valueOf(-3.0d);
    }

    @Override // defpackage.cwc
    public final /* synthetic */ Object b(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // defpackage.cwc
    public final /* synthetic */ Object c(Object obj) {
        return (Double) obj;
    }

    @Override // defpackage.hxc
    public final /* synthetic */ Object d() {
        return Double.valueOf(this.x);
    }

    @Override // defpackage.hxc
    public final /* synthetic */ void e(Object obj) {
        this.x = ((Double) obj).doubleValue();
    }
}
