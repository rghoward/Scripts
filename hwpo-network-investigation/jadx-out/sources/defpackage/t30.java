package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t30 implements Iterable<Object>, zn5 {
    public final /* synthetic */ Object[] t;

    public t30(Object[] objArr) {
        this.t = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new i30(this.t);
    }
}
