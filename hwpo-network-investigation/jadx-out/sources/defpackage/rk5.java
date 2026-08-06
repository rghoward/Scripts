package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rk5 extends j1<Object> {
    public final /* synthetic */ Iterator w;
    public final /* synthetic */ f78 x;

    public rk5(Iterator it, f78 f78Var) {
        this.w = it;
        this.x = f78Var;
    }

    @Override // defpackage.j1
    public final Object a() {
        Object next;
        do {
            Iterator it = this.w;
            if (!it.hasNext()) {
                this.u = j1.a.v;
                return null;
            }
            next = it.next();
        } while (!this.x.apply(next));
        return next;
    }
}
