package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ksa {
    public final esa a;
    public final k95<Integer> b;

    static {
        n6b.H(0);
        n6b.H(1);
    }

    public ksa(esa esaVar, ul8 ul8Var) {
        if (!ul8Var.isEmpty() && (((Integer) Collections.min(ul8Var)).intValue() < 0 || ((Integer) Collections.max(ul8Var)).intValue() >= esaVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = esaVar;
        this.b = k95.q(ul8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ksa.class == obj.getClass()) {
            ksa ksaVar = (ksa) obj;
            if (this.a.equals(ksaVar.a) && this.b.equals(ksaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
