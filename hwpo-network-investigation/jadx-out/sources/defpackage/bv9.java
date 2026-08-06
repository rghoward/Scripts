package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {72, 73}, m = "invokeSuspend", v = 1)
public final class bv9 extends p6a implements ci4<ra8<Object>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ h72 v;
    public final /* synthetic */ r54<Object> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ ra8<Object> t;

        public a(ra8<Object> ra8Var) {
            this.t = ra8Var;
        }

        @Override // defpackage.s54
        public final Object emit(T t, r02<? super g2b> r02Var) {
            this.t.setValue(t);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {73}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ r54<Object> u;
        public final /* synthetic */ ra8<Object> v;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a<T> implements s54 {
            public final /* synthetic */ ra8<Object> t;

            public a(ra8<Object> ra8Var) {
                this.t = ra8Var;
            }

            @Override // defpackage.s54
            public final Object emit(T t, r02<? super g2b> r02Var) {
                this.t.setValue(t);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r54<Object> r54Var, ra8<Object> ra8Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = r54Var;
            this.v = ra8Var;
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
            if (i == 0) {
                dv8.b(obj);
                a aVar = new a(this.v);
                this.t = 1;
                Object objCollect = this.u.collect(aVar, this);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
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
    public bv9(h72 h72Var, r54<Object> r54Var, r02<? super bv9> r02Var) {
        super(2, r02Var);
        this.v = h72Var;
        this.w = r54Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        bv9 bv9Var = new bv9(this.v, this.w, r02Var);
        bv9Var.u = obj;
        return bv9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(ra8<Object> ra8Var, r02<? super g2b> r02Var) {
        return ((bv9) create(ra8Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5.collect(r0, r7) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (defpackage.oy0.g(r4, r0, r7) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return r6;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.t
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r1
        L12:
            defpackage.dv8.b(r8)
            goto L47
        L16:
            defpackage.dv8.b(r8)
            java.lang.Object r8 = r7.u
            ra8 r8 = (defpackage.ra8) r8
            ff3 r0 = defpackage.ff3.t
            h72 r4 = r7.v
            boolean r0 = defpackage.xj5.a(r4, r0)
            r54<java.lang.Object> r5 = r7.w
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L39
            bv9$a r0 = new bv9$a
            r0.<init>(r8)
            r7.t = r3
            java.lang.Object r7 = r5.collect(r0, r7)
            if (r7 != r6) goto L47
            goto L46
        L39:
            bv9$b r0 = new bv9$b
            r0.<init>(r5, r8, r1)
            r7.t = r2
            java.lang.Object r7 = defpackage.oy0.g(r4, r0, r7)
            if (r7 != r6) goto L47
        L46:
            return r6
        L47:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
