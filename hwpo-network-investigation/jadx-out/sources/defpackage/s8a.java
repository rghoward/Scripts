package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {274}, m = "invokeSuspend", v = 1)
public final class s8a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ i58 v;
    public final /* synthetic */ yfa.a w;
    public final /* synthetic */ xfa x;
    public final /* synthetic */ m88 y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {277, 283}, m = "invokeSuspend", v = 1)
    public static final class a extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
        public final /* synthetic */ m88 A;
        public dz9 u;
        public int v;
        public /* synthetic */ Object w;
        public final /* synthetic */ t72 x;
        public final /* synthetic */ yfa.a y;
        public final /* synthetic */ xfa z;

        /* JADX INFO: renamed from: s8a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {280}, m = "invokeSuspend", v = 1)
        public static final class C0242a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ yfa.a u;
            public final /* synthetic */ m88 v;
            public final /* synthetic */ a58 w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0242a(yfa.a aVar, m88 m88Var, a58 a58Var, r02 r02Var) {
                super(2, r02Var);
                this.u = aVar;
                this.v = m88Var;
                this.w = a58Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C0242a(this.u, this.v, this.w, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C0242a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    long j = this.w.c;
                    this.t = 1;
                    yfa.a aVar = this.u;
                    yfa.a aVar2 = new yfa.a(aVar.w, aVar.x, aVar.y, this);
                    aVar2.u = this.v;
                    aVar2.v = j;
                    Object objInvokeSuspend = aVar2.invokeSuspend(g2b.a);
                    v72 v72Var = v72.t;
                    if (objInvokeSuspend == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public final /* synthetic */ m88 t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(m88 m88Var, r02<? super b> r02Var) {
                super(2, r02Var);
                this.t = m88Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new b(this.t, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                dv8.b(obj);
                this.t.e();
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public final /* synthetic */ m88 t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(m88 m88Var, r02<? super c> r02Var) {
                super(2, r02Var);
                this.t = m88Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new c(this.t, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                dv8.b(obj);
                this.t.f();
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {275}, m = "invokeSuspend", v = 1)
        public static final class d extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ m88 u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(m88 m88Var, r02<? super d> r02Var) {
                super(2, r02Var);
                this.u = m88Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new d(this.u, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((d) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    this.t = 1;
                    Object objG = this.u.g(this);
                    v72 v72Var = v72.t;
                    if (objG == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t72 t72Var, yfa.a aVar, xfa xfaVar, m88 m88Var, r02 r02Var) {
            super(2, r02Var);
            this.x = t72Var;
            this.y = aVar;
            this.z = xfaVar;
            this.A = m88Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.x, this.y, this.z, this.A, r02Var);
            aVar.w = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
            return ((a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        
            if (r11 == r6) goto L19;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                int r0 = r10.v
                t72 r1 = r10.x
                r2 = 2
                r3 = 1
                m88 r4 = r10.A
                r5 = 0
                v72 r6 = defpackage.v72.t
                if (r0 == 0) goto L29
                if (r0 == r3) goto L1f
                if (r0 != r2) goto L19
                java.lang.Object r0 = r10.w
                el5 r0 = (defpackage.el5) r0
                defpackage.dv8.b(r11)
                goto L6e
            L19:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r10)
                return r5
            L1f:
                dz9 r0 = r10.u
                java.lang.Object r3 = r10.w
                yg0 r3 = (defpackage.yg0) r3
                defpackage.dv8.b(r11)
                goto L4c
            L29:
                defpackage.dv8.b(r11)
                java.lang.Object r11 = r10.w
                yg0 r11 = (defpackage.yg0) r11
                s8a$a$d r0 = new s8a$a$d
                r0.<init>(r4, r5)
                x72 r7 = defpackage.x72.w
                dz9 r0 = defpackage.oy0.d(r1, r5, r7, r0, r3)
                r10.w = r11
                r10.u = r0
                r10.v = r3
                r3 = 3
                java.lang.Object r3 = defpackage.o8a.b(r11, r10, r3)
                if (r3 != r6) goto L49
                goto L6d
            L49:
                r9 = r3
                r3 = r11
                r11 = r9
            L4c:
                a58 r11 = (defpackage.a58) r11
                r11.a()
                o8a$a r7 = defpackage.o8a.a
                yfa$a r8 = r10.y
                if (r8 == r7) goto L5f
                s8a$a$a r7 = new s8a$a$a
                r7.<init>(r8, r4, r11, r5)
                defpackage.o8a.f(r1, r0, r7)
            L5f:
                r10.w = r0
                r10.u = r5
                r10.v = r2
                s48 r11 = defpackage.s48.u
                java.lang.Object r11 = defpackage.o8a.i(r3, r11, r10)
                if (r11 != r6) goto L6e
            L6d:
                return r6
            L6e:
                a58 r11 = (defpackage.a58) r11
                if (r11 != 0) goto L7b
                s8a$a$b r10 = new s8a$a$b
                r10.<init>(r4, r5)
                defpackage.o8a.f(r1, r0, r10)
                goto L92
            L7b:
                r11.a()
                s8a$a$c r2 = new s8a$a$c
                r2.<init>(r4, r5)
                defpackage.o8a.f(r1, r0, r2)
                long r0 = r11.c
                vf7 r11 = new vf7
                r11.<init>(r0)
                xfa r10 = r10.z
                r10.invoke(r11)
            L92:
                g2b r10 = defpackage.g2b.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: s8a.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8a(i58 i58Var, yfa.a aVar, xfa xfaVar, m88 m88Var, r02 r02Var) {
        super(2, r02Var);
        this.v = i58Var;
        this.w = aVar;
        this.x = xfaVar;
        this.y = m88Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        s8a s8aVar = new s8a(this.v, this.w, this.x, this.y, r02Var);
        s8aVar.u = obj;
        return s8aVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((s8a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a((t72) this.u, this.w, this.x, this.y, null);
            this.t = 1;
            Object objB = cc4.b(this.v, aVar, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
