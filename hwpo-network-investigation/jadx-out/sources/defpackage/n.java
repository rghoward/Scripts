package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, l76, m] */
    public static final Object a(s66 s66Var, u02 u02Var) throws Throwable {
        l lVar;
        s66 s66Var2;
        gl8 gl8Var;
        Throwable th;
        s66 s66Var3;
        l76 l76Var;
        l76 l76Var2;
        if (u02Var instanceof l) {
            lVar = (l) u02Var;
            int i = lVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.w = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(u02Var);
            }
        } else {
            lVar = new l(u02Var);
        }
        Object obj = lVar.v;
        int i2 = lVar.w;
        if (i2 != 0) {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gl8Var = lVar.u;
            s66Var2 = lVar.t;
            try {
                dv8.b(obj);
                s66Var3 = s66Var2;
                l76Var2 = (l76) gl8Var.t;
                if (l76Var2 != null) {
                    s66Var3.c(l76Var2);
                }
                return g2b.a;
            } catch (Throwable th2) {
                th = th2;
                l76Var = (l76) gl8Var.t;
                if (l76Var != null) {
                    s66Var2.c(l76Var);
                }
                throw th;
            }
        }
        dv8.b(obj);
        if (s66Var.b().compareTo(s66.b.w) >= 0) {
            return g2b.a;
        }
        gl8 gl8Var2 = new gl8();
        try {
            lVar.t = s66Var;
            lVar.u = gl8Var2;
            lVar.w = 1;
            e41 e41Var = new e41(1, th0.e(lVar));
            e41Var.t();
            ?? mVar = new m(e41Var);
            gl8Var2.t = mVar;
            s66Var.a(mVar);
            Object objR = e41Var.r();
            v72 v72Var = v72.t;
            if (objR == v72Var) {
                return v72Var;
            }
            s66Var3 = s66Var;
            gl8Var = gl8Var2;
            l76Var2 = (l76) gl8Var.t;
            if (l76Var2 != null) {
                s66Var3.c(l76Var2);
            }
            return g2b.a;
        } catch (Throwable th3) {
            s66Var2 = s66Var;
            gl8Var = gl8Var2;
            th = th3;
            l76Var = (l76) gl8Var.t;
            if (l76Var != null) {
                s66Var2.c(l76Var);
            }
            throw th;
        }
    }
}
