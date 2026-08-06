package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lz0<F, T> extends el7<F> implements Serializable {
    public final yh4<F, ? extends T> t;
    public final el7<T> u;

    public lz0(yh4<F, ? extends T> yh4Var, el7<T> el7Var) {
        this.t = yh4Var;
        el7Var.getClass();
        this.u = el7Var;
    }

    @Override // java.util.Comparator
    public final int compare(F f, F f2) {
        yh4<F, ? extends T> yh4Var = this.t;
        return this.u.compare(yh4Var.apply(f), yh4Var.apply(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lz0) {
            lz0 lz0Var = (lz0) obj;
            if (this.t.equals(lz0Var.t) && this.u.equals(lz0Var.u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.t, this.u});
    }

    public final String toString() {
        return this.u + ".onResultOf(" + this.t + ")";
    }
}
