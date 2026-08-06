package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xf2<T> implements pf2 {
    public final xx3 a;
    public final a82<T> b;
    public final t72 c;
    public int f;
    public dz9 g;
    public final xf2<T>.a i;
    public final o7a j;
    public final dp9<os6.a<T>> l;
    public final oz8 d = new oz8(new yf2(this, null));
    public final a47 e = new a47();
    public final rg2 h = new rg2();
    public final o7a k = new o7a(new mh4() { // from class: rf2
        @Override // defpackage.mh4
        public final Object invoke() {
            return ((g1a) this.t.j.getValue()).e();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends o3 {
        public List<? extends ci4<? super hc5<T>, ? super r02<? super g2b>, ? extends Object>> c;

        public a(List<? extends ci4<? super hc5<T>, ? super r02<? super g2b>, ? extends Object>> list) {
            super(2);
            this.c = th1.T(list);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        
            if (r7 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        
            if (r7 == r1) goto L27;
         */
        @Override // defpackage.o3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(defpackage.u02 r7) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r7 instanceof defpackage.uf2
                if (r0 == 0) goto L13
                r0 = r7
                uf2 r0 = (defpackage.uf2) r0
                int r1 = r0.v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.v = r1
                goto L18
            L13:
                uf2 r0 = new uf2
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.t
                int r1 = r0.v
                r2 = 0
                r3 = 2
                r4 = 1
                xf2<T> r5 = defpackage.xf2.this
                if (r1 == 0) goto L35
                if (r1 == r4) goto L31
                if (r1 != r3) goto L2b
                defpackage.dv8.b(r7)
                goto L57
            L2b:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r6)
                return r2
            L31:
                defpackage.dv8.b(r7)
                goto L64
            L35:
                defpackage.dv8.b(r7)
                java.util.List<? extends ci4<? super hc5<T>, ? super r02<? super g2b>, ? extends java.lang.Object>> r7 = r6.c
                v72 r1 = defpackage.v72.t
                if (r7 == 0) goto L5a
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L45
                goto L5a
            L45:
                pg5 r7 = r5.h()
                wf2 r4 = new wf2
                r4.<init>(r5, r6, r2)
                r0.v = r3
                java.lang.Object r7 = r7.c(r4, r0)
                if (r7 != r1) goto L57
                goto L63
            L57:
                ne2 r7 = (defpackage.ne2) r7
                goto L66
            L5a:
                r0.v = r4
                r6 = 0
                java.lang.Object r7 = defpackage.xf2.g(r5, r6, r0)
                if (r7 != r1) goto L64
            L63:
                return r1
            L64:
                ne2 r7 = (defpackage.ne2) r7
            L66:
                rg2 r6 = r5.h
                r6.b(r7)
                g2b r6 = defpackage.g2b.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: xf2.a.a(u02):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super T>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ xf2<T> v;
        public final /* synthetic */ ci4<T, r02<? super T>, Object> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(xf2<T> xf2Var, ci4<? super T, ? super r02<? super T>, ? extends Object> ci4Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = xf2Var;
            this.w = ci4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.v, this.w, r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, Object obj) {
            return ((b) create(t72Var, (r02) obj)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            t72 t72Var = (t72) this.u;
            bp1 bp1VarA = cp1.a();
            xf2<T> xf2Var = this.v;
            xz9 xz9VarA = xf2Var.h.a();
            if (xz9VarA instanceof ne2) {
                xz9VarA = new hb7(((ne2) xz9VarA).a);
            }
            os6.a aVar = new os6.a(this.w, bp1VarA, xz9VarA, t72Var.getCoroutineContext());
            dp9<os6.a<T>> dp9Var = xf2Var.l;
            Object objN = dp9Var.c.n(aVar);
            if (objN instanceof ga1.a) {
                Throwable th = ((ga1.a) objN).a;
                if (th == null) {
                    throw new ig1("Channel was closed normally");
                }
                throw th;
            }
            if (objN instanceof ga1.b) {
                aa0.c("Check failed.");
                return null;
            }
            if (dp9Var.d.a.getAndIncrement() == 0) {
                oy0.d(dp9Var.a, null, null, new cp9(dp9Var, null), 3);
            }
            this.t = 1;
            Object objW = bp1VarA.w(this);
            v72 v72Var = v72.t;
            return objW == v72Var ? v72Var : objW;
        }
    }

    public xf2(xx3 xx3Var, List list, a82 a82Var, t72 t72Var) {
        this.a = xx3Var;
        this.b = a82Var;
        this.c = t72Var;
        this.i = new a(list);
        int i = 0;
        this.j = new o7a(new qf2(i, this));
        this.l = new dp9<>(t72Var, new sf2(i, this), new tf2(), new og2(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(xf2 xf2Var, u02 u02Var) throws Throwable {
        zf2 zf2Var;
        a47 a47Var;
        if (u02Var instanceof zf2) {
            zf2Var = (zf2) u02Var;
            int i = zf2Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                zf2Var.w = i - Integer.MIN_VALUE;
            } else {
                zf2Var = new zf2(xf2Var, u02Var);
            }
        } else {
            zf2Var = new zf2(xf2Var, u02Var);
        }
        Object obj = zf2Var.u;
        int i2 = zf2Var.w;
        if (i2 == 0) {
            dv8.b(obj);
            a47 a47Var2 = xf2Var.e;
            zf2Var.t = a47Var2;
            zf2Var.w = 1;
            Object objB = a47Var2.b(zf2Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
            a47Var = a47Var2;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a47Var = zf2Var.t;
            dv8.b(obj);
        }
        try {
            int i3 = xf2Var.f - 1;
            xf2Var.f = i3;
            if (i3 == 0) {
                dz9 dz9Var = xf2Var.g;
                if (dz9Var != null) {
                    dz9Var.k(null);
                }
                xf2Var.g = null;
            }
            g2b g2bVar = g2b.a;
            return g2b.a;
        } finally {
            a47Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(xf2 xf2Var, os6.a aVar, u02 u02Var) throws Throwable {
        bg2 bg2Var;
        bp1 bp1Var;
        if (u02Var instanceof bg2) {
            bg2Var = (bg2) u02Var;
            int i = bg2Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                bg2Var.w = i - Integer.MIN_VALUE;
            } else {
                bg2Var = new bg2(xf2Var, u02Var);
            }
        } else {
            bg2Var = new bg2(xf2Var, u02Var);
        }
        Object aVar2 = bg2Var.u;
        int i2 = bg2Var.w;
        if (i2 == 0) {
            dv8.b(aVar2);
            bp1 bp1Var2 = aVar.b;
            try {
                h72 h72VarC0 = aVar.d.c0(bg2Var.getContext());
                cg2 cg2Var = new cg2(xf2Var, aVar, null);
                bg2Var.t = bp1Var2;
                bg2Var.w = 1;
                Object objG = oy0.g(h72VarC0, cg2Var, bg2Var);
                v72 v72Var = v72.t;
                if (objG == v72Var) {
                    return v72Var;
                }
                aVar2 = objG;
                bp1Var = bp1Var2;
            } catch (Throwable th) {
                th = th;
                bp1Var = bp1Var2;
                aVar2 = new av8.a(th);
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bp1Var = bg2Var.t;
            try {
                dv8.b(aVar2);
            } catch (Throwable th2) {
                th = th2;
                aVar2 = new av8.a(th);
            }
        }
        Throwable thA = av8.a(aVar2);
        if (thA == null) {
            bp1Var.h0(aVar2);
        } else {
            bp1Var.B0(thA);
        }
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(xf2 xf2Var, u02 u02Var) throws Throwable {
        dg2 dg2Var;
        a47 a47Var;
        if (u02Var instanceof dg2) {
            dg2Var = (dg2) u02Var;
            int i = dg2Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                dg2Var.w = i - Integer.MIN_VALUE;
            } else {
                dg2Var = new dg2(xf2Var, u02Var);
            }
        } else {
            dg2Var = new dg2(xf2Var, u02Var);
        }
        Object obj = dg2Var.u;
        int i2 = dg2Var.w;
        if (i2 == 0) {
            dv8.b(obj);
            a47 a47Var2 = xf2Var.e;
            dg2Var.t = a47Var2;
            dg2Var.w = 1;
            Object objB = a47Var2.b(dg2Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
            a47Var = a47Var2;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a47Var = dg2Var.t;
            dv8.b(obj);
        }
        try {
            int i3 = xf2Var.f + 1;
            xf2Var.f = i3;
            if (i3 == 1) {
                xf2Var.g = oy0.d(xf2Var.c, null, null, new eg2(xf2Var, null), 3);
            }
            g2b g2bVar = g2b.a;
            return g2b.a;
        } finally {
            a47Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r1.f(r0) == r4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.xf2 r6, defpackage.u02 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.fg2
            if (r0 == 0) goto L13
            r0 = r7
            fg2 r0 = (defpackage.fg2) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            fg2 r0 = new fg2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            int r0 = r0.t
            defpackage.dv8.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            r6 = 0
            return r6
        L35:
            defpackage.dv8.b(r7)
            goto L49
        L39:
            defpackage.dv8.b(r7)
            pg5 r7 = r6.h()
            r0.w = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r4) goto L49
            goto L5b
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            xf2<T>$a r1 = r6.i     // Catch: java.lang.Throwable -> L5f
            r0.t = r7     // Catch: java.lang.Throwable -> L5f
            r0.w = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r1.f(r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            g2b r6 = defpackage.g2b.a
            return r6
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            rg2 r6 = r6.h
            di8 r1 = new di8
            r1.<init>(r7, r0)
            r6.b(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf2.e(xf2, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.xf2 r9, boolean r10, defpackage.r02 r11) throws java.lang.Throwable {
        /*
            rg2 r0 = r9.h
            boolean r1 = r11 instanceof defpackage.gg2
            if (r1 == 0) goto L15
            r1 = r11
            gg2 r1 = (defpackage.gg2) r1
            int r2 = r1.x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.x = r2
            goto L1a
        L15:
            gg2 r1 = new gg2
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.v
            int r2 = r1.x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            v72 r7 = defpackage.v72.t
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            defpackage.dv8.b(r11)
            goto La2
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r9)
            return r6
        L37:
            defpackage.dv8.b(r11)
            goto L8b
        L3b:
            boolean r10 = r1.t
            xz9 r2 = r1.u
            defpackage.dv8.b(r11)
            goto L5f
        L43:
            defpackage.dv8.b(r11)
            xz9 r2 = r0.a()
            boolean r11 = r2 instanceof defpackage.q1b
            if (r11 != 0) goto Lb6
            pg5 r11 = r9.h()
            r1.u = r2
            r1.t = r10
            r1.x = r5
            java.lang.Object r11 = r11.a(r1)
            if (r11 != r7) goto L5f
            goto La1
        L5f:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r5 = r2 instanceof defpackage.ne2
            if (r5 == 0) goto L6f
            r8 = r2
            ne2 r8 = (defpackage.ne2) r8
            int r8 = r8.a
            goto L70
        L6f:
            r8 = -1
        L70:
            if (r5 == 0) goto L75
            if (r11 != r8) goto L75
            return r2
        L75:
            if (r10 == 0) goto L8e
            pg5 r10 = r9.h()
            hg2 r11 = new hg2
            r11.<init>(r9, r6)
            r1.u = r6
            r1.x = r4
            java.lang.Object r11 = r10.c(r11, r1)
            if (r11 != r7) goto L8b
            goto La1
        L8b:
            js7 r11 = (defpackage.js7) r11
            goto La4
        L8e:
            pg5 r10 = r9.h()
            ig2 r11 = new ig2
            r11.<init>(r9, r8, r6)
            r1.u = r6
            r1.x = r3
            java.lang.Object r11 = r10.e(r11, r1)
            if (r11 != r7) goto La2
        La1:
            return r7
        La2:
            js7 r11 = (defpackage.js7) r11
        La4:
            A r9 = r11.t
            xz9 r9 = (defpackage.xz9) r9
            B r10 = r11.u
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb5
            r0.b(r9)
        Lb5:
            return r9
        Lb6:
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.aa0.c(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf2.f(xf2, boolean, r02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0088 A[Catch: z72 -> 0x0056, TryCatch #2 {z72 -> 0x0056, blocks: (B:19:0x0051, B:54:0x00e1, B:24:0x005b, B:51:0x00c6, B:32:0x0070, B:40:0x0088, B:42:0x008e, B:36:0x0079, B:48:0x00b5), top: B:81:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:61:0x0107, B:63:0x0117, B:64:0x011c), top: B:78:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x011c A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:61:0x0107, B:63:0x0117, B:64:0x011c), top: B:78:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x012c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(xf2 xf2Var, boolean z, u02 u02Var) throws Throwable {
        jg2 jg2Var;
        gl8 gl8Var;
        z72 z72Var;
        gl8 gl8Var2;
        el8 el8Var;
        z72 z72Var2;
        lg2 lg2Var;
        Object objC;
        el8 el8Var2;
        gl8 gl8Var3;
        int iHashCode;
        Object objA;
        boolean z2;
        int i;
        Object obj;
        if (u02Var instanceof jg2) {
            jg2Var = (jg2) u02Var;
            int i2 = jg2Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jg2Var.A = i2 - Integer.MIN_VALUE;
            } else {
                jg2Var = new jg2(xf2Var, u02Var);
            }
        } else {
            jg2Var = new jg2(xf2Var, u02Var);
        }
        Object obj2 = (T) jg2Var.y;
        int i3 = jg2Var.A;
        Object ne2Var = v72.t;
        try {
            switch (i3) {
                case 0:
                    dv8.b(obj2);
                    if (z) {
                        jg2Var.t = z;
                        jg2Var.A = 1;
                        obj2 = (T) xf2Var.i(jg2Var);
                        if (obj2 != ne2Var) {
                            if (obj2 != null) {
                                iHashCode = obj2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            pg5 pg5VarH = xf2Var.h();
                            jg2Var.u = obj2;
                            jg2Var.t = z;
                            jg2Var.x = iHashCode;
                            jg2Var.A = 2;
                            objA = pg5VarH.a(jg2Var);
                            if (objA != ne2Var) {
                                int i4 = iHashCode;
                                z2 = z;
                                i = i4;
                                obj = obj2;
                                obj2 = (T) objA;
                                return new ne2(i, ((Number) obj2).intValue(), obj);
                            }
                        }
                    } else {
                        pg5 pg5VarH2 = xf2Var.h();
                        jg2Var.t = z;
                        jg2Var.A = 3;
                        obj2 = (T) pg5VarH2.a(jg2Var);
                        if (obj2 != ne2Var) {
                            int iIntValue = ((Number) obj2).intValue();
                            pg5 pg5VarH3 = xf2Var.h();
                            ci4 kg2Var = new kg2(xf2Var, iIntValue, null);
                            jg2Var.t = z;
                            jg2Var.A = 4;
                            obj2 = (T) pg5VarH3.e(kg2Var, jg2Var);
                            if (obj2 == ne2Var) {
                            }
                            return (ne2) obj2;
                        }
                    }
                    return ne2Var;
                case 1:
                    z = jg2Var.t;
                    dv8.b(obj2);
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    pg5 pg5VarH4 = xf2Var.h();
                    jg2Var.u = obj2;
                    jg2Var.t = z;
                    jg2Var.x = iHashCode;
                    jg2Var.A = 2;
                    objA = pg5VarH4.a(jg2Var);
                    if (objA != ne2Var) {
                        int i5 = iHashCode;
                        z2 = z;
                        i = i5;
                        obj = obj2;
                        obj2 = (T) objA;
                        return new ne2(i, ((Number) obj2).intValue(), obj);
                    }
                    return ne2Var;
                case 2:
                    i = jg2Var.x;
                    z2 = jg2Var.t;
                    obj = jg2Var.u;
                    try {
                        dv8.b(obj2);
                        return new ne2(i, ((Number) obj2).intValue(), obj);
                    } catch (z72 e) {
                        e = e;
                        z = z2;
                        gl8Var = new gl8();
                        a82<T> a82Var = xf2Var.b;
                        jg2Var.u = e;
                        jg2Var.v = gl8Var;
                        jg2Var.w = gl8Var;
                        jg2Var.t = z;
                        jg2Var.A = 5;
                        Object objA2 = a82Var.a(e);
                        if (objA2 != ne2Var) {
                            z72Var = e;
                            obj2 = (T) objA2;
                            gl8Var2 = gl8Var;
                            gl8Var2.t = (T) obj2;
                            el8Var = new el8();
                            try {
                                lg2Var = new lg2(gl8Var, xf2Var, el8Var, null);
                                jg2Var.u = z72Var;
                                jg2Var.v = gl8Var;
                                jg2Var.w = el8Var;
                                jg2Var.A = 6;
                                if (z) {
                                    objC = lg2Var.invoke(jg2Var);
                                } else {
                                    objC = xf2Var.h().c(new ag2(lg2Var, null), jg2Var);
                                }
                                if (objC != ne2Var) {
                                    el8Var2 = el8Var;
                                    gl8Var3 = gl8Var;
                                    T t = gl8Var3.t;
                                    ne2Var = new ne2(t != null ? t.hashCode() : 0, el8Var2.t, t);
                                }
                            } catch (Throwable th) {
                                th = th;
                                z72Var2 = z72Var;
                                fn3.b(z72Var2, th);
                                throw z72Var2;
                            }
                        }
                        return ne2Var;
                    }
                case 3:
                    z = jg2Var.t;
                    dv8.b(obj2);
                    int iIntValue2 = ((Number) obj2).intValue();
                    pg5 pg5VarH5 = xf2Var.h();
                    ci4 kg2Var2 = new kg2(xf2Var, iIntValue2, null);
                    jg2Var.t = z;
                    jg2Var.A = 4;
                    obj2 = (T) pg5VarH5.e(kg2Var2, jg2Var);
                    if (obj2 == ne2Var) {
                        return ne2Var;
                    }
                    return (ne2) obj2;
                case 4:
                    boolean z3 = jg2Var.t;
                    dv8.b(obj2);
                    return (ne2) obj2;
                case 5:
                    z = jg2Var.t;
                    gl8 gl8Var4 = (gl8) jg2Var.w;
                    gl8 gl8Var5 = jg2Var.v;
                    z72Var = (z72) jg2Var.u;
                    dv8.b(obj2);
                    gl8Var2 = gl8Var4;
                    gl8Var = gl8Var5;
                    gl8Var2.t = (T) obj2;
                    el8Var = new el8();
                    lg2Var = new lg2(gl8Var, xf2Var, el8Var, null);
                    jg2Var.u = z72Var;
                    jg2Var.v = gl8Var;
                    jg2Var.w = el8Var;
                    jg2Var.A = 6;
                    if (z) {
                        objC = lg2Var.invoke(jg2Var);
                    } else {
                        objC = xf2Var.h().c(new ag2(lg2Var, null), jg2Var);
                    }
                    if (objC != ne2Var) {
                        el8Var2 = el8Var;
                        gl8Var3 = gl8Var;
                        T t2 = gl8Var3.t;
                        ne2Var = new ne2(t2 != null ? t2.hashCode() : 0, el8Var2.t, t2);
                    }
                    return ne2Var;
                case 6:
                    el8Var2 = (el8) jg2Var.w;
                    gl8Var3 = jg2Var.v;
                    z72Var2 = (z72) jg2Var.u;
                    try {
                        dv8.b(obj2);
                        T t3 = gl8Var3.t;
                        ne2Var = new ne2(t3 != null ? t3.hashCode() : 0, el8Var2.t, t3);
                        return ne2Var;
                    } catch (Throwable th2) {
                        th = th2;
                        fn3.b(z72Var2, th);
                        throw z72Var2;
                    }
                default:
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (z72 e2) {
            e = e2;
        }
    }

    @Override // defpackage.pf2
    public final Object a(ci4<? super T, ? super r02<? super T>, ? extends Object> ci4Var, r02<? super T> r02Var) {
        d4b d4bVar = (d4b) r02Var.getContext().d0(c4b.t);
        if (d4bVar != null) {
            d4bVar.a(this);
        }
        return oy0.g(new d4b(d4bVar, this), new b(this, ci4Var, null), r02Var);
    }

    @Override // defpackage.pf2
    public final r54<T> getData() {
        return this.d;
    }

    public final pg5 h() {
        return (pg5) this.k.getValue();
    }

    public final Object i(u02 u02Var) {
        return ((g1a) this.j.getValue()).c(new h1a(3, null), u02Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Object obj, boolean z, u02 u02Var) throws Throwable {
        pg2 pg2Var;
        el8 el8Var;
        if (u02Var instanceof pg2) {
            pg2Var = (pg2) u02Var;
            int i = pg2Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                pg2Var.w = i - Integer.MIN_VALUE;
            } else {
                pg2Var = new pg2(this, u02Var);
            }
        } else {
            pg2Var = new pg2(this, u02Var);
        }
        Object obj2 = pg2Var.u;
        int i2 = pg2Var.w;
        if (i2 == 0) {
            dv8.b(obj2);
            el8 el8Var2 = new el8();
            g1a g1aVar = (g1a) this.j.getValue();
            qg2 qg2Var = new qg2(el8Var2, this, obj, z, null);
            pg2Var.t = el8Var2;
            pg2Var.w = 1;
            Object objB = g1aVar.b(qg2Var, pg2Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
            el8Var = el8Var2;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            el8Var = pg2Var.t;
            dv8.b(obj2);
        }
        return new Integer(el8Var.t);
    }
}
