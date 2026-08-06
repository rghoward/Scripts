package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$checkUserCanComment$1", f = "CommentsViewModel.kt", l = {121, 122}, m = "invokeSuspend", v = 2)
public final class sn1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qn1 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<Throwable, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Throwable th, r02<? super g2b> r02Var) {
            ((rma.a) this.receiver).b(th);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn1(qn1 qn1Var, r02<? super sn1> r02Var) {
        super(2, r02Var);
        this.u = qn1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new sn1(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((sn1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r14 == r5) goto L15;
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
            r1 = 0
            qn1 r4 = r13.u
            r2 = 2
            r3 = 1
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.dv8.b(r14)
            goto L4a
        L13:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r1
        L19:
            defpackage.dv8.b(r14)
            goto L30
        L1d:
            defpackage.dv8.b(r14)
            vb1 r14 = r4.M
            g2b r0 = defpackage.g2b.a
            r13.t = r3
            r14.getClass()
            java.lang.Object r14 = defpackage.g5b.b(r14, r0, r13)
            if (r14 != r5) goto L30
            goto L49
        L30:
            xd3 r14 = (defpackage.xd3) r14
            sn1$a r6 = new sn1$a
            rma$a r8 = defpackage.rma.a
            java.lang.String r11 = "e(Ljava/lang/Throwable;)V"
            r12 = 4
            r7 = 2
            java.lang.Class<rma$a> r9 = rma.a.class
            java.lang.String r10 = "e"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.t = r2
            java.lang.Object r14 = defpackage.yd3.a(r14, r6, r13)
            if (r14 != r5) goto L4a
        L49:
            return r5
        L4a:
            xd3 r14 = (defpackage.xd3) r14
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Object r13 = defpackage.yd3.e(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            int r14 = defpackage.qn1.a0
            if (r13 != 0) goto L7d
            ld5$a r13 = defpackage.ld5.Companion
            yn1 r2 = new yn1
            java.lang.String r7 = "disableInputClicked()V"
            r8 = 0
            r3 = 0
            java.lang.Class<qn1> r5 = defpackage.qn1.class
            java.lang.String r6 = "disableInputClicked"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r13.getClass()
            ld5 r5 = new ld5
            r7 = 2131951732(0x7f130074, float:1.9539887E38)
            r8 = 2131099840(0x7f0600c0, float:1.7812045E38)
            r6 = 0
            r10 = r2
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            goto L9f
        L7d:
            if (r13 != r3) goto Laa
            ld5$a r13 = defpackage.ld5.Companion
            zn1 r2 = new zn1
            java.lang.String r7 = "addButtonClicked()V"
            r8 = 0
            r3 = 0
            java.lang.Class<qn1> r5 = defpackage.qn1.class
            java.lang.String r6 = "addButtonClicked"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r13.getClass()
            ld5 r5 = new ld5
            r8 = 2131099742(0x7f06005e, float:1.7811846E38)
            r10 = 0
            r6 = 1
            r7 = 2131951644(0x7f13001c, float:1.9539708E38)
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10)
        L9f:
            qn1$a$a r13 = new qn1$a$a
            r13.<init>(r5)
            r4.e(r13)
            g2b r13 = defpackage.g2b.a
            return r13
        Laa:
            defpackage.u.b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
