package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zf1 extends gw2 implements g58, ju1, nq5 {
    public qi J;
    public boolean K;
    public int L;
    public wv<Float> M;
    public float N;
    public float O;
    public final dt7 P;
    public final v6a Q;
    public final v6a R;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: zf1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", l = {1532}, m = "invokeSuspend")
        public static final class C0293a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ zf1 u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0293a(zf1 zf1Var, r02<? super C0293a> r02Var) {
                super(2, r02Var);
                this.u = zf1Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C0293a(this.u, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C0293a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    zf1 zf1Var = this.u;
                    if (zf1Var.K) {
                        zf1Var.J.d(1);
                    }
                    qi qiVar = zf1Var.J;
                    wv<Float> wvVar = zf1Var.M;
                    this.t = 1;
                    float fH = qiVar.h(qiVar.a.e() == 0 ? qiVar.d : qiVar.e);
                    w37 w37Var = qiVar.g;
                    oi oiVar = new oi(qiVar, fH, wvVar, null);
                    w37Var.getClass();
                    Object objD = u72.d(new t37(o37.v, w37Var, oiVar, null), this);
                    Object obj2 = v72.t;
                    if (objD != obj2) {
                        objD = g2b.a;
                    }
                    if (objD == obj2) {
                        return obj2;
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
        @xm2(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", l = {1539}, m = "invokeSuspend")
        public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ zf1 u;
            public final /* synthetic */ vf7 v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(zf1 zf1Var, vf7 vf7Var, r02<? super b> r02Var) {
                super(2, r02Var);
                this.u = zf1Var;
                this.v = vf7Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new b(this.u, this.v, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v12, types: [T, java.lang.Boolean] */
            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                zf1 zf1Var = this.u;
                dt7 dt7Var = zf1Var.P;
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    float f = zf1Var.N;
                    vf7 vf7Var = this.v;
                    zf1Var.N = Float.intBitsToFloat((int) (vf7Var.a >> 32)) + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (vf7Var.a & 4294967295L)) + zf1Var.O;
                    zf1Var.O = fIntBitsToFloat;
                    qi qiVar = zf1Var.J;
                    float f2 = fIntBitsToFloat - ((int) (((bg5) dt7Var.getValue()).a & 4294967295L));
                    float f3 = zf1Var.N - ((int) (((bg5) dt7Var.getValue()).a >> 32));
                    float f4 = xna.a;
                    float fAtan2 = ((float) Math.atan2(f2, f3)) - 1.5707964f;
                    if (fAtan2 < 0.0f) {
                        fAtan2 += 6.2831855f;
                    }
                    float f5 = fAtan2;
                    wv<Float> wvVar = zf1Var.M;
                    this.t = 1;
                    qiVar.b.a = Boolean.FALSE;
                    w37 w37Var = qiVar.g;
                    pi piVar = new pi(qiVar, f5, false, wvVar, null);
                    w37Var.getClass();
                    Object objD = u72.d(new t37(o37.u, w37Var, piVar, null), this);
                    Object obj2 = v72.t;
                    if (objD != obj2) {
                        objD = g2b.a;
                    }
                    if (objD == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                xna.s(zf1Var.J, zf1Var.N, zf1Var.O, zf1.f2(zf1Var), ((bg5) dt7Var.getValue()).a);
                return g2b.a;
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
            int i = 0;
            zf1 zf1Var = zf1.this;
            Object objD = x53.d(i58Var, new l7(1), new xf1(i, zf1Var), new j42(1), new yf1(i, zf1Var), r02Var);
            return objD == v72.t ? objD : g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends p6a implements ei4<j88, vf7, r02<? super g2b>, Object> {
            public /* synthetic */ long t;
            public final /* synthetic */ zf1 u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zf1 zf1Var, r02<? super a> r02Var) {
                super(3, r02Var);
                this.u = zf1Var;
            }

            @Override // defpackage.ei4
            public final Object invoke(j88 j88Var, vf7 vf7Var, r02<? super g2b> r02Var) {
                long j = vf7Var.a;
                a aVar = new a(this.u, r02Var);
                aVar.t = j;
                return aVar.invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                dv8.b(obj);
                long j = this.t;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                zf1 zf1Var = this.u;
                zf1Var.N = fIntBitsToFloat;
                zf1Var.O = Float.intBitsToFloat((int) (j & 4294967295L));
                return g2b.a;
            }
        }

        /* JADX INFO: renamed from: zf1$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", l = {1509}, m = "invokeSuspend")
        public static final class C0294b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ zf1 u;
            public final /* synthetic */ vf7 v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0294b(zf1 zf1Var, vf7 vf7Var, r02<? super C0294b> r02Var) {
                super(2, r02Var);
                this.u = zf1Var;
                this.v = vf7Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C0294b(this.u, this.v, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C0294b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    zf1 zf1Var = this.u;
                    qi qiVar = zf1Var.J;
                    vf7 vf7Var = this.v;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (vf7Var.a >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (vf7Var.a & 4294967295L));
                    float fF2 = zf1.f2(zf1Var);
                    boolean z = zf1Var.K;
                    long j = ((bg5) zf1Var.P.getValue()).a;
                    wv<Float> wvVar = zf1Var.M;
                    this.t = 1;
                    Object objP = xna.p(qiVar, fIntBitsToFloat, fIntBitsToFloat2, fF2, z, j, wvVar, this);
                    v72 v72Var = v72.t;
                    if (objP == v72Var) {
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

        public b() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
            final zf1 zf1Var = zf1.this;
            Object objD = o8a.d(i58Var, null, new a(zf1Var, null), new oh4() { // from class: ag1
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    zf1 zf1Var2 = zf1Var;
                    oy0.d(zf1Var2.Q1(), null, null, new zf1.b.C0294b(zf1Var2, (vf7) obj, null), 3);
                    return g2b.a;
                }
            }, r02Var, 3);
            return objD == v72.t ? objD : g2b.a;
        }
    }

    public zf1() {
        throw null;
    }

    public zf1(qi qiVar, boolean z, int i, wv wvVar) {
        this.J = qiVar;
        this.K = z;
        this.L = i;
        this.M = wvVar;
        this.P = bl7.i(new bg5(0L));
        z6a z6aVarA = t6a.a(new b());
        c2(z6aVarA);
        this.Q = z6aVarA;
        z6a z6aVarA2 = t6a.a(new a());
        c2(z6aVarA2);
        this.R = z6aVarA2;
    }

    public static final float f2(zf1 zf1Var) {
        tx2 tx2Var = ew2.f(zf1Var).R;
        return (tx2Var.U0(xna.f) * tx2Var.n1(zf1Var.J.i())) / tx2Var.n1(y48.x);
    }

    @Override // defpackage.g58
    public final void c0(r48 r48Var, s48 s48Var, long j) {
        this.Q.c0(r48Var, s48Var, j);
        this.R.c0(r48Var, s48Var, j);
    }

    @Override // defpackage.nq5, defpackage.ml6
    public final void g(long j) {
        this.P.setValue(new bg5(c43.b(j)));
        this.J.c.setValue(new y43(ew2.f(this).R.F0((int) (j >> 32))));
    }

    @Override // defpackage.g58
    public final void t0() {
        this.Q.t0();
        this.R.t0();
    }
}
