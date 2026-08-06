package defpackage;

import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.FileReadScope$readData$2", f = "FileStorage.kt", l = {162, 170}, m = "invokeSuspend", v = 1)
public final class ox3 extends p6a implements oh4<r02<Object>, Object> {
    public FileInputStream t;
    public int u;
    public final /* synthetic */ px3<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox3(px3<Object> px3Var, r02<? super ox3> r02Var) {
        super(1, r02Var);
        this.v = px3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new ox3(this.v, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<Object> r02Var) {
        return ((ox3) create(r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r9 == r6) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            px3<java.lang.Object> r0 = r8.v
            wd9<T> r1 = r0.b
            java.io.File r0 = r0.a
            int r2 = r8.u
            r3 = 2
            r4 = 1
            r5 = 0
            v72 r6 = defpackage.v72.t
            if (r2 == 0) goto L29
            if (r2 == r4) goto L21
            if (r2 != r3) goto L1b
            java.io.FileInputStream r8 = r8.t
            defpackage.dv8.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L5f
        L19:
            r9 = move-exception
            goto L69
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r5
        L21:
            java.io.FileInputStream r2 = r8.t
            defpackage.dv8.b(r9)     // Catch: java.lang.Throwable -> L27
            goto L3c
        L27:
            r9 = move-exception
            goto L40
        L29:
            defpackage.dv8.b(r9)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L46
            r2.<init>(r0)     // Catch: java.io.FileNotFoundException -> L46
            r8.t = r2     // Catch: java.lang.Throwable -> L27
            r8.u = r4     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r1.c(r2)     // Catch: java.lang.Throwable -> L27
            if (r9 != r6) goto L3c
            goto L5b
        L3c:
            defpackage.fg1.a(r2, r5)     // Catch: java.io.FileNotFoundException -> L46
            return r9
        L40:
            throw r9     // Catch: java.lang.Throwable -> L41
        L41:
            r4 = move-exception
            defpackage.fg1.a(r2, r9)     // Catch: java.io.FileNotFoundException -> L46
            throw r4     // Catch: java.io.FileNotFoundException -> L46
        L46:
            boolean r9 = r0.exists()
            if (r9 == 0) goto L7e
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L63
            r9.<init>(r0)     // Catch: java.lang.Exception -> L63
            r8.t = r9     // Catch: java.lang.Throwable -> L65
            r8.u = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r8 = r1.c(r9)     // Catch: java.lang.Throwable -> L65
            if (r8 != r6) goto L5c
        L5b:
            return r6
        L5c:
            r7 = r9
            r9 = r8
            r8 = r7
        L5f:
            defpackage.fg1.a(r8, r5)     // Catch: java.lang.Exception -> L63
            goto L82
        L63:
            r8 = move-exception
            goto L6f
        L65:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L69:
            throw r9     // Catch: java.lang.Throwable -> L6a
        L6a:
            r1 = move-exception
            defpackage.fg1.a(r8, r9)     // Catch: java.lang.Exception -> L63
            throw r1     // Catch: java.lang.Exception -> L63
        L6f:
            boolean r9 = r8 instanceof java.io.FileNotFoundException
            if (r9 == 0) goto L7d
            java.lang.String r9 = r0.getParent()
            java.io.FileNotFoundException r8 = (java.io.FileNotFoundException) r8
            java.lang.Exception r8 = defpackage.v03.a(r9, r8)
        L7d:
            throw r8
        L7e:
            java.lang.Object r9 = r1.a()
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
