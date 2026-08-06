package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListFragment$initSearch$1", f = "ValuesListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class sbb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ rbb t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            ybb ybbVar = (ybb) this.receiver;
            String str = ybbVar.E;
            ybbVar.E = str;
            ybbVar.g(str);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbb(rbb rbbVar, r02<? super sbb> r02Var) {
        super(2, r02Var);
        this.t = rbbVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new sbb(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((sbb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        rbb rbbVar = this.t;
        whb parentFragment = rbbVar.getParentFragment();
        k89 k89Var = parentFragment instanceof k89 ? (k89) parentFragment : null;
        if (k89Var != null) {
            k89Var.c(new a(0, rbbVar.q(), ybb.class, "searchForCurrentQuery", "searchForCurrentQuery()V", 0));
            li8 li8VarG = k89Var.g();
            ybb ybbVarQ = rbbVar.q();
            yk2.o(new k74(yk2.j(yk2.i(li8VarG), 1), new mm2(2, ybbVarQ, ybb.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 4, 1)), rhb.b(ybbVarQ));
        }
        return g2b.a;
    }
}
