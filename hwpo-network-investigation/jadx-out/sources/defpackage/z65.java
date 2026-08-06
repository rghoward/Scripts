package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.intercom.twig.BuildConfig;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z65 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote(AgentHeaderCreator.AGENT_DIVIDER);
    public final ue5 a;
    public final Context b;
    public final String c;
    public final t04 d;
    public final se2 e;
    public he0 f;

    public z65(Context context, String str, t04 t04Var, se2 se2Var) {
        if (context == null) {
            z90.a("appContext must not be null");
            throw null;
        }
        if (str == null) {
            z90.a("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = t04Var;
        this.e = se2Var;
        this.a = new ue5();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll(BuildConfig.FLAVOR).toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final m04 b(boolean z) {
        String strA;
        sa2.a aVar = sa2.d;
        aVar.getClass();
        String str = null;
        if (!((Boolean) new ra2(0, aVar, sa2.a.class, "isNotMainThread", "isNotMainThread()Z", 0).invoke()).booleanValue()) {
            String str2 = "Must not be called on a main thread, was called on " + sa2.a.a() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        t04 t04Var = this.d;
        if (z) {
            try {
                strA = ((te5) caa.b(t04Var.a(), 10000L, timeUnit)).a();
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
                strA = null;
            }
        } else {
            strA = null;
        }
        try {
            str = (String) caa.b(t04Var.getId(), 10000L, timeUnit);
        } catch (Exception e2) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new m04(str, strA);
    }

    public final synchronized he0 c() {
        String str;
        he0 he0Var = this.f;
        if (he0Var != null && (he0Var.b != null || !this.e.a())) {
            return this.f;
        }
        zd6 zd6Var = zd6.t;
        zd6Var.e("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        zd6Var.e("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            m04 m04VarB = b(false);
            zd6Var.e("Fetched Firebase Installation ID: " + m04VarB.a);
            if (m04VarB.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                m04VarB = new m04(str, null);
            }
            if (Objects.equals(m04VarB.a, string)) {
                this.f = new he0(sharedPreferences.getString("crashlytics.installation.id", null), m04VarB.a, m04VarB.b);
            } else {
                this.f = new he0(a(sharedPreferences, m04VarB.a), m04VarB.a, m04VarB.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new he0(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new he0(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        zd6Var.e("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        ue5 ue5Var = this.a;
        Context context = this.b;
        synchronized (ue5Var) {
            try {
                if (ue5Var.a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = BuildConfig.FLAVOR;
                    }
                    ue5Var.a = installerPackageName;
                }
                str = BuildConfig.FLAVOR.equals(ue5Var.a) ? null : ue5Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
