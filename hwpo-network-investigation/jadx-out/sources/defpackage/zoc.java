package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zoc implements Runnable {
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ long w;
    public final /* synthetic */ hrc x;

    public zoc(hrc hrcVar, String str, String str2, Object obj, long j) {
        this.t = str;
        this.u = str2;
        this.v = obj;
        this.w = j;
        this.x = hrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.v;
        this.x.r(this.w, obj, this.t, this.u);
    }
}
