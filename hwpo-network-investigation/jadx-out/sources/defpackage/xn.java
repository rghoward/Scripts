package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xn implements zf6 {
    @Override // defpackage.zf6
    public final gt4 a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new gt4(it4.a(mainLooper));
        }
        aa0.c("The main looper is not available");
        return null;
    }
}
