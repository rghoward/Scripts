package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h97 extends ox6.c implements txa, b97 {
    public b97 H;
    public c97 I;
    public h97 J;
    public final String K;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {113, 118}, m = "onPostFling-RZ2iAVY", v = 1)
    public static final class a extends u02 {
        public long t;
        public long u;
        public /* synthetic */ Object v;
        public int x;

        public a(u02 u02Var) {
            super(u02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return h97.this.g0(0L, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {106, 107}, m = "onPreFling-QWom1Mo", v = 1)
    public static final class b extends u02 {
        public long t;
        public /* synthetic */ Object u;
        public int w;

        public b(u02 u02Var) {
            super(u02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return h97.this.t1(0L, this);
        }
    }

    public h97(b97 b97Var, c97 c97Var) {
        this.H = b97Var;
        this.I = c97Var == null ? new c97() : c97Var;
        this.K = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.b97
    public final long B0(int i, long j) {
        h97 h97VarD2 = this.G ? d2() : null;
        long jB0 = h97VarD2 != null ? h97VarD2.B0(i, j) : 0L;
        return vf7.e(jB0, this.H.B0(i, vf7.d(j, jB0)));
    }

    @Override // defpackage.txa
    public final Object G() {
        return this.K;
    }

    @Override // ox6.c
    public final void U1() {
        c97 c97Var = this.I;
        c97Var.a = this;
        c97Var.b = null;
        this.J = null;
        c97Var.c = new i97(this);
        c97Var.d = Q1();
    }

    @Override // ox6.c
    public final void V1() {
        gl8 gl8Var = new gl8();
        yx.f(this, new j97(gl8Var));
        h97 h97Var = (h97) ((txa) gl8Var.t);
        this.J = h97Var;
        c97 c97Var = this.I;
        c97Var.b = h97Var;
        if (c97Var.a == this) {
            c97Var.a = null;
        }
    }

    public final t72 c2() {
        h97 h97VarD2 = d2();
        t72 t72VarC2 = h97VarD2 != null ? h97VarD2.c2() : null;
        if (t72VarC2 != null && u72.e(t72VarC2)) {
            return t72VarC2;
        }
        t72 t72Var = this.I.d;
        if (t72Var != null) {
            return t72Var;
        }
        aa0.c("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final h97 d2() {
        kb7 kb7Var;
        txa txaVar = null;
        if (!this.G) {
            return null;
        }
        if (!this.t.G) {
            uc5.b("visitAncestors called on an unattached node");
        }
        ox6.c cVar = this.t.x;
        qr5 qr5VarF = ew2.f(this);
        loop0: while (qr5VarF != null) {
            if ((qr5VarF.Y.f.w & 262144) != 0) {
                while (cVar != null) {
                    if ((cVar.v & 262144) != 0) {
                        ox6.c cVarB = cVar;
                        k37 k37Var = null;
                        while (cVarB != null) {
                            if (cVarB instanceof txa) {
                                txa txaVar2 = (txa) cVarB;
                                if (xj5.a(this.K, txaVar2.G()) && h97.class == txaVar2.getClass()) {
                                    txaVar = txaVar2;
                                    break loop0;
                                }
                            }
                            if ((cVarB.v & 262144) != 0 && (cVarB instanceof gw2)) {
                                int i = 0;
                                for (ox6.c cVar2 = ((gw2) cVarB).I; cVar2 != null; cVar2 = cVar2.y) {
                                    if ((cVar2.v & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarB = cVar2;
                                        } else {
                                            if (k37Var == null) {
                                                k37Var = new k37(new ox6.c[16]);
                                            }
                                            if (cVarB != null) {
                                                k37Var.d(cVarB);
                                                cVarB = null;
                                            }
                                            k37Var.d(cVar2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVarB = ew2.b(k37Var);
                        }
                    }
                    cVar = cVar.x;
                }
            }
            qr5VarF = qr5VarF.I();
            cVar = (qr5VarF == null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
        }
        return (h97) txaVar;
    }

    @Override // defpackage.b97
    public final long f0(long j, int i, long j2) {
        long jF0 = this.H.f0(j, i, j2);
        h97 h97VarD2 = this.G ? d2() : null;
        return vf7.e(jF0, h97VarD2 != null ? h97VarD2.f0(vf7.e(j, jF0), i, vf7.d(j2, jF0)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.b97
    public final Object g0(long j, long j2, r02<? super rdb> r02Var) throws Throwable {
        a aVar;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.x = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((u02) r02Var);
            }
        } else {
            aVar = new a((u02) r02Var);
        }
        a aVar2 = aVar;
        Object objG0 = aVar2.v;
        int i2 = aVar2.x;
        h97 h97VarD2 = null;
        v72 v72Var = v72.t;
        if (i2 == 0) {
            dv8.b(objG0);
            b97 b97Var = this.H;
            aVar2.t = j;
            aVar2.u = j2;
            aVar2.x = 1;
            objG0 = b97Var.g0(j, j2, aVar2);
            if (objG0 != v72Var) {
                j3 = j;
                j4 = j2;
            }
            return v72Var;
        }
        if (i2 == 1) {
            j4 = aVar2.u;
            j3 = aVar2.t;
            dv8.b(objG0);
        } else {
            if (i2 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = aVar2.t;
            dv8.b(objG0);
        }
        j6 = ((rdb) objG0).a;
        j5 = j7;
        return new rdb(rdb.e(j5, j6));
        j5 = ((rdb) objG0).a;
        boolean z = this.G;
        if (!z) {
            h97VarD2 = this.J;
        } else if (z) {
            h97VarD2 = d2();
        }
        if (h97VarD2 != null) {
            long jE = rdb.e(j3, j5);
            long jD = rdb.d(j4, j5);
            aVar2.t = j5;
            aVar2.x = 2;
            objG0 = h97VarD2.g0(jE, jD, aVar2);
            if (objG0 != v72Var) {
                j7 = j5;
                j6 = ((rdb) objG0).a;
                j5 = j7;
            }
            return v72Var;
        }
        j6 = 0;
        return new rdb(rdb.e(j5, j6));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    @Override // defpackage.b97
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t1(long r7, defpackage.r02<? super defpackage.rdb> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof h97.b
            if (r0 == 0) goto L13
            r0 = r9
            h97$b r0 = (h97.b) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L1a
        L13:
            h97$b r0 = new h97$b
            u02 r9 = (defpackage.u02) r9
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.u
            int r1 = r0.w
            r2 = 0
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.t
            defpackage.dv8.b(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r2
        L35:
            long r7 = r0.t
            defpackage.dv8.b(r9)
            goto L53
        L3b:
            defpackage.dv8.b(r9)
            boolean r9 = r6.G
            if (r9 == 0) goto L46
            h97 r2 = r6.d2()
        L46:
            if (r2 == 0) goto L58
            r0.t = r7
            r0.w = r4
            java.lang.Object r9 = r2.t1(r7, r0)
            if (r9 != r5) goto L53
            goto L6a
        L53:
            rdb r9 = (defpackage.rdb) r9
            long r1 = r9.a
            goto L5a
        L58:
            r1 = 0
        L5a:
            b97 r6 = r6.H
            long r7 = defpackage.rdb.d(r7, r1)
            r0.t = r1
            r0.w = r3
            java.lang.Object r9 = r6.t1(r7, r0)
            if (r9 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r1
        L6c:
            rdb r9 = (defpackage.rdb) r9
            long r8 = r9.a
            long r6 = defpackage.rdb.e(r6, r8)
            rdb r8 = new rdb
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h97.t1(long, r02):java.lang.Object");
    }
}
