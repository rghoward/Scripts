package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vi9 {
    public final zk9 a;
    public final zk9 b;

    public vi9(zk9 zk9Var, zk9 zk9Var2) {
        zk9Var.getClass();
        zk9Var2.getClass();
        this.a = zk9Var;
        this.b = zk9Var2;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.b.b(r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.u02 r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ui9
            if (r0 == 0) goto L13
            r0 = r6
            ui9 r0 = (defpackage.ui9) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ui9 r0 = new ui9
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.t
            int r1 = r0.v
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.dv8.b(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r5)
            r5 = 0
            return r5
        L31:
            defpackage.dv8.b(r6)
            goto L43
        L35:
            defpackage.dv8.b(r6)
            r0.v = r3
            zk9 r6 = r5.a
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            r0.v = r2
            zk9 r5 = r5.b
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            g2b r5 = defpackage.g2b.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi9.b(u02):java.lang.Object");
    }
}
