package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel$onUploadingActionClick$1", f = "EditPerformanceViewModel.kt", l = {348, 348, 353, 353}, m = "invokeSuspend", v = 2)
public final class gd3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ l89 u;
    public final /* synthetic */ pc3 v;

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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            pc3 pc3Var = (pc3) this.receiver;
            pc3.b bVar = pc3.Companion;
            pc3Var.k(exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd3(l89 l89Var, pc3 pc3Var, r02<? super gd3> r02Var) {
        super(2, r02Var);
        this.u = l89Var;
        this.v = pc3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new gd3(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((gd3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r12, r1, r11) == r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r12, r1, r11) == r10) goto L29;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.t
            pc3 r3 = r11.v
            r8 = 4
            r1 = 3
            r9 = 2
            r2 = 1
            v72 r10 = defpackage.v72.t
            if (r0 == 0) goto L28
            if (r0 == r2) goto L24
            if (r0 == r9) goto L14
            if (r0 == r1) goto L20
            if (r0 != r8) goto L19
        L14:
            defpackage.dv8.b(r12)
            goto L94
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r11)
            r11 = 0
            return r11
        L20:
            defpackage.dv8.b(r12)
            goto L51
        L24:
            defpackage.dv8.b(r12)
            goto L7c
        L28:
            defpackage.dv8.b(r12)
            l89 r12 = r11.u
            z60 r0 = r12.E
            java.lang.String r12 = r12.w
            int r0 = r0.ordinal()
            if (r0 == 0) goto L69
            if (r0 == r2) goto L69
            if (r0 == r9) goto L3e
            g2b r11 = defpackage.g2b.a
            goto L94
        L3e:
            ov8$a r0 = new ov8$a
            r0.<init>(r12)
            ov8 r12 = r3.K
            r11.t = r1
            r12.getClass()
            java.lang.Object r12 = defpackage.g5b.b(r12, r0, r11)
            if (r12 != r10) goto L51
            goto L93
        L51:
            xd3 r12 = (defpackage.xd3) r12
            gd3$b r1 = new gd3$b
            java.lang.String r6 = "notifyError(Ljava/lang/Exception;)V"
            r7 = 4
            r2 = 2
            java.lang.Class<pc3> r4 = defpackage.pc3.class
            java.lang.String r5 = "notifyError"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.t = r8
            java.lang.Object r11 = defpackage.yd3.a(r12, r1, r11)
            if (r11 != r10) goto L94
            goto L93
        L69:
            s31$a r0 = new s31$a
            r0.<init>(r12)
            s31 r12 = r3.J
            r11.t = r2
            r12.getClass()
            java.lang.Object r12 = defpackage.g5b.b(r12, r0, r11)
            if (r12 != r10) goto L7c
            goto L93
        L7c:
            xd3 r12 = (defpackage.xd3) r12
            gd3$a r1 = new gd3$a
            java.lang.String r6 = "notifyError(Ljava/lang/Exception;)V"
            r7 = 4
            r2 = 2
            java.lang.Class<pc3> r4 = defpackage.pc3.class
            java.lang.String r5 = "notifyError"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.t = r9
            java.lang.Object r11 = defpackage.yd3.a(r12, r1, r11)
            if (r11 != r10) goto L94
        L93:
            return r10
        L94:
            g2b r11 = defpackage.g2b.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
