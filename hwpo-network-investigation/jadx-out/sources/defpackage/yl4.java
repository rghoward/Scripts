package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yl4 implements st8<xl4> {
    @Override // defpackage.st8
    public final uf3 a(xk7 xk7Var) {
        return uf3.t;
    }

    @Override // defpackage.xf3
    public final boolean b(Object obj, File file, xk7 xk7Var) throws Throwable {
        try {
            yz0.d(((xl4) ((kt8) obj).get()).t.a.a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }
}
