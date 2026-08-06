package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wsc {
    public static final n30 a = new n30();

    public static synchronized void a() {
        n30 n30Var = a;
        Iterator it = ((n30.e) n30Var.values()).iterator();
        if (it.hasNext()) {
            ((wsc) it.next()).getClass();
            throw null;
        }
        n30Var.clear();
    }
}
