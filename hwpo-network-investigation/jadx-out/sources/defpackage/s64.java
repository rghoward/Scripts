package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s64 implements r54<Object> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ r64 u;

    @xm2(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {116, 118}, m = "collect", v = 1)
    public static final class a extends u02 {
        public long A;
        public /* synthetic */ Object t;
        public int u;
        public s54 w;
        public Throwable x;
        public int y;
        public int z;

        public a(r02 r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.u |= Integer.MIN_VALUE;
            return s64.this.collect(null, this);
        }
    }

    public s64(r54 r54Var, r64 r64Var) {
        this.t = r54Var;
        this.u = r64Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092 A[PHI: r0 r7 r9 r14 r15
      0x0092: PHI (r0v5 s64$a) = (r0v3 s64$a), (r0v8 s64$a) binds: [B:22:0x006a, B:28:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r7v3 long) = (r7v1 long), (r7v5 long) binds: [B:22:0x006a, B:28:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r9v2 s54<? super java.lang.Object>) = (r9v0 s54<? super java.lang.Object>), (r9v3 s54<? super java.lang.Object>) binds: [B:22:0x006a, B:28:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r14v4 int) = (r14v1 int), (r14v6 int) binds: [B:22:0x006a, B:28:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r15v8 int) = (r15v3 int), (r15v13 int) binds: [B:22:0x006a, B:28:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006a -> B:29:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0083 -> B:26:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r54
    public final java.lang.Object collect(defpackage.s54<? super java.lang.Object> r14, defpackage.r02<? super defpackage.g2b> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof s64.a
            if (r0 == 0) goto L13
            r0 = r15
            s64$a r0 = (s64.a) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            s64$a r0 = new s64$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.t
            int r1 = r0.u
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            v72 r6 = defpackage.v72.t
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L34
            long r7 = r0.A
            int r14 = r0.y
            java.lang.Throwable r1 = r0.x
            s54 r9 = r0.w
            defpackage.dv8.b(r15)
            goto L86
        L34:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r5
        L3a:
            int r14 = r0.z
            long r7 = r0.A
            int r1 = r0.y
            s54 r9 = r0.w
            defpackage.dv8.b(r15)
            r12 = r15
            r15 = r14
            r14 = r1
            r1 = r12
            goto L68
        L4a:
            defpackage.dv8.b(r15)
            r7 = 0
            r15 = r2
        L50:
            r0.w = r14
            r0.x = r5
            r0.y = r15
            r0.A = r7
            r0.z = r2
            r0.u = r4
            r54 r1 = r13.t
            java.io.Serializable r1 = defpackage.yk2.e(r1, r14, r0)
            if (r1 != r6) goto L65
            goto L85
        L65:
            r9 = r14
            r14 = r15
            r15 = r2
        L68:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L92
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r7)
            r0.w = r9
            r0.x = r1
            r0.y = r14
            r0.A = r7
            r0.z = r15
            r0.u = r3
            r64 r15 = r13.u
            java.lang.Object r15 = r15.invoke(r9, r1, r10, r0)
            if (r15 != r6) goto L86
        L85:
            return r6
        L86:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L96
            r10 = 1
            long r7 = r7 + r10
            r15 = r4
        L92:
            r1 = r0
            r0 = r14
            r14 = r9
            goto L97
        L96:
            throw r1
        L97:
            if (r15 != 0) goto L9c
            g2b r13 = defpackage.g2b.a
            return r13
        L9c:
            r15 = r0
            r0 = r1
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s64.collect(s54, r02):java.lang.Object");
    }
}
