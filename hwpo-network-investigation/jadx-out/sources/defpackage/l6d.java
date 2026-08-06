package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l6d extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        kr5.b(Thread.currentThread());
        h7d h7dVar = new h7d();
        h7dVar.a = false;
        h7dVar.b = null;
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = m6d.c;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, h7dVar);
        }
        return h7dVar;
    }
}
