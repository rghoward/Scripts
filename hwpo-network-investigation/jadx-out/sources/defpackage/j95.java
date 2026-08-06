package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface j95<E> extends List<E>, Collection, zn5 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<E> extends m1<E> implements j95<E> {
        public final j95<E> t;
        public final int u;
        public final int v;

        /* JADX WARN: Multi-variable type inference failed */
        public a(j95<? extends E> j95Var, int i, int i2) {
            this.t = j95Var;
            this.u = i;
            l96.c(i, i2, j95Var.size());
            this.v = i2 - i;
        }

        @Override // defpackage.s0
        public final int d() {
            return this.v;
        }

        @Override // java.util.List
        public final E get(int i) {
            l96.a(i, this.v);
            return this.t.get(this.u + i);
        }

        @Override // defpackage.m1, java.util.List
        public final List subList(int i, int i2) {
            l96.c(i, i2, this.v);
            int i3 = this.u;
            return new a(this.t, i + i3, i3 + i2);
        }
    }
}
