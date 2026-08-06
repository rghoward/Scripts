package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j2a<Data> implements kx6<String, Data> {
    public final kx6<Uri, Data> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lx6<String, AssetFileDescriptor> {
        @Override // defpackage.lx6
        public final kx6<String, AssetFileDescriptor> d(i07 i07Var) {
            return new j2a(i07Var.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements lx6<String, ParcelFileDescriptor> {
        @Override // defpackage.lx6
        public final kx6<String, ParcelFileDescriptor> d(i07 i07Var) {
            return new j2a(i07Var.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c implements lx6<String, InputStream> {
        @Override // defpackage.lx6
        public final kx6<String, InputStream> d(i07 i07Var) {
            return new j2a(i07Var.a(Uri.class, InputStream.class));
        }
    }

    public j2a(kx6<Uri, Data> kx6Var) {
        this.a = kx6Var;
    }

    @Override // defpackage.kx6
    public final kx6.a a(String str, int i, int i2, xk7 xk7Var) {
        Uri uriFromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile != null) {
            kx6<Uri, Data> kx6Var = this.a;
            if (kx6Var.b(uriFromFile)) {
                return kx6Var.a(uriFromFile, i, i2, xk7Var);
            }
        }
        return null;
    }

    @Override // defpackage.kx6
    public final /* bridge */ /* synthetic */ boolean b(String str) {
        return true;
    }
}
