package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class kv8 implements na {
    public final HashSet a = new HashSet();

    public final void a() {
        if (mx1.a == null) {
            mx1.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != mx1.a) {
            aa0.c("Must be called on the Main thread.");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jv8) it.next()).a();
        }
    }
}
