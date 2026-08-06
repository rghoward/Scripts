package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {83}, m = "invokeSuspend", v = 1)
public final class db9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ yz9<vf7> v;
    public final /* synthetic */ qt<vf7, cw> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ qt<vf7, cw> t;
        public final /* synthetic */ t72 u;

        public a(qt<vf7, cw> qtVar, t72 t72Var) {
            this.t = qtVar;
            this.u = t72Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            long j = ((vf7) obj).a;
            qt<vf7, cw> qtVar = this.t;
            if ((qtVar.d().a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (qtVar.d().a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                Object objE = qtVar.e(r02Var, new vf7(j));
                return objE == v72.t ? objE : g2b.a;
            }
            oy0.d(this.u, null, null, new cb9(qtVar, j, null), 3);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db9(yz9<vf7> yz9Var, qt<vf7, cw> qtVar, r02<? super db9> r02Var) {
        super(2, r02Var);
        this.v = yz9Var;
        this.w = qtVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        db9 db9Var = new db9(this.v, this.w, r02Var);
        db9Var.u = obj;
        return db9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((db9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            t72 t72Var = (t72) this.u;
            oz8 oz8VarK = bl7.k(new ml2(1, this.v));
            a aVar = new a(this.w, t72Var);
            this.t = 1;
            Object objCollect = oz8VarK.collect(aVar, this);
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
        return g2b.a;
    }
}
