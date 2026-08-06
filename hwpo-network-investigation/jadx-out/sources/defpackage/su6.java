package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class su6 {
    public final a[] a;
    public final long b;

    public su6() {
        throw null;
    }

    public su6(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    public final su6 a(a... aVarArr) {
        if (aVarArr.length == 0) {
            return this;
        }
        String str = n6b.a;
        a[] aVarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(aVarArr2, aVarArr2.length + aVarArr.length);
        System.arraycopy(aVarArr, 0, objArrCopyOf, aVarArr2.length, aVarArr.length);
        return new su6(this.b, (a[]) objArrCopyOf);
    }

    public final su6 b(su6 su6Var) {
        return su6Var == null ? this : a(su6Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && su6.class == obj.getClass()) {
            su6 su6Var = (su6) obj;
            if (Arrays.equals(this.a, su6Var.a) && this.b == su6Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return bf6.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public su6(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public su6(long j, a... aVarArr) {
        this.b = j;
        this.a = aVarArr;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        default id4 a() {
            return null;
        }

        default byte[] c() {
            return null;
        }

        default void b(np6.a aVar) {
        }
    }
}
