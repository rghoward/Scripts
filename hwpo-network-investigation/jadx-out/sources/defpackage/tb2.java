package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tb2 extends wp5 implements oh4<Object, Boolean> {
    public final /* synthetic */ tva<Object> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb2(tva<Object> tvaVar) {
        super(1);
        this.u = tvaVar;
    }

    @Override // defpackage.oh4
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(!xj5.a(obj, this.u.d.getValue()));
    }
}
