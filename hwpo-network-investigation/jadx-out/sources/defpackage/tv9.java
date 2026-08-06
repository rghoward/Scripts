package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tv9 extends rkb implements t72 {
    public static final a Companion = new a();
    public final ji8 A;
    public final a0a B;
    public final ji8 C;
    public final lg7 u;
    public qj8 w;
    public dz9 x;
    public jp8 y;
    public final am9 z;
    public final /* synthetic */ o02 t = u72.b();
    public int v = 1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.socket_client.client.SocketClient$onMessage$1", f = "SocketClient.kt", l = {92}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ String v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = str;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return tv9.this.new b(this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                am9 am9Var = tv9.this.z;
                this.t = 1;
                Object objEmit = am9Var.emit(this.v, this);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
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

    public tv9(lg7 lg7Var) {
        this.u = lg7Var;
        am9 am9VarB = ty1.b(7, null);
        this.z = am9VarB;
        this.A = yk2.a(am9VarB);
        a0a a0aVarB = b0a.b(dx1.t);
        this.B = a0aVarB;
        this.C = yk2.a(a0aVarB);
    }

    public final void a() {
        dz9 dz9Var = this.x;
        if (dz9Var != null) {
            dz9Var.k(null);
        }
    }

    public final void b(jp8 jp8Var) {
        this.y = jp8Var;
        a0a a0aVar = this.B;
        if (a0aVar.getValue() != dx1.v) {
            Object value = a0aVar.getValue();
            dx1 dx1Var = dx1.u;
            if (value == dx1Var) {
                return;
            }
            a0aVar.getClass();
            a0aVar.l(null, dx1Var);
            jp8 jp8Var2 = this.y;
            if (jp8Var2 != null) {
                this.w = this.u.c(jp8Var2, this);
            } else {
                xj5.e("request");
                throw null;
            }
        }
    }

    public final void c() {
        if (this.w == null || this.B.getValue() == dx1.t) {
            return;
        }
        qj8 qj8Var = this.w;
        if (qj8Var == null) {
            xj5.e("socket");
            throw null;
        }
        co9.a.getClass();
        qj8Var.close(1000, "Connection was closed by client");
    }

    @Override // defpackage.t72
    public final h72 getCoroutineContext() {
        return this.t.t;
    }

    @Override // defpackage.rkb
    public final void onClosed(pkb pkbVar, int i, String str) {
        pkbVar.getClass();
        str.getClass();
        super.onClosed(pkbVar, i, str);
        a();
        a0a a0aVar = this.B;
        a0aVar.getClass();
        a0aVar.l(null, dx1.t);
    }

    @Override // defpackage.rkb
    public final void onFailure(pkb pkbVar, Throwable th, qu8 qu8Var) {
        pkbVar.getClass();
        th.getClass();
        super.onFailure(pkbVar, th, qu8Var);
        a0a a0aVar = this.B;
        a0aVar.getClass();
        dx1 dx1Var = dx1.w;
        a0aVar.l(null, dx1Var);
        a();
        if (a0aVar.getValue() != dx1Var) {
            dz9 dz9Var = this.x;
            if (dz9Var != null) {
                return;
            }
            if (dz9Var == null) {
                xj5.e("reconnectJob");
                throw null;
            }
            if (dz9Var.h()) {
                return;
            }
        }
        if (this.v > 5) {
            return;
        }
        this.x = oy0.d(this, null, null, new uv9(this, null), 3);
    }

    @Override // defpackage.rkb
    public final void onMessage(pkb pkbVar, String str) {
        pkbVar.getClass();
        str.getClass();
        super.onMessage(pkbVar, str);
        if (!z2a.o(str, "\"type\":\"ping\"", false)) {
            rma.a.a(cj2.a(z2a.N(toString(), "@"), " socket received : ", str), new Object[0]);
        }
        oy0.d(this, null, null, new b(str, null), 3);
    }

    @Override // defpackage.rkb
    public final void onOpen(pkb pkbVar, qu8 qu8Var) {
        pkbVar.getClass();
        qu8Var.getClass();
        super.onOpen(pkbVar, qu8Var);
        a();
        a0a a0aVar = this.B;
        a0aVar.getClass();
        a0aVar.l(null, dx1.v);
    }
}
