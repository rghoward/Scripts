package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zd6 implements jac {
    public static Boolean A;
    public static Boolean x;
    public static Boolean y;
    public static Boolean z;
    public static final zd6 t = new zd6();
    public static final pl9 u = pl9.x;
    public static final float v = 8.0f;
    public static final float w = 24.0f;
    public static final /* synthetic */ zd6 B = new zd6();

    public static boolean d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (x == null) {
            x = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        x.booleanValue();
        if (y == null) {
            y = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (y.booleanValue()) {
            return !f28.a() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().b0());
    }

    public boolean b(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public void c(String str) {
        if (b(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void e(String str) {
        if (b(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void f(String str, Exception exc) {
        if (b(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
