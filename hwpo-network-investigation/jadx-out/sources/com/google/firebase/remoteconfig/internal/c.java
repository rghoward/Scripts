package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.e;
import defpackage.c24;
import defpackage.caa;
import defpackage.d24;
import defpackage.e24;
import defpackage.gv1;
import defpackage.h24;
import defpackage.of8;
import defpackage.q6d;
import defpackage.r9a;
import defpackage.s02;
import defpackage.si;
import defpackage.t04;
import io.ably.lib.util.AgentHeaderCreator;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final int[] i = {2, 4, 8, 16, 32, 64, 128, 256};
    public final t04 a;
    public final of8<si> b;
    public final Executor c;
    public final Random d;
    public final gv1 e;
    public final ConfigFetchHttpClient f;
    public final e g;
    public final Map<String, String> h;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final int a;
        public final b b;
        public final String c;

        public a(int i, b bVar, String str) {
            this.a = i;
            this.b = bVar;
            this.c = str;
        }
    }

    public c(t04 t04Var, of8 of8Var, Executor executor, Random random, gv1 gv1Var, ConfigFetchHttpClient configFetchHttpClient, e eVar, HashMap map) {
        this.a = t04Var;
        this.b = of8Var;
        this.c = executor;
        this.d = random;
        this.e = gv1Var;
        this.f = configFetchHttpClient;
        this.g = eVar;
        this.h = map;
    }

    public final a a(String str, String str2, Date date, HashMap map) throws d24 {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f;
            HashMap mapD = d();
            String string = this.g.a.getString("last_fetch_etag", null);
            si siVar = this.b.get();
            a aVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, siVar != null ? (Long) siVar.a(true).get("_fot") : null, date, this.g.b());
            b bVar = aVarFetch.b;
            if (bVar != null) {
                e eVar = this.g;
                long j = bVar.f;
                synchronized (eVar.b) {
                    eVar.a.edit().putLong("last_template_version", j).apply();
                }
            }
            String str4 = aVarFetch.c;
            if (str4 != null) {
                e eVar2 = this.g;
                synchronized (eVar2.b) {
                    eVar2.a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.g.d(0, e.f);
            return aVarFetch;
        } catch (h24 e) {
            int i2 = e.t;
            e eVar3 = this.g;
            if (i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504) {
                int i3 = eVar3.a().a + 1;
                long millis = TimeUnit.MINUTES.toMillis(i[Math.min(i3, 8) - 1]);
                eVar3.d(i3, new Date(date.getTime() + (millis / 2) + ((long) this.d.nextInt((int) millis))));
            }
            e.a aVarA = eVar3.a();
            int i4 = e.t;
            if (aVarA.a > 1 || i4 == 429) {
                aVarA.b.getTime();
                throw new e24("Fetch was throttled.");
            }
            if (i4 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i4 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i4 == 429) {
                    throw new c24("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i4 != 500) {
                    switch (i4) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new h24(e.t, "Fetch failed: ".concat(str3), e);
        }
    }

    public final r9a b(r9a r9aVar, long j, final HashMap map) {
        final c cVar;
        r9a r9aVarH;
        final Date date = new Date(System.currentTimeMillis());
        boolean zN = r9aVar.n();
        e eVar = this.g;
        if (zN) {
            Date date2 = new Date(eVar.a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(e.e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date2.getTime()))) {
                return caa.e(new a(2, null, null));
            }
        }
        Date date3 = eVar.a().b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime((date4.getTime() - date.getTime()) / 1000);
            date4.getTime();
            r9aVarH = caa.d(new e24(str));
            cVar = this;
        } else {
            t04 t04Var = this.a;
            final q6d id = t04Var.getId();
            final q6d q6dVarA = t04Var.a();
            cVar = this;
            r9aVarH = caa.g(id, q6dVarA).h(executor, new s02() { // from class: iv1
                @Override // defpackage.s02
                public final Object a(r9a r9aVar2) {
                    c cVar2 = this.t;
                    Date date5 = date;
                    HashMap map2 = map;
                    r9a r9aVar3 = id;
                    if (!r9aVar3.n()) {
                        return caa.d(new c24("Firebase Installations failed to get installation ID for fetch.", r9aVar3.i()));
                    }
                    r9a r9aVar4 = q6dVarA;
                    if (!r9aVar4.n()) {
                        return caa.d(new c24("Firebase Installations failed to get installation auth token for fetch.", r9aVar4.i()));
                    }
                    try {
                        final c.a aVarA = cVar2.a((String) r9aVar3.j(), ((te5) r9aVar4.j()).a(), date5, map2);
                        if (aVarA.a != 0) {
                            return caa.e(aVarA);
                        }
                        gv1 gv1Var = cVar2.e;
                        b bVar = aVarA.b;
                        Executor executor2 = gv1Var.a;
                        return caa.c(executor2, new ev1(gv1Var, bVar)).o(executor2, new fv1(gv1Var, bVar)).o(cVar2.c, new e5a() { // from class: lv1
                            @Override // defpackage.e5a
                            public final r9a b(Object obj) {
                                return caa.e(aVarA);
                            }
                        });
                    } catch (d24 e) {
                        return caa.d(e);
                    }
                }
            });
        }
        return r9aVarH.h(executor, new s02() { // from class: jv1
            @Override // defpackage.s02
            public final Object a(r9a r9aVar2) {
                c cVar2 = this.t;
                Date date5 = date;
                if (r9aVar2.n()) {
                    e eVar2 = cVar2.g;
                    synchronized (eVar2.b) {
                        eVar2.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date5.getTime()).apply();
                    }
                    return r9aVar2;
                }
                Exception excI = r9aVar2.i();
                if (excI == null) {
                    return r9aVar2;
                }
                boolean z = excI instanceof e24;
                e eVar3 = cVar2.g;
                Object obj = eVar3.b;
                if (z) {
                    synchronized (obj) {
                        eVar3.a.edit().putInt("last_fetch_status", 2).apply();
                    }
                    return r9aVar2;
                }
                synchronized (obj) {
                    eVar3.a.edit().putInt("last_fetch_status", 1).apply();
                }
                return r9aVar2;
            }
        });
    }

    public final r9a c(int i2) {
        final HashMap map = new HashMap(this.h);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME" + AgentHeaderCreator.AGENT_DIVIDER + i2);
        return this.e.b().h(this.c, new s02() { // from class: kv1
            @Override // defpackage.s02
            public final Object a(r9a r9aVar) {
                return this.t.b(r9aVar, 0L, map);
            }
        });
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        si siVar = this.b.get();
        if (siVar != null) {
            for (Map.Entry<String, Object> entry : siVar.a(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
