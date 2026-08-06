package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yr7 implements r54 {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ ci4 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;
        public final /* synthetic */ ci4 u;

        /* JADX INFO: renamed from: yr7$a$a, reason: collision with other inner class name */
        @xm2(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2", f = "PagingDataTransforms.kt", l = {52, 50}, m = "emit", v = 1)
        public static final class C0289a extends u02 {
            public /* synthetic */ Object t;
            public int u;
            public s54 v;

            public C0289a(r02 r02Var) {
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
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r7.emit(r9, r0) == r5) goto L22;
         */
        @Override // defpackage.s54
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, defpackage.r02 r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof yr7.a.C0289a
                if (r0 == 0) goto L13
                r0 = r9
                yr7$a$a r0 = (yr7.a.C0289a) r0
                int r1 = r0.u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.u = r1
                goto L18
            L13:
                yr7$a$a r0 = new yr7$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.t
                int r1 = r0.u
                r2 = 0
                r3 = 2
                r4 = 1
                v72 r5 = defpackage.v72.t
                if (r1 == 0) goto L37
                if (r1 == r4) goto L31
                if (r1 != r3) goto L2b
                defpackage.dv8.b(r9)
                goto L59
            L2b:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                return r2
            L31:
                s54 r7 = r0.v
                defpackage.dv8.b(r9)
                goto L4e
            L37:
                defpackage.dv8.b(r9)
                oo7 r8 = (defpackage.oo7) r8
                s54 r9 = r7.t
                r0.v = r9
                r0.u = r4
                ci4 r7 = r7.u
                java.lang.Object r7 = r8.a(r7, r0)
                if (r7 != r5) goto L4b
                goto L58
            L4b:
                r6 = r9
                r9 = r7
                r7 = r6
            L4e:
                r0.v = r2
                r0.u = r3
                java.lang.Object r7 = r7.emit(r9, r0)
                if (r7 != r5) goto L59
            L58:
                return r5
            L59:
                g2b r7 = defpackage.g2b.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: yr7.a.emit(java.lang.Object, r02):java.lang.Object");
        }
    }

    public yr7(r54 r54Var, ci4 ci4Var) {
        this.t = r54Var;
        this.u = ci4Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54 s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var, this.u), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}
