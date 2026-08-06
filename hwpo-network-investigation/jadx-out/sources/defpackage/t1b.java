package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t1b extends g5b<a, g2b> {
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

    public t1b(kd8 kd8Var, de9 de9Var) {
        kd8Var.getClass();
        de9Var.getClass();
        this.a = kd8Var;
        this.b = de9Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x0054->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r9 == r5) goto L24;
     */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(t1b.a r8, defpackage.u02 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.u1b
            if (r0 == 0) goto L13
            r0 = r9
            u1b r0 = (defpackage.u1b) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            u1b r0 = new u1b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            int r1 = r0.x
            r2 = 0
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L3a
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2f
            int r8 = r0.u
            java.util.Iterator r1 = r0.t
            defpackage.dv8.b(r9)
            goto L54
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            r7 = 0
            return r7
        L36:
            defpackage.dv8.b(r9)
            goto L4c
        L3a:
            defpackage.dv8.b(r9)
            int r9 = r8.a
            int r8 = r8.b
            r0.x = r4
            kd8 r1 = r7.a
            java.io.Serializable r9 = r1.f(r9, r8, r0)
            if (r9 != r5) goto L4c
            goto L72
        L4c:
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r8 = r9.iterator()
            r1 = r8
            r8 = r2
        L54:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L73
            java.lang.Object r9 = r1.next()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.t = r1
            r0.u = r8
            r0.x = r3
            de9 r6 = r7.b
            java.lang.Object r9 = r6.a(r9, r2, r4, r0)
            if (r9 != r5) goto L54
        L72:
            return r5
        L73:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t1b.a(t1b$a, u02):java.lang.Object");
    }
}
