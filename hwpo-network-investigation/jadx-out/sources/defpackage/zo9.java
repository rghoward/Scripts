package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.onboarding.presentation.sign_in.SignInViewModel$setFieldsValidation$1", f = "SignInViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class zo9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qo9 u;
    public final /* synthetic */ r54<String> v;
    public final /* synthetic */ r54<String> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.onboarding.presentation.sign_in.SignInViewModel$setFieldsValidation$1$1", f = "SignInViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ei4<Boolean, Boolean, r02<? super Boolean>, Object> {
        public /* synthetic */ boolean t;
        public /* synthetic */ boolean u;

        @Override // defpackage.ei4
        public final Object invoke(Boolean bool, Boolean bool2, r02<? super Boolean> r02Var) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = new a(3, r02Var);
            aVar.t = zBooleanValue;
            aVar.u = zBooleanValue2;
            return aVar.invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.t;
            boolean z2 = this.u;
            dv8.b(obj);
            return Boolean.valueOf(z2 & z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> implements s54 {
        public final /* synthetic */ qo9 t;

        public b(qo9 qo9Var) {
            this.t = qo9Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            qo9.a.c cVar = new qo9.a.c(((Boolean) obj).booleanValue());
            int i = qo9.H;
            this.t.e(cVar);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo9(qo9 qo9Var, r54<String> r54Var, r54<String> r54Var2, r02<? super zo9> r02Var) {
        super(2, r02Var);
        this.u = qo9Var;
        this.v = r54Var;
        this.w = r54Var2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new zo9(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((zo9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            int i2 = qo9.H;
            s7b s7bVar = new s7b(new t7b(new v7b(new w7b(this.v))));
            s7b s7bVar2 = new s7b(new u7b(new v7b(new w7b(this.w))));
            a aVar = new a(3, null);
            b bVar = new b(this.u);
            this.t = 1;
            dj1 dj1Var = new dj1(new r54[]{s7bVar, s7bVar2}, new n74(aVar, null), bVar, null);
            u54 u54Var = new u54(this, getContext());
            Object objD = wx7.d(u54Var, true, u54Var, dj1Var);
            Object obj2 = v72.t;
            if (objD != obj2) {
                objD = g2b.a;
            }
            if (objD != obj2) {
                objD = g2b.a;
            }
            if (objD == obj2) {
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
