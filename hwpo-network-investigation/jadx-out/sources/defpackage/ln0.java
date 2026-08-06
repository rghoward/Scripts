package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ln0 implements PointerInputEventHandler {
    public final /* synthetic */ fra a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {203}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ i58 v;
        public final /* synthetic */ fra w;

        /* JADX INFO: renamed from: ln0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {210, 216, 238}, m = "invokeSuspend")
        public static final class C0194a extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
            public final /* synthetic */ fra A;
            public i37 u;
            public s48 v;
            public long w;
            public int x;
            public /* synthetic */ Object y;
            public final /* synthetic */ t72 z;

            /* JADX INFO: renamed from: ln0$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {217}, m = "invokeSuspend")
            public static final class C0195a extends zu8 implements ci4<yg0, r02<? super a58>, Object> {
                public int u;
                public /* synthetic */ Object v;
                public final /* synthetic */ s48 w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0195a(s48 s48Var, r02<? super C0195a> r02Var) {
                    super(2, r02Var);
                    this.w = s48Var;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    C0195a c0195a = new C0195a(this.w, r02Var);
                    c0195a.v = obj;
                    return c0195a;
                }

                @Override // defpackage.ci4
                public final Object invoke(yg0 yg0Var, r02<? super a58> r02Var) {
                    return ((C0195a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = this.u;
                    if (i != 0) {
                        if (i == 1) {
                            dv8.b(obj);
                            return obj;
                        }
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                    yg0 yg0Var = (yg0) this.v;
                    this.u = 1;
                    Object objI = o8a.i(yg0Var, this.w, this);
                    v72 v72Var = v72.t;
                    return objI == v72Var ? v72Var : objI;
                }
            }

            /* JADX INFO: renamed from: ln0$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", f = "BasicTooltip.kt", l = {224, 227, 227}, m = "invokeSuspend")
            public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                public Throwable t;
                public int u;
                public final /* synthetic */ i37<Boolean> v;
                public final /* synthetic */ fra w;

                /* JADX INFO: renamed from: ln0$a$a$b$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                @xm2(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
                public static final class C0196a extends p6a implements ci4<Boolean, r02<? super g2b>, Object> {
                    public /* synthetic */ boolean t;
                    public final /* synthetic */ fra u;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0196a(fra fraVar, r02<? super C0196a> r02Var) {
                        super(2, r02Var);
                        this.u = fraVar;
                    }

                    @Override // defpackage.ak0
                    public final r02<g2b> create(Object obj, r02<?> r02Var) {
                        C0196a c0196a = new C0196a(this.u, r02Var);
                        c0196a.t = ((Boolean) obj).booleanValue();
                        return c0196a;
                    }

                    @Override // defpackage.ci4
                    public final Object invoke(Boolean bool, r02<? super g2b> r02Var) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((C0196a) create(bool2, r02Var)).invokeSuspend(g2b.a);
                    }

                    @Override // defpackage.ak0
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        dv8.b(obj);
                        if (!this.t) {
                            this.u.a();
                        }
                        return g2b.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(i37<Boolean> i37Var, fra fraVar, r02<? super b> r02Var) {
                    super(2, r02Var);
                    this.v = i37Var;
                    this.w = fraVar;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    return new b(this.v, this.w, r02Var);
                }

                @Override // defpackage.ci4
                public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                    return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
                
                    if (defpackage.yk2.f(r5, r9, r8) == r7) goto L30;
                 */
                @Override // defpackage.ak0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                    /*
                        r8 = this;
                        int r0 = r8.u
                        r1 = 0
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        i37<java.lang.Boolean> r5 = r8.v
                        fra r6 = r8.w
                        v72 r7 = defpackage.v72.t
                        if (r0 == 0) goto L2a
                        if (r0 == r4) goto L24
                        if (r0 == r3) goto L20
                        if (r0 == r2) goto L1a
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.aa0.c(r8)
                        return r1
                    L1a:
                        java.lang.Throwable r8 = r8.t
                        defpackage.dv8.b(r9)
                        goto L6b
                    L20:
                        defpackage.dv8.b(r9)
                        goto L51
                    L24:
                        defpackage.dv8.b(r9)     // Catch: java.lang.Throwable -> L28
                        goto L3d
                    L28:
                        r9 = move-exception
                        goto L54
                    L2a:
                        defpackage.dv8.b(r9)
                        java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L28
                        r5.f(r9)     // Catch: java.lang.Throwable -> L28
                        o37 r9 = defpackage.o37.v     // Catch: java.lang.Throwable -> L28
                        r8.u = r4     // Catch: java.lang.Throwable -> L28
                        java.lang.Object r9 = r6.c(r9, r8)     // Catch: java.lang.Throwable -> L28
                        if (r9 != r7) goto L3d
                        goto L69
                    L3d:
                        boolean r9 = r6.b()
                        if (r9 == 0) goto L51
                        ln0$a$a$b$a r9 = new ln0$a$a$b$a
                        r9.<init>(r6, r1)
                        r8.u = r3
                        java.lang.Object r8 = defpackage.yk2.f(r5, r9, r8)
                        if (r8 != r7) goto L51
                        goto L69
                    L51:
                        g2b r8 = defpackage.g2b.a
                        return r8
                    L54:
                        boolean r0 = r6.b()
                        if (r0 == 0) goto L6c
                        ln0$a$a$b$a r0 = new ln0$a$a$b$a
                        r0.<init>(r6, r1)
                        r8.t = r9
                        r8.u = r2
                        java.lang.Object r8 = defpackage.yk2.f(r5, r0, r8)
                        if (r8 != r7) goto L6a
                    L69:
                        return r7
                    L6a:
                        r8 = r9
                    L6b:
                        r9 = r8
                    L6c:
                        throw r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ln0.a.C0194a.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0194a(t72 t72Var, fra fraVar, r02<? super C0194a> r02Var) {
                super(2, r02Var);
                this.z = t72Var;
                this.A = fraVar;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C0194a c0194a = new C0194a(this.z, this.A, r02Var);
                c0194a.y = obj;
                return c0194a;
            }

            @Override // defpackage.ci4
            public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
                return ((C0194a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
            /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00bc, B:43:0x00c0), top: B:50:0x0014 }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [int] */
            /* JADX WARN: Type inference failed for: r0v1 */
            /* JADX WARN: Type inference failed for: r0v14 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v16 */
            /* JADX WARN: Type inference failed for: r0v17 */
            /* JADX WARN: Type inference failed for: r0v8 */
            /* JADX WARN: Type inference failed for: r0v9 */
            /* JADX WARN: Type inference failed for: r13v1 */
            /* JADX WARN: Type inference failed for: r13v10, types: [f37] */
            /* JADX WARN: Type inference failed for: r13v11 */
            /* JADX WARN: Type inference failed for: r13v14, types: [i37] */
            /* JADX WARN: Type inference failed for: r13v15 */
            /* JADX WARN: Type inference failed for: r13v2, types: [f37] */
            /* JADX WARN: Type inference failed for: r13v6 */
            /* JADX WARN: Type inference failed for: r13v8 */
            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                ?? r13;
                long j;
                yg0 yg0Var;
                s48 s48Var;
                i37 i37Var;
                i37 i37Var2;
                Object obj2;
                ?? r0;
                a58 a58Var;
                ?? r1 = this.x;
                v72 v72Var = v72.t;
                try {
                    if (r1 == 0) {
                        dv8.b(obj);
                        yg0 yg0Var2 = (yg0) this.y;
                        a0a a0aVarB = b0a.b(Boolean.FALSE);
                        long jB = yg0Var2.getViewConfiguration().b();
                        this.y = yg0Var2;
                        this.u = a0aVarB;
                        s48 s48Var2 = s48.t;
                        this.v = s48Var2;
                        this.w = jB;
                        this.x = 1;
                        Object objB = o8a.b(yg0Var2, this, 1);
                        if (objB != v72Var) {
                            j = jB;
                            yg0Var = yg0Var2;
                            obj = objB;
                            i37Var = a0aVarB;
                            s48Var = s48Var2;
                        }
                        return v72Var;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            if (r1 != 3) {
                                aa0.c("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r13 = (i37) this.y;
                            try {
                                dv8.b(obj);
                                r0 = r1;
                                r13 = r13;
                                a58Var = (a58) obj;
                                if (a58Var != null) {
                                    a58Var.a();
                                }
                                r13.f(Boolean.FALSE);
                                r1 = r0;
                                return g2b.a;
                            } catch (Throwable th) {
                                th = th;
                                r13.f(Boolean.FALSE);
                                throw th;
                            }
                        }
                        s48 s48Var3 = this.v;
                        i37 i37Var3 = this.u;
                        yg0Var = (yg0) this.y;
                        try {
                            dv8.b(obj);
                            obj2 = s48Var3;
                            i37Var2 = i37Var3;
                            i37Var2.f(Boolean.FALSE);
                            r1 = obj2;
                        } catch (t48 unused) {
                            s48Var = s48Var3;
                            i37Var = i37Var3;
                            oy0.d(this.z, null, x72.w, new b(i37Var, this.A, null), 1);
                            this.y = i37Var;
                            this.u = null;
                            this.v = null;
                            this.x = 3;
                            obj = o8a.i(yg0Var, s48Var, this);
                            if (obj != v72Var) {
                                r13 = i37Var;
                                r0 = i37Var;
                                a58Var = (a58) obj;
                                if (a58Var != null) {
                                    a58Var.a();
                                }
                                r13.f(Boolean.FALSE);
                                r1 = r0;
                            }
                            return v72Var;
                        } catch (Throwable th2) {
                            th = th2;
                            r13 = i37Var3;
                            r13.f(Boolean.FALSE);
                            throw th;
                        }
                        return g2b.a;
                    }
                    long j2 = this.w;
                    s48 s48Var4 = this.v;
                    i37 i37Var4 = this.u;
                    yg0 yg0Var3 = (yg0) this.y;
                    dv8.b(obj);
                    s48Var = s48Var4;
                    i37Var = i37Var4;
                    j = j2;
                    yg0Var = yg0Var3;
                    long j3 = j;
                    int i = ((a58) obj).i;
                    if (i == 1 || i == 3) {
                        try {
                            C0195a c0195a = new C0195a(s48Var, null);
                            this.y = yg0Var;
                            this.u = i37Var;
                            this.v = s48Var;
                            this.x = 2;
                            if (yg0Var.w1(j3, c0195a, this) != v72Var) {
                                i37Var2 = i37Var;
                                obj2 = i37Var;
                                i37Var2.f(Boolean.FALSE);
                                r1 = obj2;
                            }
                        } catch (t48 unused2) {
                            oy0.d(this.z, null, x72.w, new b(i37Var, this.A, null), 1);
                            this.y = i37Var;
                            this.u = null;
                            this.v = null;
                            this.x = 3;
                            obj = o8a.i(yg0Var, s48Var, this);
                            if (obj != v72Var) {
                                r13 = i37Var;
                                r0 = i37Var;
                                a58Var = (a58) obj;
                                if (a58Var != null) {
                                    a58Var.a();
                                }
                                r13.f(Boolean.FALSE);
                                r1 = r0;
                                return g2b.a;
                            }
                        }
                        return v72Var;
                    }
                    return g2b.a;
                } catch (Throwable th3) {
                    th = th3;
                    r13 = r1;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i58 i58Var, fra fraVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = i58Var;
            this.w = fraVar;
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

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                C0194a c0194a = new C0194a((t72) this.u, this.w, null);
                this.t = 1;
                Object objB = cc4.b(this.v, c0194a, this);
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
            return g2b.a;
        }
    }

    public ln0(fra fraVar) {
        this.a = fraVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
        Object objD = u72.d(new a(i58Var, this.a, null), r02Var);
        return objD == v72.t ? objD : g2b.a;
    }
}
