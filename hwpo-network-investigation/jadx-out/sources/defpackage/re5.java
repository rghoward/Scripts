package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class re5 {
    public static final a c = new a();
    public final String a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
        
            if (r7 == r5) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [t04] */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, t04] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v18 */
        /* JADX WARN: Type inference failed for: r8v19 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(defpackage.t04 r8, defpackage.u02 r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof defpackage.qe5
                if (r0 == 0) goto L13
                r0 = r9
                qe5 r0 = (defpackage.qe5) r0
                int r1 = r0.w
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.w = r1
                goto L18
            L13:
                qe5 r0 = new qe5
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r7 = r0.u
                int r9 = r0.w
                java.lang.String r1 = "FirebaseSessions"
                r2 = 2
                r3 = 1
                java.lang.String r4 = ""
                v72 r5 = defpackage.v72.t
                if (r9 == 0) goto L45
                if (r9 == r3) goto L3b
                if (r9 != r2) goto L34
                java.lang.Object r8 = r0.t
                java.lang.String r8 = (java.lang.String) r8
                defpackage.dv8.b(r7)     // Catch: java.lang.Exception -> L32
                goto L80
            L32:
                r7 = move-exception
                goto L87
            L34:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                r7 = 0
                return r7
            L3b:
                java.lang.Object r8 = r0.t
                t04 r8 = (defpackage.t04) r8
                defpackage.dv8.b(r7)     // Catch: java.lang.Exception -> L43
                goto L5a
            L43:
                r7 = move-exception
                goto L67
            L45:
                defpackage.dv8.b(r7)
                q6d r7 = r8.a()     // Catch: java.lang.Exception -> L43
                r7.getClass()     // Catch: java.lang.Exception -> L43
                r0.t = r8     // Catch: java.lang.Exception -> L43
                r0.w = r3     // Catch: java.lang.Exception -> L43
                java.lang.Object r7 = defpackage.zf7.a(r7, r0)     // Catch: java.lang.Exception -> L43
                if (r7 != r5) goto L5a
                goto L7f
            L5a:
                te5 r7 = (defpackage.te5) r7     // Catch: java.lang.Exception -> L43
                java.lang.String r7 = r7.a()     // Catch: java.lang.Exception -> L43
                r7.getClass()     // Catch: java.lang.Exception -> L43
                r6 = r8
                r8 = r7
                r7 = r6
                goto L6e
            L67:
                java.lang.String r9 = "Error getting authentication token."
                android.util.Log.w(r1, r9, r7)
                r7 = r8
                r8 = r4
            L6e:
                q6d r7 = r7.getId()     // Catch: java.lang.Exception -> L32
                r7.getClass()     // Catch: java.lang.Exception -> L32
                r0.t = r8     // Catch: java.lang.Exception -> L32
                r0.w = r2     // Catch: java.lang.Exception -> L32
                java.lang.Object r7 = defpackage.zf7.a(r7, r0)     // Catch: java.lang.Exception -> L32
                if (r7 != r5) goto L80
            L7f:
                return r5
            L80:
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L32
                if (r7 != 0) goto L85
                goto L8c
            L85:
                r4 = r7
                goto L8c
            L87:
                java.lang.String r9 = "Error getting Firebase installation id ."
                android.util.Log.w(r1, r9, r7)
            L8c:
                re5 r7 = new re5
                r7.<init>(r4, r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: re5.a.a(t04, u02):java.lang.Object");
        }
    }

    public re5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
