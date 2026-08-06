package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sh1 implements yc9<Object> {
    public final /* synthetic */ Iterable a;

    public sh1(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.yc9
    public final Iterator<Object> iterator() {
        return this.a.iterator();
    }
}
