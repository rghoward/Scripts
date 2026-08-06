package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.report.presentation.other_reason.OtherReasonViewModel$onSendClicked$1", f = "OtherReasonViewModel.kt", l = {55, 56, 62}, m = "invokeSuspend", v = 2)
public final class vl7 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ wl7 u;
    public final /* synthetic */ String v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.report.presentation.other_reason.OtherReasonViewModel$onSendClicked$1$1", f = "OtherReasonViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public final /* synthetic */ wl7 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wl7 wl7Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.t = wl7Var;
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
            wl7 wl7Var = this.t;
            wl7Var.x.c(wl7Var.B, wl7Var.z.b(R.string.something_else, new Object[0]));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.report.presentation.other_reason.OtherReasonViewModel$onSendClicked$1$2", f = "OtherReasonViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ wl7 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wl7 wl7Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = wl7Var;
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
            wl7 wl7Var = this.u;
            wl7Var.f(new am7(wl7Var.A.a(exc)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl7(wl7 wl7Var, String str, r02<? super vl7> r02Var) {
        super(2, r02Var);
        this.u = wl7Var;
        this.v = str;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new vl7(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((vl7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r14 == r6) goto L20;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            int r0 = r13.t
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            wl7 r5 = r13.u
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L16
            defpackage.dv8.b(r14)
            goto L67
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r4
        L1c:
            defpackage.dv8.b(r14)
            goto L57
        L20:
            defpackage.dv8.b(r14)
            goto L47
        L24:
            defpackage.dv8.b(r14)
            eo8$a r7 = new eo8$a
            long r8 = r5.B
            int r10 = r5.C
            java.lang.Integer r11 = r5.D
            java.lang.String r12 = r13.v
            r7.<init>(r8, r10, r11, r12)
            ll7$b r14 = ll7.b.a
            r5.e(r14)
            eo8 r14 = r5.y
            r13.t = r3
            r14.getClass()
            java.lang.Object r14 = defpackage.g5b.b(r14, r7, r13)
            if (r14 != r6) goto L47
            goto L66
        L47:
            xd3 r14 = (defpackage.xd3) r14
            vl7$a r0 = new vl7$a
            r0.<init>(r5, r4)
            r13.t = r2
            java.lang.Object r14 = defpackage.yd3.b(r14, r0, r13)
            if (r14 != r6) goto L57
            goto L66
        L57:
            xd3 r14 = (defpackage.xd3) r14
            vl7$b r0 = new vl7$b
            r0.<init>(r5, r4)
            r13.t = r1
            java.lang.Object r14 = defpackage.yd3.a(r14, r0, r13)
            if (r14 != r6) goto L67
        L66:
            return r6
        L67:
            xd3 r14 = (defpackage.xd3) r14
            r14.getClass()
            int r13 = defpackage.wl7.G
            ll7$c r13 = ll7.c.a
            r5.e(r13)
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
