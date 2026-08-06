package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qa8 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ua8 ua8Var, mh4 mh4Var, u02 u02Var) {
        oa8 oa8Var;
        if (u02Var instanceof oa8) {
            oa8Var = (oa8) u02Var;
            int i = oa8Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                oa8Var.w = i - Integer.MIN_VALUE;
            } else {
                oa8Var = new oa8(u02Var);
            }
        } else {
            oa8Var = new oa8(u02Var);
        }
        Object obj = oa8Var.v;
        int i2 = oa8Var.w;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                if (oa8Var.getContext().d0(el5.a.t) != ua8Var) {
                    aa0.c("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                oa8Var.t = ua8Var;
                oa8Var.u = mh4Var;
                oa8Var.w = 1;
                e41 e41Var = new e41(1, th0.e(oa8Var));
                e41Var.t();
                ua8Var.f(new pa8(e41Var));
                Object objR = e41Var.r();
                v72 v72Var = v72.t;
                if (objR == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mh4Var = oa8Var.u;
                dv8.b(obj);
            }
            mh4Var.invoke();
            return g2b.a;
        } catch (Throwable th) {
            mh4Var.invoke();
            throw th;
        }
    }

    public static ta8 b(t72 t72Var, int i, ci4 ci4Var, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        ta8 ta8Var = new ta8(l72.b(t72Var, ff3.t), da1.a(i, 4, xx0.t));
        ta8Var.D0(x72.t, ta8Var, ci4Var);
        return ta8Var;
    }
}
