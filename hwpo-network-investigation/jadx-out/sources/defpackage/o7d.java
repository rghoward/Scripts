package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o7d extends q8d {
    public final jqc e;

    public /* synthetic */ o7d(jqc jqcVar) {
        super(false, null, null);
        this.e = jqcVar;
    }

    @Override // defpackage.q8d
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            d55.a(e);
            return null;
        }
    }
}
