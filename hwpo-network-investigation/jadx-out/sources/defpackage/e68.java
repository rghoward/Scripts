package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e68 extends wp5 implements mh4<Boolean> {
    public final /* synthetic */ d68 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e68(d68 d68Var) {
        super(0);
        this.u = d68Var;
    }

    @Override // defpackage.mh4
    public final Boolean invoke() {
        d68 d68Var = this.u;
        qq5 parentLayoutCoordinates = d68Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.e()) {
            parentLayoutCoordinates = null;
        }
        return Boolean.valueOf((parentLayoutCoordinates == null || d68Var.m7getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
