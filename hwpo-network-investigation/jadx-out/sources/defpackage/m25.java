package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel$navigateToNeededScreen$1", f = "HostActivityViewModel.kt", l = {126, 126}, m = "invokeSuspend", v = 2)
public final class m25 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e25 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ String w;
    public final /* synthetic */ ki7 x;
    public final /* synthetic */ id7 y;
    public final /* synthetic */ boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel$navigateToNeededScreen$1$1", f = "HostActivityViewModel.kt", l = {132}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<String, r02<? super xd3<? extends Exception, ? extends String>>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ e25 v;
        public final /* synthetic */ boolean w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e25 e25Var, boolean z, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = e25Var;
            this.w = z;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, this.w, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(String str, r02<? super xd3<? extends Exception, ? extends String>> r02Var) {
            return ((a) create(str, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                xz7 xz7Var = this.w ? xz7.u : xz7.v;
                e25 e25Var = this.v;
                e25Var.R = xz7Var;
                if (str == null || str.length() == 0) {
                    return new xd3.b(null);
                }
                y3b y3bVar = e25Var.I;
                g2b g2bVar = g2b.a;
                this.u = str;
                this.t = 1;
                y3bVar.getClass();
                obj = g5b.b(y3bVar, g2bVar, this);
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
            if (yd3.e((xd3) obj, null) == null) {
                str = null;
            }
            return new xd3.b(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            e25 e25Var = (e25) this.receiver;
            int i = e25.T;
            e25Var.getClass();
            rma.a.b(exc2);
            e25Var.f(new b25(e25Var.P.a(exc2)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m25(e25 e25Var, boolean z, String str, ki7 ki7Var, id7 id7Var, boolean z2, r02<? super m25> r02Var) {
        super(2, r02Var);
        this.u = e25Var;
        this.v = z;
        this.w = str;
        this.x = ki7Var;
        this.y = id7Var;
        this.z = z2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new m25(this.u, this.v, this.w, this.x, this.y, this.z, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((m25) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r13 == r4) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.t
            r1 = 0
            r2 = 2
            r3 = 1
            e25 r6 = r12.u
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.dv8.b(r13)
            goto L49
        L13:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            return r1
        L19:
            defpackage.dv8.b(r13)
            goto L37
        L1d:
            defpackage.dv8.b(r13)
            e25$b$b r13 = e25.b.C0075b.a
            int r0 = defpackage.e25.T
            r6.e(r13)
            ol4 r13 = r6.D
            g2b r0 = defpackage.g2b.a
            r12.t = r3
            r13.getClass()
            java.lang.Object r13 = defpackage.g5b.b(r13, r0, r12)
            if (r13 != r4) goto L37
            goto L48
        L37:
            xd3 r13 = (defpackage.xd3) r13
            m25$a r0 = new m25$a
            boolean r3 = r12.v
            r0.<init>(r6, r3, r1)
            r12.t = r2
            java.lang.Object r13 = defpackage.yd3.d(r13, r0, r12)
            if (r13 != r4) goto L49
        L48:
            return r4
        L49:
            xd3 r13 = (defpackage.xd3) r13
            r13.getClass()
            e25$b$a r0 = e25.b.a.a
            int r2 = defpackage.e25.T
            r6.e(r0)
            g2b r0 = defpackage.g2b.a
            m25$b r4 = new m25$b
            java.lang.String r9 = "onError(Ljava/lang/Exception;)V"
            r10 = 0
            r5 = 1
            java.lang.Class<e25> r7 = defpackage.e25.class
            java.lang.String r8 = "onError"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            boolean r0 = r13 instanceof xd3.a
            if (r0 == 0) goto L70
            xd3$a r13 = (xd3.a) r13
            L r12 = r13.a
            r4.invoke(r12)
            goto L96
        L70:
            boolean r0 = r13 instanceof xd3.b
            if (r0 == 0) goto L99
            xd3$b r13 = (xd3.b) r13
            R r13 = r13.a
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
            int r13 = defpackage.e25.T
            r6.getClass()
            eg1 r13 = defpackage.rhb.b(r6)
            r25 r4 = new r25
            r11 = 0
            java.lang.String r7 = r12.w
            id7 r8 = r12.y
            boolean r9 = r12.z
            ki7 r10 = r12.x
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12 = 3
            defpackage.oy0.d(r13, r1, r1, r4, r12)
        L96:
            g2b r12 = defpackage.g2b.a
            return r12
        L99:
            defpackage.u.b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m25.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
