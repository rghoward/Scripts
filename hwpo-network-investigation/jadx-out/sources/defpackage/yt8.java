package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yt8<Data> implements kx6<Integer, Data> {
    public final kx6<Uri, Data> a;
    public final Resources b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lx6<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.lx6
        public final kx6<Integer, AssetFileDescriptor> d(i07 i07Var) {
            return new yt8(this.a, i07Var.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements lx6<Integer, InputStream> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.lx6
        public final kx6<Integer, InputStream> d(i07 i07Var) {
            return new yt8(this.a, i07Var.a(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c implements lx6<Integer, Uri> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.lx6
        public final kx6<Integer, Uri> d(i07 i07Var) {
            return new yt8(this.a, j2b.a);
        }
    }

    public yt8(Resources resources, kx6<Uri, Data> kx6Var) {
        this.b = resources;
        this.a = kx6Var;
    }

    @Override // defpackage.kx6
    public final kx6.a a(Integer num, int i, int i2, xk7 xk7Var) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.b.getResourcePackageName(num2.intValue()) + '/' + num2);
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.a(uri, i, i2, xk7Var);
    }

    @Override // defpackage.kx6
    public final /* bridge */ /* synthetic */ boolean b(Integer num) {
        return true;
    }
}
