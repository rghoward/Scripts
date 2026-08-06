package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {78, 79}, m = "invokeSuspend", v = 1)
public final class d17 extends p6a implements ci4<ua8<? super g2b>, r02<? super g2b>, Object> {
    public a17 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ File w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d17(File file, r02<? super d17> r02Var) {
        super(2, r02Var);
        this.w = file;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        d17 d17Var = new d17(this.w, r02Var);
        d17Var.v = obj;
        return d17Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(ua8<? super g2b> ua8Var, r02<? super g2b> r02Var) {
        return ((d17) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (defpackage.qa8.a(r4, r10, r9) == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [e33] */
    /* JADX WARN: Type inference failed for: r5v0, types: [b17, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [a17] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            v72 r0 = defpackage.v72.t
            int r1 = r9.u
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L18
            if (r1 != r2) goto L12
            defpackage.dv8.b(r10)
            goto L95
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r9)
            return r3
        L18:
            a17 r1 = r9.t
            java.lang.Object r4 = r9.v
            ua8 r4 = (defpackage.ua8) r4
            defpackage.dv8.b(r10)
            goto L83
        L22:
            defpackage.dv8.b(r10)
            java.lang.Object r10 = r9.v
            ua8 r10 = (defpackage.ua8) r10
            java.io.File r1 = r9.w
            b17 r5 = new b17
            r5.<init>()
            java.lang.Object r6 = defpackage.e17.b
            java.io.File r1 = r1.getParentFile()
            r1.getClass()
            java.io.File r1 = r1.getCanonicalFile()
            java.lang.String r1 = r1.getPath()
            java.lang.Object r6 = defpackage.e17.b
            monitor-enter(r6)
            java.util.LinkedHashMap r7 = defpackage.e17.c     // Catch: java.lang.Throwable -> L58
            java.lang.Object r8 = r7.get(r1)     // Catch: java.lang.Throwable -> L58
            if (r8 != 0) goto L5a
            e17 r8 = new e17     // Catch: java.lang.Throwable -> L58
            r1.getClass()     // Catch: java.lang.Throwable -> L58
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L58
            r7.put(r1, r8)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r9 = move-exception
            goto L98
        L5a:
            e17 r8 = (defpackage.e17) r8     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.CopyOnWriteArrayList<oh4<java.lang.String, g2b>> r7 = r8.a     // Catch: java.lang.Throwable -> L58
            r7.add(r5)     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.CopyOnWriteArrayList<oh4<java.lang.String, g2b>> r7 = r8.a     // Catch: java.lang.Throwable -> L58
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L58
            if (r7 != r4) goto L6c
            r8.startWatching()     // Catch: java.lang.Throwable -> L58
        L6c:
            monitor-exit(r6)
            a17 r6 = new a17
            r6.<init>()
            g2b r1 = defpackage.g2b.a
            r9.v = r10
            r9.t = r6
            r9.u = r4
            java.lang.Object r1 = r10.a(r9, r1)
            if (r1 != r0) goto L81
            goto L94
        L81:
            r4 = r10
            r1 = r6
        L83:
            c17 r10 = new c17
            r10.<init>()
            r9.v = r3
            r9.t = r3
            r9.u = r2
            java.lang.Object r9 = defpackage.qa8.a(r4, r10, r9)
            if (r9 != r0) goto L95
        L94:
            return r0
        L95:
            g2b r9 = defpackage.g2b.a
            return r9
        L98:
            monitor-exit(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d17.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
