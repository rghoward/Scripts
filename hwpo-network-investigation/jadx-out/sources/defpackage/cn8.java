package defpackage;

import android.os.Build;
import android.util.Log;
import com.intercom.twig.BuildConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cn8 implements zk9 {
    public static final int g;
    public static final ol8 h;
    public final moa a;
    public final t04 b;
    public final l20 c;
    public final ia2 d;
    public final pk9 e;
    public final a47 f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {165, 78, 95}, m = "updateSettings")
    public static final class a extends u02 {
        public x37 t;
        public /* synthetic */ Object u;
        public int w;

        public a(u02 u02Var) {
            super(u02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return cn8.this.b(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {126}, m = "invokeSuspend")
    public static final class b extends p6a implements ci4<JSONObject, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;

        public b(r02<? super b> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = cn8.this.new b(r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(JSONObject jSONObject, r02<? super g2b> r02Var) {
            return ((b) create(jSONObject, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Boolean bool;
            Double d;
            Integer num;
            JSONException jSONException;
            Integer num2;
            Integer num3;
            Double d2;
            int i = this.t;
            Integer num4 = null;
            num4 = null;
            Boolean bool2 = null;
            if (i == 0) {
                dv8.b(obj);
                JSONObject jSONObject = (JSONObject) this.u;
                Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
                if (jSONObject.has("app_quality")) {
                    Object obj2 = jSONObject.get("app_quality");
                    obj2.getClass();
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        Boolean bool3 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                            try {
                                num3 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                try {
                                    num4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                                    g2b g2bVar = g2b.a;
                                    num = num3;
                                    d = d2;
                                    bool = bool3;
                                } catch (JSONException e) {
                                    jSONException = e;
                                    num2 = num4;
                                    bool2 = bool3;
                                    new Integer(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", jSONException));
                                    num = num3;
                                    d = d2;
                                    bool = bool2;
                                    num4 = num2;
                                }
                            } catch (JSONException e2) {
                                jSONException = e2;
                                num2 = null;
                                num3 = null;
                            }
                        } catch (JSONException e3) {
                            jSONException = e3;
                            num2 = null;
                            num3 = null;
                            d2 = null;
                        }
                    } catch (JSONException e4) {
                        jSONException = e4;
                        num2 = null;
                        num3 = null;
                        d2 = null;
                    }
                } else {
                    bool = null;
                    d = null;
                    num = null;
                }
                cn8 cn8Var = cn8.this;
                pk9 pk9Var = cn8Var.e;
                ee9 ee9Var = new ee9(bool, d, num, new Integer(num4 != null ? num4.intValue() : cn8.g), new Long(cn8Var.a.a().c));
                this.t = 1;
                Object objB = pk9Var.b(ee9Var, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    public static final class c extends p6a implements ci4<String, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            c cVar = new c(2, r02Var);
            cVar.t = obj;
            return cVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(String str, r02<? super g2b> r02Var) {
            return ((c) create(str, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.t));
            return g2b.a;
        }
    }

    static {
        l93.a aVar = l93.u;
        g = (int) l93.j(o93.f(24, q93.HOURS), q93.SECONDS);
        h = new ol8("com/google/firebase/sessions//");
    }

    public cn8(moa moaVar, t04 t04Var, l20 l20Var, ia2 ia2Var, pk9 pk9Var) {
        moaVar.getClass();
        t04Var.getClass();
        l20Var.getClass();
        ia2Var.getClass();
        pk9Var.getClass();
        this.a = moaVar;
        this.b = t04Var;
        this.c = l20Var;
        this.d = ia2Var;
        this.e = pk9Var;
        this.f = new a47();
    }

    @Override // defpackage.zk9
    public final Boolean a() {
        return this.e.e();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a7 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:45:0x009d, B:47:0x00a7, B:50:0x00b2, B:35:0x0076, B:37:0x007c, B:42:0x008d), top: B:59:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:45:0x009d, B:47:0x00a7, B:50:0x00b2, B:35:0x0076, B:37:0x007c, B:42:0x008d), top: B:59:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00b2, please report this as an issue */
    @Override // defpackage.zk9
    public final Object b(r02<? super g2b> r02Var) throws Throwable {
        a aVar;
        x37 x37Var;
        Throwable th;
        x37 x37Var2;
        Object objA;
        x37 x37Var3;
        String str;
        Map mapI;
        ia2 ia2Var;
        b bVar;
        c cVar;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.w = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((u02) r02Var);
            }
        } else {
            aVar = new a((u02) r02Var);
        }
        Object obj = aVar.u;
        int i2 = aVar.w;
        pk9 pk9Var = this.e;
        v72 v72Var = v72.t;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                a47 a47Var = this.f;
                if (!a47Var.g() && !pk9Var.d()) {
                    return g2b.a;
                }
                aVar.t = a47Var;
                aVar.w = 1;
                Object objB = a47Var.b(aVar);
                x37Var = a47Var;
                if (objB != v72Var) {
                }
                return v72Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x37Var2 = aVar.t;
                    try {
                        dv8.b(obj);
                        x37Var2 = x37Var2;
                        g2b g2bVar = g2b.a;
                        x37Var2.c(null);
                        return g2b.a;
                    } catch (Throwable th2) {
                        th = th2;
                        x37Var2.c(null);
                        throw th;
                    }
                }
                x37 x37Var4 = aVar.t;
                try {
                    dv8.b(obj);
                    objA = obj;
                    x37Var3 = x37Var4;
                    x37Var3 = x37Var;
                    str = ((re5) objA).a;
                    if (str.equals(BuildConfig.FLAVOR)) {
                        Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        g2b g2bVar2 = g2b.a;
                        x37Var3.c(null);
                        return g2bVar2;
                    }
                    js7 js7Var = new js7("X-Crashlytics-Installation-ID", str);
                    String str2 = Build.MANUFACTURER + Build.MODEL;
                    ol8 ol8Var = h;
                    js7 js7Var2 = new js7("X-Crashlytics-Device-Model", ol8Var.d(str2));
                    String str3 = Build.VERSION.INCREMENTAL;
                    str3.getClass();
                    js7 js7Var3 = new js7("X-Crashlytics-OS-Build-Version", ol8Var.d(str3));
                    String str4 = Build.VERSION.RELEASE;
                    str4.getClass();
                    js7 js7Var4 = new js7("X-Crashlytics-OS-Display-Version", ol8Var.d(str4));
                    this.c.getClass();
                    mapI = qi6.i(js7Var, js7Var2, js7Var3, js7Var4, new js7("X-Crashlytics-API-Client-Version", "3.0.6"));
                    Log.d("FirebaseSessions", "Fetching settings from server.");
                    ia2Var = this.d;
                    bVar = new b(null);
                    cVar = new c(2, null);
                    aVar.t = x37Var3;
                    aVar.w = 3;
                    if (ia2Var.a(mapI, bVar, cVar, aVar) != v72Var) {
                        x37Var2 = x37Var3;
                        g2b g2bVar3 = g2b.a;
                        x37Var2.c(null);
                        return g2b.a;
                    }
                    return v72Var;
                } catch (Throwable th3) {
                    th = th3;
                    x37Var2 = x37Var4;
                    x37Var2.c(null);
                    throw th;
                }
            }
            x37 x37Var5 = aVar.t;
            dv8.b(obj);
            x37Var = x37Var5;
            if (!pk9Var.d()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                g2b g2bVar4 = g2b.a;
                x37Var.c(null);
                return g2bVar4;
            }
            re5.a aVar2 = re5.c;
            t04 t04Var = this.b;
            aVar.t = x37Var;
            aVar.w = 2;
            objA = aVar2.a(t04Var, aVar);
            if (objA == v72Var) {
                x37Var3 = x37Var;
            } else {
                x37Var3 = x37Var;
                str = ((re5) objA).a;
                if (str.equals(BuildConfig.FLAVOR)) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    g2b g2bVar5 = g2b.a;
                    x37Var3.c(null);
                    return g2bVar5;
                }
                js7 js7Var5 = new js7("X-Crashlytics-Installation-ID", str);
                String str5 = Build.MANUFACTURER + Build.MODEL;
                ol8 ol8Var2 = h;
                js7 js7Var6 = new js7("X-Crashlytics-Device-Model", ol8Var2.d(str5));
                String str6 = Build.VERSION.INCREMENTAL;
                str6.getClass();
                js7 js7Var7 = new js7("X-Crashlytics-OS-Build-Version", ol8Var2.d(str6));
                String str7 = Build.VERSION.RELEASE;
                str7.getClass();
                js7 js7Var8 = new js7("X-Crashlytics-OS-Display-Version", ol8Var2.d(str7));
                this.c.getClass();
                mapI = qi6.i(js7Var5, js7Var6, js7Var7, js7Var8, new js7("X-Crashlytics-API-Client-Version", "3.0.6"));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                ia2Var = this.d;
                bVar = new b(null);
                cVar = new c(2, null);
                aVar.t = x37Var3;
                aVar.w = 3;
                if (ia2Var.a(mapI, bVar, cVar, aVar) != v72Var) {
                    x37Var2 = x37Var3;
                    g2b g2bVar6 = g2b.a;
                    x37Var2.c(null);
                    return g2b.a;
                }
            }
            return v72Var;
        } catch (Throwable th4) {
            x37 x37Var6 = x37Var;
            th = th4;
            x37Var2 = x37Var6;
            x37Var2.c(null);
            throw th;
        }
    }

    @Override // defpackage.zk9
    public final l93 c() {
        Integer numC = this.e.c();
        if (numC == null) {
            return null;
        }
        l93.a aVar = l93.u;
        return new l93(o93.f(numC.intValue(), q93.SECONDS));
    }

    @Override // defpackage.zk9
    public final Double d() {
        return this.e.a();
    }
}
