package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.intercom.twig.BuildConfig;
import defpackage.c24;
import defpackage.caa;
import defpackage.d24;
import defpackage.gv1;
import defpackage.h24;
import defpackage.mq2;
import defpackage.r9a;
import defpackage.s02;
import defpackage.tv1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final LinkedHashSet a;
    public final HttpURLConnection b;
    public final c c;
    public final gv1 d;
    public final d.b e;
    public final ScheduledExecutorService f;
    public final e i;
    public final Random g = new Random();
    public boolean j = false;
    public final mq2 h = mq2.a;

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class RunnableC0060a implements Runnable {
        public final /* synthetic */ int t;
        public final /* synthetic */ long u;

        public RunnableC0060a(int i, long j) {
            this.t = i;
            this.u = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final a aVar = a.this;
            int i = this.t;
            final long j = this.u;
            synchronized (aVar) {
                final int i2 = i - 1;
                final r9a r9aVarC = aVar.c.c(3 - i2);
                final r9a<b> r9aVarB = aVar.d.b();
                caa.g(r9aVarC, r9aVarB).h(aVar.f, new s02() { // from class: cv1
                    @Override // defpackage.s02
                    public final Object a(r9a r9aVar) throws JSONException {
                        Boolean boolValueOf;
                        a aVar2 = aVar;
                        r9a r9aVar2 = r9aVarC;
                        r9a r9aVar3 = r9aVarB;
                        long j2 = j;
                        int i3 = i2;
                        if (!r9aVar2.n()) {
                            return caa.d(new c24("Failed to auto-fetch config update.", r9aVar2.i()));
                        }
                        if (!r9aVar3.n()) {
                            return caa.d(new c24("Failed to get activated config for auto-fetch", r9aVar3.i()));
                        }
                        c.a aVar3 = (c.a) r9aVar2.j();
                        b bVar = (b) r9aVar3.j();
                        b bVar2 = aVar3.b;
                        if (bVar2 != null) {
                            boolValueOf = Boolean.valueOf(bVar2.f >= j2);
                        } else {
                            boolValueOf = Boolean.valueOf(aVar3.a == 1);
                        }
                        if (!boolValueOf.booleanValue()) {
                            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                            aVar2.a(i3, j2);
                            return caa.e(null);
                        }
                        if (aVar3.b == null) {
                            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                            return caa.e(null);
                        }
                        if (bVar == null) {
                            b.a aVarD = b.d();
                            bVar = new b(aVarD.a, aVarD.b, aVarD.c, aVarD.d, aVarD.e, aVarD.f);
                        }
                        b bVar3 = aVar3.b;
                        JSONObject jSONObject = bVar.e;
                        JSONObject jSONObject2 = bVar3.a;
                        JSONObject jSONObject3 = bVar3.b;
                        JSONObject jSONObject4 = bVar3.e;
                        JSONObject jSONObject5 = b.a(new JSONObject(jSONObject2.toString())).b;
                        HashMap mapC = bVar.c();
                        HashMap mapC2 = bVar3.c();
                        HashMap mapB = bVar.b();
                        HashMap mapB2 = bVar3.b();
                        HashSet hashSet = new HashSet();
                        JSONObject jSONObject6 = bVar.b;
                        Iterator<String> itKeys = jSONObject6.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (!jSONObject3.has(next)) {
                                hashSet.add(next);
                            } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                                hashSet.add(next);
                            } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                                hashSet.add(next);
                            } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !((Map) mapC.get(next)).equals(mapC2.get(next))) {
                                hashSet.add(next);
                            } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                                hashSet.add(next);
                            } else if (mapB2.containsKey(next) && mapB.containsKey(next) && !((JSONObject) mapB2.get(next)).toString().equals(((JSONObject) mapB.get(next)).toString())) {
                                hashSet.add(next);
                            } else {
                                jSONObject5.remove(next);
                            }
                        }
                        Iterator<String> itKeys2 = jSONObject5.keys();
                        while (itKeys2.hasNext()) {
                            hashSet.add(itKeys2.next());
                        }
                        if (hashSet.isEmpty()) {
                            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                            return caa.e(null);
                        }
                        new xc0(hashSet);
                        synchronized (aVar2) {
                            Iterator it = aVar2.a.iterator();
                            while (it.hasNext()) {
                                ((tv1) it.next()).getClass();
                            }
                        }
                        return caa.e(null);
                    }
                });
            }
        }
    }

    public a(HttpURLConnection httpURLConnection, c cVar, gv1 gv1Var, LinkedHashSet linkedHashSet, d.b bVar, ScheduledExecutorService scheduledExecutorService, e eVar) {
        this.b = httpURLConnection;
        this.c = cVar;
        this.d = gv1Var;
        this.a = linkedHashSet;
        this.e = bVar;
        this.f = scheduledExecutorService;
        this.i = eVar;
    }

    public final void a(int i, long j) {
        if (i == 0) {
            d(new h24("Unable to fetch the latest version of the template."));
            return;
        }
        this.f.schedule(new RunnableC0060a(i, j), this.g.nextInt(4), TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strConcat = BuildConfig.FLAVOR;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strConcat = strConcat.concat(line);
            if (line.contains("}")) {
                int iIndexOf = strConcat.indexOf(123);
                int iLastIndexOf = strConcat.lastIndexOf(125);
                strConcat = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? BuildConfig.FLAVOR : strConcat.substring(iIndexOf, iLastIndexOf + 1);
                if (strConcat.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strConcat);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            this.e.a(new h24("The server is temporarily unavailable. Try again in a few minutes."));
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = this.a.isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = this.c.g.a.getLong("last_template_version", 0L);
                            long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j2 > j) {
                                a(3, j2);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            e(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        strConcat = BuildConfig.FLAVOR;
                    } catch (JSONException e) {
                        d(new c24("Unable to parse config update message.", e.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                }
            }
        }
        bufferedReader.close();
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e);
                }
            } catch (IOException e2) {
                if (!this.j) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e2);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
                }
            }
            throw th;
        }
    }

    public final synchronized void d(d24 d24Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tv1) it.next()).a(d24Var);
        }
    }

    public final synchronized void e(int i) {
        this.h.getClass();
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i) * 1000));
        e eVar = this.i;
        synchronized (eVar.d) {
            eVar.a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
