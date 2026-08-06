package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ex3 implements cx3.d<InputStream> {
    @Override // cx3.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // cx3.d
    public final void b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // cx3.d
    public final InputStream c(File file) {
        return new FileInputStream(file);
    }
}
