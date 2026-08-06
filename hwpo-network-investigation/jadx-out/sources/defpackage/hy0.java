package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface hy0 extends kw9, ReadableByteChannel {
    String I(long j);

    long M(fy0 fy0Var);

    String S(Charset charset);

    String b0();

    tx0 j();

    void n0(long j);

    boolean q(long j, g01 g01Var);

    long q0();

    g01 r(long j);

    InputStream r0();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    int s(yk7 yk7Var);

    void s0(tx0 tx0Var, long j);

    void skip(long j);

    byte[] x();

    boolean z();
}
