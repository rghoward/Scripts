package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h95 implements Serializable {
    public static final h95 v = new h95(new int[0]);
    public final int[] t;
    public final int u;

    public h95(int[] iArr) {
        int length = iArr.length;
        this.t = iArr;
        this.u = length;
    }

    public final boolean equals(Object obj) {
        h95 h95Var;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h95) && (i2 = this.u) == (i = (h95Var = (h95) obj).u)) {
            for (int i3 = 0; i3 < i2; i3++) {
                xl7.k(i3, i2);
                int i4 = this.t[i3];
                xl7.k(i3, i);
                if (i4 == h95Var.t[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.u; i2++) {
            i = (i * 31) + this.t[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.u;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.t;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
