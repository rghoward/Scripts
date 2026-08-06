package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dnb extends cnb {
    @Override // defpackage.bnb, defpackage.x10
    public final boolean c() {
        return (this.f.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.bnb, defpackage.x10
    public final void g(boolean z) {
        this.f.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.bnb, defpackage.x10
    public final void h(boolean z) {
        this.f.setSystemBarsAppearance(z ? 8 : 0, 8);
    }
}
