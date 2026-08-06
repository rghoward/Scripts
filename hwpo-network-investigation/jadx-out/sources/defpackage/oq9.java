package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {48, 51, 53, 53}, m = "invokeSuspend", v = 1)
public final class oq9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ kq9 v;
    public final /* synthetic */ oh4<r02<? super g2b>, Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq9(kq9 kq9Var, oh4 oh4Var, r02 r02Var) {
        super(2, r02Var);
        this.v = kq9Var;
        this.w = oh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        oq9 oq9Var = new oq9(this.v, this.w, r02Var);
        oq9Var.u = obj;
        return oq9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((oq9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r9 == r7) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kq9$b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [el5] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [el5] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, oq9, u02] */
    /* JADX WARN: Type inference failed for: r9v1, types: [oq9, u02] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            kq9 r0 = r9.v
            kq9$b r0 = r0.a
            int r1 = r9.t
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            v72 r7 = defpackage.v72.t
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L34
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1d
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r9)
            return r2
        L1d:
            java.lang.Object r9 = r9.u
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            defpackage.dv8.b(r10)
            goto L8b
        L26:
            defpackage.dv8.b(r10)
            goto L8c
        L2a:
            java.lang.Object r1 = r9.u
            el5 r1 = (defpackage.el5) r1
            defpackage.dv8.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L74
        L32:
            r10 = move-exception
            goto L7f
        L34:
            java.lang.Object r1 = r9.u
            el5 r1 = (defpackage.el5) r1
            defpackage.dv8.b(r10)
            goto L5f
        L3c:
            defpackage.dv8.b(r10)
            java.lang.Object r10 = r9.u
            t72 r10 = (defpackage.t72) r10
            h72 r10 = r10.getCoroutineContext()
            el5$a r1 = el5.a.t
            h72$a r10 = r10.d0(r1)
            if (r10 == 0) goto L8f
            el5 r10 = (defpackage.el5) r10
            r9.u = r10
            r9.t = r6
            java.lang.Object r1 = r0.b(r10, r9)
            if (r1 != r7) goto L5c
            goto L89
        L5c:
            r8 = r1
            r1 = r10
            r10 = r8
        L5f:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8c
            oh4<r02<? super g2b>, java.lang.Object> r10 = r9.w     // Catch: java.lang.Throwable -> L32
            r9.u = r1     // Catch: java.lang.Throwable -> L32
            r9.t = r5     // Catch: java.lang.Throwable -> L32
            java.lang.Object r10 = r10.invoke(r9)     // Catch: java.lang.Throwable -> L32
            if (r10 != r7) goto L74
            goto L89
        L74:
            r9.u = r2
            r9.t = r4
            java.lang.Object r9 = r0.a(r1, r9)
            if (r9 != r7) goto L8c
            goto L89
        L7f:
            r9.u = r10
            r9.t = r3
            java.lang.Object r9 = r0.a(r1, r9)
            if (r9 != r7) goto L8a
        L89:
            return r7
        L8a:
            r9 = r10
        L8b:
            throw r9
        L8c:
            g2b r9 = defpackage.g2b.a
            return r9
        L8f:
            java.lang.String r9 = "Internal error. coroutineScope should've created a job."
            defpackage.aa0.c(r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
