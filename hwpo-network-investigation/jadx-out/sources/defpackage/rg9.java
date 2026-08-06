package defpackage;

import android.util.Log;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rg9 implements qg9 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final e04 a;
    public final t04 b;
    public final vi9 c;
    public final jm3 d;
    public final h72 e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", l = {70, 71, 77}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public final /* synthetic */ re9 B;
        public re5 t;
        public rg9 u;
        public og9 v;
        public e04 w;
        public re9 x;
        public vi9 y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(re9 re9Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.B = re9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return rg9.this.new a(this.B, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007c  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:29:0x00be  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object objA;
            re5 re5Var;
            og9 og9Var;
            e04 e04Var;
            vi9 vi9Var;
            re9 re9Var;
            Object objB2;
            re9 re9Var2;
            kh9 kh9Var;
            ve2 ve2Var;
            ve2 ve2Var2;
            ve2 ve2Var3;
            ve2 ve2Var4;
            kh9 kh9Var2;
            int i = this.z;
            rg9 rg9Var = rg9.this;
            v72 v72Var = v72.t;
            if (i == 0) {
                dv8.b(obj);
                this.z = 1;
                objB = rg9.b(rg9Var, this);
                if (objB != v72Var) {
                }
                return v72Var;
            }
            if (i == 1) {
                dv8.b(obj);
                objB = obj;
            } else {
                if (i == 2) {
                    dv8.b(obj);
                    objA = obj;
                    re5Var = (re5) objA;
                    og9Var = og9.a;
                    e04Var = rg9Var.a;
                    vi9Var = rg9Var.c;
                    v24 v24Var = v24.a;
                    this.t = re5Var;
                    this.u = rg9Var;
                    this.v = og9Var;
                    this.w = e04Var;
                    re9Var = this.B;
                    this.x = re9Var;
                    this.y = vi9Var;
                    this.z = 3;
                    objB2 = v24Var.b(this);
                    if (objB2 != v72Var) {
                        re9Var2 = re9Var;
                    }
                    return v72Var;
                }
                if (i != 3) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vi9 vi9Var2 = this.y;
                re9Var2 = this.x;
                e04Var = this.w;
                og9Var = this.v;
                rg9Var = this.u;
                re5 re5Var2 = this.t;
                dv8.b(obj);
                vi9Var = vi9Var2;
                re5Var = re5Var2;
                objB2 = obj;
            }
            Map map = (Map) objB2;
            String str = re5Var.a;
            String str2 = re5Var.b;
            og9Var.getClass();
            e04Var.getClass();
            re9Var2.getClass();
            vi9Var.getClass();
            map.getClass();
            str2.getClass();
            String str3 = re9Var2.a;
            String str4 = re9Var2.b;
            int i2 = re9Var2.c;
            long j = re9Var2.d;
            kh9Var = (kh9) map.get(kh9.a.u);
            ve2Var = ve2.COLLECTION_DISABLED;
            ve2Var2 = ve2.COLLECTION_ENABLED;
            ve2Var3 = ve2.COLLECTION_SDK_NOT_INSTALLED;
            if (kh9Var == null) {
                ve2Var4 = ve2Var3;
            } else if (kh9Var.a()) {
                ve2Var4 = ve2Var2;
            } else {
                ve2Var4 = ve2Var;
            }
            kh9Var2 = (kh9) map.get(kh9.a.t);
            if (kh9Var2 == null) {
                ve2Var = ve2Var3;
            } else if (kh9Var2.a()) {
                ve2Var = ve2Var2;
            }
            ng9 ng9Var = new ng9(new yg9(str3, str4, i2, j, new we2(ve2Var4, ve2Var, vi9Var.a()), str, str2), og9.a(e04Var));
            int i3 = rg9.g;
            rg9Var.getClass();
            try {
                rg9Var.d.a(ng9Var);
                Log.d("FirebaseSessions", "Successfully logged Session Start event.");
            } catch (RuntimeException e) {
                Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e);
            }
            return g2b.a;
            if (((Boolean) objB).booleanValue()) {
                t04 t04Var = rg9Var.b;
                this.z = 2;
                objA = re5.c.a(t04Var, this);
                if (objA != v72Var) {
                    re5Var = (re5) objA;
                    og9Var = og9.a;
                    e04Var = rg9Var.a;
                    vi9Var = rg9Var.c;
                    v24 v24Var2 = v24.a;
                    this.t = re5Var;
                    this.u = rg9Var;
                    this.v = og9Var;
                    this.w = e04Var;
                    re9Var = this.B;
                    this.x = re9Var;
                    this.y = vi9Var;
                    this.z = 3;
                    objB2 = v24Var2.b(this);
                    if (objB2 != v72Var) {
                        re9Var2 = re9Var;
                        Map map2 = (Map) objB2;
                        String str5 = re5Var.a;
                        String str6 = re5Var.b;
                        og9Var.getClass();
                        e04Var.getClass();
                        re9Var2.getClass();
                        vi9Var.getClass();
                        map2.getClass();
                        str6.getClass();
                        String str7 = re9Var2.a;
                        String str8 = re9Var2.b;
                        int i4 = re9Var2.c;
                        long j2 = re9Var2.d;
                        kh9Var = (kh9) map2.get(kh9.a.u);
                        ve2Var = ve2.COLLECTION_DISABLED;
                        ve2Var2 = ve2.COLLECTION_ENABLED;
                        ve2Var3 = ve2.COLLECTION_SDK_NOT_INSTALLED;
                        if (kh9Var == null) {
                            ve2Var4 = ve2Var3;
                        } else if (kh9Var.a()) {
                            ve2Var4 = ve2Var2;
                        } else {
                            ve2Var4 = ve2Var;
                        }
                        kh9Var2 = (kh9) map2.get(kh9.a.t);
                        if (kh9Var2 == null) {
                            ve2Var = ve2Var3;
                        } else if (kh9Var2.a()) {
                            ve2Var = ve2Var2;
                        }
                        ng9 ng9Var2 = new ng9(new yg9(str7, str8, i4, j2, new we2(ve2Var4, ve2Var, vi9Var.a()), str5, str6), og9.a(e04Var));
                        int i5 = rg9.g;
                        rg9Var.getClass();
                        rg9Var.d.a(ng9Var2);
                        Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                    }
                }
                return v72Var;
            }
            return g2b.a;
        }
    }

    public rg9(e04 e04Var, t04 t04Var, vi9 vi9Var, jm3 jm3Var, @ci0 h72 h72Var) {
        e04Var.getClass();
        t04Var.getClass();
        vi9Var.getClass();
        jm3Var.getClass();
        h72Var.getClass();
        this.a = e04Var;
        this.b = t04Var;
        this.c = vi9Var;
        this.d = jm3Var;
        this.e = h72Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r0.b(r1) == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.rg9 r6, defpackage.u02 r7) throws java.lang.Throwable {
        /*
            vi9 r0 = r6.c
            boolean r1 = r7 instanceof defpackage.sg9
            if (r1 == 0) goto L15
            r1 = r7
            sg9 r1 = (defpackage.sg9) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.v = r2
            goto L1a
        L15:
            sg9 r1 = new sg9
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r6 = r1.t
            int r7 = r1.v
            r2 = 2
            r3 = 1
            java.lang.String r4 = "FirebaseSessions"
            v72 r5 = defpackage.v72.t
            if (r7 == 0) goto L39
            if (r7 == r3) goto L35
            if (r7 != r2) goto L2e
            defpackage.dv8.b(r6)
            goto L7c
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            r6 = 0
            return r6
        L35:
            defpackage.dv8.b(r6)
            goto L47
        L39:
            defpackage.dv8.b(r6)
            v24 r6 = defpackage.v24.a
            r1.v = r3
            java.lang.Object r6 = r6.b(r1)
            if (r6 != r5) goto L47
            goto L7b
        L47:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L5d
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L5d
            goto Lb1
        L5d:
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb1
            java.lang.Object r7 = r6.next()
            kh9 r7 = (defpackage.kh9) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L61
            r1.v = r2
            java.lang.Object r6 = r0.b(r1)
            if (r6 != r5) goto L7c
        L7b:
            return r5
        L7c:
            zk9 r6 = r0.a
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L89
        L84:
            boolean r3 = r6.booleanValue()
            goto L92
        L89:
            zk9 r6 = r0.b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L92
            goto L84
        L92:
            if (r3 != 0) goto L9c
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L9c:
            double r6 = defpackage.rg9.f
            double r0 = r0.a()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 > 0) goto La9
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        La9:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lb1:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg9.b(rg9, u02):java.lang.Object");
    }

    @Override // defpackage.qg9
    public final void a(re9 re9Var) {
        oy0.d(u72.a(this.e), null, null, new a(re9Var, null), 3);
    }
}
