package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a9 {
    public final ExecutorService a;
    public final HashMap b;
    public final ReferenceQueue<tg3<?>> c;
    public hg3 d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends WeakReference<tg3<?>> {
        public final ko5 a;
        public final boolean b;
        public kt8<?> c;

        public a(ko5 ko5Var, tg3 tg3Var, ReferenceQueue referenceQueue) {
            super(tg3Var, referenceQueue);
            ov9.d(ko5Var, "Argument must not be null");
            this.a = ko5Var;
            boolean z = tg3Var.t;
            this.c = null;
            this.b = z;
        }
    }

    public a9() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new y8());
        this.b = new HashMap();
        this.c = new ReferenceQueue<>();
        this.a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new z8(this));
    }

    public final synchronized void a(ko5 ko5Var, tg3<?> tg3Var) {
        a aVar = (a) this.b.put(ko5Var, new a(ko5Var, tg3Var, this.c));
        if (aVar != null) {
            aVar.c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        kt8<?> kt8Var;
        synchronized (this) {
            this.b.remove(aVar.a);
            if (aVar.b && (kt8Var = aVar.c) != null) {
                this.d.a(aVar.a, new tg3<>(kt8Var, true, false, aVar.a, this.d));
            }
        }
    }
}
