package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {607}, m = "invokeSuspend", v = 1)
public final class x89 extends p6a implements oh4<r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ tva<Object> u;
    public final /* synthetic */ w89<Object> v;
    public final /* synthetic */ Object w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2194, 620, 622, 676, 678}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public a47 t;
        public w89 u;
        public int v;
        public final /* synthetic */ w89<Object> w;
        public final /* synthetic */ Object x;
        public final /* synthetic */ tva<Object> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r02 r02Var, w89 w89Var, tva tvaVar, Object obj) {
            super(2, r02Var);
            this.w = w89Var;
            this.x = obj;
            this.y = tvaVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            Object obj2 = this.x;
            return new a(r02Var, this.w, this.y, obj2);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[PHI: r16
          0x00c5: PHI (r16v6 long) = (r16v4 long), (r16v5 long), (r16v9 long) binds: [B:26:0x008c, B:40:0x00c1, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:46:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:56:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:58:0x010d  */
        /* JADX WARN: Code duplicated, block: B:59:0x010f  */
        /* JADX WARN: Code duplicated, block: B:69:0x0132  */
        /* JADX WARN: Code duplicated, block: B:71:0x0136  */
        /* JADX WARN: Code duplicated, block: B:76:0x0176  */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x017f, code lost:
        
            if (defpackage.w89.w(r13, r24) == r15) goto L78;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 399
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x89.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x89(r02 r02Var, w89 w89Var, tva tvaVar, Object obj) {
        super(1, r02Var);
        this.u = tvaVar;
        this.v = w89Var;
        this.w = obj;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new x89(r02Var, this.v, this.u, this.w);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((x89) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        tva<Object> tvaVar = this.u;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a(null, this.v, tvaVar, this.w);
            this.t = 1;
            Object objD = u72.d(aVar, this);
            v72 v72Var = v72.t;
            if (objD == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        tvaVar.i();
        return g2b.a;
    }
}
