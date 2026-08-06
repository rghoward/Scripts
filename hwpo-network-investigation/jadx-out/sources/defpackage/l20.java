package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l20 {
    public final String a;
    public final hk b;

    public l20(String str, hk hkVar) {
        fk.b(str, Build.MODEL, Build.VERSION.RELEASE);
        this.a = str;
        this.b = hkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l20)) {
            return false;
        }
        l20 l20Var = (l20) obj;
        if (!xj5.a(this.a, l20Var.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!xj5.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return xj5.a(str2, str2) && this.b.equals(l20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((nd6.LOG_ENVIRONMENT_PROD.hashCode() + ru3.c((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517565) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.6, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + nd6.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
