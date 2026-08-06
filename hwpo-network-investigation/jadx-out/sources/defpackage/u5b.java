package defpackage;

import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u5b {
    public final ru6 a;
    public final sa2 b;
    public String c;
    public final a d = new a(false);
    public final a e = new a(true);
    public final hx8 f = new hx8();
    public final AtomicMarkableReference<String> g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a {
        public final AtomicMarkableReference<kp5> a;
        public final AtomicReference<Runnable> b = new AtomicReference<>(null);
        public final boolean c;

        public a(boolean z) {
            this.c = z;
            this.a = new AtomicMarkableReference<>(new kp5(z ? 8192 : 1024), false);
        }
    }

    public u5b(String str, ey3 ey3Var, sa2 sa2Var) {
        this.c = str;
        this.a = new ru6(ey3Var);
        this.b = sa2Var;
    }

    public final void a(String str) {
        a aVar = this.e;
        synchronized (aVar) {
            try {
                if (aVar.a.getReference().b(str)) {
                    AtomicMarkableReference<kp5> atomicMarkableReference = aVar.a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    q28 q28Var = new q28(1, aVar);
                    AtomicReference<Runnable> atomicReference = aVar.b;
                    while (!atomicReference.compareAndSet(null, q28Var)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    u5b.this.b.b.a(q28Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
