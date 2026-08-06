package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import rx2.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class j52 implements Iterable, zn5 {
    public final /* synthetic */ int t;
    public final Object u;

    public j52() {
        this.t = 0;
        this.u = new CopyOnWriteArrayList();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) obj).iterator();
                it.getClass();
                return it;
            default:
                return ((rx2) obj).new a();
        }
    }

    public j52(rx2 rx2Var) {
        this.t = 1;
        this.u = rx2Var;
    }
}
