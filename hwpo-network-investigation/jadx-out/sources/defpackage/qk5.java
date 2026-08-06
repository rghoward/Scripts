package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qk5<T> extends m1<T> {
    public final int t;
    public final int u;
    public final ArrayList v;

    public qk5(ArrayList arrayList, int i, int i2) {
        this.t = i;
        this.u = i2;
        this.v = arrayList;
    }

    @Override // defpackage.s0
    public final int d() {
        return this.v.size() + this.t + this.u;
    }

    @Override // java.util.List
    public final T get(int i) {
        int i2 = this.t;
        if (i < 0 || i >= i2) {
            ArrayList arrayList = this.v;
            if (i < arrayList.size() + i2 && i2 <= i) {
                return (T) arrayList.get(i - i2);
            }
            int size = arrayList.size() + i2;
            if (i >= d() || size > i) {
                cp2.a(d(), t43.b(i, "Illegal attempt to access index ", " in ItemSnapshotList of size "));
                return null;
            }
        }
        return null;
    }
}
