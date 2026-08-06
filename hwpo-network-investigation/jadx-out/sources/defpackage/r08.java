package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r08 {
    public final d28 a;

    public r08() {
        this.a = Build.VERSION.SDK_INT >= 28 ? new e28() : new ue2();
    }
}
