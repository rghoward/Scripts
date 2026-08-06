package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gq9 implements pg5 {
    public final a47 a = new a47();
    public final i60 b = new i60();
    public final oz8 c = new oz8(new a(2, null));

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<s54<? super g2b>, r02<? super g2b>, Object> {
        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(2, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(s54<? super g2b> s54Var, r02<? super g2b> r02Var) {
            return ((a) create(s54Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            return g2b.a;
        }
    }

    public gq9(String str) {
    }

    @Override // defpackage.pg5
    public final Object a(u02 u02Var) {
        return new Integer(this.b.a.get());
    }

    @Override // defpackage.pg5
    public final Object b(qg2 qg2Var) {
        return new Integer(this.b.a.incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [gq9] */
    /* JADX WARN: Type inference failed for: r6v1, types: [x37] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [x37] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.pg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.oh4 r7, defpackage.u02 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.eq9
            if (r0 == 0) goto L13
            r0 = r8
            eq9 r0 = (defpackage.eq9) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            eq9 r0 = new eq9
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            int r1 = r0.x
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.t
            x37 r6 = (defpackage.x37) r6
            defpackage.dv8.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r4
        L37:
            a47 r6 = r0.u
            java.lang.Object r7 = r0.t
            oh4 r7 = (defpackage.oh4) r7
            defpackage.dv8.b(r8)
            goto L53
        L41:
            defpackage.dv8.b(r8)
            r0.t = r7
            a47 r6 = r6.a
            r0.u = r6
            r0.x = r3
            java.lang.Object r8 = r6.b(r0)
            if (r8 != r5) goto L53
            goto L5f
        L53:
            r0.t = r6     // Catch: java.lang.Throwable -> L2f
            r0.u = r4     // Catch: java.lang.Throwable -> L2f
            r0.x = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L60
        L5f:
            return r5
        L60:
            r6.c(r4)
            return r8
        L64:
            r6.c(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq9.c(oh4, u02):java.lang.Object");
    }

    @Override // defpackage.pg5
    public final r54<g2b> d() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pg5
    public final Object e(ci4 ci4Var, u02 u02Var) throws Throwable {
        fq9 fq9Var;
        a47 a47Var;
        boolean z;
        Throwable th;
        if (u02Var instanceof fq9) {
            fq9Var = (fq9) u02Var;
            int i = fq9Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                fq9Var.x = i - Integer.MIN_VALUE;
            } else {
                fq9Var = new fq9(this, u02Var);
            }
        } else {
            fq9Var = new fq9(this, u02Var);
        }
        Object obj = fq9Var.v;
        int i2 = fq9Var.x;
        if (i2 != 0) {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = fq9Var.u;
            a47Var = fq9Var.t;
            try {
                dv8.b(obj);
                if (z) {
                    a47Var.c(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    a47Var.c(null);
                }
                throw th;
            }
        }
        dv8.b(obj);
        a47 a47Var2 = this.a;
        boolean zH = a47Var2.h();
        try {
            Boolean boolValueOf = Boolean.valueOf(zH);
            fq9Var.t = a47Var2;
            fq9Var.u = zH;
            fq9Var.x = 1;
            Object objInvoke = ci4Var.invoke(boolValueOf, fq9Var);
            v72 v72Var = v72.t;
            if (objInvoke == v72Var) {
                return v72Var;
            }
            a47Var = a47Var2;
            z = zH;
            obj = objInvoke;
            if (z) {
                a47Var.c(null);
            }
            return obj;
        } catch (Throwable th3) {
            a47Var = a47Var2;
            z = zH;
            th = th3;
            if (z) {
                a47Var.c(null);
            }
            throw th;
        }
    }
}
