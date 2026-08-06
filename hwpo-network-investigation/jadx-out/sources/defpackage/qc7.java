package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qc7 {
    public final Bundle a;
    public IconCompat b;
    public final wm8[] c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    @Deprecated
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    public qc7(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, wm8[] wm8VarArr, boolean z, boolean z2, boolean z3) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.e() == 2) {
            this.g = iconCompat.d();
        }
        this.h = uc7.b(charSequence);
        this.i = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = wm8VarArr;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }
}
