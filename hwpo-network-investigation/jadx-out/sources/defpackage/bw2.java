package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class bw2 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(u02 u02Var) throws Throwable {
        aw2 aw2Var;
        if (u02Var instanceof aw2) {
            aw2Var = (aw2) u02Var;
            int i = aw2Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                aw2Var.u = i - Integer.MIN_VALUE;
            } else {
                aw2Var = new aw2(u02Var);
            }
        } else {
            aw2Var = new aw2(u02Var);
        }
        Object obj = aw2Var.t;
        int i2 = aw2Var.u;
        if (i2 == 0) {
            dv8.b(obj);
            aw2Var.u = 1;
            e41 e41Var = new e41(1, th0.e(aw2Var));
            e41Var.t();
            if (e41Var.r() == v72.t) {
                return;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            dv8.b(obj);
        }
        fl.a();
    }

    public static final Object b(long j, r02<? super g2b> r02Var) {
        if (j <= 0) {
            return g2b.a;
        }
        e41 e41Var = new e41(1, th0.e(r02Var));
        e41Var.t();
        if (j < Long.MAX_VALUE) {
            c(e41Var.x).Y(j, e41Var);
        }
        Object objR = e41Var.r();
        return objR == v72.t ? objR : g2b.a;
    }

    public static final zv2 c(h72 h72Var) {
        h72.a aVarD0 = h72Var.d0(v02.a.t);
        zv2 zv2Var = aVarD0 instanceof zv2 ? (zv2) aVarD0 : null;
        return zv2Var == null ? yq2.a : zv2Var;
    }
}
