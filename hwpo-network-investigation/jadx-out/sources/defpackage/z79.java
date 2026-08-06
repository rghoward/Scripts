package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z79 {
    public s79 a;
    public in7 b;
    public g44 c;
    public fl7 d;
    public boolean e;
    public c97 f;
    public final n79 g;
    public final uf6 h;
    public boolean i;
    public int j = 1;
    public t69 k = d79.b;
    public final w79 l = new w79(this);
    public final m5 m = new m5(2, this);

    public z79(s79 s79Var, in7 in7Var, g44 g44Var, fl7 fl7Var, boolean z, c97 c97Var, n79 n79Var, uf6 uf6Var) {
        this.a = s79Var;
        this.b = in7Var;
        this.c = g44Var;
        this.d = fl7Var;
        this.e = z;
        this.f = c97Var;
        this.g = n79Var;
        this.h = uf6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, u02 u02Var) throws Throwable {
        u79 u79Var;
        z79 z79Var;
        Throwable th;
        fl8 fl8Var;
        if (u02Var instanceof u79) {
            u79Var = (u79) u02Var;
            int i = u79Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                u79Var.w = i - Integer.MIN_VALUE;
            } else {
                u79Var = new u79(this, u02Var);
            }
        } else {
            u79Var = new u79(this, u02Var);
        }
        Object obj = u79Var.u;
        int i2 = u79Var.w;
        if (i2 != 0) {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fl8Var = u79Var.t;
            try {
                dv8.b(obj);
                z79Var = this;
                z79Var.i = false;
                return new rdb(fl8Var.t);
            } catch (Throwable th2) {
                th = th2;
                z79Var = this;
                z79Var.i = false;
                throw th;
            }
        }
        dv8.b(obj);
        fl8 fl8Var2 = new fl8();
        fl8Var2.t = j;
        this.i = true;
        try {
            o37 o37Var = o37.t;
            z79Var = this;
            try {
                v79 v79Var = new v79(z79Var, fl8Var2, j, null);
                u79Var.t = fl8Var2;
                u79Var.w = 1;
                Object objF = z79Var.f(o37Var, v79Var, u79Var);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
                    return v72Var;
                }
                fl8Var = fl8Var2;
                z79Var.i = false;
                return new rdb(fl8Var.t);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                z79Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            z79Var = this;
        }
    }

    public final Object b(long j, boolean z, p6a p6aVar) {
        if (z) {
            g44 g44Var = this.c;
            v4 v4Var = d79.a;
            if (g44Var instanceof fr2) {
                return g2b.a;
            }
        }
        long jA = rdb.a(0.0f, 0.0f, this.d == fl7.u ? 1 : 2, j);
        x79 x79Var = new x79(this, null);
        in7 in7Var = this.b;
        v72 v72Var = v72.t;
        if (in7Var != null && (this.a.d() || this.a.b())) {
            Object objA = in7Var.a(jA, x79Var, p6aVar);
            return objA == v72Var ? objA : g2b.a;
        }
        x79 x79Var2 = new x79(this, p6aVar);
        x79Var2.v = jA;
        g2b g2bVar = g2b.a;
        Object objInvokeSuspend = x79Var2.invokeSuspend(g2bVar);
        return objInvokeSuspend == v72Var ? objInvokeSuspend : g2bVar;
    }

    public final long c(t69 t69Var, long j, int i) {
        h97 h97Var = this.f.a;
        h97 h97VarD2 = h97Var != null ? h97Var.d2() : null;
        long jB0 = h97VarD2 != null ? h97VarD2.B0(i, j) : 0L;
        long jD = vf7.d(j, jB0);
        long jE = e(h(t69Var.f(g(e(vf7.a(jD, 0.0f, this.d == fl7.u ? 1 : 2))))));
        n79 n79Var = this.g;
        if (n79Var.G) {
            ew2.g(n79Var).J();
        }
        long jD2 = vf7.d(jD, jE);
        h97 h97Var2 = this.f.a;
        h97 h97VarD3 = h97Var2 != null ? h97Var2.d2() : null;
        return vf7.e(vf7.e(jB0, jE), h97VarD3 != null ? h97VarD3.f0(jE, i, jD2) : 0L);
    }

    public final float d(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long e(long j) {
        return this.e ? vf7.f(-1.0f, j) : j;
    }

    public final Object f(o37 o37Var, ci4 ci4Var, u02 u02Var) {
        Object objC = this.a.c(o37Var, new y79(this, ci4Var, null), u02Var);
        return objC == v72.t ? objC : g2b.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == fl7.u ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == fl7.u) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        fl7 fl7Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (fl7Var == fl7.t) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (fl7Var == fl7.u) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
