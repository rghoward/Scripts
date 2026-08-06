package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class k48 extends dl0<l48, t28> {
    public static final /* synthetic */ int D = 0;
    public long A;
    public final yq6 B;
    public final yq6 C;
    public final hy8 x;
    public final tk4 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k48(hy8 hy8Var, tk4 tk4Var, q09 q09Var) {
        super(new l48(false, null));
        hy8Var.getClass();
        tk4Var.getClass();
        q09Var.getClass();
        l48.Companion.getClass();
        this.x = hy8Var;
        this.y = tk4Var;
        Integer num = (Integer) q09Var.a("start_position");
        this.z = num != null ? num.intValue() : 0;
        this.B = oh7.a(this.u, new xk3(2));
        this.C = oh7.a(this.u, new yk3(3));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008c A[PHI: r0
      0x008c: PHI (r0v12 java.lang.Object) = (r0v11 java.lang.Object), (r0v0 java.lang.Object) binds: [B:30:0x0089, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r0 == r11) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum g(defpackage.k48 r13, defpackage.u02 r14) throws java.lang.Throwable {
        /*
            boolean r1 = r14 instanceof defpackage.f48
            if (r1 == 0) goto L14
            r1 = r14
            f48 r1 = (defpackage.f48) r1
            int r3 = r1.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r1.v = r3
        L12:
            r7 = r1
            goto L1a
        L14:
            f48 r1 = new f48
            r1.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r0 = r7.t
            int r1 = r7.v
            r8 = 4
            r9 = 3
            r3 = 1
            r10 = 0
            r4 = 2
            v72 r11 = defpackage.v72.t
            if (r1 == 0) goto L45
            if (r1 == r3) goto L41
            if (r1 == r4) goto L3d
            if (r1 == r9) goto L39
            if (r1 != r8) goto L33
            defpackage.dv8.b(r0)
            goto L9c
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r0)
            return r10
        L39:
            defpackage.dv8.b(r0)
            goto L8c
        L3d:
            defpackage.dv8.b(r0)
            goto L72
        L41:
            defpackage.dv8.b(r0)
            goto L62
        L45:
            defpackage.dv8.b(r0)
            el0 r0 = r13.b()
            l48 r0 = (defpackage.l48) r0
            s10 r0 = r0.b
            if (r0 != 0) goto La4
            tk4 r0 = r13.y
            g2b r1 = defpackage.g2b.a
            r7.v = r3
            r0.getClass()
            java.lang.Object r0 = defpackage.g5b.b(r0, r1, r7)
            if (r0 != r11) goto L62
            goto L9b
        L62:
            xd3 r0 = (defpackage.xd3) r0
            g48 r1 = new g48
            r1.<init>(r4, r10)
            r7.v = r4
            java.lang.Object r0 = defpackage.yd3.d(r0, r1, r7)
            if (r0 != r11) goto L72
            goto L9b
        L72:
            r12 = r0
            xd3 r12 = (defpackage.xd3) r12
            h48 r0 = new h48
            java.lang.String r5 = "onPlaybackError(Ljava/lang/Exception;)V"
            r6 = 4
            r1 = 2
            java.lang.Class<k48> r3 = defpackage.k48.class
            java.lang.String r4 = "onPlaybackError"
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.v = r9
            java.lang.Object r0 = defpackage.yd3.a(r12, r0, r7)
            if (r0 != r11) goto L8c
            goto L9b
        L8c:
            xd3 r0 = (defpackage.xd3) r0
            i48 r1 = new i48
            r1.<init>(r13, r10)
            r7.v = r8
            java.lang.Object r0 = defpackage.yd3.b(r0, r1, r7)
            if (r0 != r11) goto L9c
        L9b:
            return r11
        L9c:
            xd3 r0 = (defpackage.xd3) r0
            java.lang.Object r0 = defpackage.yd3.e(r0, r10)
            s10 r0 = (defpackage.s10) r0
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k48.g(k48, u02):java.lang.Enum");
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof t28.b) {
            return new l48(((t28.b) bl0Var).a, b().b);
        }
        if (!(bl0Var instanceof t28.a)) {
            return b();
        }
        l48 l48VarB = b();
        return new l48(l48VarB.a, ((t28.a) bl0Var).a);
    }

    public final void i(Exception exc) {
        exc.getClass();
        boolean z = (exc instanceof lo3) && (exc.getCause() instanceof wz8);
        if (z) {
            f(p38.b);
        } else {
            if (z) {
                u.b();
                return;
            }
            e(new t28.b(true));
        }
        rma.a.b(exc);
    }
}
