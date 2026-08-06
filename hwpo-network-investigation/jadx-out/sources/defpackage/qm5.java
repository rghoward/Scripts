package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qm5 extends td9 {
    public final String t;

    public qm5(String str) {
        super(str);
        this.t = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.t;
    }
}
