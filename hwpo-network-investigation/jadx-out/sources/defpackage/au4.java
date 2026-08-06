package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class au4 extends sd4 {
    public final MessageDigest u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au4(vq0 vq0Var) throws NoSuchAlgorithmException {
        super(vq0Var);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.getClass();
        this.u = messageDigest;
    }

    @Override // defpackage.sd4, defpackage.yq9
    public final void i0(tx0 tx0Var, long j) {
        tx0Var.getClass();
        t.b(tx0Var.u, 0L, j);
        f99 f99Var = tx0Var.t;
        f99Var.getClass();
        long j2 = 0;
        while (j2 < j) {
            int iMin = (int) Math.min(j - j2, f99Var.c - f99Var.b);
            MessageDigest messageDigest = this.u;
            messageDigest.getClass();
            messageDigest.update(f99Var.a, f99Var.b, iMin);
            j2 += (long) iMin;
            f99Var = f99Var.f;
            f99Var.getClass();
        }
        super.i0(tx0Var, j);
    }
}
