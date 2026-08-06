package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q40 extends vc6<AssetFileDescriptor> {
    @Override // defpackage.xe2
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.vc6
    public final void d(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // defpackage.vc6
    public final Object e(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        boolean z = this.t;
        ContentResolver contentResolver2 = this.v;
        AssetFileDescriptor assetFileDescriptorC = (z && uq6.b(uri) && uq6.a()) ? uq6.c(contentResolver2, uri) : contentResolver2.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorC != null) {
            return assetFileDescriptorC;
        }
        fk.a(uri, "FileDescriptor is null for: ");
        return null;
    }
}
