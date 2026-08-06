package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qz7 extends wp5 implements oh4<cz1, g2b> {
    public final /* synthetic */ hl8<cr9> A;
    public final /* synthetic */ yz9<Float> B;
    public final /* synthetic */ yz9<Float> C;
    public final /* synthetic */ h37<Float> D;
    public final /* synthetic */ cs7 u;
    public final /* synthetic */ hl8<dm7> v;
    public final /* synthetic */ jl9 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ kn9 y;
    public final /* synthetic */ hl8<tq5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz7(cs7 cs7Var, hl8 hl8Var, jl9 jl9Var, long j, kn9 kn9Var, hl8 hl8Var2, hl8 hl8Var3, tva.d dVar, tva.d dVar2, h37 h37Var) {
        super(1);
        this.u = cs7Var;
        this.v = hl8Var;
        this.w = jl9Var;
        this.x = j;
        this.y = kn9Var;
        this.z = hl8Var2;
        this.A = hl8Var3;
        this.B = dVar;
        this.C = dVar2;
        this.D = h37Var;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [T, dm7] */
    /* JADX WARN: Type inference failed for: r13v3, types: [T, tq5] */
    /* JADX WARN: Type inference failed for: r13v5, types: [T, dm7] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, cr9] */
    @Override // defpackage.oh4
    public final g2b invoke(cz1 cz1Var) {
        cz1 cz1Var2 = cz1Var;
        cz1Var2.getClass();
        yz9<Float> yz9Var = this.B;
        float fFloatValue = yz9Var.getValue().floatValue();
        cs7 cs7Var = this.u;
        if (0.01f <= fFloatValue && fFloatValue <= 0.99f) {
            cs7Var.b(yz9Var.getValue().floatValue());
            n41 n41VarA = cz1Var2.Y0().a();
            n41VarA.l(tk8.a(0L, cz1Var2.c()), cs7Var);
            cz1Var2.K1();
            n41VarA.o();
        } else if (yz9Var.getValue().floatValue() >= 0.99f) {
            cz1Var2.K1();
        }
        yz9<Float> yz9Var2 = this.C;
        float fFloatValue2 = yz9Var2.getValue().floatValue();
        kn9 kn9Var = this.y;
        jl9 jl9Var = this.w;
        h37<Float> h37Var = this.D;
        hl8<cr9> hl8Var = this.A;
        hl8<tq5> hl8Var2 = this.z;
        hl8<dm7> hl8Var3 = this.v;
        if (0.01f <= fFloatValue2 && fFloatValue2 <= 0.99f) {
            cs7Var.b(yz9Var2.getValue().floatValue());
            n41 n41VarA2 = cz1Var2.Y0().a();
            n41VarA2.l(tk8.a(0L, cz1Var2.c()), cs7Var);
            hl8Var3.a = sz7.a(cz1Var2, jl9Var, this.x, kn9Var, h37Var.getValue().floatValue(), hl8Var3.a, hl8Var2.a, hl8Var.a);
            n41VarA2.o();
        } else if (yz9Var2.getValue().floatValue() >= 0.99f) {
            hl8Var3.a = sz7.a(cz1Var2, jl9Var, this.x, kn9Var, h37Var.getValue().floatValue(), hl8Var3.a, hl8Var2.a, hl8Var.a);
        }
        hl8Var.a = new cr9(cz1Var2.c());
        hl8Var2.a = cz1Var2.getLayoutDirection();
        return g2b.a;
    }
}
