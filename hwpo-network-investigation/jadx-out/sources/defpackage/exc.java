package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class exc extends hxc {
    public volatile String x;
    public final String y;

    public exc(String str, ozc ozcVar, String str2) {
        super(str, ozcVar);
        this.y = str2;
    }

    @Override // defpackage.cwc
    public final /* synthetic */ Object a() {
        return this.y;
    }

    @Override // defpackage.cwc
    public final /* synthetic */ Object c(Object obj) {
        return (String) obj;
    }

    @Override // defpackage.hxc
    public final /* synthetic */ Object d() {
        return this.x;
    }

    @Override // defpackage.hxc
    public final /* synthetic */ void e(Object obj) {
        this.x = (String) obj;
    }

    @Override // defpackage.cwc
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return str;
    }
}
