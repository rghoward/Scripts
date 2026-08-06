package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$refresh$1", f = "CommentsViewModel.kt", l = {176}, m = "invokeSuspend", v = 2)
public final class go1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qn1 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            qn1.g((qn1) this.receiver, exc2);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go1(qn1 qn1Var, r02<? super go1> r02Var) {
        super(2, r02Var);
        this.u = qn1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new go1(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((go1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        qn1 qn1Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            hu3 hu3Var = qn1Var.z;
            pk1 pk1Var = qn1Var.U;
            this.t = 1;
            hu3Var.getClass();
            obj = g5b.b(hu3Var, pk1Var, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        xd3 xd3Var = (xd3) obj;
        a aVar = new a(1, qn1Var, qn1.class, "onError", "onError(Ljava/lang/Exception;)V", 0);
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            aVar.invoke(((xd3.a) xd3Var).a);
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            il1 il1Var = il1.b;
            int i2 = qn1.a0;
            qn1Var.f(il1Var);
            g2b g2bVar = g2b.a;
        }
        return g2b.a;
    }
}
