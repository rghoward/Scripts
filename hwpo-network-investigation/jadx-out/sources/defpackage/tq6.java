package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tq6 implements kx6<Uri, InputStream> {
    public final Context a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements lx6<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.lx6
        public final kx6<Uri, InputStream> d(i07 i07Var) {
            return new tq6(this.a);
        }
    }

    public tq6(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.kx6
    public final kx6.a<InputStream> a(Uri uri, int i, int i2, xk7 xk7Var) {
        Uri uri2 = uri;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
            return null;
        }
        ke7 ke7Var = new ke7(uri2);
        Context context = this.a;
        return new kx6.a<>(ke7Var, mla.d(context, uri2, new mla.a(context.getContentResolver())));
    }

    @Override // defpackage.kx6
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return uq6.b(uri2) && !uri2.getPathSegments().contains("video");
    }
}
