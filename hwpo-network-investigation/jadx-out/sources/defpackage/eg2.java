package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {145, 146}, m = "invokeSuspend", v = 1)
public final class eg2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ xf2<Object> u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ xf2<T> t;

        public a(xf2<T> xf2Var) {
            this.t = xf2Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) throws Throwable {
            xf2<T> xf2Var = this.t;
            if (xf2Var.h.a() instanceof yz3) {
                return g2b.a;
            }
            Object objF = xf2.f(xf2Var, true, r02Var);
            return objF == v72.t ? objF : g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg2(xf2<Object> xf2Var, r02<? super eg2> r02Var) {
        super(2, r02Var);
        this.u = xf2Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new eg2(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((eg2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r6.collect(r0, r5) == r4) goto L18;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.t
            r1 = 2
            r2 = 1
            xf2<java.lang.Object> r3 = r5.u
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L19
            if (r0 != r1) goto L12
            defpackage.dv8.b(r6)
            goto L4f
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r5)
            r5 = 0
            return r5
        L19:
            defpackage.dv8.b(r6)
            goto L34
        L1d:
            defpackage.dv8.b(r6)
            xf2<T>$a r6 = r3.i
            r5.t = r2
            java.lang.Object r6 = r6.b
            bp1 r6 = (defpackage.bp1) r6
            java.lang.Object r6 = r6.w(r5)
            if (r6 != r4) goto L2f
            goto L31
        L2f:
            g2b r6 = defpackage.g2b.a
        L31:
            if (r6 != r4) goto L34
            goto L4e
        L34:
            pg5 r6 = r3.h()
            r54 r6 = r6.d()
            r0 = -1
            r54 r6 = defpackage.yk2.c(r6, r0)
            eg2$a r0 = new eg2$a
            r0.<init>(r3)
            r5.t = r1
            java.lang.Object r5 = r6.collect(r0, r5)
            if (r5 != r4) goto L4f
        L4e:
            return r4
        L4f:
            g2b r5 = defpackage.g2b.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
