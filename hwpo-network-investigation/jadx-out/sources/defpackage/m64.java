package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class m64 implements r54<Object> {
    public final /* synthetic */ ci4 t;
    public final /* synthetic */ r54 u;

    @xm2(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {115, 119}, m = "collect", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public int u;
        public s54 w;
        public kz8 x;
        public int y;

        public a(r02 r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.u |= Integer.MIN_VALUE;
            return m64.this.collect(null, this);
        }
    }

    public m64(r54 r54Var, ci4 ci4Var) {
        this.t = ci4Var;
        this.u = r54Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r7.u.collect(r8, r0) == r5) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [u02] */
    /* JADX WARN: Type inference failed for: r1v3, types: [u02] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.r54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.s54<? super java.lang.Object> r8, defpackage.r02<? super defpackage.g2b> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof m64.a
            if (r0 == 0) goto L13
            r0 = r9
            m64$a r0 = (m64.a) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            m64$a r0 = new m64$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.t
            int r1 = r0.u
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.dv8.b(r9)
            goto L71
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r4
        L31:
            int r8 = r0.y
            kz8 r1 = r0.x
            s54 r3 = r0.w
            defpackage.dv8.b(r9)     // Catch: java.lang.Throwable -> L3d
            r6 = r8
            r8 = r3
            goto L5d
        L3d:
            r7 = move-exception
            goto L74
        L3f:
            defpackage.dv8.b(r9)
            kz8 r1 = new kz8
            h72 r9 = r0.getContext()
            r1.<init>(r8, r9)
            ci4 r9 = r7.t     // Catch: java.lang.Throwable -> L3d
            r0.w = r8     // Catch: java.lang.Throwable -> L3d
            r0.x = r1     // Catch: java.lang.Throwable -> L3d
            r6 = 0
            r0.y = r6     // Catch: java.lang.Throwable -> L3d
            r0.u = r3     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r9 = r9.invoke(r1, r0)     // Catch: java.lang.Throwable -> L3d
            if (r9 != r5) goto L5d
            goto L70
        L5d:
            r1.releaseIntercepted()
            r0.w = r4
            r0.x = r4
            r0.y = r6
            r0.u = r2
            r54 r7 = r7.u
            java.lang.Object r7 = r7.collect(r8, r0)
            if (r7 != r5) goto L71
        L70:
            return r5
        L71:
            g2b r7 = defpackage.g2b.a
            return r7
        L74:
            r1.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m64.collect(s54, r02):java.lang.Object");
    }
}
