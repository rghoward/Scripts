package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class su8 implements Closeable {
    public static final tu8 u;
    public a t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends Reader {
        public final hy0 t;
        public final Charset u;
        public boolean v;
        public InputStreamReader w;

        public a(hy0 hy0Var, Charset charset) {
            hy0Var.getClass();
            charset.getClass();
            this.t = hy0Var;
            this.u = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.v = true;
            InputStreamReader inputStreamReader = this.w;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.t.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            cArr.getClass();
            if (this.v) {
                o03.a("Stream closed");
                return 0;
            }
            InputStreamReader inputStreamReader = this.w;
            if (inputStreamReader == null) {
                hy0 hy0Var = this.t;
                inputStreamReader = new InputStreamReader(hy0Var.r0(), ytb.f(hy0Var, this.u));
                this.w = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static tu8 a(String str, wq6 wq6Var) {
            js7<Charset, wq6> js7VarA = aj5.a(wq6Var);
            Charset charset = js7VarA.t;
            wq6 wq6Var2 = js7VarA.u;
            tx0 tx0Var = new tx0();
            charset.getClass();
            int length = str.length();
            str.getClass();
            charset.getClass();
            if (length < 0) {
                ca0.a(u.a(length, 0, "endIndex < beginIndex: ", " < "));
            } else if (length > str.length()) {
                rx0.a(str.length(), t43.b(length, "endIndex > string.length: ", " > "));
            } else if (charset.equals(ua1.b)) {
                tx0Var.f0(0, length, str);
            } else {
                byte[] bytes = str.substring(0, length).getBytes(charset);
                bytes.getClass();
                tx0Var.m884write(bytes, 0, bytes.length);
            }
            return new tu8(wq6Var2, tx0Var.u, tx0Var);
        }
    }

    static {
        g01 g01Var = g01.w;
        g01Var.getClass();
        tx0 tx0Var = new tx0();
        tx0Var.Y(g01Var);
        u = new tu8(null, g01Var.t.length, tx0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        vtb.b(p());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] h() throws IOException {
        long jK = k();
        byte[] th = null;
        if (jK > 2147483647L) {
            o03.a(d43.b(jK, "Cannot buffer entire body for content length: "));
            return null;
        }
        hy0 hy0VarP = p();
        try {
            byte[] bArrX = hy0VarP.x();
            try {
                hy0VarP.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = bArrX;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (hy0VarP != null) {
                try {
                    hy0VarP.close();
                } catch (Throwable th4) {
                    fn3.b(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jK == -1 || jK == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jK + ") and stream length (" + length + ") disagree");
    }

    public abstract long k();

    public abstract wq6 m();

    public abstract hy0 p();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final String t() {
        Charset charsetA;
        hy0 hy0VarP = p();
        String th = null;
        try {
            wq6 wq6VarM = m();
            if (wq6VarM == null || (charsetA = wq6.a(wq6VarM)) == null) {
                charsetA = ua1.b;
            }
            String strS = hy0VarP.S(ytb.f(hy0VarP, charsetA));
            try {
                hy0VarP.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strS;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (hy0VarP != null) {
                try {
                    hy0VarP.close();
                } catch (Throwable th4) {
                    fn3.b(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
