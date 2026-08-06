package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class x9a extends q9a {
    public final /* synthetic */ mh4<Long> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9a(String str, mh4<Long> mh4Var) {
        super(str, true);
        this.e = mh4Var;
    }

    @Override // defpackage.q9a
    public final long a() {
        return this.e.invoke().longValue();
    }
}
