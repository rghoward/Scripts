package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.ably.lib.util.AgentHeaderCreator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j5b implements vg5 {
    public final o7a a;

    public j5b(final Context context) {
        this.a = new o7a(new mh4() { // from class: i5b
            @Override // defpackage.mh4
            public final Object invoke() {
                return j5b.a(this.t, context);
            }
        });
    }

    public static String a(j5b j5bVar, Context context) {
        String strSubstring;
        String strValueOf;
        String string;
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(context.getPackageName(), 0);
        try {
            strSubstring = packageInfo.versionName;
            if (strSubstring != null) {
                int iX = z2a.x(6, strSubstring, "_");
                if (iX != -1) {
                    strSubstring = strSubstring.substring(0, iX);
                }
            } else {
                strSubstring = null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            strSubstring = "nameNotFound";
        }
        try {
            strValueOf = String.valueOf(Build.VERSION.SDK_INT >= 28 ? if0.a(packageInfo) : packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException unused2) {
            strValueOf = "versionCodeNotFound";
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            string = applicationInfo.nonLocalizedLabel.toString();
        } else {
            string = context.getString(i);
            string.getClass();
        }
        int i2 = Build.VERSION.SDK_INT;
        String str = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder();
        sb.append(string + AgentHeaderCreator.AGENT_DIVIDER + strSubstring + " ");
        sb.append("(");
        sb.append(context.getPackageName() + ";");
        sb.append("build:" + strValueOf + ";");
        sb.append("SDK:" + i2 + ";");
        StringBuilder sb2 = new StringBuilder("Android:");
        sb2.append(str);
        sb.append(sb2.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.vg5
    public final qu8 intercept(vg5.a aVar) {
        aj8 aj8Var = (aj8) aVar;
        jp8.a aVarB = aj8Var.e.b();
        aVarB.b("User-Agent", (String) this.a.getValue());
        return aj8Var.a(new jp8(aVarB));
    }
}
