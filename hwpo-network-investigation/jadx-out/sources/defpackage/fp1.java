package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fp1 extends g5b<a, g2b> {
    public final kd8 a;
    public final de9 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return a30.b("Params(programId=", ", sectionId=", ")", this.a, this.b);
        }
    }

    public fp1(kd8 kd8Var, de9 de9Var) {
        kd8Var.getClass();
        de9Var.getClass();
        this.a = kd8Var;
        this.b = de9Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x0054->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r8 == r4) goto L24;
     */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(fp1.a r7, defpackage.u02 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.gp1
            if (r0 == 0) goto L13
            r0 = r8
            gp1 r0 = (defpackage.gp1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            gp1 r0 = new gp1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            int r1 = r0.x
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            int r7 = r0.u
            java.util.Iterator r1 = r0.t
            defpackage.dv8.b(r8)
            goto L54
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            r6 = 0
            return r6
        L35:
            defpackage.dv8.b(r8)
            goto L4b
        L39:
            defpackage.dv8.b(r8)
            int r8 = r7.a
            int r7 = r7.b
            r0.x = r3
            kd8 r1 = r6.a
            java.io.Serializable r8 = r1.g(r8, r7, r0)
            if (r8 != r4) goto L4b
            goto L72
        L4b:
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r7 = r8.iterator()
            r8 = 0
            r1 = r7
            r7 = r8
        L54:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L73
            java.lang.Object r8 = r1.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.t = r1
            r0.u = r7
            r0.x = r2
            de9 r5 = r6.b
            java.lang.Object r8 = r5.a(r8, r3, r3, r0)
            if (r8 != r4) goto L54
        L72:
            return r4
        L73:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp1.a(fp1$a, u02):java.lang.Object");
    }
}
