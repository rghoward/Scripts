package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t7c extends anc {
    public Boolean b;
    public String c;
    public s7c d;
    public Boolean e;

    public final boolean h(String str) {
        tkc.k(this.a.i);
        if (yzc.J((String) wfc.g1.a(null), str) || yzc.J((String) wfc.h1.a(null), str) || yzc.J((String) wfc.i1.a(null), str)) {
            return true;
        }
        return "1".equals(this.d.d(str, "gaia_collection_enabled"));
    }

    public final boolean i(String str) {
        return "1".equals(this.d.d(str, "measurement.event_sampling_enabled"));
    }

    public final boolean j() {
        if (this.b == null) {
            Boolean boolT = t("app_measurement_lite");
            this.b = boolT;
            if (boolT == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.b;
    }

    public final String k(String str) {
        tkc tkcVar = this.a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.FLAVOR);
            a78.g(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.b(e, "Could not find SystemProperties class");
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e2) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.b(e2, "Could not access SystemProperties.get()");
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e3) {
            thc thcVar3 = tkcVar.f;
            tkc.m(thcVar3);
            thcVar3.f.b(e3, "Could not find SystemProperties.get() method");
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e4) {
            thc thcVar4 = tkcVar.f;
            tkc.m(thcVar4);
            thcVar4.f.b(e4, "SystemProperties.get() threw an exception");
            return BuildConfig.FLAVOR;
        }
    }

    public final int l(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(p(str, wfc.g0), 500), 100) : 500, 256);
    }

    public final void m() {
        this.a.getClass();
    }

    public final String n(String str, ufc ufcVar) {
        return TextUtils.isEmpty(str) ? (String) ufcVar.a(null) : (String) ufcVar.a(this.d.d(str, ufcVar.a));
    }

    public final long o(String str, ufc ufcVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) ufcVar.a(null)).longValue();
        }
        String strD = this.d.d(str, ufcVar.a);
        if (TextUtils.isEmpty(strD)) {
            return ((Long) ufcVar.a(null)).longValue();
        }
        try {
            return ((Long) ufcVar.a(Long.valueOf(Long.parseLong(strD)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) ufcVar.a(null)).longValue();
        }
    }

    public final int p(String str, ufc ufcVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) ufcVar.a(null)).intValue();
        }
        String strD = this.d.d(str, ufcVar.a);
        if (TextUtils.isEmpty(strD)) {
            return ((Integer) ufcVar.a(null)).intValue();
        }
        try {
            return ((Integer) ufcVar.a(Integer.valueOf(Integer.parseInt(strD)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) ufcVar.a(null)).intValue();
        }
    }

    public final double q(String str, ufc ufcVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) ufcVar.a(null)).doubleValue();
        }
        String strD = this.d.d(str, ufcVar.a);
        if (TextUtils.isEmpty(strD)) {
            return ((Double) ufcVar.a(null)).doubleValue();
        }
        try {
            return ((Double) ufcVar.a(Double.valueOf(Double.parseDouble(strD)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) ufcVar.a(null)).doubleValue();
        }
    }

    public final boolean r(String str, ufc ufcVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) ufcVar.a(null)).booleanValue();
        }
        String strD = this.d.d(str, ufcVar.a);
        return TextUtils.isEmpty(strD) ? ((Boolean) ufcVar.a(null)).booleanValue() : ((Boolean) ufcVar.a(Boolean.valueOf("1".equals(strD)))).booleanValue();
    }

    public final Bundle s() {
        tkc tkcVar = this.a;
        try {
            Context context = tkcVar.a;
            Context context2 = tkcVar.a;
            thc thcVar = tkcVar.f;
            if (context.getPackageManager() == null) {
                tkc.m(thcVar);
                thcVar.f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = wqb.a(context2).a(128, context2.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            tkc.m(thcVar);
            thcVar.f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            thc thcVar2 = tkcVar.f;
            tkc.m(thcVar2);
            thcVar2.f.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean t(String str) {
        a78.d(str);
        Bundle bundleS = s();
        if (bundleS != null) {
            if (bundleS.containsKey(str)) {
                return Boolean.valueOf(bundleS.getBoolean(str));
            }
            return null;
        }
        thc thcVar = this.a.f;
        tkc.m(thcVar);
        thcVar.f.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean u() {
        this.a.getClass();
        Boolean boolT = t("firebase_analytics_collection_deactivated");
        return boolT != null && boolT.booleanValue();
    }

    public final boolean v() {
        Boolean boolT = t("google_analytics_automatic_screen_reporting_enabled");
        return boolT == null || boolT.booleanValue();
    }

    public final hnc w(String str, boolean z) {
        Object obj;
        a78.d(str);
        Bundle bundleS = s();
        tkc tkcVar = this.a;
        if (bundleS == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleS.get(str);
        }
        hnc hncVar = hnc.UNINITIALIZED;
        if (obj == null) {
            return hncVar;
        }
        if (Boolean.TRUE.equals(obj)) {
            return hnc.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return hnc.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return hnc.POLICY;
        }
        thc thcVar2 = tkcVar.f;
        tkc.m(thcVar2);
        thcVar2.i.b(str, "Invalid manifest metadata for");
        return hncVar;
    }
}
