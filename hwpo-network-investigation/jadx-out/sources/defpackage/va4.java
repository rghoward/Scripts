package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class va4 {
    public static final ta4 a(Context context) {
        p48 p48Var = new p48();
        context.getApplicationContext();
        return new ta4(p48Var, new jo(Build.VERSION.SDK_INT >= 31 ? pb4.a.a(context) : 0));
    }
}
