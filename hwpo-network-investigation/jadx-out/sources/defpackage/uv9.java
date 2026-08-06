package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.socket_client.client.SocketClient$reconnect$1", f = "SocketClient.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class uv9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ tv9 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv9(tv9 tv9Var, r02<? super uv9> r02Var) {
        super(2, r02Var);
        this.u = tv9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new uv9(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((uv9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        tv9 tv9Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            double dLog = Math.log(tv9Var.v) * 5.0d;
            l93.a aVar = l93.u;
            q93 q93Var = q93.NANOSECONDS;
            double dB = un2.b(dLog, q93Var);
            if (Double.isNaN(dB)) {
                z90.a("Duration value cannot be NaN.");
                return null;
            }
            long jC = wk6.c(dB);
            q93 q93Var2 = q93.MILLISECONDS;
            long jC2 = (-4611686018426999999L > jC || jC >= 4611686018427000000L) ? o93.c(wk6.c(un2.b(dLog, q93Var2))) : o93.d(jC);
            this.t = 1;
            long j = 0;
            boolean z = jC2 > 0;
            if (z) {
                long jI = l93.i(jC2, o93.g(999999L, q93Var));
                j = ((((int) jI) & 1) != 1 || l93.h(jI)) ? l93.j(jI, q93Var2) : jI >> 1;
            } else if (z) {
                u.b();
                return null;
            }
            Object objB = bw2.b(j, this);
            Object obj2 = v72.t;
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
        jp8 jp8Var = tv9Var.y;
        if (jp8Var == null) {
            xj5.e("request");
            throw null;
        }
        tv9Var.b(jp8Var);
        tv9Var.v++;
        return g2b.a;
    }
}
