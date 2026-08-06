package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", l = {670}, m = "invokeSuspend")
public final class b51 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ h27 u;
    public final /* synthetic */ fv9<qg5> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ fv9<qg5> t;

        public a(fv9<qg5> fv9Var) {
            this.t = fv9Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            qg5 qg5Var = (qg5) obj;
            boolean z = qg5Var instanceof l35;
            fv9<qg5> fv9Var = this.t;
            if (z) {
                fv9Var.add(qg5Var);
            } else if (qg5Var instanceof m35) {
                fv9Var.remove(((m35) qg5Var).a);
            } else if (qg5Var instanceof v84) {
                fv9Var.add(qg5Var);
            } else if (qg5Var instanceof w84) {
                fv9Var.remove(((w84) qg5Var).a);
            } else if (qg5Var instanceof n88.b) {
                fv9Var.add(qg5Var);
            } else if (qg5Var instanceof n88.c) {
                fv9Var.remove(((n88.c) qg5Var).a);
            } else if (qg5Var instanceof n88.a) {
                fv9Var.remove(((n88.a) qg5Var).a);
            } else if (qg5Var instanceof d63) {
                fv9Var.add(qg5Var);
            } else if (qg5Var instanceof e63) {
                fv9Var.remove(((e63) qg5Var).a);
            } else if (qg5Var instanceof c63) {
                fv9Var.remove(((c63) qg5Var).a);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b51(h27 h27Var, fv9<qg5> fv9Var, r02<? super b51> r02Var) {
        super(2, r02Var);
        this.u = h27Var;
        this.v = fv9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new b51(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((b51) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i != 0) {
            if (i == 1) {
                dv8.b(obj);
                return g2b.a;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        am9 am9VarA = this.u.a();
        a aVar = new a(this.v);
        this.t = 1;
        am9VarA.collect(aVar, this);
        return v72.t;
    }
}
