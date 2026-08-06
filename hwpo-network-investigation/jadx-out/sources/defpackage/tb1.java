package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tb1 extends g5b<g2b, g2b> {
    public final w5b a;
    public final xg5 b;

    public tb1(w5b w5bVar, xg5 xg5Var) {
        w5bVar.getClass();
        xg5Var.getClass();
        this.a = w5bVar;
        this.b = xg5Var;
    }

    @Override // defpackage.g5b
    public final /* bridge */ /* synthetic */ Object a(Object obj, g5b.b bVar) {
        return c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[PHI: r10
      0x0082: PHI (r10v5 boolean) = (r10v4 boolean), (r10v9 boolean) binds: [B:30:0x007f, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r5.f(r0) == r8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.r02 r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.sb1
            if (r0 == 0) goto L13
            r0 = r11
            sb1 r0 = (defpackage.sb1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L1a
        L13:
            sb1 r0 = new sb1
            u02 r11 = (defpackage.u02) r11
            r0.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r0.v
            int r1 = r0.x
            r2 = 4
            r3 = 3
            r4 = 2
            w5b r5 = r10.a
            r6 = 1
            r7 = 0
            v72 r8 = defpackage.v72.t
            if (r1 == 0) goto L4d
            if (r1 == r6) goto L49
            if (r1 == r4) goto L41
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L35
            defpackage.dv8.b(r11)
            goto L8d
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r10)
            return r7
        L3b:
            boolean r10 = r0.u
            defpackage.dv8.b(r11)
            goto L82
        L41:
            boolean r10 = r0.u
            xg5 r1 = r0.t
            defpackage.dv8.b(r11)
            goto L73
        L49:
            defpackage.dv8.b(r11)
            goto L59
        L4d:
            defpackage.dv8.b(r11)
            r0.x = r6
            java.lang.Object r11 = r5.k(r0)
            if (r11 != r8) goto L59
            goto L8c
        L59:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L90
            xg5 r1 = r10.b
            r0.t = r1
            r0.u = r11
            r0.x = r4
            java.lang.Object r10 = r5.c(r0)
            if (r10 != r8) goto L70
            goto L8c
        L70:
            r9 = r11
            r11 = r10
            r10 = r9
        L73:
            h5b r11 = (defpackage.h5b) r11
            r0.t = r7
            r0.u = r10
            r0.x = r3
            java.lang.Object r11 = r1.e(r11, r0)
            if (r11 != r8) goto L82
            goto L8c
        L82:
            r0.u = r10
            r0.x = r2
            java.lang.Object r10 = r5.f(r0)
            if (r10 != r8) goto L8d
        L8c:
            return r8
        L8d:
            g2b r10 = defpackage.g2b.a
            return r10
        L90:
            g2b r10 = defpackage.g2b.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb1.c(r02):java.lang.Object");
    }
}
