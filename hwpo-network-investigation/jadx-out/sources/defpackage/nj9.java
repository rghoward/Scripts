package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$getProgramDetails$1", f = "SessionsViewModel.kt", l = {153, 156, 160, 161, 165}, m = "invokeSuspend", v = 2)
public final class nj9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ lj9 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$getProgramDetails$1$1", f = "SessionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<sc8, r02<? super xd3<? extends Exception, ? extends bc8>>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ lj9 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lj9 lj9Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = lj9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.u, r02Var);
            aVar.t = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(sc8 sc8Var, r02<? super xd3<? extends Exception, ? extends bc8>> r02Var) {
            return ((a) create(sc8Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            sc8 sc8Var = (sc8) this.t;
            dv8.b(obj);
            return new xd3.b(rc8.b(sc8Var, this.u.H));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$getProgramDetails$1$2", f = "SessionsViewModel.kt", l = {164}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<bc8, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ lj9 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lj9 lj9Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = lj9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.v, r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(bc8 bc8Var, r02<? super g2b> r02Var) {
            return ((b) create(bc8Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            bc8 bc8Var = (bc8) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                lj9.a aVar = lj9.Companion;
                lj9 lj9Var = this.v;
                boolean z = lj9Var.b().b.isEmpty() && !bc8Var.A.isEmpty();
                boolean z2 = lj9Var.J instanceof xi9.b;
                if (z && z2) {
                    lj9Var.f(new vh9());
                }
                if (lj9Var.K) {
                    lj9Var.m(bc8Var);
                }
                this.u = null;
                this.t = 1;
                Object objG = lj9.g(lj9Var, bc8Var, this);
                v72 v72Var = v72.t;
                if (objG == v72Var) {
                    return v72Var;
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
    @xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$getProgramDetails$1$3", f = "SessionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public final /* synthetic */ lj9 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(lj9 lj9Var, r02<? super c> r02Var) {
            super(2, r02Var);
            this.t = lj9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new c(this.t, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            return ((c) create(exc, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            kj9.a aVar = kj9.a.a;
            lj9.a aVar2 = lj9.Companion;
            this.t.e(aVar);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj9(lj9 lj9Var, r02<? super nj9> r02Var) {
        super(2, r02Var);
        this.u = lj9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new nj9(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((nj9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b A[PHI: r10
      0x009b: PHI (r10v19 java.lang.Object) = (r10v18 java.lang.Object), (r10v0 java.lang.Object) binds: [B:32:0x0098, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r10 == r8) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r10 == r8) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (r10 == r8) goto L36;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.t
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            lj9 r7 = r9.u
            v72 r8 = defpackage.v72.t
            if (r0 == 0) goto L34
            if (r0 == r5) goto L30
            if (r0 == r4) goto L2c
            if (r0 == r3) goto L28
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1d
            defpackage.dv8.b(r10)
            goto Lab
        L1d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r9)
            return r6
        L23:
            defpackage.dv8.b(r10)
            goto L9b
        L28:
            defpackage.dv8.b(r10)
            goto L8b
        L2c:
            defpackage.dv8.b(r10)
            goto L7b
        L30:
            defpackage.dv8.b(r10)
            goto L5b
        L34:
            defpackage.dv8.b(r10)
            kj9$g r10 = kj9.g.a
            lj9$a r0 = defpackage.lj9.Companion
            r7.e(r10)
            xi9 r10 = r7.J
            boolean r0 = r10 instanceof xi9.b
            if (r0 == 0) goto L5e
            al4 r0 = r7.A
            xi9$b r10 = (xi9.b) r10
            int r10 = r10.t
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r10)
            r9.t = r5
            r0.getClass()
            java.lang.Object r10 = defpackage.g5b.b(r0, r4, r9)
            if (r10 != r8) goto L5b
            goto Laa
        L5b:
            xd3 r10 = (defpackage.xd3) r10
            goto L7d
        L5e:
            boolean r0 = r10 instanceof xi9.a
            if (r0 == 0) goto Lba
            zk4$a r0 = new zk4$a
            xi9$a r10 = (xi9.a) r10
            j$.time.LocalDate r5 = r10.u
            int r10 = r10.t
            r0.<init>(r10, r5)
            zk4 r10 = r7.E
            r9.t = r4
            r10.getClass()
            java.lang.Object r10 = defpackage.g5b.b(r10, r0, r9)
            if (r10 != r8) goto L7b
            goto Laa
        L7b:
            xd3 r10 = (defpackage.xd3) r10
        L7d:
            nj9$a r0 = new nj9$a
            r0.<init>(r7, r6)
            r9.t = r3
            java.lang.Object r10 = defpackage.yd3.d(r10, r0, r9)
            if (r10 != r8) goto L8b
            goto Laa
        L8b:
            xd3 r10 = (defpackage.xd3) r10
            nj9$b r0 = new nj9$b
            r0.<init>(r7, r6)
            r9.t = r2
            java.lang.Object r10 = defpackage.yd3.b(r10, r0, r9)
            if (r10 != r8) goto L9b
            goto Laa
        L9b:
            xd3 r10 = (defpackage.xd3) r10
            nj9$c r0 = new nj9$c
            r0.<init>(r7, r6)
            r9.t = r1
            java.lang.Object r10 = defpackage.yd3.a(r10, r0, r9)
            if (r10 != r8) goto Lab
        Laa:
            return r8
        Lab:
            xd3 r10 = (defpackage.xd3) r10
            r10.getClass()
            kj9$b r9 = kj9.b.a
            lj9$a r10 = defpackage.lj9.Companion
            r7.e(r9)
            g2b r9 = defpackage.g2b.a
            return r9
        Lba:
            defpackage.u.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
