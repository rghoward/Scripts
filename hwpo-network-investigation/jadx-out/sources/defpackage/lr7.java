package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lr7<T> {
    public final ArrayList a;
    public final boolean b;

    public lr7(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr7)) {
            return false;
        }
        lr7 lr7Var = (lr7) obj;
        return this.a.equals(lr7Var.a) && this.b == lr7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaginatedData(items=" + this.a + ", hasNextPage=" + this.b + ")";
    }
}
