package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l61 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(mn7 mn7Var, ci4 ci4Var, u02 u02Var) {
        g61 g61Var;
        if (u02Var instanceof g61) {
            g61Var = (g61) u02Var;
            int i = g61Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                g61Var.v = i - Integer.MIN_VALUE;
            } else {
                g61Var = new g61(this, u02Var);
            }
        } else {
            g61Var = new g61(this, u02Var);
        }
        Object obj = g61Var.t;
        int i2 = g61Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            k61 k61Var = new k61(ci4Var, this, null);
            g61Var.v = 1;
            v18.b(mn7Var, null, k61Var, g61Var);
            return;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
        } else {
            dv8.b(obj);
            fl.a();
        }
    }
}
