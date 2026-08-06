package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c97 {
    public h97 a;
    public h97 b;
    public mh4<? extends t72> c = new a();
    public t72 d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<t72> {
        public a() {
            super(0);
        }

        @Override // defpackage.mh4
        public final t72 invoke() {
            return c97.this.d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, defpackage.u02 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.d97
            if (r0 == 0) goto L14
            r0 = r12
            d97 r0 = (defpackage.d97) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.v = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            d97 r0 = new d97
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.t
            int r1 = r12.v
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.dv8.b(r0)
            goto L6e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r2
        L31:
            defpackage.dv8.b(r0)
            goto L55
        L35:
            defpackage.dv8.b(r0)
            h97 r0 = r7.a
            if (r0 == 0) goto L41
            h97 r0 = r0.d2()
            goto L42
        L41:
            r0 = r2
        L42:
            r5 = 0
            v72 r1 = defpackage.v72.t
            if (r0 != 0) goto L5a
            h97 r7 = r7.b
            if (r7 == 0) goto L72
            r12.v = r4
            java.lang.Object r0 = r7.g0(r8, r10, r12)
            if (r0 != r1) goto L55
            goto L6d
        L55:
            rdb r0 = (defpackage.rdb) r0
            long r5 = r0.a
            goto L72
        L5a:
            h97 r7 = r7.a
            if (r7 == 0) goto L62
            h97 r2 = r7.d2()
        L62:
            r7 = r2
            if (r7 == 0) goto L72
            r12.v = r3
            java.lang.Object r0 = r7.g0(r8, r10, r12)
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            rdb r0 = (defpackage.rdb) r0
            long r5 = r0.a
        L72:
            rdb r7 = new rdb
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c97.a(long, long, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, u02 u02Var) {
        e97 e97Var;
        long j2;
        if (u02Var instanceof e97) {
            e97Var = (e97) u02Var;
            int i = e97Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                e97Var.v = i - Integer.MIN_VALUE;
            } else {
                e97Var = new e97(this, u02Var);
            }
        } else {
            e97Var = new e97(this, u02Var);
        }
        Object objT1 = e97Var.t;
        int i2 = e97Var.v;
        if (i2 == 0) {
            dv8.b(objT1);
            h97 h97Var = this.a;
            h97 h97VarD2 = h97Var != null ? h97Var.d2() : null;
            if (h97VarD2 != null) {
                e97Var.v = 1;
                objT1 = h97VarD2.t1(j, e97Var);
                v72 v72Var = v72.t;
                if (objT1 == v72Var) {
                    return v72Var;
                }
            } else {
                j2 = 0;
            }
            return new rdb(j2);
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(objT1);
        j2 = ((rdb) objT1).a;
        return new rdb(j2);
    }

    public final t72 c() {
        t72 t72VarInvoke = this.c.invoke();
        if (t72VarInvoke != null) {
            return t72VarInvoke;
        }
        aa0.c("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
