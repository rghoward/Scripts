package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bxc extends hxc {
    public volatile long x;
    public final long y;

    public bxc(String str, ozc ozcVar, long j) {
        super(str, ozcVar);
        this.y = j;
    }

    @Override // defpackage.cwc
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.y);
    }

    @Override // defpackage.cwc
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.cwc
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.hxc
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.x);
    }

    @Override // defpackage.hxc
    public final /* synthetic */ void e(Object obj) {
        this.x = ((Long) obj).longValue();
    }
}
