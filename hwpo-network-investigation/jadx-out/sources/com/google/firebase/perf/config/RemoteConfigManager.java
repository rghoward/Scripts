package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import defpackage.b24;
import defpackage.di7;
import defpackage.dp;
import defpackage.e5a;
import defpackage.i24;
import defpackage.l04;
import defpackage.of8;
import defpackage.oi1;
import defpackage.rk7;
import defpackage.s02;
import defpackage.sm8;
import defpackage.xv1;
import defpackage.yy2;
import defpackage.z50;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, i24> allRcConfigMap;
    private final yy2 cache;
    private final Executor executor;
    private b24 firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private of8<sm8> firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final dp logger = dp.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = 43200000;

    private RemoteConfigManager() {
        this(yy2.b(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(RANDOM_CONFIG_FETCH_DELAY_MS)) + MIN_CONFIG_FETCH_DELAY_MS);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private i24 getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        i24 i24Var = this.allRcConfigMap.get(str);
        if (i24Var.a() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", i24Var.g(), str);
        return i24Var;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j) {
        return j - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        final b24 b24Var = this.firebaseRemoteConfig;
        final c cVar = b24Var.e;
        final long j = cVar.g.a.getLong("minimum_fetch_interval_in_seconds", 43200L);
        final HashMap map = new HashMap(cVar.h);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        cVar.e.b().h(cVar.c, new s02() { // from class: hv1
            @Override // defpackage.s02
            public final Object a(r9a r9aVar) {
                return cVar.b(r9aVar, j, map);
            }
        }).o(l04.t, new oi1()).o(b24Var.b, new e5a() { // from class: y14
            @Override // defpackage.e5a
            public final r9a b(Object obj) {
                final b24 b24Var2 = b24Var;
                final r9a<b> r9aVarB = b24Var2.c.b();
                final r9a<b> r9aVarB2 = b24Var2.d.b();
                return caa.g(r9aVarB, r9aVarB2).h(b24Var2.b, new s02() { // from class: z14
                    @Override // defpackage.s02
                    public final Object a(r9a r9aVar) {
                        b bVar;
                        final b24 b24Var3 = b24Var2;
                        b24Var3.getClass();
                        r9a r9aVar2 = r9aVarB;
                        if (!r9aVar2.n() || r9aVar2.j() == null) {
                            return caa.e(Boolean.FALSE);
                        }
                        b bVar2 = (b) r9aVar2.j();
                        r9a r9aVar3 = r9aVarB2;
                        if (r9aVar3.n() && (bVar = (b) r9aVar3.j()) != null && bVar2.c.equals(bVar.c)) {
                            return caa.e(Boolean.FALSE);
                        }
                        gv1 gv1Var = b24Var3.d;
                        Executor executor = gv1Var.a;
                        return caa.c(executor, new ev1(gv1Var, bVar2)).o(executor, new fv1(gv1Var, bVar2)).g(b24Var3.b, new s02() { // from class: a24
                            @Override // defpackage.s02
                            public final Object a(r9a r9aVar4) {
                                boolean z;
                                b24 b24Var4 = b24Var3;
                                b24Var4.getClass();
                                if (r9aVar4.n()) {
                                    gv1 gv1Var2 = b24Var4.c;
                                    synchronized (gv1Var2) {
                                        gv1Var2.c = caa.e(null);
                                    }
                                    sv1 sv1Var = gv1Var2.b;
                                    synchronized (sv1Var) {
                                        sv1Var.a.deleteFile(sv1Var.b);
                                    }
                                    b bVar3 = (b) r9aVar4.j();
                                    if (bVar3 != null) {
                                        JSONArray jSONArray = bVar3.d;
                                        b04 b04Var = b24Var4.a;
                                        if (b04Var != null) {
                                            try {
                                                b04Var.b(b24.d(jSONArray));
                                            } catch (JSONException e) {
                                                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e);
                                            } catch (z2 e2) {
                                                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
                                            }
                                        }
                                        nx8 nx8Var = b24Var4.j;
                                        try {
                                            final ue0 ue0VarA = nx8Var.b.a(bVar3);
                                            for (final jx8 jx8Var : nx8Var.d) {
                                                nx8Var.c.execute(new Runnable() { // from class: kx8
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        jx8Var.a(ue0VarA);
                                                    }
                                                });
                                            }
                                        } catch (d24 e3) {
                                            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e3);
                                        }
                                    } else {
                                        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
                                    }
                                    z = true;
                                } else {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                        });
                    }
                });
            }
        }).f(this.executor, new di7() { // from class: vm8
            @Override // defpackage.di7
            public final void onSuccess(Object obj) {
                this.t.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
            }
        }).e(this.executor, new z50(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.a());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public rk7<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return new rk7<>();
        }
        i24 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new rk7<>(Boolean.valueOf(remoteConfigValue.h()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.g().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.g(), str);
                }
            }
        }
        return new rk7<>();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public rk7<Double> getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return new rk7<>();
        }
        i24 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new rk7<>(Double.valueOf(remoteConfigValue.f()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.g().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.g(), str);
                }
            }
        }
        return new rk7<>();
    }

    public rk7<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return new rk7<>();
        }
        i24 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new rk7<>(Long.valueOf(remoteConfigValue.e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.g().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.g(), str);
                }
            }
        }
        return new rk7<>();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        i24 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(remoteConfigValue.h());
                }
                if (t instanceof Double) {
                    return (T) Double.valueOf(remoteConfigValue.f());
                }
                if (!(t instanceof Long) && !(t instanceof Integer)) {
                    if (t instanceof String) {
                        return (T) remoteConfigValue.g();
                    }
                    T t2 = (T) remoteConfigValue.g();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        if (!remoteConfigValue.g().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.g(), str);
                        }
                        return t;
                    }
                }
                return (T) Long.valueOf(remoteConfigValue.e());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t;
    }

    public rk7<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return new rk7<>();
        }
        i24 remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new rk7<>(remoteConfigValue.g()) : new rk7<>();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        of8<sm8> of8Var;
        sm8 sm8Var;
        if (this.firebaseRemoteConfig == null && (of8Var = this.firebaseRemoteConfigProvider) != null && (sm8Var = of8Var.get()) != null) {
            this.firebaseRemoteConfig = sm8Var.c(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        b24 b24Var = this.firebaseRemoteConfig;
        return b24Var == null || b24Var.b().a == 1 || this.firebaseRemoteConfig.b().a == 2;
    }

    public void setFirebaseRemoteConfigProvider(of8<sm8> of8Var) {
        this.firebaseRemoteConfigProvider = of8Var;
    }

    public void syncConfigValues(Map<String, i24> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        xv1 xv1VarH1 = xv1.h1();
        ConcurrentHashMap<String, i24> concurrentHashMap = this.allRcConfigMap;
        xv1VarH1.getClass();
        i24 i24Var = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (i24Var == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.g("com.google.firebase.perf.ExperimentTTID", i24Var.h());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    public RemoteConfigManager(yy2 yy2Var, Executor executor, b24 b24Var, long j) {
        ConcurrentHashMap<String, i24> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = yy2Var;
        this.executor = executor;
        this.firebaseRemoteConfig = b24Var;
        if (b24Var == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(b24Var.a());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j;
    }
}
