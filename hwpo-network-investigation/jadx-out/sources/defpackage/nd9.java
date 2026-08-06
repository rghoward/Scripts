package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class nd9 implements Iterable<String>, zn5 {
    public final /* synthetic */ ml3 t;

    public nd9(ml3 ml3Var) {
        this.t = ml3Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new md9(this.t);
    }
}
