package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xt9 implements n9a {
    public final cu9 a;
    public final an2<Float> b;
    public final wv<Float> c;
    public final d79.a d = d79.c;

    public xt9(cu9 cu9Var, an2 an2Var, a04 a04Var) {
        this.a = cu9Var;
        this.b = an2Var;
        this.c = a04Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object c(xt9 xt9Var, t69 t69Var, float f, float f2, st9 st9Var, u02 u02Var) throws Throwable {
        wt9 wt9Var;
        if (u02Var instanceof wt9) {
            wt9Var = (wt9) u02Var;
            int i = wt9Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                wt9Var.v = i - Integer.MIN_VALUE;
            } else {
                wt9Var = new wt9(xt9Var, u02Var);
            }
        } else {
            wt9Var = new wt9(xt9Var, u02Var);
        }
        wt9 wt9Var2 = wt9Var;
        Object objA = wt9Var2.t;
        int i2 = wt9Var2.v;
        if (i2 == 0) {
            dv8.b(objA);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return zv.b(f, f2, 28);
            }
            wt9Var2.v = 1;
            an2<Float> an2Var = xt9Var.b;
            objA = (Math.abs(((bw) an2Var.a().b(new bw(0.0f), new bw(f2))).a) >= Math.abs(f) ? new cn2(an2Var) : new r76(xt9Var.c)).a(t69Var, new Float(f), new Float(f2), st9Var, wt9Var2);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objA);
        }
        return ((tv) objA).b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.n9a
    public final Object b(t69 t69Var, float f, oh4 oh4Var, u02 u02Var) throws Throwable {
        vt9 vt9Var;
        if (u02Var instanceof vt9) {
            vt9Var = (vt9) u02Var;
            int i = vt9Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                vt9Var.v = i - Integer.MIN_VALUE;
            } else {
                vt9Var = new vt9(this, u02Var);
            }
        } else {
            vt9Var = new vt9(this, u02Var);
        }
        Object objD = vt9Var.t;
        int i2 = vt9Var.v;
        if (i2 == 0) {
            dv8.b(objD);
            vt9Var.v = 1;
            objD = d(t69Var, f, oh4Var, vt9Var);
            Object obj = v72.t;
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objD);
        }
        tv tvVar = (tv) objD;
        return new Float(tvVar.a.floatValue() != 0.0f ? ((Number) tvVar.b.d()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(t69 t69Var, float f, oh4 oh4Var, u02 u02Var) throws Throwable {
        rt9 rt9Var;
        oh4 oh4Var2;
        if (u02Var instanceof rt9) {
            rt9Var = (rt9) u02Var;
            int i = rt9Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                rt9Var.w = i - Integer.MIN_VALUE;
            } else {
                rt9Var = new rt9(this, u02Var);
            }
        } else {
            rt9Var = new rt9(this, u02Var);
        }
        Object objG = rt9Var.u;
        int i2 = rt9Var.w;
        if (i2 == 0) {
            dv8.b(objG);
            ut9 ut9Var = new ut9(this, f, oh4Var, t69Var, null);
            rt9Var.t = oh4Var;
            rt9Var.w = 1;
            objG = oy0.g(this.d, ut9Var, rt9Var);
            v72 v72Var = v72.t;
            if (objG == v72Var) {
                return v72Var;
            }
            oh4Var2 = oh4Var;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oh4Var2 = rt9Var.t;
            dv8.b(objG);
        }
        tv tvVar = (tv) objG;
        oh4Var2.invoke(new Float(0.0f));
        return tvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xt9)) {
            return false;
        }
        xt9 xt9Var = (xt9) obj;
        return xj5.a(xt9Var.c, this.c) && xj5.a(xt9Var.b, this.b) && xt9Var.a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
