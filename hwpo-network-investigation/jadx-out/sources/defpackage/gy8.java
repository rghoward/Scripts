package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gy8 {
    public final wd a;
    public final ey8 b;
    public final oi8 c;
    public final boolean d;
    public final List<? extends Proxy> e;
    public int f;
    public List<? extends InetSocketAddress> g;
    public final ArrayList h;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ArrayList a;
        public int b;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }
    }

    public gy8(wd wdVar, ey8 ey8Var, oi8 oi8Var, boolean z) {
        List<? extends Proxy> listL;
        ey8Var.getClass();
        this.a = wdVar;
        this.b = ey8Var;
        this.c = oi8Var;
        this.d = z;
        hf3 hf3Var = hf3.t;
        this.e = hf3Var;
        this.g = hf3Var;
        this.h = new ArrayList();
        f55 f55Var = wdVar.i;
        Proxy proxy = wdVar.g;
        oi8Var.x.getClass();
        f55Var.getClass();
        if (proxy != null) {
            listL = ws0.h(proxy);
        } else {
            URI uriI = f55Var.i();
            if (uriI.getHost() == null) {
                listL = ytb.l(new Proxy[]{Proxy.NO_PROXY});
            } else {
                List<Proxy> listSelect = wdVar.h.select(uriI);
                listL = (listSelect == null || listSelect.isEmpty()) ? ytb.l(new Proxy[]{Proxy.NO_PROXY}) : ytb.k(listSelect);
            }
        }
        this.e = listL;
        this.f = 0;
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
