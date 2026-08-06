package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", l = {524, 534}, m = "invokeSuspend")
public final class z67 extends p6a implements ci4<r54<? extends gh0>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ js1 v;
    public final /* synthetic */ h37 w;
    public final /* synthetic */ b27 x;
    public final /* synthetic */ h37<Boolean> y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public static final a<T> t = new a<>();

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> implements s54 {
        public final /* synthetic */ h37<Boolean> t;
        public final /* synthetic */ b27 u;

        public b(h37<Boolean> h37Var, b27 b27Var) {
            this.t = h37Var;
            this.u = b27Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            this.t.setValue(Boolean.TRUE);
            this.u.g(((gh0) obj).c);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z67(js1 js1Var, h37 h37Var, b27 b27Var, h37 h37Var2, r02 r02Var) {
        super(2, r02Var);
        this.v = js1Var;
        this.w = h37Var;
        this.x = b27Var;
        this.y = h37Var2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        z67 z67Var = new z67(this.v, this.w, this.x, this.y, r02Var);
        z67Var.u = obj;
        return z67Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(r54<? extends gh0> r54Var, r02<? super g2b> r02Var) {
        return ((z67) create(r54Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r9.collect(z67.a.t, r8) == r6) goto L24;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.t
            r1 = 1
            h37<java.lang.Boolean> r2 = r8.y
            js1 r3 = r8.v
            r4 = 2
            if (r0 == 0) goto L25
            if (r0 == r1) goto L21
            if (r0 != r4) goto L1a
            java.lang.Object r8 = r8.u
            r47 r8 = (defpackage.r47) r8
            defpackage.dv8.b(r9)     // Catch: java.lang.Throwable -> L17
            goto L92
        L17:
            r8 = move-exception
            goto L9e
        L1a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            r8 = 0
            return r8
        L21:
            defpackage.dv8.b(r9)
            goto L47
        L25:
            defpackage.dv8.b(r9)
            java.lang.Object r9 = r8.u
            r54 r9 = (defpackage.r54) r9
            h37 r0 = r8.w
            java.lang.Object r5 = r0.getValue()
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            v72 r6 = defpackage.v72.t
            if (r5 >= r4) goto L4a
            r8.t = r1
            z67$a<T> r0 = z67.a.t
            java.lang.Object r8 = r9.collect(r0, r8)
            if (r8 != r6) goto L47
            goto L90
        L47:
            g2b r8 = defpackage.g2b.a
            return r8
        L4a:
            r1 = 0
            b27 r5 = r8.x
            r5.g(r1)
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = defpackage.th1.G(r1)
            r47 r1 = (defpackage.r47) r1
            s87 r7 = r3.b()
            r7.e(r1)
            java.lang.Object r7 = r0.getValue()
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            int r0 = r0 - r4
            java.lang.Object r0 = r7.get(r0)
            r47 r0 = (defpackage.r47) r0
            s87 r7 = r3.b()
            r7.e(r0)
            z67$b r0 = new z67$b     // Catch: java.lang.Throwable -> L17
            r0.<init>(r2, r5)     // Catch: java.lang.Throwable -> L17
            r8.u = r1     // Catch: java.lang.Throwable -> L17
            r8.t = r4     // Catch: java.lang.Throwable -> L17
            java.lang.Object r8 = r9.collect(r0, r8)     // Catch: java.lang.Throwable -> L17
            if (r8 != r6) goto L91
        L90:
            return r6
        L91:
            r8 = r1
        L92:
            r9 = 0
            r3.e(r8, r9)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r2.setValue(r8)
            g2b r8 = defpackage.g2b.a
            return r8
        L9e:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r2.setValue(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z67.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
