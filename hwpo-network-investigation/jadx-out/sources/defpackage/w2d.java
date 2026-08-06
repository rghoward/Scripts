package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w2d implements k3d {
    @Override // defpackage.k3d
    public final InputStream a(Uri uri) throws b3d {
        File fileD = hnb.d(uri);
        return new d3d(new FileInputStream(fileD), fileD);
    }

    @Override // defpackage.k3d
    public final boolean b(Uri uri) {
        return hnb.d(uri).exists();
    }

    @Override // defpackage.k3d
    public final String c() {
        return "file";
    }

    @Override // defpackage.k3d
    public final File d(Uri uri) {
        return hnb.d(uri);
    }

    @Override // defpackage.k3d
    public final OutputStream e(Uri uri) throws IOException {
        File fileD = hnb.d(uri);
        uy3.a(fileD);
        return new e3d(new FileOutputStream(fileD), fileD);
    }

    @Override // defpackage.k3d
    public final void f(Uri uri) throws IOException {
        File fileD = hnb.d(uri);
        if (fileD.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileD.delete()) {
            return;
        }
        if (!fileD.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.k3d
    public final void g(Uri uri, Uri uri2) throws IOException {
        File fileD = hnb.d(uri);
        File fileD2 = hnb.d(uri2);
        uy3.a(fileD2);
        if (!fileD.renameTo(fileD2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}
