package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface w3d {
    String a();

    default InputStream b(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            inputStream.close();
        }
        throw new c3d("wrapForRead not supported by ".concat(String.valueOf(a())));
    }

    default OutputStream c(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new c3d("wrapForWrite not supported by ".concat(String.valueOf(a())));
    }
}
