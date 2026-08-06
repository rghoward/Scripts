package defpackage;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class p4a implements ILoggerFactory {
    public boolean t = false;
    public final HashMap u = new HashMap();
    public final LinkedBlockingQueue<q4a> v = new LinkedBlockingQueue<>();

    @Override // org.slf4j.ILoggerFactory
    public final synchronized yd6 b(String str) {
        o4a o4aVar;
        o4aVar = (o4a) this.u.get(str);
        if (o4aVar == null) {
            o4aVar = new o4a(str, this.v, this.t);
            this.u.put(str, o4aVar);
        }
        return o4aVar;
    }
}
