package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.your_gym.presentation.YourGymViewModel$saveClicked$1", f = "YourGymViewModel.kt", l = {73, 74, 75}, m = "invokeSuspend", v = 2)
public final class ssb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ tsb u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.your_gym.presentation.YourGymViewModel$saveClicked$1$1", f = "YourGymViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public final /* synthetic */ tsb t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tsb tsbVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.t = tsbVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.t, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
            return ((a) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            this.t.x.a();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            Exception exc2 = exc;
            tsb tsbVar = (tsb) this.receiver;
            int i = tsb.F;
            tsbVar.getClass();
            rma.a.b(exc2);
            tsbVar.f(new hsb.a(tsbVar.z.a(exc2)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssb(tsb tsbVar, r02<? super ssb> r02Var) {
        super(2, r02Var);
        this.u = tsbVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ssb(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ssb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r14 == r12) goto L20;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            int r0 = r13.t
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            tsb r7 = r13.u
            v72 r12 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r4) goto L20
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L16
            defpackage.dv8.b(r14)
            goto L6c
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r1
        L1c:
            defpackage.dv8.b(r14)
            goto L54
        L20:
            defpackage.dv8.b(r14)
            goto L44
        L24:
            defpackage.dv8.b(r14)
            int r14 = defpackage.tsb.F
            gsb$d r14 = gsb.d.a
            r7.e(r14)
            w3b r14 = r7.y
            el0 r0 = r7.b()
            usb r0 = (defpackage.usb) r0
            yp4 r0 = r0.c
            r13.t = r4
            r14.getClass()
            java.lang.Object r14 = defpackage.g5b.b(r14, r0, r13)
            if (r14 != r12) goto L44
            goto L6b
        L44:
            xd3 r14 = (defpackage.xd3) r14
            ssb$a r0 = new ssb$a
            r0.<init>(r7, r1)
            r13.t = r3
            java.lang.Object r14 = defpackage.yd3.b(r14, r0, r13)
            if (r14 != r12) goto L54
            goto L6b
        L54:
            xd3 r14 = (defpackage.xd3) r14
            ssb$b r5 = new ssb$b
            java.lang.String r10 = "onError(Ljava/lang/Exception;)V"
            r11 = 4
            r6 = 2
            java.lang.Class<tsb> r8 = defpackage.tsb.class
            java.lang.String r9 = "onError"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.t = r2
            java.lang.Object r14 = defpackage.yd3.a(r14, r5, r13)
            if (r14 != r12) goto L6c
        L6b:
            return r12
        L6c:
            xd3 r14 = (defpackage.xd3) r14
            r14.getClass()
            int r13 = defpackage.tsb.F
            gsb$a r13 = gsb.a.a
            r7.e(r13)
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
