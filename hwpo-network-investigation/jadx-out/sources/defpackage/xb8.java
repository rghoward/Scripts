package defpackage;

import io.ably.lib.util.Log;
import io.intercom.android.sdk.models.Config;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.profile.presentation.profile.ProfileViewModel$onUserUpdated$1", f = "ProfileViewModel.kt", l = {98, Log.NONE, Config.DEFAULT_RATE_LIMIT_COUNT}, m = "invokeSuspend", v = 2)
public final class xb8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ zb8 u;
    public final /* synthetic */ h5b v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.profile.presentation.profile.ProfileViewModel$onUserUpdated$1$1", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public final /* synthetic */ zb8 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zb8 zb8Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.t = zb8Var;
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
            za8 za8Var = za8.b;
            int i = zb8.I;
            this.t.f(za8Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            Exception exc2 = exc;
            zb8 zb8Var = (zb8) this.receiver;
            int i = zb8.I;
            zb8Var.getClass();
            rma.a.b(exc2);
            zb8Var.e(va8.b.a);
            zb8Var.f(new ab8(zb8Var.B.a(exc2)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb8(zb8 zb8Var, h5b h5bVar, r02<? super xb8> r02Var) {
        super(2, r02Var);
        this.u = zb8Var;
        this.v = h5bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new xb8(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((xb8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r15, r7, r14) == r6) goto L20;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            int r0 = r14.t
            r1 = 0
            zb8 r2 = r14.u
            r3 = 3
            r4 = 2
            r5 = 1
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r5) goto L20
            if (r0 == r4) goto L1c
            if (r0 != r3) goto L16
            defpackage.dv8.b(r15)
            goto L63
        L16:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r14)
            return r1
        L1c:
            defpackage.dv8.b(r15)
            goto L49
        L20:
            defpackage.dv8.b(r15)
            goto L39
        L24:
            defpackage.dv8.b(r15)
            yj9 r15 = r2.z
            h5b r0 = r14.v
            s10 r0 = r0.p
            r14.t = r5
            r15.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r15, r0, r14)
            if (r15 != r6) goto L39
            goto L62
        L39:
            xd3 r15 = (defpackage.xd3) r15
            xb8$a r0 = new xb8$a
            r0.<init>(r2, r1)
            r14.t = r4
            java.lang.Object r15 = defpackage.yd3.b(r15, r0, r14)
            if (r15 != r6) goto L49
            goto L62
        L49:
            xd3 r15 = (defpackage.xd3) r15
            xb8$b r7 = new xb8$b
            java.lang.String r12 = "onError(Ljava/lang/Exception;)V"
            r13 = 4
            r8 = 2
            zb8 r9 = r14.u
            java.lang.Class<zb8> r10 = defpackage.zb8.class
            java.lang.String r11 = "onError"
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.t = r3
            java.lang.Object r14 = defpackage.yd3.a(r15, r7, r14)
            if (r14 != r6) goto L63
        L62:
            return r6
        L63:
            g2b r14 = defpackage.g2b.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
