package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y0c implements Iterator {
    public int t = 0;
    public final /* synthetic */ a2c u;

    public y0c(a2c a2cVar) {
        this.u = a2cVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t < this.u.r();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.t;
        a2c a2cVar = this.u;
        int iR = a2cVar.r();
        int i2 = this.t;
        if (i < iR) {
            this.t = i2 + 1;
            return a2cVar.t(i2);
        }
        px1.b(d43.a(i2, "Out of bounds index: ", new StringBuilder(String.valueOf(i2).length() + 21)));
        return null;
    }
}
