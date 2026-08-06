package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h54 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final qt<y43, bw> e;
    public qg5 f;
    public qg5 g;

    public h54(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new qt<>(new y43(f), b0a.x, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [g2b, java.lang.Object] */
    public final Object a(qg5 qg5Var, u02 u02Var) throws Throwable {
        f54 f54Var;
        float f;
        qt<y43, bw> qtVar = this.e;
        if (u02Var instanceof f54) {
            f54Var = (f54) u02Var;
            int i = f54Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                f54Var.w = i - Integer.MIN_VALUE;
            } else {
                f54Var = new f54(this, u02Var);
            }
        } else {
            f54Var = new f54(this, u02Var);
        }
        Object obj = f54Var.u;
        int i2 = f54Var.w;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                if (qg5Var instanceof n88.b) {
                    f = this.b;
                } else if (qg5Var instanceof l35) {
                    f = this.c;
                } else {
                    f = qg5Var instanceof v84 ? this.d : this.a;
                }
                this.g = qg5Var;
                if (!y43.e(((y43) qtVar.e.getValue()).t, f)) {
                    qg5 qg5Var2 = this.f;
                    f54Var.t = qg5Var;
                    f54Var.w = 1;
                    Object objA = de3.a(qtVar, f, qg5Var2, qg5Var, f54Var);
                    v72 v72Var = v72.t;
                    if (objA == v72Var) {
                        return v72Var;
                    }
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qg5Var = f54Var.t;
                dv8.b(obj);
            }
            this.f = qg5Var;
            this = g2b.a;
            return this;
        } catch (Throwable th) {
            this.f = qg5Var;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(u02 u02Var) throws Throwable {
        g54 g54Var;
        float f;
        if (u02Var instanceof g54) {
            g54Var = (g54) u02Var;
            int i = g54Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                g54Var.v = i - Integer.MIN_VALUE;
            } else {
                g54Var = new g54(this, u02Var);
            }
        } else {
            g54Var = new g54(this, u02Var);
        }
        Object obj = g54Var.t;
        int i2 = g54Var.v;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                qg5 qg5Var = this.g;
                if (qg5Var instanceof n88.b) {
                    f = this.b;
                } else if (qg5Var instanceof l35) {
                    f = this.c;
                } else {
                    f = qg5Var instanceof v84 ? this.d : this.a;
                }
                qt<y43, bw> qtVar = this.e;
                if (!y43.e(((y43) qtVar.e.getValue()).t, f)) {
                    y43 y43Var = new y43(f);
                    g54Var.v = 1;
                    Object objE = qtVar.e(g54Var, y43Var);
                    v72 v72Var = v72.t;
                    if (objE == v72Var) {
                        return v72Var;
                    }
                }
                return g2b.a;
            }
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            this.f = this.g;
            return g2b.a;
        } catch (Throwable th) {
            this.f = this.g;
            throw th;
        }
    }
}
