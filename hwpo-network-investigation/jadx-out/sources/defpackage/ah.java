package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.list.AffiliatedGymListViewModel$saveClicked$1", f = "AffiliatedGymListViewModel.kt", l = {245, 246, 247}, m = "invokeSuspend", v = 2)
public final class ah extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ pg u;
    public final /* synthetic */ yp4.a v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.list.AffiliatedGymListViewModel$saveClicked$1$1", f = "AffiliatedGymListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public final /* synthetic */ pg t;
        public final /* synthetic */ yp4.a u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pg pgVar, yp4.a aVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.t = pgVar;
            this.u = aVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.t, this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
            return ((a) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            pg.b bVar = pg.Companion;
            yp4.a aVar = this.u;
            hf hfVar = new hf(aVar.t, aVar.u);
            pg pgVar = this.t;
            pgVar.f(hfVar);
            ((is4) pgVar.K.getValue()).a();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.list.AffiliatedGymListViewModel$saveClicked$1$2", f = "AffiliatedGymListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ pg u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pg pgVar, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = pgVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.u, r02Var);
            bVar.t = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            return ((b) create(exc, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Exception exc = (Exception) this.t;
            dv8.b(obj);
            pg pgVar = this.u;
            pgVar.f(new jf(pgVar.B.a(exc)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(pg pgVar, yp4.a aVar, r02<? super ah> r02Var) {
        super(2, r02Var);
        this.u = pgVar;
        this.v = aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ah(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ah) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r9 == r7) goto L20;
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
            r1 = 0
            yp4$a r2 = r8.v
            r3 = 3
            r4 = 2
            r5 = 1
            pg r6 = r8.u
            v72 r7 = defpackage.v72.t
            if (r0 == 0) goto L26
            if (r0 == r5) goto L22
            if (r0 == r4) goto L1e
            if (r0 != r3) goto L18
            defpackage.dv8.b(r9)
            goto L5e
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r1
        L1e:
            defpackage.dv8.b(r9)
            goto L4e
        L22:
            defpackage.dv8.b(r9)
            goto L3e
        L26:
            defpackage.dv8.b(r9)
            ef$g r9 = ef.g.a
            pg$b r0 = defpackage.pg.Companion
            r6.e(r9)
            w3b r9 = r6.A
            r8.t = r5
            r9.getClass()
            java.lang.Object r9 = defpackage.g5b.b(r9, r2, r8)
            if (r9 != r7) goto L3e
            goto L5d
        L3e:
            xd3 r9 = (defpackage.xd3) r9
            ah$a r0 = new ah$a
            r0.<init>(r6, r2, r1)
            r8.t = r4
            java.lang.Object r9 = defpackage.yd3.b(r9, r0, r8)
            if (r9 != r7) goto L4e
            goto L5d
        L4e:
            xd3 r9 = (defpackage.xd3) r9
            ah$b r0 = new ah$b
            r0.<init>(r6, r1)
            r8.t = r3
            java.lang.Object r9 = defpackage.yd3.a(r9, r0, r8)
            if (r9 != r7) goto L5e
        L5d:
            return r7
        L5e:
            xd3 r9 = (defpackage.xd3) r9
            r9.getClass()
            ef$g r8 = ef.g.a
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
