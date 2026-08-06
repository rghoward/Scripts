package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", l = {636, 643}, m = "invokeSuspend")
public final class c77 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ w89<r47> v;
    public final /* synthetic */ r47 w;
    public final /* synthetic */ tva<r47> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", l = {651, 655}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ float u;
        public final /* synthetic */ w89<r47> v;
        public final /* synthetic */ r47 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, w89<r47> w89Var, r47 r47Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = f;
            this.v = w89Var;
            this.w = r47Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, this.w, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        
            if (r8 == r7) goto L30;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                int r0 = r8.t
                r1 = 0
                w89<r47> r2 = r8.v
                r3 = 0
                float r4 = r8.u
                r5 = 2
                r6 = 1
                v72 r7 = defpackage.v72.t
                if (r0 == 0) goto L20
                if (r0 == r6) goto L1c
                if (r0 != r5) goto L16
                defpackage.dv8.b(r9)
                goto L73
            L16:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r8)
                return r1
            L1c:
                defpackage.dv8.b(r9)
                goto L36
            L20:
                defpackage.dv8.b(r9)
                int r9 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r9 <= 0) goto L36
                r8.t = r6
                dt7 r9 = r2.b
                java.lang.Object r9 = r9.getValue()
                java.lang.Object r9 = r2.B(r4, r9, r8)
                if (r9 != r7) goto L36
                goto L72
            L36:
                int r9 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r9 != 0) goto L73
                r8.t = r5
                tva<S> r9 = r2.e
                if (r9 != 0) goto L43
                g2b r8 = defpackage.g2b.a
                goto L70
            L43:
                dt7 r0 = r2.c
                java.lang.Object r0 = r0.getValue()
                r47 r3 = r8.w
                boolean r0 = defpackage.xj5.a(r0, r3)
                if (r0 == 0) goto L60
                dt7 r0 = r2.b
                java.lang.Object r0 = r0.getValue()
                boolean r0 = defpackage.xj5.a(r0, r3)
                if (r0 == 0) goto L60
                g2b r8 = defpackage.g2b.a
                goto L70
            L60:
                s37 r0 = r2.l
                a99 r4 = new a99
                r4.<init>(r1, r2, r9, r3)
                java.lang.Object r8 = defpackage.s37.a(r0, r4, r8)
                if (r8 != r7) goto L6e
                goto L70
            L6e:
                g2b r8 = defpackage.g2b.a
            L70:
                if (r8 != r7) goto L73
            L72:
                return r7
            L73:
                g2b r8 = defpackage.g2b.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: c77.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c77(w89<r47> w89Var, r47 r47Var, tva<r47> tvaVar, r02<? super c77> r02Var) {
        super(2, r02Var);
        this.v = w89Var;
        this.w = r47Var;
        this.x = tvaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        c77 c77Var = new c77(this.v, this.w, this.x, r02Var);
        c77Var.u = obj;
        return c77Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((c77) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r14 == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (defpackage.o6a.c(r8, 0.0f, r10, r11, r14, 4) == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        return r7;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            int r0 = r14.t
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r14)
            return r1
        L12:
            defpackage.dv8.b(r15)
            goto L81
        L16:
            defpackage.dv8.b(r15)
            java.lang.Object r15 = r14.u
            t72 r15 = (defpackage.t72) r15
            w89<r47> r0 = r14.v
            dt7 r4 = r0.c
            at7 r5 = r0.i
            java.lang.Object r4 = r4.getValue()
            r47 r6 = r14.w
            boolean r4 = defpackage.xj5.a(r4, r6)
            v72 r7 = defpackage.v72.t
            if (r4 != 0) goto L4d
            r14.t = r3
            tva<S> r15 = r0.e
            if (r15 != 0) goto L3a
            g2b r14 = defpackage.g2b.a
            goto L4a
        L3a:
            s37 r2 = r0.l
            x89 r3 = new x89
            r3.<init>(r1, r0, r15, r6)
            java.lang.Object r14 = defpackage.s37.a(r2, r3, r14)
            if (r14 != r7) goto L48
            goto L4a
        L48:
            g2b r14 = defpackage.g2b.a
        L4a:
            if (r14 != r7) goto L81
            goto L80
        L4d:
            tva<r47> r3 = r14.x
            my2 r3 = r3.l
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r8
            float r8 = r5.h()
            float r5 = r5.h()
            float r3 = (float) r3
            float r5 = r5 * r3
            int r3 = (int) r5
            r4 = 0
            r5 = 6
            xya r10 = defpackage.xv.c(r3, r4, r1, r5)
            b77 r11 = new b77
            r11.<init>()
            r14.t = r2
            r9 = 0
            r13 = 4
            r12 = r14
            java.lang.Object r14 = defpackage.o6a.c(r8, r9, r10, r11, r12, r13)
            if (r14 != r7) goto L81
        L80:
            return r7
        L81:
            g2b r14 = defpackage.g2b.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c77.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
