package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v40<Data> implements kx6<Uri, Data> {
    public final AssetManager a;
    public final a<Data> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a<Data> {
        xe2<Data> a(AssetManager assetManager, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements lx6<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // v40.a
        public final xe2<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new mw3(assetManager, str);
        }

        @Override // defpackage.lx6
        public final kx6<Uri, AssetFileDescriptor> d(i07 i07Var) {
            return new v40(this.a, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c implements lx6<Uri, InputStream>, a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // v40.a
        public final xe2<InputStream> a(AssetManager assetManager, String str) {
            return new m1a(assetManager, str);
        }

        @Override // defpackage.lx6
        public final kx6<Uri, InputStream> d(i07 i07Var) {
            return new v40(this.a, this);
        }
    }

    public v40(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    @Override // defpackage.kx6
    public final kx6.a a(Uri uri, int i, int i2, xk7 xk7Var) {
        Uri uri2 = uri;
        return new kx6.a(new ke7(uri2), this.b.a(this.a, uri2.toString().substring(22)));
    }

    @Override // defpackage.kx6
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}
