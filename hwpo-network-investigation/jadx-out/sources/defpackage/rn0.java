package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rn0 extends nn2 {
    public long B;
    public int C;
    public int D;

    @Override // defpackage.nn2
    public final void j() {
        super.j();
        this.C = 0;
    }

    public final boolean n(nn2 nn2Var) {
        ByteBuffer byteBuffer;
        xl7.g(!nn2Var.i(1073741824));
        xl7.g(!nn2Var.i(268435456));
        xl7.g(!nn2Var.i(4));
        if (o()) {
            if (this.C >= this.D) {
                return false;
            }
            ByteBuffer byteBuffer2 = nn2Var.w;
            if (byteBuffer2 != null && (byteBuffer = this.w) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.C;
        this.C = i + 1;
        if (i == 0) {
            this.y = nn2Var.y;
            if (nn2Var.i(1)) {
                this.t = 1;
            }
        }
        ByteBuffer byteBuffer3 = nn2Var.w;
        if (byteBuffer3 != null) {
            l(byteBuffer3.remaining());
            this.w.put(byteBuffer3);
        }
        this.B = nn2Var.y;
        return true;
    }

    public final boolean o() {
        return this.C > 0;
    }
}
