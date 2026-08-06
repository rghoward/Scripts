package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fja {
    public final ww9 a;
    public final ww9 b;
    public final ww9 c;
    public final ww9 d;

    public fja(ww9 ww9Var, ww9 ww9Var2, ww9 ww9Var3, ww9 ww9Var4) {
        this.a = ww9Var;
        this.b = ww9Var2;
        this.c = ww9Var3;
        this.d = ww9Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fja)) {
            return false;
        }
        fja fjaVar = (fja) obj;
        return xj5.a(this.a, fjaVar.a) && xj5.a(this.b, fjaVar.b) && xj5.a(this.c, fjaVar.c) && xj5.a(this.d, fjaVar.d);
    }

    public final int hashCode() {
        ww9 ww9Var = this.a;
        int iHashCode = (ww9Var != null ? ww9Var.hashCode() : 0) * 31;
        ww9 ww9Var2 = this.b;
        int iHashCode2 = (iHashCode + (ww9Var2 != null ? ww9Var2.hashCode() : 0)) * 31;
        ww9 ww9Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (ww9Var3 != null ? ww9Var3.hashCode() : 0)) * 31;
        ww9 ww9Var4 = this.d;
        return iHashCode3 + (ww9Var4 != null ? ww9Var4.hashCode() : 0);
    }

    public fja() {
        this(null, 15);
    }

    public /* synthetic */ fja(ww9 ww9Var, int i) {
        this((i & 1) != 0 ? null : ww9Var, null, null, null);
    }
}
