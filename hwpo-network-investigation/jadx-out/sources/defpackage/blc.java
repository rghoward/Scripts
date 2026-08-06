package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class blc implements Runnable {
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ long w;
    public final /* synthetic */ zmc x;

    public blc(zmc zmcVar, String str, String str2, String str3, long j) {
        this.t = str;
        this.u = str2;
        this.v = str3;
        this.w = j;
        this.x = zmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.u;
        zmc zmcVar = this.x;
        String str2 = this.t;
        if (str2 == null) {
            lzc lzcVar = zmcVar.b;
            lzcVar.e().g();
            String str3 = lzcVar.G;
            if (str3 == null || str3.equals(str)) {
                lzcVar.G = str;
                lzcVar.F = null;
                return;
            }
            return;
        }
        dsc dscVar = new dsc(this.v, str2, this.w);
        lzc lzcVar2 = zmcVar.b;
        lzcVar2.e().g();
        String str4 = lzcVar2.G;
        if (str4 != null) {
            str4.equals(str);
        }
        lzcVar2.G = str;
        lzcVar2.F = dscVar;
    }
}
