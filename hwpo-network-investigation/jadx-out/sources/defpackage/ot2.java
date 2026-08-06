package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ot2 implements qv9 {
    public final Socket a;
    public final AtomicInteger b = new AtomicInteger();
    public final b c = new b();
    public final a d = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements yq9 {
        public final OutputStream t;
        public final sv9 u;

        public a() {
            Socket socket = ot2.this.a;
            this.t = socket.getOutputStream();
            this.u = new sv9(socket);
        }

        @Override // defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            int i;
            OutputStream outputStream = this.t;
            ot2 ot2Var = ot2.this;
            sv9 sv9Var = this.u;
            sv9Var.i();
            try {
                try {
                    AtomicInteger atomicInteger = ot2Var.b;
                    Socket socket = ot2Var.a;
                    atomicInteger.getClass();
                    while (true) {
                        int i2 = atomicInteger.get();
                        if ((i2 & 1) != 0) {
                            i = 0;
                            break;
                        }
                        int i3 = i2 | 1;
                        if (atomicInteger.compareAndSet(i2, i3)) {
                            i = i3;
                            break;
                        }
                    }
                    if (i == 0) {
                        sv9Var.j();
                        return;
                    }
                    if (i != 3) {
                        if (!socket.isClosed() && !socket.isOutputShutdown()) {
                            outputStream.flush();
                            try {
                                socket.shutdownOutput();
                            } catch (UnsupportedOperationException unused) {
                                outputStream.close();
                            }
                        }
                        sv9Var.j();
                        return;
                    }
                    socket.close();
                    g2b g2bVar = g2b.a;
                    if (sv9Var.j()) {
                        throw sv9Var.k(null);
                    }
                } catch (IOException e) {
                    if (!sv9Var.j()) {
                        throw e;
                    }
                    throw sv9Var.k(e);
                }
            } catch (Throwable th) {
                sv9Var.j();
                throw th;
            }
        }

        @Override // defpackage.yq9, java.io.Flushable
        public final void flush() throws IOException {
            sv9 sv9Var = this.u;
            sv9Var.i();
            try {
                try {
                    this.t.flush();
                    g2b g2bVar = g2b.a;
                    if (sv9Var.j()) {
                        throw sv9Var.k(null);
                    }
                } catch (IOException e) {
                    if (!sv9Var.j()) {
                        throw e;
                    }
                    throw sv9Var.k(e);
                }
            } catch (Throwable th) {
                sv9Var.j();
                throw th;
            }
        }

        @Override // defpackage.yq9
        public final void i0(tx0 tx0Var, long j) throws IOException {
            tx0Var.getClass();
            t.b(tx0Var.u, 0L, j);
            while (j > 0) {
                sv9 sv9Var = this.u;
                sv9Var.f();
                f99 f99Var = tx0Var.t;
                f99Var.getClass();
                int iMin = (int) Math.min(j, f99Var.c - f99Var.b);
                sv9Var.i();
                try {
                    try {
                        this.t.write(f99Var.a, f99Var.b, iMin);
                        g2b g2bVar = g2b.a;
                        if (sv9Var.j()) {
                            throw sv9Var.k(null);
                        }
                        int i = f99Var.b + iMin;
                        f99Var.b = i;
                        long j2 = iMin;
                        j -= j2;
                        tx0Var.u -= j2;
                        if (i == f99Var.c) {
                            tx0Var.t = f99Var.a();
                            i99.a(f99Var);
                        }
                    } catch (IOException e) {
                        if (!sv9Var.j()) {
                            throw e;
                        }
                        throw sv9Var.k(e);
                    }
                } catch (Throwable th) {
                    sv9Var.j();
                    throw th;
                }
            }
        }

        @Override // defpackage.yq9
        public final voa timeout() {
            return this.u;
        }

        public final String toString() {
            return "sink(" + ot2.this.a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements kw9 {
        public final InputStream t;
        public final sv9 u;

        public b() {
            Socket socket = ot2.this.a;
            this.t = socket.getInputStream();
            this.u = new sv9(socket);
        }

        @Override // defpackage.kw9
        public final long O(tx0 tx0Var, long j) throws IOException {
            tx0Var.getClass();
            if (j == 0) {
                return 0L;
            }
            if (j < 0) {
                ca0.a(d43.b(j, "byteCount < 0: "));
                return 0L;
            }
            sv9 sv9Var = this.u;
            sv9Var.f();
            f99 f99VarW = tx0Var.W(1);
            int iMin = (int) Math.min(j, 8192 - f99VarW.c);
            try {
                sv9Var.i();
                try {
                    try {
                        int i = this.t.read(f99VarW.a, f99VarW.c, iMin);
                        if (sv9Var.j()) {
                            throw sv9Var.k(null);
                        }
                        if (i != -1) {
                            f99VarW.c += i;
                            long j2 = i;
                            tx0Var.u += j2;
                            return j2;
                        }
                        if (f99VarW.b != f99VarW.c) {
                            return -1L;
                        }
                        tx0Var.t = f99VarW.a();
                        i99.a(f99VarW);
                        return -1L;
                    } catch (IOException e) {
                        if (sv9Var.j()) {
                            throw sv9Var.k(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    sv9Var.j();
                    throw th;
                }
            } catch (AssertionError e2) {
                if (ttb.a(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            int i;
            ot2 ot2Var = ot2.this;
            sv9 sv9Var = this.u;
            sv9Var.i();
            try {
                try {
                    AtomicInteger atomicInteger = ot2Var.b;
                    Socket socket = ot2Var.a;
                    atomicInteger.getClass();
                    while (true) {
                        int i2 = atomicInteger.get();
                        if ((i2 & 2) != 0) {
                            i = 0;
                            break;
                        }
                        int i3 = i2 | 2;
                        if (atomicInteger.compareAndSet(i2, i3)) {
                            i = i3;
                            break;
                        }
                    }
                    if (i == 0) {
                        sv9Var.j();
                        return;
                    }
                    if (i == 3) {
                        socket.close();
                    } else if (socket.isClosed() || socket.isInputShutdown()) {
                        sv9Var.j();
                        return;
                    } else {
                        try {
                            socket.shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.t.close();
                        }
                    }
                    g2b g2bVar = g2b.a;
                    if (sv9Var.j()) {
                        throw sv9Var.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!sv9Var.j()) {
                        throw e;
                    }
                    throw sv9Var.k(e);
                }
            } catch (Throwable th) {
                sv9Var.j();
                throw th;
            }
            sv9Var.j();
            throw th;
        }

        @Override // defpackage.kw9
        public final voa timeout() {
            return this.u;
        }

        public final String toString() {
            return "source(" + ot2.this.a + ')';
        }
    }

    public ot2(Socket socket) {
        this.a = socket;
    }

    @Override // defpackage.qv9
    public final kw9 a() {
        return this.c;
    }

    @Override // defpackage.qv9
    public final yq9 b() {
        return this.d;
    }

    @Override // defpackage.qv9
    public final void cancel() throws IOException {
        this.a.close();
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }
}
