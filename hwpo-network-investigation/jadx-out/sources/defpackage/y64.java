package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class y64 implements s54<Object> {
    public final /* synthetic */ ci4 t;
    public final /* synthetic */ s54 u;

    @xm2(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1", f = "Limit.kt", l = {142, 143}, m = "emit", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public int u;
        public Object w;
        public int x;

        public a(r02 r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.u |= Integer.MIN_VALUE;
            return y64.this.emit(null, this);
        }
    }

    public y64(s54 s54Var, ci4 ci4Var) {
        this.t = ci4Var;
        this.u = s54Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r7.u.emit(r8, r0) == r5) goto L23;
     */
    @Override // defpackage.s54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, defpackage.r02<? super defpackage.g2b> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof y64.a
            if (r0 == 0) goto L13
            r0 = r9
            y64$a r0 = (y64.a) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            y64$a r0 = new y64$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.t
            int r1 = r0.u
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.dv8.b(r9)
            goto L67
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r4
        L31:
            int r8 = r0.x
            java.lang.Object r1 = r0.w
            defpackage.dv8.b(r9)
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
            goto L50
        L3d:
            defpackage.dv8.b(r9)
            r0.w = r8
            r9 = 0
            r0.x = r9
            r0.u = r3
            ci4 r1 = r7.t
            java.lang.Object r1 = r1.invoke(r8, r0)
            if (r1 != r5) goto L50
            goto L66
        L50:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6a
            r0.w = r4
            r0.x = r9
            r0.u = r2
            s54 r7 = r7.u
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r5) goto L67
        L66:
            return r5
        L67:
            g2b r7 = defpackage.g2b.a
            return r7
        L6a:
            b0 r8 = new b0
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y64.emit(java.lang.Object, r02):java.lang.Object");
    }
}
