package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q28 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ q28(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ((sfb.a) obj).e();
                return;
            default:
                u5b.a aVar = (u5b.a) obj;
                Map<String, String> mapUnmodifiableMap = null;
                aVar.b.set(null);
                synchronized (aVar) {
                    if (aVar.a.isMarked()) {
                        kp5 reference = aVar.a.getReference();
                        synchronized (reference) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
                        }
                        AtomicMarkableReference<kp5> atomicMarkableReference = aVar.a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    u5b u5bVar = aVar.d;
                    u5bVar.a.h(u5bVar.c, mapUnmodifiableMap, aVar.c);
                    return;
                }
                return;
        }
    }
}
