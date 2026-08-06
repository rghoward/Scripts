package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jk9 extends j1<Object> {
    public final Iterator<Object> w;
    public final /* synthetic */ kk9 x;

    public jk9(kk9 kk9Var) {
        this.x = kk9Var;
        this.w = kk9Var.t.iterator();
    }

    @Override // defpackage.j1
    public final Object a() {
        Object next;
        do {
            Iterator<Object> it = this.w;
            if (!it.hasNext()) {
                this.u = j1.a.v;
                return null;
            }
            next = it.next();
        } while (!this.x.u.contains(next));
        return next;
    }
}
