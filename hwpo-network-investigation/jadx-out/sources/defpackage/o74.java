package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o74 {
    public final w74 a;
    public final long b;
    public final int c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final cl6 a;
        public final jz7 b;
        public final long c;
        public boolean d = true;

        public a(cl6 cl6Var, jz7 jz7Var, long j) {
            this.a = cl6Var;
            this.b = jz7Var;
            this.c = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final boolean a;
        public final boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public o74(w74 w74Var, long j, int i, int i2) {
        this.a = w74Var;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0036  */
    public final a a(b bVar, boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        cl6 cl6Var;
        sf5 sf5Var;
        jz7 jz7Var;
        if (bVar.b) {
            w74 w74Var = this.a;
            int iOrdinal = w74Var.a.ordinal();
            boolean z2 = true;
            if (iOrdinal == 0 || iOrdinal == 1) {
                aVar = null;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    u.b();
                    return null;
                }
                if (z) {
                    cl6Var = w74Var.b;
                    sf5Var = w74Var.f;
                    jz7Var = w74Var.c;
                } else {
                    cl6Var = (i < -1 || i2 < 0) ? null : w74Var.d;
                    sf5Var = w74Var.g;
                    jz7Var = w74Var.e;
                }
                if (cl6Var == null) {
                    aVar = null;
                } else {
                    sf5Var.getClass();
                    aVar = new a(cl6Var, jz7Var, sf5Var.a);
                }
            }
            if (aVar != null) {
                if (i < 0 || (i4 != 0 && (i3 - ((int) (aVar.c >> 32)) < 0 || i4 >= Integer.MAX_VALUE))) {
                    z2 = false;
                }
                aVar.d = z2;
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if ((((int) (r22 >> 32)) - ((int) (r5 >> 32))) < 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o74.b b(boolean r20, int r21, long r22, defpackage.sf5 r24, int r25, int r26, int r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o74.b(boolean, int, long, sf5, int, int, int, boolean, boolean):o74$b");
    }
}
