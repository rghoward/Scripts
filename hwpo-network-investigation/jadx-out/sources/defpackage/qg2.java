package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {372, 373}, m = "invokeSuspend", v = 1)
public final class qg2 extends p6a implements ci4<brb<Object>, r02<? super g2b>, Object> {
    public el8 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ el8 w;
    public final /* synthetic */ xf2<Object> x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg2(el8 el8Var, xf2<Object> xf2Var, Object obj, boolean z, r02<? super qg2> r02Var) {
        super(2, r02Var);
        this.w = el8Var;
        this.x = xf2Var;
        this.y = obj;
        this.z = z;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        qg2 qg2Var = new qg2(this.w, this.x, this.y, this.z, r02Var);
        qg2Var.v = obj;
        return qg2Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(brb<Object> brbVar, r02<? super g2b> r02Var) {
        return ((qg2) create(brbVar, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r6.d(r2, r8) == r7) goto L16;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.u
            r1 = 0
            java.lang.Object r2 = r8.y
            xf2<java.lang.Object> r3 = r8.x
            el8 r4 = r8.w
            r5 = 2
            r6 = 1
            v72 r7 = defpackage.v72.t
            if (r0 == 0) goto L27
            if (r0 == r6) goto L1d
            if (r0 != r5) goto L17
            defpackage.dv8.b(r9)
            goto L57
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r1
        L1d:
            el8 r0 = r8.t
            java.lang.Object r6 = r8.v
            brb r6 = (defpackage.brb) r6
            defpackage.dv8.b(r9)
            goto L42
        L27:
            defpackage.dv8.b(r9)
            java.lang.Object r9 = r8.v
            brb r9 = (defpackage.brb) r9
            pg5 r0 = r3.h()
            r8.v = r9
            r8.t = r4
            r8.u = r6
            java.lang.Object r0 = r0.b(r8)
            if (r0 != r7) goto L3f
            goto L56
        L3f:
            r6 = r9
            r9 = r0
            r0 = r4
        L42:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.t = r9
            r8.v = r1
            r8.t = r1
            r8.u = r5
            java.lang.Object r9 = r6.d(r2, r8)
            if (r9 != r7) goto L57
        L56:
            return r7
        L57:
            boolean r8 = r8.z
            if (r8 == 0) goto L6f
            rg2 r8 = r3.h
            ne2 r9 = new ne2
            if (r2 == 0) goto L66
            int r0 = r2.hashCode()
            goto L67
        L66:
            r0 = 0
        L67:
            int r1 = r4.t
            r9.<init>(r0, r1, r2)
            r8.b(r9)
        L6f:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
