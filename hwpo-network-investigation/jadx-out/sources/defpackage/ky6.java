package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.MotionDurationScaleImpl$startObservingSystemScaleFactor$1", f = "WindowRecomposer.android.kt", l = {446}, m = "invokeSuspend", v = 1)
public final class ky6 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ zz9<Float> u;
    public final /* synthetic */ ly6 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ ly6 t;

        public a(ly6 ly6Var) {
            this.t = ly6Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            this.t.v.g(((Number) obj).floatValue());
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky6(zz9<Float> zz9Var, ly6 ly6Var, r02<? super ky6> r02Var) {
        super(2, r02Var);
        this.u = zz9Var;
        this.v = ly6Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ky6(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) throws Throwable {
        ((ky6) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        return v72.t;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a(this.v);
            this.t = 1;
            Object objCollect = this.u.collect(aVar, this);
            v72 v72Var = v72.t;
            if (objCollect == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        fl.a();
        return null;
    }
}
