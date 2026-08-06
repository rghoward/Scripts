package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c74 implements s54<Object> {
    public final /* synthetic */ ci4 t;
    public final /* synthetic */ gl8 u;

    @xm2(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public int u;
        public Object w;

        public a(r02 r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.u |= Integer.MIN_VALUE;
            return c74.this.emit(null, this);
        }
    }

    public c74(ci4 ci4Var, gl8 gl8Var) {
        this.t = ci4Var;
        this.u = gl8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s54
    public final Object emit(Object obj, r02<? super g2b> r02Var) throws Throwable {
        a aVar;
        T t;
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
        Object objInvoke = aVar.t;
        int i2 = aVar.u;
        if (i2 == 0) {
            dv8.b(objInvoke);
            aVar.w = obj;
            aVar.u = 1;
            objInvoke = this.t.invoke(obj, aVar);
            v72 v72Var = v72.t;
            if (objInvoke == v72Var) {
                t = obj;
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = aVar.w;
            dv8.b(objInvoke);
            t = obj2;
        }
        t = obj;
        if (!((Boolean) objInvoke).booleanValue()) {
            return g2b.a;
        }
        this.u.t = t;
        throw new b0(this);
    }
}
