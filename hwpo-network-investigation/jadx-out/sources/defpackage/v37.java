package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {212, 167}, m = "invokeSuspend", v = 1)
public final class v37 extends p6a implements ci4<t72, r02<Object>, Object> {
    public final /* synthetic */ w37 A;
    public final /* synthetic */ ci4<Object, r02<Object>, Object> B;
    public final /* synthetic */ Object C;
    public x37 t;
    public Object u;
    public Object v;
    public w37 w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ o37 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v37(o37 o37Var, w37 w37Var, ci4<Object, ? super r02<Object>, ? extends Object> ci4Var, Object obj, r02<? super v37> r02Var) {
        super(2, r02Var);
        this.z = o37Var;
        this.A = w37Var;
        this.B = ci4Var;
        this.C = obj;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        v37 v37Var = new v37(this.z, this.A, this.B, this.C, r02Var);
        v37Var.y = obj;
        return v37Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<Object> r02Var) {
        return ((v37) create(t72Var, r02Var)).invokeSuspend(g2b.a);
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
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.x
            r1 = 2
            r2 = 1
            r3 = 0
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.u
            w37 r0 = (defpackage.w37) r0
            x37 r1 = r8.t
            java.lang.Object r8 = r8.y
            w37$a r8 = (w37.a) r8
            defpackage.dv8.b(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r3
        L25:
            w37 r0 = r8.w
            java.lang.Object r2 = r8.v
            java.lang.Object r5 = r8.u
            ci4 r5 = (defpackage.ci4) r5
            x37 r6 = r8.t
            java.lang.Object r7 = r8.y
            w37$a r7 = (w37.a) r7
            defpackage.dv8.b(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            defpackage.dv8.b(r9)
            java.lang.Object r9 = r8.y
            t72 r9 = (defpackage.t72) r9
            w37$a r0 = new w37$a
            h72 r9 = r9.getCoroutineContext()
            el5$a r5 = el5.a.t
            h72$a r9 = r9.d0(r5)
            r9.getClass()
            el5 r9 = (defpackage.el5) r9
            o37 r5 = r8.z
            r0.<init>(r5, r9)
            w37 r9 = r8.A
            defpackage.w37.a(r9, r0)
            a47 r5 = r9.b
            r8.y = r0
            r8.t = r5
            ci4<java.lang.Object, r02<java.lang.Object>, java.lang.Object> r6 = r8.B
            r8.u = r6
            java.lang.Object r7 = r8.C
            r8.v = r7
            r8.w = r9
            r8.x = r2
            java.lang.Object r2 = r5.b(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.y = r0     // Catch: java.lang.Throwable -> La5
            r8.t = r5     // Catch: java.lang.Throwable -> La5
            r8.u = r9     // Catch: java.lang.Throwable -> La5
            r8.v = r3     // Catch: java.lang.Throwable -> La5
            r8.w = r3     // Catch: java.lang.Throwable -> La5
            r8.x = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.invoke(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference<w37$a> r0 = r0.a     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.c(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference<w37$a> r0 = r0.a     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.c(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v37.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
