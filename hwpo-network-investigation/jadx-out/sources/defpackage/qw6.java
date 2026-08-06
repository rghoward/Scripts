package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
public final class qw6 extends p6a implements ei4<t72, Float, r02<? super g2b>, Object> {
    public /* synthetic */ float t;
    public final /* synthetic */ oh4<Float, g2b> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qw6(oh4<? super Float, g2b> oh4Var, r02<? super qw6> r02Var) {
        super(3, r02Var);
        this.u = oh4Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, Float f, r02<? super g2b> r02Var) {
        float fFloatValue = f.floatValue();
        qw6 qw6Var = new qw6(this.u, r02Var);
        qw6Var.t = fFloatValue;
        return qw6Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.u.invoke(new Float(this.t));
        return g2b.a;
    }
}
