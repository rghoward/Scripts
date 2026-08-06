package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ee1 extends g5b<a, g2b> {
    public final kd8 a;
    public final dh9 b;
    public final ih9 c;
    public final de9 d;
    public final wc8 e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;
        public final bd8 c;

        public a(int i, int i2, bd8 bd8Var) {
            this.a = i;
            this.b = i2;
            this.c = bd8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + os2.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbB = u43.b("Params(programId=", ", sectionId=", ", initScore=", this.a, this.b);
            sbB.append(this.c);
            sbB.append(")");
            return sbB.toString();
        }
    }

    public ee1(kd8 kd8Var, dh9 dh9Var, ih9 ih9Var, de9 de9Var, wc8 wc8Var) {
        kd8Var.getClass();
        dh9Var.getClass();
        ih9Var.getClass();
        de9Var.getClass();
        this.a = kd8Var;
        this.b = dh9Var;
        this.c = ih9Var;
        this.d = de9Var;
        this.e = wc8Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0144  */
    /* JADX WARN: Code duplicated, block: B:41:0x0149 A[PHI: r1
      0x0149: PHI (r1v3 ee1$a) = (r1v2 ee1$a), (r1v10 ee1$a) binds: [B:39:0x0146, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x015e A[PHI: r6
      0x015e: PHI (r6v11 ??) = (r6v10 ??), (r6v12 ??) binds: [B:42:0x015b, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0170  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0172, code lost:
    
        if (r0 == r5) goto L49;
     */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [bd8, ee1$a] */
    /* JADX WARN: Type inference failed for: r6v12 */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ee1.a r37, defpackage.u02 r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee1.a(ee1$a, u02):java.lang.Object");
    }
}
