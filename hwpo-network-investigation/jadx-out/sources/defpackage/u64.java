package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class u64<T> implements s54 {
    public final /* synthetic */ el8 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ s54<T> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {22}, m = "emit", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public final /* synthetic */ u64<T> u;
        public int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(u64<? super T> u64Var, r02<? super a> r02Var) {
            super(r02Var);
            this.u = u64Var;
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return this.u.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u64(el8 el8Var, int i, s54<? super T> s54Var) {
        this.t = el8Var;
        this.u = i;
        this.v = s54Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s54
    public final Object emit(T t, r02<? super g2b> r02Var) throws Throwable {
        a aVar;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.v = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, r02Var);
            }
        } else {
            aVar = new a(this, r02Var);
        }
        Object obj = aVar.t;
        int i2 = aVar.v;
        if (i2 == 0) {
            dv8.b(obj);
            el8 el8Var = this.t;
            int i3 = el8Var.t;
            if (i3 < this.u) {
                el8Var.t = i3 + 1;
                return g2b.a;
            }
            aVar.v = 1;
            Object objEmit = this.v.emit(t, aVar);
            v72 v72Var = v72.t;
            if (objEmit == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
