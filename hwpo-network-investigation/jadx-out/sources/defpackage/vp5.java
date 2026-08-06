package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vp5 {
    public final String a;
    public final String b;

    static {
        n6b.H(0);
        n6b.H(1);
    }

    public vp5(String str, String str2) {
        this.a = n6b.O(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vp5.class == obj.getClass()) {
            vp5 vp5Var = (vp5) obj;
            if (Objects.equals(this.a, vp5Var.a) && Objects.equals(this.b, vp5Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
