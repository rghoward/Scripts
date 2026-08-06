package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o64 implements r54<Object> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ om9.a.C0214a u;

    @xm2(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {112, 113}, m = "collect", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public int u;
        public s54 w;
        public int x;

        public a(r02 r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.u |= Integer.MIN_VALUE;
            return o64.this.collect(null, this);
        }
    }

    public o64(r54 r54Var, om9.a.C0214a c0214a) {
        this.t = r54Var;
        this.u = c0214a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r7.u.invoke(r8, r1, r0) == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.s54<? super java.lang.Object> r8, defpackage.r02<? super defpackage.g2b> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o64.a
            if (r0 == 0) goto L13
            r0 = r9
            o64$a r0 = (o64.a) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            o64$a r0 = new o64$a
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
            goto L63
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r4
        L31:
            int r8 = r0.x
            s54 r1 = r0.w
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
            r54 r1 = r7.t
            java.io.Serializable r1 = defpackage.yk2.e(r1, r8, r0)
            if (r1 != r5) goto L50
            goto L62
        L50:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L63
            r0.w = r4
            r0.x = r9
            r0.u = r2
            om9$a$a r7 = r7.u
            java.lang.Object r7 = r7.invoke(r8, r1, r0)
            if (r7 != r5) goto L63
        L62:
            return r5
        L63:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o64.collect(s54, r02):java.lang.Object");
    }
}
