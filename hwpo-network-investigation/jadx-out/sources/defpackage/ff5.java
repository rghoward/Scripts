package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ff5 extends InputStream implements InputStreamRetargetInterface {
    public final InputStream t;
    public final ba7 u;
    public final zoa v;
    public long x;
    public long w = -1;
    public long y = -1;

    public ff5(InputStream inputStream, ba7 ba7Var, zoa zoaVar) {
        this.v = zoaVar;
        this.t = inputStream;
        this.u = ba7Var;
        this.x = ((z97) ba7Var.w.u).U();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.t.available();
        } catch (IOException e) {
            zoa zoaVar = this.v;
            ba7 ba7Var = this.u;
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ba7 ba7Var = this.u;
        zoa zoaVar = this.v;
        long jA = zoaVar.a();
        if (this.y == -1) {
            this.y = jA;
        }
        try {
            this.t.close();
            long j = this.w;
            if (j != -1) {
                ba7Var.j(j);
            }
            long j2 = this.x;
            if (j2 != -1) {
                z97.a aVar = ba7Var.w;
                aVar.n();
                z97.F((z97) aVar.u, j2);
            }
            ba7Var.k(this.y);
            ba7Var.b();
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    public final void h(long j) {
        long j2 = this.w;
        if (j2 == -1) {
            this.w = j;
        } else {
            this.w = j2 + j;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.t.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.t.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        zoa zoaVar = this.v;
        ba7 ba7Var = this.u;
        try {
            int i = this.t.read();
            long jA = zoaVar.a();
            if (this.x == -1) {
                this.x = jA;
            }
            if (i != -1 || this.y != -1) {
                h(1L);
                ba7Var.j(this.w);
                return i;
            }
            this.y = jA;
            ba7Var.k(jA);
            ba7Var.b();
            return i;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.t.reset();
        } catch (IOException e) {
            zoa zoaVar = this.v;
            ba7 ba7Var = this.u;
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        zoa zoaVar = this.v;
        ba7 ba7Var = this.u;
        try {
            long jSkip = this.t.skip(j);
            long jA = zoaVar.a();
            if (this.x == -1) {
                this.x = jA;
            }
            if (jSkip == 0 && j != 0 && this.y == -1) {
                this.y = jA;
                ba7Var.k(jA);
                return jSkip;
            }
            h(jSkip);
            ba7Var.j(this.w);
            return jSkip;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        zoa zoaVar = this.v;
        ba7 ba7Var = this.u;
        try {
            int i3 = this.t.read(bArr, i, i2);
            long jA = zoaVar.a();
            if (this.x == -1) {
                this.x = jA;
            }
            if (i3 == -1 && this.y == -1) {
                this.y = jA;
                ba7Var.k(jA);
                ba7Var.b();
                return i3;
            }
            h(i3);
            ba7Var.j(this.w);
            return i3;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        zoa zoaVar = this.v;
        ba7 ba7Var = this.u;
        try {
            int i = this.t.read(bArr);
            long jA = zoaVar.a();
            if (this.x == -1) {
                this.x = jA;
            }
            if (i == -1 && this.y == -1) {
                this.y = jA;
                ba7Var.k(jA);
                ba7Var.b();
                return i;
            }
            h(i);
            ba7Var.j(this.w);
            return i;
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }
}
