package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ba1<T, R> extends z91<T, R> {
    public final ei4<s54<? super R>, T, r02<? super g2b>, Object> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ ba1<T, R> v;
        public final /* synthetic */ s54<R> w;

        /* JADX INFO: renamed from: ba1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0029a<T> implements s54 {
            public final /* synthetic */ gl8<el5> t;
            public final /* synthetic */ t72 u;
            public final /* synthetic */ ba1<T, R> v;
            public final /* synthetic */ s54<R> w;

            /* JADX INFO: renamed from: ba1$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend", v = 1)
            public static final class C0030a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                public int t;
                public final /* synthetic */ ba1<T, R> u;
                public final /* synthetic */ s54<R> v;
                public final /* synthetic */ T w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0030a(ba1<T, R> ba1Var, s54<? super R> s54Var, T t, r02<? super C0030a> r02Var) {
                    super(2, r02Var);
                    this.u = ba1Var;
                    this.v = s54Var;
                    this.w = t;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    return new C0030a(this.u, this.v, this.w, r02Var);
                }

                @Override // defpackage.ci4
                public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                    return ((C0030a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to ba1$a$a$a for r2v3 'this'  java.lang.Object
                    	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                    	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // defpackage.ak0
                public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                    /*
                        r2 = this;
                        int r0 = r2.t
                        r1 = 1
                        if (r0 == 0) goto L12
                        if (r0 != r1) goto Lb
                        defpackage.dv8.b(r3)
                        goto L28
                    Lb:
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.aa0.c(r2)
                        r2 = 0
                        return r2
                    L12:
                        defpackage.dv8.b(r3)
                        ba1<T, R> r3 = r2.u
                        ei4<s54<? super R>, T, r02<? super g2b>, java.lang.Object> r3 = r3.x
                        r2.t = r1
                        s54<R> r0 = r2.v
                        T r1 = r2.w
                        java.lang.Object r2 = r3.invoke(r0, r1, r2)
                        v72 r3 = defpackage.v72.t
                        if (r2 != r3) goto L28
                        return r3
                    L28:
                        g2b r2 = defpackage.g2b.a
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ba1.a.C0029a.C0030a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: ba1$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit", v = 1)
            public static final class b extends u02 {
                public Object t;
                public el5 u;
                public /* synthetic */ Object v;
                public final /* synthetic */ C0029a<T> w;
                public int x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0029a<? super T> c0029a, r02<? super b> r02Var) {
                    super(r02Var);
                    this.w = c0029a;
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) {
                    this.v = obj;
                    this.x |= Integer.MIN_VALUE;
                    return this.w.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0029a(gl8<el5> gl8Var, t72 t72Var, ba1<T, R> ba1Var, s54<? super R> s54Var) {
                this.t = gl8Var;
                this.u = t72Var;
                this.v = ba1Var;
                this.w = s54Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.s54
            public final Object emit(T t, r02<? super g2b> r02Var) throws Throwable {
                b bVar;
                if (r02Var instanceof b) {
                    bVar = (b) r02Var;
                    int i = bVar.x;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bVar.x = i - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, r02Var);
                    }
                } else {
                    bVar = new b(this, r02Var);
                }
                Object obj = bVar.v;
                int i2 = bVar.x;
                gl8<el5> gl8Var = this.t;
                if (i2 == 0) {
                    dv8.b(obj);
                    el5 el5Var = gl8Var.t;
                    if (el5Var != null) {
                        el5Var.k(new yb1());
                        bVar.t = t;
                        bVar.u = el5Var;
                        bVar.x = 1;
                        Object objP0 = el5Var.p0(bVar);
                        v72 v72Var = v72.t;
                        if (objP0 == v72Var) {
                            return v72Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t = (T) bVar.t;
                    dv8.b(obj);
                }
                gl8Var.t = (T) oy0.d(this.u, null, x72.w, new C0030a(this.v, this.w, t, null), 1);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ba1<T, R> ba1Var, s54<? super R> s54Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = ba1Var;
            this.w = s54Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, this.w, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type r02 to ba1$a for r7v3 'this'  r02
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.ak0
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.u
                t72 r0 = (defpackage.t72) r0
                int r1 = r7.t
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L16
                if (r1 != r3) goto L10
                defpackage.dv8.b(r8)
                goto L36
            L10:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                return r2
            L16:
                defpackage.dv8.b(r8)
                gl8 r8 = new gl8
                r8.<init>()
                ba1<T, R> r1 = r7.v
                r54<S> r4 = r1.w
                ba1$a$a r5 = new ba1$a$a
                s54<R> r6 = r7.w
                r5.<init>(r8, r0, r1, r6)
                r7.u = r2
                r7.t = r3
                java.lang.Object r7 = r4.collect(r5, r7)
                v72 r8 = defpackage.v72.t
                if (r7 != r8) goto L36
                return r8
            L36:
                g2b r7 = defpackage.g2b.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ba1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ba1(ei4<? super s54<? super R>, ? super T, ? super r02<? super g2b>, ? extends Object> ei4Var, r54<? extends T> r54Var, h72 h72Var, int i, xx0 xx0Var) {
        super(i, xx0Var, h72Var, r54Var);
        this.x = ei4Var;
    }

    @Override // defpackage.u91
    public final u91<R> j(h72 h72Var, int i, xx0 xx0Var) {
        return new ba1(this.x, this.w, h72Var, i, xx0Var);
    }

    @Override // defpackage.z91
    public final Object m(s54<? super R> s54Var, r02<? super g2b> r02Var) {
        Object objD = u72.d(new a(this, s54Var, null), r02Var);
        return objD == v72.t ? objD : g2b.a;
    }
}
