package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.enter_value.EnterValueViewModel$onAttachmentActionClick$1", f = "EnterValueViewModel.kt", l = {227, 227}, m = "invokeSuspend", v = 2)
public final class kj3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ l89 u;
    public final /* synthetic */ fj3 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            fj3.g((fj3) this.receiver, exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj3(l89 l89Var, fj3 fj3Var, r02<? super kj3> r02Var) {
        super(2, r02Var);
        this.u = l89Var;
        this.v = fj3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new kj3(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((kj3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r13, r2, r12) == r11) goto L27;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.t
            r1 = 1
            fj3 r4 = r12.v
            r9 = 2
            l89 r10 = r12.u
            v72 r11 = defpackage.v72.t
            if (r0 == 0) goto L20
            if (r0 == r1) goto L1c
            if (r0 != r9) goto L15
            defpackage.dv8.b(r13)
            goto L91
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            r12 = 0
            return r12
        L1c:
            defpackage.dv8.b(r13)
            goto L79
        L20:
            defpackage.dv8.b(r13)
            z60 r13 = r10.E
            int r13 = r13.ordinal()
            if (r13 == r9) goto L64
            r12 = 3
            if (r13 == r12) goto L2f
            goto L9f
        L2f:
            fj3$a r12 = defpackage.fj3.Companion
            el0 r12 = r4.b()
            oj3 r12 = (defpackage.oj3) r12
            java.util.List<l89> r12 = r12.h
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L42:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r12.next()
            r1 = r0
            l89 r1 = (defpackage.l89) r1
            long r1 = r1.t
            long r5 = r10.t
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L42
            r13.add(r0)
            goto L42
        L5b:
            vh3$f r12 = new vh3$f
            r12.<init>(r13)
            r4.e(r12)
            goto L9f
        L64:
            s31$a r13 = new s31$a
            java.lang.String r0 = r10.w
            r13.<init>(r0)
            s31 r0 = r4.C
            r12.t = r1
            r0.getClass()
            java.lang.Object r13 = defpackage.g5b.b(r0, r13, r12)
            if (r13 != r11) goto L79
            goto L90
        L79:
            xd3 r13 = (defpackage.xd3) r13
            kj3$a r2 = new kj3$a
            java.lang.String r7 = "onError(Ljava/lang/Exception;)V"
            r8 = 4
            r3 = 2
            java.lang.Class<fj3> r5 = defpackage.fj3.class
            java.lang.String r6 = "onError"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r12.t = r9
            java.lang.Object r12 = defpackage.yd3.a(r13, r2, r12)
            if (r12 != r11) goto L91
        L90:
            return r11
        L91:
            vh3$f r12 = new vh3$f
            java.lang.String r13 = r10.w
            java.util.ArrayList r13 = defpackage.fj3.i(r4, r13)
            r12.<init>(r13)
            r4.e(r12)
        L9f:
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
