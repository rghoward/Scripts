package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$observeTrackingActions$2", f = "ValueDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x9b extends p6a implements ci4<xd3<? extends Exception, ? extends rsa>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ o9b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9b(o9b o9bVar, r02<? super x9b> r02Var) {
        super(2, r02Var);
        this.u = o9bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        x9b x9bVar = new x9b(this.u, r02Var);
        x9bVar.t = obj;
        return x9bVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends rsa> xd3Var, r02<? super g2b> r02Var) {
        return ((x9b) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        xd3Var.getClass();
        rsa rsaVar = (rsa) ((xd3.b) xd3Var).a;
        boolean z = rsaVar instanceof rsa.a;
        c13 c13Var = c13.w;
        o9b o9bVar = this.u;
        if (z) {
            int i = o9b.m0;
            o9bVar.j(c13Var);
        } else {
            if (!(rsaVar instanceof rsa.b)) {
                u.b();
                return null;
            }
            o9bVar.f(new j8b(o9bVar.z.b(R.string.entry_successfully_deleted, new Object[0])));
            if (o9bVar.b().a.size() == 1) {
                c13Var = c13.u;
            }
            o9bVar.j(c13Var);
        }
        return g2b.a;
    }
}
