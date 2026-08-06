package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend", v = 1)
public final class pl0 extends p6a implements oh4<r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ol0 u;
    public final /* synthetic */ ol0.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl0(ol0 ol0Var, ol0.a aVar, r02<? super pl0> r02Var) {
        super(1, r02Var);
        this.u = ol0Var;
        this.v = aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new pl0(this.u, this.v, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((pl0) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ol0.a aVar = this.v;
        dt7 dt7Var = this.u.c;
        int i = this.t;
        try {
            if (i == 0) {
                dv8.b(obj);
                dt7Var.setValue(aVar);
                this.t = 1;
                zx0 zx0Var = aVar.b;
                zx0Var.getClass();
                Object objK = zx0.K(zx0Var, this);
                Object obj2 = v72.t;
                if (objK != obj2) {
                    objK = g2b.a;
                }
                if (objK == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            dt7Var.setValue(null);
            return g2b.a;
        } catch (Throwable th) {
            dt7Var.setValue(null);
            throw th;
        }
    }
}
