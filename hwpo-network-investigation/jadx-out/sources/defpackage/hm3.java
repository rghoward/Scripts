package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hm3 implements m4a, wf8 {
    public final HashMap a;
    public ArrayDeque b;
    public final m1b c;

    public hm3() {
        m1b m1bVar = m1b.t;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = m1bVar;
    }

    @Override // defpackage.m4a
    public final void a(d14 d14Var) {
        b(this.c, d14Var);
    }

    @Override // defpackage.m4a
    public final synchronized void b(Executor executor, lm3 lm3Var) {
        try {
            executor.getClass();
            if (!this.a.containsKey(ue2.class)) {
                this.a.put(ue2.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(ue2.class)).put(lm3Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
