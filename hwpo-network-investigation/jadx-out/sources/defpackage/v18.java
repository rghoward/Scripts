package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v18 {
    public static final y0a a = new y0a(a.u);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<l61> {
        public static final a u = new a(0);

        @Override // defpackage.mh4
        public final /* bridge */ /* synthetic */ l61 invoke() {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(u18 u18Var, yo yoVar, u02 u02Var) throws Throwable {
        w18 w18Var;
        if (u02Var instanceof w18) {
            w18Var = (w18) u02Var;
            int i = w18Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                w18Var.u = i - Integer.MIN_VALUE;
            } else {
                w18Var = new w18(u02Var);
            }
        } else {
            w18Var = new w18(u02Var);
        }
        Object obj = w18Var.t;
        int i2 = w18Var.u;
        if (i2 != 0) {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                dv8.b(obj);
                fl.a();
                return;
            }
        }
        dv8.b(obj);
        if (!u18Var.q().G) {
            z90.a("establishTextInputSession called from an unattached node");
            return;
        }
        mn7 mn7VarG = ew2.g(u18Var);
        l61 l61Var = (l61) ew2.f(u18Var).U.a(a);
        w18Var.u = 1;
        b(mn7VarG, l61Var, yoVar, w18Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(mn7 mn7Var, l61 l61Var, ci4 ci4Var, u02 u02Var) throws Throwable {
        x18 x18Var;
        if (u02Var instanceof x18) {
            x18Var = (x18) u02Var;
            int i = x18Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                x18Var.u = i - Integer.MIN_VALUE;
            } else {
                x18Var = new x18(u02Var);
            }
        } else {
            x18Var = new x18(u02Var);
        }
        Object obj = x18Var.t;
        int i2 = x18Var.u;
        if (i2 == 0) {
            dv8.b(obj);
            if (l61Var == null) {
                x18Var.u = 1;
                mn7Var.q(ci4Var, x18Var);
                return;
            } else {
                x18Var.u = 2;
                l61Var.a(mn7Var, ci4Var, x18Var);
                return;
            }
        }
        if (i2 == 1) {
            dv8.b(obj);
            fl.a();
        } else if (i2 != 2) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
        } else {
            dv8.b(obj);
            fl.a();
        }
    }
}
