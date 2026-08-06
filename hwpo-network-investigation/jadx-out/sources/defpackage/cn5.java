package defpackage;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cn5 {
    public final xl5 a;
    public Object[] b = new Object[8];
    public int[] c;
    public int d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a a = new a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final b a = new b();
    }

    public cn5(xl5 xl5Var) {
        this.a = xl5Var;
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.c = iArr;
        this.d = -1;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.d + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.b[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean zA = xj5.a(serialDescriptor.e(), g3a.b.a);
                int[] iArr = this.c;
                if (!zA) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.g(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(this.c[i2]);
                    sb.append("]");
                }
            } else if (obj == a.a) {
                sb.append("[<debug info disabled>]");
            } else if (obj != b.a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final void b() {
        int i = this.d * 2;
        this.b = Arrays.copyOf(this.b, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        gz3.h(0, 0, 14, this.c, iArr);
        this.c = iArr;
    }

    public final String toString() {
        return a();
    }
}
