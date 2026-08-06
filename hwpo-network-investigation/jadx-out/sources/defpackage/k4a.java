package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class k4a<T> implements s54<T> {
    public final s54<T> t;
    public final m11 u;

    public k4a(s54 s54Var, m11 m11Var) {
        this.t = s54Var;
        this.u = m11Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (((defpackage.k4a) r3).a(r0) == r6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.u02 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.j4a
            if (r0 == 0) goto L13
            r0 = r9
            j4a r0 = (defpackage.j4a) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            j4a r0 = new j4a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            int r1 = r0.w
            r2 = 0
            s54<T> r3 = r8.t
            r4 = 2
            r5 = 1
            v72 r6 = defpackage.v72.t
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2d
            defpackage.dv8.b(r9)
            goto L69
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r2
        L33:
            kz8 r8 = r0.t
            defpackage.dv8.b(r9)     // Catch: java.lang.Throwable -> L39
            goto L55
        L39:
            r9 = move-exception
            goto L73
        L3b:
            defpackage.dv8.b(r9)
            kz8 r9 = new kz8
            h72 r1 = r0.getContext()
            r9.<init>(r3, r1)
            m11 r8 = r8.u     // Catch: java.lang.Throwable -> L6f
            r0.t = r9     // Catch: java.lang.Throwable -> L6f
            r0.w = r5     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.invoke(r9, r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r6) goto L54
            goto L68
        L54:
            r8 = r9
        L55:
            r8.releaseIntercepted()
            boolean r8 = r3 instanceof defpackage.k4a
            if (r8 == 0) goto L6c
            k4a r3 = (defpackage.k4a) r3
            r0.t = r2
            r0.w = r4
            java.lang.Object r8 = r3.a(r0)
            if (r8 != r6) goto L69
        L68:
            return r6
        L69:
            g2b r8 = defpackage.g2b.a
            return r8
        L6c:
            g2b r8 = defpackage.g2b.a
            return r8
        L6f:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L73:
            r8.releaseIntercepted()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k4a.a(u02):java.lang.Object");
    }

    @Override // defpackage.s54
    public final Object emit(T t, r02<? super g2b> r02Var) {
        return this.t.emit(t, r02Var);
    }
}
