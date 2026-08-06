package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cm8 {
    public final int a;
    public final us1 b;
    public float c;

    public cm8(int i, us1 us1Var) {
        this.a = i;
        this.b = us1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(float f, u02 u02Var) throws Throwable {
        bm8 bm8Var;
        if (u02Var instanceof bm8) {
            bm8Var = (bm8) u02Var;
            int i = bm8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                bm8Var.v = i - Integer.MIN_VALUE;
            } else {
                bm8Var = new bm8(this, u02Var);
            }
        } else {
            bm8Var = new bm8(this, u02Var);
        }
        Object objInvoke = bm8Var.t;
        int i2 = bm8Var.v;
        if (i2 == 0) {
            dv8.b(objInvoke);
            Float f2 = new Float(f);
            bm8Var.v = 1;
            objInvoke = this.b.invoke(f2, bm8Var);
            v72 v72Var = v72.t;
            if (objInvoke == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objInvoke);
        }
        this.c += ((Number) objInvoke).floatValue();
        return g2b.a;
    }
}
