package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import io.ably.lib.http.HttpConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s04 implements t04 {
    public static final Object m = new Object();
    public final e04 a;
    public final n04 b;
    public final hw7 c;
    public final q6b d;
    public final ts5<c75> e;
    public final sh8 f;
    public final Object g;
    public final ExecutorService h;
    public final hd9 i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public s04() {
        throw null;
    }

    public s04(final e04 e04Var, of8 of8Var, ExecutorService executorService, hd9 hd9Var) {
        e04Var.a();
        n04 n04Var = new n04(e04Var.a, of8Var);
        hw7 hw7Var = new hw7(e04Var);
        if (y7a.a == null) {
            y7a.a = new y7a();
        }
        y7a y7aVar = y7a.a;
        if (q6b.c == null) {
            q6b.c = new q6b(y7aVar);
        }
        q6b q6bVar = q6b.c;
        ts5<c75> ts5Var = new ts5<>(new of8() { // from class: o04
            @Override // defpackage.of8
            public final Object get() {
                return new c75(e04Var);
            }
        });
        sh8 sh8Var = new sh8();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = e04Var;
        this.b = n04Var;
        this.c = hw7Var;
        this.d = q6bVar;
        this.e = ts5Var;
        this.f = sh8Var;
        this.h = executorService;
        this.i = hd9Var;
    }

    @Override // defpackage.t04
    public final q6d a() {
        d();
        t9a t9aVar = new t9a();
        pk4 pk4Var = new pk4(this.d, t9aVar);
        synchronized (this.g) {
            this.l.add(pk4Var);
        }
        q6d q6dVar = t9aVar.a;
        this.h.execute(new q04(0, this));
        return q6dVar;
    }

    public final void b() {
        qe0 qe0VarC;
        int i;
        synchronized (m) {
            try {
                e04 e04Var = this.a;
                e04Var.a();
                ob2 ob2VarA = ob2.a(e04Var.a);
                try {
                    qe0VarC = this.c.c();
                    hw7.a aVar = qe0VarC.c;
                    i = 0;
                    if (aVar == hw7.a.u || aVar == hw7.a.t) {
                        String strE = e(qe0VarC);
                        hw7 hw7Var = this.c;
                        qe0.a aVarH = qe0VarC.h();
                        aVarH.a = strE;
                        aVarH.b = hw7.a.v;
                        qe0VarC = aVarH.a();
                        hw7Var.b(qe0VarC);
                    }
                    if (ob2VarA != null) {
                        ob2VarA.b();
                    }
                } catch (Throwable th) {
                    if (ob2VarA != null) {
                        ob2VarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h(qe0VarC);
        this.i.execute(new r04(i, this));
    }

    public final qe0 c(qe0 qe0Var) throws u04 {
        int i;
        df0 df0Var;
        df0 df0VarF;
        n04 n04Var = this.b;
        e04 e04Var = this.a;
        e04Var.a();
        String str = e04Var.c.a;
        String str2 = qe0Var.b;
        e04 e04Var2 = this.a;
        e04Var2.a();
        String str3 = e04Var2.c.g;
        String str4 = qe0Var.e;
        hq8 hq8Var = n04Var.c;
        if (!hq8Var.a()) {
            throw new u04("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = n04.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new u04("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = n04Var.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(HttpConstants.Methods.POST);
                    httpURLConnectionC.addRequestProperty(HttpConstants.Headers.AUTHORIZATION, "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    n04.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    hq8Var.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        df0VarF = n04.f(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    n04.b(httpURLConnectionC, null, str, str3);
                    i = i2;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            byte b = (byte) (0 | 1);
                            gqa.a aVar = gqa.a.v;
                            if (b != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            df0Var = new df0(null, 0L, aVar);
                        } else {
                            if (responseCode == 429) {
                                throw new u04("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                byte b2 = (byte) (0 | 1);
                                gqa.a aVar2 = gqa.a.u;
                                if (b2 != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                df0Var = new df0(null, 0L, aVar2);
                            }
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2 = i + 1;
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        df0VarF = df0Var;
                        break;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
                i = i2;
            }
        }
        int iOrdinal = df0VarF.c.ordinal();
        if (iOrdinal == 0) {
            String str5 = df0VarF.a;
            long j = df0VarF.b;
            this.d.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            qe0.a aVarH = qe0Var.h();
            aVarH.c = str5;
            aVarH.e = j;
            byte b3 = (byte) (aVarH.h | 1);
            aVarH.f = jCurrentTimeMillis;
            aVarH.h = (byte) (b3 | 2);
            return aVarH.a();
        }
        if (iOrdinal == 1) {
            qe0.a aVarH2 = qe0Var.h();
            aVarH2.g = "BAD CONFIG";
            aVarH2.b = hw7.a.x;
            return aVarH2.a();
        }
        if (iOrdinal != 2) {
            throw new u04("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.j = null;
        }
        qe0.a aVarH3 = qe0Var.h();
        aVarH3.b = hw7.a.u;
        return aVarH3.a();
    }

    public final void d() {
        e04 e04Var = this.a;
        e04Var.a();
        a78.e(e04Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        e04Var.a();
        a78.e(e04Var.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        e04Var.a();
        a78.e(e04Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        e04Var.a();
        String str = e04Var.c.b;
        Pattern pattern = q6b.b;
        a78.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        e04Var.a();
        a78.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", q6b.b.matcher(e04Var.c.a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e A[Catch: all -> 0x0040, DONT_GENERATE, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:10:0x002f, B:11:0x0031, B:15:0x003e, B:19:0x0042, B:20:0x0046, B:28:0x005a, B:12:0x0032, B:13:0x003b), top: B:33:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:10:0x002f, B:11:0x0031, B:15:0x003e, B:19:0x0042, B:20:0x0046, B:28:0x005a, B:12:0x0032, B:13:0x003b), top: B:33:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public final String e(qe0 qe0Var) {
        c75 c75Var;
        String string;
        e04 e04Var = this.a;
        e04Var.a();
        if (!e04Var.b.equals("CHIME_ANDROID_SDK")) {
            e04 e04Var2 = this.a;
            e04Var2.a();
            if ("[DEFAULT]".equals(e04Var2.b)) {
                if (qe0Var.c == hw7.a.t) {
                    c75Var = this.e.get();
                    synchronized (c75Var.a) {
                        try {
                            synchronized (c75Var.a) {
                                string = c75Var.a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = c75Var.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return sh8.a();
                }
            }
        } else if (qe0Var.c == hw7.a.t) {
            c75Var = this.e.get();
            synchronized (c75Var.a) {
                synchronized (c75Var.a) {
                    string = c75Var.a.getString("|S|id", null);
                    if (string != null) {
                        string = c75Var.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return sh8.a();
                }
            }
        }
        this.f.getClass();
        return sh8.a();
    }

    public final qe0 f(qe0 qe0Var) throws u04 {
        ie0 ie0VarE;
        String str = qe0Var.b;
        String string = null;
        if (str != null && str.length() == 11) {
            c75 c75Var = this.e.get();
            synchronized (c75Var.a) {
                try {
                    String[] strArr = c75.c;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = c75Var.a.getString("|T|" + c75Var.b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        n04 n04Var = this.b;
        e04 e04Var = this.a;
        e04Var.a();
        String str3 = e04Var.c.a;
        String str4 = qe0Var.b;
        e04 e04Var2 = this.a;
        e04Var2.a();
        String str5 = e04Var2.c.g;
        e04 e04Var3 = this.a;
        e04Var3.a();
        String str6 = e04Var3.c.b;
        hq8 hq8Var = n04Var.c;
        if (!hq8Var.a()) {
            throw new u04("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = n04.a("projects/" + str5 + "/installations");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new u04("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = n04Var.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(HttpConstants.Methods.POST);
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    n04.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    hq8Var.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        ie0VarE = n04.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    n04.b(httpURLConnectionC, str6, str3, str5);
                    if (responseCode == 429) {
                        throw new u04("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        ie0 ie0Var = new ie0(null, null, null, null, se5.a.u);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        ie0VarE = ie0Var;
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (Throwable th2) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused2) {
            }
        }
        int iOrdinal = ie0VarE.e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new u04("Firebase Installations Service is unavailable. Please try again later.");
            }
            qe0.a aVarH = qe0Var.h();
            aVarH.g = "BAD CONFIG";
            aVarH.b = hw7.a.x;
            return aVarH.a();
        }
        String str7 = ie0VarE.b;
        String str8 = ie0VarE.c;
        this.d.a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strB = ie0VarE.d.b();
        long jC = ie0VarE.d.c();
        qe0.a aVarH2 = qe0Var.h();
        aVarH2.a = str7;
        aVarH2.b = hw7.a.w;
        aVarH2.c = strB;
        aVarH2.d = str8;
        aVarH2.e = jC;
        byte b = (byte) (aVarH2.h | 1);
        aVarH2.f = jCurrentTimeMillis;
        aVarH2.h = (byte) (b | 2);
        return aVarH2.a();
    }

    public final void g(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((l0a) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.t04
    public final q6d getId() {
        String str;
        d();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return caa.e(str);
        }
        t9a t9aVar = new t9a();
        vk4 vk4Var = new vk4(t9aVar);
        synchronized (this.g) {
            this.l.add(vk4Var);
        }
        q6d q6dVar = t9aVar.a;
        this.h.execute(new p04(0, this));
        return q6dVar;
    }

    public final void h(qe0 qe0Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((l0a) it.next()).b(qe0Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
