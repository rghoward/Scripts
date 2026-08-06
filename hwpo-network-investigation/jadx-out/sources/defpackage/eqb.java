package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class eqb extends q2 {
    public final tpb a;
    public final xk4 b;
    public final f49 c;
    public final ue7 d;
    public final fp1 e;
    public final rl4 f;
    public final i7a g;
    public final cm3 h;
    public final bu8 i;
    public hy8 j;

    public eqb(tpb tpbVar, xk4 xk4Var, f49 f49Var, ue7 ue7Var, fp1 fp1Var, rl4 rl4Var, i7a i7aVar, cm3 cm3Var, bu8 bu8Var) {
        tpbVar.getClass();
        i7aVar.getClass();
        cm3Var.getClass();
        bu8Var.getClass();
        this.a = tpbVar;
        this.b = xk4Var;
        this.c = f49Var;
        this.d = ue7Var;
        this.e = fp1Var;
        this.f = rl4Var;
        this.g = i7aVar;
        this.h = cm3Var;
        this.i = bu8Var;
    }

    @Override // defpackage.q2
    public final <T extends mhb> T b(String str, Class<T> cls, q09 q09Var) {
        hy8 hy8Var = this.j;
        if (hy8Var != null) {
            return new wpb(this.a.a(hy8Var), q09Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
        z90.a("Required value was null.");
        return null;
    }
}
