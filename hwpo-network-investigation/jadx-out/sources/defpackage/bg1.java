package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.ClockDialNode$updateNode$1", f = "TimePicker.kt", l = {1581}, m = "invokeSuspend")
public final class bg1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qi u;
    public final /* synthetic */ wv<Float> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg1(qi qiVar, wv<Float> wvVar, r02<? super bg1> r02Var) {
        super(2, r02Var);
        this.u = qiVar;
        this.v = wvVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new bg1(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((bg1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objD;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            qi qiVar = this.u;
            ioa ioaVar = qiVar.a;
            int iE = ioaVar.e();
            Object obj2 = v72.t;
            if ((iE == 0 && qi.j(((Number) qiVar.f.e.getValue()).floatValue()) == qi.j(qiVar.d)) || (ioaVar.e() == 1 && qi.j(((Number) qiVar.f.e.getValue()).floatValue()) == qi.j(qiVar.e))) {
                objD = g2b.a;
            } else {
                float fH = ioaVar.e() == 0 ? qiVar.h(qiVar.d) : qiVar.h(qiVar.e);
                w37 w37Var = qiVar.g;
                ni niVar = new ni(qiVar, fH, this.v, null);
                w37Var.getClass();
                objD = u72.d(new t37(o37.v, w37Var, niVar, null), this);
                if (objD != obj2) {
                    objD = g2b.a;
                }
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
