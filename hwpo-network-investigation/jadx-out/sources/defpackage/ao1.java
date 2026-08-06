package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$onCommentReported$1", f = "CommentsViewModel.kt", l = {261, 262}, m = "invokeSuspend", v = 2)
public final class ao1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ long u;
    public final /* synthetic */ qn1 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<Throwable, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Throwable th, r02<? super g2b> r02Var) {
            ((rma.a) this.receiver).b(th);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao1(long j, qn1 qn1Var, r02<? super ao1> r02Var) {
        super(2, r02Var);
        this.u = j;
        this.v = qn1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ao1(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ao1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r12, r4, r11) == r3) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.t
            r1 = 2
            r2 = 1
            v72 r3 = defpackage.v72.t
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.dv8.b(r12)
            goto L4f
        L10:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r11)
            r11 = 0
            return r11
        L17:
            defpackage.dv8.b(r12)
            goto L35
        L1b:
            defpackage.dv8.b(r12)
            hx2$a r12 = new hx2$a
            long r4 = r11.u
            r12.<init>(r4)
            qn1 r0 = r11.v
            hx2 r0 = r0.I
            r11.t = r2
            r0.getClass()
            java.lang.Object r12 = defpackage.g5b.b(r0, r12, r11)
            if (r12 != r3) goto L35
            goto L4e
        L35:
            xd3 r12 = (defpackage.xd3) r12
            ao1$a r4 = new ao1$a
            rma$a r6 = defpackage.rma.a
            java.lang.String r9 = "e(Ljava/lang/Throwable;)V"
            r10 = 4
            r5 = 2
            java.lang.Class<rma$a> r7 = rma.a.class
            java.lang.String r8 = "e"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.t = r1
            java.lang.Object r11 = defpackage.yd3.a(r12, r4, r11)
            if (r11 != r3) goto L4f
        L4e:
            return r3
        L4f:
            g2b r11 = defpackage.g2b.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
