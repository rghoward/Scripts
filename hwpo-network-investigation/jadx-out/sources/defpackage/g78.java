package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g78<T> implements f78<T>, Serializable {
    public final List<? extends f78<? super T>> t;

    public g78(List list) {
        this.t = list;
    }

    @Override // defpackage.f78
    public final boolean apply(T t) {
        int i = 0;
        while (true) {
            List<? extends f78<? super T>> list = this.t;
            if (i >= list.size()) {
                return true;
            }
            if (!list.get(i).apply(t)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g78) {
            return this.t.equals(((g78) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (T t : this.t) {
            if (!z) {
                sb.append(',');
            }
            sb.append(t);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
