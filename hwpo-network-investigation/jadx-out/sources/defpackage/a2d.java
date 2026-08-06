package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a2d implements c2d {
    @Override // defpackage.c2d
    public final boolean a(ta1 ta1Var) {
        ta1Var.getClass();
        String str = "false";
        try {
            str = (String) d2d.a.invoke(null, "tiktok_systrace", "false");
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
        }
        return str.equals("true");
    }
}
