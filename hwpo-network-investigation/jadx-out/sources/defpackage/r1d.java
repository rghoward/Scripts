package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r1d {
    public final Object a = new Object();
    public ArrayDeque b;
    public boolean c;

    public final void a(n0d n0dVar) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(n0dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(r9a r9aVar) {
        n0d n0dVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        try {
                            n0dVar = (n0d) this.b.poll();
                            if (n0dVar == null) {
                                this.c = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    n0dVar.a(r9aVar);
                }
            }
        }
    }
}
