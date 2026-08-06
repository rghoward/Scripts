package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rwc extends hxc {
    public volatile boolean x;
    public final boolean y;

    public rwc(String str, ozc ozcVar, boolean z) {
        super(str, ozcVar);
        this.y = z;
    }

    @Override // defpackage.cwc
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.y);
    }

    @Override // defpackage.cwc
    public final /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.cwc
    public final /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.hxc
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.x);
    }

    @Override // defpackage.hxc
    public final /* synthetic */ void e(Object obj) {
        this.x = ((Boolean) obj).booleanValue();
    }
}
