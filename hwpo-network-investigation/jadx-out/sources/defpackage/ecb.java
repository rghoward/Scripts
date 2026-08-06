package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListViewModel$requestValues$1", f = "ValuesListViewModel.kt", l = {139, 140}, m = "invokeSuspend", v = 2)
public final class ecb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ybb u;
    public final /* synthetic */ String v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            Exception exc2 = exc;
            ybb ybbVar = (ybb) this.receiver;
            if (exc2 instanceof CancellationException) {
                ybb.a aVar = ybb.Companion;
                ybbVar.getClass();
            } else {
                boolean z = ybbVar.E.length() == 0;
                if (z) {
                    ybbVar.e(hbb.d.a);
                } else {
                    if (z) {
                        u.b();
                        return null;
                    }
                    ybbVar.e(hbb.g.a);
                    ybbVar.f(new kbb(ybbVar.D.a(exc2)));
                }
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecb(ybb ybbVar, String str, r02<? super ecb> r02Var) {
        super(2, r02Var);
        this.u = ybbVar;
        this.v = str;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ecb(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ecb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r12 == r10) goto L15;
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
            ybb r5 = r11.u
            v72 r10 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L19
            if (r0 != r1) goto L12
            defpackage.dv8.b(r12)
            goto L56
        L12:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r11)
            r11 = 0
            return r11
        L19:
            defpackage.dv8.b(r12)
            goto L3e
        L1d:
            defpackage.dv8.b(r12)
            hbb$e r12 = hbb.e.a
            ybb$a r0 = defpackage.ybb.Companion
            r5.e(r12)
            vq8$a r12 = new vq8$a
            ebb r0 = r5.I
            java.lang.String r3 = r11.v
            r12.<init>(r0, r2, r3)
            vq8 r0 = r5.y
            r11.t = r2
            r0.getClass()
            java.lang.Object r12 = defpackage.g5b.b(r0, r12, r11)
            if (r12 != r10) goto L3e
            goto L55
        L3e:
            xd3 r12 = (defpackage.xd3) r12
            ecb$a r3 = new ecb$a
            java.lang.String r8 = "dataRequestFailure(Ljava/lang/Exception;)V"
            r9 = 4
            r4 = 2
            java.lang.Class<ybb> r6 = defpackage.ybb.class
            java.lang.String r7 = "dataRequestFailure"
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.t = r1
            java.lang.Object r12 = defpackage.yd3.a(r12, r3, r11)
            if (r12 != r10) goto L56
        L55:
            return r10
        L56:
            xd3 r12 = (defpackage.xd3) r12
            r12.getClass()
            hbb$g r11 = hbb.g.a
            ybb$a r12 = defpackage.ybb.Companion
            r5.e(r11)
            g2b r11 = defpackage.g2b.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
