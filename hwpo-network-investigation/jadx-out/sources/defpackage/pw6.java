package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {164}, m = "invokeSuspend")
public final class pw6 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ hn9 u;
    public final /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw6(hn9 hn9Var, float f, r02<? super pw6> r02Var) {
        super(2, r02Var);
        this.u = hn9Var;
        this.v = f;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new pw6(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((pw6) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            wj<in9> wjVar = this.u.d;
            T value = wjVar.g.getValue();
            float fG = wjVar.g();
            float f = this.v;
            Object objC = wjVar.c(fG, f, value);
            boolean zBooleanValue = wjVar.d.invoke((T) objC).booleanValue();
            o37 o37Var = o37.t;
            Object obj2 = v72.t;
            if (zBooleanValue) {
                objB = wjVar.b(objC, o37Var, new gj(wjVar, f, null), this);
                if (objB != obj2) {
                    objB = g2b.a;
                }
                if (objB != obj2) {
                    objB = g2b.a;
                }
            } else {
                objB = wjVar.b(value, o37Var, new gj(wjVar, f, null), this);
                if (objB != obj2) {
                    objB = g2b.a;
                }
                if (objB != obj2) {
                    objB = g2b.a;
                }
            }
            if (objB != obj2) {
                objB = g2b.a;
            }
            if (objB == obj2) {
                return obj2;
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
