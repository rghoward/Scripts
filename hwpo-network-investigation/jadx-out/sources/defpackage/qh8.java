package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qh8 extends cl9 {
    public final List<uh1> c;
    public final long d;
    public final float e;

    public qh8(List list, long j, float f) {
        this.c = list;
        this.d = j;
        this.e = f;
    }

    @Override // defpackage.cl9
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.d;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jC = p50.c(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fC = this.e;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = cr9.c(j) / 2.0f;
        }
        List<uh1> list = this.c;
        nr.d(list, null);
        int iA = nr.a(list);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), fC, nr.b(iA, list), nr.c(iA, null, list), ps.a(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh8)) {
            return false;
        }
        qh8 qh8Var = (qh8) obj;
        return xj5.a(this.c, qh8Var.c) && vf7.b(this.d, qh8Var.d) && this.e == qh8Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + h44.a(al.c(this.d, this.c.hashCode() * 961, 31), this.e, 31);
    }

    public final String toString() {
        String str;
        long j = this.d;
        long j2 = 9223372034707292159L & j;
        String str2 = BuildConfig.FLAVOR;
        if (j2 != 9205357640488583168L) {
            str = "center=" + ((Object) vf7.g(j)) + ", ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        float f = this.e;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.c + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
