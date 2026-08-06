package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pu7 {
    public final gu1 a;
    public final yt1 b;
    public final dj5 c;
    public final ci4<jt1, Integer, g2b> d;
    public final boolean e;
    public final j1b f;
    public final Object g;
    public final AtomicReference<ru7> h = new AtomicReference<>(ru7.v);
    public long i = e00.a();
    public d37 j;
    public final hm8 k;
    public final mk8<Object> l;

    public pu7(gu1 gu1Var, yt1 yt1Var, bj4 bj4Var, e37 e37Var, ci4 ci4Var, boolean z, j1b j1bVar, Object obj) {
        this.a = gu1Var;
        this.b = yt1Var;
        this.c = bj4Var;
        this.d = ci4Var;
        this.e = z;
        this.f = j1bVar;
        this.g = obj;
        d37<Object> d37Var = a49.a;
        d37Var.getClass();
        this.j = d37Var;
        hm8 hm8Var = new hm8();
        hm8Var.g(e37Var, bj4Var.d0());
        this.k = hm8Var;
        this.l = new mk8<>(j1bVar.c);
    }

    public final void a() throws Exception {
        AtomicReference<ru7> atomicReference = this.h;
        try {
            switch (atomicReference.get().ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    ru7 ru7Var = ru7.y;
                    ru7 ru7Var2 = ru7.z;
                    while (!atomicReference.compareAndSet(ru7Var, ru7Var2)) {
                        if (atomicReference.get() != ru7Var) {
                            c78.b("Unexpected state change from: " + ru7Var + " to: " + ru7Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new ib7();
            }
        } catch (Exception e) {
            atomicReference.set(ru7.t);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.k(this.f, this.k);
                    this.k.c();
                    this.k.d();
                    this.k.b();
                    this.a.J = null;
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    this.k.b();
                    this.a.J = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return this.h.get().compareTo(ru7.y) >= 0;
    }

    public final void d() {
        ru7 ru7Var;
        ru7 ru7Var2;
        boolean z;
        while (true) {
            AtomicReference<ru7> atomicReference = this.h;
            ru7Var = ru7.w;
            ru7Var2 = ru7.y;
            if (atomicReference.compareAndSet(ru7Var, ru7Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != ru7Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        c78.b("Unexpected state change from: " + ru7Var + " to: " + ru7Var2 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[Catch: Exception -> 0x0023, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e2, B:48:0x00ef, B:49:0x00f2, B:50:0x00f4, B:56:0x011c, B:58:0x0124, B:53:0x00fb, B:55:0x0101, B:63:0x012f, B:64:0x0132, B:65:0x0133, B:66:0x013a, B:67:0x013b, B:68:0x0142, B:23:0x006b, B:46:0x00e5), top: B:75:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[Catch: Exception -> 0x0023, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e2, B:48:0x00ef, B:49:0x00f2, B:50:0x00f4, B:56:0x011c, B:58:0x0124, B:53:0x00fb, B:55:0x0101, B:63:0x012f, B:64:0x0132, B:65:0x0133, B:66:0x013a, B:67:0x013b, B:68:0x0142, B:23:0x006b, B:46:0x00e5), top: B:75:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0124 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e2, B:48:0x00ef, B:49:0x00f2, B:50:0x00f4, B:56:0x011c, B:58:0x0124, B:53:0x00fb, B:55:0x0101, B:63:0x012f, B:64:0x0132, B:65:0x0133, B:66:0x013a, B:67:0x013b, B:68:0x0142, B:23:0x006b, B:46:0x00e5), top: B:75:0x0004, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[LOOP:1: B:25:0x007b->B:81:?, LOOP_END, SYNTHETIC] */
    public final boolean e(yn9 yn9Var) throws Exception {
        long j;
        ru7 ru7Var = ru7.x;
        AtomicReference<ru7> atomicReference = this.h;
        try {
            int iOrdinal = atomicReference.get().ordinal();
            ru7 ru7Var2 = ru7.w;
            gu1 gu1Var = this.a;
            yt1 yt1Var = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    dj5 dj5Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        dj5Var.M();
                    }
                    try {
                        this.j = yt1Var.b(gu1Var, yn9Var, this.d);
                        if (z) {
                            dj5Var.L();
                        }
                        ru7 ru7Var3 = ru7.v;
                        while (!atomicReference.compareAndSet(ru7Var3, ru7Var2)) {
                            if (atomicReference.get() != ru7Var3) {
                                c78.b("Unexpected state change from: " + ru7Var3 + " to: " + ru7Var2 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        if (z) {
                            dj5Var.L();
                        }
                        throw th;
                    }
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(ru7Var2, ru7Var)) {
                            if (atomicReference.get() != ru7Var2) {
                                c78.b("Unexpected state change from: " + ru7Var2 + " to: " + ru7Var + '.');
                                j = this.i;
                                this.i = e00.a();
                                this.j = yt1Var.p(gu1Var, yn9Var, this.j);
                                this.i = j;
                                while (!atomicReference.compareAndSet(ru7Var, ru7Var2)) {
                                    if (atomicReference.get() != ru7Var) {
                                        c78.b("Unexpected state change from: " + ru7Var + " to: " + ru7Var2 + '.');
                                        if (this.j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = e00.a();
                        this.j = yt1Var.p(gu1Var, yn9Var, this.j);
                        this.i = j;
                        while (!atomicReference.compareAndSet(ru7Var, ru7Var2)) {
                            if (atomicReference.get() != ru7Var) {
                                c78.b("Unexpected state change from: " + ru7Var + " to: " + ru7Var2 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        this.i = j;
                        while (!atomicReference.compareAndSet(ru7Var, ru7Var2)) {
                            if (atomicReference.get() != ru7Var) {
                                c78.b("Unexpected state change from: " + ru7Var + " to: " + ru7Var2 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                    j = this.i;
                case 4:
                    pt1.b("Recursive call to resume()");
                    throw new qp5();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new ib7();
            }
        } catch (Exception e) {
            atomicReference.set(ru7.t);
            throw e;
        }
    }
}
