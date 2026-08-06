package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ds6 implements s02 {
    public static final float t = 3.0f;
    public static final /* synthetic */ ds6 u = new ds6();

    public static final long b(int i) {
        long j = ((long) i) << 32;
        int i2 = lo5.O;
        return j;
    }

    public static final String c(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    @Override // defpackage.s02
    public Object a(r9a r9aVar) throws IOException {
        if (r9aVar.n()) {
            return (Bundle) r9aVar.j();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(r9aVar.i())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", r9aVar.i());
    }
}
