package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide1.presentation.OnboardingSettingsFirstPageViewModel$updateAccountSettings$1", f = "OnboardingSettingsFirstPageViewModel.kt", l = {141, 142, 147, 155, 159}, m = "invokeSuspend", v = 2)
public final class ej7 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ fj7 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide1.presentation.OnboardingSettingsFirstPageViewModel$updateAccountSettings$1$1", f = "OnboardingSettingsFirstPageViewModel.kt", l = {143}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<z3b, r02<? super xd3<? extends Exception, ? extends js7<? extends Boolean, ? extends Boolean>>>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ fj7 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fj7 fj7Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = fj7Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(z3b z3bVar, r02<? super xd3<? extends Exception, ? extends js7<? extends Boolean, ? extends Boolean>>> r02Var) {
            return ((a) create(z3bVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            z3b z3bVar = (z3b) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                ju3 ju3Var = this.v.C;
                g2b g2bVar = g2b.a;
                this.u = z3bVar;
                this.t = 1;
                ju3Var.getClass();
                obj = g5b.b(ju3Var, g2bVar, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            xd3 xd3Var = (xd3) obj;
            xd3Var.getClass();
            return xd3Var instanceof xd3.a ? (xd3.a) xd3Var : new xd3.b(new js7(yd3.f(xd3Var), Boolean.valueOf(z3bVar.a)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide1.presentation.OnboardingSettingsFirstPageViewModel$updateAccountSettings$1$2", f = "OnboardingSettingsFirstPageViewModel.kt", l = {152}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<js7<? extends Boolean, ? extends Boolean>, r02<? super xd3<? extends Exception, ? extends js7<? extends Boolean, ? extends Boolean>>>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ fj7 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fj7 fj7Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = fj7Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.v, r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(js7<? extends Boolean, ? extends Boolean> js7Var, r02<? super xd3<? extends Exception, ? extends js7<? extends Boolean, ? extends Boolean>>> r02Var) {
            return ((b) create(js7Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            js7 js7Var = (js7) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                boolean zBooleanValue = ((Boolean) js7Var.u).booleanValue();
                int i2 = fj7.K;
                fj7 fj7Var = this.v;
                s10 s10Var = fj7Var.b().f;
                if (s10Var == null) {
                    return new xd3.a(new IllegalArgumentException("selectedLanguage = null"));
                }
                if (!zBooleanValue) {
                    return new xd3.b(js7Var);
                }
                yj9 yj9Var = fj7Var.B;
                this.u = js7Var;
                this.t = 1;
                yj9Var.getClass();
                obj = g5b.b(yj9Var, s10Var, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            xd3 xd3Var = (xd3) obj;
            xd3Var.getClass();
            yd3.c cVar = new yd3.c(xd3Var);
            if (xd3Var instanceof xd3.a) {
                return new xd3.a(((xd3.a) xd3Var).a);
            }
            if (xd3Var instanceof xd3.b) {
                return (xd3) cVar.invoke(js7Var);
            }
            u.b();
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide1.presentation.OnboardingSettingsFirstPageViewModel$updateAccountSettings$1$3", f = "OnboardingSettingsFirstPageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ci4<js7<? extends Boolean, ? extends Boolean>, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ fj7 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fj7 fj7Var, r02<? super c> r02Var) {
            super(2, r02Var);
            this.u = fj7Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            c cVar = new c(this.u, r02Var);
            cVar.t = obj;
            return cVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(js7<? extends Boolean, ? extends Boolean> js7Var, r02<? super g2b> r02Var) {
            return ((c) create(js7Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            js7 js7Var = (js7) this.t;
            dv8.b(obj);
            boolean zBooleanValue = ((Boolean) js7Var.t).booleanValue();
            boolean zBooleanValue2 = ((Boolean) js7Var.u).booleanValue();
            int i = fj7.K;
            fj7 fj7Var = this.u;
            oy0.d(rhb.b(fj7Var), null, null, new dj7(zBooleanValue2, zBooleanValue, fj7Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            fj7.g((fj7) this.receiver, exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej7(fj7 fj7Var, r02<? super ej7> r02Var) {
        super(2, r02Var);
        this.u = fj7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ej7(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ej7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e2 A[PHI: r1
      0x00e2: PHI (r1v31 java.lang.Object) = (r1v30 java.lang.Object), (r1v38 java.lang.Object) binds: [B:49:0x00df, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2 A[PHI: r1
      0x00f2: PHI (r1v34 java.lang.Object) = (r1v33 java.lang.Object), (r1v39 java.lang.Object) binds: [B:52:0x00ef, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        if (r0 == r14) goto L56;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
