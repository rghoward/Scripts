package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface aj {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;
        public final toa b;
        public final int c;
        public final bq6.b d;
        public final long e;
        public final toa f;
        public final int g;
        public final bq6.b h;
        public final long i;
        public final long j;

        public a(long j, toa toaVar, int i, bq6.b bVar, long j2, toa toaVar2, int i2, bq6.b bVar2, long j3, long j4) {
            this.a = j;
            this.b = toaVar;
            this.c = i;
            this.d = bVar;
            this.e = j2;
            this.f = toaVar2;
            this.g = i2;
            this.h = bVar2;
            this.i = j3;
            this.j = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && Objects.equals(this.b, aVar.b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f, aVar.f) && Objects.equals(this.h, aVar.h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final y34 a;
        public final SparseArray<a> b;

        public b(y34 y34Var, SparseArray<a> sparseArray) {
            this.a = y34Var;
            SparseBooleanArray sparseBooleanArray = y34Var.a;
            SparseArray<a> sparseArray2 = new SparseArray<>(sparseBooleanArray.size());
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                xl7.k(i, sparseBooleanArray.size());
                int iKeyAt = sparseBooleanArray.keyAt(i);
                a aVar = sparseArray.get(iKeyAt);
                aVar.getClass();
                sparseArray2.append(iKeyAt, aVar);
            }
            this.b = sparseArray2;
        }

        public final boolean a(int i) {
            return this.a.a.get(i);
        }
    }

    default void b(tfb tfbVar) {
    }

    default void c(ln2 ln2Var) {
    }

    default void g(h28 h28Var) {
    }

    default void h(int i) {
    }

    default void i(mp6 mp6Var) {
    }

    default void k(a aVar, mp6 mp6Var) {
    }

    default void l(s28 s28Var, b bVar) {
    }

    default void j(a aVar, int i, long j) {
    }
}
