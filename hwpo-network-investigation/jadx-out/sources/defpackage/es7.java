package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class es7 {
    public np t;
    public boolean u;
    public wh1 v;
    public float w = 1.0f;
    public tq5 x = tq5.t;

    public boolean a(float f) {
        return false;
    }

    public boolean e(wh1 wh1Var) {
        return false;
    }

    public final void g(d73 d73Var, long j, float f, wh1 wh1Var) {
        if (this.w != f) {
            if (!a(f)) {
                np npVar = this.t;
                if (f == 1.0f) {
                    if (npVar != null) {
                        npVar.b(f);
                    }
                    this.u = false;
                } else {
                    if (npVar == null) {
                        npVar = new np();
                        this.t = npVar;
                    }
                    npVar.b(f);
                    this.u = true;
                }
            }
            this.w = f;
        }
        if (!xj5.a(this.v, wh1Var)) {
            if (!e(wh1Var)) {
                np npVar2 = this.t;
                if (wh1Var == null) {
                    if (npVar2 != null) {
                        npVar2.j(null);
                    }
                    this.u = false;
                } else {
                    if (npVar2 == null) {
                        npVar2 = new np();
                        this.t = npVar2;
                    }
                    npVar2.j(wh1Var);
                    this.u = true;
                }
            }
            this.v = wh1Var;
        }
        tq5 layoutDirection = d73Var.getLayoutDirection();
        if (this.x != layoutDirection) {
            f(layoutDirection);
            this.x = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (d73Var.c() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)) - Float.intBitsToFloat(i2);
        d73Var.Y0().a.c(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.u) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        sk8 sk8VarA = tk8.a(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        n41 n41VarA = d73Var.Y0().a();
                        np npVar3 = this.t;
                        if (npVar3 == null) {
                            npVar3 = new np();
                            this.t = npVar3;
                        }
                        try {
                            n41VarA.l(sk8VarA, npVar3);
                            i(d73Var);
                            n41VarA.o();
                        } catch (Throwable th) {
                            n41VarA.o();
                            throw th;
                        }
                    } else {
                        i(d73Var);
                    }
                }
            } catch (Throwable th2) {
                d73Var.Y0().a.c(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        d73Var.Y0().a.c(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(d73 d73Var);

    public void f(tq5 tq5Var) {
    }
}
