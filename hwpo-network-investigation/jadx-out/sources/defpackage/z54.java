package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {51, 52}, m = "invokeSuspend", v = 1)
public final class z54 extends p6a implements ci4<s54<Object>, r02<? super g2b>, Object> {
    public gl8 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ m64 w;
    public final /* synthetic */ qo7.b x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ gl8<Object> t;
        public final /* synthetic */ qo7.b u;
        public final /* synthetic */ s54<Object> v;

        /* JADX INFO: renamed from: z54$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.paging.FlowExtKt$simpleScan$1$1", f = "FlowExt.kt", l = {53, 54}, m = "emit", v = 1)
        public static final class C0291a extends u02 {
            public gl8 t;
            public /* synthetic */ Object u;
            public final /* synthetic */ a<T> v;
            public int w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0291a(a<? super T> aVar, r02<? super C0291a> r02Var) {
                super(r02Var);
                this.v = aVar;
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.u = obj;
                this.w |= Integer.MIN_VALUE;
                return this.v.emit(null, this);
            }
        }

        public a(gl8 gl8Var, qo7.b bVar, s54 s54Var) {
            this.t = gl8Var;
            this.u = bVar;
            this.v = s54Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        
            if (r7.v.emit(r8, r0) == r6) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.s54
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, defpackage.r02<? super defpackage.g2b> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof z54.a.C0291a
                if (r0 == 0) goto L13
                r0 = r9
                z54$a$a r0 = (z54.a.C0291a) r0
                int r1 = r0.w
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.w = r1
                goto L18
            L13:
                z54$a$a r0 = new z54$a$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.u
                int r1 = r0.w
                r2 = 0
                gl8<java.lang.Object> r3 = r7.t
                r4 = 2
                r5 = 1
                v72 r6 = defpackage.v72.t
                if (r1 == 0) goto L39
                if (r1 == r5) goto L33
                if (r1 != r4) goto L2d
                defpackage.dv8.b(r9)
                goto L5d
            L2d:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                return r2
            L33:
                gl8 r8 = r0.t
                defpackage.dv8.b(r9)
                goto L4c
            L39:
                defpackage.dv8.b(r9)
                T r9 = r3.t
                r0.t = r3
                r0.w = r5
                qo7$b r1 = r7.u
                java.lang.Object r9 = r1.invoke(r9, r8, r0)
                if (r9 != r6) goto L4b
                goto L5c
            L4b:
                r8 = r3
            L4c:
                r8.t = r9
                T r8 = r3.t
                r0.t = r2
                r0.w = r4
                s54<java.lang.Object> r7 = r7.v
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r6) goto L5d
            L5c:
                return r6
            L5d:
                g2b r7 = defpackage.g2b.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: z54.a.emit(java.lang.Object, r02):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z54(m64 m64Var, qo7.b bVar, r02 r02Var) {
        super(2, r02Var);
        this.w = m64Var;
        this.x = bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        z54 z54Var = new z54(this.w, this.x, r02Var);
        z54Var.v = obj;
        return z54Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(s54<Object> s54Var, r02<? super g2b> r02Var) {
        return ((z54) create(s54Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r6.w.collect(r7, r6) == r4) goto L16;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.u
            r1 = 0
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L21
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.dv8.b(r7)
            goto L53
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r1
        L17:
            gl8 r0 = r6.t
            java.lang.Object r3 = r6.v
            s54 r3 = (defpackage.s54) r3
            defpackage.dv8.b(r7)
            goto L3d
        L21:
            defpackage.dv8.b(r7)
            java.lang.Object r7 = r6.v
            s54 r7 = (defpackage.s54) r7
            gl8 r0 = new gl8
            r0.<init>()
            r0.t = r1
            r6.v = r7
            r6.t = r0
            r6.u = r3
            java.lang.Object r3 = r7.emit(r1, r6)
            if (r3 != r4) goto L3c
            goto L52
        L3c:
            r3 = r7
        L3d:
            z54$a r7 = new z54$a
            qo7$b r5 = r6.x
            r7.<init>(r0, r5, r3)
            r6.v = r1
            r6.t = r1
            r6.u = r2
            m64 r0 = r6.w
            java.lang.Object r6 = r0.collect(r7, r6)
            if (r6 != r4) goto L53
        L52:
            return r4
        L53:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z54.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
