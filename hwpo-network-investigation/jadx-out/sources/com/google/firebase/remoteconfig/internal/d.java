package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import defpackage.c24;
import defpackage.caa;
import defpackage.d24;
import defpackage.e04;
import defpackage.fw4;
import defpackage.g14;
import defpackage.gv1;
import defpackage.mq2;
import defpackage.op3;
import defpackage.q6d;
import defpackage.r9a;
import defpackage.s02;
import defpackage.t04;
import defpackage.tv1;
import defpackage.vs;
import io.ably.lib.http.HttpConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final int[] s = {2, 4, 8, 16, 32, 64, 128, 256};
    public static final Pattern t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final LinkedHashSet a;
    public int c;
    public HttpURLConnection f;
    public com.google.firebase.remoteconfig.internal.a g;
    public final ScheduledExecutorService h;
    public final c i;
    public final e04 j;
    public final t04 k;
    public final gv1 l;
    public final Context m;
    public final String n;
    public final e q;
    public boolean b = false;
    public final Random o = new Random();
    public final mq2 p = mq2.a;
    public boolean d = false;
    public boolean e = false;
    public final Object r = new Object();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zA;
            final d dVar = d.this;
            synchronized (dVar) {
                zA = dVar.a();
                if (zA) {
                    synchronized (dVar) {
                        dVar.b = true;
                    }
                }
            }
            if (zA) {
                e.b bVarC = dVar.q.c();
                dVar.p.getClass();
                if (new Date(System.currentTimeMillis()).before(bVarC.b)) {
                    dVar.h();
                    return;
                }
                t04 t04Var = dVar.k;
                final q6d q6dVarA = t04Var.a();
                final q6d id = t04Var.getId();
                final r9a<TContinuationResult> r9aVarH = caa.g(q6dVarA, id).h(dVar.h, new s02() { // from class: qv1
                    @Override // defpackage.s02
                    public final Object a(r9a r9aVar) {
                        URL url;
                        d dVar2 = dVar;
                        r9a r9aVar2 = q6dVarA;
                        if (!r9aVar2.n()) {
                            return caa.d(new c24("Firebase Installations failed to get installation auth token for config update listener connection.", r9aVar2.i()));
                        }
                        r9a r9aVar3 = id;
                        try {
                            if (!r9aVar3.n()) {
                                return caa.d(new c24("Firebase Installations failed to get installation ID for config update listener connection.", r9aVar3.i()));
                            }
                            try {
                                url = new URL(dVar2.c(dVar2.n));
                            } catch (MalformedURLException unused) {
                                Log.e("FirebaseRemoteConfig", "URL is malformed");
                                url = null;
                            }
                            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                            dVar2.i(httpURLConnection, (String) r9aVar3.j(), ((te5) r9aVar2.j()).a());
                            return caa.e(httpURLConnection);
                        } catch (IOException e) {
                            return caa.d(new c24("Failed to open HTTP stream connection", e));
                        }
                    }
                });
                caa.g(r9aVarH).g(dVar.h, new s02() { // from class: pv1
                    /* JADX WARN: Code duplicated, block: B:106:0x0153  */
                    /* JADX WARN: Code duplicated, block: B:108:0x0156  */
                    /* JADX WARN: Code duplicated, block: B:116:0x0192  */
                    /* JADX WARN: Code duplicated, block: B:125:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:129:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:131:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
                    /* JADX WARN: Code duplicated, block: B:62:0x00ca A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #6 {all -> 0x004c, blocks: (B:9:0x0035, B:11:0x0038, B:12:0x0039, B:20:0x0055, B:60:0x00c6, B:62:0x00ca, B:64:0x00cd, B:68:0x00d1, B:69:0x00d2, B:63:0x00cb), top: B:124:0x0011, inners: #7 }] */
                    /* JADX WARN: Code duplicated, block: B:69:0x00d2 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #6 {all -> 0x004c, blocks: (B:9:0x0035, B:11:0x0038, B:12:0x0039, B:20:0x0055, B:60:0x00c6, B:62:0x00ca, B:64:0x00cd, B:68:0x00d1, B:69:0x00d2, B:63:0x00cb), top: B:124:0x0011, inners: #7 }] */
                    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v0 */
                    /* JADX WARN: Type inference failed for: r10v10 */
                    /* JADX WARN: Type inference failed for: r10v2 */
                    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r10v4 */
                    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Integer, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r10v6 */
                    /* JADX WARN: Type inference failed for: r10v7 */
                    /* JADX WARN: Type inference failed for: r10v8 */
                    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Integer, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r13v1, types: [r9a] */
                    /* JADX WARN: Type inference failed for: r13v17 */
                    /* JADX WARN: Type inference failed for: r13v18, types: [java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r13v2 */
                    /* JADX WARN: Type inference failed for: r13v3 */
                    /* JADX WARN: Type inference failed for: r13v35, types: [java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r13v4 */
                    /* JADX WARN: Type inference failed for: r13v46 */
                    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.firebase.remoteconfig.internal.d] */
                    /* JADX WARN: Type inference failed for: r7v0 */
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r7v3 */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // defpackage.s02
                    public final Object a(r9a r9aVar) throws Throwable {
                        InputStream errorStream;
                        ?? r10;
                        ?? ValueOf;
                        h24 h24Var;
                        ?? r14 = dVar;
                        ?? inputStream = r9aVarH;
                        mq2 mq2Var = r14.p;
                        boolean z = true;
                        ?? r7 = 0;
                        try {
                            try {
                                if (!inputStream.n()) {
                                    throw new IOException(inputStream.i());
                                }
                                HttpURLConnection httpURLConnection = (HttpURLConnection) inputStream.j();
                                r14.f = httpURLConnection;
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    errorStream = r14.f.getErrorStream();
                                    try {
                                        int responseCode = r14.f.getResponseCode();
                                        ValueOf = Integer.valueOf(responseCode);
                                        if (responseCode == 200) {
                                            try {
                                                synchronized (r14) {
                                                    r14.c = 8;
                                                }
                                                r14.q.e(0, e.f);
                                                a aVarJ = r14.j(r14.f);
                                                r14.g = aVarJ;
                                                aVarJ.c();
                                            } catch (IOException e) {
                                                e = e;
                                                if (r14.e) {
                                                    synchronized (r14) {
                                                        r14.c = 8;
                                                    }
                                                } else {
                                                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                                }
                                                r14.b(inputStream, errorStream);
                                                synchronized (r14) {
                                                    r14.b = false;
                                                }
                                                if (r14.e || (ValueOf != 0 && !d.d(ValueOf.intValue()))) {
                                                    z = false;
                                                }
                                                if (z) {
                                                    mq2Var.getClass();
                                                    r14.k(new Date(System.currentTimeMillis()));
                                                }
                                                if (!z || ValueOf.intValue() == 200) {
                                                    r14.h();
                                                } else {
                                                    String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                                    if (ValueOf.intValue() == 403) {
                                                        strF = d.f(r14.f.getErrorStream());
                                                    }
                                                    h24Var = new h24(ValueOf.intValue(), 0, strF);
                                                }
                                                r14.f = null;
                                                r14.g = null;
                                                return caa.e(null);
                                            }
                                        }
                                        r14.b(inputStream, errorStream);
                                        synchronized (r14) {
                                            r14.b = false;
                                        }
                                        z = !r14.e && d.d(responseCode);
                                        if (z) {
                                            mq2Var.getClass();
                                            r14.k(new Date(System.currentTimeMillis()));
                                        }
                                        if (z || responseCode == 200) {
                                            r14.h();
                                        } else {
                                            String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                            if (responseCode == 403) {
                                                strF2 = d.f(r14.f.getErrorStream());
                                            }
                                            h24Var = new h24(responseCode, 0, strF2);
                                            r14.g(h24Var);
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        ValueOf = 0;
                                    } catch (Throwable th) {
                                        th = th;
                                        ValueOf = 0;
                                        r7 = inputStream;
                                        r10 = ValueOf;
                                        r14.b(r7, errorStream);
                                        synchronized (r14) {
                                            r14.b = false;
                                            if (r14.e) {
                                                z = false;
                                            } else {
                                                z = false;
                                            }
                                            if (z) {
                                                mq2Var.getClass();
                                                r14.k(new Date(System.currentTimeMillis()));
                                            }
                                            if (z) {
                                                r14.h();
                                            } else {
                                                r14.h();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    errorStream = null;
                                    inputStream = inputStream;
                                    ValueOf = errorStream;
                                    if (r14.e) {
                                        synchronized (r14) {
                                            r14.c = 8;
                                        }
                                    } else {
                                        Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                    }
                                    r14.b(inputStream, errorStream);
                                    synchronized (r14) {
                                        r14.b = false;
                                        if (r14.e) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            mq2Var.getClass();
                                            r14.k(new Date(System.currentTimeMillis()));
                                        }
                                        if (z) {
                                        }
                                        r14.h();
                                        r14.f = null;
                                        r14.g = null;
                                        return caa.e(null);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    errorStream = null;
                                    ValueOf = 0;
                                }
                                r14.f = null;
                                r14.g = null;
                                return caa.e(null);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            inputStream = 0;
                            errorStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            errorStream = null;
                            r10 = 0;
                            r14.b(r7, errorStream);
                            synchronized (r14) {
                                r14.b = false;
                                if (r14.e || (r10 != 0 && !d.d(r10.intValue()))) {
                                    z = false;
                                }
                                if (z) {
                                    mq2Var.getClass();
                                    r14.k(new Date(System.currentTimeMillis()));
                                }
                                if (z || r10.intValue() == 200) {
                                    r14.h();
                                } else {
                                    String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r10);
                                    if (r10.intValue() == 403) {
                                        strF3 = d.f(r14.f.getErrorStream());
                                    }
                                    r14.g(new h24(r10.intValue(), 0, strF3));
                                }
                                throw th;
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements tv1 {
        public b() {
        }

        @Override // defpackage.tv1
        public final void a(d24 d24Var) {
            d dVar = d.this;
            synchronized (dVar) {
                dVar.d = true;
            }
            d.this.g(d24Var);
        }
    }

    public d(e04 e04Var, t04 t04Var, c cVar, gv1 gv1Var, Context context, String str, LinkedHashSet linkedHashSet, e eVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = linkedHashSet;
        this.h = scheduledExecutorService;
        this.c = Math.max(8 - eVar.c().a, 1);
        this.j = e04Var;
        this.i = cVar;
        this.k = t04Var;
        this.l = gv1Var;
        this.m = context;
        this.n = str;
        this.q = eVar;
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        return (this.a.isEmpty() || this.b || this.d || this.e) ? false : true;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
    }

    public final String c(String str) {
        e04 e04Var = this.j;
        e04Var.a();
        Matcher matcher = t.matcher(e04Var.c.b);
        return op3.a("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.h.schedule(new a(), j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    g(new c24("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(d24 d24Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tv1) it.next()).a(d24Var);
        }
    }

    public final synchronized void h() {
        this.p.getClass();
        e(Math.max(0L, this.q.c().b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final void i(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        String strA;
        httpURLConnection.setRequestMethod(HttpConstants.Methods.POST);
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        e04 e04Var = this.j;
        e04Var.a();
        g14 g14Var = e04Var.c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", g14Var.a);
        Context context = this.m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrA = vs.a(context, context.getPackageName());
            if (bArrA == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strA = null;
            } else {
                strA = fw4.a(bArrA);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strA);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", HttpConstants.ContentTypes.JSON);
        httpURLConnection.setRequestProperty(HttpConstants.Headers.ACCEPT, HttpConstants.ContentTypes.JSON);
        HashMap map = new HashMap();
        e04Var.a();
        Matcher matcher = t.matcher(g14Var.b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.n);
        map.put("lastKnownVersionNumber", Long.toString(this.i.g.a.getLong("last_template_version", 0L)));
        e04Var.a();
        map.put("appId", g14Var.b);
        map.put("sdkVersion", "23.1.0");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final synchronized com.google.firebase.remoteconfig.internal.a j(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.a(httpURLConnection, this.i, this.l, this.a, new b(), this.h, this.q);
    }

    public final void k(Date date) {
        e eVar = this.q;
        int i = eVar.c().a + 1;
        long millis = TimeUnit.MINUTES.toMillis(s[(i < 8 ? i : 8) - 1]);
        eVar.e(i, new Date(date.getTime() + (millis / 2) + ((long) this.o.nextInt((int) millis))));
    }
}
