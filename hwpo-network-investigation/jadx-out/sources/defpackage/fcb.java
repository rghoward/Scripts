package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListViewModel$requestValuesNextPage$1", f = "ValuesListViewModel.kt", l = {151, 152}, m = "invokeSuspend", v = 2)
public final class fcb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ybb u;
    public final /* synthetic */ String v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            ybb ybbVar = (ybb) this.receiver;
            ybbVar.f(new kbb(ybbVar.D.a(exc)));
            ybbVar.e(hbb.h.a);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcb(ybb ybbVar, String str, r02<? super fcb> r02Var) {
        super(2, r02Var);
        this.u = ybbVar;
        this.v = str;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new fcb(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((fcb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
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
            goto L59
        L10:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r11)
            r11 = 0
            return r11
        L17:
            defpackage.dv8.b(r12)
            goto L3f
        L1b:
            defpackage.dv8.b(r12)
            hbb$f r12 = hbb.f.a
            ybb$a r0 = defpackage.ybb.Companion
            ybb r0 = r11.u
            r0.e(r12)
            vq8$a r12 = new vq8$a
            ebb r4 = r0.I
            r5 = 0
            java.lang.String r6 = r11.v
            r12.<init>(r4, r5, r6)
            vq8 r0 = r0.y
            r11.t = r2
            r0.getClass()
            java.lang.Object r12 = defpackage.g5b.b(r0, r12, r11)
            if (r12 != r3) goto L3f
            goto L58
        L3f:
            xd3 r12 = (defpackage.xd3) r12
            fcb$a r4 = new fcb$a
            java.lang.String r9 = "paginationFailure(Ljava/lang/Exception;)V"
            r10 = 4
            r5 = 2
            ybb r6 = r11.u
            java.lang.Class<ybb> r7 = defpackage.ybb.class
            java.lang.String r8 = "paginationFailure"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.t = r1
            java.lang.Object r11 = defpackage.yd3.a(r12, r4, r11)
            if (r11 != r3) goto L59
        L58:
            return r3
        L59:
            g2b r11 = defpackage.g2b.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
