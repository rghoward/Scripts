package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rd6 extends g5b<a, g2b> {
    public final h13 a;
    public final w5b b;
    public final kd8 c;
    public final qs2 d;
    public final xy3 e;
    public final zt3 f;
    public final xg5 g;
    public final lw7 h;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return cq2.a("Params(isAccountDeleted=", ")", this.a);
        }
    }

    public rd6(h13 h13Var, w5b w5bVar, kd8 kd8Var, qs2 qs2Var, xy3 xy3Var, zt3 zt3Var, xg5 xg5Var, lw7 lw7Var) {
        w5bVar.getClass();
        kd8Var.getClass();
        xy3Var.getClass();
        zt3Var.getClass();
        xg5Var.getClass();
        lw7Var.getClass();
        this.a = h13Var;
        this.b = w5bVar;
        this.c = kd8Var;
        this.d = qs2Var;
        this.e = xy3Var;
        this.f = zt3Var;
        this.g = xg5Var;
        this.h = lw7Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r8.h.b(r0) == r7) goto L31;
     */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(rd6.a r9, defpackage.u02 r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.sd6
            if (r0 == 0) goto L13
            r0 = r10
            sd6 r0 = (defpackage.sd6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            sd6 r0 = new sd6
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            int r1 = r0.w
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            v72 r7 = defpackage.v72.t
            if (r1 == 0) goto L48
            if (r1 == r6) goto L42
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            defpackage.dv8.b(r10)
            goto La5
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r2
        L38:
            defpackage.dv8.b(r10)
            goto L93
        L3c:
            rd6$a r9 = r0.t
            defpackage.dv8.b(r10)
            goto L84
        L42:
            rd6$a r9 = r0.t
            defpackage.dv8.b(r10)
            goto L5d
        L48:
            defpackage.dv8.b(r10)
            g2b r10 = defpackage.g2b.a
            r0.t = r9
            r0.w = r6
            h13 r1 = r8.a
            r1.getClass()
            java.lang.Object r10 = defpackage.g5b.b(r1, r10, r0)
            if (r10 != r7) goto L5d
            goto La4
        L5d:
            qs2 r10 = r8.d
            r10.b()
            kd8 r10 = r8.c
            r10.d()
            xy3 r10 = r8.e
            java.io.File r1 = r10.b()
            defpackage.vy3.b(r1)
            java.io.File r10 = r10.a()
            defpackage.vy3.b(r10)
            r0.t = r9
            r0.w = r5
            zt3 r10 = r8.f
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r7) goto L84
            goto La4
        L84:
            boolean r9 = r9.a
            r0.t = r2
            r0.w = r4
            w5b r10 = r8.b
            java.lang.Object r9 = r10.l(r9, r0)
            if (r9 != r7) goto L93
            goto La4
        L93:
            xg5 r9 = r8.g
            r9.d()
            r0.t = r2
            r0.w = r3
            lw7 r8 = r8.h
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r7) goto La5
        La4:
            return r7
        La5:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd6.a(rd6$a, u02):java.lang.Object");
    }
}
