package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class te4 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        wl8 d();
    }

    public static boolean a(Context context) {
        context.getClass();
        wl8 wl8VarD = ((a) kl3.b(a.class, o9a.a(context.getApplicationContext()))).d();
        dx0.b(wl8VarD.A <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (wl8VarD.isEmpty()) {
            return true;
        }
        return ((Boolean) ((h1) wl8VarD.iterator()).next()).booleanValue();
    }
}
