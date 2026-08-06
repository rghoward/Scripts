package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend", v = 1)
public final class t8a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ i58 v;
    public final /* synthetic */ oh4<vf7, g2b> w;
    public final /* synthetic */ oh4<vf7, g2b> x;
    public final /* synthetic */ ei4<j88, vf7, r02<? super g2b>, Object> y;
    public final /* synthetic */ oh4<vf7, g2b> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105}, m = "invokeSuspend", v = 1)
    public static final class a extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
        public final /* synthetic */ ei4<j88, vf7, r02<? super g2b>, Object> A;
        public final /* synthetic */ oh4<vf7, g2b> B;
        public int u;
        public /* synthetic */ Object v;
        public final /* synthetic */ t72 w;
        public final /* synthetic */ m88 x;
        public final /* synthetic */ oh4<vf7, g2b> y;
        public final /* synthetic */ oh4<vf7, g2b> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t72 t72Var, m88 m88Var, oh4<? super vf7, g2b> oh4Var, oh4<? super vf7, g2b> oh4Var2, ei4<? super j88, ? super vf7, ? super r02<? super g2b>, ? extends Object> ei4Var, oh4<? super vf7, g2b> oh4Var3, r02<? super a> r02Var) {
            super(2, r02Var);
            this.w = t72Var;
            this.x = m88Var;
            this.y = oh4Var;
            this.z = oh4Var2;
            this.A = ei4Var;
            this.B = oh4Var3;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.w, this.x, this.y, this.z, this.A, this.B, r02Var);
            aVar.v = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
            return ((a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.u;
            if (i == 0) {
                dv8.b(obj);
                yg0 yg0Var = (yg0) this.v;
                this.u = 1;
                Object objG = o8a.g(yg0Var, this.w, this.x, this.y, this.z, this.A, this.B, this);
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
    /* JADX WARN: Multi-variable type inference failed */
    public t8a(i58 i58Var, oh4<? super vf7, g2b> oh4Var, oh4<? super vf7, g2b> oh4Var2, ei4<? super j88, ? super vf7, ? super r02<? super g2b>, ? extends Object> ei4Var, oh4<? super vf7, g2b> oh4Var3, r02<? super t8a> r02Var) {
        super(2, r02Var);
        this.v = i58Var;
        this.w = oh4Var;
        this.x = oh4Var2;
        this.y = ei4Var;
        this.z = oh4Var3;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        t8a t8aVar = new t8a(this.v, this.w, this.x, this.y, this.z, r02Var);
        t8aVar.u = obj;
        return t8aVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((t8a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            t72 t72Var = (t72) this.u;
            i58 i58Var = this.v;
            a aVar = new a(t72Var, new m88(i58Var), this.w, this.x, this.y, this.z, null);
            this.t = 1;
            Object objB = cc4.b(i58Var, aVar, this);
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
