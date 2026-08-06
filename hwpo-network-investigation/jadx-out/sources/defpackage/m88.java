package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m88 implements j88, tx2 {
    public final /* synthetic */ tx2 t;
    public boolean u;
    public boolean v;
    public final a47 w = new a47();

    public m88(tx2 tx2Var) {
        this.t = tx2Var;
    }

    @Override // defpackage.tx2
    public final long A0(float f) {
        return this.t.A0(f);
    }

    @Override // defpackage.tx2
    public final float C1(long j) {
        return this.t.C1(j);
    }

    @Override // defpackage.tx2
    public final float F0(int i) {
        return this.t.F0(i);
    }

    @Override // defpackage.tx2
    public final float I0(float f) {
        return this.t.I0(f);
    }

    @Override // defpackage.tx2
    public final float N0() {
        return this.t.N0();
    }

    @Override // defpackage.tx2
    public final long O(float f) {
        return this.t.O(f);
    }

    @Override // defpackage.tx2
    public final long P(long j) {
        return this.t.P(j);
    }

    @Override // defpackage.tx2
    public final float U0(float f) {
        return this.t.U0(f);
    }

    @Override // defpackage.tx2
    public final float d0(long j) {
        return this.t.d0(j);
    }

    public final void e() {
        this.v = true;
        a47 a47Var = this.w;
        if (a47Var.g()) {
            a47Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.j88
    public final Object e0(u02 u02Var) throws Throwable {
        l88 l88Var;
        if (u02Var instanceof l88) {
            l88Var = (l88) u02Var;
            int i = l88Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                l88Var.v = i - Integer.MIN_VALUE;
            } else {
                l88Var = new l88(this, u02Var);
            }
        } else {
            l88Var = new l88(this, u02Var);
        }
        Object obj = l88Var.t;
        int i2 = l88Var.v;
        a47 a47Var = this.w;
        if (i2 == 0) {
            dv8.b(obj);
            if (!this.u && !this.v) {
                l88Var.v = 1;
                Object objB = a47Var.b(l88Var);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            }
            return Boolean.valueOf(this.u);
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        a47Var.c(null);
        return Boolean.valueOf(this.u);
    }

    public final void f() {
        this.u = true;
        a47 a47Var = this.w;
        if (a47Var.g()) {
            a47Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(u02 u02Var) throws Throwable {
        k88 k88Var;
        if (u02Var instanceof k88) {
            k88Var = (k88) u02Var;
            int i = k88Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                k88Var.v = i - Integer.MIN_VALUE;
            } else {
                k88Var = new k88(this, u02Var);
            }
        } else {
            k88Var = new k88(this, u02Var);
        }
        Object obj = k88Var.t;
        int i2 = k88Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            k88Var.v = 1;
            Object objB = this.w.b(k88Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        this.u = false;
        this.v = false;
        return g2b.a;
    }

    @Override // defpackage.tx2
    public final float getDensity() {
        return this.t.getDensity();
    }

    @Override // defpackage.tx2
    public final int n1(float f) {
        return this.t.n1(f);
    }

    @Override // defpackage.tx2
    public final long w0(int i) {
        return this.t.w0(i);
    }

    @Override // defpackage.tx2
    public final long z1(long j) {
        return this.t.z1(j);
    }
}
