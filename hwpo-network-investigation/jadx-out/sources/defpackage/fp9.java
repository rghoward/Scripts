package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fp9 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {46}, m = "invokeSuspend", v = 1)
    public static final class a<T> extends p6a implements ci4<s54<? super T>, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ ci4<np9<T>, r02<? super g2b>, Object> v;

        /* JADX INFO: renamed from: fp9$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {62, 63}, m = "invokeSuspend", v = 1)
        public static final class C0091a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public ca1 t;
            public int u;
            public /* synthetic */ Object v;
            public final /* synthetic */ s54<T> w;
            public final /* synthetic */ ci4<np9<T>, r02<? super g2b>, Object> x;

            /* JADX INFO: renamed from: fp9$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", l = {52}, m = "invokeSuspend", v = 1)
            public static final class C0092a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                public int t;
                public final /* synthetic */ zx0 u;
                public final /* synthetic */ ci4<np9<T>, r02<? super g2b>, Object> v;

                /* JADX INFO: renamed from: fp9$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                @xm2(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", l = {55}, m = "invokeSuspend", v = 1)
                public static final class C0093a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                    public int t;
                    public /* synthetic */ Object u;
                    public final /* synthetic */ zx0 v;
                    public final /* synthetic */ ci4<np9<T>, r02<? super g2b>, Object> w;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0093a(zx0 zx0Var, ci4 ci4Var, r02 r02Var) {
                        super(2, r02Var);
                        this.v = zx0Var;
                        this.w = ci4Var;
                    }

                    @Override // defpackage.ak0
                    public final r02<g2b> create(Object obj, r02<?> r02Var) {
                        C0093a c0093a = new C0093a(this.v, this.w, r02Var);
                        c0093a.u = obj;
                        return c0093a;
                    }

                    @Override // defpackage.ci4
                    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                        return ((C0093a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                    }

                    @Override // defpackage.ak0
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        int i = this.t;
                        if (i == 0) {
                            dv8.b(obj);
                            op9 op9Var = new op9((t72) this.u, this.v);
                            this.t = 1;
                            Object objInvoke = this.w.invoke(op9Var, this);
                            v72 v72Var = v72.t;
                            if (objInvoke == v72Var) {
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
                public C0092a(zx0 zx0Var, ci4 ci4Var, r02 r02Var) {
                    super(2, r02Var);
                    this.u = zx0Var;
                    this.v = ci4Var;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    return new C0092a(this.u, this.v, r02Var);
                }

                @Override // defpackage.ci4
                public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                    return ((C0092a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = this.t;
                    zx0 zx0Var = this.u;
                    try {
                        if (i == 0) {
                            dv8.b(obj);
                            C0093a c0093a = new C0093a(zx0Var, this.v, null);
                            this.t = 1;
                            Object objD = u72.d(c0093a, this);
                            v72 v72Var = v72.t;
                            if (objD == v72Var) {
                                return v72Var;
                            }
                        } else {
                            if (i != 1) {
                                aa0.c("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            dv8.b(obj);
                        }
                        zx0Var.g(null);
                    } catch (Throwable th) {
                        zx0Var.p(th, false);
                    }
                    return g2b.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0091a(s54<? super T> s54Var, ci4<? super np9<T>, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super C0091a> r02Var) {
                super(2, r02Var);
                this.w = s54Var;
                this.x = ci4Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C0091a c0091a = new C0091a(this.w, this.x, r02Var);
                c0091a.v = obj;
                return c0091a;
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C0091a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:7:0x0016). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type r02 to fp9$a$a for r8v2 'this'  r02
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.ak0
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    int r0 = r8.u
                    r1 = 2
                    r2 = 1
                    r3 = 0
                    v72 r4 = defpackage.v72.t
                    if (r0 == 0) goto L29
                    if (r0 == r2) goto L1f
                    if (r0 != r1) goto L19
                    ca1 r0 = r8.t
                    java.lang.Object r5 = r8.v
                    el5 r5 = (defpackage.el5) r5
                    defpackage.dv8.b(r9)
                L16:
                    r9 = r5
                    r5 = r0
                    goto L47
                L19:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.aa0.c(r8)
                    return r3
                L1f:
                    ca1 r0 = r8.t
                    java.lang.Object r5 = r8.v
                    el5 r5 = (defpackage.el5) r5
                    defpackage.dv8.b(r9)
                    goto L58
                L29:
                    defpackage.dv8.b(r9)
                    java.lang.Object r9 = r8.v
                    t72 r9 = (defpackage.t72) r9
                    r0 = 0
                    r5 = 6
                    zx0 r0 = defpackage.da1.a(r0, r5, r3)
                    fp9$a$a$a r5 = new fp9$a$a$a
                    ci4<np9<T>, r02<? super g2b>, java.lang.Object> r6 = r8.x
                    r5.<init>(r0, r6, r3)
                    r6 = 3
                    dz9 r9 = defpackage.oy0.d(r9, r3, r3, r5, r6)
                    zx0$a r5 = new zx0$a
                    r5.<init>()
                L47:
                    r8.v = r9
                    r8.t = r5
                    r8.u = r2
                    java.lang.Object r0 = r5.b(r8)
                    if (r0 != r4) goto L54
                    goto L72
                L54:
                    r7 = r5
                    r5 = r9
                    r9 = r0
                    r0 = r7
                L58:
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    if (r9 == 0) goto L73
                    java.lang.Object r9 = r0.next()
                    r8.v = r5
                    r8.t = r0
                    r8.u = r1
                    s54<T> r6 = r8.w
                    java.lang.Object r9 = r6.emit(r9, r8)
                    if (r9 != r4) goto L16
                L72:
                    return r4
                L73:
                    r5.k(r3)
                    g2b r8 = defpackage.g2b.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: fp9.a.C0091a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ci4<? super np9<T>, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = ci4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Object obj, r02<? super g2b> r02Var) {
            return ((a) create((s54) obj, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                C0091a c0091a = new C0091a((s54) this.u, this.v, null);
                this.t = 1;
                Object objD = u72.d(c0091a, this);
                v72 v72Var = v72.t;
                if (objD == v72Var) {
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

    public static final <T> r54<T> a(ci4<? super np9<T>, ? super r02<? super g2b>, ? extends Object> ci4Var) {
        return yk2.c(new oz8(new a(ci4Var, null)), -2);
    }
}
