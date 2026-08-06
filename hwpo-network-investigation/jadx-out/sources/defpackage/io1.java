package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$sendComment$1", f = "CommentsViewModel.kt", l = {377}, m = "invokeSuspend", v = 2)
public final class io1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qn1 u;
    public final /* synthetic */ db v;

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
    public io1(qn1 qn1Var, db dbVar, r02<? super io1> r02Var) {
        super(2, r02Var);
        this.u = qn1Var;
        this.v = dbVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new io1(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((io1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        final db dbVar = this.v;
        final qn1 qn1Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            fb fbVar = qn1Var.B;
            fb.a aVar = new fb.a(qn1Var.U, dbVar);
            this.t = 1;
            fbVar.getClass();
            obj = g5b.b(fbVar, aVar, this);
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
        ((xd3) obj).a(new oh4() { // from class: ho1
            @Override // defpackage.oh4
            public final Object invoke(Object obj2) {
                g2b g2bVar = (g2b) obj2;
                String str = dbVar.a;
                if (str != null && str.length() != 0) {
                    yk1 yk1Var = yk1.b;
                    int i2 = qn1.a0;
                    qn1Var.f(yk1Var);
                }
                int i3 = qn1.a0;
                rma.a aVar2 = rma.a;
                g2bVar.getClass();
                aVar2.a("kotlin.Unit", new Object[0]);
                return g2b.a;
            }
        }, new a(1, qn1Var, qn1.class, "onError", "onError(Ljava/lang/Exception;)V", 0));
        return g2b.a;
    }
}
