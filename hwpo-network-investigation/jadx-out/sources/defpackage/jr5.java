package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jr5 extends ox6.c implements lr5 {
    public ei4<? super hl6, ? super cl6, ? super xx1, ? extends gl6> H;

    public jr5() {
        throw null;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        return this.H.invoke(hl6Var, cl6Var, new xx1(j));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.H + ')';
    }
}
