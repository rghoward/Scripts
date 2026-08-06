package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.changepassword.presentation.ChangePasswordViewModel$onSaveClicked$1", f = "ChangePasswordViewModel.kt", l = {81, 87}, m = "invokeSuspend", v = 2)
public final class j91 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ m91 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.changepassword.presentation.ChangePasswordViewModel$onSaveClicked$1$1", f = "ChangePasswordViewModel.kt", l = {88}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<l7b.b, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ m91 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m91 m91Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = m91Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(l7b.b bVar, r02<? super g2b> r02Var) {
            return ((a) create(bVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            l7b.b bVar = (l7b.b) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                boolean z = bVar.a;
                m91 m91Var = this.v;
                if (z) {
                    this.u = null;
                    this.t = 1;
                    Object objG = m91.g(m91Var, this);
                    v72 v72Var = v72.t;
                    if (objG == v72Var) {
                        return v72Var;
                    }
                } else {
                    j81.e eVar = new j81.e(bVar.b, bVar.c, bVar.d);
                    int i2 = m91.I;
                    m91Var.e(eVar);
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
    public j91(m91 m91Var, r02<? super j91> r02Var) {
        super(2, r02Var);
        this.u = m91Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new j91(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((j91) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (defpackage.yd3.b((defpackage.xd3) r10, r0, r9) == r5) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.t
            r1 = 0
            r2 = 2
            r3 = 1
            m91 r4 = r9.u
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.dv8.b(r10)
            goto L5b
        L13:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r9)
            return r1
        L19:
            defpackage.dv8.b(r10)
            goto L4b
        L1d:
            defpackage.dv8.b(r10)
            l7b r10 = r4.x
            l7b$a r0 = new l7b$a
            el0 r6 = r4.b()
            n91 r6 = (defpackage.n91) r6
            java.lang.String r6 = r6.a
            el0 r7 = r4.b()
            n91 r7 = (defpackage.n91) r7
            java.lang.String r7 = r7.b
            el0 r8 = r4.b()
            n91 r8 = (defpackage.n91) r8
            java.lang.String r8 = r8.c
            r0.<init>(r6, r7, r8)
            r9.t = r3
            r10.getClass()
            java.lang.Object r10 = defpackage.g5b.b(r10, r0, r9)
            if (r10 != r5) goto L4b
            goto L5a
        L4b:
            xd3 r10 = (defpackage.xd3) r10
            j91$a r0 = new j91$a
            r0.<init>(r4, r1)
            r9.t = r2
            java.lang.Object r9 = defpackage.yd3.b(r10, r0, r9)
            if (r9 != r5) goto L5b
        L5a:
            return r5
        L5b:
            g2b r9 = defpackage.g2b.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
