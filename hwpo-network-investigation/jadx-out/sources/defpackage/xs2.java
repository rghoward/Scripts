package defpackage;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xs2 implements l5a {
    @Override // defpackage.l5a
    public final Object get() {
        byte[] bArr = new byte[12];
        ys2.i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
