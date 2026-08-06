package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pm7 implements ei4<ci4<? super jt1, ? super Integer, ? extends g2b>, jt1, Integer, g2b> {
    public final /* synthetic */ ci4<jt1, Integer, g2b> A;
    public final /* synthetic */ ci4<jt1, Integer, g2b> B;
    public final /* synthetic */ pda C;
    public final /* synthetic */ jl9 D;
    public final /* synthetic */ kha t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ ojb w;
    public final /* synthetic */ h27 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ci4<jt1, Integer, g2b> z;

    public pm7(kha khaVar, boolean z, boolean z2, ojb ojbVar, h27 h27Var, boolean z3, ci4 ci4Var, ci4 ci4Var2, ci4 ci4Var3, pda pdaVar, jl9 jl9Var) {
        this.t = khaVar;
        this.u = z;
        this.v = z2;
        this.w = ojbVar;
        this.x = h27Var;
        this.y = z3;
        this.z = ci4Var;
        this.A = ci4Var2;
        this.B = ci4Var3;
        this.C = pdaVar;
        this.D = jl9Var;
    }

    @Override // defpackage.ei4
    public final g2b invoke(ci4<? super jt1, ? super Integer, ? extends g2b> ci4Var, jt1 jt1Var, Integer num) {
        ci4<? super jt1, ? super Integer, ? extends g2b> ci4Var2 = ci4Var;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= jt1Var2.j(ci4Var2) ? 4 : 2;
        }
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 19) != 18)) {
            String str = this.t.a.u;
            jl9 jl9Var = this.D;
            boolean z = this.u;
            boolean z2 = this.y;
            h27 h27Var = this.x;
            pda pdaVar = this.C;
            jm7.a.b(str, ci4Var2, z, this.v, this.w, h27Var, z2, this.z, this.A, null, null, this.B, pdaVar, null, gr1.b(1409265477, new om7(z, z2, h27Var, pdaVar, jl9Var), jt1Var2), jt1Var2, (iIntValue << 3) & 112, 32768);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
