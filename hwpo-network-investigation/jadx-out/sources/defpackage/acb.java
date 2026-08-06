package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class acb<T> implements s54 {
    public final /* synthetic */ s54 t;
    public final /* synthetic */ ybb u;

    @xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListViewModel$observeActions$$inlined$filter$1$2", f = "ValuesListViewModel.kt", l = {217}, m = "emit", v = 2)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public int u;

        public a(r02 r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.u |= Integer.MIN_VALUE;
            return acb.this.emit(null, this);
        }
    }

    public acb(s54 s54Var, ybb ybbVar) {
        this.t = s54Var;
        this.u = ybbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s54
    public final Object emit(Object obj, r02 r02Var) throws Throwable {
        a aVar;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.u = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(r02Var);
            }
        } else {
            aVar = new a(r02Var);
        }
        Object obj2 = aVar.t;
        int i2 = aVar.u;
        if (i2 == 0) {
            dv8.b(obj2);
            xd3 xd3Var = (xd3) obj;
            if ((xd3Var instanceof xd3.b) && ((rsa) ((xd3.b) xd3Var).a).a() == this.u.I) {
                aVar.u = 1;
                Object objEmit = this.t.emit(obj, aVar);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj2);
        }
        return g2b.a;
    }
}
