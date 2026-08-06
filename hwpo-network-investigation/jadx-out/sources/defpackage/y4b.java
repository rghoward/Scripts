package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y4b implements fp5<Uri> {
    @Override // defpackage.fp5
    public final String a(Uri uri, zk7 zk7Var) {
        Uri uri2 = uri;
        if (!xj5.a(uri2.getScheme(), "android.resource")) {
            return uri2.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri2);
        sb.append('-');
        Configuration configuration = zk7Var.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = v.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
