package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", l = {91}, m = "invokeSuspend", v = 1)
public final class r64 extends p6a implements fi4<s54<Object>, Throwable, Long, r02<? super Boolean>, Object> {
    public int t;
    public /* synthetic */ Throwable u;
    public /* synthetic */ long v;
    public final /* synthetic */ ci4<Throwable, r02<? super Boolean>, Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r64(ci4 ci4Var, r02 r02Var) {
        super(4, r02Var);
        this.w = ci4Var;
    }

    @Override // defpackage.fi4
    public final Object invoke(s54<Object> s54Var, Throwable th, Long l, r02<? super Boolean> r02Var) {
        long jLongValue = l.longValue();
        r64 r64Var = new r64(this.w, r02Var);
        r64Var.u = th;
        r64Var.v = jLongValue;
        return r64Var.invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = this.u;
        long j = this.v;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            if (j < Long.MAX_VALUE) {
                this.u = null;
                this.v = j;
                this.t = 1;
                obj = this.w.invoke(th, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        boolean z = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z);
    }
}
