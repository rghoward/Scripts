package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ab1 {
    public final ArrayList a;
    public final boolean b;
    public final boolean c;

    public ab1(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab1)) {
            return false;
        }
        ab1 ab1Var = (ab1) obj;
        return this.a.equals(ab1Var.a) && this.b == ab1Var.b && this.c == ab1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + uo2.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChartPaginatedData(items=");
        sb.append(this.a);
        sb.append(", hasLess=");
        sb.append(this.b);
        sb.append(", hasMore=");
        return fz.c(sb, this.c, ")");
    }
}
