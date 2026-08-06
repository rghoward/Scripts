package defpackage;

import defpackage.bl0;
import defpackage.el0;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dl0<ViewState extends el0, ViewAction extends bl0> extends mhb {
    public static final /* synthetic */ ho5<Object>[] w = {new z27(dl0.class, "state", "getState()Lcom/hwpo_training_app/base/presentation/BaseViewState;", 0)};
    public final cq9 t;
    public final k27<ViewState> u;
    public final lb6 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements qf7, mi4 {
        public final /* synthetic */ cl0 t;

        public a(cl0 cl0Var) {
            this.t = cl0Var;
        }

        @Override // defpackage.qf7
        public final /* synthetic */ void a(Object obj) {
            this.t.invoke(obj);
        }

        @Override // defpackage.mi4
        public final di4<?> b() {
            return this.t;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof qf7) && (obj instanceof mi4)) {
                return xj5.a(b(), ((mi4) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public dl0(ViewState viewstate) {
        viewstate.getClass();
        this.t = new cq9();
        k27<ViewState> k27Var = new k27<>();
        this.u = k27Var;
        this.v = new lb6(k27Var);
        k27Var.j(viewstate);
    }

    public final ViewState b() {
        return (ViewState) this.v.a(this, w[0]);
    }

    public final void c(m76 m76Var, oh4<? super gm3<? extends Object>, g2b> oh4Var) {
        this.t.e(m76Var, new a(new cl0(0, oh4Var)));
    }

    public abstract ViewState d(bl0 bl0Var);

    public final void e(bl0 bl0Var) {
        bl0Var.getClass();
        el0 el0VarD = d(bl0Var);
        el0VarD.getClass();
        ho5<Object> ho5Var = w[0];
        lb6 lb6Var = this.v;
        lb6Var.getClass();
        ho5Var.getClass();
        lb6Var.a.j(el0VarD);
    }

    public final void f(gm3<? extends Object> gm3Var) {
        gm3Var.getClass();
        cq9 cq9Var = this.t;
        cq9Var.getClass();
        cq9Var.j(gm3Var);
    }
}
