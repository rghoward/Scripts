package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nv6 extends v65 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public nv6(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nv6.class != obj.getClass()) {
            return false;
        }
        nv6 nv6Var = (nv6) obj;
        return this.b == nv6Var.b && this.c == nv6Var.c && this.d == nv6Var.d && Arrays.equals(this.e, nv6Var.e) && Arrays.equals(this.f, nv6Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
