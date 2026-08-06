package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nu9 {
    public final m27 a;

    public nu9(long[] jArr) {
        m27 m27Var;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            m27Var = new m27(jArrCopyOf.length);
            int i = m27Var.b;
            if (i < 0) {
                r.b(BuildConfig.FLAVOR);
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i;
                long[] jArr2 = m27Var.a;
                if (jArr2.length < length) {
                    m27Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                }
                long[] jArr3 = m27Var.a;
                int i2 = m27Var.b;
                if (i != i2) {
                    gz3.g(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                }
                gz3.g(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                m27Var.b += jArrCopyOf.length;
            }
        } else {
            m27Var = new m27();
        }
        this.a = m27Var;
    }
}
