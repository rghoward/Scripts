package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.TimePickerKt$TimePicker$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
public final class eoa extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ hl8<Boolean> t;
    public final /* synthetic */ qi u;
    public final /* synthetic */ ioa v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoa(hl8<Boolean> hl8Var, qi qiVar, ioa ioaVar, r02<? super eoa> r02Var) {
        super(2, r02Var);
        this.t = hl8Var;
        this.u = qiVar;
        this.v = ioaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new eoa(this.t, this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((eoa) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean, java.lang.Object] */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        hl8<Boolean> hl8Var = this.t;
        Boolean bool = hl8Var.a;
        ?? r1 = Boolean.TRUE;
        if (xj5.a(bool, r1)) {
            ioa ioaVar = this.v;
            int iG = ioaVar.g();
            qi qiVar = this.u;
            qiVar.a(iG);
            qiVar.b(ioaVar.c());
        }
        hl8Var.a = r1;
        return g2b.a;
    }
}
