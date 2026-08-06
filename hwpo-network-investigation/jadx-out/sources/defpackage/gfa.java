package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gfa implements ei4<ci4<? super jt1, ? super Integer, ? extends g2b>, jt1, Integer, g2b> {
    public final /* synthetic */ ci4<jt1, Integer, g2b> A;
    public final /* synthetic */ jl9 B;
    public final /* synthetic */ pda C;
    public final /* synthetic */ String t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ ojb w;
    public final /* synthetic */ h27 x;
    public final /* synthetic */ ci4<jt1, Integer, g2b> y;
    public final /* synthetic */ ci4<jt1, Integer, g2b> z;

    public gfa(String str, boolean z, boolean z2, ojb ojbVar, h27 h27Var, ci4 ci4Var, ci4 ci4Var2, ci4 ci4Var3, jl9 jl9Var, pda pdaVar) {
        this.t = str;
        this.u = z;
        this.v = z2;
        this.w = ojbVar;
        this.x = h27Var;
        this.y = ci4Var;
        this.z = ci4Var2;
        this.A = ci4Var3;
        this.B = jl9Var;
        this.C = pdaVar;
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
            xda.a.b(this.t, ci4Var2, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, null, null, jt1Var2, (iIntValue << 3) & 112, 100663296, 196608);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
