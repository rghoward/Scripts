package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s83<T> implements yc9<T>, t83<T> {
    public final yc9<T> a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Iterator<T>, zn5 {
        public final Iterator<T> t;
        public int u;

        public a(s83<T> s83Var) {
            this.t = s83Var.a.iterator();
            this.u = s83Var.b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i = this.u;
                it = this.t;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.u--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i = this.u;
                it = this.t;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.u--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s83(yc9<? extends T> yc9Var, int i) {
        yc9Var.getClass();
        this.a = yc9Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.t83
    public final yc9<T> a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new s83(this, i) : new s83(this.a, i2);
    }

    @Override // defpackage.yc9
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
