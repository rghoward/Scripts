package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.settings.presentation.AccountSettingsViewModel$updateAccountSettings$1", f = "AccountSettingsViewModel.kt", l = {115, 116, 117, 118}, m = "invokeSuspend", v = 2)
public final class q7 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ r7 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements ci4<z3b, r02<? super xd3<? extends Exception, ? extends z3b>>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(z3b z3bVar, r02<? super xd3<? extends Exception, ? extends z3b>> r02Var) {
            return r7.g((r7) this.receiver, z3bVar, r02Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<z3b, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(z3b z3bVar, r02<? super g2b> r02Var) {
            r7 r7Var = (r7) this.receiver;
            int i = r7.G;
            r7Var.getClass();
            r7Var.f(z3bVar.a ? y6.b.b : y6.a.b);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            Exception exc2 = exc;
            r7 r7Var = (r7) this.receiver;
            int i = r7.G;
            r7Var.getClass();
            rma.a.b(exc2);
            r7Var.f(new y6.c(r7Var.z.a(exc2)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(r7 r7Var, r02<? super q7> r02Var) {
        super(2, r02Var);
        this.u = r7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new q7(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((q7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ec A[PHI: r1
      0x00ec: PHI (r1v32 java.lang.Object) = (r1v31 java.lang.Object), (r1v36 java.lang.Object) binds: [B:46:0x00e9, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
    
        if (r0 == r14) goto L50;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
