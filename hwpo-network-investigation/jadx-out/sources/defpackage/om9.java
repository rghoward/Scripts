package defpackage;

import android.util.Log;
import com.intercom.twig.BuildConfig;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class om9 implements nm9 {
    public final vi9 a;
    public final ug9 b;
    public final qg9 c;
    public final moa d;
    public final pf2<ge9> e;
    public final z98 f;
    public final h72 g;
    public ge9 h;
    public boolean i;
    public boolean j;
    public String k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", l = {96}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        /* JADX INFO: renamed from: om9$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", l = {94}, m = "invokeSuspend")
        public static final class C0214a extends p6a implements ei4<s54<? super ge9>, Throwable, r02<? super g2b>, Object> {
            public int t;
            public /* synthetic */ s54 u;
            public /* synthetic */ Throwable v;
            public final /* synthetic */ om9 w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0214a(om9 om9Var, r02<? super C0214a> r02Var) {
                super(3, r02Var);
                this.w = om9Var;
            }

            @Override // defpackage.ei4
            public final Object invoke(s54<? super ge9> s54Var, Throwable th, r02<? super g2b> r02Var) {
                C0214a c0214a = new C0214a(this.w, r02Var);
                c0214a.u = s54Var;
                c0214a.v = th;
                return c0214a.invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    s54 s54Var = this.u;
                    Throwable th = this.v;
                    re9 re9VarA = this.w.b.a(null);
                    ge9 ge9Var = new ge9(re9VarA, null, null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + re9VarA.a);
                    this.u = null;
                    this.t = 1;
                    Object objEmit = s54Var.emit(ge9Var, this);
                    v72 v72Var = v72.t;
                    if (objEmit == v72Var) {
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
        public static final class b<T> implements s54 {
            public final /* synthetic */ om9 t;

            public b(om9 om9Var) {
                this.t = om9Var;
            }

            @Override // defpackage.s54
            public final Object emit(Object obj, r02 r02Var) throws Throwable {
                ge9 ge9Var = (ge9) obj;
                ge9Var.getClass();
                om9 om9Var = this.t;
                om9Var.h = ge9Var;
                if (om9Var.j) {
                    om9Var.j = false;
                    om9Var.c();
                }
                Object objD = om9.d(om9Var, ge9Var.a.a, b.t, r02Var);
                return objD == v72.t ? objD : g2b.a;
            }
        }

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return om9.this.new a(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                om9 om9Var = om9.this;
                o64 o64Var = new o64(om9Var.e.getData(), new C0214a(om9Var, null));
                b bVar = new b(om9Var);
                this.t = 1;
                Object objCollect = o64Var.collect(bVar, this);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final b t;
        public static final b u;
        public static final /* synthetic */ b[] v;

        static {
            b bVar = new b("GENERAL", 0);
            t = bVar;
            b bVar2 = new b("FALLBACK", 1);
            u = bVar2;
            v = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) v.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", l = {118}, m = "invokeSuspend")
    public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        public static final class a extends p6a implements ci4<ge9, r02<? super ge9>, Object> {
            public /* synthetic */ Object t;
            public final /* synthetic */ om9 u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(om9 om9Var, r02<? super a> r02Var) {
                super(2, r02Var);
                this.u = om9Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                a aVar = new a(this.u, r02Var);
                aVar.t = obj;
                return aVar;
            }

            @Override // defpackage.ci4
            public final Object invoke(ge9 ge9Var, r02<? super ge9> r02Var) {
                return ((a) create(ge9Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                dv8.b(obj);
                return ge9.a((ge9) this.t, null, this.u.d.a(), null, 5);
            }
        }

        public c(r02<? super c> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return om9.this.new c(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            om9 om9Var = om9.this;
            try {
                if (i == 0) {
                    dv8.b(obj);
                    pf2<ge9> pf2Var = om9Var.e;
                    a aVar = new a(om9Var, null);
                    this.t = 1;
                    Object objA = pf2Var.a(aVar, this);
                    v72 v72Var = v72.t;
                    if (objA == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
            } catch (Exception e) {
                Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                ge9 ge9Var = om9Var.h;
                if (ge9Var == null) {
                    xj5.e("localSessionData");
                    throw null;
                }
                om9Var.h = ge9.a(ge9Var, null, om9Var.d.a(), null, 5);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", l = {142, 193}, m = "invokeSuspend")
    public static final class d extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ ge9 v;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        public static final class a extends p6a implements ci4<ge9, r02<? super ge9>, Object> {
            public /* synthetic */ Object t;
            public final /* synthetic */ om9 u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(om9 om9Var, r02<? super a> r02Var) {
                super(2, r02Var);
                this.u = om9Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                a aVar = new a(this.u, r02Var);
                aVar.t = obj;
                return aVar;
            }

            @Override // defpackage.ci4
            public final Object invoke(ge9 ge9Var, r02<? super ge9> r02Var) {
                return ((a) create(ge9Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean zB;
                dv8.b(obj);
                ge9 ge9Var = (ge9) this.t;
                om9 om9Var = this.u;
                z98 z98Var = om9Var.f;
                boolean zF = om9Var.f(ge9Var);
                Map<String, y98> mapF = ge9Var.c;
                if (mapF != null) {
                    zB = z98Var.b(mapF);
                    if (zB) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    zB = true;
                }
                boolean zE = om9Var.e(ge9Var);
                if (zB) {
                    mapF = z98Var.e();
                } else if (zE) {
                    mapF = z98Var.f(mapF);
                }
                re9 re9Var = zB ? null : ge9Var.a;
                if (!zF && !zB) {
                    return zE ? ge9.a(ge9Var, null, null, z98Var.f(mapF), 3) : ge9Var;
                }
                re9 re9VarA = om9Var.b.a(re9Var);
                om9Var.c.a(re9VarA);
                z98Var.a();
                return new ge9(re9VarA, null, mapF);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ge9 ge9Var, r02<? super d> r02Var) {
            super(2, r02Var);
            this.v = ge9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return om9.this.new d(this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((d) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        
            if (r6 == r5) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        
            if (defpackage.om9.d(r4, r7, om9.b.u, r6) == r5) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
        
            return r5;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v7 */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                int r0 = r6.t
                r1 = 0
                r2 = 2
                r3 = 1
                om9 r4 = defpackage.om9.this
                v72 r5 = defpackage.v72.t
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L19
                if (r0 != r2) goto L13
                defpackage.dv8.b(r7)
                goto L72
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r6)
                return r1
            L19:
                defpackage.dv8.b(r7)     // Catch: java.lang.Exception -> L1d
                goto L72
            L1d:
                r7 = move-exception
                goto L32
            L1f:
                defpackage.dv8.b(r7)
                pf2<ge9> r7 = r4.e     // Catch: java.lang.Exception -> L1d
                om9$d$a r0 = new om9$d$a     // Catch: java.lang.Exception -> L1d
                r0.<init>(r4, r1)     // Catch: java.lang.Exception -> L1d
                r6.t = r3     // Catch: java.lang.Exception -> L1d
                java.lang.Object r6 = r7.a(r0, r6)     // Catch: java.lang.Exception -> L1d
                if (r6 != r5) goto L72
                goto L71
            L32:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r3 = "App foregrounded, failed to update data. Message: "
                r0.<init>(r3)
                java.lang.String r7 = r7.getMessage()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r0 = "FirebaseSessions"
                android.util.Log.d(r0, r7)
                ge9 r7 = r6.v
                boolean r0 = r4.f(r7)
                if (r0 == 0) goto L72
                ug9 r0 = r4.b
                re9 r3 = r7.a
                re9 r0 = r0.a(r3)
                r3 = 4
                ge9 r7 = defpackage.ge9.a(r7, r0, r1, r1, r3)
                r4.h = r7
                qg9 r7 = r4.c
                r7.a(r0)
                java.lang.String r7 = r0.a
                r6.t = r2
                om9$b r0 = om9.b.u
                java.lang.Object r6 = defpackage.om9.d(r4, r7, r0, r6)
                if (r6 != r5) goto L72
            L71:
                return r5
            L72:
                g2b r6 = defpackage.g2b.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: om9.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public om9(vi9 vi9Var, ug9 ug9Var, qg9 qg9Var, moa moaVar, pf2<ge9> pf2Var, z98 z98Var, @ci0 h72 h72Var) {
        vi9Var.getClass();
        ug9Var.getClass();
        qg9Var.getClass();
        moaVar.getClass();
        pf2Var.getClass();
        z98Var.getClass();
        h72Var.getClass();
        this.a = vi9Var;
        this.b = ug9Var;
        this.c = qg9Var;
        this.d = moaVar;
        this.e = pf2Var;
        this.f = z98Var;
        this.g = h72Var;
        this.k = BuildConfig.FLAVOR;
        oy0.d(u72.a(h72Var), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(om9 om9Var, String str, b bVar, r02 r02Var) throws Throwable {
        pm9 pm9Var;
        String string;
        if (r02Var instanceof pm9) {
            pm9Var = (pm9) r02Var;
            int i = pm9Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                pm9Var.x = i - Integer.MIN_VALUE;
            } else {
                pm9Var = new pm9(om9Var, r02Var);
            }
        } else {
            pm9Var = new pm9(om9Var, r02Var);
        }
        Object objB = pm9Var.v;
        int i2 = pm9Var.x;
        if (i2 == 0) {
            dv8.b(objB);
            if (xj5.a(om9Var.k, str)) {
                return g2b.a;
            }
            om9Var.k = str;
            v24 v24Var = v24.a;
            pm9Var.t = str;
            pm9Var.u = bVar;
            pm9Var.x = 1;
            objB = v24Var.b(pm9Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = pm9Var.u;
            str = pm9Var.t;
            dv8.b(objB);
        }
        for (kh9 kh9Var : ((Map) objB).values()) {
            kh9Var.b(new kh9.b(str));
            int iOrdinal = bVar.ordinal();
            kh9.a aVar = kh9.a.t;
            if (iOrdinal == 0) {
                StringBuilder sb = new StringBuilder("Notified ");
                kh9Var.c();
                sb.append(aVar);
                sb.append(" of new session ");
                sb.append(str);
                string = sb.toString();
            } else {
                if (iOrdinal != 1) {
                    u.b();
                    return null;
                }
                StringBuilder sb2 = new StringBuilder("Notified ");
                kh9Var.c();
                sb2.append(aVar);
                sb2.append(" of new fallback session ");
                sb2.append(str);
                string = sb2.toString();
            }
            Log.d("FirebaseSessions", string);
        }
        return g2b.a;
    }

    @Override // defpackage.nm9
    public final boolean a() {
        return this.i;
    }

    @Override // defpackage.nm9
    public final void b() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.c());
        oy0.d(u72.a(this.g), null, null, new c(null), 3);
    }

    @Override // defpackage.nm9
    public final void c() {
        this.i = true;
        ge9 ge9Var = this.h;
        if (ge9Var == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else {
            if (ge9Var == null) {
                xj5.e("localSessionData");
                throw null;
            }
            Log.d("FirebaseSessions", "App foregrounded on " + this.f.c());
            if (f(ge9Var) || e(ge9Var)) {
                oy0.d(u72.a(this.g), null, null, new d(ge9Var, null), 3);
            }
        }
    }

    public final boolean e(ge9 ge9Var) {
        Map<String, y98> map = ge9Var.c;
        z98 z98Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + z98Var.c());
            return true;
        }
        boolean zD = z98Var.d(map);
        if (zD) {
            Log.d("FirebaseSessions", "Process " + z98Var.c() + " is stale");
        }
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    public final boolean f(ge9 ge9Var) {
        l93 l93VarC;
        long jF;
        tma tmaVar = ge9Var.b;
        re9 re9Var = ge9Var.a;
        if (tmaVar == null) {
            Log.d("FirebaseSessions", "Session " + re9Var.a + " has not backgrounded yet");
            return false;
        }
        tma tmaVarA = this.d.a();
        l93.a aVar = l93.u;
        long jG = o93.g(tmaVarA.a - tmaVar.a, q93.MILLISECONDS);
        vi9 vi9Var = this.a;
        l93 l93VarC2 = vi9Var.a.c();
        if (l93VarC2 != null) {
            jF = l93VarC2.t;
            if (jF <= 0 || l93.h(jF)) {
                l93VarC = vi9Var.b.c();
                if (l93VarC != null) {
                    jF = l93VarC.t;
                    if (jF > 0 || l93.h(jF)) {
                        jF = o93.f(30, q93.MINUTES);
                    }
                } else {
                    jF = o93.f(30, q93.MINUTES);
                }
            }
        } else {
            l93VarC = vi9Var.b.c();
            if (l93VarC != null) {
                jF = l93VarC.t;
                if (jF > 0) {
                    jF = o93.f(30, q93.MINUTES);
                } else {
                    jF = o93.f(30, q93.MINUTES);
                }
            } else {
                jF = o93.f(30, q93.MINUTES);
            }
        }
        boolean z = l93.f(jG, jF) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + re9Var.a + " is expired");
        }
        return z;
    }
}
