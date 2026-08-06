package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dzb extends AbstractSet {
    public final int t;
    public final /* synthetic */ ezb u;

    public dzb(ezb ezbVar, int i) {
        this.u = ezbVar;
        this.t = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.u.t, d(), e(), obj, this.t == -1 ? ezb.y : gzb.b) >= 0;
    }

    public final int d() {
        int i = this.t;
        if (i == -1) {
            return 0;
        }
        return this.u.u[i];
    }

    public final int e() {
        return this.u.u[this.t + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new czb(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return e() - d();
    }
}
