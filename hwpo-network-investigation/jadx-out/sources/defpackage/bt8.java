package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.reschedule.presentation.RescheduleViewModel$onSaveClicked$1", f = "RescheduleViewModel.kt", l = {121, 122, 123}, m = "invokeSuspend", v = 2)
public final class bt8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ct8 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.reschedule.presentation.RescheduleViewModel$onSaveClicked$1$1", f = "RescheduleViewModel.kt", l = {122}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ ct8 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ct8 ct8Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = ct8Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
            return ((a) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                ct8 ct8Var = this.u;
                ct8Var.f(new bs8.b(ct8Var.C.b(R.string.reschedule_success_message, new Object[0])));
                Object objA = ct8Var.D.a(a87.f.a, this);
                v72 v72Var = v72.t;
                if (objA != v72Var) {
                    objA = g2b.a;
                }
                if (objA == v72Var) {
                    return v72Var;
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            ct8 ct8Var = (ct8) this.receiver;
            tl3 tl3VarB = ct8Var.B.b(exc);
            tl3.a aVar = tl3VarB.b;
            String str = tl3VarB.a;
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                ct8Var.e(new yr8.c(str));
            } else {
                if (iOrdinal != 1) {
                    u.b();
                    return null;
                }
                ct8Var.f(new bs8.a(str));
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt8(ct8 ct8Var, r02<? super bt8> r02Var) {
        super(2, r02Var);
        this.u = ct8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new bt8(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((bt8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r14, r5, r13) == r12) goto L22;
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
            ct8 r7 = r13.u
            v72 r12 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L16
            defpackage.dv8.b(r14)
            goto L85
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r4
        L1c:
            defpackage.dv8.b(r14)
            goto L6d
        L20:
            defpackage.dv8.b(r14)
            goto L5d
        L24:
            defpackage.dv8.b(r14)
            us8$a r14 = new us8$a
            int r0 = defpackage.ct8.L
            el0 r0 = r7.b()
            dt8 r0 = (defpackage.dt8) r0
            int r0 = r0.a
            j$.time.LocalDate r5 = j$.time.LocalDate.now()
            java.lang.String r5 = r5.toString()
            r5.getClass()
            el0 r6 = r7.b()
            dt8 r6 = (defpackage.dt8) r6
            java.lang.Integer r6 = r6.e
            if (r6 == 0) goto L88
            int r6 = r6.intValue()
            r14.<init>(r0, r6, r5)
            us8 r0 = r7.z
            r13.t = r3
            r0.getClass()
            java.lang.Object r14 = defpackage.g5b.b(r0, r14, r13)
            if (r14 != r12) goto L5d
            goto L84
        L5d:
            xd3 r14 = (defpackage.xd3) r14
            bt8$a r0 = new bt8$a
            r0.<init>(r7, r4)
            r13.t = r2
            java.lang.Object r14 = defpackage.yd3.b(r14, r0, r13)
            if (r14 != r12) goto L6d
            goto L84
        L6d:
            xd3 r14 = (defpackage.xd3) r14
            bt8$b r5 = new bt8$b
            java.lang.String r10 = "onError(Ljava/lang/Exception;)V"
            r11 = 4
            r6 = 2
            java.lang.Class<ct8> r8 = defpackage.ct8.class
            java.lang.String r9 = "onError"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.t = r1
            java.lang.Object r13 = defpackage.yd3.a(r14, r5, r13)
            if (r13 != r12) goto L85
        L84:
            return r12
        L85:
            g2b r13 = defpackage.g2b.a
            return r13
        L88:
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
