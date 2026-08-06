package j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Iterator {
    public int a = 0;
    public final /* synthetic */ Path b;

    public o(Path path) {
        this.b = path;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.getNameCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a >= this.b.getNameCount()) {
            throw new NoSuchElementException();
        }
        Path name = this.b.getName(this.a);
        this.a++;
        return name;
    }
}
