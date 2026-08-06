package defpackage;

import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e5b implements kx6<URL, InputStream> {
    public final kx6<wm4, InputStream> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements lx6<URL, InputStream> {
        @Override // defpackage.lx6
        public final kx6<URL, InputStream> d(i07 i07Var) {
            return new e5b(i07Var.a(wm4.class, InputStream.class));
        }
    }

    public e5b(kx6<wm4, InputStream> kx6Var) {
        this.a = kx6Var;
    }

    @Override // defpackage.kx6
    public final kx6.a<InputStream> a(URL url, int i, int i2, xk7 xk7Var) {
        return this.a.a(new wm4(url), i, i2, xk7Var);
    }

    @Override // defpackage.kx6
    public final /* bridge */ /* synthetic */ boolean b(URL url) {
        return true;
    }
}
