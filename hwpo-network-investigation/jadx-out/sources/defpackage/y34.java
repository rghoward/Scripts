package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y34 {
    public final SparseBooleanArray a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final SparseBooleanArray a = new SparseBooleanArray();
        public boolean b;

        public final void a(int i) {
            xl7.r(!this.b);
            this.a.append(i, true);
        }

        public final y34 b() {
            xl7.r(!this.b);
            this.b = true;
            return new y34(this.a);
        }
    }

    public y34(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y34) {
            return this.a.equals(((y34) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
