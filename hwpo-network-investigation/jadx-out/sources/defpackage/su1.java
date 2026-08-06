package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class su1<T> extends el7<T> implements Serializable {
    public final Comparator<? super T>[] t;

    public su1(lz0 lz0Var, lz0 lz0Var2) {
        this.t = new Comparator[]{lz0Var, lz0Var2};
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.t;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof su1) {
            return Arrays.equals(this.t, ((su1) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.t);
    }

    public final String toString() {
        return av.a(new StringBuilder("Ordering.compound("), Arrays.toString(this.t), ")");
    }
}
