package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.account.presentation.AccountViewModel$onImagePicked$1", f = "AccountViewModel.kt", l = {143, 143, 152}, m = "invokeSuspend", v = 2)
public final class k8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e8 u;
    public final /* synthetic */ Uri v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountViewModel$onImagePicked$1$1", f = "AccountViewModel.kt", l = {144}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<rk4.a, r02<? super xd3<? extends Exception, ? extends g2b>>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ e8 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e8 e8Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = e8Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(rk4.a aVar, r02<? super xd3<? extends Exception, ? extends g2b>> r02Var) {
            return ((a) create(aVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            rk4.a aVar = (rk4.a) this.u;
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
            s3b s3bVar = this.v.B;
            s3b.a aVar2 = new s3b.a(aVar.a, aVar.b, aVar.c);
            this.u = null;
            this.t = 1;
            s3bVar.getClass();
            Object objB = g5b.b(s3bVar, aVar2, this);
            v72 v72Var = v72.t;
            return objB == v72Var ? v72Var : objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountViewModel$onImagePicked$1$2", f = "AccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ e8 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e8 e8Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = e8Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.u, r02Var);
            bVar.t = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            return ((b) create(exc, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Exception exc = (Exception) this.t;
            dv8.b(obj);
            e8.g(this.u, exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(e8 e8Var, Uri uri, r02<? super k8> r02Var) {
        super(2, r02Var);
        this.u = e8Var;
        this.v = uri;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new k8(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((k8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r8 == r6) goto L20;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.t
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            e8 r5 = r7.u
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r4) goto L20
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L16
            defpackage.dv8.b(r8)
            goto L57
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r1
        L1c:
            defpackage.dv8.b(r8)
            goto L47
        L20:
            defpackage.dv8.b(r8)
            goto L37
        L24:
            defpackage.dv8.b(r8)
            rk4 r8 = r5.z
            r7.t = r4
            r8.getClass()
            android.net.Uri r0 = r7.v
            java.lang.Object r8 = defpackage.g5b.b(r8, r0, r7)
            if (r8 != r6) goto L37
            goto L56
        L37:
            xd3 r8 = (defpackage.xd3) r8
            k8$a r0 = new k8$a
            r0.<init>(r5, r1)
            r7.t = r3
            java.lang.Object r8 = defpackage.yd3.d(r8, r0, r7)
            if (r8 != r6) goto L47
            goto L56
        L47:
            xd3 r8 = (defpackage.xd3) r8
            k8$b r0 = new k8$b
            r0.<init>(r5, r1)
            r7.t = r2
            java.lang.Object r8 = defpackage.yd3.a(r8, r0, r7)
            if (r8 != r6) goto L57
        L56:
            return r6
        L57:
            xd3 r8 = (defpackage.xd3) r8
            r8.getClass()
            e8$a r7 = defpackage.e8.Companion
            b5$a r7 = b5.a.a
            r5.e(r7)
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
