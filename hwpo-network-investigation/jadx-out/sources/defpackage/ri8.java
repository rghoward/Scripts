package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.platform.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ri8 {
    public final yw1 a;
    public final long b;
    public final y9a c;
    public final qi8 d;
    public final ConcurrentLinkedQueue<pi8> e;

    public ri8(z9a z9aVar, yw1 yw1Var) {
        z9aVar.getClass();
        TimeUnit.MINUTES.getClass();
        yw1Var.getClass();
        this.a = yw1Var;
        this.b = 300000000000L;
        this.c = z9aVar.d();
        this.d = new qi8(this, av.a(new StringBuilder(), ytb.b, " ConnectionPool connection closer"));
        this.e = new ConcurrentLinkedQueue<>();
    }

    public final int a(pi8 pi8Var, long j) {
        TimeZone timeZone = ytb.a;
        ArrayList arrayList = pi8Var.q;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + pi8Var.c.a.i + " was leaked. Did you forget to close a response body?";
                c cVar = c.a;
                c.a.k(((oi8.b) reference).a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    pi8Var.r = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
