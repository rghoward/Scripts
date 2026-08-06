package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zs7 implements pt8<ParcelFileDescriptor, Bitmap> {
    public final w43 a;

    public zs7(w43 w43Var) {
        this.a = w43Var;
    }

    @Override // defpackage.pt8
    public final kt8<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, xk7 xk7Var) {
        w43 w43Var = this.a;
        return w43Var.a(new i85.c(parcelFileDescriptor, w43Var.d, w43Var.c), i, i2, xk7Var, w43.k);
    }

    @Override // defpackage.pt8
    public final boolean b(ParcelFileDescriptor parcelFileDescriptor, xk7 xk7Var) {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
    }
}
