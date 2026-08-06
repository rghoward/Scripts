package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel$attachmentsPicked$1", f = "EditPerformanceViewModel.kt", l = {372, 372}, m = "invokeSuspend", v = 2)
public final class xc3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ pc3 u;
    public final /* synthetic */ rc9 v;
    public final /* synthetic */ u60 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            pc3 pc3Var = (pc3) this.receiver;
            pc3.b bVar = pc3.Companion;
            pc3Var.k(exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc3(pc3 pc3Var, rc9 rc9Var, u60 u60Var, r02<? super xc3> r02Var) {
        super(2, r02Var);
        this.u = pc3Var;
        this.v = rc9Var;
        this.w = u60Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new xc3(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((xc3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r2, r6, r23) == r13) goto L18;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            r23 = this;
            r0 = r23
            rc9 r1 = r0.v
            android.net.Uri r2 = r1.b
            int r3 = r0.t
            r4 = 1
            r5 = 2
            pc3 r8 = r0.u
            v72 r13 = defpackage.v72.t
            if (r3 == 0) goto L26
            if (r3 == r4) goto L20
            if (r3 != r5) goto L19
            defpackage.dv8.b(r24)
            goto La2
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r0)
            r0 = 0
            return r0
        L20:
            defpackage.dv8.b(r24)
            r2 = r24
            goto L8a
        L26:
            defpackage.dv8.b(r24)
            pc3$b r3 = defpackage.pc3.Companion
            l89 r14 = new l89
            rh8$a r3 = defpackage.rh8.t
            r3.getClass()
            k2 r3 = defpackage.rh8.u
            java.util.Random r3 = r3.a()
            long r15 = r3.nextLong()
            android.content.ContentResolver r3 = r8.M
            java.lang.String r17 = defpackage.wy3.a(r3, r2)
            java.lang.String r19 = r2.toString()
            r19.getClass()
            java.lang.String r20 = r2.toString()
            r20.getClass()
            java.lang.String r21 = r2.toString()
            r21.getClass()
            java.lang.String r3 = defpackage.wy3.b(r3, r2)
            if (r3 != 0) goto L5f
            java.lang.String r3 = ""
        L5f:
            r22 = r3
            u60 r3 = r0.w
            r18 = r3
            r14.<init>(r15, r17, r18, r19, r20, r21, r22)
            pc3$a$a r3 = new pc3$a$a
            r3.<init>(r14)
            r8.e(r3)
            oz9$a r3 = new oz9$a
            java.lang.String r2 = r2.toString()
            r2.getClass()
            r3.<init>(r2)
            oz9 r2 = r8.I
            r0.t = r4
            r2.getClass()
            java.lang.Object r2 = defpackage.g5b.b(r2, r3, r0)
            if (r2 != r13) goto L8a
            goto La1
        L8a:
            xd3 r2 = (defpackage.xd3) r2
            xc3$a r6 = new xc3$a
            java.lang.String r11 = "notifyError(Ljava/lang/Exception;)V"
            r12 = 4
            r7 = 2
            java.lang.Class<pc3> r9 = defpackage.pc3.class
            java.lang.String r10 = "notifyError"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.t = r5
            java.lang.Object r0 = defpackage.yd3.a(r2, r6, r0)
            if (r0 != r13) goto La2
        La1:
            return r13
        La2:
            hy3 r0 = r1.a
            pc3$b r1 = defpackage.pc3.Companion
            int r0 = r0.ordinal()
            if (r0 == r5) goto Lb2
            r1 = 3
            if (r0 == r1) goto Lb2
            rc3 r0 = defpackage.rc3.b
            goto Lb4
        Lb2:
            qc3 r0 = defpackage.qc3.b
        Lb4:
            r8.f(r0)
            g2b r0 = defpackage.g2b.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
