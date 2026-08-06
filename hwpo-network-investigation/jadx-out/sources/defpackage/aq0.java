package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aq0 extends v65 {
    public final byte[] b;

    public aq0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aq0.class != obj.getClass()) {
            return false;
        }
        aq0 aq0Var = (aq0) obj;
        return this.a.equals(aq0Var.a) && Arrays.equals(this.b, aq0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + ru3.c(527, 31, this.a);
    }
}
