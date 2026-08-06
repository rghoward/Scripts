package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class x64 implements r54<Object> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ ci4 u;

    @xm2(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {123}, m = "collect", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public int u;
        public y64 w;

        public a(r02 r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.u |= Integer.MIN_VALUE;
            return x64.this.collect(null, this);
        }
    }

    public x64(r54 r54Var, ci4 ci4Var) {
        this.t = r54Var;
        this.u = ci4Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.r54
    public final Object collect(s54<? super Object> s54Var, r02<? super g2b> r02Var) throws Throwable {
        a aVar;
        y64 y64Var;
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
        Object obj = aVar.t;
        int i2 = aVar.u;
        if (i2 == 0) {
            dv8.b(obj);
            r54 r54Var = this.t;
            y64 y64Var2 = new y64(s54Var, this.u);
            try {
                aVar.w = y64Var2;
                aVar.u = 1;
                Object objCollect = r54Var.collect(y64Var2, aVar);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
                    return v72Var;
                }
            } catch (b0 e) {
                e = e;
                y64Var = y64Var2;
                if (e.t == y64Var) {
                    throw e;
                }
                sd.d(aVar.getContext());
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y64Var = aVar.w;
            try {
                dv8.b(obj);
            } catch (b0 e2) {
                e = e2;
                if (e.t == y64Var) {
                    throw e;
                }
                sd.d(aVar.getContext());
            }
        }
        return g2b.a;
    }
}
