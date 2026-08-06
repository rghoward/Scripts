package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class av7 implements kw9 {
    public final hy0 t;
    public final tx0 u;
    public f99 v;
    public int w;
    public boolean x;
    public long y;

    public av7(hy0 hy0Var) {
        this.t = hy0Var;
        tx0 tx0VarJ = hy0Var.j();
        this.u = tx0VarJ;
        f99 f99Var = tx0VarJ.t;
        this.v = f99Var;
        this.w = f99Var != null ? f99Var.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.kw9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long O(defpackage.tx0 r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.x
            if (r3 != 0) goto L5f
            f99 r3 = r8.v
            tx0 r4 = r8.u
            if (r3 == 0) goto L27
            f99 r5 = r4.t
            if (r3 != r5) goto L21
            int r3 = r8.w
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.aa0.c(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.y
            r2 = 1
            long r0 = r0 + r2
            hy0 r2 = r8.t
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            f99 r0 = r8.v
            if (r0 != 0) goto L48
            f99 r0 = r4.t
            if (r0 == 0) goto L48
            r8.v = r0
            int r0 = r0.b
            r8.w = r0
        L48:
            long r0 = r4.u
            long r2 = r8.y
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            tx0 r2 = r8.u
            long r4 = r8.y
            r3 = r9
            r2.t(r3, r4, r6)
            long r9 = r8.y
            long r9 = r9 + r6
            r8.y = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.aa0.c(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.d43.b(r10, r8)
            defpackage.ca0.a(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av7.O(tx0, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.x = true;
    }

    @Override // defpackage.kw9
    public final voa timeout() {
        return this.t.timeout();
    }
}
