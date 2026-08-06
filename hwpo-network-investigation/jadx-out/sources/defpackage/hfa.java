package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hfa implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ bp5 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ ojb E;
    public final /* synthetic */ h27 F;
    public final /* synthetic */ ci4<jt1, Integer, g2b> G;
    public final /* synthetic */ ci4<jt1, Integer, g2b> H;
    public final /* synthetic */ ci4<jt1, Integer, g2b> I;
    public final /* synthetic */ jl9 J;
    public final /* synthetic */ ox6 t;
    public final /* synthetic */ pda u;
    public final /* synthetic */ String v;
    public final /* synthetic */ oh4<String, g2b> w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ wja y;
    public final /* synthetic */ dp5 z;

    public hfa(ox6 ox6Var, pda pdaVar, String str, oh4 oh4Var, boolean z, wja wjaVar, dp5 dp5Var, bp5 bp5Var, boolean z2, int i, int i2, ojb ojbVar, h27 h27Var, ci4 ci4Var, ci4 ci4Var2, ci4 ci4Var3, jl9 jl9Var) {
        this.t = ox6Var;
        this.u = pdaVar;
        this.v = str;
        this.w = oh4Var;
        this.x = z;
        this.y = wjaVar;
        this.z = dp5Var;
        this.A = bp5Var;
        this.B = z2;
        this.C = i;
        this.D = i2;
        this.E = ojbVar;
        this.F = h27Var;
        this.G = ci4Var;
        this.H = ci4Var2;
        this.I = ci4Var3;
        this.J = jl9Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ws3.b(jt1Var2, R.string.default_error_message);
            ox6 ox6VarA = ir9.a(280.0f, 56.0f, this.t);
            pda pdaVar = this.u;
            aw9 aw9Var = new aw9(pdaVar.i);
            ci4<jt1, Integer, g2b> ci4Var = this.I;
            jl9 jl9Var = this.J;
            String str = this.v;
            boolean z = this.x;
            boolean z2 = this.B;
            ojb ojbVar = this.E;
            h27 h27Var = this.F;
            em0.b(str, this.w, ox6VarA, z, false, this.y, this.z, this.A, z2, this.C, this.D, ojbVar, null, h27Var, aw9Var, gr1.b(1451491557, new gfa(str, z, z2, ojbVar, h27Var, this.G, this.H, ci4Var, jl9Var, pdaVar), jt1Var2), jt1Var2, 0, 196608, 4096);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
