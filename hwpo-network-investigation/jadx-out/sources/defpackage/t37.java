package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {212, 127}, m = "invokeSuspend", v = 1)
public final class t37 extends p6a implements ci4<t72, r02<Object>, Object> {
    public final /* synthetic */ oh4<r02<Object>, Object> A;
    public x37 t;
    public Object u;
    public w37 v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ o37 y;
    public final /* synthetic */ w37 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t37(o37 o37Var, w37 w37Var, oh4<? super r02<Object>, ? extends Object> oh4Var, r02<? super t37> r02Var) {
        super(2, r02Var);
        this.y = o37Var;
        this.z = w37Var;
        this.A = oh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        t37 t37Var = new t37(this.y, this.z, this.A, r02Var);
        t37Var.x = obj;
        return t37Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<Object> r02Var) {
        return ((t37) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.w
            r1 = 2
            r2 = 1
            r3 = 0
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L37
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r7.u
            w37 r0 = (defpackage.w37) r0
            x37 r1 = r7.t
            java.lang.Object r7 = r7.x
            w37$a r7 = (w37.a) r7
            defpackage.dv8.b(r8)     // Catch: java.lang.Throwable -> L1c
            goto L85
        L1c:
            r8 = move-exception
            goto La0
        L1f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r3
        L25:
            w37 r0 = r7.v
            java.lang.Object r2 = r7.u
            oh4 r2 = (defpackage.oh4) r2
            x37 r5 = r7.t
            java.lang.Object r6 = r7.x
            w37$a r6 = (w37.a) r6
            defpackage.dv8.b(r8)
            r8 = r0
            r0 = r6
            goto L6f
        L37:
            defpackage.dv8.b(r8)
            java.lang.Object r8 = r7.x
            t72 r8 = (defpackage.t72) r8
            w37$a r0 = new w37$a
            h72 r8 = r8.getCoroutineContext()
            el5$a r5 = el5.a.t
            h72$a r8 = r8.d0(r5)
            r8.getClass()
            el5 r8 = (defpackage.el5) r8
            o37 r5 = r7.y
            r0.<init>(r5, r8)
            w37 r8 = r7.z
            defpackage.w37.a(r8, r0)
            a47 r5 = r8.b
            r7.x = r0
            r7.t = r5
            oh4<r02<java.lang.Object>, java.lang.Object> r6 = r7.A
            r7.u = r6
            r7.v = r8
            r7.w = r2
            java.lang.Object r2 = r5.b(r7)
            if (r2 != r4) goto L6e
            goto L7f
        L6e:
            r2 = r6
        L6f:
            r7.x = r0     // Catch: java.lang.Throwable -> L9a
            r7.t = r5     // Catch: java.lang.Throwable -> L9a
            r7.u = r8     // Catch: java.lang.Throwable -> L9a
            r7.v = r3     // Catch: java.lang.Throwable -> L9a
            r7.w = r1     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r7 = r2.invoke(r7)     // Catch: java.lang.Throwable -> L9a
            if (r7 != r4) goto L80
        L7f:
            return r4
        L80:
            r1 = r8
            r8 = r7
            r7 = r0
            r0 = r1
            r1 = r5
        L85:
            java.util.concurrent.atomic.AtomicReference<w37$a> r0 = r0.a     // Catch: java.lang.Throwable -> L98
        L87:
            boolean r2 = r0.compareAndSet(r7, r3)     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L8e
            goto L94
        L8e:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> L98
            if (r2 == r7) goto L87
        L94:
            r1.c(r3)
            return r8
        L98:
            r7 = move-exception
            goto Lb0
        L9a:
            r7 = move-exception
            r1 = r8
            r8 = r7
            r7 = r0
            r0 = r1
            r1 = r5
        La0:
            java.util.concurrent.atomic.AtomicReference<w37$a> r0 = r0.a     // Catch: java.lang.Throwable -> L98
        La2:
            boolean r2 = r0.compareAndSet(r7, r3)     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto Laf
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> L98
            if (r2 != r7) goto Laf
            goto La2
        Laf:
            throw r8     // Catch: java.lang.Throwable -> L98
        Lb0:
            r1.c(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t37.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
