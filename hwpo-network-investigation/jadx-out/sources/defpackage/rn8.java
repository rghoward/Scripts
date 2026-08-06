package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend", v = 1)
public final class rn8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ s66 v;
    public final /* synthetic */ s66.b w;
    public final /* synthetic */ ci4<t72, r02<? super g2b>, Object> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public final /* synthetic */ ci4<t72, r02<? super g2b>, Object> A;
        public gl8 t;
        public gl8 u;
        public t72 v;
        public int w;
        public final /* synthetic */ s66 x;
        public final /* synthetic */ s66.b y;
        public final /* synthetic */ t72 z;

        /* JADX INFO: renamed from: rn8$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0232a implements g76 {
            public final /* synthetic */ s66.a t;
            public final /* synthetic */ gl8<el5> u;
            public final /* synthetic */ t72 v;
            public final /* synthetic */ s66.a w;
            public final /* synthetic */ e41 x;
            public final /* synthetic */ a47 y;
            public final /* synthetic */ ci4<t72, r02<? super g2b>, Object> z;

            /* JADX INFO: renamed from: rn8$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend", v = 1)
            public static final class C0233a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                public x37 t;
                public p6a u;
                public int v;
                public final /* synthetic */ a47 w;
                public final /* synthetic */ ci4<t72, r02<? super g2b>, Object> x;

                /* JADX INFO: renamed from: rn8$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                @xm2(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {110}, m = "invokeSuspend", v = 1)
                public static final class C0234a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                    public int t;
                    public /* synthetic */ Object u;
                    public final /* synthetic */ ci4<t72, r02<? super g2b>, Object> v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0234a(ci4<? super t72, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super C0234a> r02Var) {
                        super(2, r02Var);
                        this.v = ci4Var;
                    }

                    @Override // defpackage.ak0
                    public final r02<g2b> create(Object obj, r02<?> r02Var) {
                        C0234a c0234a = new C0234a(this.v, r02Var);
                        c0234a.u = obj;
                        return c0234a;
                    }

                    @Override // defpackage.ci4
                    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                        return ((C0234a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                    }

                    @Override // defpackage.ak0
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        int i = this.t;
                        if (i == 0) {
                            dv8.b(obj);
                            t72 t72Var = (t72) this.u;
                            this.t = 1;
                            Object objInvoke = this.v.invoke(t72Var, this);
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
                public C0233a(a47 a47Var, ci4 ci4Var, r02 r02Var) {
                    super(2, r02Var);
                    this.w = a47Var;
                    this.x = ci4Var;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    return new C0233a(this.w, this.x, r02Var);
                }

                @Override // defpackage.ci4
                public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                    return ((C0233a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v2, types: [ci4] */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r0v6 */
                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    x37 x37Var;
                    Object obj2;
                    ?? r0;
                    Throwable th;
                    x37 x37Var2;
                    int i = this.v;
                    v72 v72Var = v72.t;
                    try {
                        if (i == 0) {
                            dv8.b(obj);
                            x37Var = this.w;
                            this.t = x37Var;
                            obj2 = this.x;
                            this.u = (p6a) obj2;
                            this.v = 1;
                            if (x37Var.b(this) != v72Var) {
                            }
                            r0 = obj2;
                            return v72Var;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                aa0.c("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            x37Var2 = this.t;
                            try {
                                dv8.b(obj);
                                g2b g2bVar = g2b.a;
                                x37Var2.c(null);
                                return g2b.a;
                            } catch (Throwable th2) {
                                th = th2;
                                x37Var2.c(null);
                                throw th;
                            }
                        }
                        ci4 ci4Var = (ci4) this.u;
                        x37 x37Var3 = this.t;
                        dv8.b(obj);
                        x37Var = x37Var3;
                        r0 = ci4Var;
                        r0 = obj2;
                        C0234a c0234a = new C0234a(r0, null);
                        this.t = x37Var;
                        this.u = null;
                        this.v = 2;
                        if (u72.d(c0234a, this) != v72Var) {
                            x37Var2 = x37Var;
                            g2b g2bVar2 = g2b.a;
                            x37Var2.c(null);
                            return g2b.a;
                        }
                        r0 = obj2;
                        return v72Var;
                    } catch (Throwable th3) {
                        x37 x37Var4 = x37Var;
                        th = th3;
                        x37Var2 = x37Var4;
                        x37Var2.c(null);
                        throw th;
                    }
                }
            }

            public C0232a(s66.a aVar, gl8 gl8Var, t72 t72Var, s66.a aVar2, e41 e41Var, a47 a47Var, ci4 ci4Var) {
                this.t = aVar;
                this.u = gl8Var;
                this.v = t72Var;
                this.w = aVar2;
                this.x = e41Var;
                this.y = a47Var;
                this.z = ci4Var;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [T, dz9] */
            @Override // defpackage.g76
            public final void t(m76 m76Var, s66.a aVar) {
                s66.a aVar2 = this.t;
                gl8<el5> gl8Var = this.u;
                if (aVar == aVar2) {
                    gl8Var.t = oy0.d(this.v, null, null, new C0233a(this.y, this.z, null), 3);
                    return;
                }
                if (aVar == this.w) {
                    el5 el5Var = gl8Var.t;
                    if (el5Var != null) {
                        el5Var.k(null);
                    }
                    gl8Var.t = null;
                }
                if (aVar == s66.a.ON_DESTROY) {
                    this.x.resumeWith(g2b.a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(s66 s66Var, s66.b bVar, t72 t72Var, ci4<? super t72, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.x = s66Var;
            this.y = bVar;
            this.z = t72Var;
            this.A = ci4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.x, this.y, this.z, this.A, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0088 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x0089  */
        /* JADX WARN: Code duplicated, block: B:35:0x0091  */
        /* JADX WARN: Code duplicated, block: B:38:0x009a  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:54:? A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v3, types: [T, l76, rn8$a$a] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            gl8 gl8Var;
            Throwable th;
            gl8 gl8Var2;
            s66.a aVar;
            s66.a aVar2;
            Object objR;
            v72 v72Var;
            el5 el5Var;
            g76 g76Var;
            el5 el5Var2;
            g76 g76Var2;
            int i = this.w;
            s66 s66Var = this.x;
            if (i != 0) {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gl8Var = this.u;
                gl8Var2 = this.t;
                try {
                    dv8.b(obj);
                    el5Var2 = (el5) gl8Var2.t;
                    if (el5Var2 != null) {
                        el5Var2.k(null);
                    }
                    g76Var2 = (g76) gl8Var.t;
                    if (g76Var2 != null) {
                        s66Var.c(g76Var2);
                    }
                    return g2b.a;
                } catch (Throwable th2) {
                    th = th2;
                    el5Var = (el5) gl8Var2.t;
                    if (el5Var != null) {
                        el5Var.k(null);
                    }
                    g76Var = (g76) gl8Var.t;
                    if (g76Var != null) {
                        throw th;
                    }
                    s66Var.c(g76Var);
                    throw th;
                }
            }
            dv8.b(obj);
            if (s66Var.b() == s66.b.t) {
                return g2b.a;
            }
            gl8 gl8Var3 = new gl8();
            gl8 gl8Var4 = new gl8();
            try {
                s66.b bVar = this.y;
                t72 t72Var = this.z;
                ci4<t72, r02<? super g2b>, Object> ci4Var = this.A;
                this.t = gl8Var3;
                this.u = gl8Var4;
                this.v = t72Var;
                this.w = 1;
                e41 e41Var = new e41(1, th0.e(this));
                e41Var.t();
                s66.a.Companion.getClass();
                int iOrdinal = bVar.ordinal();
                if (iOrdinal == 2) {
                    aVar = s66.a.ON_CREATE;
                } else {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            aVar2 = null;
                        } else {
                            aVar = s66.a.ON_RESUME;
                        }
                        ?? c0232a = new C0232a(aVar2, gl8Var3, t72Var, s66.a.C0240a.a(bVar), e41Var, new a47(), ci4Var);
                        gl8Var4.t = c0232a;
                        s66Var.a(c0232a);
                        objR = e41Var.r();
                        v72Var = v72.t;
                        if (objR == v72Var) {
                            return v72Var;
                        }
                        gl8Var = gl8Var4;
                        gl8Var2 = gl8Var3;
                        el5Var2 = (el5) gl8Var2.t;
                        if (el5Var2 != null) {
                            el5Var2.k(null);
                        }
                        g76Var2 = (g76) gl8Var.t;
                        if (g76Var2 != null) {
                            s66Var.c(g76Var2);
                        }
                        return g2b.a;
                    }
                    aVar = s66.a.ON_START;
                }
                aVar2 = aVar;
                ?? c0232a2 = new C0232a(aVar2, gl8Var3, t72Var, s66.a.C0240a.a(bVar), e41Var, new a47(), ci4Var);
                gl8Var4.t = c0232a2;
                s66Var.a(c0232a2);
                objR = e41Var.r();
                v72Var = v72.t;
                if (objR == v72Var) {
                    return v72Var;
                }
                gl8Var = gl8Var4;
                gl8Var2 = gl8Var3;
                el5Var2 = (el5) gl8Var2.t;
                if (el5Var2 != null) {
                    el5Var2.k(null);
                }
                g76Var2 = (g76) gl8Var.t;
                if (g76Var2 != null) {
                    s66Var.c(g76Var2);
                }
                return g2b.a;
            } catch (Throwable th3) {
                gl8Var = gl8Var4;
                th = th3;
                gl8Var2 = gl8Var3;
                el5Var = (el5) gl8Var2.t;
                if (el5Var != null) {
                    el5Var.k(null);
                }
                g76Var = (g76) gl8Var.t;
                if (g76Var != null) {
                    throw th;
                }
                s66Var.c(g76Var);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rn8(s66 s66Var, s66.b bVar, ci4<? super t72, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super rn8> r02Var) {
        super(2, r02Var);
        this.v = s66Var;
        this.w = bVar;
        this.x = ci4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        rn8 rn8Var = new rn8(this.v, this.w, this.x, r02Var);
        rn8Var.u = obj;
        return rn8Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((rn8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            t72 t72Var = (t72) this.u;
            et2 et2Var = i23.a;
            gt4 gt4VarX0 = ag6.a.x0();
            a aVar = new a(this.v, this.w, t72Var, this.x, null);
            this.t = 1;
            Object objG = oy0.g(gt4VarX0, aVar, this);
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
