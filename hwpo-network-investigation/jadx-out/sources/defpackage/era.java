package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", l = {1655}, m = "invokeSuspend")
public final class era extends p6a implements oh4<r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ fra u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public era(fra fraVar, r02<? super era> r02Var) {
        super(1, r02Var);
        this.u = fraVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new era(this.u, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((era) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            e41 e41Var = new e41(1, th0.e(this));
            e41Var.t();
            fra fraVar = this.u;
            fraVar.b.u(Boolean.TRUE);
            fraVar.c = e41Var;
            Object objR = e41Var.r();
            v72 v72Var = v72.t;
            if (objR == v72Var) {
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
