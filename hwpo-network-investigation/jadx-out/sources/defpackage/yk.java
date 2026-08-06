package defpackage;

import android.graphics.ImageDecoder;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yk {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source a(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* synthetic */ void b() {
        throw new ConcurrentModificationException();
    }
}
