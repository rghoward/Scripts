package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hk {
    public final String a;
    public final String b;
    public final String c;
    public final ca8 d;
    public final ArrayList e;

    public hk(String str, String str2, String str3, ca8 ca8Var, ArrayList arrayList) {
        fk.b(str2, str3, Build.MANUFACTURER);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ca8Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk)) {
            return false;
        }
        hk hkVar = (hk) obj;
        if (!this.a.equals(hkVar.a) || !xj5.a(this.b, hkVar.b) || !xj5.a(this.c, hkVar.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return xj5.a(str, str) && this.d.equals(hkVar.d) && this.e.equals(hkVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ru3.c(ru3.c(ru3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
