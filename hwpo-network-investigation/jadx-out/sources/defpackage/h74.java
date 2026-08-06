package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend", v = 1)
public final class h74 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ um9 u;
    public final /* synthetic */ r54<Object> v;
    public final /* synthetic */ f37<Object> w;
    public final /* synthetic */ Object x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<Integer, r02<? super Boolean>, Object> {
        public /* synthetic */ int t;

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(2, r02Var);
            aVar.t = ((Number) obj).intValue();
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Integer num, r02<? super Boolean> r02Var) {
            return ((a) create(Integer.valueOf(num.intValue()), r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            dv8.b(obj);
            return Boolean.valueOf(i > 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<sm9, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ r54<Object> v;
        public final /* synthetic */ f37<Object> w;
        public final /* synthetic */ Object x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r54<Object> r54Var, f37<Object> f37Var, Object obj, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = r54Var;
            this.w = f37Var;
            this.x = obj;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.v, this.w, this.x, r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(sm9 sm9Var, r02<? super g2b> r02Var) {
            return ((b) create(sm9Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            sm9 sm9Var = (sm9) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                int iOrdinal = sm9Var.ordinal();
                f37<Object> f37Var = this.w;
                if (iOrdinal == 0) {
                    this.u = null;
                    this.t = 1;
                    Object objCollect = this.v.collect(f37Var, this);
                    v72 v72Var = v72.t;
                    if (objCollect == v72Var) {
                        return v72Var;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        u.b();
                        return null;
                    }
                    k7a k7aVar = ty1.d;
                    Object obj2 = this.x;
                    if (obj2 == k7aVar) {
                        f37Var.d();
                    } else {
                        f37Var.f(obj2);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h74(um9 um9Var, r54<Object> r54Var, f37<Object> f37Var, Object obj, r02<? super h74> r02Var) {
        super(2, r02Var);
        this.u = um9Var;
        this.v = r54Var;
        this.w = f37Var;
        this.x = obj;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new h74(this.u, this.v, this.w, this.x, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((h74) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type r02 to h74 for r9v6 'this'  r02
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.t
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 1
            r54<java.lang.Object> r5 = r9.v
            r6 = 2
            f37<java.lang.Object> r7 = r9.w
            v72 r8 = defpackage.v72.t
            if (r0 == 0) goto L26
            if (r0 == r4) goto L22
            if (r0 == r6) goto L1e
            if (r0 == r3) goto L22
            if (r0 != r2) goto L18
            goto L22
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r9)
            return r1
        L1e:
            defpackage.dv8.b(r10)
            goto L4e
        L22:
            defpackage.dv8.b(r10)
            goto L73
        L26:
            defpackage.dv8.b(r10)
            sz9 r10 = um9.a.a
            um9 r0 = r9.u
            if (r0 != r10) goto L38
            r9.t = r4
            java.lang.Object r9 = r5.collect(r7, r9)
            if (r9 != r8) goto L73
            goto L72
        L38:
            tz9 r10 = um9.a.b
            if (r0 != r10) goto L57
            n4a r10 = r7.g()
            h74$a r0 = new h74$a
            r0.<init>(r6, r1)
            r9.t = r6
            java.lang.Object r10 = defpackage.yk2.l(r10, r0, r9)
            if (r10 != r8) goto L4e
            goto L72
        L4e:
            r9.t = r3
            java.lang.Object r9 = r5.collect(r7, r9)
            if (r9 != r8) goto L73
            goto L72
        L57:
            n4a r10 = r7.g()
            r54 r10 = r0.b(r10)
            r54 r10 = defpackage.yk2.i(r10)
            h74$b r0 = new h74$b
            java.lang.Object r3 = r9.x
            r0.<init>(r5, r7, r3, r1)
            r9.t = r2
            java.lang.Object r9 = defpackage.yk2.f(r10, r0, r9)
            if (r9 != r8) goto L73
        L72:
            return r8
        L73:
            g2b r9 = defpackage.g2b.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h74.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
