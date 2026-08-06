package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rz0 implements pt8<ByteBuffer, Bitmap> {
    public final w43 a;

    public rz0(w43 w43Var) {
        this.a = w43Var;
    }

    @Override // defpackage.pt8
    public final kt8<Bitmap> a(ByteBuffer byteBuffer, int i, int i2, xk7 xk7Var) {
        w43 w43Var = this.a;
        return w43Var.a(new i85.a(byteBuffer, w43Var.d, w43Var.c), i, i2, xk7Var, w43.k);
    }

    @Override // defpackage.pt8
    public final boolean b(ByteBuffer byteBuffer, xk7 xk7Var) {
        return true;
    }
}
