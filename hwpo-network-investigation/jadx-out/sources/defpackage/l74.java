package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l74<T> implements s54 {
    public final /* synthetic */ s54<sa5<? extends T>> t;
    public final /* synthetic */ el8 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", l = {67}, m = "emit", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public final /* synthetic */ l74<T> u;
        public int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l74<? super T> l74Var, r02<? super a> r02Var) {
            super(r02Var);
            this.u = l74Var;
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return this.u.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l74(s54<? super sa5<? extends T>> s54Var, el8 el8Var) {
        this.t = s54Var;
        this.u = el8Var;
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
            el8 el8Var = this.u;
            int i3 = el8Var.t;
            el8Var.t = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            sa5<? extends T> sa5Var = new sa5<>(i3, t);
            aVar.v = 1;
            Object objEmit = this.t.emit(sa5Var, aVar);
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
