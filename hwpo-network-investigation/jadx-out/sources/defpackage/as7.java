package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class as7<Key, Value> {
    public final List<zr7.b.C0297b<Key, Value>> a;
    public final Integer b;
    public final qr7 c;
    public final int d;

    public as7(List<zr7.b.C0297b<Key, Value>> list, Integer num, qr7 qr7Var, int i) {
        this.a = list;
        this.b = num;
        this.c = qr7Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof as7)) {
            return false;
        }
        as7 as7Var = (as7) obj;
        return this.a.equals(as7Var.a) && xj5.a(this.b, as7Var.b) && this.c == as7Var.c && this.d == as7Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Integer num = this.b;
        return Integer.hashCode(this.d) + this.c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.a);
        sb.append(", anchorPosition=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", leadingPlaceholderCount=");
        return e44.a(sb, this.d, ')');
    }
}
