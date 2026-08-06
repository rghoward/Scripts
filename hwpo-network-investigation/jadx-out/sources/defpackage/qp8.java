package defpackage;

import java.io.File;
import java.io.FileDescriptor;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qp8 {
    public static final a Companion = new a();
    public static final qp8 EMPTY;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static pp8 a(wq6 wq6Var, byte[] bArr, int i, int i2) {
            bArr.getClass();
            vtb.a(bArr.length, i, i2);
            return new pp8(wq6Var, bArr, i2, i);
        }

        public static pp8 b(String str, wq6 wq6Var) {
            str.getClass();
            js7<Charset, wq6> js7VarA = aj5.a(wq6Var);
            Charset charset = js7VarA.t;
            wq6 wq6Var2 = js7VarA.u;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            return a(wq6Var2, bytes, 0, bytes.length);
        }

        public static /* synthetic */ pp8 c(a aVar, byte[] bArr, wq6 wq6Var, int i, int i2) {
            if ((i2 & 1) != 0) {
                wq6Var = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            int length = bArr.length;
            aVar.getClass();
            return a(wq6Var, bArr, i, length);
        }
    }

    static {
        g01 g01Var = g01.w;
        g01Var.getClass();
        EMPTY = new np8(null, g01Var);
    }

    public static final qp8 create(du7 du7Var, fy3 fy3Var, wq6 wq6Var) {
        Companion.getClass();
        du7Var.getClass();
        fy3Var.getClass();
        return new mp8(du7Var, fy3Var, wq6Var);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract wq6 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public final g01 sha256() throws Throwable {
        au4 au4Var = new au4(new vq0());
        mi8 mi8Var = new mi8(au4Var);
        try {
            writeTo(mi8Var);
            g2b g2bVar = g2b.a;
            mi8Var.close();
            MessageDigest messageDigest = au4Var.u;
            messageDigest.getClass();
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest.getClass();
            return new g01(bArrDigest);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fg1.a(mi8Var, th);
                throw th2;
            }
        }
    }

    public abstract void writeTo(fy0 fy0Var);

    @gy2
    public static final qp8 create(wq6 wq6Var, File file) {
        Companion.getClass();
        file.getClass();
        return new lp8(wq6Var, file);
    }

    @gy2
    public static final qp8 create(wq6 wq6Var, String str) {
        Companion.getClass();
        str.getClass();
        return a.b(str, wq6Var);
    }

    @gy2
    public static final qp8 create(wq6 wq6Var, byte[] bArr) {
        Companion.getClass();
        bArr.getClass();
        return a.a(wq6Var, bArr, 0, bArr.length);
    }

    @gy2
    public static final qp8 create(wq6 wq6Var, byte[] bArr, int i) {
        Companion.getClass();
        bArr.getClass();
        return a.a(wq6Var, bArr, i, bArr.length);
    }

    @gy2
    public static final qp8 create(wq6 wq6Var, g01 g01Var) {
        Companion.getClass();
        g01Var.getClass();
        return new np8(wq6Var, g01Var);
    }

    public static final qp8 create(FileDescriptor fileDescriptor, wq6 wq6Var) {
        Companion.getClass();
        fileDescriptor.getClass();
        return new op8(fileDescriptor, wq6Var);
    }

    public static final qp8 create(String str, wq6 wq6Var) {
        Companion.getClass();
        return a.b(str, wq6Var);
    }

    public static final qp8 create(byte[] bArr) {
        a aVar = Companion;
        aVar.getClass();
        bArr.getClass();
        return a.c(aVar, bArr, null, 0, 7);
    }

    public static final qp8 create(byte[] bArr, wq6 wq6Var) {
        a aVar = Companion;
        aVar.getClass();
        bArr.getClass();
        return a.c(aVar, bArr, wq6Var, 0, 6);
    }

    public static final qp8 create(byte[] bArr, wq6 wq6Var, int i) {
        a aVar = Companion;
        aVar.getClass();
        bArr.getClass();
        return a.c(aVar, bArr, wq6Var, i, 4);
    }

    public static final qp8 create(byte[] bArr, wq6 wq6Var, int i, int i2) {
        Companion.getClass();
        return a.a(wq6Var, bArr, i, i2);
    }

    public static final qp8 create(g01 g01Var, wq6 wq6Var) {
        Companion.getClass();
        g01Var.getClass();
        return new np8(wq6Var, g01Var);
    }

    public static final qp8 create(File file, wq6 wq6Var) {
        Companion.getClass();
        file.getClass();
        return new lp8(wq6Var, file);
    }

    @gy2
    public static final qp8 create(wq6 wq6Var, byte[] bArr, int i, int i2) {
        Companion.getClass();
        bArr.getClass();
        return a.a(wq6Var, bArr, i, i2);
    }
}
