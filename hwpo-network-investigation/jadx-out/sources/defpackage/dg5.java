package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class dg5 implements Iterable<Integer>, zn5 {
    public final int t;
    public final int u;
    public final int v;

    public dg5(int i, int i2, int i3) {
        if (i3 == 0) {
            z90.a("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            z90.a("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.t = i;
        this.u = ie3.a(i, i2, i3);
        this.v = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dg5)) {
            return false;
        }
        if (isEmpty() && ((dg5) obj).isEmpty()) {
            return true;
        }
        dg5 dg5Var = (dg5) obj;
        return this.t == dg5Var.t && this.u == dg5Var.u && this.v == dg5Var.v;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.t * 31) + this.u) * 31) + this.v;
    }

    public boolean isEmpty() {
        int i = this.u;
        int i2 = this.v;
        int i3 = this.t;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new eg5(this.t, this.u, this.v);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.u;
        int i2 = this.v;
        int i3 = this.t;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
