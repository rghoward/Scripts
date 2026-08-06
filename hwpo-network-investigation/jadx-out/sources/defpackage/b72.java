package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b72 implements jl9 {
    public final e72 a;
    public final e72 b;
    public final e72 c;
    public final e72 d;

    public b72(e72 e72Var, e72 e72Var2, e72 e72Var3, e72 e72Var4) {
        this.a = e72Var;
        this.b = e72Var2;
        this.c = e72Var3;
        this.d = e72Var4;
    }

    public static /* synthetic */ b72 b(b72 b72Var, e72 e72Var, e72 e72Var2, e72 e72Var3, e72 e72Var4, int i) {
        if ((i & 1) != 0) {
            e72Var = b72Var.a;
        }
        if ((i & 2) != 0) {
            e72Var2 = b72Var.b;
        }
        if ((i & 4) != 0) {
            e72Var3 = b72Var.c;
        }
        if ((i & 8) != 0) {
            e72Var4 = b72Var.d;
        }
        return b72Var.a(e72Var, e72Var2, e72Var3, e72Var4);
    }

    public abstract zx8 a(e72 e72Var, e72 e72Var2, e72 e72Var3, e72 e72Var4);

    public abstract dm7 c(long j, float f, float f2, float f3, float f4, tq5 tq5Var);

    @Override // defpackage.jl9
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final dm7 mo0createOutlinePq9zytI(long j, tq5 tq5Var, tx2 tx2Var) {
        float fA = this.a.a(j, tx2Var);
        float fA2 = this.b.a(j, tx2Var);
        float fA3 = this.c.a(j, tx2Var);
        float fA4 = this.d.a(j, tx2Var);
        float fC = cr9.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f2 = fC / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fC) {
            float f4 = fC / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            xc5.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return c(j, fA, fA2, fA3, fA4, tq5Var);
    }
}
