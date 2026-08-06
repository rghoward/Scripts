package defpackage;

import j$.net.URLEncoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.onboarding.presentation.sign_in.SignInViewModel$onSignInBtnClick$1", f = "SignInViewModel.kt", l = {111, 112, 115, 121}, m = "invokeSuspend", v = 2)
public final class yo9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qo9 u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.sign_in.SignInViewModel$onSignInBtnClick$1$1", f = "SignInViewModel.kt", l = {113}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<ha0, r02<? super xd3<? extends Exception, ? extends ha0>>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ qo9 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qo9 qo9Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = qo9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(ha0 ha0Var, r02<? super xd3<? extends Exception, ? extends ha0>> r02Var) {
            return ((a) create(ha0Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            ha0 ha0Var = (ha0) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                ww1 ww1Var = this.v.D;
                g2b g2bVar = g2b.a;
                this.u = ha0Var;
                this.t = 1;
                ww1Var.getClass();
                Object objB = g5b.b(ww1Var, g2bVar, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return new xd3.b(ha0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.sign_in.SignInViewModel$onSignInBtnClick$1$2", f = "SignInViewModel.kt", l = {118}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<ha0, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ qo9 v;
        public final /* synthetic */ String w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qo9 qo9Var, String str, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = qo9Var;
            this.w = str;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.v, this.w, r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(ha0 ha0Var, r02<? super g2b> r02Var) {
            return ((b) create(ha0Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            ha0 ha0Var = (ha0) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                boolean z = ha0Var instanceof ha0.b;
                qo9 qo9Var = this.v;
                if (z) {
                    qo9Var.E.getClass();
                    qo9Var.f(new ro9(ct1.a("https://app.hwpotraining.com/confirmation?email=", URLEncoder.encode(this.w, "UTF-8"))));
                } else {
                    if (!(ha0Var instanceof ha0.a)) {
                        u.b();
                        return null;
                    }
                    h5b h5bVar = ((ha0.a) ha0Var).a;
                    this.u = null;
                    this.t = 1;
                    Object objG = qo9.g(qo9Var, h5bVar, this);
                    v72 v72Var = v72.t;
                    if (objG == v72Var) {
                        return v72Var;
                    }
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
    public static final /* synthetic */ class c extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            qo9 qo9Var = (qo9) this.receiver;
            int i = qo9.H;
            qo9Var.i(exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo9(qo9 qo9Var, String str, String str2, r02<? super yo9> r02Var) {
        super(2, r02Var);
        this.u = qo9Var;
        this.v = str;
        this.w = str2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new yo9(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((yo9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006c A[PHI: r15
      0x006c: PHI (r15v11 java.lang.Object) = (r15v10 java.lang.Object), (r15v0 java.lang.Object) binds: [B:21:0x0069, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r15 == r13) goto L25;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            int r0 = r14.t
            java.lang.String r1 = r14.v
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            qo9 r8 = r14.u
            r6 = 0
            v72 r13 = defpackage.v72.t
            if (r0 == 0) goto L2d
            if (r0 == r5) goto L29
            if (r0 == r4) goto L25
            if (r0 == r3) goto L21
            if (r0 != r2) goto L1b
            defpackage.dv8.b(r15)
            goto L84
        L1b:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r14)
            return r6
        L21:
            defpackage.dv8.b(r15)
            goto L6c
        L25:
            defpackage.dv8.b(r15)
            goto L5c
        L29:
            defpackage.dv8.b(r15)
            goto L4c
        L2d:
            defpackage.dv8.b(r15)
            int r15 = defpackage.qo9.H
            qo9$a$b r15 = qo9.a.b.a
            r8.e(r15)
            oo9$a r15 = new oo9$a
            java.lang.String r0 = r14.w
            r15.<init>(r1, r0)
            oo9 r0 = r8.A
            r14.t = r5
            r0.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r0, r15, r14)
            if (r15 != r13) goto L4c
            goto L83
        L4c:
            xd3 r15 = (defpackage.xd3) r15
            yo9$a r0 = new yo9$a
            r0.<init>(r8, r6)
            r14.t = r4
            java.lang.Object r15 = defpackage.yd3.d(r15, r0, r14)
            if (r15 != r13) goto L5c
            goto L83
        L5c:
            xd3 r15 = (defpackage.xd3) r15
            yo9$b r0 = new yo9$b
            r0.<init>(r8, r1, r6)
            r14.t = r3
            java.lang.Object r15 = defpackage.yd3.b(r15, r0, r14)
            if (r15 != r13) goto L6c
            goto L83
        L6c:
            xd3 r15 = (defpackage.xd3) r15
            yo9$c r6 = new yo9$c
            java.lang.String r11 = "onError(Ljava/lang/Exception;)V"
            r12 = 4
            r7 = 2
            java.lang.Class<qo9> r9 = defpackage.qo9.class
            java.lang.String r10 = "onError"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14.t = r2
            java.lang.Object r15 = defpackage.yd3.a(r15, r6, r14)
            if (r15 != r13) goto L84
        L83:
            return r13
        L84:
            xd3 r15 = (defpackage.xd3) r15
            r15.getClass()
            int r14 = defpackage.qo9.H
            qo9$a$a r14 = qo9.a.C0228a.a
            r8.e(r14)
            g2b r14 = defpackage.g2b.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
