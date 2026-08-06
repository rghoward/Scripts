package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h77 implements b33 {
    public final /* synthetic */ yz9 a;
    public final /* synthetic */ js1 b;

    public h77(yz9 yz9Var, js1 js1Var) {
        this.a = yz9Var;
        this.b = js1Var;
    }

    @Override // defpackage.b33
    public final void dispose() {
        Iterator it = ((List) this.a.getValue()).iterator();
        while (it.hasNext()) {
            this.b.b().b((r47) it.next());
        }
    }
}
