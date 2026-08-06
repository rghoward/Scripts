package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.account.presentation.AccountViewModel$onDeleteAccountOptionPicked$1", f = "AccountViewModel.kt", l = {261, 261}, m = "invokeSuspend", v = 2)
public final class i8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e8 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountViewModel$onDeleteAccountOptionPicked$1$1", f = "AccountViewModel.kt", l = {262}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super xd3<? extends Exception, ? extends g2b>>, Object> {
        public int t;
        public final /* synthetic */ e8 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e8 e8Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = e8Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(g2b g2bVar, r02<? super xd3<? extends Exception, ? extends g2b>> r02Var) {
            return ((a) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            rd6 rd6Var = this.u.E;
            rd6.a aVar = new rd6.a(true);
            this.t = 1;
            rd6Var.getClass();
            Object objB = g5b.b(rd6Var, aVar, this);
            v72 v72Var = v72.t;
            return objB == v72Var ? v72Var : objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            e8.g((e8) this.receiver, exc2);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(e8 e8Var, r02<? super i8> r02Var) {
        super(2, r02Var);
        this.u = e8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new i8(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((i8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r12 == r4) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.t
            r1 = 0
            r2 = 2
            r3 = 1
            e8 r6 = r11.u
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.dv8.b(r12)
            goto L40
        L13:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r11)
            return r1
        L19:
            defpackage.dv8.b(r12)
            goto L30
        L1d:
            defpackage.dv8.b(r12)
            bx2 r12 = r6.D
            g2b r0 = defpackage.g2b.a
            r11.t = r3
            r12.getClass()
            java.lang.Object r12 = defpackage.g5b.b(r12, r0, r11)
            if (r12 != r4) goto L30
            goto L3f
        L30:
            xd3 r12 = (defpackage.xd3) r12
            i8$a r0 = new i8$a
            r0.<init>(r6, r1)
            r11.t = r2
            java.lang.Object r12 = defpackage.yd3.d(r12, r0, r11)
            if (r12 != r4) goto L40
        L3f:
            return r4
        L40:
            xd3 r12 = (defpackage.xd3) r12
            r12.getClass()
            e8$a r11 = defpackage.e8.Companion
            b5$a r11 = b5.a.a
            r6.e(r11)
            g2b r11 = defpackage.g2b.a
            i8$b r4 = new i8$b
            java.lang.String r9 = "onError(Ljava/lang/Exception;)V"
            r10 = 0
            r5 = 1
            java.lang.Class<e8> r7 = defpackage.e8.class
            java.lang.String r8 = "onError"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            boolean r11 = r12 instanceof xd3.a
            if (r11 == 0) goto L67
            xd3$a r12 = (xd3.a) r12
            L r11 = r12.a
            r4.invoke(r11)
            goto L78
        L67:
            boolean r11 = r12 instanceof xd3.b
            if (r11 == 0) goto L7b
            xd3$b r12 = (xd3.b) r12
            R r11 = r12.a
            g2b r11 = (defpackage.g2b) r11
            g6 r11 = r6.x
            r11.b()
            g2b r11 = defpackage.g2b.a
        L78:
            g2b r11 = defpackage.g2b.a
            return r11
        L7b:
            defpackage.u.b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
