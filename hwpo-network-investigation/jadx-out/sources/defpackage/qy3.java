package defpackage;

import android.net.Uri;
import com.intercom.twig.BuildConfig;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qy3 implements hi6<Uri, File> {
    @Override // defpackage.hi6
    public final File a(Uri uri, zk7 zk7Var) {
        Uri uri2 = uri;
        if (v.d(uri2)) {
            return null;
        }
        String scheme = uri2.getScheme();
        if (scheme != null && !scheme.equals("file")) {
            return null;
        }
        String path = uri2.getPath();
        if (path == null) {
            path = BuildConfig.FLAVOR;
        }
        if (!z2a.K(path, '/') || ((String) th1.A(uri2.getPathSegments())) == null) {
            return null;
        }
        if (!xj5.a(uri2.getScheme(), "file")) {
            return new File(uri2.toString());
        }
        String path2 = uri2.getPath();
        if (path2 != null) {
            return new File(path2);
        }
        return null;
    }
}
