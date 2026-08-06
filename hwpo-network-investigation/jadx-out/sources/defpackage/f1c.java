package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f1c {
    public static volatile f1c b;
    public static final f1c c = new f1c(0);
    public final Map a;

    public f1c() {
        this.a = new HashMap();
    }

    public static f1c a() {
        f1c f1cVar = b;
        if (f1cVar != null) {
            return f1cVar;
        }
        synchronized (f1c.class) {
            try {
                f1c f1cVar2 = b;
                if (f1cVar2 != null) {
                    return f1cVar2;
                }
                int i = h0c.a;
                f1c f1cVarB = n1c.b();
                b = f1cVarB;
                return f1cVarB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public f1c(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
