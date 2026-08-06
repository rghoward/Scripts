package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface fy0 extends yq9, WritableByteChannel {
    long F(kw9 kw9Var);

    fy0 R(String str);

    fy0 U(long j);

    @Override // defpackage.yq9, java.io.Flushable
    void flush();

    tx0 j();

    fy0 k0(g01 g01Var);

    fy0 o0(long j);

    fy0 write(byte[] bArr);

    fy0 write(byte[] bArr, int i, int i2);

    fy0 writeByte(int i);

    fy0 writeInt(int i);

    fy0 writeShort(int i);
}
