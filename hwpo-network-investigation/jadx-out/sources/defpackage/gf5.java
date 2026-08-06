package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gf5 extends OutputStream {
    public final OutputStream t;
    public final zoa u;
    public final ba7 v;
    public long w = -1;

    public gf5(OutputStream outputStream, ba7 ba7Var, zoa zoaVar) {
        this.t = outputStream;
        this.v = ba7Var;
        this.u = zoaVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.w;
        ba7 ba7Var = this.v;
        if (j != -1) {
            ba7Var.f(j);
        }
        zoa zoaVar = this.u;
        long jA = zoaVar.a();
        z97.a aVar = ba7Var.w;
        aVar.n();
        z97.E((z97) aVar.u, jA);
        try {
            this.t.close();
        } catch (IOException e) {
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.t.flush();
        } catch (IOException e) {
            zoa zoaVar = this.u;
            ba7 ba7Var = this.v;
            b4.a(zoaVar, ba7Var, ba7Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        ba7 ba7Var = this.v;
        try {
            this.t.write(i);
            long j = this.w + 1;
            this.w = j;
            ba7Var.f(j);
        } catch (IOException e) {
            b4.a(this.u, ba7Var, ba7Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ba7 ba7Var = this.v;
        try {
            this.t.write(bArr);
            long length = this.w + ((long) bArr.length);
            this.w = length;
            ba7Var.f(length);
        } catch (IOException e) {
            b4.a(this.u, ba7Var, ba7Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ba7 ba7Var = this.v;
        try {
            this.t.write(bArr, i, i2);
            long j = this.w + ((long) i2);
            this.w = j;
            ba7Var.f(j);
        } catch (IOException e) {
            b4.a(this.u, ba7Var, ba7Var);
            throw e;
        }
    }
}
