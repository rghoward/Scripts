package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qm7 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ wja A;
    public final /* synthetic */ dp5 B;
    public final /* synthetic */ bp5 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ ojb G;
    public final /* synthetic */ h27 H;
    public final /* synthetic */ ci4<jt1, Integer, g2b> I;
    public final /* synthetic */ ci4<jt1, Integer, g2b> J;
    public final /* synthetic */ jl9 K;
    public final /* synthetic */ ox6 t;
    public final /* synthetic */ ci4<jt1, Integer, g2b> u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ pda w;
    public final /* synthetic */ kha x;
    public final /* synthetic */ oh4<kha, g2b> y;
    public final /* synthetic */ boolean z;

    public qm7(ox6 ox6Var, ci4 ci4Var, boolean z, pda pdaVar, kha khaVar, oh4 oh4Var, boolean z2, wja wjaVar, dp5 dp5Var, bp5 bp5Var, boolean z3, int i, int i2, ojb ojbVar, h27 h27Var, ci4 ci4Var2, ci4 ci4Var3, jl9 jl9Var) {
        this.t = ox6Var;
        this.u = ci4Var;
        this.v = z;
        this.w = pdaVar;
        this.x = khaVar;
        this.y = oh4Var;
        this.z = z2;
        this.A = wjaVar;
        this.B = dp5Var;
        this.C = bp5Var;
        this.D = z3;
        this.E = i;
        this.F = i2;
        this.G = ojbVar;
        this.H = h27Var;
        this.I = ci4Var2;
        this.J = ci4Var3;
        this.K = jl9Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ci4<jt1, Integer, g2b> ci4Var = this.u;
            ox6 ox6VarM = ox6.a.t;
            if (ci4Var != null) {
                jt1Var2.K(-1901539802);
                Object objF = jt1Var2.f();
                if (objF == jt1.a.a) {
                    objF = new m7(1);
                    jt1Var2.C(objF);
                }
                ox6VarM = eo7.m(pb9.b(ox6VarM, true, (oh4) objF), 0.0f, yea.f(jt1Var2), 0.0f, 0.0f, 13);
                jt1Var2.B();
            } else {
                jt1Var2.K(-1901156115);
                jt1Var2.B();
            }
            ox6 ox6VarH = this.t.H(ox6VarM);
            final String strB = ws3.b(jt1Var2, R.string.default_error_message);
            boolean z = this.v;
            if (z) {
                ox6VarH = pb9.b(ox6VarH, false, new oh4() { // from class: hea
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        ho5<Object>[] ho5VarArr = ec9.a;
                        ((hc9) obj).d(ac9.M, strB);
                        return g2b.a;
                    }
                });
            }
            ox6 ox6VarA = ir9.a(280.0f, 56.0f, ox6VarH);
            pda pdaVar = this.w;
            aw9 aw9Var = new aw9(z ? pdaVar.j : pdaVar.i);
            ci4<jt1, Integer, g2b> ci4Var2 = this.J;
            jl9 jl9Var = this.K;
            kha khaVar = this.x;
            boolean z2 = this.z;
            boolean z3 = this.D;
            ojb ojbVar = this.G;
            h27 h27Var = this.H;
            em0.a(khaVar, this.y, ox6VarA, z2, this.A, this.B, this.C, z3, this.E, this.F, ojbVar, null, h27Var, aw9Var, gr1.b(674541106, new pm7(khaVar, z2, z3, ojbVar, h27Var, this.v, this.u, this.I, ci4Var2, pdaVar, jl9Var), jt1Var2), jt1Var2, 0, 4096);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
