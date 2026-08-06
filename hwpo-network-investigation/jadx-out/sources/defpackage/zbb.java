package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListViewModel$deleteValueConfirmed$1", f = "ValuesListViewModel.kt", l = {187, 188, 189}, m = "invokeSuspend", v = 2)
public final class zbb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ybb u;
    public final /* synthetic */ int v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListViewModel$deleteValueConfirmed$1$1", f = "ValuesListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public final /* synthetic */ ybb t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ybb ybbVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.t = ybbVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.t, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
            return ((a) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            ybb.a aVar = ybb.Companion;
            ybb ybbVar = this.t;
            oy0.d(rhb.b(ybbVar), null, null, new dcb(ybbVar, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListViewModel$deleteValueConfirmed$1$2", f = "ValuesListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ ybb u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ybb ybbVar, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = ybbVar;
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
            ybb.a aVar = ybb.Companion;
            ybb ybbVar = this.u;
            ybbVar.e(vh3.e.a);
            ybbVar.f(new kbb(ybbVar.D.a(exc)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbb(ybb ybbVar, int i, r02<? super zbb> r02Var) {
        super(2, r02Var);
        this.u = ybbVar;
        this.v = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new zbb(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((zbb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r9, r0, r8) == r6) goto L20;
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
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            ybb r5 = r8.u
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L16
            defpackage.dv8.b(r9)
            goto L65
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r4
        L1c:
            defpackage.dv8.b(r9)
            goto L55
        L20:
            defpackage.dv8.b(r9)
            goto L45
        L24:
            defpackage.dv8.b(r9)
            ybb$a r9 = defpackage.ybb.Companion
            vh3$d r9 = vh3.d.a
            r5.e(r9)
            dx2$a r9 = new dx2$a
            ebb r0 = r5.I
            int r7 = r8.v
            r9.<init>(r0, r7)
            dx2 r0 = r5.A
            r8.t = r3
            r0.getClass()
            java.lang.Object r9 = defpackage.g5b.b(r0, r9, r8)
            if (r9 != r6) goto L45
            goto L64
        L45:
            xd3 r9 = (defpackage.xd3) r9
            zbb$a r0 = new zbb$a
            r0.<init>(r5, r4)
            r8.t = r2
            java.lang.Object r9 = defpackage.yd3.b(r9, r0, r8)
            if (r9 != r6) goto L55
            goto L64
        L55:
            xd3 r9 = (defpackage.xd3) r9
            zbb$b r0 = new zbb$b
            r0.<init>(r5, r4)
            r8.t = r1
            java.lang.Object r8 = defpackage.yd3.a(r9, r0, r8)
            if (r8 != r6) goto L65
        L64:
            return r6
        L65:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
