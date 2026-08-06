package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.domain.usecase.ObserveSocketConnectionStatesUseCase$executeOnBackground$2", f = "ObserveSocketConnectionStatesUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class if7 extends p6a implements ci4<t72, r02<? super el5>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ lf7 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.host.domain.usecase.ObserveSocketConnectionStatesUseCase$executeOnBackground$2$1", f = "ObserveSocketConnectionStatesUseCase.kt", l = {21}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ lf7 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lf7 lf7Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = lf7Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type r02 to if7$a for r3v11 'this'  r02
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.ak0
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                int r0 = r3.t
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L12
                if (r0 != r2) goto Lc
                defpackage.dv8.b(r4)
                goto L4d
            Lc:
                java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r3)
                return r1
            L12:
                defpackage.dv8.b(r4)
                r3.t = r2
                lf7 r4 = r3.u
                kd7 r0 = r4.a
                ji8 r0 = r0.a
                kf7 r2 = new kf7
                r2.<init>(r4, r1)
                k74$a r4 = new k74$a
                jc7 r1 = defpackage.jc7.t
                r4.<init>(r1, r2)
                jf7 r1 = new jf7
                r1.<init>(r4)
                zl9<T> r4 = r0.t
                java.lang.Object r3 = r4.collect(r1, r3)
                v72 r4 = defpackage.v72.t
                if (r3 != r4) goto L39
                goto L3b
            L39:
                g2b r3 = defpackage.g2b.a
            L3b:
                if (r3 != r4) goto L3e
                goto L40
            L3e:
                g2b r3 = defpackage.g2b.a
            L40:
                if (r3 != r4) goto L43
                goto L45
            L43:
                g2b r3 = defpackage.g2b.a
            L45:
                if (r3 != r4) goto L48
                goto L4a
            L48:
                g2b r3 = defpackage.g2b.a
            L4a:
                if (r3 != r4) goto L4d
                return r4
            L4d:
                g2b r3 = defpackage.g2b.a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: if7.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if7(lf7 lf7Var, r02<? super if7> r02Var) {
        super(2, r02Var);
        this.u = lf7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        if7 if7Var = new if7(this.u, r02Var);
        if7Var.t = obj;
        return if7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super el5> r02Var) {
        return ((if7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        t72 t72Var = (t72) this.t;
        dv8.b(obj);
        return oy0.d(t72Var, null, null, new a(this.u, null), 3);
    }
}
