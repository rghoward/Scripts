package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iqc extends b1 {
    public r9a A;

    @Override // defpackage.b1
    public final void c() {
        this.A = null;
    }

    @Override // defpackage.b1
    public final String j() {
        r9a r9aVar = this.A;
        return r9aVar == null ? BuildConfig.FLAVOR : r9aVar.toString();
    }
}
