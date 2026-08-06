package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {403, 404, 406}, m = "invokeSuspend", v = 1)
public final class lg2 extends p6a implements oh4<r02<? super g2b>, Object> {
    public Serializable t;
    public int u;
    public final /* synthetic */ gl8<Object> v;
    public final /* synthetic */ xf2<Object> w;
    public final /* synthetic */ el8 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg2(gl8<Object> gl8Var, xf2<Object> xf2Var, el8 el8Var, r02<? super lg2> r02Var) {
        super(1, r02Var);
        this.v = gl8Var;
        this.w = xf2Var;
        this.x = el8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new lg2(this.v, this.w, this.x, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((lg2) create(r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r9 == r7) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.u
            el8 r1 = r8.x
            gl8<java.lang.Object> r2 = r8.v
            r3 = 3
            r4 = 2
            xf2<java.lang.Object> r5 = r8.w
            r6 = 1
            v72 r7 = defpackage.v72.t
            if (r0 == 0) goto L35
            if (r0 == r6) goto L2d
            if (r0 == r4) goto L25
            if (r0 != r3) goto L1e
            java.io.Serializable r8 = r8.t
            r1 = r8
            el8 r1 = (defpackage.el8) r1
            defpackage.dv8.b(r9)
            goto L6c
        L1e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            r8 = 0
            return r8
        L25:
            java.io.Serializable r0 = r8.t
            el8 r0 = (defpackage.el8) r0
            defpackage.dv8.b(r9)     // Catch: defpackage.z72 -> L5f
            goto L56
        L2d:
            java.io.Serializable r0 = r8.t
            gl8 r0 = (defpackage.gl8) r0
            defpackage.dv8.b(r9)     // Catch: defpackage.z72 -> L5f
            goto L44
        L35:
            defpackage.dv8.b(r9)
            r8.t = r2     // Catch: defpackage.z72 -> L5f
            r8.u = r6     // Catch: defpackage.z72 -> L5f
            java.lang.Object r9 = r5.i(r8)     // Catch: defpackage.z72 -> L5f
            if (r9 != r7) goto L43
            goto L6b
        L43:
            r0 = r2
        L44:
            r0.t = r9     // Catch: defpackage.z72 -> L5f
            pg5 r9 = r5.h()     // Catch: defpackage.z72 -> L5f
            r8.t = r1     // Catch: defpackage.z72 -> L5f
            r8.u = r4     // Catch: defpackage.z72 -> L5f
            java.lang.Object r9 = r9.a(r8)     // Catch: defpackage.z72 -> L5f
            if (r9 != r7) goto L55
            goto L6b
        L55:
            r0 = r1
        L56:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: defpackage.z72 -> L5f
            int r9 = r9.intValue()     // Catch: defpackage.z72 -> L5f
            r0.t = r9     // Catch: defpackage.z72 -> L5f
            goto L74
        L5f:
            T r9 = r2.t
            r8.t = r1
            r8.u = r3
            java.lang.Object r9 = r5.j(r9, r6, r8)
            if (r9 != r7) goto L6c
        L6b:
            return r7
        L6c:
            java.lang.Number r9 = (java.lang.Number) r9
            int r8 = r9.intValue()
            r1.t = r8
        L74:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
