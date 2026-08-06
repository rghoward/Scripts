package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface k3d {
    default InputStream a(Uri uri) throws c3d {
        throw new c3d("openForRead not supported by ".concat(c()));
    }

    default boolean b(Uri uri) throws c3d {
        throw new c3d("exists not supported by ".concat(c()));
    }

    String c();

    default File d(Uri uri) throws c3d {
        String strC = c();
        String strValueOf = String.valueOf(uri);
        throw new c3d(ao2.a(new StringBuilder(strC.length() + 28 + strValueOf.length()), "Cannot convert uri to file ", strC, " ", strValueOf));
    }

    default OutputStream e(Uri uri) throws c3d {
        throw new c3d("openForWrite not supported by ".concat(c()));
    }

    default void f(Uri uri) throws c3d {
        throw new c3d("deleteFile not supported by ".concat(c()));
    }

    default void g(Uri uri, Uri uri2) throws c3d {
        throw new c3d("rename not supported by ".concat(c()));
    }
}
