package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mf2 extends InputStream implements InputStreamRetargetInterface {
    public final if2 t;
    public final of2 u;
    public boolean w = false;
    public boolean x = false;
    public final byte[] v = new byte[1];

    public mf2(if2 if2Var, of2 of2Var) {
        this.t = if2Var;
        this.u = of2Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.x) {
            return;
        }
        this.t.close();
        this.x = true;
    }

    public final void h() {
        if (this.w) {
            return;
        }
        this.t.c(this.u);
        this.w = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        xl7.r(!this.x);
        h();
        int i3 = this.t.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.v;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & MessagePack.Code.EXT_TIMESTAMP;
    }
}
