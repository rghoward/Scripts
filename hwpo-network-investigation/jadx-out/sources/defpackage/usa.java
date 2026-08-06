package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class usa implements tsa {
    public final de9 a;
    public final am9 b;
    public final v91 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.data.storage.TrackingActionsStorageImpl$actions$1", f = "TrackingActionsStorageImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<ua8<? super rsa>, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;

        /* JADX INFO: renamed from: usa$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "com.hwpo_training_app.tracking.data.storage.TrackingActionsStorageImpl$actions$1$1", f = "TrackingActionsStorageImpl.kt", l = {30}, m = "invokeSuspend", v = 2)
        public static final class C0268a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ usa u;
            public final /* synthetic */ ua8<rsa> v;

            /* JADX INFO: renamed from: usa$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "com.hwpo_training_app.tracking.data.storage.TrackingActionsStorageImpl$actions$1$1$1", f = "TrackingActionsStorageImpl.kt", l = {29}, m = "invokeSuspend", v = 2)
            public static final class C0269a extends p6a implements ci4<gya<? extends Integer, ? extends Boolean, ? extends Boolean>, r02<? super g2b>, Object> {
                public int t;
                public /* synthetic */ Object u;
                public final /* synthetic */ ua8<rsa> v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0269a(ua8<? super rsa> ua8Var, r02<? super C0269a> r02Var) {
                    super(2, r02Var);
                    this.v = ua8Var;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    C0269a c0269a = new C0269a(this.v, r02Var);
                    c0269a.u = obj;
                    return c0269a;
                }

                @Override // defpackage.ci4
                public final Object invoke(gya<? extends Integer, ? extends Boolean, ? extends Boolean> gyaVar, r02<? super g2b> r02Var) {
                    return ((C0269a) create(gyaVar, r02Var)).invokeSuspend(g2b.a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    gya gyaVar = (gya) this.u;
                    int i = this.t;
                    if (i == 0) {
                        dv8.b(obj);
                        boolean zBooleanValue = ((Boolean) gyaVar.u).booleanValue();
                        ebb ebbVar = ebb.CHALLENGES;
                        Object aVar = zBooleanValue ? new rsa.a(ebbVar) : new rsa.b(ebbVar);
                        this.u = null;
                        this.t = 1;
                        Object objA = this.v.a(this, aVar);
                        v72 v72Var = v72.t;
                        if (objA == v72Var) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0268a(usa usaVar, ua8<? super rsa> ua8Var, r02<? super C0268a> r02Var) {
                super(2, r02Var);
                this.u = usaVar;
                this.v = ua8Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C0268a(this.u, this.v, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C0268a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type r02 to usa$a$a for r4v7 'this'  r02
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.ak0
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    int r0 = r4.t
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L12
                    if (r0 != r2) goto Lc
                    defpackage.dv8.b(r5)
                    goto L40
                Lc:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.aa0.c(r4)
                    return r1
                L12:
                    defpackage.dv8.b(r5)
                    usa r5 = r4.u
                    de9 r5 = r5.a
                    ji8 r5 = r5.b
                    usa$a$a$a r0 = new usa$a$a$a
                    ua8<rsa> r3 = r4.v
                    r0.<init>(r3, r1)
                    r4.t = r2
                    k74$a r1 = new k74$a
                    jc7 r2 = defpackage.jc7.t
                    r1.<init>(r2, r0)
                    zl9<T> r5 = r5.t
                    java.lang.Object r4 = r5.collect(r1, r4)
                    v72 r5 = defpackage.v72.t
                    if (r4 != r5) goto L36
                    goto L38
                L36:
                    g2b r4 = defpackage.g2b.a
                L38:
                    if (r4 != r5) goto L3b
                    goto L3d
                L3b:
                    g2b r4 = defpackage.g2b.a
                L3d:
                    if (r4 != r5) goto L40
                    return r5
                L40:
                    g2b r4 = defpackage.g2b.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: usa.a.C0268a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "com.hwpo_training_app.tracking.data.storage.TrackingActionsStorageImpl$actions$1$2", f = "TrackingActionsStorageImpl.kt", l = {32}, m = "invokeSuspend", v = 2)
        public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ usa u;
            public final /* synthetic */ ua8<rsa> v;

            /* JADX INFO: renamed from: usa$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "com.hwpo_training_app.tracking.data.storage.TrackingActionsStorageImpl$actions$1$2$1", f = "TrackingActionsStorageImpl.kt", l = {32}, m = "invokeSuspend", v = 2)
            public static final class C0270a extends p6a implements ci4<rsa, r02<? super g2b>, Object> {
                public int t;
                public /* synthetic */ Object u;
                public final /* synthetic */ ua8<rsa> v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0270a(ua8<? super rsa> ua8Var, r02<? super C0270a> r02Var) {
                    super(2, r02Var);
                    this.v = ua8Var;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    C0270a c0270a = new C0270a(this.v, r02Var);
                    c0270a.u = obj;
                    return c0270a;
                }

                @Override // defpackage.ci4
                public final Object invoke(rsa rsaVar, r02<? super g2b> r02Var) {
                    return ((C0270a) create(rsaVar, r02Var)).invokeSuspend(g2b.a);
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    rsa rsaVar = (rsa) this.u;
                    int i = this.t;
                    if (i == 0) {
                        dv8.b(obj);
                        this.u = null;
                        this.t = 1;
                        Object objA = this.v.a(this, rsaVar);
                        v72 v72Var = v72.t;
                        if (objA == v72Var) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(usa usaVar, ua8<? super rsa> ua8Var, r02<? super b> r02Var) {
                super(2, r02Var);
                this.u = usaVar;
                this.v = ua8Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new b(this.u, this.v, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i != 0) {
                    if (i == 1) {
                        dv8.b(obj);
                        return g2b.a;
                    }
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                am9 am9Var = this.u.b;
                C0270a c0270a = new C0270a(this.v, null);
                this.t = 1;
                am9Var.collect(new k74.a(jc7.t, c0270a), this);
                return v72.t;
            }
        }

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = usa.this.new a(r02Var);
            aVar.t = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(ua8<? super rsa> ua8Var, r02<? super g2b> r02Var) {
            return ((a) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            ua8 ua8Var = (ua8) this.t;
            dv8.b(obj);
            usa usaVar = usa.this;
            oy0.d(ua8Var, null, null, new C0268a(usaVar, ua8Var, null), 3);
            oy0.d(ua8Var, null, null, new b(usaVar, ua8Var, null), 3);
            return g2b.a;
        }
    }

    public usa(de9 de9Var) {
        de9Var.getClass();
        this.a = de9Var;
        this.b = ty1.b(7, null);
        this.c = new v91(new a(null), ff3.t, -2, xx0.t);
    }

    @Override // defpackage.tsa
    public final v91 a() {
        return this.c;
    }

    @Override // defpackage.tsa
    public final Object b(rsa rsaVar, p68 p68Var) throws Throwable {
        Object objEmit = this.b.emit(rsaVar, p68Var);
        return objEmit == v72.t ? objEmit : g2b.a;
    }
}
