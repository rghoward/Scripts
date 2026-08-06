package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nn4 {
    public final e04 a;
    public final tu6 b;
    public final qy8 c;
    public final of8<k5b> d;
    public final of8<uu4> e;
    public final t04 f;

    public nn4(e04 e04Var, tu6 tu6Var, of8<k5b> of8Var, of8<uu4> of8Var2, t04 t04Var) {
        e04Var.a();
        qy8 qy8Var = new qy8(e04Var.a);
        this.a = e04Var;
        this.b = tu6Var;
        this.c = qy8Var;
        this.d = of8Var;
        this.e = of8Var2;
        this.f = t04Var;
    }

    public final r9a<String> a(r9a<Bundle> r9aVar) {
        return r9aVar.g(new ql6(), new mn4());
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        int iB;
        PackageInfo packageInfoC;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        e04 e04Var = this.a;
        e04Var.a();
        bundle.putString("gmp_app_id", e04Var.c.b);
        tu6 tu6Var = this.b;
        synchronized (tu6Var) {
            try {
                if (tu6Var.d == 0 && (packageInfoC = tu6Var.c("com.google.android.gms")) != null) {
                    tu6Var.d = packageInfoC.versionCode;
                }
                i = tu6Var.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        tu6 tu6Var2 = this.b;
        synchronized (tu6Var2) {
            try {
                if (tu6Var2.c == null) {
                    tu6Var2.e();
                }
                str3 = tu6Var2.c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        e04 e04Var2 = this.a;
        e04Var2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(e04Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strA = ((te5) caa.a(this.f.a())).a();
            if (TextUtils.isEmpty(strA)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strA);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) caa.a(this.f.getId()));
        bundle.putString("cliv", "fcm-25.0.2");
        uu4 uu4Var = this.e.get();
        k5b k5bVar = this.d.get();
        if (uu4Var == null || k5bVar == null || (iB = uu4Var.b()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(uu3.a(iB)));
        bundle.putString("Firebase-Client", k5bVar.a());
    }

    public final r9a<Bundle> c(String str, String str2, final Bundle bundle) {
        int i;
        try {
            b(str, str2, bundle);
            final qy8 qy8Var = this.c;
            u8d u8dVar = u8d.t;
            s6d s6dVar = qy8Var.c;
            if (s6dVar.a() < 12000000) {
                return s6dVar.b() != 0 ? qy8Var.a(bundle).h(u8dVar, new s02() { // from class: w9d
                    @Override // defpackage.s02
                    public final Object a(r9a r9aVar) {
                        Bundle bundle2;
                        qy8 qy8Var2 = qy8Var;
                        qy8Var2.getClass();
                        return (r9aVar.n() && (bundle2 = (Bundle) r9aVar.j()) != null && bundle2.containsKey("google.messenger")) ? qy8Var2.a(bundle).o(u8d.t, u7d.t) : r9aVar;
                    }
                }) : caa.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            q5d q5dVarA = q5d.a(qy8Var.b);
            synchronized (q5dVarA) {
                i = q5dVarA.d;
                q5dVarA.d = i + 1;
            }
            return q5dVarA.b(new r4d(i, 1, bundle)).g(u8dVar, ds6.u);
        } catch (InterruptedException | ExecutionException e) {
            return caa.d(e);
        }
    }
}
