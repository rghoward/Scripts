package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.reschedule.presentation.RescheduleViewModel$getMaxDay$1", f = "RescheduleViewModel.kt", l = {92, 93, 94}, m = "invokeSuspend", v = 2)
public final class at8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ct8 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.reschedule.presentation.RescheduleViewModel$getMaxDay$1$1", f = "RescheduleViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<Integer, r02<? super g2b>, Object> {
        public /* synthetic */ int t;
        public final /* synthetic */ ct8 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ct8 ct8Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = ct8Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.u, r02Var);
            aVar.t = ((Number) obj).intValue();
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Integer num, r02<? super g2b> r02Var) {
            return ((a) create(Integer.valueOf(num.intValue()), r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            dv8.b(obj);
            yr8.g gVar = new yr8.g(i);
            int i2 = ct8.L;
            this.u.e(gVar);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.reschedule.presentation.RescheduleViewModel$getMaxDay$1$2", f = "RescheduleViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public final /* synthetic */ ct8 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ct8 ct8Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.t = ct8Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new b(this.t, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            return ((b) create(exc, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            int i = ct8.L;
            this.t.e(yr8.d.a);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at8(ct8 ct8Var, r02<? super at8> r02Var) {
        super(2, r02Var);
        this.u = ct8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new at8(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((at8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r9 == r6) goto L24;
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
            r2 = 3
            r3 = 2
            r4 = 1
            ct8 r5 = r8.u
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r4) goto L20
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L16
            defpackage.dv8.b(r9)
            goto L76
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r1
        L1c:
            defpackage.dv8.b(r9)
            goto L66
        L20:
            defpackage.dv8.b(r9)
            goto L56
        L24:
            defpackage.dv8.b(r9)
            yr8$e r9 = new yr8$e
            r9.<init>()
            int r0 = defpackage.ct8.L
            r5.e(r9)
            dl4 r9 = r5.A
            q09 r0 = r5.y
            java.lang.String r7 = "com.hwpo_training_app.reschedule.presentation.RescheduleFragment.PLAN_ID"
            java.lang.Object r0 = r0.a(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L44
            int r0 = r0.intValue()
            goto L45
        L44:
            r0 = 0
        L45:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r0)
            r8.t = r4
            r9.getClass()
            java.lang.Object r9 = defpackage.g5b.b(r9, r7, r8)
            if (r9 != r6) goto L56
            goto L75
        L56:
            xd3 r9 = (defpackage.xd3) r9
            at8$a r0 = new at8$a
            r0.<init>(r5, r1)
            r8.t = r3
            java.lang.Object r9 = defpackage.yd3.b(r9, r0, r8)
            if (r9 != r6) goto L66
            goto L75
        L66:
            xd3 r9 = (defpackage.xd3) r9
            at8$b r0 = new at8$b
            r0.<init>(r5, r1)
            r8.t = r2
            java.lang.Object r9 = defpackage.yd3.a(r9, r0, r8)
            if (r9 != r6) goto L76
        L75:
            return r6
        L76:
            xd3 r9 = (defpackage.xd3) r9
            r9.getClass()
            int r8 = defpackage.ct8.L
            yr8$a r8 = yr8.a.a
            r5.e(r8)
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
