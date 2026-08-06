package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l3d implements k3d {
    @Override // defpackage.k3d
    public final OutputStream e(Uri uri) {
        return ((m2d) this).b.e(h(uri));
    }

    @Override // defpackage.k3d
    public final void f(Uri uri) throws IOException {
        ((m2d) this).b.f(h(uri));
    }

    @Override // defpackage.k3d
    public final void g(Uri uri, Uri uri2) throws IOException {
        m2d m2dVar = (m2d) this;
        m2dVar.b.g(h(uri), h(uri2));
    }

    public abstract Uri h(Uri uri);
}
