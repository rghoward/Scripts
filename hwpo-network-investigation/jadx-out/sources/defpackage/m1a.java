package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m1a extends s40<InputStream> {
    @Override // defpackage.xe2
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.s40
    public final void d(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // defpackage.s40
    public final InputStream e(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
