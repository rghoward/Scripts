package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class k74 implements r54<Object> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ ci4 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;
        public final /* synthetic */ ci4 u;

        /* JADX INFO: renamed from: k74$a$a, reason: collision with other inner class name */
        @xm2(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {217, 218}, m = "emit", v = 1)
        public static final class C0189a extends u02 {
            public /* synthetic */ Object t;
            public int u;
            public Object w;
            public s54 x;
            public int y;

            public C0189a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var, ci4 ci4Var) {
            this.t = s54Var;
            this.u = ci4Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        
            if (r7.emit(r1, r0) == r5) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.s54
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, defpackage.r02<? super defpackage.g2b> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof k74.a.C0189a
                if (r0 == 0) goto L13
                r0 = r8
                k74$a$a r0 = (k74.a.C0189a) r0
                int r1 = r0.u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.u = r1
                goto L18
            L13:
                k74$a$a r0 = new k74$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.t
                int r1 = r0.u
                r2 = 2
                r3 = 1
                r4 = 0
                v72 r5 = defpackage.v72.t
                if (r1 == 0) goto L3b
                if (r1 == r3) goto L31
                if (r1 != r2) goto L2b
                defpackage.dv8.b(r8)
                goto L64
            L2b:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r6)
                return r4
            L31:
                int r6 = r0.y
                s54 r7 = r0.x
                java.lang.Object r1 = r0.w
                defpackage.dv8.b(r8)
                goto L55
            L3b:
                defpackage.dv8.b(r8)
                r0.w = r7
                s54 r8 = r6.t
                r0.x = r8
                r1 = 0
                r0.y = r1
                r0.u = r3
                ci4 r6 = r6.u
                java.lang.Object r6 = r6.invoke(r7, r0)
                if (r6 != r5) goto L52
                goto L63
            L52:
                r6 = r1
                r1 = r7
                r7 = r8
            L55:
                r0.w = r4
                r0.x = r4
                r0.y = r6
                r0.u = r2
                java.lang.Object r6 = r7.emit(r1, r0)
                if (r6 != r5) goto L64
            L63:
                return r5
            L64:
                g2b r6 = defpackage.g2b.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: k74.a.emit(java.lang.Object, r02):java.lang.Object");
        }
    }

    public k74(r54 r54Var, ci4 ci4Var) {
        this.t = r54Var;
        this.u = ci4Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super Object> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var, this.u), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}
