package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class um3 extends ln4 {
    public static tm3 h1(pt7 pt7Var) {
        String strU = pt7Var.u();
        strU.getClass();
        String strU2 = pt7Var.u();
        strU2.getClass();
        return new tm3(strU, strU2, pt7Var.t(), pt7Var.t(), Arrays.copyOfRange(pt7Var.a, pt7Var.b, pt7Var.c));
    }

    @Override // defpackage.ln4
    public final su6 C0(xu6 xu6Var, ByteBuffer byteBuffer) {
        return new su6(h1(new pt7(byteBuffer.array(), byteBuffer.limit())));
    }
}
