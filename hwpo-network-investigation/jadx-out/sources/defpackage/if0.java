package defpackage;

import android.content.pm.PackageInfo;
import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class if0 {
    public static long a(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static void b(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }
}
