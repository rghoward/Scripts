package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ow3 extends vc6<ParcelFileDescriptor> {
    @Override // defpackage.xe2
    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.vc6
    public final void d(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // defpackage.vc6
    public final Object e(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        boolean z = this.t;
        ContentResolver contentResolver2 = this.v;
        AssetFileDescriptor assetFileDescriptorC = (z && uq6.b(uri) && uq6.a()) ? uq6.c(contentResolver2, uri) : contentResolver2.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorC != null) {
            return assetFileDescriptorC.getParcelFileDescriptor();
        }
        fk.a(uri, "FileDescriptor is null for: ");
        return null;
    }
}
