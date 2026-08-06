package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.enter_value.EnterValueViewModel$attachmentsPicked$1", f = "EnterValueViewModel.kt", l = {311, 311}, m = "invokeSuspend", v = 2)
public final class gj3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ u60 u;
    public final /* synthetic */ rc9 v;
    public final /* synthetic */ fj3 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            fj3.g((fj3) this.receiver, exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj3(u60 u60Var, rc9 rc9Var, fj3 fj3Var, r02<? super gj3> r02Var) {
        super(2, r02Var);
        this.u = u60Var;
        this.v = rc9Var;
        this.w = fj3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new gj3(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((gj3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b0, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r1, r5, r22) == r12) goto L18;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            r22 = this;
            r0 = r22
            rc9 r1 = r0.v
            android.net.Uri r1 = r1.b
            int r2 = r0.t
            r3 = 2
            r4 = 1
            fj3 r7 = r0.w
            v72 r12 = defpackage.v72.t
            if (r2 == 0) goto L26
            if (r2 == r4) goto L20
            if (r2 != r3) goto L19
            defpackage.dv8.b(r23)
            goto Lb3
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r0)
            r0 = 0
            return r0
        L20:
            defpackage.dv8.b(r23)
            r1 = r23
            goto L9b
        L26:
            defpackage.dv8.b(r23)
            android.content.ContentResolver r2 = r7.F
            r2.getClass()
            l89 r13 = new l89
            rh8$a r5 = defpackage.rh8.t
            r5.getClass()
            k2 r5 = defpackage.rh8.u
            java.util.Random r5 = r5.a()
            long r14 = r5.nextLong()
            java.lang.String r16 = defpackage.wy3.a(r2, r1)
            java.lang.String r18 = r1.toString()
            r18.getClass()
            java.lang.String r19 = r1.toString()
            r19.getClass()
            java.lang.String r20 = r1.toString()
            r20.getClass()
            java.lang.String r2 = defpackage.wy3.b(r2, r1)
            if (r2 != 0) goto L60
            java.lang.String r2 = ""
        L60:
            r21 = r2
            u60 r2 = r0.u
            r17 = r2
            r13.<init>(r14, r16, r17, r18, r19, r20, r21)
            vh3$f r2 = new vh3$f
            java.util.List r5 = defpackage.ws0.h(r13)
            el0 r6 = r7.b()
            oj3 r6 = (defpackage.oj3) r6
            java.util.List<l89> r6 = r6.h
            java.util.ArrayList r5 = defpackage.th1.K(r5, r6)
            r2.<init>(r5)
            r7.e(r2)
            oz9$a r2 = new oz9$a
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r2.<init>(r1)
            oz9 r1 = r7.B
            r0.t = r4
            r1.getClass()
            java.lang.Object r1 = defpackage.g5b.b(r1, r2, r0)
            if (r1 != r12) goto L9b
            goto Lb2
        L9b:
            xd3 r1 = (defpackage.xd3) r1
            gj3$a r5 = new gj3$a
            java.lang.String r10 = "onError(Ljava/lang/Exception;)V"
            r11 = 4
            r6 = 2
            java.lang.Class<fj3> r8 = defpackage.fj3.class
            java.lang.String r9 = "onError"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.t = r3
            java.lang.Object r0 = defpackage.yd3.a(r1, r5, r0)
            if (r0 != r12) goto Lb3
        Lb2:
            return r12
        Lb3:
            g2b r0 = defpackage.g2b.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
