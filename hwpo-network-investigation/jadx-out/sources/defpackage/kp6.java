package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.hwpo_library.presentation.MediaLibraryViewModel$loadAttachmentsNextPage$1", f = "MediaLibraryViewModel.kt", l = {158}, m = "invokeSuspend", v = 2)
public final class kp6 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ip6 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp6(ip6 ip6Var, r02<? super kp6> r02Var) {
        super(2, r02Var);
        this.u = ip6Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new kp6(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((kp6) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        ip6 ip6Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            ob6 ob6Var = ip6Var.y;
            ob6.a aVar = new ob6.a(ip6Var.b().h);
            this.t = 1;
            ob6Var.getClass();
            obj = g5b.b(ob6Var, aVar, this);
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
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            Exception exc = (Exception) ((xd3.a) xd3Var).a;
            rma.a.b(exc);
            ip6.b bVar = ip6.Companion;
            ip6Var.e(ip6.a.d.a);
            ip6Var.f(new bp6.c(ip6Var.A.a(exc)));
            g2b g2bVar = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            ip6.a.f fVar = new ip6.a.f(y60.b((List) ((xd3.b) xd3Var).a));
            ip6.b bVar2 = ip6.Companion;
            ip6Var.e(fVar);
            g2b g2bVar2 = g2b.a;
        }
        return g2b.a;
    }
}
