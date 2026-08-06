package j$.nio.file;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements Iterable {
    public final Iterable a;

    public t(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.a.forEach(new r(consumer, 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u(this.a.iterator());
    }
}
