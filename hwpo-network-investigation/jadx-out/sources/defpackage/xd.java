package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xd implements d72 {
    public final d72 a;
    public final float b;

    public xd(float f, d72 d72Var) {
        while (d72Var instanceof xd) {
            d72Var = ((xd) d72Var).a;
            f += ((xd) d72Var).b;
        }
        this.a = d72Var;
        this.b = f;
    }

    @Override // defpackage.d72
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        return this.a.equals(xdVar.a) && this.b == xdVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
