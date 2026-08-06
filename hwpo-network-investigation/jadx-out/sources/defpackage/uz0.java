package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uz0 implements lu3 {
    public final ByteBuffer a;
    public final zk7 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements lu3.a<ByteBuffer> {
        @Override // lu3.a
        public final lu3 a(Object obj, zk7 zk7Var) {
            return new uz0((ByteBuffer) obj, zk7Var);
        }
    }

    public uz0(ByteBuffer byteBuffer, zk7 zk7Var) {
        this.a = byteBuffer;
        this.b = zk7Var;
    }

    @Override // defpackage.lu3
    public final Object a(r02<? super ku3> r02Var) {
        ByteBuffer byteBuffer = this.a;
        try {
            tx0 tx0Var = new tx0();
            tx0Var.write(byteBuffer);
            return new tw9(new nw9(tx0Var, new ld2(2, this.b.a), null), null, jf2.u);
        } finally {
            byteBuffer.position(0);
        }
    }
}
